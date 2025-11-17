# Webhooks

This directory contains webhook payload documentation for the ProducerFlow API. Webhooks are HTTP callbacks that notify your application when specific events occur within the ProducerFlow system.

## Overview

ProducerFlow webhooks deliver real-time notifications for changes to:

- **Agencies** - Insurance agency information and licensing data
- **Producers** - Individual producer/agent information and licensing data
- **Contacts** - Contact information for agency personnel
- **Appointments** - Producer-carrier appointment relationships and operational status

Each webhook payload contains structured data that follows JSON Schema specifications for validation and documentation purposes.

## Organizations

Organizations provide a way to group multiple agencies within ProducerFlow. An organization can contain several agencies, creating a hierarchical structure for managing related insurance businesses. Producers inherit organization information from their associated agency, ensuring consistent organizational grouping throughout the system.

## Webhook Types

### Agency Webhooks

Triggered when agency data is created, updated, or synchronized from external sources.

**Schema**: [agency_schema.json](./schema/agency_schema.json)
**Example Payload**: [agency_example.json](./examples/agency_example.json)

**Event Types:**

- `agency.created` - New agency record created
- `agency.updated` - Existing agency record modified

**Key Data Included:**

- Basic agency information (name, contact details, website)
- Federal Employer Identification Number (FEIN) and National Producer Number (NPN)
- Business addresses and bank account information
- Physical locations associated with the agency
- Errors & Omissions insurance details
- IVANS account configuration
- NIPR licensing data including appointments and licenses
- Lines of Authority (LOA) information
- Organization information (organization ID, name, and external ID)
- Custom additional questions and answers as key-value pairs (tenant_additional_questions)
- Legacy custom metadata questions (metadata_questions) - deprecated, use tenant_additional_questions instead

### Producer Webhooks

Triggered when producer/agent data is created, updated, or synchronized.

**Schema**: [producer_schema.json](./schema/producer_schema.json)
**Example Payload**: [producer_example.json](./examples/producer_example.json)

**Event Types:**

- `producer.created` - New producer record created
- `producer.updated` - Existing producer record modified

**Key Data Included:**

- Personal information (name, contact details, addresses)
- National Producer Number (NPN) and agency associations
- Assigned physical locations where the producer operates
- Background check results from Accurate Background
- NIPR licensing data including appointments and licenses
- Lines of Authority (LOA) and continuing education status
- License expiration dates and compliance information
- Organization information (inherited from associated agency)
- Custom additional questions and answers as key-value pairs (tenant_additional_questions)
- Legacy custom metadata questions (metadata_questions) - deprecated, use tenant_additional_questions instead

### Contact Webhooks

Triggered when contact information is created, updated, or deleted.

**Schema**: [contact_schema.json](./schema/contact_schema.json)
**Example Payload**: [contact_example.json](./examples/contact_example.json)

**Event Types:**

- `contact.created` - New contact record created
- `contact.updated` - Existing contact record modified
- `contact.deleted` - Contact record removed

**Key Data Included:**

- Contact personal information (name, email, phone)
- Physical address information
- Role within the agency
- Associated agency and external identifiers
- National Producer Number (NPN) if applicable

### Appointment Webhooks

Triggered when producer-carrier appointment relationships are created, updated, or when their operational status changes.

**Schema**: [appointment_schema.json](./schema/appointment_schema.json)
**Example Payloads**:

- [appointment_example.json](./examples/appointment_example.json) - Basic appointment event
- [appointment_operational_status_example.json](./examples/appointment_operational_status_example.json) - Operational status change

**Event Types:**

- `appointment.created` - New appointment relationship established
- `appointment.updated` - Existing appointment modified or status changed

**Key Data Included:**

- Appointment details (carrier, state, status, license number)
- Effective and termination dates
- Associated producer and agency information
- National Producer Numbers (NPN) for both agency and producer
- Operational status tracking (`active`, `at_risk`)
- Risk assessment reasons (license expiration, E&O insurance status)
- Appointment termination reasons when applicable

## Common Payload Structure

All webhook payloads share a common base structure:

```json
{
  "id": "string",              // Unique identifier for this change event
  "event_type": "string",      // Specific event type (e.g., "agency.updated")
  "origin": "string",          // Source: "ProducerFlowAPI", "ProducerFlowPortal", "NIPR"
  "timestamp": "string",       // ISO 8601 datetime when change occurred
  // ... entity-specific data
}
```

### Always Sent Fields

The following fields are **always present** in every webhook payload:

| Field | Type | Description | Possible Values |
|-------|------|-------------|-----------------|
| `id` | string | Unique identifier for this change event | Any string value (e.g., "chg_123456789") |
| `event_type` | string | Specific event type that occurred | See [Event Types](#event-types) section below |
| `origin` | string | Source system that triggered the change | `ProducerFlowAPI`, `ProducerFlowPortal`, or `NIPR` |
| `timestamp` | string | ISO 8601 datetime when the change occurred | ISO 8601 format (e.g., "2024-03-20T15:30:45Z") |

Additionally, each webhook type has its own required identifier field:
- **Agency webhooks**: `agency_id` (always present)
- **Producer webhooks**: `producer_id` (always present)
- **Contact webhooks**: `contact_id` (always present)
- **Appointment webhooks**: `appointment_id` (always present)

### Event Types

The `event_type` field follows a consistent pattern: `{object}.{action}`. Here are all possible event types:

| Event Type | Description |
|------------|-------------|
| `agency.created` | A new agency record was created |
| `agency.updated` | An existing agency record was modified |
| `producer.created` | A new producer record was created |
| `producer.updated` | An existing producer record was modified |
| `contact.created` | A new contact record was created |
| `contact.updated` | An existing contact record was modified |
| `contact.deleted` | A contact record was removed |
| `appointment.created` | A new appointment relationship was established |
| `appointment.updated` | An existing appointment was modified or status changed |

## Data Origins

Webhook data can originate from multiple sources:

- **ProducerFlowAPI** - Changes made via API calls
- **ProducerFlowPortal** - Changes made through the web portal
- **NIPR** - Data synchronized from the National Insurance Producer Registry

## Schema Validation

All webhook payloads conform to JSON Schema Draft 2020-12 specifications. You can use the provided schema files to:

- Validate incoming webhook payloads
- Generate code/types for your programming language
- Understand the complete data structure and requirements

## Required Fields

Each webhook type has specific required fields:

- **Agency**: `id`, `timestamp`, `agency_id`
- **Producer**: `id`, `timestamp`, `producer_id`
- **Contact**: `id`, `timestamp`, `contact_id`
- **Appointment**: `id`, `timestamp`, `appointment_id`

## Integration Tips

1. **Idempotency**: Use the `id` field to handle duplicate webhook deliveries
2. **Filtering**: Check `event_type` to process only relevant events
3. **Validation**: Validate payloads against the provided JSON schemas
4. **Error Handling**: Implement retry logic for failed webhook processing
5. **Security**: Verify webhook signatures (implementation-specific)

## NIPR Data

Many webhooks include NIPR (National Insurance Producer Registry) data, which provides:

- Licensed insurance producer information
- Appointment details with insurance carriers
- Lines of Authority (LOA) authorizations
- Continuing Education (CE) compliance status
- License expiration and renewal dates

This data is critical for compliance and regulatory reporting in the insurance industry.

For additional API documentation and integration guides, please refer to the main [API documentation](../wiki/Webhooks.md.md).
