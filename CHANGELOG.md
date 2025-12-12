# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.10] - 2025-12-12

### Added

#### ProducerService

- **External Metadata for Contacts** - Custom metadata support extended to contact records
  - `external_metadata` field added to `Contact` message
  - Allows tenants to attach arbitrary key-value pairs to contacts for business logic, reporting, or integration needs
  - Can be updated via `UpdateContact` endpoint and is returned by `ListAgencyContacts` endpoint
  - Update behavior: omit to preserve, empty map to clear, or provide values to replace entirely

---

## [1.0.9] - 2025-12-10

### Changed

#### ProducerService

- **License Date Fields** - New date fields instead of timestamps, deprecating the old timestamp-based fields
  - `expires_on` replaces `expiration_date` (now deprecated) for license expiration
  - `issued_on` replaces `issue_date` (now deprecated) for license issue date
  - `last_updated_on` replaces `update_date` (now deprecated) for license last update
  - Affects: `Agency.License`, `Producer.License`, and their `LineOfAuthority` messages
  - Date fields provide cleaner representation without timezone complexity

  The deprecated timestamp fields (`expiration_date`, `issue_date`, `update_date`) will continue to be populated for backward compatibility but should be migrated to the new date fields.

---

## [1.0.8] - 2025-12-09

### Added

#### ProducerService

- **License ID Field** - Unique identifier added to license objects for tracking and reference
  - `license_id` field added to `Agency.License` message (returned by `GetAgency` and related endpoints)
  - `license_id` field added to `Producer.License` message (returned by `GetProducer` and related endpoints)
  - Enables direct license lookup and cross-system reference

#### Webhook System

- **License ID in Webhook Payloads** - License identifiers now included in webhook notifications
  - `license_id` field added to agency webhook license objects
  - `license_id` field added to producer webhook license objects
  - Simplifies correlation between API data and webhook events

### Changed

#### ProducerService

- **Phone Fields Now Truly Optional** - Phone number fields across multiple endpoints now properly support omission
  - Affects: `NewAgencyRequest.phone`, `NewAgencyRequest.Principal.phone`, `UpdateProducerRequest.phone`, `UpdateAgencyRequest.phone`, `UpdateContactRequest.phone`, `UpdateAgencyLocationRequest.phone`
  - Empty phone values are now ignored during validation rather than triggering format errors
  - Improves flexibility for agencies and producers without phone numbers on file

---

## [1.0.7] - 2025-12-04

### Added

#### ProducerService

- **UpdateContact Endpoint** - New RPC for updating existing contact information
  - `UpdateContact` RPC added to update contact details including name, email, phone, address, and role
  - Supports partial updates where only provided fields are modified
  - Includes email uniqueness validation across both producers and contacts within the tenant
  - Comprehensive validation rules for all updatable fields

- **ContactRole Enum** - New enumeration for standardized contact roles
  - Five validated role types: Agency Administrator, CSR, Other, Unlicensed Producer, and Unlicensed Service
  - Enforces type safety and prevents invalid role values
  - Affects: `NewContact` (used by `NewContact` and `NewContacts` endpoints)
  - Available roles:
    - `CONTACT_ROLE_AGENCY_ADMINISTRATOR` - A contact with administrative responsibilities
    - `CONTACT_ROLE_CSR` - Customer Service Representative (unlicensed)
    - `CONTACT_ROLE_OTHER` - Flexible role assignment for non-standard roles
    - `CONTACT_ROLE_UNLICENSED_PRODUCER` - Producer-like capacity without active license
    - `CONTACT_ROLE_UNLICENSED_SERVICE` - Service provider without insurance license

- **NIPR Sync Status Tracking** - Producer NIPR data now includes synchronization state tracking
  - Affects: `Producer` message (returned by `GetProducer` and `GetAgencyAndProducers` endpoints)
  - `nipr_sync_status` field to monitor sync state (active, failing, pending, disabled)
  - `nipr_sync_status_updated_at` timestamp field for tracking status changes
  - Enables monitoring of NIPR data synchronization health

### Changed

#### ProducerService

- **Contact Message Fields** - The `Contact` message (returned by `ListAgencyContacts` endpoint) still uses string-based role field
  - `role` field remains as `string` type for backward compatibility but adds new field `role_type` as an enum
  - Maintains consistency with existing integrations

---

## [1.0.5] - 2025-11-28

### Added

#### ProducerService

- **License Carrier ID** – The License object now includes a `carrier_id` field to identify which carrier a license is associated with.

---

## [1.0.4] - 2025-11-28

### Added

#### ProducerService

- **Organization Creation** - New RPC for programmatic organization management
  - `CreateOrganization` RPC added to create organizations via API
  - Accepts organization name, external_id, and email
  - Returns the created organization_id

### Changed

#### Documentation

- **Enhanced API Documentation** - Comprehensive documentation improvements across all proto files
  - Expanded service and RPC descriptions with detailed behavior explanations
  - Added validation rules, typical workflows, and common error codes to all endpoints
  - Improved field-level documentation with clearer descriptions
  - See the full [API Reference](https://github.com/producerflow/producerflowapi/wiki/API-Reference)

#### Address Field Standardization

- **Address Fields Renamed** - Standardized address field naming across all messages
  - `address_line_1` replaces `street` as the primary address field
  - `address_line_2` replaces `street_line_2` for secondary address line
  - Affected messages: `Address`, `NewAgency`, `NewProducer`, `UpdateAgencyRequest` and `UpdateProducerRequest`

### Deprecated

- **Legacy Address Field** - `street` field deprecated in favor of `address_line_1`
  - Affects all `Address` message types throughout the API
  - `street` will continue to work for backward compatibility, but migration to new field is recommended

---

## [1.0.2] - 2025-11-19

### Added

#### ProducerService

- **External Metadata Support** - New capability to store custom tenant-specific metadata on agencies and producers
  - `external_metadata` field added to `Agency`, `Producer`, `UpdateAgencyRequest`, and `UpdateProducerRequest` messages
  - Supports storing references to external system states, custom tags, classifications, and derived data

- **Enhanced Custom Questions** - New standardized field for tenant-specific custom questions
  - `tenant_additional_questions` field added to `Agency`, `Producer`, `NewAgency`, and `NewProducer` messages
  - Provides consistent key-value pair format for storing custom onboarding questions and responses

- **Address Enhancement** - Added support for multi-line street addresses
  - `street_line_2` optional field added to `Address` message for apartments, suites, units, etc.

#### Webhook System

- **Enhanced Webhook Payloads** - Agency and producer webhooks now include additional custom metadata
  - `tenant_additional_questions` field added to agency and producer webhook payloads
  - `external_metadata` field included in webhook payloads for both agencies and producers

### Deprecated

- **Legacy Metadata Questions** - `metadata_questions` field deprecated in favor of `tenant_additional_questions`
  - Affects `Agency`, `Producer`, `NewAgency`, and `NewProducer` messages
  - `tenant_additional_questions` provides better structure and consistency
  - `metadata_questions` will be removed in a future release

---

## [1.0.1] - 2025-11-12

### Added

#### AppointmentService

- **Synthetic Appointment Support** - Support for synthetic appointments in states where only agency-level appointments are permitted (CA, DC, HI, KY, LA, MA, MT, UT, WA)
  - New `APPOINTMENT_TYPE_SYNTHETIC` appointment type
  - `parent_appointment_id` field added to `Appointment` message to link synthetic appointments to their parent agency appointments
  - Synthetic appointments are automatically created when agency appointments are approved
  - Synthetic appointments inherit properties from parent agency appointments and are terminated when the parent is terminated

---

## [1.0.0] - 2025-11-10

### Added

#### Core API Services

- **ProducerService** - Comprehensive API for managing insurance producers and agencies
  - Agency onboarding with self-service URL generation
  - Producer onboarding with optional NPN pre-fill
  - Bulk operations for creating multiple producers and contacts
  - Agency and producer data synchronization with NIPR
  - Organization management for hierarchical agency structures
  - Location management for multi-location agencies
  - Contact management for non-producer agency personnel
  - External ID mapping for integration with external systems

- **AppointmentService** - Complete appointment lifecycle management
  - Request and terminate license appointments through NIPR
  - Support for registry states and capacity carriers
  - Appointment fee calculation (appointment and termination fees)
  - Eligibility checking for license appointments
  - Appointment operational status monitoring
  - Termination reason management by state
  - Real-time appointment status tracking

#### Protocol & Client Libraries

- **gRPC and Connect Protocol Support** - Multi-protocol API access
  - Production endpoint: `https://api.producerflow.com`
  - UAT endpoint: `https://api.uat.producerflow.com`
  - Full gRPC support with Connect compatibility
  - Protocol Buffer definitions for all services

- **Go Client Library** (`gen/go/`)
  - Complete Go implementation with gRPC and Connect support
  - Type-safe client generation from Protocol Buffers
  - Full API coverage for all services

- **TypeScript/JavaScript Client Library** (`gen/ts/`)
  - Full TypeScript/JavaScript client with type definitions
  - Published to npm as `@producerflow/producerflowapi`
  - Node.js 20+ support
  - Complete type safety with generated TypeScript definitions

#### NIPR Integration

- **National Insurance Producer Registry (NIPR) Synchronization**
  - Automatic license data synchronization
  - Biographic information retrieval
  - License status and expiration tracking
  - Lines of Authority (LOA) management
  - Carrier appointment data from NIPR
  - Regulatory action tracking
  - Manual resync capabilities
  - NIPR sync state management (active, failing, pending, disabled)
  - NPN validation for producers and agencies
  - FEIN to NPN lookup functionality

#### Webhook System

- **Real-time Event Notifications**
  - Agency webhooks (`agency.created`, `agency.updated`)
  - Producer webhooks (`producer.created`, `producer.updated`)
  - Contact webhooks (`contact.created`, `contact.updated`, `contact.deleted`)
  - Appointment webhooks (`appointment.created`, `appointment.updated`)
  - Webhook signature verification for security
  - JSON Schema validation for all webhook payloads
  - Example payloads and schema definitions

#### Appointment Features

- **Appointment Operational Status**
  - Daily monitoring of appointment health and compliance
  - Risk assessment (active, at_risk status)
  - Risk reason tracking (license inactive, expired, E&O issues)
  - Webhook notifications for operational status changes
  - API endpoints for retrieving operational status

#### Agency & Producer Management

- **Agency Features**
  - Support for Sole Proprietor and Agency entity types
  - Multiple address types (mailing, physical, invoicing)
  - Bank account information for commission payments
  - Errors & Omissions (E&O) insurance tracking
  - Business hours configuration with timezone support
  - IVANS account integration
  - Points of contact with role-based communication
  - Custom metadata questions and answers
  - Agency file management (E&O docs, voided checks, W9, licenses, broker bonds)

- **Producer Features**
  - Multi-state license management
  - License expiration tracking
  - Lines of Authority (LOA) per license
  - Producer-to-location assignments
  - Principal producer designation
  - Custom metadata questions and answers
  - Background check integration support

- **Location Management**
  - Multiple locations per agency
  - Location-specific contact information
  - Primary location designation
  - Producer-to-location assignments
  - Bulk location operations (add/remove up to 100 locations)

### Security

- Initial security implementation with API key authentication
- Webhook signature verification support
- SOC 2 compliance certification

---

## Template for Future Releases

Copy and modify the following template for new releases:

```markdown
## [X.Y.Z] - YYYY-MM-DD

### Added
- New features and enhancements

### Changed
- Changes in existing functionality

### Deprecated
- Soon-to-be removed features (with migration guidance)

### Removed
- Now removed features

### Fixed
- Bug fixes and improvements

### Security
- Vulnerability fixes and security improvements
```

## Release Guidelines

- **MAJOR** version when you make incompatible API changes
- **MINOR** version when you add functionality in a backwards compatible manner
- **PATCH** version when you make backwards compatible bug fixes

For more information, see [Semantic Versioning](https://semver.org/).
