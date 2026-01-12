# Producerflow API

[![GoDoc](https://godoc.org/github.com/producerflow/producerflowapi?status.svg)](https://godoc.org/github.com/producerflow/producerflowapi)
[![npm version](https://img.shields.io/npm/v/@producerflow/producerflowapi.svg)](https://www.npmjs.com/package/@producerflow/producerflowapi)
[![Go Build Test](https://github.com/producerflow/producerflowapi/actions/workflows/go-build.yml/badge.svg)](https://github.com/producerflow/producerflowapi/actions/workflows/go-build.yml)
[![Kotlin Build Test](https://github.com/producerflow/producerflowapi/actions/workflows/kotlin-build.yml/badge.svg)](https://github.com/producerflow/producerflowapi/actions/workflows/kotlin-build.yml)
[![TypeScript Build Test](https://github.com/producerflow/producerflowapi/actions/workflows/ts-build.yml/badge.svg)](https://github.com/producerflow/producerflowapi/actions/workflows/ts-build.yml)
[![Proto Validation](https://github.com/producerflow/producerflowapi/actions/workflows/proto-validation.yml/badge.svg)](https://github.com/producerflow/producerflowapi/actions/workflows/proto-validation.yml)
[![SOC 2 Compliant](https://img.shields.io/badge/SOC%202-Compliant-green.svg)](https://www.producerflow.com/)

> **For Producerflow clients seeking seamless API integration with their services**

Trusted by insurance companies of all sizes to manage onboarding, licensing, appointments, and ensure compliance—all in one platform. This comprehensive API service provides gRPC and Connect endpoints for managing producer workflows and data flows, built with modern protocol buffer definitions and generating client libraries for multiple languages.

<!-- markdownlint-disable MD033 -->
<div align="center">
  <img src="https://framerusercontent.com/images/Sqd0oOCQAQNo92PjocWBUmSjERA.png" alt="Producerflow"/>
</div>
<!-- markdownlint-enable MD033 -->

## Table of Contents

- [Producerflow API](#producerflow-api)
  - [Table of Contents](#table-of-contents)
  - [Quickstart](#quickstart)
    - [API Endpoints](#api-endpoints)
    - [API Token Generation](#api-token-generation)
  - [Installation \& Usage](#installation--usage)
    - [Using Protocol Buffer Files](#using-protocol-buffer-files)
    - [Using Pre-Generated Clients](#using-pre-generated-clients)
      - [Go Client](#go-client)
      - [TypeScript Client](#typescript-client)
  - [Client Libraries](#client-libraries)
    - [Generated Client Directories](#generated-client-directories)
    - [Supported Languages](#supported-languages)
    - [Navigation Guide](#navigation-guide)
  - [Build/Generation Instructions](#buildgeneration-instructions)
    - [Generating Official Clients](#generating-official-clients)
    - [Prerequisites](#prerequisites)
    - [Custom Generation for Other Languages](#custom-generation-for-other-languages)
  - [Glossary](#glossary)
  - [Security](#security)
  - [Deprecation Policy](#deprecation-policy)
  - [Contact/Support](#contactsupport)
  - [License](#license)
  - [Versioning](#versioning)

## Quickstart

> **⚠️ Notice**  
> Pull requests are disabled for this repository. For support and questions, please contact our team directly.

### API Endpoints

The Producerflow API is available at the following endpoints:

- **Production**: `https://api.producerflow.com`
- **UAT (User Acceptance Testing)**: `https://api.uat.producerflow.com`

Use the production endpoint for live applications and the UAT endpoint for testing and development purposes.

### API Token Generation

To get started with the Producerflow API, you'll need to generate an API token:

1. Log into your Producerflow account.
2. Navigate to API Keys in your account settings.
3. Generate a new API key with appropriate expiration date.
4. Securely store your API key for use in API requests.

For detailed API documentation and examples, visit our [comprehensive API documentation](https://github.com/producerflow/producerflowapi/wiki).

## Installation & Usage

### Using Protocol Buffer Files

The raw `.proto` files are located in the `producerflow/` directory and can be used to generate clients for any language supported by Protocol Buffers.

```bash
# Install buf and necessary plugins for your target language
# Then generate clients using the proto files
buf generate
```

### Using Pre-Generated Clients

#### Go Client

```bash
go get github.com/producerflow/producerflowapi@latest
```

#### TypeScript Client

```bash
npm install @producerflow/producerflowapi
```

For detailed installation and usage instructions, see the respective client library documentation.

## Client Libraries

### Generated Client Directories

- **[Go Client Library](/gen/go/)** - Complete Go implementation with gRPC and Connect support
- **[TypeScript Client Library](/gen/ts/)** - Full TypeScript/JavaScript client with type definitions

### Supported Languages

The monorepo currently provides official support for:

- **Go** (1.21+)
- **TypeScript/JavaScript** (Node.js 18+)

For other languages, use the Protocol Buffer definitions in `producerflow/` with the official Protocol Buffer compiler and language-specific plugins. Refer to the [Buf documentation](https://buf.build/docs) for comprehensive language support.

### Navigation Guide

- **API Definitions**: Start with `producerflow/producer/v1/producer.proto`
- **Go Integration**: Use code in `gen/go/` directory
- **TypeScript Integration**: Use code in `gen/ts/` directory
- **Documentation**: Reference [comprehensive documentation](https://github.com/producerflow/producerflowapi/wiki) for detailed API guides

## Build/Generation Instructions

### Generating Official Clients

To regenerate the Go and TypeScript clients within the monorepo:

```bash
# From the repository root
buf generate
```

This command will:

1. Validate all Protocol Buffer definitions
2. Generate Go client code in `gen/go/`
3. Generate TypeScript client code in `gen/ts/`

### Prerequisites

- [Buf CLI](https://buf.build/docs/installation) installed
- Go 1.21+ (for Go generation)
- Node.js 18+ (for TypeScript generation)

### Custom Generation for Other Languages

For languages not officially supported by this monorepo, refer to the [Buf documentation](https://buf.build/docs) for comprehensive code generation guides and plugin configurations.

## Glossary

*This section will be populated with domain-specific terms and definitions.*

<!-- TODO: Add domain terms and definitions -->

## Security

For security concerns, vulnerability reporting, and our comprehensive security policies, please see our [Security Policy](SECURITY.md).

For immediate security issues, contact: [support@producerflow.com](mailto:support@producerflow.com)

## Deprecation Policy

This API follows a structured deprecation approach to ensure backward compatibility and smooth transitions. For detailed information about our deprecation timelines, migration guides, and policy, see [DEPRECATION.md](DEPRECATION.md).

## Contact/Support

For technical support, integration assistance, or general inquiries:

**Email**: [support@producerflow.com](mailto:support@producerflow.com)

**Documentation**: Visit our [comprehensive documentation](https://github.com/producerflow/producerflowapi/wiki) for detailed guides and examples.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Versioning

This project follows [Semantic Versioning](https://semver.org/). See the [CHANGELOG.md](CHANGELOG.md) for release history and detailed version information.

---

*© 2025 Producerflow. All rights reserved.*
