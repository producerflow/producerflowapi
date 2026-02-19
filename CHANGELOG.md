# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.19] - 2026-02-19

### Added

#### ProducerService

- **Agency Organization Relationship** - New field indicating whether an agency is the main or a related agency within an organization
  - `organization_relationship` field added to `Agency` message (field 16)
  - `organization_relationship` field added to `AgencySummary` message (field 12)
  - New `AgencyOrganizationRelationship` enum with values:
    - `AGENCY_ORGANIZATION_RELATIONSHIP_UNSPECIFIED` - Agency does not belong to any organization
    - `AGENCY_ORGANIZATION_RELATIONSHIP_MAIN` - The primary agency that owns or manages the organization
    - `AGENCY_ORGANIZATION_RELATIONSHIP_RELATED` - An agency that is part of the organization but not the primary owner
  - Field is always populated based on the agency's actual organization membership

- **Generic Signature Template ID** - New field to support multiple e-signature providers in onboarding URL generation
  - `signature_template_id` field added to `GetOnboardingURLRequest` (field 16)
  - Replaces the provider-specific `docusign_template_id` field
  - The system automatically detects the configured e-signature provider (Docusign or Adobe Sign) from tenant settings
  - Fixes a bug where onboarding URLs were generated with Docusign even when the tenant had not configured Docusign

### Changed

#### ProducerService

- **Enhanced NPN Documentation** - Improved NPN field documentation across `ProducerService` and `AppointmentService`
  - Clarified NPN format (1-10 digit numeric string), validation rules, and NIPR references for all NPN fields on agencies, principals, and producers
  - Documented NPN behavior for sole proprietors (principal NPN used instead of agency NPN)

#### AppointmentService

- **Enhanced Appointment Documentation** - Improved documentation for the managed `Appointment` message and its fields
  - Added descriptions for all `Appointment` message fields including `appointment_id`, `license_number`, `agency_id`, `producer_id`, `carrier_name`, `appointment_type`, `processing_status`, `effective_at`, `terminated_at`, `updated_at`, and `operational_status`
  - Carrier identifier fields (NPN, FEIN, NAIC CoCode) now include format examples and reference links

### Deprecated

#### ProducerService

- **`docusign_template_id` in `GetOnboardingURLRequest`** - Deprecated in favor of the new `signature_template_id` field
  - `docusign_template_id` (field 4) will continue to work for backward compatibility
  - Migrate to `signature_template_id` (field 16) to support both Docusign and Adobe Sign providers

- Regenerated client libraries with latest proto changes

---

## [1.0.18] - 2026-02-11

### Changed

#### ProducerService

- **Onboarding Status in UpdateProducer** - Added `onboarding_status` field to `UpdateProducerRequest` to allow updating a producer's onboarding status
  - When set, the `onboarding_status_updated_at` timestamp is automatically updated
  - If not provided, the onboarding status remains unchanged
- Regenerated client libraries with latest proto changes

---

## [1.0.17] - 2026-01-22

### Added

#### ProducerService

- **IVANS Account Support in Agency Creation** - New capability to provide IVANS account information when creating agencies
  - `ivans_account` field added to `NewAgencyRequest.Agency` message
  - Supports `account_number`, `ams_software`, `ams_version`, and `mailbox_number` fields
  - All IVANS fields are required when providing IVANS account information
  - Enables electronic communication setup with carriers during agency onboarding

- **IVANS Account Updates** - New capability to update IVANS account information for existing agencies
  - `ivans_account` field added to `UpdateAgencyRequest.Agency` message
  - Supports partial updates - only specified fields are updated
  - Update behavior:
    - Not provided: existing IVANS account preserved unchanged
    - Provided with all fields: IVANS account created or completely replaced
    - Partial fields: only specified fields updated

- **Principal Tenant Additional Questions** - Agency principals can now have tenant-specific custom questions
  - `tenant_additional_questions` field added to `Agency.Principal` message
  - Allows capturing custom onboarding questions and responses for the principal
  - Consistent key-value format matching agency and producer custom questions

### Changed

#### ProducerService

- **Enhanced SyncProducerWithNIPR Documentation** - Improved error handling and billing documentation
  - Added billing information noting external NIPR API calls that may incur charges:
    - NPN validation lookup
    - Producer license data sync (if not already synced)
    - PDB alerts subscription (if enabled for tenant)
  - Refined error codes documentation:
    - `NOT_FOUND` now clarifies when NPN cannot be found in NIPR (error message: "producer NPN could not be found in NIPR")
    - `INVALID_ARGUMENT` simplified to only cover missing NPN cases
    - Added `INTERNAL` error code for unexpected errors during NIPR lookup/sync

- **Enhanced SyncAgencyWithNIPR Documentation** - Improved billing documentation for agency sync operations
  - Added billing information noting external NIPR API calls that may incur charges:
    - NPN validation lookup
    - Agency license data sync (if not already synced)
    - PDB alerts subscription (if enabled for tenant)
    - Additional per-producer calls when `sync_all_producers` is true

---

## [1.0.16] - 2026-01-16

### Added

#### Kotlin Client Library

- **gRPC Support** - Full gRPC stub generation for traditional gRPC usage
  - Java gRPC stubs with `BlockingStub`, `FutureStub`, and async `Stub` variants
  - Kotlin coroutine-based gRPC stubs for async operations
  - Stubs available for `ProducerService` and `AppointmentService`
  - Example: `ProducerServiceGrpc.newBlockingStub(channel)`

- **Kotlin Protobuf DSL Builders** - Idiomatic Kotlin syntax for building protobuf messages
  - DSL builders for all message types
  - Example: `producer { id = "123"; name = "John" }`

- **New Dependencies** - Additional runtime dependencies for gRPC support
  - `io.grpc:grpc-stub:1.70.0`
  - `io.grpc:grpc-protobuf:1.70.0`
  - `io.grpc:grpc-kotlin-stub:1.4.1`
  - `io.grpc:grpc-netty-shaded:1.70.0` (server/JVM transport)
  - `io.grpc:grpc-okhttp:1.70.0` (mobile/Android transport)
  - `com.google.protobuf:protobuf-kotlin:4.28.3`

### Changed

#### Kotlin Client Library

- **Kotlin Version** - Updated from 2.1.0 to 2.1.10
- **Code Organization** - Reorganized generated code structure
  - Java files now in `src/main/java`
  - Kotlin files now in `src/main/kotlin`

---

## [1.0.15] - 2026-01-09

### Fixed

#### ProducerService

- **Sole Proprietor Field in GetAgencyAndProducers** - Fixed missing `is_sole_proprietor` field in response
  - `is_sole_proprietor` field now correctly populated in `GetAgencyAndProducers` endpoint response

#### AppointmentService

- **Synthetic Appointment Termination Documentation** - Synthetic appointments can now be terminated via API
  - Updated `TerminateAppointment` documentation to indicate synthetic appointments are supported
  - Synthetic appointment terminations are processed automatically and immediately
  - No NIPR interaction required for synthetic appointment terminations

---

## [1.0.14] - 2026-01-08

### Added

#### ProducerService

- **Sole Proprietor Indicator for Agencies** - New field to identify agencies operating as sole proprietors
  - `is_sole_proprietor` field added to `Agency` message (returned by `GetAgency` and `GetAgencyAndProducers` endpoints)
  - `true`: Individual producer operating as their own agency (ENTITY_TYPE_SOLE_PROPRIETOR)
  - `false`: Standard agency with multiple producers (ENTITY_TYPE_AGENCY)
  - Enables differentiation between sole proprietor agencies and standard multi-producer agencies

---

## [1.0.13] - 2026-01-07

### Added

#### ProducerService

- **Onboarding Status Tracking** - New fields to track producer progression through the onboarding workflow
  - `onboarding_status` field added to `Producer` message (returned by `GetProducer` and `GetAgencyAndProducers` endpoints)
  - `onboarding_status_updated_at` timestamp field for tracking status changes
  - New `OnboardingStatus` enum with values:
    - `ONBOARDING_STATUS_ONBOARDED` - Producer has completed the initial onboarding process
    - `ONBOARDING_STATUS_APPROVED` - Producer has been approved and verified
    - `ONBOARDING_STATUS_READY_TO_QUOTE` - Producer is fully ready to quote and sell insurance products
    - `ONBOARDING_STATUS_TERMINATED` - Producer has been terminated and is no longer active
  - Only populated when the tenant has enabled the onboarding status feature

#### Webhook System

- **Onboarding Status in Webhook Payloads** - Producer webhooks now include onboarding status tracking
  - `onboarding_status` field added to producer webhook payloads
  - `onboarding_status_updated_at` timestamp included in webhook events
  - Enables real-time notifications when producer onboarding status changes

---

## [1.0.12] - 2026-01-07

### Added

#### ProducerService

- **External ID in API Responses** - External identifiers now included in agency and producer responses
  - `external_id` field added to `Agency` message (returned by `GetAgency` and `GetAgencyAndProducers` endpoints)
  - `external_id` field added to `Producer` message (returned by `GetProducer` and `GetAgencyAndProducers` endpoints)
  - Enables easier correlation with external systems without additional lookups

### Changed

#### ProducerService

- **Phone Fields Now Optional for Producers and Contacts** - Phone number fields for producers and contacts can now be omitted
  - Affects: `Producer.phone` and `Contact.phone` fields
  - Improves flexibility for records where phone numbers are not available or not required

---

## [1.0.11] - 2025-12-22

### Added

#### ProducerService

- **GetAgency Endpoint** - New RPC for retrieving detailed agency information
  - `GetAgency` RPC added to fetch agency details by agency ID or external tenant ID

- **Organization Data in Agency Endpoints** - Agency responses now include organization information
  - `organization` field added to `Agency` message
  - Available in `GetAgency` and `GetAgencyAndProducers` endpoints

---

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
