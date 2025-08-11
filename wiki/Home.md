# Introduction

Learn about building apps and integrations on top of Producerflow's API using our SDK.

<!-- markdownlint-disable MD033 -->
<div align="center">
  <img src="https://framerusercontent.com/images/Sqd0oOCQAQNo92PjocWBUmSjERA.png" alt="Producerflow"/>
</div>
<br/>
<!-- markdownlint-enable MD033 -->

Welcome to [Producerflow](https://www.producerflow.com)'s developer docs, where you can learn more about Producerflow's API and developer tooling. You can use Producerflow's API to build everything from light scripts to complete integrations for the tool you're working on.

## Table of Contents

### Quick Start

- [🚀 Getting Started with gRPC](https://github.com/producerflow/producerflowapi/wiki/Getting-started-with-grpc) - Complete guide to using our gRPC API
- [🔐 Authentication](https://github.com/producerflow/producerflowapi/wiki/Authentication) - How to obtain and use API keys

### Core Documentation

#### API Reference

- [📖 API Reference](https://github.com/producerflow/producerflowapi/wiki/API-Reference) - Complete protocol documentation
  - [Appointment Service](https://github.com/producerflow/producerflowapi/wiki/API-Reference#producerflow-appointment-v1-appointment-proto)
  - [Producer Service](https://github.com/producerflow/producerflowapi/wiki/API-Reference#producerflow-producer-v1-producer-proto)

#### Webhooks & Real-time Updates

- [🔔 Webhooks](https://github.com/producerflow/producerflowapi/wiki/Webhooks) - Real-time notifications and event handling
  - [Webhook Integration Overview](https://github.com/producerflow/producerflowapi/wiki/Webhooks#3-webhook-integration-overview)
  - [Event Types & Mechanics](https://github.com/producerflow/producerflowapi/wiki/Webhooks#5-event-mechanics-and-types)
  - [Payload Structure](https://github.com/producerflow/producerflowapi/wiki/Webhooks#6-webhook-payload)
  - [Security & Signature Verification](Webhooks.md#10-signature-verification)
- [📋 Appointment Events](https://github.com/producerflow/producerflowapi/wiki/Appointment-events) - Detailed appointment webhook documentation

#### Appointment Features

- [⚕️ Appointment Operational Status](https://github.com/producerflow/producerflowapi/wiki/Appointment-Operational-Status) - Daily monitoring of appointment health and compliance
  - [Status Types & Risk Reasons](https://github.com/producerflow/producerflowapi/wiki/Appointment-Operational-Status#2-operational-status-types)
  - [API Integration](https://github.com/producerflow/producerflowapi/wiki/Appointment-Operational-Status#4-retrieving-operational-status)
  - [Webhook Notifications](https://github.com/producerflow/producerflowapi/wiki/Appointment-Operational-Status#5-webhook-notifications)

---

## Detailed Documentation

### [🚀 Getting Started with gRPC](https://github.com/producerflow/producerflowapi/wiki/Getting-started-with-grpc)

- **Overview** - gRPC API introduction
- **Connect** - Multi-protocol support
  - Production-grade simplicity
  - Seamless multi-protocol support
- **Generated SDKs** - Language-specific implementations
- **Go SDK** - Getting started with Go
- **TypeScript SDK** - Getting started with TypeScript/JavaScript
- **Additional Language Support** - Other language options

### [🔐 Authentication](https://github.com/producerflow/producerflowapi/wiki/Authentication)

- **Obtaining an API Key** - Step-by-step guide
- **Using API Keys in Go** - Go implementation examples
  - Using a Custom HTTP Transport
- **Using API Keys in TypeScript** - TypeScript/JavaScript examples
  - Using Connect Interceptors
  - For Browser Environments
- **Security Best Practices** - API key security guidelines

### [🔔 Webhooks](https://github.com/producerflow/producerflowapi/wiki/Webhooks)

- **Introduction** - Webhook overview
- **System Overview** - How webhooks work
- **Webhook Integration Overview** - Integration requirements
  - Key Requirements
- **Webhook Configuration** - Setup instructions
- **Event Mechanics and Types** - Understanding webhook events
  - Creation Events
  - Update Events
  - Resync Events
- **Webhook Payload** - Data structure and format
  - Common Payload Structure
  - Webhook Types and Event Types
    - Agency Webhooks
    - Producer Webhooks
    - Contact Webhooks
  - Key Elements
    - Required Fields
    - Identifier Fields
    - Origin Field Values
  - Data Sections
    - Agency Data Sections
    - Producer Data Sections
    - Contact Data
  - Schema Validation
  - Integration Best Practices
- **Response and Retries** - Handling webhook responses
- **Error Handling and Troubleshooting** - Common issues and solutions
- **Security Considerations** - Webhook security
- **Signature Verification** - Verifying webhook authenticity
- **Frequently Asked Questions** - Common questions and answers

### [📖 API Reference](https://github.com/producerflow/producerflowapi/wiki/API-Reference)

Complete protocol documentation with detailed message definitions:

#### Appointment Service (`producerflow/appointment/v1/appointment.proto`)

- **Messages:** Appointment, GetAppointmentFeesRequest/Response, GetAppointmentRequest/Response, GetTerminationFeesRequest/Response, License, ListAppointmentsRequest/Response, ListEligibleLicensesRequest/Response, RequestAppointmentRequest/Response, TerminateAppointmentRequest/Response
- **Enums:** AppointmentType, EligibilityStatus, ProcessingStatus
- **Services:** AppointmentService

#### Producer Service (`producerflow/producer/v1/producer.proto`)

- **Core Messages:** Address, Agency (with nested types), Producer (with nested NIPR data), NewContact/NewProducer
- **Request/Response Pairs:** ApproveProducer, CreateAgencyOnboardingURL, GetAgencyAndProducers, GetAgencyFiles, GetProducer (with lookup options), ListNewProducers, LookupNPNByFEIN, NewAgency/NewContact/NewProducer, NewContacts/NewProducers (bulk operations), RejectProducer, ResyncAgency/ResyncProducer, SetExternalID, StopSyncAgencyWithNIPR/StopSyncProducerWithNIPR, SyncAgencyWithNIPR/SyncProducerWithNIPR, UpdateProducer, ValidateAgencyNPN/ValidateProducerNPN
- **Enums:** EntityType, ProducerOnboardingState, Various status and type enums
- **Services:** ProducerService

---

## Additional Resources

### Webhooks Directory

The `/webhooks` directory contains additional webhook-related resources:

- **Examples** - Sample webhook payloads for different event types
- **Schema** - JSON schema files for validation
- **Documentation** - Supplementary webhook documentation

### Generated Code

The `/gen` directory contains generated code from Protocol Buffer definitions:

- **Go** - Generated Go code for gRPC services
- **TypeScript** - Generated TypeScript/JavaScript code
