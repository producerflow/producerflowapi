# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.5] - 2025-11-28

### Added

#### ProducerService

- **License Carrier ID** – The License object now includes a `carrier_id` field to clearly identify which carrier a license belongs to.

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
