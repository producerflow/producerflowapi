# ProducerFlow API Kotlin Client

Generated Kotlin client for the ProducerFlow API using Connect-Kotlin.

## Table of Contents

- [Installation](#installation)
- [Quick Start](#quick-start)
- [Configuration](#configuration)
- [Usage Examples](#usage-examples)
- [Error Handling](#error-handling)
- [Development](#development)
- [Requirements](#requirements)

## Installation

This package is published to [GitHub Packages](https://github.com/producerflow/producerflowapi/packages).

### 1. Create a GitHub Personal Access Token

GitHub Packages requires authentication even for public packages. Create a token at [github.com/settings/tokens](https://github.com/settings/tokens) with the `read:packages` scope.

### 2. Configure Gradle credentials

Add your credentials to `~/.gradle/gradle.properties`:

```properties
gpr.user=YOUR_GITHUB_USERNAME
gpr.key=YOUR_GITHUB_TOKEN
```

### 3. Add the dependency

#### Gradle (Kotlin DSL)

```kotlin
repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/producerflow/producerflowapi")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation("com.producerflow:producerflowapi:1.0.16")
}
```

#### Gradle (Groovy)

```groovy
repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/producerflow/producerflowapi")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation 'com.producerflow:producerflowapi:1.0.16'
}
```

#### Maven

Add to your `~/.m2/settings.xml`:

```xml
<servers>
  <server>
    <id>github</id>
    <username>YOUR_GITHUB_USERNAME</username>
    <password>YOUR_GITHUB_TOKEN</password>
  </server>
</servers>
```

Then in your `pom.xml`:

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/producerflow/producerflowapi</url>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>com.producerflow</groupId>
    <artifactId>producerflowapi</artifactId>
    <version>1.0.16</version>
  </dependency>
</dependencies>
```

## Quick Start

```kotlin
package com.example

import com.connectrpc.ProtocolClientConfig
import com.connectrpc.extensions.GoogleJavaProtobufStrategy
import com.connectrpc.impl.ProtocolClient
import com.connectrpc.okhttp.ConnectOkHttpClient
import com.connectrpc.protocols.NetworkProtocol
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import com.producerflow.appointment.v1.AppointmentServiceClient
import com.producerflow.appointment.v1.GetAppointmentRequest

fun main() = runBlocking {
    // Replace with your API token
    val token = "YOUR_API_TOKEN"

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .header("X-API-Key", token)
                .build()
            chain.proceed(request)
        }
        .build()

    val protocolClient = ProtocolClient(
        httpClient = ConnectOkHttpClient(okHttpClient),
        config = ProtocolClientConfig(
            host = "https://api.producerflow.com",
            serializationStrategy = GoogleJavaProtobufStrategy(),
            networkProtocol = NetworkProtocol.CONNECT,
        )
    )

    val appointmentClient = AppointmentServiceClient(protocolClient)

    // Example: Get an appointment by ID
    val request = GetAppointmentRequest.newBuilder()
        .setAppointmentId("YOUR_APPOINTMENT_UUID")
        .build()

    val response = appointmentClient.getAppointment(request)

    response.success { appointment ->
        println("Appointment: $appointment")
    }

    response.failure { error ->
        println("Error: $error")
    }
}
```

## Configuration

### Creating the Protocol Client

All API calls require authentication via an API key. Create a reusable client factory:

```kotlin
import com.connectrpc.ProtocolClientConfig
import com.connectrpc.extensions.GoogleJavaProtobufStrategy
import com.connectrpc.impl.ProtocolClient
import com.connectrpc.okhttp.ConnectOkHttpClient
import com.connectrpc.protocols.NetworkProtocol
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

fun createProducerFlowClient(
    apiKey: String,
    baseUrl: String = "https://api.producerflow.com"
): ProtocolClient {
    val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor { chain ->
            val request = chain.request().newBuilder()
                .header("X-API-Key", apiKey)
                .build()
            chain.proceed(request)
        }
        .build()

    return ProtocolClient(
        httpClient = ConnectOkHttpClient(okHttpClient),
        config = ProtocolClientConfig(
            host = baseUrl,
            serializationStrategy = GoogleJavaProtobufStrategy(),
            networkProtocol = NetworkProtocol.CONNECT,
        )
    )
}
```

### Environment Variables

Store your API key securely using environment variables:

```kotlin
val apiKey = System.getenv("PRODUCERFLOW_API_KEY")
    ?: throw IllegalStateException("PRODUCERFLOW_API_KEY environment variable not set")

val client = createProducerFlowClient(apiKey)
```

## Usage Examples

### Creating an Agency

```kotlin
import com.producerflow.producer.v1.*

suspend fun createAgency(client: ProtocolClient) {
    val producerService = ProducerServiceClient(client)

    val request = NewAgencyRequest.newBuilder()
        .setNpn("1234567890")
        .setName("Example Insurance Agency")
        .setEmail("contact@example.com")
        .build()

    producerService.newAgency(request).apply {
        success { response ->
            println("Created agency: ${response.agency.id}")
        }
        failure { error ->
            println("Failed to create agency: ${error.message}")
        }
    }
}
```

### Listing Producers with Pagination

```kotlin
import com.producerflow.producer.v1.*

suspend fun listAllProducers(client: ProtocolClient) {
    val producerService = ProducerServiceClient(client)
    var pageToken: String? = null

    do {
        val requestBuilder = ListAgenciesRequest.newBuilder()
            .setPageSize(100)

        pageToken?.let { requestBuilder.setPageToken(it) }

        val response = producerService.listAgencies(requestBuilder.build())

        response.success { result ->
            result.agenciesList.forEach { agency ->
                println("Agency: ${agency.name} (${agency.id})")
            }
            pageToken = result.nextPageToken.takeIf { it.isNotEmpty() }
        }

        response.failure { error ->
            println("Error: ${error.message}")
            return
        }
    } while (pageToken != null)
}
```

### Requesting an Appointment

```kotlin
import com.producerflow.appointment.v1.*

suspend fun requestAppointment(client: ProtocolClient, licenseId: String, carrierId: String) {
    val appointmentService = AppointmentServiceClient(client)

    // First, check appointment fees
    val feesRequest = GetAppointmentFeesRequest.newBuilder()
        .setLicenseId(licenseId)
        .setCarrierId(carrierId)
        .build()

    appointmentService.getAppointmentFees(feesRequest).success { fees ->
        println("Appointment fee: $${fees.totalFeeAmount / 100.0}")
    }

    // Request the appointment
    val request = RequestAppointmentRequest.newBuilder()
        .setLicenseId(licenseId)
        .setCarrierId(carrierId)
        .build()

    appointmentService.requestAppointment(request).apply {
        success { response ->
            val appointment = response.appointment
            when (appointment.processingStatus) {
                ProcessingStatus.PROCESSING_STATUS_IN_PROGRESS ->
                    println("Appointment submitted to NIPR, awaiting processing")
                ProcessingStatus.PROCESSING_STATUS_APPOINTED ->
                    println("Appointment completed immediately (registry state or capacity carrier)")
                else ->
                    println("Status: ${appointment.processingStatus}")
            }
        }
        failure { error ->
            println("Failed to request appointment: ${error.message}")
        }
    }
}
```

### Using Blocking Calls

For non-coroutine contexts, use the blocking variants:

```kotlin
import com.producerflow.producer.v1.*

fun getProducerBlocking(client: ProtocolClient, producerId: String): Producer? {
    val producerService = ProducerServiceClient(client)

    val request = GetProducerRequest.newBuilder()
        .setProducerId(producerId)
        .build()

    val call = producerService.getProducerBlocking(request)
    val response = call.execute()

    return response.success { it.producer }
}
```

## Error Handling

The client returns `ResponseMessage` which can be either a success or failure:

```kotlin
import com.connectrpc.Code
import com.connectrpc.ConnectException

suspend fun handleErrors(client: ProtocolClient) {
    val producerService = ProducerServiceClient(client)

    val request = GetProducerRequest.newBuilder()
        .setProducerId("invalid-id")
        .build()

    val response = producerService.getProducer(request)

    response.success { result ->
        // Handle success
        println("Found producer: ${result.producer.name}")
    }

    response.failure { error ->
        when (error.code) {
            Code.NOT_FOUND -> println("Producer not found")
            Code.INVALID_ARGUMENT -> println("Invalid request: ${error.message}")
            Code.UNAUTHENTICATED -> println("Invalid or missing API key")
            Code.PERMISSION_DENIED -> println("Insufficient permissions")
            Code.RESOURCE_EXHAUSTED -> println("Rate limit exceeded")
            else -> println("Unexpected error: ${error.code} - ${error.message}")
        }
    }
}
```

### Common Error Codes

| Code | Description |
|------|-------------|
| `NOT_FOUND` | The requested resource does not exist |
| `INVALID_ARGUMENT` | The request contains invalid parameters |
| `UNAUTHENTICATED` | Missing or invalid API key |
| `PERMISSION_DENIED` | The API key lacks required permissions |
| `RESOURCE_EXHAUSTED` | Rate limit or quota exceeded |
| `FAILED_PRECONDITION` | The operation cannot be performed in current state |
| `INTERNAL` | Server-side error |

## Development

This package is automatically generated from Protocol Buffer definitions. Do not edit the generated files directly.

### Build

```bash
./gradlew build
```

### Test

```bash
./gradlew test
```

## Requirements

- Java 17 or higher
- Kotlin 1.9+

## Dependencies

- `com.connectrpc:connect-kotlin` - Connect-Kotlin runtime
- `com.google.protobuf:protobuf-java` - Protocol Buffers runtime

## License

Apache-2.0
