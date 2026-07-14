package com.producerflow.testing.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ============================================================================
 * DEV AND UAT ONLY — NOT AVAILABLE IN PRODUCTION.
 * Every method on this service is enabled exclusively in the dev and UAT
 * test environments. In production, every call is rejected with
 * PERMISSION_DENIED, regardless of the API key or arguments.
 * ============================================================================
 * TestingService provides cleanup utilities that let tenants reset their test
 * environments between automated runs. For example, deleting an agency frees
 * the licenses it used so the same test setup can be reused across test cases
 * instead of provisioning new agencies each time. These operations are
 * intended solely for preparing and cleaning up automated test scenarios and
 * have no production use.
 * Any call to this service must be authenticated using an API key in the
 * request headers. The API key can be found in the ProducerFlow API key
 * section of the ProducerFlow UI and it identifies the tenant that is making
 * the request.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: producerflow/testing/v1/testing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestingServiceGrpc {

  private TestingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "producerflow.testing.v1.TestingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.producerflow.testing.v1.DeleteAgencyRequest,
      com.producerflow.testing.v1.DeleteAgencyResponse> getDeleteAgencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAgency",
      requestType = com.producerflow.testing.v1.DeleteAgencyRequest.class,
      responseType = com.producerflow.testing.v1.DeleteAgencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.testing.v1.DeleteAgencyRequest,
      com.producerflow.testing.v1.DeleteAgencyResponse> getDeleteAgencyMethod() {
    io.grpc.MethodDescriptor<com.producerflow.testing.v1.DeleteAgencyRequest, com.producerflow.testing.v1.DeleteAgencyResponse> getDeleteAgencyMethod;
    if ((getDeleteAgencyMethod = TestingServiceGrpc.getDeleteAgencyMethod) == null) {
      synchronized (TestingServiceGrpc.class) {
        if ((getDeleteAgencyMethod = TestingServiceGrpc.getDeleteAgencyMethod) == null) {
          TestingServiceGrpc.getDeleteAgencyMethod = getDeleteAgencyMethod =
              io.grpc.MethodDescriptor.<com.producerflow.testing.v1.DeleteAgencyRequest, com.producerflow.testing.v1.DeleteAgencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAgency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.testing.v1.DeleteAgencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.testing.v1.DeleteAgencyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestingServiceMethodDescriptorSupplier("DeleteAgency"))
              .build();
        }
      }
    }
    return getDeleteAgencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.testing.v1.DeleteAppointmentRequest,
      com.producerflow.testing.v1.DeleteAppointmentResponse> getDeleteAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAppointment",
      requestType = com.producerflow.testing.v1.DeleteAppointmentRequest.class,
      responseType = com.producerflow.testing.v1.DeleteAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.testing.v1.DeleteAppointmentRequest,
      com.producerflow.testing.v1.DeleteAppointmentResponse> getDeleteAppointmentMethod() {
    io.grpc.MethodDescriptor<com.producerflow.testing.v1.DeleteAppointmentRequest, com.producerflow.testing.v1.DeleteAppointmentResponse> getDeleteAppointmentMethod;
    if ((getDeleteAppointmentMethod = TestingServiceGrpc.getDeleteAppointmentMethod) == null) {
      synchronized (TestingServiceGrpc.class) {
        if ((getDeleteAppointmentMethod = TestingServiceGrpc.getDeleteAppointmentMethod) == null) {
          TestingServiceGrpc.getDeleteAppointmentMethod = getDeleteAppointmentMethod =
              io.grpc.MethodDescriptor.<com.producerflow.testing.v1.DeleteAppointmentRequest, com.producerflow.testing.v1.DeleteAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.testing.v1.DeleteAppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.testing.v1.DeleteAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TestingServiceMethodDescriptorSupplier("DeleteAppointment"))
              .build();
        }
      }
    }
    return getDeleteAppointmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestingServiceStub>() {
        @java.lang.Override
        public TestingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestingServiceStub(channel, callOptions);
        }
      };
    return TestingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestingServiceBlockingStub>() {
        @java.lang.Override
        public TestingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestingServiceBlockingStub(channel, callOptions);
        }
      };
    return TestingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestingServiceFutureStub>() {
        @java.lang.Override
        public TestingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestingServiceFutureStub(channel, callOptions);
        }
      };
    return TestingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ============================================================================
   * DEV AND UAT ONLY — NOT AVAILABLE IN PRODUCTION.
   * Every method on this service is enabled exclusively in the dev and UAT
   * test environments. In production, every call is rejected with
   * PERMISSION_DENIED, regardless of the API key or arguments.
   * ============================================================================
   * TestingService provides cleanup utilities that let tenants reset their test
   * environments between automated runs. For example, deleting an agency frees
   * the licenses it used so the same test setup can be reused across test cases
   * instead of provisioning new agencies each time. These operations are
   * intended solely for preparing and cleaning up automated test scenarios and
   * have no production use.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * DeleteAgency permanently removes an agency and every producer,
     * appointment, and NIPR record scoped to it, freeing the underlying
     * licenses to be appointed again. It lets tenants reset the same agency
     * between automated test runs instead of provisioning a new one each time.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The agency must belong to the tenant resolved from the request's API key.
     * Tenant (internal) agencies cannot be deleted — they hold per-tenant
     * configuration. The operation is irreversible and emits no events.
     * Errors:
     * - NOT_FOUND: no agency with the given ID exists for the tenant.
     * - FAILED_PRECONDITION: the agency is a tenant (internal) agency.
     * - INVALID_ARGUMENT: agency_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    default void deleteAgency(com.producerflow.testing.v1.DeleteAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.testing.v1.DeleteAgencyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAgencyMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAppointment permanently removes a single appointment, freeing the
     * underlying license to be appointed again. Unlike terminating an
     * appointment — which leaves a TERMINATED record that still blocks the
     * license from being re-appointed — deleting it removes the row entirely so
     * the same license can be reused across automated test runs.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The appointment must belong to the tenant resolved from the request's API
     * key. Its interleaved history is removed with it. The operation is
     * irreversible, emits no events, and sends nothing to NIPR.
     * Errors:
     * - NOT_FOUND: no appointment with the given ID exists for the tenant.
     * - INVALID_ARGUMENT: appointment_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    default void deleteAppointment(com.producerflow.testing.v1.DeleteAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.testing.v1.DeleteAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAppointmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TestingService.
   * <pre>
   * ============================================================================
   * DEV AND UAT ONLY — NOT AVAILABLE IN PRODUCTION.
   * Every method on this service is enabled exclusively in the dev and UAT
   * test environments. In production, every call is rejected with
   * PERMISSION_DENIED, regardless of the API key or arguments.
   * ============================================================================
   * TestingService provides cleanup utilities that let tenants reset their test
   * environments between automated runs. For example, deleting an agency frees
   * the licenses it used so the same test setup can be reused across test cases
   * instead of provisioning new agencies each time. These operations are
   * intended solely for preparing and cleaning up automated test scenarios and
   * have no production use.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static abstract class TestingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TestingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TestingService.
   * <pre>
   * ============================================================================
   * DEV AND UAT ONLY — NOT AVAILABLE IN PRODUCTION.
   * Every method on this service is enabled exclusively in the dev and UAT
   * test environments. In production, every call is rejected with
   * PERMISSION_DENIED, regardless of the API key or arguments.
   * ============================================================================
   * TestingService provides cleanup utilities that let tenants reset their test
   * environments between automated runs. For example, deleting an agency frees
   * the licenses it used so the same test setup can be reused across test cases
   * instead of provisioning new agencies each time. These operations are
   * intended solely for preparing and cleaning up automated test scenarios and
   * have no production use.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static final class TestingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TestingServiceStub> {
    private TestingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteAgency permanently removes an agency and every producer,
     * appointment, and NIPR record scoped to it, freeing the underlying
     * licenses to be appointed again. It lets tenants reset the same agency
     * between automated test runs instead of provisioning a new one each time.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The agency must belong to the tenant resolved from the request's API key.
     * Tenant (internal) agencies cannot be deleted — they hold per-tenant
     * configuration. The operation is irreversible and emits no events.
     * Errors:
     * - NOT_FOUND: no agency with the given ID exists for the tenant.
     * - FAILED_PRECONDITION: the agency is a tenant (internal) agency.
     * - INVALID_ARGUMENT: agency_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    public void deleteAgency(com.producerflow.testing.v1.DeleteAgencyRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.testing.v1.DeleteAgencyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAgencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAppointment permanently removes a single appointment, freeing the
     * underlying license to be appointed again. Unlike terminating an
     * appointment — which leaves a TERMINATED record that still blocks the
     * license from being re-appointed — deleting it removes the row entirely so
     * the same license can be reused across automated test runs.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The appointment must belong to the tenant resolved from the request's API
     * key. Its interleaved history is removed with it. The operation is
     * irreversible, emits no events, and sends nothing to NIPR.
     * Errors:
     * - NOT_FOUND: no appointment with the given ID exists for the tenant.
     * - INVALID_ARGUMENT: appointment_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    public void deleteAppointment(com.producerflow.testing.v1.DeleteAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.testing.v1.DeleteAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAppointmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TestingService.
   * <pre>
   * ============================================================================
   * DEV AND UAT ONLY — NOT AVAILABLE IN PRODUCTION.
   * Every method on this service is enabled exclusively in the dev and UAT
   * test environments. In production, every call is rejected with
   * PERMISSION_DENIED, regardless of the API key or arguments.
   * ============================================================================
   * TestingService provides cleanup utilities that let tenants reset their test
   * environments between automated runs. For example, deleting an agency frees
   * the licenses it used so the same test setup can be reused across test cases
   * instead of provisioning new agencies each time. These operations are
   * intended solely for preparing and cleaning up automated test scenarios and
   * have no production use.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static final class TestingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TestingServiceBlockingStub> {
    private TestingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteAgency permanently removes an agency and every producer,
     * appointment, and NIPR record scoped to it, freeing the underlying
     * licenses to be appointed again. It lets tenants reset the same agency
     * between automated test runs instead of provisioning a new one each time.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The agency must belong to the tenant resolved from the request's API key.
     * Tenant (internal) agencies cannot be deleted — they hold per-tenant
     * configuration. The operation is irreversible and emits no events.
     * Errors:
     * - NOT_FOUND: no agency with the given ID exists for the tenant.
     * - FAILED_PRECONDITION: the agency is a tenant (internal) agency.
     * - INVALID_ARGUMENT: agency_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    public com.producerflow.testing.v1.DeleteAgencyResponse deleteAgency(com.producerflow.testing.v1.DeleteAgencyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAgencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAppointment permanently removes a single appointment, freeing the
     * underlying license to be appointed again. Unlike terminating an
     * appointment — which leaves a TERMINATED record that still blocks the
     * license from being re-appointed — deleting it removes the row entirely so
     * the same license can be reused across automated test runs.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The appointment must belong to the tenant resolved from the request's API
     * key. Its interleaved history is removed with it. The operation is
     * irreversible, emits no events, and sends nothing to NIPR.
     * Errors:
     * - NOT_FOUND: no appointment with the given ID exists for the tenant.
     * - INVALID_ARGUMENT: appointment_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    public com.producerflow.testing.v1.DeleteAppointmentResponse deleteAppointment(com.producerflow.testing.v1.DeleteAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAppointmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TestingService.
   * <pre>
   * ============================================================================
   * DEV AND UAT ONLY — NOT AVAILABLE IN PRODUCTION.
   * Every method on this service is enabled exclusively in the dev and UAT
   * test environments. In production, every call is rejected with
   * PERMISSION_DENIED, regardless of the API key or arguments.
   * ============================================================================
   * TestingService provides cleanup utilities that let tenants reset their test
   * environments between automated runs. For example, deleting an agency frees
   * the licenses it used so the same test setup can be reused across test cases
   * instead of provisioning new agencies each time. These operations are
   * intended solely for preparing and cleaning up automated test scenarios and
   * have no production use.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static final class TestingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TestingServiceFutureStub> {
    private TestingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteAgency permanently removes an agency and every producer,
     * appointment, and NIPR record scoped to it, freeing the underlying
     * licenses to be appointed again. It lets tenants reset the same agency
     * between automated test runs instead of provisioning a new one each time.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The agency must belong to the tenant resolved from the request's API key.
     * Tenant (internal) agencies cannot be deleted — they hold per-tenant
     * configuration. The operation is irreversible and emits no events.
     * Errors:
     * - NOT_FOUND: no agency with the given ID exists for the tenant.
     * - FAILED_PRECONDITION: the agency is a tenant (internal) agency.
     * - INVALID_ARGUMENT: agency_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.testing.v1.DeleteAgencyResponse> deleteAgency(
        com.producerflow.testing.v1.DeleteAgencyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAgencyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAppointment permanently removes a single appointment, freeing the
     * underlying license to be appointed again. Unlike terminating an
     * appointment — which leaves a TERMINATED record that still blocks the
     * license from being re-appointed — deleting it removes the row entirely so
     * the same license can be reused across automated test runs.
     * DEV AND UAT ONLY: this method is not available in production. Calls made
     * in production are always rejected with PERMISSION_DENIED.
     * The appointment must belong to the tenant resolved from the request's API
     * key. Its interleaved history is removed with it. The operation is
     * irreversible, emits no events, and sends nothing to NIPR.
     * Errors:
     * - NOT_FOUND: no appointment with the given ID exists for the tenant.
     * - INVALID_ARGUMENT: appointment_id is missing or is not a valid UUID.
     * - PERMISSION_DENIED: the call was made outside dev/UAT (e.g. production).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.testing.v1.DeleteAppointmentResponse> deleteAppointment(
        com.producerflow.testing.v1.DeleteAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAppointmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_AGENCY = 0;
  private static final int METHODID_DELETE_APPOINTMENT = 1;

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
        case METHODID_DELETE_AGENCY:
          serviceImpl.deleteAgency((com.producerflow.testing.v1.DeleteAgencyRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.testing.v1.DeleteAgencyResponse>) responseObserver);
          break;
        case METHODID_DELETE_APPOINTMENT:
          serviceImpl.deleteAppointment((com.producerflow.testing.v1.DeleteAppointmentRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.testing.v1.DeleteAppointmentResponse>) responseObserver);
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
          getDeleteAgencyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.testing.v1.DeleteAgencyRequest,
              com.producerflow.testing.v1.DeleteAgencyResponse>(
                service, METHODID_DELETE_AGENCY)))
        .addMethod(
          getDeleteAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.testing.v1.DeleteAppointmentRequest,
              com.producerflow.testing.v1.DeleteAppointmentResponse>(
                service, METHODID_DELETE_APPOINTMENT)))
        .build();
  }

  private static abstract class TestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.producerflow.testing.v1.TestingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestingService");
    }
  }

  private static final class TestingServiceFileDescriptorSupplier
      extends TestingServiceBaseDescriptorSupplier {
    TestingServiceFileDescriptorSupplier() {}
  }

  private static final class TestingServiceMethodDescriptorSupplier
      extends TestingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TestingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TestingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestingServiceFileDescriptorSupplier())
              .addMethod(getDeleteAgencyMethod())
              .addMethod(getDeleteAppointmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
