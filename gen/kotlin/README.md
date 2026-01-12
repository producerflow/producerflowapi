# ProducerFlow API Kotlin Client

Generated Kotlin client for the ProducerFlow API using Connect-Kotlin.

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
    implementation("com.producerflow:producerflowapi:1.0.15")
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
    implementation 'com.producerflow:producerflowapi:1.0.15'
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
    <version>1.0.15</version>
  </dependency>
</dependencies>
```

## Usage

```kotlin
import com.connectrpc.ProtocolClientConfig
import com.connectrpc.extensions.GoogleJavaProtobufStrategy
import com.connectrpc.impl.ProtocolClient
import com.connectrpc.okhttp.ConnectOkHttpClient
import okhttp3.OkHttpClient
import producerflow.appointment.v1.AppointmentServiceClient
import producerflow.appointment.v1.GetAppointmentRequest

// Create HTTP client
val okHttpClient = OkHttpClient()

// Create Connect client
val client = ProtocolClient(
    httpClient = ConnectOkHttpClient(okHttpClient),
    config = ProtocolClientConfig(
        host = "https://api.producerflow.com",
        serializationStrategy = GoogleJavaProtobufStrategy()
    )
)

// Create service client
val appointmentService = AppointmentServiceClient(client)

// Make a request using coroutines
suspend fun getAppointment(appointmentId: String) {
    val request = GetAppointmentRequest.newBuilder()
        .setAppointmentId(appointmentId)
        .build()

    val response = appointmentService.getAppointment(request)
    response.success { result ->
        println("Appointment: ${result.message.appointment}")
    }
    response.failure { error ->
        println("Error: ${error.message}")
    }
}

// Or using blocking calls
fun getAppointmentBlocking(appointmentId: String) {
    val request = GetAppointmentRequest.newBuilder()
        .setAppointmentId(appointmentId)
        .build()

    val response = appointmentService.getAppointmentBlocking(request)
    // Handle response
}
```

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
