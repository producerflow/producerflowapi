# Webhooks

This directory contains webhook payload documentation for the ProducerFlow API. Webhooks are HTTP callbacks that notify your application when specific events occur within the ProducerFlow system.

## Overview

ProducerFlow webhooks deliver real-time notifications for changes to:

- **Agencies** - Insurance agency information and licensing data
- **Producers** - Individual producer/agent information and licensing data
- **Contacts** - Contact information for agency personnel
- **Appointments** - Producer-carrier appointment relationships and operational status
- **Organizations** - Distribution partners / aggregators that group agencies

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
**Example Payloads**:

- [producer_example.json](./examples/producer_example.json) - Basic producer event
- [producer_transferred_example.json](./examples/producer_transferred_example.json) - Producer transferred between agencies

**Event Types:**

- `producer.created` - New producer record created
- `producer.updated` - Existing producer record modified
- `producer.transferred` - Producer moved from one agency to another within the same tenant

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

- Appointment details (carrier, cocode, state, status, license number)
- Effective and termination dates
- Associated producer and agency information
- National Producer Numbers (NPN) for both agency and producer
- Operational status tracking (`active`, `at_risk`)
- Risk assessment reasons (license expiration, E&O insurance status)
- Appointment termination reasons when applicable

### Organization Webhooks

Triggered when an organization is created or updated. Organization events are only delivered to tenants that have the feature enabled.

**Schema**: [organization_schema.json](./schema/organization_schema.json)
**Example Payload**: [organization_example.json](./examples/organization_example.json)

**Event Types:**

- `organization.created` - New organization record created
- `organization.updated` - Existing organization record modified

**Key Data Included:**

- Organization display name and contact email
- External identifier for the organization (if set by the tenant)
- Whether the organization is a wholesaler

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
- **Organization webhooks**: `organization_id` (always present)

### Event Types

The `event_type` field follows a consistent pattern: `{object}.{action}`. Here are all possible event types:

| Event Type | Description |
|------------|-------------|
| `agency.created` | A new agency record was created |
| `agency.updated` | An existing agency record was modified |
| `producer.created` | A new producer record was created |
| `producer.updated` | An existing producer record was modified |
| `producer.transferred` | A producer was moved from one agency to another within the same tenant. `agency_id` is the target agency; `source_agency_id` is the previous agency |
| `contact.created` | A new contact record was created |
| `contact.updated` | An existing contact record was modified |
| `contact.deleted` | A contact record was removed |
| `appointment.created` | A new appointment relationship was established |
| `appointment.updated` | An existing appointment was modified or status changed |
| `organization.created` | A new organization record was created |
| `organization.updated` | An existing organization record was modified |

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
- **Organization**: `id`, `timestamp`, `organization_id`

## Compression

Deliveries are uncompressed by default. On request we can enable gzip for your
webhook, in which case each request arrives with:

```
Content-Encoding: gzip
```

and a body you inflate before parsing. Our event payloads are long runs of
near-identical objects, so this typically reduces them by an order of magnitude —
useful if your endpoint enforces a request body limit, since those limits are
normally applied to the bytes received.

Two things worth knowing before asking for it:

- **Your stack has to inflate request bodies.** Most frameworks do not do this
  out of the box for incoming requests, even where they compress responses. A
  Fastify endpoint, for example, needs `@fastify/compress`. Without it you will
  receive bytes you cannot parse.
- **Verify before you inflate.** `Producerflow-Signature` always covers the body
  exactly as sent, so on a compressed delivery it is the HMAC of the compressed
  bytes, not of the JSON inside them. The rule is the same either way — hash the
  body you received — but it does mean you must compute the signature over the
  raw request body before anything decompresses it.

  This is worth checking against your stack before asking us to enable
  compression. Some common setups hand your code an already-inflated body: Express's
  `body-parser` inflates by default and its `verify` callback receives the
  inflated buffer, and a proxy or CDN in front of your service may decompress
  the request before your origin sees it. If you cannot get at the raw bytes,
  compression is not usable for you as-is.

Once it is on, the webhook integration settings tag the delivery URL
`Compressed`, and so is each compressed delivery in the delivery history.

## Delivery headers

Every delivery carries routing headers alongside `Producerflow-Signature`:

- `X-Event-Type` / `X-Event-Resource` / `X-Event-Action` — the event type and
  its two halves, e.g. `agency.updated` / `agency` / `updated`.
- `X-Event-Sections` — the payload sections the body carries, sorted and
  comma-separated, e.g. `agency_data, agency_nipr_appointments`. A section is a
  structured part of the payload (a JSON object or array); identity and status
  fields are not listed, including `agency_principal`, which accompanies every
  agency event that has a principal. The value may be empty for an event
  carrying only identity fields.

`X-Event-Sections` exists so you can route or discard a delivery without
verifying, inflating and parsing a potentially large body: if the event carries
nothing you consume, drop it on the header alone. Two caveats: the signature
covers the body only, so headers are routing hints rather than signed claims —
anything you act on beyond routing should come from the verified body. And a
section being listed means it is present in this event, not that it is your
only change signal: a section absent from one event may simply not have
changed, or be one you unsubscribed from.

## Integration Tips

1. **Idempotency**: Use the `id` field to handle duplicate webhook deliveries
2. **Filtering**: Check `event_type` to process only relevant events, and
   `X-Event-Sections` to skip deliveries whose payload holds nothing you consume
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

### NIPR payload categories

The NIPR sections of an event are grouped into four categories a tenant can
subscribe to independently: `nipr.demographics` (the `*_nipr_data` section,
registered name included), `nipr.licenses` (licenses and their LOAs),
`nipr.appointments` and `nipr.addresses`. All four are subscribed by default;
unsubscribing removes that category's sections from your webhook payloads. An
absent section and an empty one look the same on the wire, as they always have.

Events reporting a NIPR change also carry only the sections that changed, so a
subscribed section may still be absent from any given event: absence means "not
in this event", never "the data is gone".

### Completed NIPR syncs

When a NIPR sync finishes, the entity receives a single `agency.updated` or
`producer.updated` event that carries the synced NIPR data together with
`nipr_sync_status: "active"`. The data and the finished status always arrive in
the same message, so there is nothing to correlate: an event carrying NIPR data
is never stamped `pending`, and the completion is never announced separately
with an empty payload. Unsubscribing from categories narrows the data half but
never suppresses the message: a tenant unsubscribed from all four still
receives the completion event carrying `nipr_sync_status`.

A sync that does not complete reports its outcome the usual way, as an update
carrying only the new `nipr_sync_status` (for example `failing`).

For additional API documentation and integration guides, please refer to the main [API documentation](../wiki/Webhooks.md.md).
