# Webhooks

## Table of Contents

- [Webhooks](#webhooks)
  - [Table of Contents](#table-of-contents)
  - [1. Introduction](#1-introduction)
  - [2. System Overview](#2-system-overview)
  - [3. Webhook Integration Overview](#3-webhook-integration-overview)
    - [Key Requirements](#key-requirements)
  - [4. Webhook Configuration](#4-webhook-configuration)
  - [5. Event Mechanics and Types](#5-event-mechanics-and-types)
    - [Creation Events](#creation-events)
    - [Update Events](#update-events)
    - [Resync Events](#resync-events)
  - [6. Webhook Payload](#6-webhook-payload)
    - [Common Payload Structure](#common-payload-structure)
    - [Webhook Types and Event Types](#webhook-types-and-event-types)
      - [Agency Webhooks](#agency-webhooks)
      - [Producer Webhooks](#producer-webhooks)
      - [Contact Webhooks](#contact-webhooks)
      - [Appointment Webhooks](#appointment-webhooks)
    - [Key Elements](#key-elements)
      - [Required Fields](#required-fields)
      - [Identifier Fields](#identifier-fields)
      - [Origin Field Values](#origin-field-values)
    - [Data Sections](#data-sections)
      - [Agency Data Sections](#agency-data-sections)
      - [Producer Data Sections](#producer-data-sections)
      - [Contact Data](#contact-data)
    - [Schema Validation](#schema-validation)
    - [Integration Best Practices](#integration-best-practices)
  - [7. Response and Retries](#7-response-and-retries)
  - [8. Error Handling and Troubleshooting](#8-error-handling-and-troubleshooting)
  - [9. Security Considerations](#9-security-considerations)
  - [10. Signature Verification](#10-signature-verification)
    - [Go example](#go-example)
    - [TypeScript example](#typescript-example)
  - [11. Frequently Asked Questions](#11-frequently-asked-questions)

## 1. Introduction

This document provides detailed instructions for integrating your system to receive changes in Producerflow via webhooks. Webhooks allow your system to receive real-time updates whenever changes occur in our system. This guide will cover how to configure your webhook, the expected data format, and how to handle notifications effectively.

## 2. System Overview

Our system processes various types of data changes, such as producer and agency creation using the API, changes coming from NIPR, or manual updates in the Producerflow portal. By integrating with our Webhook system, you can stay in sync with these updates automatically.

## 3. Webhook Integration Overview

A Webhook is an HTTP callback that is triggered when a specified event occurs in our system. You can configure your own Webhook URL, to which our system will send notifications whenever a relevant change happens. These notifications will include a payload containing information about the change.

### Key Requirements

- **Endpoint**: You will provide an HTTPS endpoint for us to call when an event occurs.
- **Timeout**: Webhook calls must be processed within **10 seconds**.
- **Retries**: If a call fails, we will retry up to **3 times**.

## 4. Webhook Configuration

To configure the webhook:

1. Provide an HTTPS endpoint URL
2. Ensure your endpoint can handle POST requests
3. Implement proper response handling (return 2xx status codes for success)
4. Set up appropriate error handling and logging

## 5. Event Mechanics and Types

### Creation Events

- Creation events for all agencies, producers and contacts will be a unique event of type Created.
- It will contain all information sections documented below per entity if there is data available for them
- For example if no background check was triggered for a producer that section will not be included

### Update Events

- Update events will be sent every time there is a change in field belonging to any of the actions described below per entity
- The update event will only contain the data from the section that has undergone the change (as well as the top level fields that each event contains)
- The event type will be Updated

### Resync Events

- A resync event can be triggered manually from the Producerflow UI for any of the entities
- This will trigger a similar event to the creation one that will contain all information sections documented below per entity if there is data available for them
- The event type will be Resync

## 6. Webhook Payload

ProducerFlow delivers real-time notifications for changes to agencies, producers, and contacts through structured webhook payloads. Each webhook contains JSON data that follows our published schemas for validation and documentation purposes.

### Common Payload Structure

All webhook payloads share a common base structure with the following fields:

```json
{
  "id": "chg_123456789",                    // Unique identifier for this change event
  "event_type": "agency.updated",           // Specific event type (e.g., "agency.updated", "producer.created")
  "origin": "ProducerFlowAPI",              // Source: "ProducerFlowAPI", "ProducerFlowPortal"
  "timestamp": "2024-03-20T15:30:45Z",      // ISO 8601 datetime when change occurred
  // ... entity-specific data follows
}
```

### Webhook Types and Event Types

#### Agency Webhooks

**Event Types:**

- `agency.created` - New agency record created
- `agency.updated` - Existing agency record modified  

**Schema Reference**: [agency_schema.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/schema/agency_schema.json)  
**Example Payload**: [agency_example.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/examples/agency_example.json)

#### Producer Webhooks

**Event Types:**

- `producer.created` - New producer record created
- `producer.updated` - Existing producer record modified

**Schema Reference**: [producer_schema.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/schema/producer_schema.json)  
**Example Payload**: [producer_example.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/examples/producer_example.json)

#### Contact Webhooks

**Event Types:**

- `contact.created` - New contact record created
- `contact.updated` - Existing contact record modified
- `contact.deleted` - Contact record removed

**Schema Reference**: [contact_schema.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/schema/contact_schema.json)  
**Example Payload**: [contact_example.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/examples/contact_example.json)

#### Appointment Webhooks

Appointment webhooks deliver real-time notifications when license appointment statuses change due to processing by NIPR (National Insurance Producer Registry) or direct actions by tenant admins. ProducerFlow supports two types of carrier integrations:

1. **NIPR Integration (Asynchronous)**: Appointments go through NIPR processing with statuses like `in_progress`, `appointed`, `termination_requested`, `terminated`, and `rejected`
2. **ProducerFlow Direct Integration (Synchronous)**: Tenant admins create/terminate appointments directly with immediate `appointed` or `terminated` status

**Event Types:**

- `appointment.created` - New appointment record created (NIPR accepted request or direct creation)
- `appointment.updated` - Appointment status changed (NIPR processing results or admin updates)

**Schema Reference**: [appointment_schema.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/schema/appointment_schema.json)  
**Example Payload**: [appointment_example.json](https://github.com/producerflow/producerflowapi/blob/main/webhooks/examples/appointment_example.json)

**📋 For comprehensive appointment webhook documentation, including detailed examples, integration patterns, and handling of both NIPR and direct integrations, see: [Appointment Webhook Events](Appointment-events.md)**

### Key Elements

#### Required Fields

Each webhook type has specific required fields:

- **Agency**: `id`, `timestamp`, `agency_id`
- **Producer**: `id`, `timestamp`, `producer_id`  
- **Contact**: `id`, `timestamp`, `contact_id`

#### Identifier Fields

- **Agency Identifier**: All webhook types include `agency_id`. For agency webhooks, this identifies the agency itself. For producer and contact webhooks, this identifies the associated agency.
- **External Identifiers**: When available, webhooks include `external_id` fields representing identifiers from your system that you've provided to ProducerFlow.
- **National Producer Numbers (NPN)**: Included when available for agencies and producers.

#### Origin Field Values

- **ProducerFlowAPI**: Changes made using the public API, typically by your systems or scripts
- **ProducerFlowPortal**: Changes made through the ProducerFlow web portal by administrators or agency users  
- **NIPR**: Changes originating from the National Insurance Producer Registry

### Data Sections

#### Agency Data Sections

For update events, only the changed section(s) will be included:

- **`agency_data`**: General agency attributes (name, contact info, website, status)
- **`agency_address`**: Physical addresses collected in the Portal
- **`agency_bank_account`**: Bank account information for the agency
- **`agency_eo`**: Errors & Omissions insurance details
- **`agency_ivans_account`**: IVANS account configuration (AMS software, version, etc.)
- **`agency_nipr_data`**: Agency attributes from NIPR
- **`agency_nipr_appointments`**: Carrier appointments from NIPR
- **`agency_nipr_licenses`**: License information from NIPR
- **`agency_nipr_addresses`**: Address information from NIPR

#### Producer Data Sections  

For update events, only the changed section(s) will be included:

- **`producer_data`**: Personal information and contact details
- **`accurate_background_check`**: Background check results from Accurate Background (when available)
- **`producer_nipr_data`**: Producer attributes from NIPR
- **`producer_nipr_appointments`**: Carrier appointments from NIPR
- **`producer_nipr_licenses`**: License information and Lines of Authority from NIPR
- **`producer_nipr_addresses`**: Address information from NIPR

#### Contact Data

Contact webhooks contain flattened data including personal information, role, and address details.

### Schema Validation

All webhook payloads conform to JSON Schema Draft 2020-12 specifications. Use the provided schema files in the `webhooks/schema/` directory to:

- Validate incoming webhook payloads
- Generate types/models for your programming language
- Understand complete data structures and field requirements
- Implement proper data validation in your webhook handlers

### Integration Best Practices

1. **Idempotency**: Use the `id` field to handle duplicate webhook deliveries gracefully
2. **Event Filtering**: Check the `event_type` field to process only relevant events for your use case
3. **Schema Validation**: Validate all incoming payloads against the provided JSON schemas
4. **Partial Updates**: For update events, only process the data sections that are present in the payload

## 7. Response and Retries

Your system must respond to our Webhook call with an HTTP status code within **10 seconds**.  

Expected Response:

- **Success (200 OK)**: The request was processed successfully.
- **Failure**: If the request cannot be processed, a status code in the 4xx or 5xx range should be returned.

If the response is a failure or if the 10-second deadline is exceeded, our system will retry the Webhook call up to **two more times using exponential backoff**. This means there will be progressively longer delays between retry attempts.

If all retries fail, the event will be marked as **undelivered**. Undelivered events will not be retried again, and they will be discarded. In the future we will add a way to check for undelivered events in the API.

**Event Redelivery Semantics**:

- Once an event is successfully acknowledged (200 OK), **no further redelivery will occur**.
- While an event is outstanding (not yet acknowledged or deadline expired), **no additional redeliveries** will be initiated.

**Exponential Backoff for Retries**:

Exponential backoff is a strategy where the time between retries increases progressively. In this case, if the initial Webhook call fails, the retries will follow these delays:

- **First retry**: After 1 minute.
- **Second retry**: After an additional **5 minutes**.

This strategy helps to avoid overwhelming your system and allows it time to recover in case of transient failures.

**Flow Control**:

To prevent overloading your system, we will limit the number of outstanding events (i.e., events that are not yet acknowledged) to **100**. Once this limit is reached, no new events will be delivered until some outstanding events are acknowledged or marked as failed.

This mechanism ensures that your system does not become overwhelmed by too many concurrent requests and helps maintain stability under high load.

## 8. Error Handling and Troubleshooting

To ensure smooth operation:

- Log all incoming Webhook requests and responses.
- Handle errors gracefully in your system by using appropriate status codes.
- Check your server's capacity to process the payload within the given 10-second window.

Common issues include:

- **Timeouts**: Ensure your system can handle large payloads or complex processing efficiently.
- **Incorrect Responses**: Returning status codes other than 200 OK may trigger retries.

## 9. Security Considerations

To ensure secure communication and data protection, we expect the following measures:

1. **HTTPS Only**: Use SSL/TLS-encrypted endpoints to secure data transmission and prevent eavesdropping.
2. **Signature Verification**: Implement HMAC-based signature verification using the shared secret that you can find in the Producerflow portal to authenticate the integrity of incoming requests.
3. **IP Whitelisting** (optional): Restrict incoming requests to trusted IP addresses from our infrastructure to further enhance security.

## 10. Signature Verification

To ensure the integrity and authenticity of the events sent to your webhook endpoint, we use HMAC-based signatures. Each request from our service includes a signature header that allows you to verify that the request originated from us and has not been tampered with.

How It Works:

1. **Shared secret**: ProducerFlow generates a unique shared secret that could be retrieved using the admin portal. This secret is going to be used to sign request payload. Clients must use this secret to verify the integrity of the incoming request. Secret can be retrieved from the Admin portal in the settings page.
2. **Signature header**: ProducerFlow provides a request header ["Producerflow-Signature"] for each request.The hash is generated using HMAC-SHA256 with the shared secret and the request body. Clients must verify signatures using the shared secret.
3. **Verification Process**:
    - Step 1: Extract Producerflow-Signature from the incoming request
    - Step 2: Generate a hash using the HMAC-SHA256 algorithm with the shared secret and the raw request body.
    - Step 3: Compare the generated hash with the value in the Producerflow-Signature header.
    - Step 4: If the hashes match, the request is verified. If they do not match, reject the request as it may have been tampered with.

### Go example

```go
package main

import (
    "crypto/hmac"
    "crypto/sha256"
    "encoding/base64"
)

// Sign generates a HMAC SHA256 hash using the provided payload and secret.
func Sign(payload []byte, secret string) string {
    if secret == "" {
      return ""
    }
    if len(payload) == 0 {
      return ""
    }

    sign := hmac.New(sha256.New, []byte(secret))
    sign.Write(payload)
    return base64.StdEncoding.EncodeToString(sign.Sum(nil))
}

// VerifySignature compares the generated signature with the received signature.
func VerifySignature(payload []byte, receivedSignature, secret string) bool {
    computedSignature := Sign(payload, secret)
    return hmac.Equal([]byte(computedSignature), []byte(receivedSignature))
}
```

### TypeScript example

```typescript
import { createHmac, timingSafeEqual } from 'crypto';

/**
 * Generates a HMAC signature for the given payload using the provided secret.
 * The payload is hashed using SHA-256, and the resulting HMAC is encoded in base64.
 *
 * @param payload - The data to sign
 * @param secret - The secret key for HMAC generation
 * @returns Base64-encoded HMAC signature, or empty string if inputs are invalid
 */
export function signPayload(payload: Buffer | string, secret: string): string {
    if (!secret) {
      return '';
    }

    if (
      !payload ||
      (Buffer.isBuffer(payload) && payload.length === 0) ||
      (typeof payload === 'string' && payload.length === 0)
    ) {
      return '';
    }

    const hmac = createHmac('sha256', secret);
    hmac.update(payload);
    return hmac.digest('base64');
}

/**
 * Verifies the incoming request's signature.
 * @param payload - The raw body of the request (as a Buffer).
 * @param receivedSignature - The signature received from the request's `X-Signature` header.
 * @param secret - The shared secret used to verify the signature.
 * @returns Boolean indicating if the signatures match.
 */
function verifySignature(payload: Buffer, receivedSignature: string, secret: string): boolean {
  const computedSignature = signPayload(payload, secret);

  // Use time-safe comparison to avoid timing attacks
  return timingSafeEqual(Buffer.from(computedSignature), Buffer.from(receivedSignature));
}

```

## 11. Frequently Asked Questions

- **Q1**: What happens if my Webhook is down during an event?
  - **A1**: We will attempt to retry the Webhook call up to 3 times before marking it as undelivered.
- **Q2**: Can I send a delayed response?
  - **A2**: Responses must be returned within 10 seconds; otherwise, the request will be considered failed.
