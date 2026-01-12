plugins {
    kotlin("jvm") version "2.1.0"
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

dependencies {
    // Connect-Kotlin runtime
    api("com.connectrpc:connect-kotlin:0.7.4")
    api("com.connectrpc:connect-kotlin-okhttp:0.7.4")
    api("com.connectrpc:connect-kotlin-google-java-ext:0.7.4")

    // Protobuf runtime (standard Java for server usage)
    api("com.google.protobuf:protobuf-java:4.28.3")

    // Google common protos (google.type.*, google.api.*, etc.)
    api("com.google.api.grpc:proto-google-common-protos:2.63.1")

    // OkHttp for HTTP transport
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    // Kotlin coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")

    // Protovalidate
    implementation("build.buf.gen:bufbuild_protovalidate_grpc_kotlin:1.5.0.1.20230720203033.35806a9a8e6e")

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

tasks.withType<Javadoc> {
    // Suppress Javadoc warnings for protobuf-generated code
    (options as StandardJavadocDocletOptions).addStringOption("Xdoclint:none", "-quiet")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.add("-Xjsr305=strict")
    }
}
