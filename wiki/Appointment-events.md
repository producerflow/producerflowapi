# Appointment Webhook Events

This document provides comprehensive documentation for webhook events related to license appointments in the ProducerFlow system. Appointment webhooks deliver real-time notifications when appointment statuses change due to processing by NIPR (National Insurance Producer Registry) or direct actions by the tenant admin in Producerflow's portal.

**⚕️ For appointment health and compliance monitoring, including operational status tracking and risk management, see: [Appointment Operational Status](Appointment-Operational-Status.md)**

## Overview

ProducerFlow supports two types of carrier integrations for license appointments:

### 1. NIPR Integration (Asynchronous)

For carriers that use NIPR (National Insurance Producer Registry), appointments follow an asynchronous workflow:

1. **Request Submitted**: An appointment request or termination is submitted via the API
2. **Initial Response**: The API returns immediately with `in_progress` status if accepted by NIPR
3. **NIPR Processing**: NIPR processes the request asynchronously (can take minutes to hours)
4. **Webhook Notification**: When NIPR completes processing, ProducerFlow sends a webhook with the final result
5. **Status Updated**: Subsequent API calls return the updated appointment status

### 2. ProducerFlow Direct Integration (Synchronous)

For carriers that use ProducerFlow's direct appointment system, the process is immediate:

1. **Direct Action**: Tenant admin creates or terminates appointments directly in ProducerFlow
2. **Immediate Status**: Appointments are immediately set to `appointed` or `terminated` status
3. **Webhook Notification**: ProducerFlow sends a webhook notification immediately
4. **No Processing Delay**: No waiting for external system processing

## Event Types

### appointment.created

Triggered when a new appointment is created in the system.

**NIPR Integration:**

- After calling `RequestAppointment` RPC and NIPR accepts the request
- The appointment is created with `in_progress` status

**ProducerFlow Direct:**

- When tenant admin creates an appointment directly
- The appointment is immediately set to `appointed` status

### appointment.updated

Triggered when an appointment's processing status changes.

**NIPR Integration:**

- NIPR completes processing of an appointment request (moves from `in_progress` to `appointed` or `rejected`)
- NIPR completes processing of a termination request (moves from `termination_requested` to `terminated`)
- After calling `TerminateAppointment` RPC and NIPR processes the termination. The appointment status changes to `terminated`

**ProducerFlow Direct:**

- Tenant admin manually updates appointment status
- Status changes between `appointed` and `terminated`

## Processing Statuses

Understanding appointment processing statuses is crucial for handling webhook events. Different statuses are available depending on the integration type:

### NIPR Integration Statuses

| Status | Description | Webhook Trigger |
|--------|-------------|-----------------|
| `in_progress` | Appointment request submitted to NIPR, awaiting processing | ✅ `appointment.created` |
| `appointed` | NIPR successfully processed appointment request | ✅ `appointment.updated` |
| `termination_requested` | Termination request submitted to NIPR, awaiting processing | ✅ `appointment.updated` |
| `terminated` | NIPR successfully processed termination request | ✅ `appointment.updated` |
| `rejected` | NIPR rejected the appointment request | ✅ `appointment.updated` |

### ProducerFlow Direct Integration Statuses

| Status | Description | Webhook Trigger |
|--------|-------------|-----------------|
| `appointed` | Appointment created/activated by tenant admin | ✅ `appointment.created` or `appointment.updated` |
| `terminated` | Appointment terminated by tenant admin | ✅ `appointment.updated` |

## Webhook Payload Structure

All appointment webhooks follow this structure:

```json
{
  "id": "string",                    // Unique event identifier
  "event_type": "string",            // appointment.created|updated|terminated
  "origin": "string",                // "ProducerFlowAPI", "ProducerFlowPortal"
  "timestamp": "string",             // ISO 8601 datetime
  "appointment_id": "string",        // Appointment identifier
  "producer_id": "string",           // Producer identifier (optional)
  "agency_id": "string",             // Agency identifier
  "external_agency_id": "string",    // External agency identifier
  "external_producer_id": "string",  // External producer identifier
  "agency_npn": "string",            // Agency National Producer Number
  "producer_npn": "string",          // Producer National Producer Number
  "appointment_data": {
    "carrier": "string",             // Insurance carrier name
    "state": "string",               // State code (e.g., "TX")
    "status": "string",              // Processing status
    "license_number": "string",      // Associated license number
    "effective_date": "string",      // ISO 8601 datetime
    "termination_date": "string",    // ISO 8601 datetime (if terminated)
    "reasons": ["string"],           // Rejection or termination reasons
    "appointment_type": "string",    // registry|up_front|just_in_time
    "fees_in_cents": "number",       // Processing fees charged
    "comments": "string"             // Additional notes from NIPR
  }
}
```

## Event Examples

### NIPR Integration Examples

#### Successful Appointment (NIPR)

When NIPR successfully processes an appointment request:

```json
{
  "id": "evt_appointment_abc123",
  "event_type": "appointment.updated",
  "origin": "NIPR",
  "timestamp": "2025-01-15T14:30:00Z",
  "appointment_id": "app_xyz789",
  "producer_id": "prod_456789",
  "agency_id": "agcy_123456",
  "external_agency_id": "ext_agcy_001",
  "external_producer_id": "ext_prod_002",
  "agency_npn": "87654321",
  "producer_npn": "12345678",
  "appointment_data": {
    "carrier": "State Farm Mutual Automobile Insurance Company",
    "state": "TX",
    "status": "appointed",
    "license_number": "TX12345678",
    "effective_date": "2025-01-15T14:30:00Z",
    "appointment_type": "up_front",
    "fees_in_cents": 5000,
  }
}
```

#### Rejected Appointment (NIPR)

When NIPR rejects an appointment request:

```json
{
  "id": "evt_appointment_def456",
  "event_type": "appointment.updated",
  "origin": "ProducerFlowAPI",
  "timestamp": "2025-01-15T14:45:00Z",
  "appointment_id": "app_xyz790",
  "producer_id": "prod_456790",
  "agency_id": "agcy_123457",
  "external_agency_id": "ext_agcy_002",
  "external_producer_id": "ext_prod_003",
  "agency_npn": "87654322",
  "producer_npn": "12345679",
  "appointment_data": {
    "carrier": "Progressive Insurance Company",
    "state": "CA",
    "status": "rejected",
    "license_number": "CA98765432",
    "appointment_type": "registry",
    "fees_in_cents": 0,
  }
}
```

#### Termination Request Submitted (NIPR)

When a termination request is submitted to NIPR but not yet processed:

```json
{
  "id": "evt_appointment_term_req_123",
  "event_type": "appointment.updated",
  "origin": "ProducerFlowAPI",
  "timestamp": "2025-01-15T14:50:00Z",
  "appointment_id": "app_xyz792",
  "producer_id": "prod_456792",
  "agency_id": "agcy_123459",
  "external_agency_id": "ext_agcy_006",
  "external_producer_id": "ext_prod_007",
  "agency_npn": "87654326",
  "producer_npn": "12345683",
  "appointment_data": {
    "carrier": "Allstate Insurance Company",
    "state": "FL",
    "status": "termination_requested",
    "license_number": "FL55555555",
    "effective_date": "2024-06-01T00:00:00Z",
    "appointment_type": "registry",
    "fees_in_cents": 2500,
  }
}
```

#### Appointment Termination (NIPR)

When NIPR successfully processes an appointment termination:

```json
{
  "id": "evt_appointment_ghi789",
  "event_type": "appointment.updated",
  "origin": "ProducerFlowAPI", 
  "timestamp": "2025-01-15T15:00:00Z",
  "appointment_id": "app_xyz791",
  "producer_id": "prod_456791",
  "agency_id": "agcy_123458",
  "external_agency_id": "ext_agcy_003",
  "external_producer_id": "ext_prod_004",
  "agency_npn": "87654323",
  "producer_npn": "12345680",
  "appointment_data": {
    "carrier": "Allstate Insurance Company",
    "state": "FL",
    "status": "terminated",
    "license_number": "FL55555555",
    "effective_date": "2024-06-01T00:00:00Z",
    "termination_date": "2025-01-15T15:00:00Z",
    "appointment_type": "registry",
    "fees_in_cents": 2500,
  }
}
```

### ProducerFlow Direct Integration Examples

#### Direct Appointment Creation

When a tenant admin creates an appointment directly in ProducerFlow:

```json
{
  "id": "evt_appointment_direct_123",
  "event_type": "appointment.created",
  "origin": "ProducerFlowPortal",
  "timestamp": "2025-01-15T16:15:00Z",
  "appointment_id": "app_direct_456",
  "producer_id": "prod_789123",
  "agency_id": "agcy_456789",
  "external_agency_id": "ext_agcy_004",
  "external_producer_id": "ext_prod_005",
  "agency_npn": "87654324",
  "producer_npn": "12345681",
  "appointment_data": {
    "carrier": "Farmers Insurance Group",
    "state": "NV",
    "status": "appointed",
    "license_number": "NV98765432",
    "effective_date": "2025-01-15T16:15:00Z",
    "appointment_type": "registry",
    "fees_in_cents": 0,
  }
}
```

#### Direct Appointment Termination

When a tenant admin terminates an appointment directly in ProducerFlow:

```json
{
  "id": "evt_appointment_direct_456",
  "event_type": "appointment.updated",
  "origin": "ProducerFlowPortal",
  "timestamp": "2025-01-15T16:30:00Z",
  "appointment_id": "app_direct_789",
  "producer_id": "prod_789124",
  "agency_id": "agcy_456790",
  "external_agency_id": "ext_agcy_005",
  "external_producer_id": "ext_prod_006",
  "agency_npn": "87654325",
  "producer_npn": "12345682",
  "appointment_data": {
    "carrier": "Liberty Mutual Insurance",
    "state": "AZ",
    "status": "terminated",
    "license_number": "AZ11111111",
    "effective_date": "2024-08-01T00:00:00Z",
    "termination_date": "2025-01-15T16:30:00Z",
    "appointment_type": "up_front",
    "fees_in_cents": 0,
  }
}
```

## Integration Guidelines

### Event Processing

1. **Status-Based Handling**: Handle webhook events based on appointment status:
   - `in_progress` = Only appears in NIPR integration, indicates appointment request processing
   - `appointed` = Final status in both integration types
   - `termination_requested` = Only appears in NIPR integration, indicates termination request processing
   - `terminated` = Final status in both integration types  
   - `rejected` = Only appears in NIPR integration

2. **Idempotency**: Always use the `id` field to handle duplicate webhook deliveries

3. **Error Handling**: Implement retry logic for failed webhook processing

4. **Validation**: Validate payloads against the [appointment schema](../webhooks/schema/appointment_schema.json)

### Key Differences Between Integration Types

| Aspect | NIPR Integration | ProducerFlow Direct |
|--------|------------------|-------------------|
| **Processing** | Asynchronous (minutes to hours) | Immediate |
| **Initial Status** | `in_progress` | `appointed` |
| **Origin Values** | `ProducerFlowPortal`, `ProducerFlowAPI` | `ProducerFlowPortal`, `ProducerFlowAPI` |
| **Possible Rejections** | Yes (`rejected`) | No |
| **Fees** | May include NIPR processing fees | $0 |
| **Webhook Timing** | Delayed until NIPR processes | Immediate |

### Fee Handling

Appointment and termination fees are included in webhook payloads as `fees_in_cents`:

- **NIPR Integration**: Values represent actual NIPR processing fees (e.g., 5000 = $50.00)
- **ProducerFlow Direct**: Typically 0 since no external processing fees apply
- Zero fees indicate no charge was applied

### Error Scenarios

Handle these common error scenarios:

#### NIPR Integration Errors

1. **Rejection Reasons**: Check `appointment_data.reasons` array
   - Common reasons: expired license, missing CE credits, carrier restrictions
   - Use reasons to guide remediation steps

2. **Processing Delays**:
   - NIPR processing can take hours or days for both appointments and terminations
   - Don't treat delayed webhooks as failures
   - Monitor appointment status via API if needed

3. **Termination Processing**:
   - Status moves from `appointed` → `termination_requested` → `terminated`
   - Handle `termination_requested` status to notify users that termination is pending

#### ProducerFlow Direct Integration

1. **Immediate Processing**: No delays or external processing errors
2. **Admin Actions**: All changes are intentional admin actions
3. **No Rejections**: Direct appointments don't get rejected by external systems

## Related API Methods

- `RequestAppointment` - Initiates appointment requests (NIPR integration)
- `TerminateAppointment` - Initiates termination requests (NIPR integration)
- `GetAppointment` - Retrieves current appointment status (both integrations)
- `ListAppointments` - Lists appointments with status filters (both integrations)
- `GetAppointmentFees` - Gets fee estimates before requesting (NIPR integration)
- `GetTerminationFees` - Gets termination fee estimates (NIPR integration)
- `ListTerminationReasons` - Gets valid termination reasons by state (NIPR integration)

## Webhook Security

- Verify webhook signatures using your webhook secret
- Use HTTPS endpoints for webhook URLs
- Implement proper authentication for webhook endpoints
- Log all webhook events for audit and debugging

For additional webhook documentation, see the main [Webhooks](../webhooks/README.md) guide.
