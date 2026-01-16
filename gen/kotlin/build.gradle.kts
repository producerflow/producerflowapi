plugins {
    kotlin("jvm") version "2.1.10"
    `maven-publish`
    `java-library`
}

group = "com.producerflow"
version = project.findProperty("version") ?: "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "buf"
        url = uri("https://buf.build/gen/maven")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    withJavadocJar()
    withSourcesJar()
}

kotlin {
    jvmToolchain(17)
}

sourceSets {
    main {
        java {
            srcDir("src/main/java")
        }
        kotlin {
            srcDir("src/main/kotlin")
        }
    }
}

dependencies {
    // Connect-Kotlin runtime (alternative to gRPC)
    api("com.connectrpc:connect-kotlin:0.7.4")
    api("com.connectrpc:connect-kotlin-okhttp:0.7.4")
    api("com.connectrpc:connect-kotlin-google-java-ext:0.7.4")

    // Protobuf runtime
    api("com.google.protobuf:protobuf-java:4.28.3")
    api("com.google.protobuf:protobuf-kotlin:4.28.3")

    // gRPC runtime
    api("io.grpc:grpc-stub:1.70.0")
    api("io.grpc:grpc-protobuf:1.70.0")
    api("io.grpc:grpc-kotlin-stub:1.4.1")

    // gRPC transport (choose one based on your use case)
    implementation("io.grpc:grpc-netty-shaded:1.70.0")
    implementation("io.grpc:grpc-okhttp:1.70.0")

    // Google common protos (google.type.*, google.api.*, etc.)
    api("com.google.api.grpc:proto-google-common-protos:2.63.1")
    api("com.google.api.grpc:grpc-google-common-protos:2.63.1")

    // OkHttp for HTTP transport
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // Kotlin coroutines (required for gRPC-Kotlin)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")

    // Required for gRPC generated code
    compileOnly("org.apache.tomcat:annotations-api:6.0.53")

    // Testing
    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.1")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            artifactId = "producerflowapi"

            pom {
                name.set("ProducerFlow API Kotlin Client")
                description.set("Generated Kotlin client for the ProducerFlow API using Connect-Kotlin")
                url.set("https://github.com/producerflow/producerflowapi")

                licenses {
                    license {
                        name.set("Apache License 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0")
                    }
                }

                developers {
                    developer {
                        id.set("producerflow")
                        name.set("ProducerFlow")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/producerflow/producerflowapi.git")
                    developerConnection.set("scm:git:ssh://github.com:producerflow/producerflowapi.git")
                    url.set("https://github.com/producerflow/producerflowapi")
                }
            }
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/producerflow/producerflowapi")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: project.findProperty("gpr.user") as String?
                password = System.getenv("GITHUB_TOKEN") ?: project.findProperty("gpr.key") as String?
            }
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

// Handle duplicate files from multiple protobuf plugins generating the same imports
tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<Javadoc> {
    // Suppress Javadoc warnings for protobuf-generated code
    (options as StandardJavadocDocletOptions).addStringOption("Xdoclint:none", "-quiet")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
    }
}
