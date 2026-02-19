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
