package com.producerflow.producer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ProducerService provides a comprehensive API for managing insurance
 * producers and agencies. This service simplifies producer and agency
 * onboarding, data synchronization, and integration with the National Insurance
 * Producer Registry (NIPR).
 * Key capabilities:
 * - Producer and agency onboarding with self-service URLs
 * - Automatic synchronization of license, appointment, and regulatory data from NIPR
 * - NPN (National Producer Number) validation and lookup
 * - Multi-location management for agencies
 * - Integration with NIPR PDB Gateway, PDB Alerts, and NPN Lookup services
 * NIPR Integration:
 * This service automatically fetches and maintains up-to-date licensing
 * information, carrier appointments, and regulatory actions from NIPR. Most
 * NIPR sync operations are billable and count against your monthly unique NPN
 * quota. Enable PDB Alerts synchronization to receive automatic daily updates
 * and reduce manual sync costs.
 * Authentication:
 * All endpoints require API key authentication provided via the Authorization header.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: producerflow/producer/v1/producer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProducerServiceGrpc {

  private ProducerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "producerflow.producer.v1.ProducerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest,
      com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse> getCreateAgencyOnboardingURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAgencyOnboardingURL",
      requestType = com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest.class,
      responseType = com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest,
      com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse> getCreateAgencyOnboardingURLMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest, com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse> getCreateAgencyOnboardingURLMethod;
    if ((getCreateAgencyOnboardingURLMethod = ProducerServiceGrpc.getCreateAgencyOnboardingURLMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getCreateAgencyOnboardingURLMethod = ProducerServiceGrpc.getCreateAgencyOnboardingURLMethod) == null) {
          ProducerServiceGrpc.getCreateAgencyOnboardingURLMethod = getCreateAgencyOnboardingURLMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest, com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAgencyOnboardingURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("CreateAgencyOnboardingURL"))
              .build();
        }
      }
    }
    return getCreateAgencyOnboardingURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateProducerOnboardingURLRequest,
      com.producerflow.producer.v1.CreateProducerOnboardingURLResponse> getCreateProducerOnboardingURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProducerOnboardingURL",
      requestType = com.producerflow.producer.v1.CreateProducerOnboardingURLRequest.class,
      responseType = com.producerflow.producer.v1.CreateProducerOnboardingURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateProducerOnboardingURLRequest,
      com.producerflow.producer.v1.CreateProducerOnboardingURLResponse> getCreateProducerOnboardingURLMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateProducerOnboardingURLRequest, com.producerflow.producer.v1.CreateProducerOnboardingURLResponse> getCreateProducerOnboardingURLMethod;
    if ((getCreateProducerOnboardingURLMethod = ProducerServiceGrpc.getCreateProducerOnboardingURLMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getCreateProducerOnboardingURLMethod = ProducerServiceGrpc.getCreateProducerOnboardingURLMethod) == null) {
          ProducerServiceGrpc.getCreateProducerOnboardingURLMethod = getCreateProducerOnboardingURLMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.CreateProducerOnboardingURLRequest, com.producerflow.producer.v1.CreateProducerOnboardingURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProducerOnboardingURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateProducerOnboardingURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateProducerOnboardingURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("CreateProducerOnboardingURL"))
              .build();
        }
      }
    }
    return getCreateProducerOnboardingURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewAgencyRequest,
      com.producerflow.producer.v1.NewAgencyResponse> getNewAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewAgency",
      requestType = com.producerflow.producer.v1.NewAgencyRequest.class,
      responseType = com.producerflow.producer.v1.NewAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewAgencyRequest,
      com.producerflow.producer.v1.NewAgencyResponse> getNewAgencyMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewAgencyRequest, com.producerflow.producer.v1.NewAgencyResponse> getNewAgencyMethod;
    if ((getNewAgencyMethod = ProducerServiceGrpc.getNewAgencyMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getNewAgencyMethod = ProducerServiceGrpc.getNewAgencyMethod) == null) {
          ProducerServiceGrpc.getNewAgencyMethod = getNewAgencyMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.NewAgencyRequest, com.producerflow.producer.v1.NewAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("NewAgency"))
              .build();
        }
      }
    }
    return getNewAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgenciesRequest,
      com.producerflow.producer.v1.ListAgenciesResponse> getListAgenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgencies",
      requestType = com.producerflow.producer.v1.ListAgenciesRequest.class,
      responseType = com.producerflow.producer.v1.ListAgenciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgenciesRequest,
      com.producerflow.producer.v1.ListAgenciesResponse> getListAgenciesMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgenciesRequest, com.producerflow.producer.v1.ListAgenciesResponse> getListAgenciesMethod;
    if ((getListAgenciesMethod = ProducerServiceGrpc.getListAgenciesMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getListAgenciesMethod = ProducerServiceGrpc.getListAgenciesMethod) == null) {
          ProducerServiceGrpc.getListAgenciesMethod = getListAgenciesMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ListAgenciesRequest, com.producerflow.producer.v1.ListAgenciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListAgenciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListAgenciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ListAgencies"))
              .build();
        }
      }
    }
    return getListAgenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListOrganizationsRequest,
      com.producerflow.producer.v1.ListOrganizationsResponse> getListOrganizationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrganizations",
      requestType = com.producerflow.producer.v1.ListOrganizationsRequest.class,
      responseType = com.producerflow.producer.v1.ListOrganizationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListOrganizationsRequest,
      com.producerflow.producer.v1.ListOrganizationsResponse> getListOrganizationsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListOrganizationsRequest, com.producerflow.producer.v1.ListOrganizationsResponse> getListOrganizationsMethod;
    if ((getListOrganizationsMethod = ProducerServiceGrpc.getListOrganizationsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getListOrganizationsMethod = ProducerServiceGrpc.getListOrganizationsMethod) == null) {
          ProducerServiceGrpc.getListOrganizationsMethod = getListOrganizationsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ListOrganizationsRequest, com.producerflow.producer.v1.ListOrganizationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrganizations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListOrganizationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListOrganizationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ListOrganizations"))
              .build();
        }
      }
    }
    return getListOrganizationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetOrganizationRequest,
      com.producerflow.producer.v1.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = com.producerflow.producer.v1.GetOrganizationRequest.class,
      responseType = com.producerflow.producer.v1.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetOrganizationRequest,
      com.producerflow.producer.v1.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetOrganizationRequest, com.producerflow.producer.v1.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = ProducerServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getGetOrganizationMethod = ProducerServiceGrpc.getGetOrganizationMethod) == null) {
          ProducerServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.GetOrganizationRequest, com.producerflow.producer.v1.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateOrganizationRequest,
      com.producerflow.producer.v1.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = com.producerflow.producer.v1.CreateOrganizationRequest.class,
      responseType = com.producerflow.producer.v1.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateOrganizationRequest,
      com.producerflow.producer.v1.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateOrganizationRequest, com.producerflow.producer.v1.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = ProducerServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getCreateOrganizationMethod = ProducerServiceGrpc.getCreateOrganizationMethod) == null) {
          ProducerServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.CreateOrganizationRequest, com.producerflow.producer.v1.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewProducerRequest,
      com.producerflow.producer.v1.NewProducerResponse> getNewProducerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewProducer",
      requestType = com.producerflow.producer.v1.NewProducerRequest.class,
      responseType = com.producerflow.producer.v1.NewProducerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewProducerRequest,
      com.producerflow.producer.v1.NewProducerResponse> getNewProducerMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewProducerRequest, com.producerflow.producer.v1.NewProducerResponse> getNewProducerMethod;
    if ((getNewProducerMethod = ProducerServiceGrpc.getNewProducerMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getNewProducerMethod = ProducerServiceGrpc.getNewProducerMethod) == null) {
          ProducerServiceGrpc.getNewProducerMethod = getNewProducerMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.NewProducerRequest, com.producerflow.producer.v1.NewProducerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewProducer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewProducerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewProducerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("NewProducer"))
              .build();
        }
      }
    }
    return getNewProducerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewProducersRequest,
      com.producerflow.producer.v1.NewProducersResponse> getNewProducersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewProducers",
      requestType = com.producerflow.producer.v1.NewProducersRequest.class,
      responseType = com.producerflow.producer.v1.NewProducersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewProducersRequest,
      com.producerflow.producer.v1.NewProducersResponse> getNewProducersMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewProducersRequest, com.producerflow.producer.v1.NewProducersResponse> getNewProducersMethod;
    if ((getNewProducersMethod = ProducerServiceGrpc.getNewProducersMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getNewProducersMethod = ProducerServiceGrpc.getNewProducersMethod) == null) {
          ProducerServiceGrpc.getNewProducersMethod = getNewProducersMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.NewProducersRequest, com.producerflow.producer.v1.NewProducersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewProducers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewProducersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewProducersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("NewProducers"))
              .build();
        }
      }
    }
    return getNewProducersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyAndProducersRequest,
      com.producerflow.producer.v1.GetAgencyAndProducersResponse> getGetAgencyAndProducersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgencyAndProducers",
      requestType = com.producerflow.producer.v1.GetAgencyAndProducersRequest.class,
      responseType = com.producerflow.producer.v1.GetAgencyAndProducersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyAndProducersRequest,
      com.producerflow.producer.v1.GetAgencyAndProducersResponse> getGetAgencyAndProducersMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyAndProducersRequest, com.producerflow.producer.v1.GetAgencyAndProducersResponse> getGetAgencyAndProducersMethod;
    if ((getGetAgencyAndProducersMethod = ProducerServiceGrpc.getGetAgencyAndProducersMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getGetAgencyAndProducersMethod = ProducerServiceGrpc.getGetAgencyAndProducersMethod) == null) {
          ProducerServiceGrpc.getGetAgencyAndProducersMethod = getGetAgencyAndProducersMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.GetAgencyAndProducersRequest, com.producerflow.producer.v1.GetAgencyAndProducersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgencyAndProducers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetAgencyAndProducersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetAgencyAndProducersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("GetAgencyAndProducers"))
              .build();
        }
      }
    }
    return getGetAgencyAndProducersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyRequest,
      com.producerflow.producer.v1.GetAgencyResponse> getGetAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgency",
      requestType = com.producerflow.producer.v1.GetAgencyRequest.class,
      responseType = com.producerflow.producer.v1.GetAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyRequest,
      com.producerflow.producer.v1.GetAgencyResponse> getGetAgencyMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyRequest, com.producerflow.producer.v1.GetAgencyResponse> getGetAgencyMethod;
    if ((getGetAgencyMethod = ProducerServiceGrpc.getGetAgencyMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getGetAgencyMethod = ProducerServiceGrpc.getGetAgencyMethod) == null) {
          ProducerServiceGrpc.getGetAgencyMethod = getGetAgencyMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.GetAgencyRequest, com.producerflow.producer.v1.GetAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("GetAgency"))
              .build();
        }
      }
    }
    return getGetAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetProducerRequest,
      com.producerflow.producer.v1.GetProducerResponse> getGetProducerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducer",
      requestType = com.producerflow.producer.v1.GetProducerRequest.class,
      responseType = com.producerflow.producer.v1.GetProducerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetProducerRequest,
      com.producerflow.producer.v1.GetProducerResponse> getGetProducerMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetProducerRequest, com.producerflow.producer.v1.GetProducerResponse> getGetProducerMethod;
    if ((getGetProducerMethod = ProducerServiceGrpc.getGetProducerMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getGetProducerMethod = ProducerServiceGrpc.getGetProducerMethod) == null) {
          ProducerServiceGrpc.getGetProducerMethod = getGetProducerMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.GetProducerRequest, com.producerflow.producer.v1.GetProducerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetProducerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetProducerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("GetProducer"))
              .build();
        }
      }
    }
    return getGetProducerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyFilesRequest,
      com.producerflow.producer.v1.GetAgencyFilesResponse> getGetAgencyFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAgencyFiles",
      requestType = com.producerflow.producer.v1.GetAgencyFilesRequest.class,
      responseType = com.producerflow.producer.v1.GetAgencyFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyFilesRequest,
      com.producerflow.producer.v1.GetAgencyFilesResponse> getGetAgencyFilesMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.GetAgencyFilesRequest, com.producerflow.producer.v1.GetAgencyFilesResponse> getGetAgencyFilesMethod;
    if ((getGetAgencyFilesMethod = ProducerServiceGrpc.getGetAgencyFilesMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getGetAgencyFilesMethod = ProducerServiceGrpc.getGetAgencyFilesMethod) == null) {
          ProducerServiceGrpc.getGetAgencyFilesMethod = getGetAgencyFilesMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.GetAgencyFilesRequest, com.producerflow.producer.v1.GetAgencyFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAgencyFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetAgencyFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.GetAgencyFilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("GetAgencyFiles"))
              .build();
        }
      }
    }
    return getGetAgencyFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateProducerRequest,
      com.producerflow.producer.v1.UpdateProducerResponse> getUpdateProducerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProducer",
      requestType = com.producerflow.producer.v1.UpdateProducerRequest.class,
      responseType = com.producerflow.producer.v1.UpdateProducerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateProducerRequest,
      com.producerflow.producer.v1.UpdateProducerResponse> getUpdateProducerMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateProducerRequest, com.producerflow.producer.v1.UpdateProducerResponse> getUpdateProducerMethod;
    if ((getUpdateProducerMethod = ProducerServiceGrpc.getUpdateProducerMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getUpdateProducerMethod = ProducerServiceGrpc.getUpdateProducerMethod) == null) {
          ProducerServiceGrpc.getUpdateProducerMethod = getUpdateProducerMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.UpdateProducerRequest, com.producerflow.producer.v1.UpdateProducerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProducer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateProducerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateProducerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("UpdateProducer"))
              .build();
        }
      }
    }
    return getUpdateProducerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateAgencyRequest,
      com.producerflow.producer.v1.UpdateAgencyResponse> getUpdateAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgency",
      requestType = com.producerflow.producer.v1.UpdateAgencyRequest.class,
      responseType = com.producerflow.producer.v1.UpdateAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateAgencyRequest,
      com.producerflow.producer.v1.UpdateAgencyResponse> getUpdateAgencyMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateAgencyRequest, com.producerflow.producer.v1.UpdateAgencyResponse> getUpdateAgencyMethod;
    if ((getUpdateAgencyMethod = ProducerServiceGrpc.getUpdateAgencyMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getUpdateAgencyMethod = ProducerServiceGrpc.getUpdateAgencyMethod) == null) {
          ProducerServiceGrpc.getUpdateAgencyMethod = getUpdateAgencyMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.UpdateAgencyRequest, com.producerflow.producer.v1.UpdateAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("UpdateAgency"))
              .build();
        }
      }
    }
    return getUpdateAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewContactRequest,
      com.producerflow.producer.v1.NewContactResponse> getNewContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewContact",
      requestType = com.producerflow.producer.v1.NewContactRequest.class,
      responseType = com.producerflow.producer.v1.NewContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewContactRequest,
      com.producerflow.producer.v1.NewContactResponse> getNewContactMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewContactRequest, com.producerflow.producer.v1.NewContactResponse> getNewContactMethod;
    if ((getNewContactMethod = ProducerServiceGrpc.getNewContactMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getNewContactMethod = ProducerServiceGrpc.getNewContactMethod) == null) {
          ProducerServiceGrpc.getNewContactMethod = getNewContactMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.NewContactRequest, com.producerflow.producer.v1.NewContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("NewContact"))
              .build();
        }
      }
    }
    return getNewContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewContactsRequest,
      com.producerflow.producer.v1.NewContactsResponse> getNewContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewContacts",
      requestType = com.producerflow.producer.v1.NewContactsRequest.class,
      responseType = com.producerflow.producer.v1.NewContactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewContactsRequest,
      com.producerflow.producer.v1.NewContactsResponse> getNewContactsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.NewContactsRequest, com.producerflow.producer.v1.NewContactsResponse> getNewContactsMethod;
    if ((getNewContactsMethod = ProducerServiceGrpc.getNewContactsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getNewContactsMethod = ProducerServiceGrpc.getNewContactsMethod) == null) {
          ProducerServiceGrpc.getNewContactsMethod = getNewContactsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.NewContactsRequest, com.producerflow.producer.v1.NewContactsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewContactsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.NewContactsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("NewContacts"))
              .build();
        }
      }
    }
    return getNewContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgencyContactsRequest,
      com.producerflow.producer.v1.ListAgencyContactsResponse> getListAgencyContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgencyContacts",
      requestType = com.producerflow.producer.v1.ListAgencyContactsRequest.class,
      responseType = com.producerflow.producer.v1.ListAgencyContactsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgencyContactsRequest,
      com.producerflow.producer.v1.ListAgencyContactsResponse> getListAgencyContactsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgencyContactsRequest, com.producerflow.producer.v1.ListAgencyContactsResponse> getListAgencyContactsMethod;
    if ((getListAgencyContactsMethod = ProducerServiceGrpc.getListAgencyContactsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getListAgencyContactsMethod = ProducerServiceGrpc.getListAgencyContactsMethod) == null) {
          ProducerServiceGrpc.getListAgencyContactsMethod = getListAgencyContactsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ListAgencyContactsRequest, com.producerflow.producer.v1.ListAgencyContactsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgencyContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListAgencyContactsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListAgencyContactsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ListAgencyContacts"))
              .build();
        }
      }
    }
    return getListAgencyContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateContactRequest,
      com.producerflow.producer.v1.UpdateContactResponse> getUpdateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateContact",
      requestType = com.producerflow.producer.v1.UpdateContactRequest.class,
      responseType = com.producerflow.producer.v1.UpdateContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateContactRequest,
      com.producerflow.producer.v1.UpdateContactResponse> getUpdateContactMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateContactRequest, com.producerflow.producer.v1.UpdateContactResponse> getUpdateContactMethod;
    if ((getUpdateContactMethod = ProducerServiceGrpc.getUpdateContactMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getUpdateContactMethod = ProducerServiceGrpc.getUpdateContactMethod) == null) {
          ProducerServiceGrpc.getUpdateContactMethod = getUpdateContactMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.UpdateContactRequest, com.producerflow.producer.v1.UpdateContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("UpdateContact"))
              .build();
        }
      }
    }
    return getUpdateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.SetExternalIDRequest,
      com.producerflow.producer.v1.SetExternalIDResponse> getSetExternalIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetExternalID",
      requestType = com.producerflow.producer.v1.SetExternalIDRequest.class,
      responseType = com.producerflow.producer.v1.SetExternalIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.SetExternalIDRequest,
      com.producerflow.producer.v1.SetExternalIDResponse> getSetExternalIDMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.SetExternalIDRequest, com.producerflow.producer.v1.SetExternalIDResponse> getSetExternalIDMethod;
    if ((getSetExternalIDMethod = ProducerServiceGrpc.getSetExternalIDMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getSetExternalIDMethod = ProducerServiceGrpc.getSetExternalIDMethod) == null) {
          ProducerServiceGrpc.getSetExternalIDMethod = getSetExternalIDMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.SetExternalIDRequest, com.producerflow.producer.v1.SetExternalIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetExternalID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.SetExternalIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.SetExternalIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("SetExternalID"))
              .build();
        }
      }
    }
    return getSetExternalIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ValidateProducerNPNRequest,
      com.producerflow.producer.v1.ValidateProducerNPNResponse> getValidateProducerNPNMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateProducerNPN",
      requestType = com.producerflow.producer.v1.ValidateProducerNPNRequest.class,
      responseType = com.producerflow.producer.v1.ValidateProducerNPNResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ValidateProducerNPNRequest,
      com.producerflow.producer.v1.ValidateProducerNPNResponse> getValidateProducerNPNMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ValidateProducerNPNRequest, com.producerflow.producer.v1.ValidateProducerNPNResponse> getValidateProducerNPNMethod;
    if ((getValidateProducerNPNMethod = ProducerServiceGrpc.getValidateProducerNPNMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getValidateProducerNPNMethod = ProducerServiceGrpc.getValidateProducerNPNMethod) == null) {
          ProducerServiceGrpc.getValidateProducerNPNMethod = getValidateProducerNPNMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ValidateProducerNPNRequest, com.producerflow.producer.v1.ValidateProducerNPNResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateProducerNPN"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ValidateProducerNPNRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ValidateProducerNPNResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ValidateProducerNPN"))
              .build();
        }
      }
    }
    return getValidateProducerNPNMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ValidateAgencyNPNRequest,
      com.producerflow.producer.v1.ValidateAgencyNPNResponse> getValidateAgencyNPNMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateAgencyNPN",
      requestType = com.producerflow.producer.v1.ValidateAgencyNPNRequest.class,
      responseType = com.producerflow.producer.v1.ValidateAgencyNPNResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ValidateAgencyNPNRequest,
      com.producerflow.producer.v1.ValidateAgencyNPNResponse> getValidateAgencyNPNMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ValidateAgencyNPNRequest, com.producerflow.producer.v1.ValidateAgencyNPNResponse> getValidateAgencyNPNMethod;
    if ((getValidateAgencyNPNMethod = ProducerServiceGrpc.getValidateAgencyNPNMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getValidateAgencyNPNMethod = ProducerServiceGrpc.getValidateAgencyNPNMethod) == null) {
          ProducerServiceGrpc.getValidateAgencyNPNMethod = getValidateAgencyNPNMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ValidateAgencyNPNRequest, com.producerflow.producer.v1.ValidateAgencyNPNResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateAgencyNPN"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ValidateAgencyNPNRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ValidateAgencyNPNResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ValidateAgencyNPN"))
              .build();
        }
      }
    }
    return getValidateAgencyNPNMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.LookupNPNByFEINRequest,
      com.producerflow.producer.v1.LookupNPNByFEINResponse> getLookupNPNByFEINMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LookupNPNByFEIN",
      requestType = com.producerflow.producer.v1.LookupNPNByFEINRequest.class,
      responseType = com.producerflow.producer.v1.LookupNPNByFEINResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.LookupNPNByFEINRequest,
      com.producerflow.producer.v1.LookupNPNByFEINResponse> getLookupNPNByFEINMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.LookupNPNByFEINRequest, com.producerflow.producer.v1.LookupNPNByFEINResponse> getLookupNPNByFEINMethod;
    if ((getLookupNPNByFEINMethod = ProducerServiceGrpc.getLookupNPNByFEINMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getLookupNPNByFEINMethod = ProducerServiceGrpc.getLookupNPNByFEINMethod) == null) {
          ProducerServiceGrpc.getLookupNPNByFEINMethod = getLookupNPNByFEINMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.LookupNPNByFEINRequest, com.producerflow.producer.v1.LookupNPNByFEINResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LookupNPNByFEIN"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.LookupNPNByFEINRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.LookupNPNByFEINResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("LookupNPNByFEIN"))
              .build();
        }
      }
    }
    return getLookupNPNByFEINMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ResyncProducerRequest,
      com.producerflow.producer.v1.ResyncProducerResponse> getResyncProducerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResyncProducer",
      requestType = com.producerflow.producer.v1.ResyncProducerRequest.class,
      responseType = com.producerflow.producer.v1.ResyncProducerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ResyncProducerRequest,
      com.producerflow.producer.v1.ResyncProducerResponse> getResyncProducerMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ResyncProducerRequest, com.producerflow.producer.v1.ResyncProducerResponse> getResyncProducerMethod;
    if ((getResyncProducerMethod = ProducerServiceGrpc.getResyncProducerMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getResyncProducerMethod = ProducerServiceGrpc.getResyncProducerMethod) == null) {
          ProducerServiceGrpc.getResyncProducerMethod = getResyncProducerMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ResyncProducerRequest, com.producerflow.producer.v1.ResyncProducerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResyncProducer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ResyncProducerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ResyncProducerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ResyncProducer"))
              .build();
        }
      }
    }
    return getResyncProducerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ResyncAgencyRequest,
      com.producerflow.producer.v1.ResyncAgencyResponse> getResyncAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResyncAgency",
      requestType = com.producerflow.producer.v1.ResyncAgencyRequest.class,
      responseType = com.producerflow.producer.v1.ResyncAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ResyncAgencyRequest,
      com.producerflow.producer.v1.ResyncAgencyResponse> getResyncAgencyMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ResyncAgencyRequest, com.producerflow.producer.v1.ResyncAgencyResponse> getResyncAgencyMethod;
    if ((getResyncAgencyMethod = ProducerServiceGrpc.getResyncAgencyMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getResyncAgencyMethod = ProducerServiceGrpc.getResyncAgencyMethod) == null) {
          ProducerServiceGrpc.getResyncAgencyMethod = getResyncAgencyMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ResyncAgencyRequest, com.producerflow.producer.v1.ResyncAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResyncAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ResyncAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ResyncAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ResyncAgency"))
              .build();
        }
      }
    }
    return getResyncAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.SyncProducerWithNIPRRequest,
      com.producerflow.producer.v1.SyncProducerWithNIPRResponse> getSyncProducerWithNIPRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncProducerWithNIPR",
      requestType = com.producerflow.producer.v1.SyncProducerWithNIPRRequest.class,
      responseType = com.producerflow.producer.v1.SyncProducerWithNIPRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.SyncProducerWithNIPRRequest,
      com.producerflow.producer.v1.SyncProducerWithNIPRResponse> getSyncProducerWithNIPRMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.SyncProducerWithNIPRRequest, com.producerflow.producer.v1.SyncProducerWithNIPRResponse> getSyncProducerWithNIPRMethod;
    if ((getSyncProducerWithNIPRMethod = ProducerServiceGrpc.getSyncProducerWithNIPRMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getSyncProducerWithNIPRMethod = ProducerServiceGrpc.getSyncProducerWithNIPRMethod) == null) {
          ProducerServiceGrpc.getSyncProducerWithNIPRMethod = getSyncProducerWithNIPRMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.SyncProducerWithNIPRRequest, com.producerflow.producer.v1.SyncProducerWithNIPRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncProducerWithNIPR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.SyncProducerWithNIPRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.SyncProducerWithNIPRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("SyncProducerWithNIPR"))
              .build();
        }
      }
    }
    return getSyncProducerWithNIPRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.SyncAgencyWithNIPRRequest,
      com.producerflow.producer.v1.SyncAgencyWithNIPRResponse> getSyncAgencyWithNIPRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SyncAgencyWithNIPR",
      requestType = com.producerflow.producer.v1.SyncAgencyWithNIPRRequest.class,
      responseType = com.producerflow.producer.v1.SyncAgencyWithNIPRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.SyncAgencyWithNIPRRequest,
      com.producerflow.producer.v1.SyncAgencyWithNIPRResponse> getSyncAgencyWithNIPRMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.SyncAgencyWithNIPRRequest, com.producerflow.producer.v1.SyncAgencyWithNIPRResponse> getSyncAgencyWithNIPRMethod;
    if ((getSyncAgencyWithNIPRMethod = ProducerServiceGrpc.getSyncAgencyWithNIPRMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getSyncAgencyWithNIPRMethod = ProducerServiceGrpc.getSyncAgencyWithNIPRMethod) == null) {
          ProducerServiceGrpc.getSyncAgencyWithNIPRMethod = getSyncAgencyWithNIPRMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.SyncAgencyWithNIPRRequest, com.producerflow.producer.v1.SyncAgencyWithNIPRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SyncAgencyWithNIPR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.SyncAgencyWithNIPRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.SyncAgencyWithNIPRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("SyncAgencyWithNIPR"))
              .build();
        }
      }
    }
    return getSyncAgencyWithNIPRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest,
      com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse> getStopSyncProducerWithNIPRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopSyncProducerWithNIPR",
      requestType = com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest.class,
      responseType = com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest,
      com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse> getStopSyncProducerWithNIPRMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest, com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse> getStopSyncProducerWithNIPRMethod;
    if ((getStopSyncProducerWithNIPRMethod = ProducerServiceGrpc.getStopSyncProducerWithNIPRMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getStopSyncProducerWithNIPRMethod = ProducerServiceGrpc.getStopSyncProducerWithNIPRMethod) == null) {
          ProducerServiceGrpc.getStopSyncProducerWithNIPRMethod = getStopSyncProducerWithNIPRMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest, com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopSyncProducerWithNIPR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("StopSyncProducerWithNIPR"))
              .build();
        }
      }
    }
    return getStopSyncProducerWithNIPRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest,
      com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse> getStopSyncAgencyWithNIPRMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopSyncAgencyWithNIPR",
      requestType = com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest.class,
      responseType = com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest,
      com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse> getStopSyncAgencyWithNIPRMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest, com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse> getStopSyncAgencyWithNIPRMethod;
    if ((getStopSyncAgencyWithNIPRMethod = ProducerServiceGrpc.getStopSyncAgencyWithNIPRMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getStopSyncAgencyWithNIPRMethod = ProducerServiceGrpc.getStopSyncAgencyWithNIPRMethod) == null) {
          ProducerServiceGrpc.getStopSyncAgencyWithNIPRMethod = getStopSyncAgencyWithNIPRMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest, com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopSyncAgencyWithNIPR"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("StopSyncAgencyWithNIPR"))
              .build();
        }
      }
    }
    return getStopSyncAgencyWithNIPRMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateProducerUploadURLRequest,
      com.producerflow.producer.v1.CreateProducerUploadURLResponse> getCreateProducerUploadURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProducerUploadURL",
      requestType = com.producerflow.producer.v1.CreateProducerUploadURLRequest.class,
      responseType = com.producerflow.producer.v1.CreateProducerUploadURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateProducerUploadURLRequest,
      com.producerflow.producer.v1.CreateProducerUploadURLResponse> getCreateProducerUploadURLMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.CreateProducerUploadURLRequest, com.producerflow.producer.v1.CreateProducerUploadURLResponse> getCreateProducerUploadURLMethod;
    if ((getCreateProducerUploadURLMethod = ProducerServiceGrpc.getCreateProducerUploadURLMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getCreateProducerUploadURLMethod = ProducerServiceGrpc.getCreateProducerUploadURLMethod) == null) {
          ProducerServiceGrpc.getCreateProducerUploadURLMethod = getCreateProducerUploadURLMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.CreateProducerUploadURLRequest, com.producerflow.producer.v1.CreateProducerUploadURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProducerUploadURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateProducerUploadURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.CreateProducerUploadURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("CreateProducerUploadURL"))
              .build();
        }
      }
    }
    return getCreateProducerUploadURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.AddAgencyLocationsRequest,
      com.producerflow.producer.v1.AddAgencyLocationsResponse> getAddAgencyLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAgencyLocations",
      requestType = com.producerflow.producer.v1.AddAgencyLocationsRequest.class,
      responseType = com.producerflow.producer.v1.AddAgencyLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.AddAgencyLocationsRequest,
      com.producerflow.producer.v1.AddAgencyLocationsResponse> getAddAgencyLocationsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.AddAgencyLocationsRequest, com.producerflow.producer.v1.AddAgencyLocationsResponse> getAddAgencyLocationsMethod;
    if ((getAddAgencyLocationsMethod = ProducerServiceGrpc.getAddAgencyLocationsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getAddAgencyLocationsMethod = ProducerServiceGrpc.getAddAgencyLocationsMethod) == null) {
          ProducerServiceGrpc.getAddAgencyLocationsMethod = getAddAgencyLocationsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.AddAgencyLocationsRequest, com.producerflow.producer.v1.AddAgencyLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAgencyLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.AddAgencyLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.AddAgencyLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("AddAgencyLocations"))
              .build();
        }
      }
    }
    return getAddAgencyLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.RemoveAgencyLocationsRequest,
      com.producerflow.producer.v1.RemoveAgencyLocationsResponse> getRemoveAgencyLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveAgencyLocations",
      requestType = com.producerflow.producer.v1.RemoveAgencyLocationsRequest.class,
      responseType = com.producerflow.producer.v1.RemoveAgencyLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.RemoveAgencyLocationsRequest,
      com.producerflow.producer.v1.RemoveAgencyLocationsResponse> getRemoveAgencyLocationsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.RemoveAgencyLocationsRequest, com.producerflow.producer.v1.RemoveAgencyLocationsResponse> getRemoveAgencyLocationsMethod;
    if ((getRemoveAgencyLocationsMethod = ProducerServiceGrpc.getRemoveAgencyLocationsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getRemoveAgencyLocationsMethod = ProducerServiceGrpc.getRemoveAgencyLocationsMethod) == null) {
          ProducerServiceGrpc.getRemoveAgencyLocationsMethod = getRemoveAgencyLocationsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.RemoveAgencyLocationsRequest, com.producerflow.producer.v1.RemoveAgencyLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveAgencyLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.RemoveAgencyLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.RemoveAgencyLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("RemoveAgencyLocations"))
              .build();
        }
      }
    }
    return getRemoveAgencyLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgencyLocationsRequest,
      com.producerflow.producer.v1.ListAgencyLocationsResponse> getListAgencyLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgencyLocations",
      requestType = com.producerflow.producer.v1.ListAgencyLocationsRequest.class,
      responseType = com.producerflow.producer.v1.ListAgencyLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgencyLocationsRequest,
      com.producerflow.producer.v1.ListAgencyLocationsResponse> getListAgencyLocationsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.ListAgencyLocationsRequest, com.producerflow.producer.v1.ListAgencyLocationsResponse> getListAgencyLocationsMethod;
    if ((getListAgencyLocationsMethod = ProducerServiceGrpc.getListAgencyLocationsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getListAgencyLocationsMethod = ProducerServiceGrpc.getListAgencyLocationsMethod) == null) {
          ProducerServiceGrpc.getListAgencyLocationsMethod = getListAgencyLocationsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.ListAgencyLocationsRequest, com.producerflow.producer.v1.ListAgencyLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgencyLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListAgencyLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.ListAgencyLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("ListAgencyLocations"))
              .build();
        }
      }
    }
    return getListAgencyLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.AssignProducerToLocationsRequest,
      com.producerflow.producer.v1.AssignProducerToLocationsResponse> getAssignProducerToLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignProducerToLocations",
      requestType = com.producerflow.producer.v1.AssignProducerToLocationsRequest.class,
      responseType = com.producerflow.producer.v1.AssignProducerToLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.AssignProducerToLocationsRequest,
      com.producerflow.producer.v1.AssignProducerToLocationsResponse> getAssignProducerToLocationsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.AssignProducerToLocationsRequest, com.producerflow.producer.v1.AssignProducerToLocationsResponse> getAssignProducerToLocationsMethod;
    if ((getAssignProducerToLocationsMethod = ProducerServiceGrpc.getAssignProducerToLocationsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getAssignProducerToLocationsMethod = ProducerServiceGrpc.getAssignProducerToLocationsMethod) == null) {
          ProducerServiceGrpc.getAssignProducerToLocationsMethod = getAssignProducerToLocationsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.AssignProducerToLocationsRequest, com.producerflow.producer.v1.AssignProducerToLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignProducerToLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.AssignProducerToLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.AssignProducerToLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("AssignProducerToLocations"))
              .build();
        }
      }
    }
    return getAssignProducerToLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.UnassignProducerFromLocationsRequest,
      com.producerflow.producer.v1.UnassignProducerFromLocationsResponse> getUnassignProducerFromLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignProducerFromLocations",
      requestType = com.producerflow.producer.v1.UnassignProducerFromLocationsRequest.class,
      responseType = com.producerflow.producer.v1.UnassignProducerFromLocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.UnassignProducerFromLocationsRequest,
      com.producerflow.producer.v1.UnassignProducerFromLocationsResponse> getUnassignProducerFromLocationsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.UnassignProducerFromLocationsRequest, com.producerflow.producer.v1.UnassignProducerFromLocationsResponse> getUnassignProducerFromLocationsMethod;
    if ((getUnassignProducerFromLocationsMethod = ProducerServiceGrpc.getUnassignProducerFromLocationsMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getUnassignProducerFromLocationsMethod = ProducerServiceGrpc.getUnassignProducerFromLocationsMethod) == null) {
          ProducerServiceGrpc.getUnassignProducerFromLocationsMethod = getUnassignProducerFromLocationsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.UnassignProducerFromLocationsRequest, com.producerflow.producer.v1.UnassignProducerFromLocationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignProducerFromLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UnassignProducerFromLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UnassignProducerFromLocationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("UnassignProducerFromLocations"))
              .build();
        }
      }
    }
    return getUnassignProducerFromLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateAgencyLocationRequest,
      com.producerflow.producer.v1.UpdateAgencyLocationResponse> getUpdateAgencyLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAgencyLocation",
      requestType = com.producerflow.producer.v1.UpdateAgencyLocationRequest.class,
      responseType = com.producerflow.producer.v1.UpdateAgencyLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateAgencyLocationRequest,
      com.producerflow.producer.v1.UpdateAgencyLocationResponse> getUpdateAgencyLocationMethod() {
    io.grpc.MethodDescriptor<com.producerflow.producer.v1.UpdateAgencyLocationRequest, com.producerflow.producer.v1.UpdateAgencyLocationResponse> getUpdateAgencyLocationMethod;
    if ((getUpdateAgencyLocationMethod = ProducerServiceGrpc.getUpdateAgencyLocationMethod) == null) {
      synchronized (ProducerServiceGrpc.class) {
        if ((getUpdateAgencyLocationMethod = ProducerServiceGrpc.getUpdateAgencyLocationMethod) == null) {
          ProducerServiceGrpc.getUpdateAgencyLocationMethod = getUpdateAgencyLocationMethod =
              io.grpc.MethodDescriptor.<com.producerflow.producer.v1.UpdateAgencyLocationRequest, com.producerflow.producer.v1.UpdateAgencyLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAgencyLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateAgencyLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.producer.v1.UpdateAgencyLocationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProducerServiceMethodDescriptorSupplier("UpdateAgencyLocation"))
              .build();
        }
      }
    }
    return getUpdateAgencyLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProducerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProducerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProducerServiceStub>() {
        @java.lang.Override
        public ProducerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProducerServiceStub(channel, callOptions);
        }
      };
    return ProducerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProducerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProducerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProducerServiceBlockingStub>() {
        @java.lang.Override
        public ProducerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProducerServiceBlockingStub(channel, callOptions);
        }
      };
    return ProducerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProducerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProducerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProducerServiceFutureStub>() {
        @java.lang.Override
        public ProducerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProducerServiceFutureStub(channel, callOptions);
        }
      };
    return ProducerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ProducerService provides a comprehensive API for managing insurance
   * producers and agencies. This service simplifies producer and agency
   * onboarding, data synchronization, and integration with the National Insurance
   * Producer Registry (NIPR).
   * Key capabilities:
   * - Producer and agency onboarding with self-service URLs
   * - Automatic synchronization of license, appointment, and regulatory data from NIPR
   * - NPN (National Producer Number) validation and lookup
   * - Multi-location management for agencies
   * - Integration with NIPR PDB Gateway, PDB Alerts, and NPN Lookup services
   * NIPR Integration:
   * This service automatically fetches and maintains up-to-date licensing
   * information, carrier appointments, and regulatory actions from NIPR. Most
   * NIPR sync operations are billable and count against your monthly unique NPN
   * quota. Enable PDB Alerts synchronization to receive automatic daily updates
   * and reduce manual sync costs.
   * Authentication:
   * All endpoints require API key authentication provided via the Authorization header.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateAgencyOnboardingURL generates a secure, pre-filled URL for agency
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links that can be
     * shared with agencies. The URL encodes agency defaults, tenant context, and
     * optional pre-filled information to streamline the onboarding experience.
     * All fields in the request are optional. Provide as much or as little
     * information as available - any missing data will be collected through the
     * onboarding flow.
     * Typical Workflow:
     * 1. Generate onboarding URL with optional pre-filled data (agency name, NPN,
     *    principal info)
     * 2. Share URL with agency contact via email or portal
     * 3. Agency completes onboarding form through the URL
     * 4. System validates NPN with NIPR and creates agency record
     * 5. Optionally sync with NIPR to fetch licenses and appointments
     * Validation Rules:
     * All fields in the request are optional. The system generates valid URLs
     * even with an empty request. When fields are provided:
     * - entity_type: Must be ENTITY_TYPE_SOLE_PROPRIETOR (1), ENTITY_TYPE_AGENCY (2),
     *   or ENTITY_TYPE_ASK_DURING_ONBOARDING (3). This is the only endpoint where
     *   ENTITY_TYPE_ASK_DURING_ONBOARDING is valid.
     * - email: Must be a valid email format if provided
     * - npn: Must be a valid NPN format (2-10 digits) if provided. Note that NPN
     *   validation against NIPR occurs during onboarding, not during URL generation.
     * - fein: Must be exactly 9 digits if provided
     * - organization_id: Must be a valid organization ID belonging to your tenant if provided
     * - principal.email: Must be a valid email format if provided
     * - principal.npn: Must be a valid NPN format (2-10 digits) if provided
     * - principal.tenant_id: Maximum 255 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the agency for
     * self-service onboarding.
     * </pre>
     */
    default void createAgencyOnboardingURL(com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAgencyOnboardingURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateProducerOnboardingURL generates a secure, pre-filled URL for producer
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links for individual
     * producers joining an existing agency. The URL can include optional
     * pre-filled data like NPN, name, email, and address to reduce manual data
     * entry.
     * The producer must be associated with an existing agency. Use
     * CreateAgencyOnboardingURL if you need to onboard an agency and its
     * principal together.
     * Typical Workflow:
     * 1. Generate producer onboarding URL with agency_id and optional pre-filled data
     * 2. Share URL with producer via email
     * 3. Producer completes onboarding form through the URL
     * 4. System validates NPN with NIPR and associates producer with agency
     * 5. Optionally sync with NIPR to fetch producer licenses and appointments
     * Validation Rules:
     * - agency_id: Required. must be a valid UUID of an agency belonging
     *   to your tenant.
     * - producer_data: All fields are optional. When provided:
     *   - npn: Must be a valid NPN format (1-10 characters). Note that NPN validation
     *     against NIPR occurs during onboarding, not during URL generation.
     *   - email: Must be a valid email format if provided
     *   - mailing_address.state: Must be exactly 2 characters (state code) if provided
     *   - mailing_address.zip: Must be 1-10 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the producer for
     * self-service onboarding.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Invalid NPN provided (not found in NIPR)
     * </pre>
     */
    default void createProducerOnboardingURL(com.producerflow.producer.v1.CreateProducerOnboardingURLRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateProducerOnboardingURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProducerOnboardingURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewAgency creates a new agency with principal and optional additional producers.
     * This is the programmatic alternative to CreateAgencyOnboardingURL - use
     * this when you want to create agencies directly via API instead of through a
     * self-service form.
     * Entity Type Rules:
     * - ENTITY_TYPE_SOLE_PROPRIETOR: Individual producer operating as their own agency.
     *   Cannot have an agency NPN. Only the principal is created.
     * - ENTITY_TYPE_AGENCY: Standard insurance agency with multiple producers.
     *   Must provide either an NPN or FEIN. Can have multiple producers beyond the principal.
     * NIPR Validation and Sync:
     * The system performs free NIPR API lookups to validate NPNs before
     * creation. If sync_with_nipr is true (or tenant default), the system
     * performs paid NIPR EntityInfo lookups to fetch complete license, appointment,
     * and regulatory data.
     * Validation Performed:
     * - Required fields are present and valid
     * - Email addresses are unique within tenant
     * - Agency NPN exists in NIPR (if provided)
     * - Principal NPN exists in NIPR
     * - Entity type rules are followed
     * - Principal and subsequent producers last names must match NIPR records for the given NPN
     * Validation Rules:
     * Proto validation (format checks):
     * - agency: Required field containing all agency information
     * - agency.name: Required, must be non-empty
     * - agency.email: Required, must be a valid email format
     * - agency.phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     * - agency.entity_type: Required, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or
     *   ENTITY_TYPE_AGENCY (2). ENTITY_TYPE_ASK_DURING_ONBOARDING is NOT valid here.
     * - agency.fein: Optional, if provided must be exactly 9 digits. Required for
     *   ENTITY_TYPE_AGENCY if NPN is not provided.
     * - agency.principal: Required, contains principal producer information
     *   - principal.first_name: Required, must be non-empty
     *   - principal.last_name: Required, must be non-empty
     *   - principal.email: Required, must be a valid email format
     *   - principal.npn: Required, must be 1-10 characters
     *   - principal.phone: Optional, if provided must match E.164 pattern
     *   - principal.tenant_id: Optional, maximum 255 characters
     * - agency.bank_account (optional, if provided all subfields are required):
     *   - account_number: 8-17 characters
     *   - routing_number: Exactly 9 characters
     *   - account_type: Required, must be CHECKING (1) or SAVINGS (2)
     *   - account_holder_name: Required, must be non-empty
     * - agency.eo_info (optional, if provided):
     *   - carrier: Required, must be non-empty
     *   - expiration_date: Required, must be in the future
     *   - coverage_amount: Required, must be non-empty
     *   - effective_date: Required
     *   - per_occurrence: Required, must be non-empty
     * - agency.business_hours (optional, if provided):
     *   - timezone: Required, must be non-empty
     *   - business_hours: Required, at least one entry
     *     - week_days: Required, 1-7 days
     *     - opening_time: Required
     *     - closing_time: Required
     * - agency.producers: Optional list of additional producers (see NewProducer validation)
     * - agency.points_of_contact (optional, for each contact):
     *   - email: Required, must be a valid email format
     *   - role: Required
     * - agency.root_organization_id: Optional, if provided must be 1-36 characters
     * - agency.locations: Optional, maximum 100 locations
     * Business logic validation:
     * - agency.email: Must be unique within the tenant
     * - agency.npn: If provided, must exist in NIPR (validated via free NIPR lookup)
     * - principal.email: Must be unique within the tenant
     * - principal.npn: Must exist in NIPR (validated via free NIPR lookup)
     * - All producer emails must be unique within the tenant
     * Returns:
     * IDs of the created agency, principal, optional producers, and locations (if provided).
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields, entity type rule violations, or
     *   NPN not found in NIPR
     * - ALREADY_EXISTS: Email or NPN already registered in your tenant
     * </pre>
     */
    default void newAgency(com.producerflow.producer.v1.NewAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewAgencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgencies retrieves a paginated list of agencies associated with the tenant.
     * This endpoint provides comprehensive agency listing with powerful filtering
     * capabilities to efficiently manage and search through large numbers of
     * agencies. Each agency in the response includes summary information for
     * quick overview without the full NIPR data.
     * Filtering Capabilities:
     * - Organization: Filter agencies belonging to a specific organization
     * - Search: Free-text search across agency name, NPN, and email
     * - Agency Type: Filter by internal (tenant) vs external agencies
     * - Entity Type: Filter by sole proprietor vs standard agency
     * - NIPR Sync Status: Filter by synchronization state (active, failing, pending, disabled)
     * The response uses cursor-based pagination for efficient data retrieval:
     * - Default page size is 50 if not specified
     * - Maximum page size is 200
     * - Results are ordered by creation date, most recent first
     * - Use the next_page_token to retrieve subsequent pages
     * Validation Rules:
     * All fields are optional filters:
     * - organization_id: If provided, must be a valid UUID format
     * - search_query: Optional free-text search string (case-insensitive, partial matching)
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * - agency_type: If provided, must be AGENCY_TYPE_INTERNAL (1) or AGENCY_TYPE_EXTERNAL (2)
     * - entity_type: If provided, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or ENTITY_TYPE_AGENCY (2)
     * - nipr_sync_statuses: Array of sync states to filter by (ACTIVE, FAILING, PENDING, DISABLED)
     * Returns:
     * A paginated list of AgencySummary objects containing essential agency
     * information without full NIPR data. Use GetAgencyAndProducers for complete
     * agency details including NIPR data.
     * </pre>
     */
    default void listAgencies(com.producerflow.producer.v1.ListAgenciesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgenciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgenciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListOrganizations retrieves all organizations accessible to your tenant.
     * Organizations represent logical groupings or hierarchical structures for
     * managing agencies. They enable better organization of agencies into business
     * units, networks, or aggregator relationships. Each
     * organization can contain multiple agencies, allowing for hierarchical
     * management and reporting across your insurance distribution network.
     * Not all tenants use organizations - this list may be empty if your tenant
     * doesn't have organizational hierarchies enabled.
     * Validation Rules:
     * Proto validation (format checks):
     * All fields are optional:
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * Returns:
     * A list of all organizations accessible to your tenant, including their IDs,
     * names and external identifiers. Organizations are
     * returned in alphabetical order by name for consistent presentation.
     * </pre>
     */
    default void listOrganizations(com.producerflow.producer.v1.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrganizationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetOrganization retrieves comprehensive details about a specific organization.
     * This endpoint returns complete organization information including all
     * agencies assigned to it. For each agency, it provides summary data including
     * appointment overview statistics and NIPR synchronization status. This allows
     * you to understand the full scope of an organization's agency network in a
     * single API call.
     * Validation Rules:
     * Proto validation (format checks):
     * - organization_id: Required, must be a valid UUID format
     * Returns:
     * Complete organization details including all assigned agencies with their
     * appointment overviews and sync statuses.
     * Common Error Codes:
     * - NOT_FOUND: Organization doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void getOrganization(com.producerflow.producer.v1.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization for the authenticated tenant.
     * Organizations are top-level groupings used to organize agencies within your
     * tenant. They can represent business units, regions, or any logical grouping
     * that makes sense for your operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - name: Required, must be non-empty
     * - external_id: Optional, your system's identifier for the organization
     * - email: Optional, contact email for the organization
     * Business logic validation:
     * - name: Must be unique within the tenant (case-insensitive)
     * Returns:
     * The UUID of the newly created organization, which can be used to assign
     * agencies to this organization.
     * Common Error Codes:
     * - ALREADY_EXISTS: Organization with the same name already exists in tenant
     * </pre>
     */
    default void createOrganization(com.producerflow.producer.v1.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewProducer adds a single producer to an existing agency.
     * Use this endpoint to programmatically add producers to agencies. This is
     * the programmatic alternative to CreateProducerOnboardingURL.
     * NIPR Validation and Sync:
     * The system validates the provided NPN exists in NIPR using a free API
     * lookup. If sync_with_nipr is enabled, the system performs a paid NIPR
     * EntityInfo lookup to fetch complete license, appointment, and regulatory
     * data.
     * Validation Performed:
     * - Email is unique within tenant
     * - Agency exists and belongs to tenant
     * - NPN exists in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producer: Required, contains producer information
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - npn: Must exist in NIPR and the provided last name must match the NIPR records
     * - npn: Must be unique within the tenant (not already assigned to another producer)
     * - location_ids: All locations must exist and belong to the specified agency
     * Returns:
     * The UUID of the created producer.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * </pre>
     */
    default void newProducer(com.producerflow.producer.v1.NewProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewProducerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewProducerMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewProducers creates multiple producers in bulk and associates them with a single agency.
     * This endpoint provides an efficient way to onboard multiple producers to the same
     * agency in a single API call.
     * Bulk Operation Behavior:
     * Producers are created sequentially. If a producer fails validation, the request
     * returns an error, but any producers created before the failure will remain in
     * the system. Each producer in the request undergoes the same validation as
     * individual NewProducer calls.
     * NIPR Validation and Sync:
     * For each producer:
     * - The system performs a free NIPR API lookup to validate the NPN exists
     * - If sync_with_nipr is true (or tenant default), performs paid NIPR EntityInfo lookups
     * - All NIPR validations must succeed for the bulk operation to proceed
     * Validation Performed (for each producer):
     * - Required fields are present and valid (name, email, NPN)
     * - Email addresses are unique within the tenant
     * - Agency exists and belongs to the authenticated tenant
     * - NPNs exist in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * - Phone numbers match valid patterns (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producers: Required, must contain at least 1 producer. Each producer:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items per producer, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting for all producers
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - All producer emails must be unique within the tenant
     * - All producer NPNs must exist in NIPR, match the provided last name, and be unique within the tenant
     * - All location_ids must exist and belong to the specified agency
     * - This is an all-or-nothing operation: if any producer fails validation, no producers
     *   are created
     * Returns:
     * List of UUIDs for all created producers in the same order as the request. This
     * ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    default void newProducers(com.producerflow.producer.v1.NewProducersRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewProducersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewProducersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgencyAndProducers retrieves complete information for an agency and all
     * its producers.
     * This endpoint returns comprehensive agency details including:
     * - Agency contact information and business details
     * - Principal producer information
     * - Bank account for commission payments
     * - Errors &amp; Omissions insurance details
     * - Business hours and contact points
     * - NIPR synchronized data (licenses, appointments, regulatory actions, addresses)
     * - All associated producers with their NIPR data
     * - Agency locations
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * Agency object with complete NIPR data and list of all associated producers.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void getAgencyAndProducers(com.producerflow.producer.v1.GetAgencyAndProducersRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyAndProducersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgencyAndProducersMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgency retrieves detailed information about a specific agency.
     * Supports two lookup methods:
     * - By agency ID (UUID)
     * - By tenant agency ID (external identifier)
     * This endpoint returns complete agency details including contact information,
     * addresses, bank account, E&amp;O coverage, principal information, NIPR data, and locations.
     * Use this when you need full agency information without the list of associated producers.
     * For agencies with their producers, use GetAgencyAndProducers instead.
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - agency_id_lookup.agency_id: Must be a valid UUID format
     * - tenant_agency_id_lookup.tenant_agency_id: Must be non-empty string
     * Returns:
     * Complete agency information including all NIPR data and locations.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - PERMISSION_DENIED: Tenant doesn't have access to the agency
     * </pre>
     */
    default void getAgency(com.producerflow.producer.v1.GetAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetProducer retrieves detailed information about a specific producer.
     * Supports three lookup methods:
     * - By producer ID (UUID)
     * - By NPN (National Producer Number)
     * - By email address
     * The response includes:
     * - Producer contact information (name, email, phone, address)
     * - Associated agency information
     * - NIPR synchronized data:
     *   - State licenses with expiration dates and Lines of Authority (LOAs)
     *   - Biographic information (name, DOB, state of domicile)
     *   - Regulatory actions by state
     *   - Carrier appointments with status and renewal dates
     * - Location assignments
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - producer_id_lookup.producer_id: Must be a valid UUID format
     * - npn_lookup.producer_npn: Must be non-empty string
     * - email_lookup.email: Must be a valid email format
     * Returns:
     * Complete producer information including all NIPR data.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant, or
     *   associated agency not found
     * - UNIMPLEMENTED: Lookup method not supported (only producer_id, npn, and email
     *   lookups are implemented)
     * </pre>
     */
    default void getProducer(com.producerflow.producer.v1.GetProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetProducerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProducerMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAgencyFiles retrieves signed URLs for accessing agency documents.
     * Returns pre-signed URLs for the following document types:
     * - Errors &amp; Omissions (E&amp;O) insurance certificate
     * - Voided check for ACH commission payments
     * - W9 tax form
     * - License documents
     * - Broker bond documents
     * The URLs are time-limited and grant temporary read access to the documents.
     * Empty strings are returned for documents that haven't been uploaded.
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A set of pre-signed URLs for accessing agency documents.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void getAgencyFiles(com.producerflow.producer.v1.GetAgencyFilesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAgencyFilesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateProducer updates editable fields for an existing producer.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncProducerWithNIPR.
     * Updatable Fields:
     * - Contact information (first_name, last_name, middle_name, email, phone)
     * - Mailing address (street, city, state, zip)
     * - External metadata (for tenant-specific data)
     * Note: NPN cannot be updated after creation. The NPN field is deprecated
     * in UpdateProducerRequest.Producer and will be ignored.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply (e.g., valid email format, phone pattern)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - producer: Required, contains fields to update (all fields optional):
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - npn: Deprecated and ignored - NPN cannot be updated after creation
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be at most 2 characters
     *   - zip: If provided, must be at least 5 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer field is missing in request
     * </pre>
     */
    default void updateProducer(com.producerflow.producer.v1.UpdateProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateProducerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProducerMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgency updates editable fields for an existing agency.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncAgencyWithNIPR.
     * Updatable Fields:
     * - Contact details (email, phone, fax)
     * - Website URL
     * - Physical address components
     * - Requested appointments (state codes)
     * - Notes
     * - External metadata (for tenant-specific data)
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - agency: Required, contains fields to update (all fields optional):
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - fax: If provided, must match E.164 pattern
     *   - website: If provided, must be a valid URI format
     *   - requested_appointments: Array of unique 2-letter state codes (e.g., ["CA", "NY"])
     *   - notes: If provided, maximum 500 characters
     *   - physical_address (optional, if provided):
     *     - street: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: If changed, must be unique within the tenant (case-insensitive comparison)
     * - phone: If provided, must be a valid phone number format
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email already exists within tenant
     * - INVALID_ARGUMENT: Invalid phone number format or all address fields required
     *   when creating new address
     * </pre>
     */
    default void updateAgency(com.producerflow.producer.v1.UpdateAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewContact creates a new contact associated with an agency.
     * Use this endpoint to programmatically add non-producer individuals to
     * agencies. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but need to be
     * associated with the agency for communication or administrative purposes.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contact: Required, contains contact information:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - role: If CONTACT_ROLE_PRINCIPAL, the agency must not already have a principal
     * Returns:
     * The UUID of the created contact.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields or invalid field format
     * - ALREADY_EXISTS: Email already registered in your tenant, or agency already has a principal
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void newContact(com.producerflow.producer.v1.NewContactRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * NewContacts creates multiple contacts in bulk and associates them with a
     * single agency.
     * This endpoint provides an efficient way to add multiple non-producer
     * contacts to the same agency in a single API call. Contacts represent staff
     * members, administrators, or other personnel who are not licensed insurance
     * producers.
     * Partial Success Behavior:
     * Unlike bulk producer operations, this endpoint uses partial success
     * semantics. Contacts that pass validation are created even if other contacts
     * in the request fail. The response contains only the IDs of successfully
     * created contacts.
     * Validation Performed (for each contact):
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contacts: Required, must contain at least 1 contact. Each contact:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Each contact email: Must be unique within the tenant. Contacts with duplicate
     *   emails are skipped (partial success - other valid contacts are still created)
     * Returns:
     * List of UUIDs for successfully created contacts. If some contacts failed
     * validation, only the IDs of successfully created contacts are returned.
     * Failed contacts are logged but not included in the response. The order of
     * returned IDs corresponds to the order of successful contacts, not the
     * original request order.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void newContacts(com.producerflow.producer.v1.NewContactsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewContactsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewContactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgencyContacts retrieves all contacts associated with an agency.
     * Use this endpoint to fetch all non-producer contacts linked to a specific
     * agency. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but are associated with
     * the agency.
     * The response includes complete contact information:
     * - Personal details (name, email, phone)
     * - Role within the agency
     * - Mailing address
     * - NPN (if applicable)
     * - Creation timestamp
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all contacts associated with the specified agency. Returns an
     * empty list if the agency has no contacts.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void listAgencyContacts(com.producerflow.producer.v1.ListAgencyContactsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgencyContactsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgencyContactsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateContact updates editable fields for an existing contact.
     * This endpoint allows updating contact information for non-producer personnel
     * associated with an agency. All fields are optional, enabling partial updates
     * where only specified fields are modified.
     * Updatable Fields:
     * - Name fields (first name, middle name, last name)
     * - Email address (must remain unique within tenant)
     * - Phone number
     * - Mailing address components
     * - Role within the agency
     * - External metadata (for tenant-specific data)
     * Validation Rules:
     * Proto validation (format checks):
     * - contact_id: Required, must be a valid UUID format
     * - contact: Required, contains the fields to update
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - role: If provided, must be non-empty
     *   - address (if provided, uses address_line_1 and address_line_2):
     *     - address_line_1: If provided, must be non-empty
     *     - address_line_2: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters (state code)
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - contact_id: Contact must exist and belong to the authenticated tenant
     * - email: If provided, must be unique within the tenant (across both producers and contacts)
     * Update Behavior:
     * - Only fields explicitly provided in the request are updated
     * - Omitted optional fields remain unchanged
     * - Empty strings are treated as clearing the field value
     * - Address updates are all-or-nothing (provide complete address or omit entirely)
     * Returns:
     * Empty response on success. The contact is updated atomically.
     * Common Error Codes:
     * - NOT_FOUND: Contact doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email is already in use by another producer or contact within the tenant
     * - INVALID_ARGUMENT: Validation failed for one or more fields
     * </pre>
     */
    default void updateContact(com.producerflow.producer.v1.UpdateContactRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetExternalID sets an external identifier for a producer, agency, contact,
     * or organization.
     * Use this endpoint to link ProducerFlow entities to corresponding records in
     * your external systems (CRM, AMS, legacy databases). This enables bi-directional
     * synchronization and lookups across systems.
     * Supported Entity Types:
     * - Producer: Links a producer to an external system record
     * - Agency: Links an agency to an external system record
     * - Contact: Links a contact to an external system record
     * - Organization: Links an organization to an external system record
     * Exactly one entity type must be specified per request.
     * Validation Performed:
     * - Exactly one entity ID is provided (producer_id, agency_id, contact_id, or organization_id)
     * - The external ID (tenant_id) is non-empty and at most 255 characters
     * - The external ID is unique within the tenant (not already assigned to another entity)
     * - The specified entity exists and belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one entity ID must be provided (oneof required):
     * - producer_id: Must be a valid UUID format
     * - agency_id: Must be a valid UUID format
     * - contact_id: Must be a valid UUID format
     * - organization_id: Must be a valid UUID format
     * Required field:
     * - tenant_id: Required, must be 1-255 characters (the external identifier to assign)
     * Business logic validation:
     * - tenant_id: Must be unique within the tenant (not already assigned to any other entity)
     * - Entity must exist and belong to the authenticated tenant:
     *   - Producer: Verified via tenant-scoped lookup
     *   - Contact: Verified via tenant-scoped lookup
     *   - Agency: Verified via tenant-scoped lookup and tenant ownership check
     *   - Organization: Verified via tenant-scoped lookup and tenant ownership check
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - INVALID_ARGUMENT: No entity ID provided or external ID validation failed
     * - NOT_FOUND: The specified entity doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: The external ID is already assigned to another entity in the tenant
     * - PERMISSION_DENIED: The entity doesn't belong to the authenticated tenant
     * </pre>
     */
    default void setExternalID(com.producerflow.producer.v1.SetExternalIDRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SetExternalIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetExternalIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateProducerNPN checks whether a producer's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an NPN is valid before creating a producer. This
     * is a free NIPR API lookup that does not count against your monthly billing
     * quota.
     * Validation Modes:
     * - NPN only: Validates that the NPN exists in NIPR
     * - NPN with name: Validates that the NPN exists AND the name matches the NIPR
     *   record (recommended for additional verification)
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the other NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * - name: Optional, if provided validates NPN matches this producer name in NIPR
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - If name is provided, both NPN and name must match a producer record in NIPR
     * - If name is not provided, only NPN existence is verified
     * Returns:
     * A boolean indicating whether the NPN is valid. Returns true if the NPN exists
     * in NIPR (and name matches, if provided), false otherwise.
     * </pre>
     */
    default void validateProducerNPN(com.producerflow.producer.v1.ValidateProducerNPNRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ValidateProducerNPNResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateProducerNPNMethod(), responseObserver);
    }

    /**
     * <pre>
     * ValidateAgencyNPN checks whether an agency's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an agency NPN is valid before creating an agency.
     * This is a free NIPR API lookup that does not count against your monthly
     * billing quota.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - Agency NPN must exist in NIPR's agency records
     * Returns:
     * A boolean indicating whether the agency NPN is valid. Returns true if the NPN
     * exists in NIPR, false otherwise.
     * </pre>
     */
    default void validateAgencyNPN(com.producerflow.producer.v1.ValidateAgencyNPNRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ValidateAgencyNPNResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateAgencyNPNMethod(), responseObserver);
    }

    /**
     * <pre>
     * LookupNPNByFEIN finds an agency's NPN using their Federal Employer
     * Identification Number (FEIN).
     * Use this endpoint to help agencies discover their NPN when they only know
     * their FEIN. This is common during onboarding when agencies may not have
     * their NPN readily available but know their tax identification number.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the EntityInfo lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - fein: Required, must be exactly 9 characters
     * Business logic validation:
     * - FEIN is looked up against NIPR database via free NIPR NPN Lookup API
     * - Agency with the given FEIN must exist in NIPR's records
     * Returns:
     * The agency's NPN if found in NIPR.
     * Common Error Codes:
     * - NOT_FOUND: No agency found in NIPR with the given FEIN
     * </pre>
     */
    default void lookupNPNByFEIN(com.producerflow.producer.v1.LookupNPNByFEINRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.LookupNPNByFEINResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLookupNPNByFEINMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResyncProducer triggers a manual resynchronization of a producer's data.
     * This can be used to refresh data after external change
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer ID is empty
     * </pre>
     */
    default void resyncProducer(com.producerflow.producer.v1.ResyncProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ResyncProducerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResyncProducerMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResyncAgency triggers a manual resynchronization of an agency's data. Similar
     * to ResyncProducer, this can be used to refresh data after external changes.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency ID is empty or request is empty
     * </pre>
     */
    default void resyncAgency(com.producerflow.producer.v1.ResyncAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ResyncAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResyncAgencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * SyncProducerWithNIPR synchronizes a producer's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of producer data
     * from NIPR. The operation validates the producer NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Biographic information (name, DOB, state of domicile)
     * - Address by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Producer license data sync (if producer is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must have a valid NPN registered in NIPR
     * - Producer must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must have an NPN assigned (cannot sync a producer without NPN)
     * - Producer's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Producer must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout: 30 seconds. If NIPR takes longer, you'll receive a
     * DEADLINE_EXCEEDED error.
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist, doesn't belong to tenant, or NPN could
     *   not be found in NIPR. If the NPN cannot be found, the error message will
     *   be "producer NPN could not be found in NIPR".
     * - INVALID_ARGUMENT: Producer has no NPN.
     * - FAILED_PRECONDITION: Producer is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync took longer than 30 seconds
     * - INTERNAL: Unexpected error during NIPR lookup or sync process
     * </pre>
     */
    default void syncProducerWithNIPR(com.producerflow.producer.v1.SyncProducerWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SyncProducerWithNIPRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncProducerWithNIPRMethod(), responseObserver);
    }

    /**
     * <pre>
     * SyncAgencyWithNIPR synchronizes an agency's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of agency data
     * from NIPR. The operation validates the agency NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - Agency biographic information (company name, FEIN, contact details)
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Address history by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Agency license data sync (if agency is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * - When sync_all_producers is true: additional calls per producer (license sync + PDB alerts)
     * Bulk Producer Sync:
     * When sync_all_producers is set to true, the system will also sync all
     * producers associated with the agency. This extends the timeout to 10
     * minutes to accommodate the additional operations. Each producer sync is
     * a separate billable NIPR lookup.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must have a valid NPN registered in NIPR
     * - Agency must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - sync_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Agency's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Agency must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout:
     * - 30 seconds when syncing agency only
     * - 10 minutes when sync_all_producers is true
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency NPN is not valid (not found in NIPR)
     * - FAILED_PRECONDITION: Agency is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync operation timed out (30s for agency only, 10m with sync_all_producers)
     * </pre>
     */
    default void syncAgencyWithNIPR(com.producerflow.producer.v1.SyncAgencyWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SyncAgencyWithNIPRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSyncAgencyWithNIPRMethod(), responseObserver);
    }

    /**
     * <pre>
     * StopSyncProducerWithNIPR disables automatic NIPR synchronization for a producer.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific producer. Once stopped, the producer's NIPR data will no longer
     * be refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncProducerWithNIPR endpoint.
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must be in active or failing sync state (not already disabled/pending)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must be in ACTIVE or FAILING sync state (cannot stop if already
     *   DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Producer is already unsynced (DISABLED or PENDING sync state)
     * </pre>
     */
    default void stopSyncProducerWithNIPR(com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopSyncProducerWithNIPRMethod(), responseObserver);
    }

    /**
     * <pre>
     * StopSyncAgencyWithNIPR disables automatic NIPR synchronization for an agency.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific agency. Once stopped, the agency's NIPR data will no longer be
     * refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncAgencyWithNIPR endpoint.
     * Bulk Producer Stop:
     * When stop_all_producers is set to true, the system will also stop sync for
     * all producers associated with the agency. This is useful when offboarding
     * an entire agency from NIPR synchronization. When this flag is set, the
     * precondition check for agency sync state is bypassed.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must be in active or failing sync state (unless stop_all_producers is true)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - stop_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Unless stop_all_producers is true, agency must be in ACTIVE or FAILING sync
     *   state (cannot stop if already DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Agency is already unsynced (DISABLED or PENDING sync state,
     *   unless stop_all_producers is true)
     * </pre>
     */
    default void stopSyncAgencyWithNIPR(com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopSyncAgencyWithNIPRMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateProducerUploadURL generates a secure URL for bulk producer uploads to
     * an existing agency.
     * Use this endpoint to create a shareable link that allows agencies to upload
     * multiple producers at once. The URL includes security tokens and tenant
     * context to ensure secure, authenticated access.
     * Unlike CreateProducerOnboardingURL which creates a self-service form for a
     * single producer, this endpoint generates a URL for bulk uploading producer
     * data (typically via CSV or spreadsheet format).
     * The agency is identified by its National Producer Number (NPN), which must
     * already exist in your tenant. Use ListAgencies or GetAgencyAndProducers to
     * look up agency NPNs if needed.
     * Typical Workflow:
     * 1. Generate producer upload URL using the agency's NPN
     * 2. Share URL with agency contact via email or portal
     * 3. Agency uploads producer data through the URL
     * 4. System processes uploads, validates NPNs with NIPR, and creates producer
     *    records
     * 5. Producers are associated with the agency and optionally synced with NIPR
     * URL Expiration:
     * The generated URL has a default expiration of 7 days. After expiration, a
     * new URL must be generated.
     * Validation Performed:
     * - Agency NPN format is valid (numeric string, 2-10 digits)
     * - Agency with the given NPN exists in your tenant
     * - Agency belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_npn: Required, must be 2-10 digits (numeric characters only)
     * Business logic validation:
     * - Agency with the given NPN must exist in the authenticated tenant
     * - Agency must belong to the authenticated tenant (ownership verification)
     * - Only one agency should match the NPN (multiple matches indicate data issue)
     * Returns:
     * A time-limited URL string that can be shared with the agency for bulk
     * producer uploads.
     * Common Error Codes:
     * - NOT_FOUND: No agency found with the given NPN in your tenant
     * </pre>
     */
    default void createProducerUploadURL(com.producerflow.producer.v1.CreateProducerUploadURLRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateProducerUploadURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProducerUploadURLMethod(), responseObserver);
    }

    /**
     * <pre>
     * AddAgencyLocations adds one or more locations to an existing agency.
     * Use this endpoint to programmatically add physical locations (offices,
     * branches, etc.) to an agency. Locations enable organizing producers by
     * their work sites and tracking agency presence across different addresses.
     * Bulk Operation Behavior:
     * This is an all-or-nothing operation - if any location fails validation,
     * the entire request will fail and no locations will be added. You can add
     * up to 100 locations in a single request.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - At least one location is provided
     * - Location names are unique within the agency (case-insensitive)
     * - Location names are not duplicated within the request
     * - Valid address information is provided for each location
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - locations: Required, 1-100 locations. Each location:
     *   - name: Required, must be non-empty (unique within agency)
     *   - address: Required
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - phone: Required, must match E.164 pattern (e.g., +15551234567)
     *   - email: Required, must be a valid email format
     *   - is_primary: Optional boolean, marks location as primary
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location names must be unique within the agency (case-insensitive)
     * - Location names must not duplicate any existing location names in the agency
     * - Location names must not duplicate other location names within the same request
     * Returns:
     * List of UUIDs for all created locations in the same order as the request.
     * This ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id, no locations provided, duplicate
     *   location names, or location with name already exists in agency
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void addAgencyLocations(com.producerflow.producer.v1.AddAgencyLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.AddAgencyLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAgencyLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * RemoveAgencyLocations removes one or more locations from an agency.
     * Use this endpoint to delete locations that are no longer needed. This is
     * useful when closing branch offices or consolidating agency locations.
     * Producer Unassignment:
     * When a location is removed, all producers assigned to that location are
     * automatically unassigned. The producers themselves are not deleted - they
     * remain associated with the agency but without a location assignment.
     * Partial Success Behavior:
     * Locations that don't exist are silently ignored. The response contains only
     * the IDs of locations that were actually removed.
     * Validation Performed:
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location IDs that don't exist are silently ignored (partial success)
     * Returns:
     * List of UUIDs for locations that were successfully removed.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or no location_ids provided
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void removeAgencyLocations(com.producerflow.producer.v1.RemoveAgencyLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.RemoveAgencyLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveAgencyLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgencyLocations retrieves all locations associated with an agency.
     * Use this endpoint to fetch the complete list of physical locations
     * belonging to an agency. Each location includes its address, contact
     * information, and primary status.
     * The response includes complete location information:
     * - Location ID and name
     * - Physical address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location indicator
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all locations associated with the specified agency. Returns an
     * empty list if the agency has no locations.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Invalid request
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    default void listAgencyLocations(com.producerflow.producer.v1.ListAgencyLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgencyLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgencyLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AssignProducerToLocations assigns one or more locations to a producer.
     * Use this endpoint to associate a producer with specific agency locations
     * (branch offices, work sites, etc.). A producer can be assigned to multiple
     * locations within their agency.
     * Location Ownership:
     * All specified locations must belong to the same agency as the producer.
     * Cross-agency location assignments are not permitted.
     * Idempotent Behavior:
     * If a producer is already assigned to a location, the assignment is
     * preserved without error. The response includes all successfully assigned
     * location IDs.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer's agency must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully assigned to the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing
     * - NOT_FOUND: Producer doesn't exist, agency doesn't exist, or specified
     *   locations don't exist
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    default void assignProducerToLocations(com.producerflow.producer.v1.AssignProducerToLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.AssignProducerToLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignProducerToLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UnassignProducerFromLocations removes one or more location assignments from
     * a producer.
     * Use this endpoint to disassociate a producer from specific agency locations.
     * This is useful when producers change work sites or when consolidating
     * location assignments.
     * Producer Preservation:
     * This operation only removes the location assignments - the producer remains
     * active and associated with the agency. To fully remove a producer, use the
     * appropriate producer deletion endpoint.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully unassigned from the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing, producer_id is empty, or no location_ids provided
     * - NOT_FOUND: Producer doesn't exist or specified locations don't exist
     * </pre>
     */
    default void unassignProducerFromLocations(com.producerflow.producer.v1.UnassignProducerFromLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UnassignProducerFromLocationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnassignProducerFromLocationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAgencyLocation updates an existing agency location.
     * Use this endpoint to modify location details such as address, contact
     * information, or primary status. This is useful when locations move,
     * change phone numbers, or when designating a new primary location.
     * Updatable Fields:
     * - Name (must remain unique within the agency)
     * - Address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location status
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Name Uniqueness:
     * If updating the location name, the new name must not already exist for
     * another location within the same agency (case-insensitive comparison).
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_id: Required, must be a valid UUID format
     * - name: If provided, must be non-empty (unique within agency)
     * - address: If provided (all fields optional within):
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be exactly 2 characters (state code)
     *   - zip: If provided, must be 1-10 characters
     * - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     * - email: If provided, must be a valid email format
     * - is_primary: Optional boolean
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - location_id: Location must exist and belong to the specified agency
     * - name: If provided, must be unique within the agency (case-insensitive,
     *   excluding the location being updated)
     * Returns:
     * The complete updated location object with all current field values.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or location_id, or invalid request
     * - NOT_FOUND: Agency or location doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: New location name already exists within the agency
     * </pre>
     */
    default void updateAgencyLocation(com.producerflow.producer.v1.UpdateAgencyLocationRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateAgencyLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAgencyLocationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProducerService.
   * <pre>
   * ProducerService provides a comprehensive API for managing insurance
   * producers and agencies. This service simplifies producer and agency
   * onboarding, data synchronization, and integration with the National Insurance
   * Producer Registry (NIPR).
   * Key capabilities:
   * - Producer and agency onboarding with self-service URLs
   * - Automatic synchronization of license, appointment, and regulatory data from NIPR
   * - NPN (National Producer Number) validation and lookup
   * - Multi-location management for agencies
   * - Integration with NIPR PDB Gateway, PDB Alerts, and NPN Lookup services
   * NIPR Integration:
   * This service automatically fetches and maintains up-to-date licensing
   * information, carrier appointments, and regulatory actions from NIPR. Most
   * NIPR sync operations are billable and count against your monthly unique NPN
   * quota. Enable PDB Alerts synchronization to receive automatic daily updates
   * and reduce manual sync costs.
   * Authentication:
   * All endpoints require API key authentication provided via the Authorization header.
   * </pre>
   */
  public static abstract class ProducerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProducerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProducerService.
   * <pre>
   * ProducerService provides a comprehensive API for managing insurance
   * producers and agencies. This service simplifies producer and agency
   * onboarding, data synchronization, and integration with the National Insurance
   * Producer Registry (NIPR).
   * Key capabilities:
   * - Producer and agency onboarding with self-service URLs
   * - Automatic synchronization of license, appointment, and regulatory data from NIPR
   * - NPN (National Producer Number) validation and lookup
   * - Multi-location management for agencies
   * - Integration with NIPR PDB Gateway, PDB Alerts, and NPN Lookup services
   * NIPR Integration:
   * This service automatically fetches and maintains up-to-date licensing
   * information, carrier appointments, and regulatory actions from NIPR. Most
   * NIPR sync operations are billable and count against your monthly unique NPN
   * quota. Enable PDB Alerts synchronization to receive automatic daily updates
   * and reduce manual sync costs.
   * Authentication:
   * All endpoints require API key authentication provided via the Authorization header.
   * </pre>
   */
  public static final class ProducerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProducerServiceStub> {
    private ProducerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProducerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProducerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAgencyOnboardingURL generates a secure, pre-filled URL for agency
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links that can be
     * shared with agencies. The URL encodes agency defaults, tenant context, and
     * optional pre-filled information to streamline the onboarding experience.
     * All fields in the request are optional. Provide as much or as little
     * information as available - any missing data will be collected through the
     * onboarding flow.
     * Typical Workflow:
     * 1. Generate onboarding URL with optional pre-filled data (agency name, NPN,
     *    principal info)
     * 2. Share URL with agency contact via email or portal
     * 3. Agency completes onboarding form through the URL
     * 4. System validates NPN with NIPR and creates agency record
     * 5. Optionally sync with NIPR to fetch licenses and appointments
     * Validation Rules:
     * All fields in the request are optional. The system generates valid URLs
     * even with an empty request. When fields are provided:
     * - entity_type: Must be ENTITY_TYPE_SOLE_PROPRIETOR (1), ENTITY_TYPE_AGENCY (2),
     *   or ENTITY_TYPE_ASK_DURING_ONBOARDING (3). This is the only endpoint where
     *   ENTITY_TYPE_ASK_DURING_ONBOARDING is valid.
     * - email: Must be a valid email format if provided
     * - npn: Must be a valid NPN format (2-10 digits) if provided. Note that NPN
     *   validation against NIPR occurs during onboarding, not during URL generation.
     * - fein: Must be exactly 9 digits if provided
     * - organization_id: Must be a valid organization ID belonging to your tenant if provided
     * - principal.email: Must be a valid email format if provided
     * - principal.npn: Must be a valid NPN format (2-10 digits) if provided
     * - principal.tenant_id: Maximum 255 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the agency for
     * self-service onboarding.
     * </pre>
     */
    public void createAgencyOnboardingURL(com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAgencyOnboardingURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateProducerOnboardingURL generates a secure, pre-filled URL for producer
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links for individual
     * producers joining an existing agency. The URL can include optional
     * pre-filled data like NPN, name, email, and address to reduce manual data
     * entry.
     * The producer must be associated with an existing agency. Use
     * CreateAgencyOnboardingURL if you need to onboard an agency and its
     * principal together.
     * Typical Workflow:
     * 1. Generate producer onboarding URL with agency_id and optional pre-filled data
     * 2. Share URL with producer via email
     * 3. Producer completes onboarding form through the URL
     * 4. System validates NPN with NIPR and associates producer with agency
     * 5. Optionally sync with NIPR to fetch producer licenses and appointments
     * Validation Rules:
     * - agency_id: Required. must be a valid UUID of an agency belonging
     *   to your tenant.
     * - producer_data: All fields are optional. When provided:
     *   - npn: Must be a valid NPN format (1-10 characters). Note that NPN validation
     *     against NIPR occurs during onboarding, not during URL generation.
     *   - email: Must be a valid email format if provided
     *   - mailing_address.state: Must be exactly 2 characters (state code) if provided
     *   - mailing_address.zip: Must be 1-10 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the producer for
     * self-service onboarding.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Invalid NPN provided (not found in NIPR)
     * </pre>
     */
    public void createProducerOnboardingURL(com.producerflow.producer.v1.CreateProducerOnboardingURLRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateProducerOnboardingURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProducerOnboardingURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewAgency creates a new agency with principal and optional additional producers.
     * This is the programmatic alternative to CreateAgencyOnboardingURL - use
     * this when you want to create agencies directly via API instead of through a
     * self-service form.
     * Entity Type Rules:
     * - ENTITY_TYPE_SOLE_PROPRIETOR: Individual producer operating as their own agency.
     *   Cannot have an agency NPN. Only the principal is created.
     * - ENTITY_TYPE_AGENCY: Standard insurance agency with multiple producers.
     *   Must provide either an NPN or FEIN. Can have multiple producers beyond the principal.
     * NIPR Validation and Sync:
     * The system performs free NIPR API lookups to validate NPNs before
     * creation. If sync_with_nipr is true (or tenant default), the system
     * performs paid NIPR EntityInfo lookups to fetch complete license, appointment,
     * and regulatory data.
     * Validation Performed:
     * - Required fields are present and valid
     * - Email addresses are unique within tenant
     * - Agency NPN exists in NIPR (if provided)
     * - Principal NPN exists in NIPR
     * - Entity type rules are followed
     * - Principal and subsequent producers last names must match NIPR records for the given NPN
     * Validation Rules:
     * Proto validation (format checks):
     * - agency: Required field containing all agency information
     * - agency.name: Required, must be non-empty
     * - agency.email: Required, must be a valid email format
     * - agency.phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     * - agency.entity_type: Required, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or
     *   ENTITY_TYPE_AGENCY (2). ENTITY_TYPE_ASK_DURING_ONBOARDING is NOT valid here.
     * - agency.fein: Optional, if provided must be exactly 9 digits. Required for
     *   ENTITY_TYPE_AGENCY if NPN is not provided.
     * - agency.principal: Required, contains principal producer information
     *   - principal.first_name: Required, must be non-empty
     *   - principal.last_name: Required, must be non-empty
     *   - principal.email: Required, must be a valid email format
     *   - principal.npn: Required, must be 1-10 characters
     *   - principal.phone: Optional, if provided must match E.164 pattern
     *   - principal.tenant_id: Optional, maximum 255 characters
     * - agency.bank_account (optional, if provided all subfields are required):
     *   - account_number: 8-17 characters
     *   - routing_number: Exactly 9 characters
     *   - account_type: Required, must be CHECKING (1) or SAVINGS (2)
     *   - account_holder_name: Required, must be non-empty
     * - agency.eo_info (optional, if provided):
     *   - carrier: Required, must be non-empty
     *   - expiration_date: Required, must be in the future
     *   - coverage_amount: Required, must be non-empty
     *   - effective_date: Required
     *   - per_occurrence: Required, must be non-empty
     * - agency.business_hours (optional, if provided):
     *   - timezone: Required, must be non-empty
     *   - business_hours: Required, at least one entry
     *     - week_days: Required, 1-7 days
     *     - opening_time: Required
     *     - closing_time: Required
     * - agency.producers: Optional list of additional producers (see NewProducer validation)
     * - agency.points_of_contact (optional, for each contact):
     *   - email: Required, must be a valid email format
     *   - role: Required
     * - agency.root_organization_id: Optional, if provided must be 1-36 characters
     * - agency.locations: Optional, maximum 100 locations
     * Business logic validation:
     * - agency.email: Must be unique within the tenant
     * - agency.npn: If provided, must exist in NIPR (validated via free NIPR lookup)
     * - principal.email: Must be unique within the tenant
     * - principal.npn: Must exist in NIPR (validated via free NIPR lookup)
     * - All producer emails must be unique within the tenant
     * Returns:
     * IDs of the created agency, principal, optional producers, and locations (if provided).
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields, entity type rule violations, or
     *   NPN not found in NIPR
     * - ALREADY_EXISTS: Email or NPN already registered in your tenant
     * </pre>
     */
    public void newAgency(com.producerflow.producer.v1.NewAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgencies retrieves a paginated list of agencies associated with the tenant.
     * This endpoint provides comprehensive agency listing with powerful filtering
     * capabilities to efficiently manage and search through large numbers of
     * agencies. Each agency in the response includes summary information for
     * quick overview without the full NIPR data.
     * Filtering Capabilities:
     * - Organization: Filter agencies belonging to a specific organization
     * - Search: Free-text search across agency name, NPN, and email
     * - Agency Type: Filter by internal (tenant) vs external agencies
     * - Entity Type: Filter by sole proprietor vs standard agency
     * - NIPR Sync Status: Filter by synchronization state (active, failing, pending, disabled)
     * The response uses cursor-based pagination for efficient data retrieval:
     * - Default page size is 50 if not specified
     * - Maximum page size is 200
     * - Results are ordered by creation date, most recent first
     * - Use the next_page_token to retrieve subsequent pages
     * Validation Rules:
     * All fields are optional filters:
     * - organization_id: If provided, must be a valid UUID format
     * - search_query: Optional free-text search string (case-insensitive, partial matching)
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * - agency_type: If provided, must be AGENCY_TYPE_INTERNAL (1) or AGENCY_TYPE_EXTERNAL (2)
     * - entity_type: If provided, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or ENTITY_TYPE_AGENCY (2)
     * - nipr_sync_statuses: Array of sync states to filter by (ACTIVE, FAILING, PENDING, DISABLED)
     * Returns:
     * A paginated list of AgencySummary objects containing essential agency
     * information without full NIPR data. Use GetAgencyAndProducers for complete
     * agency details including NIPR data.
     * </pre>
     */
    public void listAgencies(com.producerflow.producer.v1.ListAgenciesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgenciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListOrganizations retrieves all organizations accessible to your tenant.
     * Organizations represent logical groupings or hierarchical structures for
     * managing agencies. They enable better organization of agencies into business
     * units, networks, or aggregator relationships. Each
     * organization can contain multiple agencies, allowing for hierarchical
     * management and reporting across your insurance distribution network.
     * Not all tenants use organizations - this list may be empty if your tenant
     * doesn't have organizational hierarchies enabled.
     * Validation Rules:
     * Proto validation (format checks):
     * All fields are optional:
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * Returns:
     * A list of all organizations accessible to your tenant, including their IDs,
     * names and external identifiers. Organizations are
     * returned in alphabetical order by name for consistent presentation.
     * </pre>
     */
    public void listOrganizations(com.producerflow.producer.v1.ListOrganizationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListOrganizationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetOrganization retrieves comprehensive details about a specific organization.
     * This endpoint returns complete organization information including all
     * agencies assigned to it. For each agency, it provides summary data including
     * appointment overview statistics and NIPR synchronization status. This allows
     * you to understand the full scope of an organization's agency network in a
     * single API call.
     * Validation Rules:
     * Proto validation (format checks):
     * - organization_id: Required, must be a valid UUID format
     * Returns:
     * Complete organization details including all assigned agencies with their
     * appointment overviews and sync statuses.
     * Common Error Codes:
     * - NOT_FOUND: Organization doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void getOrganization(com.producerflow.producer.v1.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization for the authenticated tenant.
     * Organizations are top-level groupings used to organize agencies within your
     * tenant. They can represent business units, regions, or any logical grouping
     * that makes sense for your operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - name: Required, must be non-empty
     * - external_id: Optional, your system's identifier for the organization
     * - email: Optional, contact email for the organization
     * Business logic validation:
     * - name: Must be unique within the tenant (case-insensitive)
     * Returns:
     * The UUID of the newly created organization, which can be used to assign
     * agencies to this organization.
     * Common Error Codes:
     * - ALREADY_EXISTS: Organization with the same name already exists in tenant
     * </pre>
     */
    public void createOrganization(com.producerflow.producer.v1.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateOrganizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewProducer adds a single producer to an existing agency.
     * Use this endpoint to programmatically add producers to agencies. This is
     * the programmatic alternative to CreateProducerOnboardingURL.
     * NIPR Validation and Sync:
     * The system validates the provided NPN exists in NIPR using a free API
     * lookup. If sync_with_nipr is enabled, the system performs a paid NIPR
     * EntityInfo lookup to fetch complete license, appointment, and regulatory
     * data.
     * Validation Performed:
     * - Email is unique within tenant
     * - Agency exists and belongs to tenant
     * - NPN exists in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producer: Required, contains producer information
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - npn: Must exist in NIPR and the provided last name must match the NIPR records
     * - npn: Must be unique within the tenant (not already assigned to another producer)
     * - location_ids: All locations must exist and belong to the specified agency
     * Returns:
     * The UUID of the created producer.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * </pre>
     */
    public void newProducer(com.producerflow.producer.v1.NewProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewProducerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewProducerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewProducers creates multiple producers in bulk and associates them with a single agency.
     * This endpoint provides an efficient way to onboard multiple producers to the same
     * agency in a single API call.
     * Bulk Operation Behavior:
     * Producers are created sequentially. If a producer fails validation, the request
     * returns an error, but any producers created before the failure will remain in
     * the system. Each producer in the request undergoes the same validation as
     * individual NewProducer calls.
     * NIPR Validation and Sync:
     * For each producer:
     * - The system performs a free NIPR API lookup to validate the NPN exists
     * - If sync_with_nipr is true (or tenant default), performs paid NIPR EntityInfo lookups
     * - All NIPR validations must succeed for the bulk operation to proceed
     * Validation Performed (for each producer):
     * - Required fields are present and valid (name, email, NPN)
     * - Email addresses are unique within the tenant
     * - Agency exists and belongs to the authenticated tenant
     * - NPNs exist in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * - Phone numbers match valid patterns (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producers: Required, must contain at least 1 producer. Each producer:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items per producer, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting for all producers
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - All producer emails must be unique within the tenant
     * - All producer NPNs must exist in NIPR, match the provided last name, and be unique within the tenant
     * - All location_ids must exist and belong to the specified agency
     * - This is an all-or-nothing operation: if any producer fails validation, no producers
     *   are created
     * Returns:
     * List of UUIDs for all created producers in the same order as the request. This
     * ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    public void newProducers(com.producerflow.producer.v1.NewProducersRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewProducersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewProducersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgencyAndProducers retrieves complete information for an agency and all
     * its producers.
     * This endpoint returns comprehensive agency details including:
     * - Agency contact information and business details
     * - Principal producer information
     * - Bank account for commission payments
     * - Errors &amp; Omissions insurance details
     * - Business hours and contact points
     * - NIPR synchronized data (licenses, appointments, regulatory actions, addresses)
     * - All associated producers with their NIPR data
     * - Agency locations
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * Agency object with complete NIPR data and list of all associated producers.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void getAgencyAndProducers(com.producerflow.producer.v1.GetAgencyAndProducersRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyAndProducersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgencyAndProducersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgency retrieves detailed information about a specific agency.
     * Supports two lookup methods:
     * - By agency ID (UUID)
     * - By tenant agency ID (external identifier)
     * This endpoint returns complete agency details including contact information,
     * addresses, bank account, E&amp;O coverage, principal information, NIPR data, and locations.
     * Use this when you need full agency information without the list of associated producers.
     * For agencies with their producers, use GetAgencyAndProducers instead.
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - agency_id_lookup.agency_id: Must be a valid UUID format
     * - tenant_agency_id_lookup.tenant_agency_id: Must be non-empty string
     * Returns:
     * Complete agency information including all NIPR data and locations.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - PERMISSION_DENIED: Tenant doesn't have access to the agency
     * </pre>
     */
    public void getAgency(com.producerflow.producer.v1.GetAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetProducer retrieves detailed information about a specific producer.
     * Supports three lookup methods:
     * - By producer ID (UUID)
     * - By NPN (National Producer Number)
     * - By email address
     * The response includes:
     * - Producer contact information (name, email, phone, address)
     * - Associated agency information
     * - NIPR synchronized data:
     *   - State licenses with expiration dates and Lines of Authority (LOAs)
     *   - Biographic information (name, DOB, state of domicile)
     *   - Regulatory actions by state
     *   - Carrier appointments with status and renewal dates
     * - Location assignments
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - producer_id_lookup.producer_id: Must be a valid UUID format
     * - npn_lookup.producer_npn: Must be non-empty string
     * - email_lookup.email: Must be a valid email format
     * Returns:
     * Complete producer information including all NIPR data.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant, or
     *   associated agency not found
     * - UNIMPLEMENTED: Lookup method not supported (only producer_id, npn, and email
     *   lookups are implemented)
     * </pre>
     */
    public void getProducer(com.producerflow.producer.v1.GetProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetProducerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProducerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAgencyFiles retrieves signed URLs for accessing agency documents.
     * Returns pre-signed URLs for the following document types:
     * - Errors &amp; Omissions (E&amp;O) insurance certificate
     * - Voided check for ACH commission payments
     * - W9 tax form
     * - License documents
     * - Broker bond documents
     * The URLs are time-limited and grant temporary read access to the documents.
     * Empty strings are returned for documents that haven't been uploaded.
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A set of pre-signed URLs for accessing agency documents.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void getAgencyFiles(com.producerflow.producer.v1.GetAgencyFilesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAgencyFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateProducer updates editable fields for an existing producer.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncProducerWithNIPR.
     * Updatable Fields:
     * - Contact information (first_name, last_name, middle_name, email, phone)
     * - Mailing address (street, city, state, zip)
     * - External metadata (for tenant-specific data)
     * Note: NPN cannot be updated after creation. The NPN field is deprecated
     * in UpdateProducerRequest.Producer and will be ignored.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply (e.g., valid email format, phone pattern)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - producer: Required, contains fields to update (all fields optional):
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - npn: Deprecated and ignored - NPN cannot be updated after creation
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be at most 2 characters
     *   - zip: If provided, must be at least 5 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer field is missing in request
     * </pre>
     */
    public void updateProducer(com.producerflow.producer.v1.UpdateProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateProducerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProducerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgency updates editable fields for an existing agency.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncAgencyWithNIPR.
     * Updatable Fields:
     * - Contact details (email, phone, fax)
     * - Website URL
     * - Physical address components
     * - Requested appointments (state codes)
     * - Notes
     * - External metadata (for tenant-specific data)
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - agency: Required, contains fields to update (all fields optional):
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - fax: If provided, must match E.164 pattern
     *   - website: If provided, must be a valid URI format
     *   - requested_appointments: Array of unique 2-letter state codes (e.g., ["CA", "NY"])
     *   - notes: If provided, maximum 500 characters
     *   - physical_address (optional, if provided):
     *     - street: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: If changed, must be unique within the tenant (case-insensitive comparison)
     * - phone: If provided, must be a valid phone number format
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email already exists within tenant
     * - INVALID_ARGUMENT: Invalid phone number format or all address fields required
     *   when creating new address
     * </pre>
     */
    public void updateAgency(com.producerflow.producer.v1.UpdateAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewContact creates a new contact associated with an agency.
     * Use this endpoint to programmatically add non-producer individuals to
     * agencies. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but need to be
     * associated with the agency for communication or administrative purposes.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contact: Required, contains contact information:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - role: If CONTACT_ROLE_PRINCIPAL, the agency must not already have a principal
     * Returns:
     * The UUID of the created contact.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields or invalid field format
     * - ALREADY_EXISTS: Email already registered in your tenant, or agency already has a principal
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void newContact(com.producerflow.producer.v1.NewContactRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * NewContacts creates multiple contacts in bulk and associates them with a
     * single agency.
     * This endpoint provides an efficient way to add multiple non-producer
     * contacts to the same agency in a single API call. Contacts represent staff
     * members, administrators, or other personnel who are not licensed insurance
     * producers.
     * Partial Success Behavior:
     * Unlike bulk producer operations, this endpoint uses partial success
     * semantics. Contacts that pass validation are created even if other contacts
     * in the request fail. The response contains only the IDs of successfully
     * created contacts.
     * Validation Performed (for each contact):
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contacts: Required, must contain at least 1 contact. Each contact:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Each contact email: Must be unique within the tenant. Contacts with duplicate
     *   emails are skipped (partial success - other valid contacts are still created)
     * Returns:
     * List of UUIDs for successfully created contacts. If some contacts failed
     * validation, only the IDs of successfully created contacts are returned.
     * Failed contacts are logged but not included in the response. The order of
     * returned IDs corresponds to the order of successful contacts, not the
     * original request order.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void newContacts(com.producerflow.producer.v1.NewContactsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewContactsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgencyContacts retrieves all contacts associated with an agency.
     * Use this endpoint to fetch all non-producer contacts linked to a specific
     * agency. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but are associated with
     * the agency.
     * The response includes complete contact information:
     * - Personal details (name, email, phone)
     * - Role within the agency
     * - Mailing address
     * - NPN (if applicable)
     * - Creation timestamp
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all contacts associated with the specified agency. Returns an
     * empty list if the agency has no contacts.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void listAgencyContacts(com.producerflow.producer.v1.ListAgencyContactsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgencyContactsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgencyContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateContact updates editable fields for an existing contact.
     * This endpoint allows updating contact information for non-producer personnel
     * associated with an agency. All fields are optional, enabling partial updates
     * where only specified fields are modified.
     * Updatable Fields:
     * - Name fields (first name, middle name, last name)
     * - Email address (must remain unique within tenant)
     * - Phone number
     * - Mailing address components
     * - Role within the agency
     * - External metadata (for tenant-specific data)
     * Validation Rules:
     * Proto validation (format checks):
     * - contact_id: Required, must be a valid UUID format
     * - contact: Required, contains the fields to update
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - role: If provided, must be non-empty
     *   - address (if provided, uses address_line_1 and address_line_2):
     *     - address_line_1: If provided, must be non-empty
     *     - address_line_2: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters (state code)
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - contact_id: Contact must exist and belong to the authenticated tenant
     * - email: If provided, must be unique within the tenant (across both producers and contacts)
     * Update Behavior:
     * - Only fields explicitly provided in the request are updated
     * - Omitted optional fields remain unchanged
     * - Empty strings are treated as clearing the field value
     * - Address updates are all-or-nothing (provide complete address or omit entirely)
     * Returns:
     * Empty response on success. The contact is updated atomically.
     * Common Error Codes:
     * - NOT_FOUND: Contact doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email is already in use by another producer or contact within the tenant
     * - INVALID_ARGUMENT: Validation failed for one or more fields
     * </pre>
     */
    public void updateContact(com.producerflow.producer.v1.UpdateContactRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetExternalID sets an external identifier for a producer, agency, contact,
     * or organization.
     * Use this endpoint to link ProducerFlow entities to corresponding records in
     * your external systems (CRM, AMS, legacy databases). This enables bi-directional
     * synchronization and lookups across systems.
     * Supported Entity Types:
     * - Producer: Links a producer to an external system record
     * - Agency: Links an agency to an external system record
     * - Contact: Links a contact to an external system record
     * - Organization: Links an organization to an external system record
     * Exactly one entity type must be specified per request.
     * Validation Performed:
     * - Exactly one entity ID is provided (producer_id, agency_id, contact_id, or organization_id)
     * - The external ID (tenant_id) is non-empty and at most 255 characters
     * - The external ID is unique within the tenant (not already assigned to another entity)
     * - The specified entity exists and belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one entity ID must be provided (oneof required):
     * - producer_id: Must be a valid UUID format
     * - agency_id: Must be a valid UUID format
     * - contact_id: Must be a valid UUID format
     * - organization_id: Must be a valid UUID format
     * Required field:
     * - tenant_id: Required, must be 1-255 characters (the external identifier to assign)
     * Business logic validation:
     * - tenant_id: Must be unique within the tenant (not already assigned to any other entity)
     * - Entity must exist and belong to the authenticated tenant:
     *   - Producer: Verified via tenant-scoped lookup
     *   - Contact: Verified via tenant-scoped lookup
     *   - Agency: Verified via tenant-scoped lookup and tenant ownership check
     *   - Organization: Verified via tenant-scoped lookup and tenant ownership check
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - INVALID_ARGUMENT: No entity ID provided or external ID validation failed
     * - NOT_FOUND: The specified entity doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: The external ID is already assigned to another entity in the tenant
     * - PERMISSION_DENIED: The entity doesn't belong to the authenticated tenant
     * </pre>
     */
    public void setExternalID(com.producerflow.producer.v1.SetExternalIDRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SetExternalIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetExternalIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateProducerNPN checks whether a producer's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an NPN is valid before creating a producer. This
     * is a free NIPR API lookup that does not count against your monthly billing
     * quota.
     * Validation Modes:
     * - NPN only: Validates that the NPN exists in NIPR
     * - NPN with name: Validates that the NPN exists AND the name matches the NIPR
     *   record (recommended for additional verification)
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the other NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * - name: Optional, if provided validates NPN matches this producer name in NIPR
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - If name is provided, both NPN and name must match a producer record in NIPR
     * - If name is not provided, only NPN existence is verified
     * Returns:
     * A boolean indicating whether the NPN is valid. Returns true if the NPN exists
     * in NIPR (and name matches, if provided), false otherwise.
     * </pre>
     */
    public void validateProducerNPN(com.producerflow.producer.v1.ValidateProducerNPNRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ValidateProducerNPNResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateProducerNPNMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ValidateAgencyNPN checks whether an agency's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an agency NPN is valid before creating an agency.
     * This is a free NIPR API lookup that does not count against your monthly
     * billing quota.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - Agency NPN must exist in NIPR's agency records
     * Returns:
     * A boolean indicating whether the agency NPN is valid. Returns true if the NPN
     * exists in NIPR, false otherwise.
     * </pre>
     */
    public void validateAgencyNPN(com.producerflow.producer.v1.ValidateAgencyNPNRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ValidateAgencyNPNResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateAgencyNPNMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * LookupNPNByFEIN finds an agency's NPN using their Federal Employer
     * Identification Number (FEIN).
     * Use this endpoint to help agencies discover their NPN when they only know
     * their FEIN. This is common during onboarding when agencies may not have
     * their NPN readily available but know their tax identification number.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the EntityInfo lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - fein: Required, must be exactly 9 characters
     * Business logic validation:
     * - FEIN is looked up against NIPR database via free NIPR NPN Lookup API
     * - Agency with the given FEIN must exist in NIPR's records
     * Returns:
     * The agency's NPN if found in NIPR.
     * Common Error Codes:
     * - NOT_FOUND: No agency found in NIPR with the given FEIN
     * </pre>
     */
    public void lookupNPNByFEIN(com.producerflow.producer.v1.LookupNPNByFEINRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.LookupNPNByFEINResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLookupNPNByFEINMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResyncProducer triggers a manual resynchronization of a producer's data.
     * This can be used to refresh data after external change
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer ID is empty
     * </pre>
     */
    public void resyncProducer(com.producerflow.producer.v1.ResyncProducerRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ResyncProducerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResyncProducerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResyncAgency triggers a manual resynchronization of an agency's data. Similar
     * to ResyncProducer, this can be used to refresh data after external changes.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency ID is empty or request is empty
     * </pre>
     */
    public void resyncAgency(com.producerflow.producer.v1.ResyncAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ResyncAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResyncAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SyncProducerWithNIPR synchronizes a producer's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of producer data
     * from NIPR. The operation validates the producer NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Biographic information (name, DOB, state of domicile)
     * - Address by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Producer license data sync (if producer is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must have a valid NPN registered in NIPR
     * - Producer must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must have an NPN assigned (cannot sync a producer without NPN)
     * - Producer's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Producer must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout: 30 seconds. If NIPR takes longer, you'll receive a
     * DEADLINE_EXCEEDED error.
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist, doesn't belong to tenant, or NPN could
     *   not be found in NIPR. If the NPN cannot be found, the error message will
     *   be "producer NPN could not be found in NIPR".
     * - INVALID_ARGUMENT: Producer has no NPN.
     * - FAILED_PRECONDITION: Producer is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync took longer than 30 seconds
     * - INTERNAL: Unexpected error during NIPR lookup or sync process
     * </pre>
     */
    public void syncProducerWithNIPR(com.producerflow.producer.v1.SyncProducerWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SyncProducerWithNIPRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncProducerWithNIPRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SyncAgencyWithNIPR synchronizes an agency's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of agency data
     * from NIPR. The operation validates the agency NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - Agency biographic information (company name, FEIN, contact details)
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Address history by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Agency license data sync (if agency is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * - When sync_all_producers is true: additional calls per producer (license sync + PDB alerts)
     * Bulk Producer Sync:
     * When sync_all_producers is set to true, the system will also sync all
     * producers associated with the agency. This extends the timeout to 10
     * minutes to accommodate the additional operations. Each producer sync is
     * a separate billable NIPR lookup.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must have a valid NPN registered in NIPR
     * - Agency must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - sync_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Agency's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Agency must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout:
     * - 30 seconds when syncing agency only
     * - 10 minutes when sync_all_producers is true
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency NPN is not valid (not found in NIPR)
     * - FAILED_PRECONDITION: Agency is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync operation timed out (30s for agency only, 10m with sync_all_producers)
     * </pre>
     */
    public void syncAgencyWithNIPR(com.producerflow.producer.v1.SyncAgencyWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SyncAgencyWithNIPRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSyncAgencyWithNIPRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StopSyncProducerWithNIPR disables automatic NIPR synchronization for a producer.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific producer. Once stopped, the producer's NIPR data will no longer
     * be refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncProducerWithNIPR endpoint.
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must be in active or failing sync state (not already disabled/pending)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must be in ACTIVE or FAILING sync state (cannot stop if already
     *   DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Producer is already unsynced (DISABLED or PENDING sync state)
     * </pre>
     */
    public void stopSyncProducerWithNIPR(com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopSyncProducerWithNIPRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StopSyncAgencyWithNIPR disables automatic NIPR synchronization for an agency.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific agency. Once stopped, the agency's NIPR data will no longer be
     * refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncAgencyWithNIPR endpoint.
     * Bulk Producer Stop:
     * When stop_all_producers is set to true, the system will also stop sync for
     * all producers associated with the agency. This is useful when offboarding
     * an entire agency from NIPR synchronization. When this flag is set, the
     * precondition check for agency sync state is bypassed.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must be in active or failing sync state (unless stop_all_producers is true)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - stop_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Unless stop_all_producers is true, agency must be in ACTIVE or FAILING sync
     *   state (cannot stop if already DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Agency is already unsynced (DISABLED or PENDING sync state,
     *   unless stop_all_producers is true)
     * </pre>
     */
    public void stopSyncAgencyWithNIPR(com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopSyncAgencyWithNIPRMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateProducerUploadURL generates a secure URL for bulk producer uploads to
     * an existing agency.
     * Use this endpoint to create a shareable link that allows agencies to upload
     * multiple producers at once. The URL includes security tokens and tenant
     * context to ensure secure, authenticated access.
     * Unlike CreateProducerOnboardingURL which creates a self-service form for a
     * single producer, this endpoint generates a URL for bulk uploading producer
     * data (typically via CSV or spreadsheet format).
     * The agency is identified by its National Producer Number (NPN), which must
     * already exist in your tenant. Use ListAgencies or GetAgencyAndProducers to
     * look up agency NPNs if needed.
     * Typical Workflow:
     * 1. Generate producer upload URL using the agency's NPN
     * 2. Share URL with agency contact via email or portal
     * 3. Agency uploads producer data through the URL
     * 4. System processes uploads, validates NPNs with NIPR, and creates producer
     *    records
     * 5. Producers are associated with the agency and optionally synced with NIPR
     * URL Expiration:
     * The generated URL has a default expiration of 7 days. After expiration, a
     * new URL must be generated.
     * Validation Performed:
     * - Agency NPN format is valid (numeric string, 2-10 digits)
     * - Agency with the given NPN exists in your tenant
     * - Agency belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_npn: Required, must be 2-10 digits (numeric characters only)
     * Business logic validation:
     * - Agency with the given NPN must exist in the authenticated tenant
     * - Agency must belong to the authenticated tenant (ownership verification)
     * - Only one agency should match the NPN (multiple matches indicate data issue)
     * Returns:
     * A time-limited URL string that can be shared with the agency for bulk
     * producer uploads.
     * Common Error Codes:
     * - NOT_FOUND: No agency found with the given NPN in your tenant
     * </pre>
     */
    public void createProducerUploadURL(com.producerflow.producer.v1.CreateProducerUploadURLRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateProducerUploadURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProducerUploadURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AddAgencyLocations adds one or more locations to an existing agency.
     * Use this endpoint to programmatically add physical locations (offices,
     * branches, etc.) to an agency. Locations enable organizing producers by
     * their work sites and tracking agency presence across different addresses.
     * Bulk Operation Behavior:
     * This is an all-or-nothing operation - if any location fails validation,
     * the entire request will fail and no locations will be added. You can add
     * up to 100 locations in a single request.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - At least one location is provided
     * - Location names are unique within the agency (case-insensitive)
     * - Location names are not duplicated within the request
     * - Valid address information is provided for each location
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - locations: Required, 1-100 locations. Each location:
     *   - name: Required, must be non-empty (unique within agency)
     *   - address: Required
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - phone: Required, must match E.164 pattern (e.g., +15551234567)
     *   - email: Required, must be a valid email format
     *   - is_primary: Optional boolean, marks location as primary
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location names must be unique within the agency (case-insensitive)
     * - Location names must not duplicate any existing location names in the agency
     * - Location names must not duplicate other location names within the same request
     * Returns:
     * List of UUIDs for all created locations in the same order as the request.
     * This ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id, no locations provided, duplicate
     *   location names, or location with name already exists in agency
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void addAgencyLocations(com.producerflow.producer.v1.AddAgencyLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.AddAgencyLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAgencyLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RemoveAgencyLocations removes one or more locations from an agency.
     * Use this endpoint to delete locations that are no longer needed. This is
     * useful when closing branch offices or consolidating agency locations.
     * Producer Unassignment:
     * When a location is removed, all producers assigned to that location are
     * automatically unassigned. The producers themselves are not deleted - they
     * remain associated with the agency but without a location assignment.
     * Partial Success Behavior:
     * Locations that don't exist are silently ignored. The response contains only
     * the IDs of locations that were actually removed.
     * Validation Performed:
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location IDs that don't exist are silently ignored (partial success)
     * Returns:
     * List of UUIDs for locations that were successfully removed.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or no location_ids provided
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void removeAgencyLocations(com.producerflow.producer.v1.RemoveAgencyLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.RemoveAgencyLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveAgencyLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgencyLocations retrieves all locations associated with an agency.
     * Use this endpoint to fetch the complete list of physical locations
     * belonging to an agency. Each location includes its address, contact
     * information, and primary status.
     * The response includes complete location information:
     * - Location ID and name
     * - Physical address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location indicator
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all locations associated with the specified agency. Returns an
     * empty list if the agency has no locations.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Invalid request
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public void listAgencyLocations(com.producerflow.producer.v1.ListAgencyLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgencyLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgencyLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AssignProducerToLocations assigns one or more locations to a producer.
     * Use this endpoint to associate a producer with specific agency locations
     * (branch offices, work sites, etc.). A producer can be assigned to multiple
     * locations within their agency.
     * Location Ownership:
     * All specified locations must belong to the same agency as the producer.
     * Cross-agency location assignments are not permitted.
     * Idempotent Behavior:
     * If a producer is already assigned to a location, the assignment is
     * preserved without error. The response includes all successfully assigned
     * location IDs.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer's agency must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully assigned to the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing
     * - NOT_FOUND: Producer doesn't exist, agency doesn't exist, or specified
     *   locations don't exist
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    public void assignProducerToLocations(com.producerflow.producer.v1.AssignProducerToLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.AssignProducerToLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignProducerToLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UnassignProducerFromLocations removes one or more location assignments from
     * a producer.
     * Use this endpoint to disassociate a producer from specific agency locations.
     * This is useful when producers change work sites or when consolidating
     * location assignments.
     * Producer Preservation:
     * This operation only removes the location assignments - the producer remains
     * active and associated with the agency. To fully remove a producer, use the
     * appropriate producer deletion endpoint.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully unassigned from the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing, producer_id is empty, or no location_ids provided
     * - NOT_FOUND: Producer doesn't exist or specified locations don't exist
     * </pre>
     */
    public void unassignProducerFromLocations(com.producerflow.producer.v1.UnassignProducerFromLocationsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UnassignProducerFromLocationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnassignProducerFromLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAgencyLocation updates an existing agency location.
     * Use this endpoint to modify location details such as address, contact
     * information, or primary status. This is useful when locations move,
     * change phone numbers, or when designating a new primary location.
     * Updatable Fields:
     * - Name (must remain unique within the agency)
     * - Address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location status
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Name Uniqueness:
     * If updating the location name, the new name must not already exist for
     * another location within the same agency (case-insensitive comparison).
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_id: Required, must be a valid UUID format
     * - name: If provided, must be non-empty (unique within agency)
     * - address: If provided (all fields optional within):
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be exactly 2 characters (state code)
     *   - zip: If provided, must be 1-10 characters
     * - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     * - email: If provided, must be a valid email format
     * - is_primary: Optional boolean
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - location_id: Location must exist and belong to the specified agency
     * - name: If provided, must be unique within the agency (case-insensitive,
     *   excluding the location being updated)
     * Returns:
     * The complete updated location object with all current field values.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or location_id, or invalid request
     * - NOT_FOUND: Agency or location doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: New location name already exists within the agency
     * </pre>
     */
    public void updateAgencyLocation(com.producerflow.producer.v1.UpdateAgencyLocationRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateAgencyLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAgencyLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProducerService.
   * <pre>
   * ProducerService provides a comprehensive API for managing insurance
   * producers and agencies. This service simplifies producer and agency
   * onboarding, data synchronization, and integration with the National Insurance
   * Producer Registry (NIPR).
   * Key capabilities:
   * - Producer and agency onboarding with self-service URLs
   * - Automatic synchronization of license, appointment, and regulatory data from NIPR
   * - NPN (National Producer Number) validation and lookup
   * - Multi-location management for agencies
   * - Integration with NIPR PDB Gateway, PDB Alerts, and NPN Lookup services
   * NIPR Integration:
   * This service automatically fetches and maintains up-to-date licensing
   * information, carrier appointments, and regulatory actions from NIPR. Most
   * NIPR sync operations are billable and count against your monthly unique NPN
   * quota. Enable PDB Alerts synchronization to receive automatic daily updates
   * and reduce manual sync costs.
   * Authentication:
   * All endpoints require API key authentication provided via the Authorization header.
   * </pre>
   */
  public static final class ProducerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProducerServiceBlockingStub> {
    private ProducerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProducerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProducerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAgencyOnboardingURL generates a secure, pre-filled URL for agency
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links that can be
     * shared with agencies. The URL encodes agency defaults, tenant context, and
     * optional pre-filled information to streamline the onboarding experience.
     * All fields in the request are optional. Provide as much or as little
     * information as available - any missing data will be collected through the
     * onboarding flow.
     * Typical Workflow:
     * 1. Generate onboarding URL with optional pre-filled data (agency name, NPN,
     *    principal info)
     * 2. Share URL with agency contact via email or portal
     * 3. Agency completes onboarding form through the URL
     * 4. System validates NPN with NIPR and creates agency record
     * 5. Optionally sync with NIPR to fetch licenses and appointments
     * Validation Rules:
     * All fields in the request are optional. The system generates valid URLs
     * even with an empty request. When fields are provided:
     * - entity_type: Must be ENTITY_TYPE_SOLE_PROPRIETOR (1), ENTITY_TYPE_AGENCY (2),
     *   or ENTITY_TYPE_ASK_DURING_ONBOARDING (3). This is the only endpoint where
     *   ENTITY_TYPE_ASK_DURING_ONBOARDING is valid.
     * - email: Must be a valid email format if provided
     * - npn: Must be a valid NPN format (2-10 digits) if provided. Note that NPN
     *   validation against NIPR occurs during onboarding, not during URL generation.
     * - fein: Must be exactly 9 digits if provided
     * - organization_id: Must be a valid organization ID belonging to your tenant if provided
     * - principal.email: Must be a valid email format if provided
     * - principal.npn: Must be a valid NPN format (2-10 digits) if provided
     * - principal.tenant_id: Maximum 255 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the agency for
     * self-service onboarding.
     * </pre>
     */
    public com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse createAgencyOnboardingURL(com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAgencyOnboardingURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateProducerOnboardingURL generates a secure, pre-filled URL for producer
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links for individual
     * producers joining an existing agency. The URL can include optional
     * pre-filled data like NPN, name, email, and address to reduce manual data
     * entry.
     * The producer must be associated with an existing agency. Use
     * CreateAgencyOnboardingURL if you need to onboard an agency and its
     * principal together.
     * Typical Workflow:
     * 1. Generate producer onboarding URL with agency_id and optional pre-filled data
     * 2. Share URL with producer via email
     * 3. Producer completes onboarding form through the URL
     * 4. System validates NPN with NIPR and associates producer with agency
     * 5. Optionally sync with NIPR to fetch producer licenses and appointments
     * Validation Rules:
     * - agency_id: Required. must be a valid UUID of an agency belonging
     *   to your tenant.
     * - producer_data: All fields are optional. When provided:
     *   - npn: Must be a valid NPN format (1-10 characters). Note that NPN validation
     *     against NIPR occurs during onboarding, not during URL generation.
     *   - email: Must be a valid email format if provided
     *   - mailing_address.state: Must be exactly 2 characters (state code) if provided
     *   - mailing_address.zip: Must be 1-10 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the producer for
     * self-service onboarding.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Invalid NPN provided (not found in NIPR)
     * </pre>
     */
    public com.producerflow.producer.v1.CreateProducerOnboardingURLResponse createProducerOnboardingURL(com.producerflow.producer.v1.CreateProducerOnboardingURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProducerOnboardingURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewAgency creates a new agency with principal and optional additional producers.
     * This is the programmatic alternative to CreateAgencyOnboardingURL - use
     * this when you want to create agencies directly via API instead of through a
     * self-service form.
     * Entity Type Rules:
     * - ENTITY_TYPE_SOLE_PROPRIETOR: Individual producer operating as their own agency.
     *   Cannot have an agency NPN. Only the principal is created.
     * - ENTITY_TYPE_AGENCY: Standard insurance agency with multiple producers.
     *   Must provide either an NPN or FEIN. Can have multiple producers beyond the principal.
     * NIPR Validation and Sync:
     * The system performs free NIPR API lookups to validate NPNs before
     * creation. If sync_with_nipr is true (or tenant default), the system
     * performs paid NIPR EntityInfo lookups to fetch complete license, appointment,
     * and regulatory data.
     * Validation Performed:
     * - Required fields are present and valid
     * - Email addresses are unique within tenant
     * - Agency NPN exists in NIPR (if provided)
     * - Principal NPN exists in NIPR
     * - Entity type rules are followed
     * - Principal and subsequent producers last names must match NIPR records for the given NPN
     * Validation Rules:
     * Proto validation (format checks):
     * - agency: Required field containing all agency information
     * - agency.name: Required, must be non-empty
     * - agency.email: Required, must be a valid email format
     * - agency.phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     * - agency.entity_type: Required, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or
     *   ENTITY_TYPE_AGENCY (2). ENTITY_TYPE_ASK_DURING_ONBOARDING is NOT valid here.
     * - agency.fein: Optional, if provided must be exactly 9 digits. Required for
     *   ENTITY_TYPE_AGENCY if NPN is not provided.
     * - agency.principal: Required, contains principal producer information
     *   - principal.first_name: Required, must be non-empty
     *   - principal.last_name: Required, must be non-empty
     *   - principal.email: Required, must be a valid email format
     *   - principal.npn: Required, must be 1-10 characters
     *   - principal.phone: Optional, if provided must match E.164 pattern
     *   - principal.tenant_id: Optional, maximum 255 characters
     * - agency.bank_account (optional, if provided all subfields are required):
     *   - account_number: 8-17 characters
     *   - routing_number: Exactly 9 characters
     *   - account_type: Required, must be CHECKING (1) or SAVINGS (2)
     *   - account_holder_name: Required, must be non-empty
     * - agency.eo_info (optional, if provided):
     *   - carrier: Required, must be non-empty
     *   - expiration_date: Required, must be in the future
     *   - coverage_amount: Required, must be non-empty
     *   - effective_date: Required
     *   - per_occurrence: Required, must be non-empty
     * - agency.business_hours (optional, if provided):
     *   - timezone: Required, must be non-empty
     *   - business_hours: Required, at least one entry
     *     - week_days: Required, 1-7 days
     *     - opening_time: Required
     *     - closing_time: Required
     * - agency.producers: Optional list of additional producers (see NewProducer validation)
     * - agency.points_of_contact (optional, for each contact):
     *   - email: Required, must be a valid email format
     *   - role: Required
     * - agency.root_organization_id: Optional, if provided must be 1-36 characters
     * - agency.locations: Optional, maximum 100 locations
     * Business logic validation:
     * - agency.email: Must be unique within the tenant
     * - agency.npn: If provided, must exist in NIPR (validated via free NIPR lookup)
     * - principal.email: Must be unique within the tenant
     * - principal.npn: Must exist in NIPR (validated via free NIPR lookup)
     * - All producer emails must be unique within the tenant
     * Returns:
     * IDs of the created agency, principal, optional producers, and locations (if provided).
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields, entity type rule violations, or
     *   NPN not found in NIPR
     * - ALREADY_EXISTS: Email or NPN already registered in your tenant
     * </pre>
     */
    public com.producerflow.producer.v1.NewAgencyResponse newAgency(com.producerflow.producer.v1.NewAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewAgencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgencies retrieves a paginated list of agencies associated with the tenant.
     * This endpoint provides comprehensive agency listing with powerful filtering
     * capabilities to efficiently manage and search through large numbers of
     * agencies. Each agency in the response includes summary information for
     * quick overview without the full NIPR data.
     * Filtering Capabilities:
     * - Organization: Filter agencies belonging to a specific organization
     * - Search: Free-text search across agency name, NPN, and email
     * - Agency Type: Filter by internal (tenant) vs external agencies
     * - Entity Type: Filter by sole proprietor vs standard agency
     * - NIPR Sync Status: Filter by synchronization state (active, failing, pending, disabled)
     * The response uses cursor-based pagination for efficient data retrieval:
     * - Default page size is 50 if not specified
     * - Maximum page size is 200
     * - Results are ordered by creation date, most recent first
     * - Use the next_page_token to retrieve subsequent pages
     * Validation Rules:
     * All fields are optional filters:
     * - organization_id: If provided, must be a valid UUID format
     * - search_query: Optional free-text search string (case-insensitive, partial matching)
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * - agency_type: If provided, must be AGENCY_TYPE_INTERNAL (1) or AGENCY_TYPE_EXTERNAL (2)
     * - entity_type: If provided, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or ENTITY_TYPE_AGENCY (2)
     * - nipr_sync_statuses: Array of sync states to filter by (ACTIVE, FAILING, PENDING, DISABLED)
     * Returns:
     * A paginated list of AgencySummary objects containing essential agency
     * information without full NIPR data. Use GetAgencyAndProducers for complete
     * agency details including NIPR data.
     * </pre>
     */
    public com.producerflow.producer.v1.ListAgenciesResponse listAgencies(com.producerflow.producer.v1.ListAgenciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgenciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListOrganizations retrieves all organizations accessible to your tenant.
     * Organizations represent logical groupings or hierarchical structures for
     * managing agencies. They enable better organization of agencies into business
     * units, networks, or aggregator relationships. Each
     * organization can contain multiple agencies, allowing for hierarchical
     * management and reporting across your insurance distribution network.
     * Not all tenants use organizations - this list may be empty if your tenant
     * doesn't have organizational hierarchies enabled.
     * Validation Rules:
     * Proto validation (format checks):
     * All fields are optional:
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * Returns:
     * A list of all organizations accessible to your tenant, including their IDs,
     * names and external identifiers. Organizations are
     * returned in alphabetical order by name for consistent presentation.
     * </pre>
     */
    public com.producerflow.producer.v1.ListOrganizationsResponse listOrganizations(com.producerflow.producer.v1.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrganizationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetOrganization retrieves comprehensive details about a specific organization.
     * This endpoint returns complete organization information including all
     * agencies assigned to it. For each agency, it provides summary data including
     * appointment overview statistics and NIPR synchronization status. This allows
     * you to understand the full scope of an organization's agency network in a
     * single API call.
     * Validation Rules:
     * Proto validation (format checks):
     * - organization_id: Required, must be a valid UUID format
     * Returns:
     * Complete organization details including all assigned agencies with their
     * appointment overviews and sync statuses.
     * Common Error Codes:
     * - NOT_FOUND: Organization doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.GetOrganizationResponse getOrganization(com.producerflow.producer.v1.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization for the authenticated tenant.
     * Organizations are top-level groupings used to organize agencies within your
     * tenant. They can represent business units, regions, or any logical grouping
     * that makes sense for your operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - name: Required, must be non-empty
     * - external_id: Optional, your system's identifier for the organization
     * - email: Optional, contact email for the organization
     * Business logic validation:
     * - name: Must be unique within the tenant (case-insensitive)
     * Returns:
     * The UUID of the newly created organization, which can be used to assign
     * agencies to this organization.
     * Common Error Codes:
     * - ALREADY_EXISTS: Organization with the same name already exists in tenant
     * </pre>
     */
    public com.producerflow.producer.v1.CreateOrganizationResponse createOrganization(com.producerflow.producer.v1.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewProducer adds a single producer to an existing agency.
     * Use this endpoint to programmatically add producers to agencies. This is
     * the programmatic alternative to CreateProducerOnboardingURL.
     * NIPR Validation and Sync:
     * The system validates the provided NPN exists in NIPR using a free API
     * lookup. If sync_with_nipr is enabled, the system performs a paid NIPR
     * EntityInfo lookup to fetch complete license, appointment, and regulatory
     * data.
     * Validation Performed:
     * - Email is unique within tenant
     * - Agency exists and belongs to tenant
     * - NPN exists in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producer: Required, contains producer information
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - npn: Must exist in NIPR and the provided last name must match the NIPR records
     * - npn: Must be unique within the tenant (not already assigned to another producer)
     * - location_ids: All locations must exist and belong to the specified agency
     * Returns:
     * The UUID of the created producer.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * </pre>
     */
    public com.producerflow.producer.v1.NewProducerResponse newProducer(com.producerflow.producer.v1.NewProducerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewProducerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewProducers creates multiple producers in bulk and associates them with a single agency.
     * This endpoint provides an efficient way to onboard multiple producers to the same
     * agency in a single API call.
     * Bulk Operation Behavior:
     * Producers are created sequentially. If a producer fails validation, the request
     * returns an error, but any producers created before the failure will remain in
     * the system. Each producer in the request undergoes the same validation as
     * individual NewProducer calls.
     * NIPR Validation and Sync:
     * For each producer:
     * - The system performs a free NIPR API lookup to validate the NPN exists
     * - If sync_with_nipr is true (or tenant default), performs paid NIPR EntityInfo lookups
     * - All NIPR validations must succeed for the bulk operation to proceed
     * Validation Performed (for each producer):
     * - Required fields are present and valid (name, email, NPN)
     * - Email addresses are unique within the tenant
     * - Agency exists and belongs to the authenticated tenant
     * - NPNs exist in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * - Phone numbers match valid patterns (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producers: Required, must contain at least 1 producer. Each producer:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items per producer, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting for all producers
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - All producer emails must be unique within the tenant
     * - All producer NPNs must exist in NIPR, match the provided last name, and be unique within the tenant
     * - All location_ids must exist and belong to the specified agency
     * - This is an all-or-nothing operation: if any producer fails validation, no producers
     *   are created
     * Returns:
     * List of UUIDs for all created producers in the same order as the request. This
     * ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    public com.producerflow.producer.v1.NewProducersResponse newProducers(com.producerflow.producer.v1.NewProducersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewProducersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgencyAndProducers retrieves complete information for an agency and all
     * its producers.
     * This endpoint returns comprehensive agency details including:
     * - Agency contact information and business details
     * - Principal producer information
     * - Bank account for commission payments
     * - Errors &amp; Omissions insurance details
     * - Business hours and contact points
     * - NIPR synchronized data (licenses, appointments, regulatory actions, addresses)
     * - All associated producers with their NIPR data
     * - Agency locations
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * Agency object with complete NIPR data and list of all associated producers.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.GetAgencyAndProducersResponse getAgencyAndProducers(com.producerflow.producer.v1.GetAgencyAndProducersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgencyAndProducersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgency retrieves detailed information about a specific agency.
     * Supports two lookup methods:
     * - By agency ID (UUID)
     * - By tenant agency ID (external identifier)
     * This endpoint returns complete agency details including contact information,
     * addresses, bank account, E&amp;O coverage, principal information, NIPR data, and locations.
     * Use this when you need full agency information without the list of associated producers.
     * For agencies with their producers, use GetAgencyAndProducers instead.
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - agency_id_lookup.agency_id: Must be a valid UUID format
     * - tenant_agency_id_lookup.tenant_agency_id: Must be non-empty string
     * Returns:
     * Complete agency information including all NIPR data and locations.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - PERMISSION_DENIED: Tenant doesn't have access to the agency
     * </pre>
     */
    public com.producerflow.producer.v1.GetAgencyResponse getAgency(com.producerflow.producer.v1.GetAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetProducer retrieves detailed information about a specific producer.
     * Supports three lookup methods:
     * - By producer ID (UUID)
     * - By NPN (National Producer Number)
     * - By email address
     * The response includes:
     * - Producer contact information (name, email, phone, address)
     * - Associated agency information
     * - NIPR synchronized data:
     *   - State licenses with expiration dates and Lines of Authority (LOAs)
     *   - Biographic information (name, DOB, state of domicile)
     *   - Regulatory actions by state
     *   - Carrier appointments with status and renewal dates
     * - Location assignments
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - producer_id_lookup.producer_id: Must be a valid UUID format
     * - npn_lookup.producer_npn: Must be non-empty string
     * - email_lookup.email: Must be a valid email format
     * Returns:
     * Complete producer information including all NIPR data.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant, or
     *   associated agency not found
     * - UNIMPLEMENTED: Lookup method not supported (only producer_id, npn, and email
     *   lookups are implemented)
     * </pre>
     */
    public com.producerflow.producer.v1.GetProducerResponse getProducer(com.producerflow.producer.v1.GetProducerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProducerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAgencyFiles retrieves signed URLs for accessing agency documents.
     * Returns pre-signed URLs for the following document types:
     * - Errors &amp; Omissions (E&amp;O) insurance certificate
     * - Voided check for ACH commission payments
     * - W9 tax form
     * - License documents
     * - Broker bond documents
     * The URLs are time-limited and grant temporary read access to the documents.
     * Empty strings are returned for documents that haven't been uploaded.
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A set of pre-signed URLs for accessing agency documents.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.GetAgencyFilesResponse getAgencyFiles(com.producerflow.producer.v1.GetAgencyFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAgencyFilesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateProducer updates editable fields for an existing producer.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncProducerWithNIPR.
     * Updatable Fields:
     * - Contact information (first_name, last_name, middle_name, email, phone)
     * - Mailing address (street, city, state, zip)
     * - External metadata (for tenant-specific data)
     * Note: NPN cannot be updated after creation. The NPN field is deprecated
     * in UpdateProducerRequest.Producer and will be ignored.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply (e.g., valid email format, phone pattern)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - producer: Required, contains fields to update (all fields optional):
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - npn: Deprecated and ignored - NPN cannot be updated after creation
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be at most 2 characters
     *   - zip: If provided, must be at least 5 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer field is missing in request
     * </pre>
     */
    public com.producerflow.producer.v1.UpdateProducerResponse updateProducer(com.producerflow.producer.v1.UpdateProducerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProducerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgency updates editable fields for an existing agency.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncAgencyWithNIPR.
     * Updatable Fields:
     * - Contact details (email, phone, fax)
     * - Website URL
     * - Physical address components
     * - Requested appointments (state codes)
     * - Notes
     * - External metadata (for tenant-specific data)
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - agency: Required, contains fields to update (all fields optional):
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - fax: If provided, must match E.164 pattern
     *   - website: If provided, must be a valid URI format
     *   - requested_appointments: Array of unique 2-letter state codes (e.g., ["CA", "NY"])
     *   - notes: If provided, maximum 500 characters
     *   - physical_address (optional, if provided):
     *     - street: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: If changed, must be unique within the tenant (case-insensitive comparison)
     * - phone: If provided, must be a valid phone number format
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email already exists within tenant
     * - INVALID_ARGUMENT: Invalid phone number format or all address fields required
     *   when creating new address
     * </pre>
     */
    public com.producerflow.producer.v1.UpdateAgencyResponse updateAgency(com.producerflow.producer.v1.UpdateAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewContact creates a new contact associated with an agency.
     * Use this endpoint to programmatically add non-producer individuals to
     * agencies. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but need to be
     * associated with the agency for communication or administrative purposes.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contact: Required, contains contact information:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - role: If CONTACT_ROLE_PRINCIPAL, the agency must not already have a principal
     * Returns:
     * The UUID of the created contact.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields or invalid field format
     * - ALREADY_EXISTS: Email already registered in your tenant, or agency already has a principal
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.NewContactResponse newContact(com.producerflow.producer.v1.NewContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * NewContacts creates multiple contacts in bulk and associates them with a
     * single agency.
     * This endpoint provides an efficient way to add multiple non-producer
     * contacts to the same agency in a single API call. Contacts represent staff
     * members, administrators, or other personnel who are not licensed insurance
     * producers.
     * Partial Success Behavior:
     * Unlike bulk producer operations, this endpoint uses partial success
     * semantics. Contacts that pass validation are created even if other contacts
     * in the request fail. The response contains only the IDs of successfully
     * created contacts.
     * Validation Performed (for each contact):
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contacts: Required, must contain at least 1 contact. Each contact:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Each contact email: Must be unique within the tenant. Contacts with duplicate
     *   emails are skipped (partial success - other valid contacts are still created)
     * Returns:
     * List of UUIDs for successfully created contacts. If some contacts failed
     * validation, only the IDs of successfully created contacts are returned.
     * Failed contacts are logged but not included in the response. The order of
     * returned IDs corresponds to the order of successful contacts, not the
     * original request order.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.NewContactsResponse newContacts(com.producerflow.producer.v1.NewContactsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewContactsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgencyContacts retrieves all contacts associated with an agency.
     * Use this endpoint to fetch all non-producer contacts linked to a specific
     * agency. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but are associated with
     * the agency.
     * The response includes complete contact information:
     * - Personal details (name, email, phone)
     * - Role within the agency
     * - Mailing address
     * - NPN (if applicable)
     * - Creation timestamp
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all contacts associated with the specified agency. Returns an
     * empty list if the agency has no contacts.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.ListAgencyContactsResponse listAgencyContacts(com.producerflow.producer.v1.ListAgencyContactsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgencyContactsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateContact updates editable fields for an existing contact.
     * This endpoint allows updating contact information for non-producer personnel
     * associated with an agency. All fields are optional, enabling partial updates
     * where only specified fields are modified.
     * Updatable Fields:
     * - Name fields (first name, middle name, last name)
     * - Email address (must remain unique within tenant)
     * - Phone number
     * - Mailing address components
     * - Role within the agency
     * - External metadata (for tenant-specific data)
     * Validation Rules:
     * Proto validation (format checks):
     * - contact_id: Required, must be a valid UUID format
     * - contact: Required, contains the fields to update
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - role: If provided, must be non-empty
     *   - address (if provided, uses address_line_1 and address_line_2):
     *     - address_line_1: If provided, must be non-empty
     *     - address_line_2: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters (state code)
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - contact_id: Contact must exist and belong to the authenticated tenant
     * - email: If provided, must be unique within the tenant (across both producers and contacts)
     * Update Behavior:
     * - Only fields explicitly provided in the request are updated
     * - Omitted optional fields remain unchanged
     * - Empty strings are treated as clearing the field value
     * - Address updates are all-or-nothing (provide complete address or omit entirely)
     * Returns:
     * Empty response on success. The contact is updated atomically.
     * Common Error Codes:
     * - NOT_FOUND: Contact doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email is already in use by another producer or contact within the tenant
     * - INVALID_ARGUMENT: Validation failed for one or more fields
     * </pre>
     */
    public com.producerflow.producer.v1.UpdateContactResponse updateContact(com.producerflow.producer.v1.UpdateContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetExternalID sets an external identifier for a producer, agency, contact,
     * or organization.
     * Use this endpoint to link ProducerFlow entities to corresponding records in
     * your external systems (CRM, AMS, legacy databases). This enables bi-directional
     * synchronization and lookups across systems.
     * Supported Entity Types:
     * - Producer: Links a producer to an external system record
     * - Agency: Links an agency to an external system record
     * - Contact: Links a contact to an external system record
     * - Organization: Links an organization to an external system record
     * Exactly one entity type must be specified per request.
     * Validation Performed:
     * - Exactly one entity ID is provided (producer_id, agency_id, contact_id, or organization_id)
     * - The external ID (tenant_id) is non-empty and at most 255 characters
     * - The external ID is unique within the tenant (not already assigned to another entity)
     * - The specified entity exists and belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one entity ID must be provided (oneof required):
     * - producer_id: Must be a valid UUID format
     * - agency_id: Must be a valid UUID format
     * - contact_id: Must be a valid UUID format
     * - organization_id: Must be a valid UUID format
     * Required field:
     * - tenant_id: Required, must be 1-255 characters (the external identifier to assign)
     * Business logic validation:
     * - tenant_id: Must be unique within the tenant (not already assigned to any other entity)
     * - Entity must exist and belong to the authenticated tenant:
     *   - Producer: Verified via tenant-scoped lookup
     *   - Contact: Verified via tenant-scoped lookup
     *   - Agency: Verified via tenant-scoped lookup and tenant ownership check
     *   - Organization: Verified via tenant-scoped lookup and tenant ownership check
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - INVALID_ARGUMENT: No entity ID provided or external ID validation failed
     * - NOT_FOUND: The specified entity doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: The external ID is already assigned to another entity in the tenant
     * - PERMISSION_DENIED: The entity doesn't belong to the authenticated tenant
     * </pre>
     */
    public com.producerflow.producer.v1.SetExternalIDResponse setExternalID(com.producerflow.producer.v1.SetExternalIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetExternalIDMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateProducerNPN checks whether a producer's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an NPN is valid before creating a producer. This
     * is a free NIPR API lookup that does not count against your monthly billing
     * quota.
     * Validation Modes:
     * - NPN only: Validates that the NPN exists in NIPR
     * - NPN with name: Validates that the NPN exists AND the name matches the NIPR
     *   record (recommended for additional verification)
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the other NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * - name: Optional, if provided validates NPN matches this producer name in NIPR
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - If name is provided, both NPN and name must match a producer record in NIPR
     * - If name is not provided, only NPN existence is verified
     * Returns:
     * A boolean indicating whether the NPN is valid. Returns true if the NPN exists
     * in NIPR (and name matches, if provided), false otherwise.
     * </pre>
     */
    public com.producerflow.producer.v1.ValidateProducerNPNResponse validateProducerNPN(com.producerflow.producer.v1.ValidateProducerNPNRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateProducerNPNMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ValidateAgencyNPN checks whether an agency's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an agency NPN is valid before creating an agency.
     * This is a free NIPR API lookup that does not count against your monthly
     * billing quota.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - Agency NPN must exist in NIPR's agency records
     * Returns:
     * A boolean indicating whether the agency NPN is valid. Returns true if the NPN
     * exists in NIPR, false otherwise.
     * </pre>
     */
    public com.producerflow.producer.v1.ValidateAgencyNPNResponse validateAgencyNPN(com.producerflow.producer.v1.ValidateAgencyNPNRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateAgencyNPNMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * LookupNPNByFEIN finds an agency's NPN using their Federal Employer
     * Identification Number (FEIN).
     * Use this endpoint to help agencies discover their NPN when they only know
     * their FEIN. This is common during onboarding when agencies may not have
     * their NPN readily available but know their tax identification number.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the EntityInfo lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - fein: Required, must be exactly 9 characters
     * Business logic validation:
     * - FEIN is looked up against NIPR database via free NIPR NPN Lookup API
     * - Agency with the given FEIN must exist in NIPR's records
     * Returns:
     * The agency's NPN if found in NIPR.
     * Common Error Codes:
     * - NOT_FOUND: No agency found in NIPR with the given FEIN
     * </pre>
     */
    public com.producerflow.producer.v1.LookupNPNByFEINResponse lookupNPNByFEIN(com.producerflow.producer.v1.LookupNPNByFEINRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLookupNPNByFEINMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResyncProducer triggers a manual resynchronization of a producer's data.
     * This can be used to refresh data after external change
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer ID is empty
     * </pre>
     */
    public com.producerflow.producer.v1.ResyncProducerResponse resyncProducer(com.producerflow.producer.v1.ResyncProducerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResyncProducerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResyncAgency triggers a manual resynchronization of an agency's data. Similar
     * to ResyncProducer, this can be used to refresh data after external changes.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency ID is empty or request is empty
     * </pre>
     */
    public com.producerflow.producer.v1.ResyncAgencyResponse resyncAgency(com.producerflow.producer.v1.ResyncAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResyncAgencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SyncProducerWithNIPR synchronizes a producer's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of producer data
     * from NIPR. The operation validates the producer NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Biographic information (name, DOB, state of domicile)
     * - Address by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Producer license data sync (if producer is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must have a valid NPN registered in NIPR
     * - Producer must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must have an NPN assigned (cannot sync a producer without NPN)
     * - Producer's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Producer must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout: 30 seconds. If NIPR takes longer, you'll receive a
     * DEADLINE_EXCEEDED error.
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist, doesn't belong to tenant, or NPN could
     *   not be found in NIPR. If the NPN cannot be found, the error message will
     *   be "producer NPN could not be found in NIPR".
     * - INVALID_ARGUMENT: Producer has no NPN.
     * - FAILED_PRECONDITION: Producer is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync took longer than 30 seconds
     * - INTERNAL: Unexpected error during NIPR lookup or sync process
     * </pre>
     */
    public com.producerflow.producer.v1.SyncProducerWithNIPRResponse syncProducerWithNIPR(com.producerflow.producer.v1.SyncProducerWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncProducerWithNIPRMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SyncAgencyWithNIPR synchronizes an agency's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of agency data
     * from NIPR. The operation validates the agency NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - Agency biographic information (company name, FEIN, contact details)
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Address history by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Agency license data sync (if agency is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * - When sync_all_producers is true: additional calls per producer (license sync + PDB alerts)
     * Bulk Producer Sync:
     * When sync_all_producers is set to true, the system will also sync all
     * producers associated with the agency. This extends the timeout to 10
     * minutes to accommodate the additional operations. Each producer sync is
     * a separate billable NIPR lookup.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must have a valid NPN registered in NIPR
     * - Agency must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - sync_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Agency's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Agency must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout:
     * - 30 seconds when syncing agency only
     * - 10 minutes when sync_all_producers is true
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency NPN is not valid (not found in NIPR)
     * - FAILED_PRECONDITION: Agency is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync operation timed out (30s for agency only, 10m with sync_all_producers)
     * </pre>
     */
    public com.producerflow.producer.v1.SyncAgencyWithNIPRResponse syncAgencyWithNIPR(com.producerflow.producer.v1.SyncAgencyWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSyncAgencyWithNIPRMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StopSyncProducerWithNIPR disables automatic NIPR synchronization for a producer.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific producer. Once stopped, the producer's NIPR data will no longer
     * be refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncProducerWithNIPR endpoint.
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must be in active or failing sync state (not already disabled/pending)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must be in ACTIVE or FAILING sync state (cannot stop if already
     *   DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Producer is already unsynced (DISABLED or PENDING sync state)
     * </pre>
     */
    public com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse stopSyncProducerWithNIPR(com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopSyncProducerWithNIPRMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StopSyncAgencyWithNIPR disables automatic NIPR synchronization for an agency.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific agency. Once stopped, the agency's NIPR data will no longer be
     * refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncAgencyWithNIPR endpoint.
     * Bulk Producer Stop:
     * When stop_all_producers is set to true, the system will also stop sync for
     * all producers associated with the agency. This is useful when offboarding
     * an entire agency from NIPR synchronization. When this flag is set, the
     * precondition check for agency sync state is bypassed.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must be in active or failing sync state (unless stop_all_producers is true)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - stop_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Unless stop_all_producers is true, agency must be in ACTIVE or FAILING sync
     *   state (cannot stop if already DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Agency is already unsynced (DISABLED or PENDING sync state,
     *   unless stop_all_producers is true)
     * </pre>
     */
    public com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse stopSyncAgencyWithNIPR(com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopSyncAgencyWithNIPRMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateProducerUploadURL generates a secure URL for bulk producer uploads to
     * an existing agency.
     * Use this endpoint to create a shareable link that allows agencies to upload
     * multiple producers at once. The URL includes security tokens and tenant
     * context to ensure secure, authenticated access.
     * Unlike CreateProducerOnboardingURL which creates a self-service form for a
     * single producer, this endpoint generates a URL for bulk uploading producer
     * data (typically via CSV or spreadsheet format).
     * The agency is identified by its National Producer Number (NPN), which must
     * already exist in your tenant. Use ListAgencies or GetAgencyAndProducers to
     * look up agency NPNs if needed.
     * Typical Workflow:
     * 1. Generate producer upload URL using the agency's NPN
     * 2. Share URL with agency contact via email or portal
     * 3. Agency uploads producer data through the URL
     * 4. System processes uploads, validates NPNs with NIPR, and creates producer
     *    records
     * 5. Producers are associated with the agency and optionally synced with NIPR
     * URL Expiration:
     * The generated URL has a default expiration of 7 days. After expiration, a
     * new URL must be generated.
     * Validation Performed:
     * - Agency NPN format is valid (numeric string, 2-10 digits)
     * - Agency with the given NPN exists in your tenant
     * - Agency belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_npn: Required, must be 2-10 digits (numeric characters only)
     * Business logic validation:
     * - Agency with the given NPN must exist in the authenticated tenant
     * - Agency must belong to the authenticated tenant (ownership verification)
     * - Only one agency should match the NPN (multiple matches indicate data issue)
     * Returns:
     * A time-limited URL string that can be shared with the agency for bulk
     * producer uploads.
     * Common Error Codes:
     * - NOT_FOUND: No agency found with the given NPN in your tenant
     * </pre>
     */
    public com.producerflow.producer.v1.CreateProducerUploadURLResponse createProducerUploadURL(com.producerflow.producer.v1.CreateProducerUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProducerUploadURLMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AddAgencyLocations adds one or more locations to an existing agency.
     * Use this endpoint to programmatically add physical locations (offices,
     * branches, etc.) to an agency. Locations enable organizing producers by
     * their work sites and tracking agency presence across different addresses.
     * Bulk Operation Behavior:
     * This is an all-or-nothing operation - if any location fails validation,
     * the entire request will fail and no locations will be added. You can add
     * up to 100 locations in a single request.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - At least one location is provided
     * - Location names are unique within the agency (case-insensitive)
     * - Location names are not duplicated within the request
     * - Valid address information is provided for each location
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - locations: Required, 1-100 locations. Each location:
     *   - name: Required, must be non-empty (unique within agency)
     *   - address: Required
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - phone: Required, must match E.164 pattern (e.g., +15551234567)
     *   - email: Required, must be a valid email format
     *   - is_primary: Optional boolean, marks location as primary
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location names must be unique within the agency (case-insensitive)
     * - Location names must not duplicate any existing location names in the agency
     * - Location names must not duplicate other location names within the same request
     * Returns:
     * List of UUIDs for all created locations in the same order as the request.
     * This ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id, no locations provided, duplicate
     *   location names, or location with name already exists in agency
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.AddAgencyLocationsResponse addAgencyLocations(com.producerflow.producer.v1.AddAgencyLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAgencyLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RemoveAgencyLocations removes one or more locations from an agency.
     * Use this endpoint to delete locations that are no longer needed. This is
     * useful when closing branch offices or consolidating agency locations.
     * Producer Unassignment:
     * When a location is removed, all producers assigned to that location are
     * automatically unassigned. The producers themselves are not deleted - they
     * remain associated with the agency but without a location assignment.
     * Partial Success Behavior:
     * Locations that don't exist are silently ignored. The response contains only
     * the IDs of locations that were actually removed.
     * Validation Performed:
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location IDs that don't exist are silently ignored (partial success)
     * Returns:
     * List of UUIDs for locations that were successfully removed.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or no location_ids provided
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.RemoveAgencyLocationsResponse removeAgencyLocations(com.producerflow.producer.v1.RemoveAgencyLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveAgencyLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgencyLocations retrieves all locations associated with an agency.
     * Use this endpoint to fetch the complete list of physical locations
     * belonging to an agency. Each location includes its address, contact
     * information, and primary status.
     * The response includes complete location information:
     * - Location ID and name
     * - Physical address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location indicator
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all locations associated with the specified agency. Returns an
     * empty list if the agency has no locations.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Invalid request
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.producerflow.producer.v1.ListAgencyLocationsResponse listAgencyLocations(com.producerflow.producer.v1.ListAgencyLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgencyLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AssignProducerToLocations assigns one or more locations to a producer.
     * Use this endpoint to associate a producer with specific agency locations
     * (branch offices, work sites, etc.). A producer can be assigned to multiple
     * locations within their agency.
     * Location Ownership:
     * All specified locations must belong to the same agency as the producer.
     * Cross-agency location assignments are not permitted.
     * Idempotent Behavior:
     * If a producer is already assigned to a location, the assignment is
     * preserved without error. The response includes all successfully assigned
     * location IDs.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer's agency must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully assigned to the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing
     * - NOT_FOUND: Producer doesn't exist, agency doesn't exist, or specified
     *   locations don't exist
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    public com.producerflow.producer.v1.AssignProducerToLocationsResponse assignProducerToLocations(com.producerflow.producer.v1.AssignProducerToLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignProducerToLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UnassignProducerFromLocations removes one or more location assignments from
     * a producer.
     * Use this endpoint to disassociate a producer from specific agency locations.
     * This is useful when producers change work sites or when consolidating
     * location assignments.
     * Producer Preservation:
     * This operation only removes the location assignments - the producer remains
     * active and associated with the agency. To fully remove a producer, use the
     * appropriate producer deletion endpoint.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully unassigned from the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing, producer_id is empty, or no location_ids provided
     * - NOT_FOUND: Producer doesn't exist or specified locations don't exist
     * </pre>
     */
    public com.producerflow.producer.v1.UnassignProducerFromLocationsResponse unassignProducerFromLocations(com.producerflow.producer.v1.UnassignProducerFromLocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnassignProducerFromLocationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAgencyLocation updates an existing agency location.
     * Use this endpoint to modify location details such as address, contact
     * information, or primary status. This is useful when locations move,
     * change phone numbers, or when designating a new primary location.
     * Updatable Fields:
     * - Name (must remain unique within the agency)
     * - Address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location status
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Name Uniqueness:
     * If updating the location name, the new name must not already exist for
     * another location within the same agency (case-insensitive comparison).
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_id: Required, must be a valid UUID format
     * - name: If provided, must be non-empty (unique within agency)
     * - address: If provided (all fields optional within):
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be exactly 2 characters (state code)
     *   - zip: If provided, must be 1-10 characters
     * - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     * - email: If provided, must be a valid email format
     * - is_primary: Optional boolean
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - location_id: Location must exist and belong to the specified agency
     * - name: If provided, must be unique within the agency (case-insensitive,
     *   excluding the location being updated)
     * Returns:
     * The complete updated location object with all current field values.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or location_id, or invalid request
     * - NOT_FOUND: Agency or location doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: New location name already exists within the agency
     * </pre>
     */
    public com.producerflow.producer.v1.UpdateAgencyLocationResponse updateAgencyLocation(com.producerflow.producer.v1.UpdateAgencyLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAgencyLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProducerService.
   * <pre>
   * ProducerService provides a comprehensive API for managing insurance
   * producers and agencies. This service simplifies producer and agency
   * onboarding, data synchronization, and integration with the National Insurance
   * Producer Registry (NIPR).
   * Key capabilities:
   * - Producer and agency onboarding with self-service URLs
   * - Automatic synchronization of license, appointment, and regulatory data from NIPR
   * - NPN (National Producer Number) validation and lookup
   * - Multi-location management for agencies
   * - Integration with NIPR PDB Gateway, PDB Alerts, and NPN Lookup services
   * NIPR Integration:
   * This service automatically fetches and maintains up-to-date licensing
   * information, carrier appointments, and regulatory actions from NIPR. Most
   * NIPR sync operations are billable and count against your monthly unique NPN
   * quota. Enable PDB Alerts synchronization to receive automatic daily updates
   * and reduce manual sync costs.
   * Authentication:
   * All endpoints require API key authentication provided via the Authorization header.
   * </pre>
   */
  public static final class ProducerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProducerServiceFutureStub> {
    private ProducerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProducerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProducerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateAgencyOnboardingURL generates a secure, pre-filled URL for agency
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links that can be
     * shared with agencies. The URL encodes agency defaults, tenant context, and
     * optional pre-filled information to streamline the onboarding experience.
     * All fields in the request are optional. Provide as much or as little
     * information as available - any missing data will be collected through the
     * onboarding flow.
     * Typical Workflow:
     * 1. Generate onboarding URL with optional pre-filled data (agency name, NPN,
     *    principal info)
     * 2. Share URL with agency contact via email or portal
     * 3. Agency completes onboarding form through the URL
     * 4. System validates NPN with NIPR and creates agency record
     * 5. Optionally sync with NIPR to fetch licenses and appointments
     * Validation Rules:
     * All fields in the request are optional. The system generates valid URLs
     * even with an empty request. When fields are provided:
     * - entity_type: Must be ENTITY_TYPE_SOLE_PROPRIETOR (1), ENTITY_TYPE_AGENCY (2),
     *   or ENTITY_TYPE_ASK_DURING_ONBOARDING (3). This is the only endpoint where
     *   ENTITY_TYPE_ASK_DURING_ONBOARDING is valid.
     * - email: Must be a valid email format if provided
     * - npn: Must be a valid NPN format (2-10 digits) if provided. Note that NPN
     *   validation against NIPR occurs during onboarding, not during URL generation.
     * - fein: Must be exactly 9 digits if provided
     * - organization_id: Must be a valid organization ID belonging to your tenant if provided
     * - principal.email: Must be a valid email format if provided
     * - principal.npn: Must be a valid NPN format (2-10 digits) if provided
     * - principal.tenant_id: Maximum 255 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the agency for
     * self-service onboarding.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse> createAgencyOnboardingURL(
        com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAgencyOnboardingURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateProducerOnboardingURL generates a secure, pre-filled URL for producer
     * self-onboarding.
     * Use this endpoint to create personalized onboarding links for individual
     * producers joining an existing agency. The URL can include optional
     * pre-filled data like NPN, name, email, and address to reduce manual data
     * entry.
     * The producer must be associated with an existing agency. Use
     * CreateAgencyOnboardingURL if you need to onboard an agency and its
     * principal together.
     * Typical Workflow:
     * 1. Generate producer onboarding URL with agency_id and optional pre-filled data
     * 2. Share URL with producer via email
     * 3. Producer completes onboarding form through the URL
     * 4. System validates NPN with NIPR and associates producer with agency
     * 5. Optionally sync with NIPR to fetch producer licenses and appointments
     * Validation Rules:
     * - agency_id: Required. must be a valid UUID of an agency belonging
     *   to your tenant.
     * - producer_data: All fields are optional. When provided:
     *   - npn: Must be a valid NPN format (1-10 characters). Note that NPN validation
     *     against NIPR occurs during onboarding, not during URL generation.
     *   - email: Must be a valid email format if provided
     *   - mailing_address.state: Must be exactly 2 characters (state code) if provided
     *   - mailing_address.zip: Must be 1-10 characters if provided
     * Returns:
     * A time-limited URL string that can be shared with the producer for
     * self-service onboarding.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Invalid NPN provided (not found in NIPR)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.CreateProducerOnboardingURLResponse> createProducerOnboardingURL(
        com.producerflow.producer.v1.CreateProducerOnboardingURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProducerOnboardingURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewAgency creates a new agency with principal and optional additional producers.
     * This is the programmatic alternative to CreateAgencyOnboardingURL - use
     * this when you want to create agencies directly via API instead of through a
     * self-service form.
     * Entity Type Rules:
     * - ENTITY_TYPE_SOLE_PROPRIETOR: Individual producer operating as their own agency.
     *   Cannot have an agency NPN. Only the principal is created.
     * - ENTITY_TYPE_AGENCY: Standard insurance agency with multiple producers.
     *   Must provide either an NPN or FEIN. Can have multiple producers beyond the principal.
     * NIPR Validation and Sync:
     * The system performs free NIPR API lookups to validate NPNs before
     * creation. If sync_with_nipr is true (or tenant default), the system
     * performs paid NIPR EntityInfo lookups to fetch complete license, appointment,
     * and regulatory data.
     * Validation Performed:
     * - Required fields are present and valid
     * - Email addresses are unique within tenant
     * - Agency NPN exists in NIPR (if provided)
     * - Principal NPN exists in NIPR
     * - Entity type rules are followed
     * - Principal and subsequent producers last names must match NIPR records for the given NPN
     * Validation Rules:
     * Proto validation (format checks):
     * - agency: Required field containing all agency information
     * - agency.name: Required, must be non-empty
     * - agency.email: Required, must be a valid email format
     * - agency.phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     * - agency.entity_type: Required, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or
     *   ENTITY_TYPE_AGENCY (2). ENTITY_TYPE_ASK_DURING_ONBOARDING is NOT valid here.
     * - agency.fein: Optional, if provided must be exactly 9 digits. Required for
     *   ENTITY_TYPE_AGENCY if NPN is not provided.
     * - agency.principal: Required, contains principal producer information
     *   - principal.first_name: Required, must be non-empty
     *   - principal.last_name: Required, must be non-empty
     *   - principal.email: Required, must be a valid email format
     *   - principal.npn: Required, must be 1-10 characters
     *   - principal.phone: Optional, if provided must match E.164 pattern
     *   - principal.tenant_id: Optional, maximum 255 characters
     * - agency.bank_account (optional, if provided all subfields are required):
     *   - account_number: 8-17 characters
     *   - routing_number: Exactly 9 characters
     *   - account_type: Required, must be CHECKING (1) or SAVINGS (2)
     *   - account_holder_name: Required, must be non-empty
     * - agency.eo_info (optional, if provided):
     *   - carrier: Required, must be non-empty
     *   - expiration_date: Required, must be in the future
     *   - coverage_amount: Required, must be non-empty
     *   - effective_date: Required
     *   - per_occurrence: Required, must be non-empty
     * - agency.business_hours (optional, if provided):
     *   - timezone: Required, must be non-empty
     *   - business_hours: Required, at least one entry
     *     - week_days: Required, 1-7 days
     *     - opening_time: Required
     *     - closing_time: Required
     * - agency.producers: Optional list of additional producers (see NewProducer validation)
     * - agency.points_of_contact (optional, for each contact):
     *   - email: Required, must be a valid email format
     *   - role: Required
     * - agency.root_organization_id: Optional, if provided must be 1-36 characters
     * - agency.locations: Optional, maximum 100 locations
     * Business logic validation:
     * - agency.email: Must be unique within the tenant
     * - agency.npn: If provided, must exist in NIPR (validated via free NIPR lookup)
     * - principal.email: Must be unique within the tenant
     * - principal.npn: Must exist in NIPR (validated via free NIPR lookup)
     * - All producer emails must be unique within the tenant
     * Returns:
     * IDs of the created agency, principal, optional producers, and locations (if provided).
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields, entity type rule violations, or
     *   NPN not found in NIPR
     * - ALREADY_EXISTS: Email or NPN already registered in your tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.NewAgencyResponse> newAgency(
        com.producerflow.producer.v1.NewAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewAgencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgencies retrieves a paginated list of agencies associated with the tenant.
     * This endpoint provides comprehensive agency listing with powerful filtering
     * capabilities to efficiently manage and search through large numbers of
     * agencies. Each agency in the response includes summary information for
     * quick overview without the full NIPR data.
     * Filtering Capabilities:
     * - Organization: Filter agencies belonging to a specific organization
     * - Search: Free-text search across agency name, NPN, and email
     * - Agency Type: Filter by internal (tenant) vs external agencies
     * - Entity Type: Filter by sole proprietor vs standard agency
     * - NIPR Sync Status: Filter by synchronization state (active, failing, pending, disabled)
     * The response uses cursor-based pagination for efficient data retrieval:
     * - Default page size is 50 if not specified
     * - Maximum page size is 200
     * - Results are ordered by creation date, most recent first
     * - Use the next_page_token to retrieve subsequent pages
     * Validation Rules:
     * All fields are optional filters:
     * - organization_id: If provided, must be a valid UUID format
     * - search_query: Optional free-text search string (case-insensitive, partial matching)
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * - agency_type: If provided, must be AGENCY_TYPE_INTERNAL (1) or AGENCY_TYPE_EXTERNAL (2)
     * - entity_type: If provided, must be ENTITY_TYPE_SOLE_PROPRIETOR (1) or ENTITY_TYPE_AGENCY (2)
     * - nipr_sync_statuses: Array of sync states to filter by (ACTIVE, FAILING, PENDING, DISABLED)
     * Returns:
     * A paginated list of AgencySummary objects containing essential agency
     * information without full NIPR data. Use GetAgencyAndProducers for complete
     * agency details including NIPR data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ListAgenciesResponse> listAgencies(
        com.producerflow.producer.v1.ListAgenciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgenciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListOrganizations retrieves all organizations accessible to your tenant.
     * Organizations represent logical groupings or hierarchical structures for
     * managing agencies. They enable better organization of agencies into business
     * units, networks, or aggregator relationships. Each
     * organization can contain multiple agencies, allowing for hierarchical
     * management and reporting across your insurance distribution network.
     * Not all tenants use organizations - this list may be empty if your tenant
     * doesn't have organizational hierarchies enabled.
     * Validation Rules:
     * Proto validation (format checks):
     * All fields are optional:
     * - pagination.page_size: Must be &lt;= 200. Default is 50 if not specified.
     * - pagination.page_token: Opaque token from previous response for pagination
     * Returns:
     * A list of all organizations accessible to your tenant, including their IDs,
     * names and external identifiers. Organizations are
     * returned in alphabetical order by name for consistent presentation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ListOrganizationsResponse> listOrganizations(
        com.producerflow.producer.v1.ListOrganizationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrganizationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetOrganization retrieves comprehensive details about a specific organization.
     * This endpoint returns complete organization information including all
     * agencies assigned to it. For each agency, it provides summary data including
     * appointment overview statistics and NIPR synchronization status. This allows
     * you to understand the full scope of an organization's agency network in a
     * single API call.
     * Validation Rules:
     * Proto validation (format checks):
     * - organization_id: Required, must be a valid UUID format
     * Returns:
     * Complete organization details including all assigned agencies with their
     * appointment overviews and sync statuses.
     * Common Error Codes:
     * - NOT_FOUND: Organization doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.GetOrganizationResponse> getOrganization(
        com.producerflow.producer.v1.GetOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateOrganization creates a new organization for the authenticated tenant.
     * Organizations are top-level groupings used to organize agencies within your
     * tenant. They can represent business units, regions, or any logical grouping
     * that makes sense for your operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - name: Required, must be non-empty
     * - external_id: Optional, your system's identifier for the organization
     * - email: Optional, contact email for the organization
     * Business logic validation:
     * - name: Must be unique within the tenant (case-insensitive)
     * Returns:
     * The UUID of the newly created organization, which can be used to assign
     * agencies to this organization.
     * Common Error Codes:
     * - ALREADY_EXISTS: Organization with the same name already exists in tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.CreateOrganizationResponse> createOrganization(
        com.producerflow.producer.v1.CreateOrganizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewProducer adds a single producer to an existing agency.
     * Use this endpoint to programmatically add producers to agencies. This is
     * the programmatic alternative to CreateProducerOnboardingURL.
     * NIPR Validation and Sync:
     * The system validates the provided NPN exists in NIPR using a free API
     * lookup. If sync_with_nipr is enabled, the system performs a paid NIPR
     * EntityInfo lookup to fetch complete license, appointment, and regulatory
     * data.
     * Validation Performed:
     * - Email is unique within tenant
     * - Agency exists and belongs to tenant
     * - NPN exists in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producer: Required, contains producer information
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - npn: Must exist in NIPR and the provided last name must match the NIPR records
     * - npn: Must be unique within the tenant (not already assigned to another producer)
     * - location_ids: All locations must exist and belong to the specified agency
     * Returns:
     * The UUID of the created producer.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.NewProducerResponse> newProducer(
        com.producerflow.producer.v1.NewProducerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewProducerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewProducers creates multiple producers in bulk and associates them with a single agency.
     * This endpoint provides an efficient way to onboard multiple producers to the same
     * agency in a single API call.
     * Bulk Operation Behavior:
     * Producers are created sequentially. If a producer fails validation, the request
     * returns an error, but any producers created before the failure will remain in
     * the system. Each producer in the request undergoes the same validation as
     * individual NewProducer calls.
     * NIPR Validation and Sync:
     * For each producer:
     * - The system performs a free NIPR API lookup to validate the NPN exists
     * - If sync_with_nipr is true (or tenant default), performs paid NIPR EntityInfo lookups
     * - All NIPR validations must succeed for the bulk operation to proceed
     * Validation Performed (for each producer):
     * - Required fields are present and valid (name, email, NPN)
     * - Email addresses are unique within the tenant
     * - Agency exists and belongs to the authenticated tenant
     * - NPNs exist in NIPR
     * - Location IDs exist and belong to the agency (if provided)
     * - Phone numbers match valid patterns (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - producers: Required, must contain at least 1 producer. Each producer:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - npn: Required, used for NIPR validation
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - mailing_address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - location_ids: Optional, maximum 100 items per producer, each must be a valid UUID
     * - sync_with_nipr: Optional, overrides tenant default NIPR sync setting for all producers
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - All producer emails must be unique within the tenant
     * - All producer NPNs must exist in NIPR, match the provided last name, and be unique within the tenant
     * - All location_ids must exist and belong to the specified agency
     * - This is an all-or-nothing operation: if any producer fails validation, no producers
     *   are created
     * Returns:
     * List of UUIDs for all created producers in the same order as the request. This
     * ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or producer NPN not found in NIPR
     * - ALREADY_EXISTS: Producer with email or NPN already exists in tenant
     * - INVALID_ARGUMENT: Producer NPN is required (when NPN validation is enabled)
     * - FAILED_PRECONDITION: Producer name does not match NIPR records for the provided NPN
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.NewProducersResponse> newProducers(
        com.producerflow.producer.v1.NewProducersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewProducersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgencyAndProducers retrieves complete information for an agency and all
     * its producers.
     * This endpoint returns comprehensive agency details including:
     * - Agency contact information and business details
     * - Principal producer information
     * - Bank account for commission payments
     * - Errors &amp; Omissions insurance details
     * - Business hours and contact points
     * - NIPR synchronized data (licenses, appointments, regulatory actions, addresses)
     * - All associated producers with their NIPR data
     * - Agency locations
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * Agency object with complete NIPR data and list of all associated producers.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.GetAgencyAndProducersResponse> getAgencyAndProducers(
        com.producerflow.producer.v1.GetAgencyAndProducersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgencyAndProducersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgency retrieves detailed information about a specific agency.
     * Supports two lookup methods:
     * - By agency ID (UUID)
     * - By tenant agency ID (external identifier)
     * This endpoint returns complete agency details including contact information,
     * addresses, bank account, E&amp;O coverage, principal information, NIPR data, and locations.
     * Use this when you need full agency information without the list of associated producers.
     * For agencies with their producers, use GetAgencyAndProducers instead.
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - agency_id_lookup.agency_id: Must be a valid UUID format
     * - tenant_agency_id_lookup.tenant_agency_id: Must be non-empty string
     * Returns:
     * Complete agency information including all NIPR data and locations.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - PERMISSION_DENIED: Tenant doesn't have access to the agency
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.GetAgencyResponse> getAgency(
        com.producerflow.producer.v1.GetAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetProducer retrieves detailed information about a specific producer.
     * Supports three lookup methods:
     * - By producer ID (UUID)
     * - By NPN (National Producer Number)
     * - By email address
     * The response includes:
     * - Producer contact information (name, email, phone, address)
     * - Associated agency information
     * - NIPR synchronized data:
     *   - State licenses with expiration dates and Lines of Authority (LOAs)
     *   - Biographic information (name, DOB, state of domicile)
     *   - Regulatory actions by state
     *   - Carrier appointments with status and renewal dates
     * - Location assignments
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one lookup method must be provided (oneof required):
     * - producer_id_lookup.producer_id: Must be a valid UUID format
     * - npn_lookup.producer_npn: Must be non-empty string
     * - email_lookup.email: Must be a valid email format
     * Returns:
     * Complete producer information including all NIPR data.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant, or
     *   associated agency not found
     * - UNIMPLEMENTED: Lookup method not supported (only producer_id, npn, and email
     *   lookups are implemented)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.GetProducerResponse> getProducer(
        com.producerflow.producer.v1.GetProducerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProducerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAgencyFiles retrieves signed URLs for accessing agency documents.
     * Returns pre-signed URLs for the following document types:
     * - Errors &amp; Omissions (E&amp;O) insurance certificate
     * - Voided check for ACH commission payments
     * - W9 tax form
     * - License documents
     * - Broker bond documents
     * The URLs are time-limited and grant temporary read access to the documents.
     * Empty strings are returned for documents that haven't been uploaded.
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A set of pre-signed URLs for accessing agency documents.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.GetAgencyFilesResponse> getAgencyFiles(
        com.producerflow.producer.v1.GetAgencyFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAgencyFilesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateProducer updates editable fields for an existing producer.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncProducerWithNIPR.
     * Updatable Fields:
     * - Contact information (first_name, last_name, middle_name, email, phone)
     * - Mailing address (street, city, state, zip)
     * - External metadata (for tenant-specific data)
     * Note: NPN cannot be updated after creation. The NPN field is deprecated
     * in UpdateProducerRequest.Producer and will be ignored.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply (e.g., valid email format, phone pattern)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - producer: Required, contains fields to update (all fields optional):
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - npn: Deprecated and ignored - NPN cannot be updated after creation
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be at most 2 characters
     *   - zip: If provided, must be at least 5 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer field is missing in request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.UpdateProducerResponse> updateProducer(
        com.producerflow.producer.v1.UpdateProducerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProducerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgency updates editable fields for an existing agency.
     * Only information collected during onboarding can be updated via this
     * endpoint. NIPR-sourced data (licenses, appointments, regulatory actions) is
     * read-only and can only be updated by triggering a NIPR sync via
     * SyncAgencyWithNIPR.
     * Updatable Fields:
     * - Contact details (email, phone, fax)
     * - Website URL
     * - Physical address components
     * - Requested appointments (state codes)
     * - Notes
     * - External metadata (for tenant-specific data)
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Validation:
     * - Email must be unique within tenant if changed
     * - All field format validations apply
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - agency: Required, contains fields to update (all fields optional):
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - fax: If provided, must match E.164 pattern
     *   - website: If provided, must be a valid URI format
     *   - requested_appointments: Array of unique 2-letter state codes (e.g., ["CA", "NY"])
     *   - notes: If provided, maximum 500 characters
     *   - physical_address (optional, if provided):
     *     - street: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: If changed, must be unique within the tenant (case-insensitive comparison)
     * - phone: If provided, must be a valid phone number format
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email already exists within tenant
     * - INVALID_ARGUMENT: Invalid phone number format or all address fields required
     *   when creating new address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.UpdateAgencyResponse> updateAgency(
        com.producerflow.producer.v1.UpdateAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewContact creates a new contact associated with an agency.
     * Use this endpoint to programmatically add non-producer individuals to
     * agencies. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but need to be
     * associated with the agency for communication or administrative purposes.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contact: Required, contains contact information:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - email: Must be unique within the tenant (not already used by another producer or contact)
     * - role: If CONTACT_ROLE_PRINCIPAL, the agency must not already have a principal
     * Returns:
     * The UUID of the created contact.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing required fields or invalid field format
     * - ALREADY_EXISTS: Email already registered in your tenant, or agency already has a principal
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.NewContactResponse> newContact(
        com.producerflow.producer.v1.NewContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * NewContacts creates multiple contacts in bulk and associates them with a
     * single agency.
     * This endpoint provides an efficient way to add multiple non-producer
     * contacts to the same agency in a single API call. Contacts represent staff
     * members, administrators, or other personnel who are not licensed insurance
     * producers.
     * Partial Success Behavior:
     * Unlike bulk producer operations, this endpoint uses partial success
     * semantics. Contacts that pass validation are created even if other contacts
     * in the request fail. The response contains only the IDs of successfully
     * created contacts.
     * Validation Performed (for each contact):
     * - Agency exists and belongs to the authenticated tenant
     * - Email is unique within the tenant (across both producers and contacts)
     * - Required fields are present and valid (first name, last name, email, role)
     * - Phone number matches valid pattern (if provided)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - contacts: Required, must contain at least 1 contact. Each contact:
     *   - first_name: Required, must be non-empty
     *   - last_name: Required, must be non-empty
     *   - email: Required, must be a valid email format
     *   - role: Required, must be non-empty
     *   - phone: Optional, if provided must match E.164 pattern (e.g., +15551234567)
     *   - middle_name: Optional
     *   - address (optional, if provided):
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - tenant_id: Optional, maximum 255 characters (external identifier)
     *   - npn: Optional
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Each contact email: Must be unique within the tenant. Contacts with duplicate
     *   emails are skipped (partial success - other valid contacts are still created)
     * Returns:
     * List of UUIDs for successfully created contacts. If some contacts failed
     * validation, only the IDs of successfully created contacts are returned.
     * Failed contacts are logged but not included in the response. The order of
     * returned IDs corresponds to the order of successful contacts, not the
     * original request order.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.NewContactsResponse> newContacts(
        com.producerflow.producer.v1.NewContactsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewContactsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgencyContacts retrieves all contacts associated with an agency.
     * Use this endpoint to fetch all non-producer contacts linked to a specific
     * agency. Contacts represent staff members, administrators, or other
     * personnel who are not licensed insurance producers but are associated with
     * the agency.
     * The response includes complete contact information:
     * - Personal details (name, email, phone)
     * - Role within the agency
     * - Mailing address
     * - NPN (if applicable)
     * - Creation timestamp
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all contacts associated with the specified agency. Returns an
     * empty list if the agency has no contacts.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ListAgencyContactsResponse> listAgencyContacts(
        com.producerflow.producer.v1.ListAgencyContactsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgencyContactsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateContact updates editable fields for an existing contact.
     * This endpoint allows updating contact information for non-producer personnel
     * associated with an agency. All fields are optional, enabling partial updates
     * where only specified fields are modified.
     * Updatable Fields:
     * - Name fields (first name, middle name, last name)
     * - Email address (must remain unique within tenant)
     * - Phone number
     * - Mailing address components
     * - Role within the agency
     * - External metadata (for tenant-specific data)
     * Validation Rules:
     * Proto validation (format checks):
     * - contact_id: Required, must be a valid UUID format
     * - contact: Required, contains the fields to update
     *   - first_name: If provided, must be non-empty
     *   - last_name: If provided, must be non-empty
     *   - middle_name: If provided, must be non-empty
     *   - email: If provided, must be a valid email format
     *   - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     *   - role: If provided, must be non-empty
     *   - address (if provided, uses address_line_1 and address_line_2):
     *     - address_line_1: If provided, must be non-empty
     *     - address_line_2: If provided, must be non-empty
     *     - city: If provided, must be non-empty
     *     - state: If provided, must be exactly 2 characters (state code)
     *     - zip: If provided, must be 1-10 characters
     *   - external_metadata: Map of key-value pairs for tenant-specific data
     * Business logic validation:
     * - contact_id: Contact must exist and belong to the authenticated tenant
     * - email: If provided, must be unique within the tenant (across both producers and contacts)
     * Update Behavior:
     * - Only fields explicitly provided in the request are updated
     * - Omitted optional fields remain unchanged
     * - Empty strings are treated as clearing the field value
     * - Address updates are all-or-nothing (provide complete address or omit entirely)
     * Returns:
     * Empty response on success. The contact is updated atomically.
     * Common Error Codes:
     * - NOT_FOUND: Contact doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: Email is already in use by another producer or contact within the tenant
     * - INVALID_ARGUMENT: Validation failed for one or more fields
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.UpdateContactResponse> updateContact(
        com.producerflow.producer.v1.UpdateContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetExternalID sets an external identifier for a producer, agency, contact,
     * or organization.
     * Use this endpoint to link ProducerFlow entities to corresponding records in
     * your external systems (CRM, AMS, legacy databases). This enables bi-directional
     * synchronization and lookups across systems.
     * Supported Entity Types:
     * - Producer: Links a producer to an external system record
     * - Agency: Links an agency to an external system record
     * - Contact: Links a contact to an external system record
     * - Organization: Links an organization to an external system record
     * Exactly one entity type must be specified per request.
     * Validation Performed:
     * - Exactly one entity ID is provided (producer_id, agency_id, contact_id, or organization_id)
     * - The external ID (tenant_id) is non-empty and at most 255 characters
     * - The external ID is unique within the tenant (not already assigned to another entity)
     * - The specified entity exists and belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * Exactly one entity ID must be provided (oneof required):
     * - producer_id: Must be a valid UUID format
     * - agency_id: Must be a valid UUID format
     * - contact_id: Must be a valid UUID format
     * - organization_id: Must be a valid UUID format
     * Required field:
     * - tenant_id: Required, must be 1-255 characters (the external identifier to assign)
     * Business logic validation:
     * - tenant_id: Must be unique within the tenant (not already assigned to any other entity)
     * - Entity must exist and belong to the authenticated tenant:
     *   - Producer: Verified via tenant-scoped lookup
     *   - Contact: Verified via tenant-scoped lookup
     *   - Agency: Verified via tenant-scoped lookup and tenant ownership check
     *   - Organization: Verified via tenant-scoped lookup and tenant ownership check
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - INVALID_ARGUMENT: No entity ID provided or external ID validation failed
     * - NOT_FOUND: The specified entity doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: The external ID is already assigned to another entity in the tenant
     * - PERMISSION_DENIED: The entity doesn't belong to the authenticated tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.SetExternalIDResponse> setExternalID(
        com.producerflow.producer.v1.SetExternalIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetExternalIDMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateProducerNPN checks whether a producer's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an NPN is valid before creating a producer. This
     * is a free NIPR API lookup that does not count against your monthly billing
     * quota.
     * Validation Modes:
     * - NPN only: Validates that the NPN exists in NIPR
     * - NPN with name: Validates that the NPN exists AND the name matches the NIPR
     *   record (recommended for additional verification)
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the other NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * - name: Optional, if provided validates NPN matches this producer name in NIPR
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - If name is provided, both NPN and name must match a producer record in NIPR
     * - If name is not provided, only NPN existence is verified
     * Returns:
     * A boolean indicating whether the NPN is valid. Returns true if the NPN exists
     * in NIPR (and name matches, if provided), false otherwise.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ValidateProducerNPNResponse> validateProducerNPN(
        com.producerflow.producer.v1.ValidateProducerNPNRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateProducerNPNMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ValidateAgencyNPN checks whether an agency's National Producer Number (NPN)
     * exists in NIPR.
     * Use this endpoint to verify an agency NPN is valid before creating an agency.
     * This is a free NIPR API lookup that does not count against your monthly
     * billing quota.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the NIPR entity lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - npn: Required, must be non-empty string
     * Business logic validation:
     * - NPN is validated against NIPR database via free NIPR NPN Lookup API
     * - Agency NPN must exist in NIPR's agency records
     * Returns:
     * A boolean indicating whether the agency NPN is valid. Returns true if the NPN
     * exists in NIPR, false otherwise.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ValidateAgencyNPNResponse> validateAgencyNPN(
        com.producerflow.producer.v1.ValidateAgencyNPNRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateAgencyNPNMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * LookupNPNByFEIN finds an agency's NPN using their Federal Employer
     * Identification Number (FEIN).
     * Use this endpoint to help agencies discover their NPN when they only know
     * their FEIN. This is common during onboarding when agencies may not have
     * their NPN readily available but know their tax identification number.
     * NIPR Billing:
     * This is a FREE operation. It uses the NIPR NPN Lookup service which does not
     * incur charges, unlike the EntityInfo lookups used during sync operations.
     * Validation Rules:
     * Proto validation (format checks):
     * - fein: Required, must be exactly 9 characters
     * Business logic validation:
     * - FEIN is looked up against NIPR database via free NIPR NPN Lookup API
     * - Agency with the given FEIN must exist in NIPR's records
     * Returns:
     * The agency's NPN if found in NIPR.
     * Common Error Codes:
     * - NOT_FOUND: No agency found in NIPR with the given FEIN
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.LookupNPNByFEINResponse> lookupNPNByFEIN(
        com.producerflow.producer.v1.LookupNPNByFEINRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLookupNPNByFEINMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResyncProducer triggers a manual resynchronization of a producer's data.
     * This can be used to refresh data after external change
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Producer ID is empty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ResyncProducerResponse> resyncProducer(
        com.producerflow.producer.v1.ResyncProducerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResyncProducerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResyncAgency triggers a manual resynchronization of an agency's data. Similar
     * to ResyncProducer, this can be used to refresh data after external changes.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency ID is empty or request is empty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ResyncAgencyResponse> resyncAgency(
        com.producerflow.producer.v1.ResyncAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResyncAgencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SyncProducerWithNIPR synchronizes a producer's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of producer data
     * from NIPR. The operation validates the producer NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Biographic information (name, DOB, state of domicile)
     * - Address by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Producer license data sync (if producer is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must have a valid NPN registered in NIPR
     * - Producer must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must have an NPN assigned (cannot sync a producer without NPN)
     * - Producer's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Producer must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout: 30 seconds. If NIPR takes longer, you'll receive a
     * DEADLINE_EXCEEDED error.
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist, doesn't belong to tenant, or NPN could
     *   not be found in NIPR. If the NPN cannot be found, the error message will
     *   be "producer NPN could not be found in NIPR".
     * - INVALID_ARGUMENT: Producer has no NPN.
     * - FAILED_PRECONDITION: Producer is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync took longer than 30 seconds
     * - INTERNAL: Unexpected error during NIPR lookup or sync process
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.SyncProducerWithNIPRResponse> syncProducerWithNIPR(
        com.producerflow.producer.v1.SyncProducerWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncProducerWithNIPRMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SyncAgencyWithNIPR synchronizes an agency's data with NIPR.
     * Use this endpoint to manually trigger an immediate refresh of agency data
     * from NIPR. The operation validates the agency NPN exists in NIPR before
     * syncing.
     * What Gets Synchronized:
     * - Agency biographic information (company name, FEIN, contact details)
     * - State licenses with expiration dates and Lines of Authority
     * - Carrier appointments with status and renewal dates
     * - Regulatory actions and disciplinary history
     * - Address history by state
     * Billing:
     * This operation makes external NIPR API calls that may result in charges:
     * - NPN validation lookup
     * - Agency license data sync (if agency is not already synced)
     * - PDB alerts subscription (if enabled for tenant)
     * - When sync_all_producers is true: additional calls per producer (license sync + PDB alerts)
     * Bulk Producer Sync:
     * When sync_all_producers is set to true, the system will also sync all
     * producers associated with the agency. This extends the timeout to 10
     * minutes to accommodate the additional operations. Each producer sync is
     * a separate billable NIPR lookup.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must have a valid NPN registered in NIPR
     * - Agency must not already be in active sync state
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - sync_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Agency's NPN must exist in NIPR (validated via NIPR NPN Lookup API)
     * - Agency must not already be in ACTIVE sync state (prevents redundant syncs)
     * Timeout:
     * - 30 seconds when syncing agency only
     * - 10 minutes when sync_all_producers is true
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - INVALID_ARGUMENT: Agency NPN is not valid (not found in NIPR)
     * - FAILED_PRECONDITION: Agency is already synced with NIPR (ACTIVE sync state)
     * - DEADLINE_EXCEEDED: NIPR sync operation timed out (30s for agency only, 10m with sync_all_producers)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.SyncAgencyWithNIPRResponse> syncAgencyWithNIPR(
        com.producerflow.producer.v1.SyncAgencyWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSyncAgencyWithNIPRMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StopSyncProducerWithNIPR disables automatic NIPR synchronization for a producer.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific producer. Once stopped, the producer's NIPR data will no longer
     * be refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncProducerWithNIPR endpoint.
     * Preconditions:
     * - Producer must exist and belong to the authenticated tenant
     * - Producer must be in active or failing sync state (not already disabled/pending)
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer must be in ACTIVE or FAILING sync state (cannot stop if already
     *   DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Producer doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Producer is already unsynced (DISABLED or PENDING sync state)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse> stopSyncProducerWithNIPR(
        com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopSyncProducerWithNIPRMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StopSyncAgencyWithNIPR disables automatic NIPR synchronization for an agency.
     * Use this endpoint to stop receiving automatic updates from NIPR for a
     * specific agency. Once stopped, the agency's NIPR data will no longer be
     * refreshed via PDB Alerts or other automatic sync mechanisms.
     * This does not delete existing NIPR data - it only prevents future updates.
     * To re-enable synchronization, use the SyncAgencyWithNIPR endpoint.
     * Bulk Producer Stop:
     * When stop_all_producers is set to true, the system will also stop sync for
     * all producers associated with the agency. This is useful when offboarding
     * an entire agency from NIPR synchronization. When this flag is set, the
     * precondition check for agency sync state is bypassed.
     * Preconditions:
     * - Agency must exist and belong to the authenticated tenant
     * - Agency must be in active or failing sync state (unless stop_all_producers is true)
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - stop_all_producers: Optional boolean, defaults to false
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Unless stop_all_producers is true, agency must be in ACTIVE or FAILING sync
     *   state (cannot stop if already DISABLED or PENDING)
     * Returns:
     * Empty response on success.
     * Common Error Codes:
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * - FAILED_PRECONDITION: Agency is already unsynced (DISABLED or PENDING sync state,
     *   unless stop_all_producers is true)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse> stopSyncAgencyWithNIPR(
        com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopSyncAgencyWithNIPRMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateProducerUploadURL generates a secure URL for bulk producer uploads to
     * an existing agency.
     * Use this endpoint to create a shareable link that allows agencies to upload
     * multiple producers at once. The URL includes security tokens and tenant
     * context to ensure secure, authenticated access.
     * Unlike CreateProducerOnboardingURL which creates a self-service form for a
     * single producer, this endpoint generates a URL for bulk uploading producer
     * data (typically via CSV or spreadsheet format).
     * The agency is identified by its National Producer Number (NPN), which must
     * already exist in your tenant. Use ListAgencies or GetAgencyAndProducers to
     * look up agency NPNs if needed.
     * Typical Workflow:
     * 1. Generate producer upload URL using the agency's NPN
     * 2. Share URL with agency contact via email or portal
     * 3. Agency uploads producer data through the URL
     * 4. System processes uploads, validates NPNs with NIPR, and creates producer
     *    records
     * 5. Producers are associated with the agency and optionally synced with NIPR
     * URL Expiration:
     * The generated URL has a default expiration of 7 days. After expiration, a
     * new URL must be generated.
     * Validation Performed:
     * - Agency NPN format is valid (numeric string, 2-10 digits)
     * - Agency with the given NPN exists in your tenant
     * - Agency belongs to the authenticated tenant
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_npn: Required, must be 2-10 digits (numeric characters only)
     * Business logic validation:
     * - Agency with the given NPN must exist in the authenticated tenant
     * - Agency must belong to the authenticated tenant (ownership verification)
     * - Only one agency should match the NPN (multiple matches indicate data issue)
     * Returns:
     * A time-limited URL string that can be shared with the agency for bulk
     * producer uploads.
     * Common Error Codes:
     * - NOT_FOUND: No agency found with the given NPN in your tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.CreateProducerUploadURLResponse> createProducerUploadURL(
        com.producerflow.producer.v1.CreateProducerUploadURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProducerUploadURLMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AddAgencyLocations adds one or more locations to an existing agency.
     * Use this endpoint to programmatically add physical locations (offices,
     * branches, etc.) to an agency. Locations enable organizing producers by
     * their work sites and tracking agency presence across different addresses.
     * Bulk Operation Behavior:
     * This is an all-or-nothing operation - if any location fails validation,
     * the entire request will fail and no locations will be added. You can add
     * up to 100 locations in a single request.
     * Validation Performed:
     * - Agency exists and belongs to the authenticated tenant
     * - At least one location is provided
     * - Location names are unique within the agency (case-insensitive)
     * - Location names are not duplicated within the request
     * - Valid address information is provided for each location
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - locations: Required, 1-100 locations. Each location:
     *   - name: Required, must be non-empty (unique within agency)
     *   - address: Required
     *     - street: Required, must be non-empty
     *     - city: Required, must be non-empty
     *     - state: Required, must be exactly 2 characters (state code)
     *     - zip: Required, must be 1-10 characters
     *   - phone: Required, must match E.164 pattern (e.g., +15551234567)
     *   - email: Required, must be a valid email format
     *   - is_primary: Optional boolean, marks location as primary
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location names must be unique within the agency (case-insensitive)
     * - Location names must not duplicate any existing location names in the agency
     * - Location names must not duplicate other location names within the same request
     * Returns:
     * List of UUIDs for all created locations in the same order as the request.
     * This ordering guarantee allows you to map request entries to their created IDs.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id, no locations provided, duplicate
     *   location names, or location with name already exists in agency
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.AddAgencyLocationsResponse> addAgencyLocations(
        com.producerflow.producer.v1.AddAgencyLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAgencyLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RemoveAgencyLocations removes one or more locations from an agency.
     * Use this endpoint to delete locations that are no longer needed. This is
     * useful when closing branch offices or consolidating agency locations.
     * Producer Unassignment:
     * When a location is removed, all producers assigned to that location are
     * automatically unassigned. The producers themselves are not deleted - they
     * remain associated with the agency but without a location assignment.
     * Partial Success Behavior:
     * Locations that don't exist are silently ignored. The response contains only
     * the IDs of locations that were actually removed.
     * Validation Performed:
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - Location IDs that don't exist are silently ignored (partial success)
     * Returns:
     * List of UUIDs for locations that were successfully removed.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or no location_ids provided
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.RemoveAgencyLocationsResponse> removeAgencyLocations(
        com.producerflow.producer.v1.RemoveAgencyLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveAgencyLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgencyLocations retrieves all locations associated with an agency.
     * Use this endpoint to fetch the complete list of physical locations
     * belonging to an agency. Each location includes its address, contact
     * information, and primary status.
     * The response includes complete location information:
     * - Location ID and name
     * - Physical address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location indicator
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * Returns:
     * A list of all locations associated with the specified agency. Returns an
     * empty list if the agency has no locations.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Invalid request
     * - NOT_FOUND: Agency doesn't exist or doesn't belong to tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.ListAgencyLocationsResponse> listAgencyLocations(
        com.producerflow.producer.v1.ListAgencyLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgencyLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AssignProducerToLocations assigns one or more locations to a producer.
     * Use this endpoint to associate a producer with specific agency locations
     * (branch offices, work sites, etc.). A producer can be assigned to multiple
     * locations within their agency.
     * Location Ownership:
     * All specified locations must belong to the same agency as the producer.
     * Cross-agency location assignments are not permitted.
     * Idempotent Behavior:
     * If a producer is already assigned to a location, the assignment is
     * preserved without error. The response includes all successfully assigned
     * location IDs.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - Producer's agency must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully assigned to the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing
     * - NOT_FOUND: Producer doesn't exist, agency doesn't exist, or specified
     *   locations don't exist
     * - PERMISSION_DENIED: Agency doesn't belong to the authenticated tenant
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.AssignProducerToLocationsResponse> assignProducerToLocations(
        com.producerflow.producer.v1.AssignProducerToLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignProducerToLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UnassignProducerFromLocations removes one or more location assignments from
     * a producer.
     * Use this endpoint to disassociate a producer from specific agency locations.
     * This is useful when producers change work sites or when consolidating
     * location assignments.
     * Producer Preservation:
     * This operation only removes the location assignments - the producer remains
     * active and associated with the agency. To fully remove a producer, use the
     * appropriate producer deletion endpoint.
     * Validation Performed:
     * - Producer exists and belongs to the authenticated tenant
     * - All location IDs exist and belong to the producer's agency
     * - At least one location ID is provided
     * Validation Rules:
     * Proto validation (format checks):
     * - producer_id: Required, must be a valid UUID format
     * - location_ids: Required, 1-100 items, each must be a valid UUID format
     * Business logic validation:
     * - producer_id: Producer must exist and belong to the authenticated tenant
     * - All location_ids must exist and belong to the producer's agency
     * Returns:
     * List of location IDs that were successfully unassigned from the producer.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Request is missing, producer_id is empty, or no location_ids provided
     * - NOT_FOUND: Producer doesn't exist or specified locations don't exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.UnassignProducerFromLocationsResponse> unassignProducerFromLocations(
        com.producerflow.producer.v1.UnassignProducerFromLocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnassignProducerFromLocationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAgencyLocation updates an existing agency location.
     * Use this endpoint to modify location details such as address, contact
     * information, or primary status. This is useful when locations move,
     * change phone numbers, or when designating a new primary location.
     * Updatable Fields:
     * - Name (must remain unique within the agency)
     * - Address (street, city, state, zip)
     * - Contact information (phone, email)
     * - Primary location status
     * All fields are optional - only provide the fields you want to update.
     * Unchanged fields retain their current values.
     * Name Uniqueness:
     * If updating the location name, the new name must not already exist for
     * another location within the same agency (case-insensitive comparison).
     * Validation Rules:
     * Proto validation (format checks):
     * - agency_id: Required, must be a valid UUID format
     * - location_id: Required, must be a valid UUID format
     * - name: If provided, must be non-empty (unique within agency)
     * - address: If provided (all fields optional within):
     *   - street: If provided, must be non-empty
     *   - city: If provided, must be non-empty
     *   - state: If provided, must be exactly 2 characters (state code)
     *   - zip: If provided, must be 1-10 characters
     * - phone: If provided, must match E.164 pattern (e.g., +15551234567)
     * - email: If provided, must be a valid email format
     * - is_primary: Optional boolean
     * Business logic validation:
     * - agency_id: Agency must exist and belong to the authenticated tenant
     * - location_id: Location must exist and belong to the specified agency
     * - name: If provided, must be unique within the agency (case-insensitive,
     *   excluding the location being updated)
     * Returns:
     * The complete updated location object with all current field values.
     * Common Error Codes:
     * - INVALID_ARGUMENT: Missing agency_id or location_id, or invalid request
     * - NOT_FOUND: Agency or location doesn't exist or doesn't belong to tenant
     * - ALREADY_EXISTS: New location name already exists within the agency
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.producer.v1.UpdateAgencyLocationResponse> updateAgencyLocation(
        com.producerflow.producer.v1.UpdateAgencyLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAgencyLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_AGENCY_ONBOARDING_URL = 0;
  private static final int METHODID_CREATE_PRODUCER_ONBOARDING_URL = 1;
  private static final int METHODID_NEW_AGENCY = 2;
  private static final int METHODID_LIST_AGENCIES = 3;
  private static final int METHODID_LIST_ORGANIZATIONS = 4;
  private static final int METHODID_GET_ORGANIZATION = 5;
  private static final int METHODID_CREATE_ORGANIZATION = 6;
  private static final int METHODID_NEW_PRODUCER = 7;
  private static final int METHODID_NEW_PRODUCERS = 8;
  private static final int METHODID_GET_AGENCY_AND_PRODUCERS = 9;
  private static final int METHODID_GET_AGENCY = 10;
  private static final int METHODID_GET_PRODUCER = 11;
  private static final int METHODID_GET_AGENCY_FILES = 12;
  private static final int METHODID_UPDATE_PRODUCER = 13;
  private static final int METHODID_UPDATE_AGENCY = 14;
  private static final int METHODID_NEW_CONTACT = 15;
  private static final int METHODID_NEW_CONTACTS = 16;
  private static final int METHODID_LIST_AGENCY_CONTACTS = 17;
  private static final int METHODID_UPDATE_CONTACT = 18;
  private static final int METHODID_SET_EXTERNAL_ID = 19;
  private static final int METHODID_VALIDATE_PRODUCER_NPN = 20;
  private static final int METHODID_VALIDATE_AGENCY_NPN = 21;
  private static final int METHODID_LOOKUP_NPNBY_FEIN = 22;
  private static final int METHODID_RESYNC_PRODUCER = 23;
  private static final int METHODID_RESYNC_AGENCY = 24;
  private static final int METHODID_SYNC_PRODUCER_WITH_NIPR = 25;
  private static final int METHODID_SYNC_AGENCY_WITH_NIPR = 26;
  private static final int METHODID_STOP_SYNC_PRODUCER_WITH_NIPR = 27;
  private static final int METHODID_STOP_SYNC_AGENCY_WITH_NIPR = 28;
  private static final int METHODID_CREATE_PRODUCER_UPLOAD_URL = 29;
  private static final int METHODID_ADD_AGENCY_LOCATIONS = 30;
  private static final int METHODID_REMOVE_AGENCY_LOCATIONS = 31;
  private static final int METHODID_LIST_AGENCY_LOCATIONS = 32;
  private static final int METHODID_ASSIGN_PRODUCER_TO_LOCATIONS = 33;
  private static final int METHODID_UNASSIGN_PRODUCER_FROM_LOCATIONS = 34;
  private static final int METHODID_UPDATE_AGENCY_LOCATION = 35;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_AGENCY_ONBOARDING_URL:
          serviceImpl.createAgencyOnboardingURL((com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCER_ONBOARDING_URL:
          serviceImpl.createProducerOnboardingURL((com.producerflow.producer.v1.CreateProducerOnboardingURLRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateProducerOnboardingURLResponse>) responseObserver);
          break;
        case METHODID_NEW_AGENCY:
          serviceImpl.newAgency((com.producerflow.producer.v1.NewAgencyRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewAgencyResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENCIES:
          serviceImpl.listAgencies((com.producerflow.producer.v1.ListAgenciesRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgenciesResponse>) responseObserver);
          break;
        case METHODID_LIST_ORGANIZATIONS:
          serviceImpl.listOrganizations((com.producerflow.producer.v1.ListOrganizationsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListOrganizationsResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((com.producerflow.producer.v1.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((com.producerflow.producer.v1.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_NEW_PRODUCER:
          serviceImpl.newProducer((com.producerflow.producer.v1.NewProducerRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewProducerResponse>) responseObserver);
          break;
        case METHODID_NEW_PRODUCERS:
          serviceImpl.newProducers((com.producerflow.producer.v1.NewProducersRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewProducersResponse>) responseObserver);
          break;
        case METHODID_GET_AGENCY_AND_PRODUCERS:
          serviceImpl.getAgencyAndProducers((com.producerflow.producer.v1.GetAgencyAndProducersRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyAndProducersResponse>) responseObserver);
          break;
        case METHODID_GET_AGENCY:
          serviceImpl.getAgency((com.producerflow.producer.v1.GetAgencyRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCER:
          serviceImpl.getProducer((com.producerflow.producer.v1.GetProducerRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetProducerResponse>) responseObserver);
          break;
        case METHODID_GET_AGENCY_FILES:
          serviceImpl.getAgencyFiles((com.producerflow.producer.v1.GetAgencyFilesRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.GetAgencyFilesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCER:
          serviceImpl.updateProducer((com.producerflow.producer.v1.UpdateProducerRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateProducerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENCY:
          serviceImpl.updateAgency((com.producerflow.producer.v1.UpdateAgencyRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateAgencyResponse>) responseObserver);
          break;
        case METHODID_NEW_CONTACT:
          serviceImpl.newContact((com.producerflow.producer.v1.NewContactRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewContactResponse>) responseObserver);
          break;
        case METHODID_NEW_CONTACTS:
          serviceImpl.newContacts((com.producerflow.producer.v1.NewContactsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.NewContactsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENCY_CONTACTS:
          serviceImpl.listAgencyContacts((com.producerflow.producer.v1.ListAgencyContactsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgencyContactsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTACT:
          serviceImpl.updateContact((com.producerflow.producer.v1.UpdateContactRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateContactResponse>) responseObserver);
          break;
        case METHODID_SET_EXTERNAL_ID:
          serviceImpl.setExternalID((com.producerflow.producer.v1.SetExternalIDRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SetExternalIDResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_PRODUCER_NPN:
          serviceImpl.validateProducerNPN((com.producerflow.producer.v1.ValidateProducerNPNRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ValidateProducerNPNResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_AGENCY_NPN:
          serviceImpl.validateAgencyNPN((com.producerflow.producer.v1.ValidateAgencyNPNRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ValidateAgencyNPNResponse>) responseObserver);
          break;
        case METHODID_LOOKUP_NPNBY_FEIN:
          serviceImpl.lookupNPNByFEIN((com.producerflow.producer.v1.LookupNPNByFEINRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.LookupNPNByFEINResponse>) responseObserver);
          break;
        case METHODID_RESYNC_PRODUCER:
          serviceImpl.resyncProducer((com.producerflow.producer.v1.ResyncProducerRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ResyncProducerResponse>) responseObserver);
          break;
        case METHODID_RESYNC_AGENCY:
          serviceImpl.resyncAgency((com.producerflow.producer.v1.ResyncAgencyRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ResyncAgencyResponse>) responseObserver);
          break;
        case METHODID_SYNC_PRODUCER_WITH_NIPR:
          serviceImpl.syncProducerWithNIPR((com.producerflow.producer.v1.SyncProducerWithNIPRRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SyncProducerWithNIPRResponse>) responseObserver);
          break;
        case METHODID_SYNC_AGENCY_WITH_NIPR:
          serviceImpl.syncAgencyWithNIPR((com.producerflow.producer.v1.SyncAgencyWithNIPRRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.SyncAgencyWithNIPRResponse>) responseObserver);
          break;
        case METHODID_STOP_SYNC_PRODUCER_WITH_NIPR:
          serviceImpl.stopSyncProducerWithNIPR((com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse>) responseObserver);
          break;
        case METHODID_STOP_SYNC_AGENCY_WITH_NIPR:
          serviceImpl.stopSyncAgencyWithNIPR((com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse>) responseObserver);
          break;
        case METHODID_CREATE_PRODUCER_UPLOAD_URL:
          serviceImpl.createProducerUploadURL((com.producerflow.producer.v1.CreateProducerUploadURLRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.CreateProducerUploadURLResponse>) responseObserver);
          break;
        case METHODID_ADD_AGENCY_LOCATIONS:
          serviceImpl.addAgencyLocations((com.producerflow.producer.v1.AddAgencyLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.AddAgencyLocationsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_AGENCY_LOCATIONS:
          serviceImpl.removeAgencyLocations((com.producerflow.producer.v1.RemoveAgencyLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.RemoveAgencyLocationsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENCY_LOCATIONS:
          serviceImpl.listAgencyLocations((com.producerflow.producer.v1.ListAgencyLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.ListAgencyLocationsResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_PRODUCER_TO_LOCATIONS:
          serviceImpl.assignProducerToLocations((com.producerflow.producer.v1.AssignProducerToLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.AssignProducerToLocationsResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_PRODUCER_FROM_LOCATIONS:
          serviceImpl.unassignProducerFromLocations((com.producerflow.producer.v1.UnassignProducerFromLocationsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UnassignProducerFromLocationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AGENCY_LOCATION:
          serviceImpl.updateAgencyLocation((com.producerflow.producer.v1.UpdateAgencyLocationRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.producer.v1.UpdateAgencyLocationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateAgencyOnboardingURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.CreateAgencyOnboardingURLRequest,
              com.producerflow.producer.v1.CreateAgencyOnboardingURLResponse>(
                service, METHODID_CREATE_AGENCY_ONBOARDING_URL)))
        .addMethod(
          getCreateProducerOnboardingURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.CreateProducerOnboardingURLRequest,
              com.producerflow.producer.v1.CreateProducerOnboardingURLResponse>(
                service, METHODID_CREATE_PRODUCER_ONBOARDING_URL)))
        .addMethod(
          getNewAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.NewAgencyRequest,
              com.producerflow.producer.v1.NewAgencyResponse>(
                service, METHODID_NEW_AGENCY)))
        .addMethod(
          getListAgenciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ListAgenciesRequest,
              com.producerflow.producer.v1.ListAgenciesResponse>(
                service, METHODID_LIST_AGENCIES)))
        .addMethod(
          getListOrganizationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ListOrganizationsRequest,
              com.producerflow.producer.v1.ListOrganizationsResponse>(
                service, METHODID_LIST_ORGANIZATIONS)))
        .addMethod(
          getGetOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.GetOrganizationRequest,
              com.producerflow.producer.v1.GetOrganizationResponse>(
                service, METHODID_GET_ORGANIZATION)))
        .addMethod(
          getCreateOrganizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.CreateOrganizationRequest,
              com.producerflow.producer.v1.CreateOrganizationResponse>(
                service, METHODID_CREATE_ORGANIZATION)))
        .addMethod(
          getNewProducerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.NewProducerRequest,
              com.producerflow.producer.v1.NewProducerResponse>(
                service, METHODID_NEW_PRODUCER)))
        .addMethod(
          getNewProducersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.NewProducersRequest,
              com.producerflow.producer.v1.NewProducersResponse>(
                service, METHODID_NEW_PRODUCERS)))
        .addMethod(
          getGetAgencyAndProducersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.GetAgencyAndProducersRequest,
              com.producerflow.producer.v1.GetAgencyAndProducersResponse>(
                service, METHODID_GET_AGENCY_AND_PRODUCERS)))
        .addMethod(
          getGetAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.GetAgencyRequest,
              com.producerflow.producer.v1.GetAgencyResponse>(
                service, METHODID_GET_AGENCY)))
        .addMethod(
          getGetProducerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.GetProducerRequest,
              com.producerflow.producer.v1.GetProducerResponse>(
                service, METHODID_GET_PRODUCER)))
        .addMethod(
          getGetAgencyFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.GetAgencyFilesRequest,
              com.producerflow.producer.v1.GetAgencyFilesResponse>(
                service, METHODID_GET_AGENCY_FILES)))
        .addMethod(
          getUpdateProducerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.UpdateProducerRequest,
              com.producerflow.producer.v1.UpdateProducerResponse>(
                service, METHODID_UPDATE_PRODUCER)))
        .addMethod(
          getUpdateAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.UpdateAgencyRequest,
              com.producerflow.producer.v1.UpdateAgencyResponse>(
                service, METHODID_UPDATE_AGENCY)))
        .addMethod(
          getNewContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.NewContactRequest,
              com.producerflow.producer.v1.NewContactResponse>(
                service, METHODID_NEW_CONTACT)))
        .addMethod(
          getNewContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.NewContactsRequest,
              com.producerflow.producer.v1.NewContactsResponse>(
                service, METHODID_NEW_CONTACTS)))
        .addMethod(
          getListAgencyContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ListAgencyContactsRequest,
              com.producerflow.producer.v1.ListAgencyContactsResponse>(
                service, METHODID_LIST_AGENCY_CONTACTS)))
        .addMethod(
          getUpdateContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.UpdateContactRequest,
              com.producerflow.producer.v1.UpdateContactResponse>(
                service, METHODID_UPDATE_CONTACT)))
        .addMethod(
          getSetExternalIDMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.SetExternalIDRequest,
              com.producerflow.producer.v1.SetExternalIDResponse>(
                service, METHODID_SET_EXTERNAL_ID)))
        .addMethod(
          getValidateProducerNPNMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ValidateProducerNPNRequest,
              com.producerflow.producer.v1.ValidateProducerNPNResponse>(
                service, METHODID_VALIDATE_PRODUCER_NPN)))
        .addMethod(
          getValidateAgencyNPNMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ValidateAgencyNPNRequest,
              com.producerflow.producer.v1.ValidateAgencyNPNResponse>(
                service, METHODID_VALIDATE_AGENCY_NPN)))
        .addMethod(
          getLookupNPNByFEINMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.LookupNPNByFEINRequest,
              com.producerflow.producer.v1.LookupNPNByFEINResponse>(
                service, METHODID_LOOKUP_NPNBY_FEIN)))
        .addMethod(
          getResyncProducerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ResyncProducerRequest,
              com.producerflow.producer.v1.ResyncProducerResponse>(
                service, METHODID_RESYNC_PRODUCER)))
        .addMethod(
          getResyncAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ResyncAgencyRequest,
              com.producerflow.producer.v1.ResyncAgencyResponse>(
                service, METHODID_RESYNC_AGENCY)))
        .addMethod(
          getSyncProducerWithNIPRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.SyncProducerWithNIPRRequest,
              com.producerflow.producer.v1.SyncProducerWithNIPRResponse>(
                service, METHODID_SYNC_PRODUCER_WITH_NIPR)))
        .addMethod(
          getSyncAgencyWithNIPRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.SyncAgencyWithNIPRRequest,
              com.producerflow.producer.v1.SyncAgencyWithNIPRResponse>(
                service, METHODID_SYNC_AGENCY_WITH_NIPR)))
        .addMethod(
          getStopSyncProducerWithNIPRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.StopSyncProducerWithNIPRRequest,
              com.producerflow.producer.v1.StopSyncProducerWithNIPRResponse>(
                service, METHODID_STOP_SYNC_PRODUCER_WITH_NIPR)))
        .addMethod(
          getStopSyncAgencyWithNIPRMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.StopSyncAgencyWithNIPRRequest,
              com.producerflow.producer.v1.StopSyncAgencyWithNIPRResponse>(
                service, METHODID_STOP_SYNC_AGENCY_WITH_NIPR)))
        .addMethod(
          getCreateProducerUploadURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.CreateProducerUploadURLRequest,
              com.producerflow.producer.v1.CreateProducerUploadURLResponse>(
                service, METHODID_CREATE_PRODUCER_UPLOAD_URL)))
        .addMethod(
          getAddAgencyLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.AddAgencyLocationsRequest,
              com.producerflow.producer.v1.AddAgencyLocationsResponse>(
                service, METHODID_ADD_AGENCY_LOCATIONS)))
        .addMethod(
          getRemoveAgencyLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.RemoveAgencyLocationsRequest,
              com.producerflow.producer.v1.RemoveAgencyLocationsResponse>(
                service, METHODID_REMOVE_AGENCY_LOCATIONS)))
        .addMethod(
          getListAgencyLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.ListAgencyLocationsRequest,
              com.producerflow.producer.v1.ListAgencyLocationsResponse>(
                service, METHODID_LIST_AGENCY_LOCATIONS)))
        .addMethod(
          getAssignProducerToLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.AssignProducerToLocationsRequest,
              com.producerflow.producer.v1.AssignProducerToLocationsResponse>(
                service, METHODID_ASSIGN_PRODUCER_TO_LOCATIONS)))
        .addMethod(
          getUnassignProducerFromLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.UnassignProducerFromLocationsRequest,
              com.producerflow.producer.v1.UnassignProducerFromLocationsResponse>(
                service, METHODID_UNASSIGN_PRODUCER_FROM_LOCATIONS)))
        .addMethod(
          getUpdateAgencyLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.producer.v1.UpdateAgencyLocationRequest,
              com.producerflow.producer.v1.UpdateAgencyLocationResponse>(
                service, METHODID_UPDATE_AGENCY_LOCATION)))
        .build();
  }

  private static abstract class ProducerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProducerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.producerflow.producer.v1.ProducerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProducerService");
    }
  }

  private static final class ProducerServiceFileDescriptorSupplier
      extends ProducerServiceBaseDescriptorSupplier {
    ProducerServiceFileDescriptorSupplier() {}
  }

  private static final class ProducerServiceMethodDescriptorSupplier
      extends ProducerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProducerServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProducerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProducerServiceFileDescriptorSupplier())
              .addMethod(getCreateAgencyOnboardingURLMethod())
              .addMethod(getCreateProducerOnboardingURLMethod())
              .addMethod(getNewAgencyMethod())
              .addMethod(getListAgenciesMethod())
              .addMethod(getListOrganizationsMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getNewProducerMethod())
              .addMethod(getNewProducersMethod())
              .addMethod(getGetAgencyAndProducersMethod())
              .addMethod(getGetAgencyMethod())
              .addMethod(getGetProducerMethod())
              .addMethod(getGetAgencyFilesMethod())
              .addMethod(getUpdateProducerMethod())
              .addMethod(getUpdateAgencyMethod())
              .addMethod(getNewContactMethod())
              .addMethod(getNewContactsMethod())
              .addMethod(getListAgencyContactsMethod())
              .addMethod(getUpdateContactMethod())
              .addMethod(getSetExternalIDMethod())
              .addMethod(getValidateProducerNPNMethod())
              .addMethod(getValidateAgencyNPNMethod())
              .addMethod(getLookupNPNByFEINMethod())
              .addMethod(getResyncProducerMethod())
              .addMethod(getResyncAgencyMethod())
              .addMethod(getSyncProducerWithNIPRMethod())
              .addMethod(getSyncAgencyWithNIPRMethod())
              .addMethod(getStopSyncProducerWithNIPRMethod())
              .addMethod(getStopSyncAgencyWithNIPRMethod())
              .addMethod(getCreateProducerUploadURLMethod())
              .addMethod(getAddAgencyLocationsMethod())
              .addMethod(getRemoveAgencyLocationsMethod())
              .addMethod(getListAgencyLocationsMethod())
              .addMethod(getAssignProducerToLocationsMethod())
              .addMethod(getUnassignProducerFromLocationsMethod())
              .addMethod(getUpdateAgencyLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
