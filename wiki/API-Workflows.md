# API Workflows

This document provides visual workflow diagrams for the main operations in the ProducerFlow API, helping developers understand the sequence of API calls and data flow for common integration scenarios.

## Table of Contents

- [API Workflows](#api-workflows)
  - [Table of Contents](#table-of-contents)
  - [1. Agency Creation Workflow](#1-agency-creation-workflow)
    - [Option A: Via Onboarding URL](#option-a-via-onboarding-url)
    - [Option B: Direct API Creation](#option-b-direct-api-creation)
  - [2. Adding Producers to Agency](#2-adding-producers-to-agency)
    - [Single Producer Addition](#single-producer-addition)
    - [Bulk Producer Addition](#bulk-producer-addition)
    - [Producer Upload URL](#producer-upload-url)
  - [3. Editing Producer Information](#3-editing-producer-information)
  - [4. Agency Location Management](#4-agency-location-management)
    - [Creating Agency Locations](#creating-agency-locations)
    - [Updating Agency Locations](#updating-agency-locations)
    - [Assigning Producers to Locations](#assigning-producers-to-locations)
  - [5. Webhook Integration Flow](#5-webhook-integration-flow)

## 1. Agency Creation Workflow

### Option A: Via Onboarding URL

This approach allows agencies to self-onboard through a web portal.

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant Portal as ProducerFlow Portal
    participant Agency as Agency User
    participant NIPR as NIPR
    participant WH as Webhook Endpoint

    Note over Client,WH: Agency Onboarding via URL
    
    Client->>API: CreateAgencyOnboardingURL()
    Note over Client,API: Optional: name, entity_type,<br/>tenant_agency_id, address, etc.
    API-->>Client: onboarding_url
    
    Client->>Agency: Share onboarding URL
    Agency->>Portal: Access onboarding URL
    Portal->>Agency: Display onboarding form
    Note over Agency,Portal: Pre-filled with any<br/>provided defaults
    
    Agency->>Portal: Complete & submit form
    Note over Agency,Portal: - Agency details<br/>- Principal info<br/>- Business data<br/>- E&O insurance<br/>- Bank accounts
    
    Portal->>API: Create agency & principal
    API->>NIPR: Validate NPN
    NIPR-->>API: Validation result
    
    alt Valid NPN
        API->>API: Create agency record
        API->>API: Create principal producer
        API->>WH: agency.created webhook
        API->>WH: producer.created webhook
        API-->>Portal: Success
        Portal-->>Agency: Onboarding complete
    else Invalid NPN
        API-->>Portal: Validation error
        Portal-->>Agency: Show error & retry
    end
```

### Option B: Direct API Creation

This approach creates an agency directly through the API.

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant NIPR as NIPR
    participant WH as Webhook Endpoint

    Note over Client,WH: Direct Agency Creation
    
    Client->>API: NewAgency()
    Note over Client,API: Required: name, entity_type<br/>Optional: NPN, FEIN, addresses,<br/>principal, producers
    
    API->>API: Validate request
    
    alt Has NPN
        API->>NIPR: Validate agency NPN
        NIPR-->>API: NPN validation result
    end
    
    alt Has Principal NPN
        API->>NIPR: Validate principal NPN
        NIPR-->>API: NPN validation result
    end
    
    alt All validations pass
        API->>API: Create agency record
        API->>API: Create principal producer
        API->>API: Create additional producers
        
        API->>WH: agency.created webhook
        API->>WH: producer.created webhook(s)
        
        API-->>Client: Response with IDs
        Note over Client,API: agency_id, principal_id,<br/>producer_ids[]
    else Validation fails
        API-->>Client: Error response
        Note over Client,API: Invalid NPN, duplicate,<br/>or missing required fields
    end
```

## 2. Adding Producers to Agency

### Single Producer Addition

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant NIPR as NIPR
    participant WH as Webhook Endpoint

    Note over Client,WH: Add Single Producer
    
    Client->>API: NewProducer()
    Note over Client,API: Required: agency_id,<br/>first_name, last_name, email<br/>Optional: NPN, phone, address
    
    API->>API: Validate email uniqueness
    API->>API: Verify agency exists
    
    alt Has NPN
        API->>NIPR: Validate producer NPN
        NIPR-->>API: NPN validation result
    end
    
    alt Validation passes
        API->>API: Create producer record
        API->>API: Associate with agency
        API->>WH: producer.created webhook
        API-->>Client: producer_id
    else Validation fails
        API-->>Client: Error response
        Note over Client,API: Duplicate email,<br/>invalid NPN, or<br/>agency not found
    end
```

### Bulk Producer Addition

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant NIPR as NIPR
    participant WH as Webhook Endpoint

    Note over Client,WH: Add Multiple Producers
    
    Client->>API: NewProducers()
    Note over Client,API: agency_id + array of producers
    
    API->>API: Validate all producers
    Note over API: Check email uniqueness,<br/>validate NPNs if provided
    
    loop For each producer with NPN
        API->>NIPR: Validate NPN
        NIPR-->>API: Validation result
    end
    
    alt All validations pass
        API->>API: Create all producers
        API->>API: Associate with agency
        
        loop For each created producer
            API->>WH: producer.created webhook
        end
        
        API-->>Client: producer_ids[]
    else Any validation fails
        API-->>Client: Error response
        Note over Client,API: No producers created<br/>(all-or-nothing)
    end
```

### Producer Upload URL

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant Portal as ProducerFlow Portal
    participant Agency as Agency User
    participant WH as Webhook Endpoint

    Note over Client,WH: Producer Upload via URL
    
    Client->>API: CreateProducerUploadURL()
    Note over Client,API: agency_npn required
    
    API->>API: Verify agency exists
    API->>API: Generate secure URL
    API-->>Client: upload_url (7-day expiry)
    
    Client->>Agency: Share upload URL
    Agency->>Portal: Access upload URL
    Portal->>Agency: Display upload interface
    
    Agency->>Portal: Upload producer data
    Note over Agency,Portal: CSV or manual entry
    
    Portal->>API: Process producers
    API->>API: Validate & create producers
    
    loop For each producer
        API->>WH: producer.created webhook
    end
    
    Portal-->>Agency: Upload complete
```

## 3. Editing Producer Information

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant NIPR as NIPR
    participant WH as Webhook Endpoint

    Note over Client,WH: Update Producer Information
    
    Client->>API: GetProducer()
    Note over Client,API: By ID, NPN, or email
    API-->>Client: Current producer data
    
    Client->>API: UpdateProducer()
    Note over Client,API: Can update:<br/>- Contact info<br/>- Background check<br/>- Employment history<br/>- Non-uniform questions<br/><br/>Cannot update:<br/>- NIPR data<br/>- NPN
    
    API->>API: Validate changes
    
    alt Email changed
        API->>API: Check email uniqueness
    end
    
    alt Validation passes
        API->>API: Update producer record
        API->>WH: producer.updated webhook
        Note over WH: Only changed sections<br/>included in payload
        API-->>Client: Success
    else Validation fails
        API-->>Client: Error response
    end
    
    Note over Client,API: For NIPR data updates
    Client->>API: SyncProducerWithNIPR()
    API->>NIPR: Fetch latest data
    NIPR-->>API: Updated producer info
    API->>API: Update NIPR fields
    API->>WH: producer.updated webhook
    Note over WH: NIPR data sections updated
    API-->>Client: Sync complete
```

## 4. Agency Location Management

### Creating Agency Locations

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant WH as Webhook Endpoint

    Note over Client,WH: Add Agency Locations
    
    Client->>API: AddAgencyLocations()
    Note over Client,API: agency_id + locations[]<br/>Each location:<br/>- name (unique)<br/>- address<br/>- phone (optional)<br/>- email (optional)
    
    API->>API: Validate & create locations
    
    alt Success
        loop For each location
            API->>WH: agency.updated webhook
        end
        API-->>Client: location_ids[]
    else Error
        API-->>Client: Error response
    end
```

### Updating Agency Locations

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant WH as Webhook Endpoint

    Note over Client,WH: Update Agency Location
    
    Client->>API: UpdateAgencyLocation()
    Note over Client,API: agency_id, location_id<br/>Optional updates:<br/>- name<br/>- address<br/>- phone<br/>- email
    
    API->>API: Validate & update
    
    alt Success
        API->>WH: agency.updated webhook
        API-->>Client: Updated location
    else Error
        API-->>Client: Error response
    end
```

### Assigning Producers to Locations

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant WH as Webhook Endpoint

    Note over Client,WH: Manage Producer Location Assignments
    
    rect rgba(200, 230, 250, 0.1)
        Note right of Client: Assign Producer to Locations
        Client->>API: AssignProducerToLocations()
        Note over Client,API: producer_id + location_ids[]
        
        API->>API: Validate producer exists
        API->>API: Validate locations exist
        API->>API: Verify same agency
        Note over API: Producer and locations<br/>must belong to same agency
        
        alt Validation passes
            API->>API: Create assignments
            API->>WH: producer.updated webhook
            Note over WH: Location assignments added
            API-->>Client: Success
        else Validation fails
            API-->>Client: Error response
            Note over Client,API: Different agencies or<br/>entities not found
        end
    end
    
    rect rgba(250, 230, 200, 0.1)
        Note right of Client: Unassign Producer from Locations
        Client->>API: UnassignProducerFromLocations()
        Note over Client,API: producer_id + location_ids[]
        
        API->>API: Validate producer exists
        API->>API: Remove assignments
        Note over API: Non-existent assignments<br/>silently ignored
        
        API->>WH: producer.updated webhook
        Note over WH: Location assignments removed
        API-->>Client: Success
    end
```

## 5. Webhook Integration Flow

This diagram shows how webhooks are triggered throughout the various workflows.

```mermaid
sequenceDiagram
    participant Client as API Client
    participant API as ProducerFlow API
    participant WH as Your Webhook Endpoint
    participant System as Your System

    Note over Client,System: Webhook Event Flow
    
    rect rgba(200, 230, 250, 0.1)
        Note right of API: Agency Events
        API->>WH: POST /webhook
        Note over WH: agency.created or<br/>agency.updated
        WH->>WH: Verify signature
        WH->>System: Process agency data
        WH-->>API: 200 OK
    end
    
    rect rgba(250, 230, 200, 0.1)
        Note right of API: Producer Events
        API->>WH: POST /webhook
        Note over WH: producer.created or<br/>producer.updated
        WH->>WH: Verify signature
        WH->>System: Process producer data
        WH-->>API: 200 OK
    end
    
    rect rgba(230, 250, 230, 0.1)
        Note right of API: Location Events
        API->>WH: POST /webhook
        Note over WH: Included in agency.updated<br/>for location changes
        WH->>WH: Verify signature
        WH->>System: Update location data
        WH-->>API: 200 OK
    end
    
    rect rgba(250, 220, 250, 0.1)
        Note right of API: Appointment Events
        API->>WH: POST /webhook
        Note over WH: appointment.created or<br/>appointment.updated
        WH->>WH: Verify signature
        WH->>System: Process appointment
        WH-->>API: 200 OK
    end
    
    Note over API,WH: Retry Logic
    alt Response not 2xx or timeout
        API->>WH: Retry 1 (after 1 min)
        alt Still failing
            API->>WH: Retry 2 (after 5 min)
            alt Still failing
                API->>API: Mark as undelivered
            end
        end
    end
```

## Related Documentation

- [Authentication](Authentication.md) - API key setup and usage
- [Webhooks](Webhooks.md) - Detailed webhook integration guide
- [Getting Started with gRPC](Getting-started-with-grpc.md) - gRPC/Connect setup
- [API Reference](API-Reference.md) - Complete API documentation