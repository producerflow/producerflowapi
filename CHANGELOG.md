# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

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
