package com.producerflow.appointment.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AppointmentService manages license appointments through NIPR.
 * The appointment flow in NIPR is as follows:
 * 1. A new appointment (or termination) is requested for a license number.
 * 2. Some time later, NIPR processes the request and returns the final result.
 * Since NIPR does not return results immediately, RequestAppointment and
 * TerminateAppointment RPCs will return a processing status of IN_PROGRESS if
 * the request is accepted by NIPR. When the appointment is finally processed by
 * NIPR, ProducerFlow will notify via a webhook of the final result. Also, any
 * call from this point on to ListAppointments or GetAppointment will also
 * return the final result.
 * IMPORTANT: Appointments in registry states or with capacity carriers
 * (carriers that do not have NIPR integration) are processed automatically
 * without going through NIPR. In these cases:
 * - RequestAppointment will immediately return APPOINTED status.
 * - TerminateAppointment will immediately return TERMINATED status.
 * Any call to this service must be authenticated using an API key in the
 * request headers. The API key can be found in the ProducerFlow API key
 * section of the ProducerFlow UI and it identifies the tenant that is making
 * the request.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: producerflow/appointment/v1/appointment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppointmentServiceGrpc {

  private AppointmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "producerflow.appointment.v1.AppointmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointmentRequest,
      com.producerflow.appointment.v1.GetAppointmentResponse> getGetAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointment",
      requestType = com.producerflow.appointment.v1.GetAppointmentRequest.class,
      responseType = com.producerflow.appointment.v1.GetAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointmentRequest,
      com.producerflow.appointment.v1.GetAppointmentResponse> getGetAppointmentMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointmentRequest, com.producerflow.appointment.v1.GetAppointmentResponse> getGetAppointmentMethod;
    if ((getGetAppointmentMethod = AppointmentServiceGrpc.getGetAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetAppointmentMethod = AppointmentServiceGrpc.getGetAppointmentMethod) == null) {
          AppointmentServiceGrpc.getGetAppointmentMethod = getGetAppointmentMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.GetAppointmentRequest, com.producerflow.appointment.v1.GetAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetAppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetAppointment"))
              .build();
        }
      }
    }
    return getGetAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointmentFeesRequest,
      com.producerflow.appointment.v1.GetAppointmentFeesResponse> getGetAppointmentFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentFees",
      requestType = com.producerflow.appointment.v1.GetAppointmentFeesRequest.class,
      responseType = com.producerflow.appointment.v1.GetAppointmentFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointmentFeesRequest,
      com.producerflow.appointment.v1.GetAppointmentFeesResponse> getGetAppointmentFeesMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointmentFeesRequest, com.producerflow.appointment.v1.GetAppointmentFeesResponse> getGetAppointmentFeesMethod;
    if ((getGetAppointmentFeesMethod = AppointmentServiceGrpc.getGetAppointmentFeesMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetAppointmentFeesMethod = AppointmentServiceGrpc.getGetAppointmentFeesMethod) == null) {
          AppointmentServiceGrpc.getGetAppointmentFeesMethod = getGetAppointmentFeesMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.GetAppointmentFeesRequest, com.producerflow.appointment.v1.GetAppointmentFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetAppointmentFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetAppointmentFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetAppointmentFees"))
              .build();
        }
      }
    }
    return getGetAppointmentFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointableCarriersRequest,
      com.producerflow.appointment.v1.GetAppointableCarriersResponse> getGetAppointableCarriersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointableCarriers",
      requestType = com.producerflow.appointment.v1.GetAppointableCarriersRequest.class,
      responseType = com.producerflow.appointment.v1.GetAppointableCarriersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointableCarriersRequest,
      com.producerflow.appointment.v1.GetAppointableCarriersResponse> getGetAppointableCarriersMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetAppointableCarriersRequest, com.producerflow.appointment.v1.GetAppointableCarriersResponse> getGetAppointableCarriersMethod;
    if ((getGetAppointableCarriersMethod = AppointmentServiceGrpc.getGetAppointableCarriersMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetAppointableCarriersMethod = AppointmentServiceGrpc.getGetAppointableCarriersMethod) == null) {
          AppointmentServiceGrpc.getGetAppointableCarriersMethod = getGetAppointableCarriersMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.GetAppointableCarriersRequest, com.producerflow.appointment.v1.GetAppointableCarriersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointableCarriers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetAppointableCarriersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetAppointableCarriersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetAppointableCarriers"))
              .build();
        }
      }
    }
    return getGetAppointableCarriersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetTerminationFeesRequest,
      com.producerflow.appointment.v1.GetTerminationFeesResponse> getGetTerminationFeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTerminationFees",
      requestType = com.producerflow.appointment.v1.GetTerminationFeesRequest.class,
      responseType = com.producerflow.appointment.v1.GetTerminationFeesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetTerminationFeesRequest,
      com.producerflow.appointment.v1.GetTerminationFeesResponse> getGetTerminationFeesMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.GetTerminationFeesRequest, com.producerflow.appointment.v1.GetTerminationFeesResponse> getGetTerminationFeesMethod;
    if ((getGetTerminationFeesMethod = AppointmentServiceGrpc.getGetTerminationFeesMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetTerminationFeesMethod = AppointmentServiceGrpc.getGetTerminationFeesMethod) == null) {
          AppointmentServiceGrpc.getGetTerminationFeesMethod = getGetTerminationFeesMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.GetTerminationFeesRequest, com.producerflow.appointment.v1.GetTerminationFeesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTerminationFees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetTerminationFeesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.GetTerminationFeesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetTerminationFees"))
              .build();
        }
      }
    }
    return getGetTerminationFeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListAppointmentsRequest,
      com.producerflow.appointment.v1.ListAppointmentsResponse> getListAppointmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAppointments",
      requestType = com.producerflow.appointment.v1.ListAppointmentsRequest.class,
      responseType = com.producerflow.appointment.v1.ListAppointmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListAppointmentsRequest,
      com.producerflow.appointment.v1.ListAppointmentsResponse> getListAppointmentsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListAppointmentsRequest, com.producerflow.appointment.v1.ListAppointmentsResponse> getListAppointmentsMethod;
    if ((getListAppointmentsMethod = AppointmentServiceGrpc.getListAppointmentsMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getListAppointmentsMethod = AppointmentServiceGrpc.getListAppointmentsMethod) == null) {
          AppointmentServiceGrpc.getListAppointmentsMethod = getListAppointmentsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.ListAppointmentsRequest, com.producerflow.appointment.v1.ListAppointmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAppointments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.ListAppointmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.ListAppointmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("ListAppointments"))
              .build();
        }
      }
    }
    return getListAppointmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListEligibleLicensesRequest,
      com.producerflow.appointment.v1.ListEligibleLicensesResponse> getListEligibleLicensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEligibleLicenses",
      requestType = com.producerflow.appointment.v1.ListEligibleLicensesRequest.class,
      responseType = com.producerflow.appointment.v1.ListEligibleLicensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListEligibleLicensesRequest,
      com.producerflow.appointment.v1.ListEligibleLicensesResponse> getListEligibleLicensesMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListEligibleLicensesRequest, com.producerflow.appointment.v1.ListEligibleLicensesResponse> getListEligibleLicensesMethod;
    if ((getListEligibleLicensesMethod = AppointmentServiceGrpc.getListEligibleLicensesMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getListEligibleLicensesMethod = AppointmentServiceGrpc.getListEligibleLicensesMethod) == null) {
          AppointmentServiceGrpc.getListEligibleLicensesMethod = getListEligibleLicensesMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.ListEligibleLicensesRequest, com.producerflow.appointment.v1.ListEligibleLicensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEligibleLicenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.ListEligibleLicensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.ListEligibleLicensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("ListEligibleLicenses"))
              .build();
        }
      }
    }
    return getListEligibleLicensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.RequestAppointmentRequest,
      com.producerflow.appointment.v1.RequestAppointmentResponse> getRequestAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestAppointment",
      requestType = com.producerflow.appointment.v1.RequestAppointmentRequest.class,
      responseType = com.producerflow.appointment.v1.RequestAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.RequestAppointmentRequest,
      com.producerflow.appointment.v1.RequestAppointmentResponse> getRequestAppointmentMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.RequestAppointmentRequest, com.producerflow.appointment.v1.RequestAppointmentResponse> getRequestAppointmentMethod;
    if ((getRequestAppointmentMethod = AppointmentServiceGrpc.getRequestAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getRequestAppointmentMethod = AppointmentServiceGrpc.getRequestAppointmentMethod) == null) {
          AppointmentServiceGrpc.getRequestAppointmentMethod = getRequestAppointmentMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.RequestAppointmentRequest, com.producerflow.appointment.v1.RequestAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.RequestAppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.RequestAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("RequestAppointment"))
              .build();
        }
      }
    }
    return getRequestAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.TerminateAppointmentRequest,
      com.producerflow.appointment.v1.TerminateAppointmentResponse> getTerminateAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateAppointment",
      requestType = com.producerflow.appointment.v1.TerminateAppointmentRequest.class,
      responseType = com.producerflow.appointment.v1.TerminateAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.TerminateAppointmentRequest,
      com.producerflow.appointment.v1.TerminateAppointmentResponse> getTerminateAppointmentMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.TerminateAppointmentRequest, com.producerflow.appointment.v1.TerminateAppointmentResponse> getTerminateAppointmentMethod;
    if ((getTerminateAppointmentMethod = AppointmentServiceGrpc.getTerminateAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getTerminateAppointmentMethod = AppointmentServiceGrpc.getTerminateAppointmentMethod) == null) {
          AppointmentServiceGrpc.getTerminateAppointmentMethod = getTerminateAppointmentMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.TerminateAppointmentRequest, com.producerflow.appointment.v1.TerminateAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.TerminateAppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.TerminateAppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("TerminateAppointment"))
              .build();
        }
      }
    }
    return getTerminateAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListTerminationReasonsRequest,
      com.producerflow.appointment.v1.ListTerminationReasonsResponse> getListTerminationReasonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTerminationReasons",
      requestType = com.producerflow.appointment.v1.ListTerminationReasonsRequest.class,
      responseType = com.producerflow.appointment.v1.ListTerminationReasonsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListTerminationReasonsRequest,
      com.producerflow.appointment.v1.ListTerminationReasonsResponse> getListTerminationReasonsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.appointment.v1.ListTerminationReasonsRequest, com.producerflow.appointment.v1.ListTerminationReasonsResponse> getListTerminationReasonsMethod;
    if ((getListTerminationReasonsMethod = AppointmentServiceGrpc.getListTerminationReasonsMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getListTerminationReasonsMethod = AppointmentServiceGrpc.getListTerminationReasonsMethod) == null) {
          AppointmentServiceGrpc.getListTerminationReasonsMethod = getListTerminationReasonsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.appointment.v1.ListTerminationReasonsRequest, com.producerflow.appointment.v1.ListTerminationReasonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTerminationReasons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.ListTerminationReasonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.appointment.v1.ListTerminationReasonsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("ListTerminationReasons"))
              .build();
        }
      }
    }
    return getListTerminationReasonsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub>() {
        @java.lang.Override
        public AppointmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceStub(channel, callOptions);
        }
      };
    return AppointmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub>() {
        @java.lang.Override
        public AppointmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceBlockingStub(channel, callOptions);
        }
      };
    return AppointmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub>() {
        @java.lang.Override
        public AppointmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceFutureStub(channel, callOptions);
        }
      };
    return AppointmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AppointmentService manages license appointments through NIPR.
   * The appointment flow in NIPR is as follows:
   * 1. A new appointment (or termination) is requested for a license number.
   * 2. Some time later, NIPR processes the request and returns the final result.
   * Since NIPR does not return results immediately, RequestAppointment and
   * TerminateAppointment RPCs will return a processing status of IN_PROGRESS if
   * the request is accepted by NIPR. When the appointment is finally processed by
   * NIPR, ProducerFlow will notify via a webhook of the final result. Also, any
   * call from this point on to ListAppointments or GetAppointment will also
   * return the final result.
   * IMPORTANT: Appointments in registry states or with capacity carriers
   * (carriers that do not have NIPR integration) are processed automatically
   * without going through NIPR. In these cases:
   * - RequestAppointment will immediately return APPOINTED status.
   * - TerminateAppointment will immediately return TERMINATED status.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieves the details of an appointment by its ID.
     * </pre>
     */
    default void getAppointment(com.producerflow.appointment.v1.GetAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with requesting an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    default void getAppointmentFees(com.producerflow.appointment.v1.GetAppointmentFeesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointmentFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the carriers that are available to appoint licenses for the tenant.
     * </pre>
     */
    default void getAppointableCarriers(com.producerflow.appointment.v1.GetAppointableCarriersRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointableCarriersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointableCarriersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with terminating an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    default void getTerminationFees(com.producerflow.appointment.v1.GetTerminationFeesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetTerminationFeesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTerminationFeesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists appointments for the tenant, optionally filtered by processing status.
     * </pre>
     */
    default void listAppointments(com.producerflow.appointment.v1.ListAppointmentsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListAppointmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppointmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of licenses that are eligible to be appointed.
     * </pre>
     */
    default void listEligibleLicenses(com.producerflow.appointment.v1.ListEligibleLicensesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListEligibleLicensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEligibleLicensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Requests a new appointment for a license that is eligible to be appointed.
     * The simpler way to do this is to call ListEligibleLicenses to get a list of
     * licenses that are eligible to be appointed. Then, call RequestAppointment
     * for the licenses in the list that you want to appoint.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - If the request is accepted by NIPR, the appointment will have
     *   IN_PROGRESS processing status.
     * - If rejected, it will have REJECTED status and reasons will be provided
     *   in not_eligible_reasons.
     * - Final result will be delivered via webhook when NIPR completes
     *   processing.
     * For registry states or capacity carriers (carriers without NIPR
     * integration):
     * - The appointment is processed automatically and immediately.
     * - Returns APPOINTED status immediately upon successful processing.
     * </pre>
     */
    default void requestAppointment(com.producerflow.appointment.v1.RequestAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.RequestAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Terminates an existing appointment, permanently ending the relationship
     * between the license holder and the carrier.
     * Before calling this method, you must:
     * 1. Ensure the appointment exists and is in APPOINTED status.
     * 2. Call ListTerminationReasons to get valid termination reasons for the
     *    license's state.
     * 3. Select an appropriate termination reason from the state-specific list.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - The request is submitted to NIPR for processing.
     * - Once NIPR completes processing, the status becomes TERMINATED.
     * - If rejected by NIPR, the appointment remains in its current status.
     * - You will receive webhook notifications when the termination is processed
     *   by NIPR.
     * For registry states, capacity carriers (carriers without NIPR
     * integration), or synthetic appointments:
     * - The termination is processed automatically and immediately.
     * - Returns TERMINATED status immediately upon successful processing.
     * Important considerations:
     * - Termination is permanent and cannot be undone.
     * - Termination reasons must be valid for the specific state where the
     *   license is issued.
     * - Some terminations may incur fees (check GetTerminationFees first).
     * - The response indicates whether the termination request was successfully
     *   submitted, not whether the actual termination was completed (since NIPR
     *   processes asynchronously).
     * </pre>
     */
    default void terminateAppointment(com.producerflow.appointment.v1.TerminateAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.TerminateAppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists the valid termination reasons for appointments in a specific state.
     * When terminating an appointment, you must provide a valid termination
     * reason that is accepted by NIPR for the state where the license is
     * issued. Termination reasons vary by state, so you should call this method
     * first to retrieve the list of valid reasons before calling
     * TerminateAppointment.
     * The termination reasons returned are based on NIPR's valid termination
     * codes for the specified state. Each reason corresponds to a specific
     * business scenario for why an appointment might be terminated (e.g.,
     * voluntary termination, inadequate production, company merger, etc.).
     * </pre>
     */
    default void listTerminationReasons(com.producerflow.appointment.v1.ListTerminationReasonsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListTerminationReasonsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTerminationReasonsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AppointmentService.
   * <pre>
   * AppointmentService manages license appointments through NIPR.
   * The appointment flow in NIPR is as follows:
   * 1. A new appointment (or termination) is requested for a license number.
   * 2. Some time later, NIPR processes the request and returns the final result.
   * Since NIPR does not return results immediately, RequestAppointment and
   * TerminateAppointment RPCs will return a processing status of IN_PROGRESS if
   * the request is accepted by NIPR. When the appointment is finally processed by
   * NIPR, ProducerFlow will notify via a webhook of the final result. Also, any
   * call from this point on to ListAppointments or GetAppointment will also
   * return the final result.
   * IMPORTANT: Appointments in registry states or with capacity carriers
   * (carriers that do not have NIPR integration) are processed automatically
   * without going through NIPR. In these cases:
   * - RequestAppointment will immediately return APPOINTED status.
   * - TerminateAppointment will immediately return TERMINATED status.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static abstract class AppointmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AppointmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AppointmentService.
   * <pre>
   * AppointmentService manages license appointments through NIPR.
   * The appointment flow in NIPR is as follows:
   * 1. A new appointment (or termination) is requested for a license number.
   * 2. Some time later, NIPR processes the request and returns the final result.
   * Since NIPR does not return results immediately, RequestAppointment and
   * TerminateAppointment RPCs will return a processing status of IN_PROGRESS if
   * the request is accepted by NIPR. When the appointment is finally processed by
   * NIPR, ProducerFlow will notify via a webhook of the final result. Also, any
   * call from this point on to ListAppointments or GetAppointment will also
   * return the final result.
   * IMPORTANT: Appointments in registry states or with capacity carriers
   * (carriers that do not have NIPR integration) are processed automatically
   * without going through NIPR. In these cases:
   * - RequestAppointment will immediately return APPOINTED status.
   * - TerminateAppointment will immediately return TERMINATED status.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static final class AppointmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AppointmentServiceStub> {
    private AppointmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the details of an appointment by its ID.
     * </pre>
     */
    public void getAppointment(com.producerflow.appointment.v1.GetAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with requesting an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    public void getAppointmentFees(com.producerflow.appointment.v1.GetAppointmentFeesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointmentFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the carriers that are available to appoint licenses for the tenant.
     * </pre>
     */
    public void getAppointableCarriers(com.producerflow.appointment.v1.GetAppointableCarriersRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointableCarriersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointableCarriersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with terminating an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    public void getTerminationFees(com.producerflow.appointment.v1.GetTerminationFeesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetTerminationFeesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTerminationFeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists appointments for the tenant, optionally filtered by processing status.
     * </pre>
     */
    public void listAppointments(com.producerflow.appointment.v1.ListAppointmentsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListAppointmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAppointmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of licenses that are eligible to be appointed.
     * </pre>
     */
    public void listEligibleLicenses(com.producerflow.appointment.v1.ListEligibleLicensesRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListEligibleLicensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEligibleLicensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Requests a new appointment for a license that is eligible to be appointed.
     * The simpler way to do this is to call ListEligibleLicenses to get a list of
     * licenses that are eligible to be appointed. Then, call RequestAppointment
     * for the licenses in the list that you want to appoint.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - If the request is accepted by NIPR, the appointment will have
     *   IN_PROGRESS processing status.
     * - If rejected, it will have REJECTED status and reasons will be provided
     *   in not_eligible_reasons.
     * - Final result will be delivered via webhook when NIPR completes
     *   processing.
     * For registry states or capacity carriers (carriers without NIPR
     * integration):
     * - The appointment is processed automatically and immediately.
     * - Returns APPOINTED status immediately upon successful processing.
     * </pre>
     */
    public void requestAppointment(com.producerflow.appointment.v1.RequestAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.RequestAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Terminates an existing appointment, permanently ending the relationship
     * between the license holder and the carrier.
     * Before calling this method, you must:
     * 1. Ensure the appointment exists and is in APPOINTED status.
     * 2. Call ListTerminationReasons to get valid termination reasons for the
     *    license's state.
     * 3. Select an appropriate termination reason from the state-specific list.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - The request is submitted to NIPR for processing.
     * - Once NIPR completes processing, the status becomes TERMINATED.
     * - If rejected by NIPR, the appointment remains in its current status.
     * - You will receive webhook notifications when the termination is processed
     *   by NIPR.
     * For registry states, capacity carriers (carriers without NIPR
     * integration), or synthetic appointments:
     * - The termination is processed automatically and immediately.
     * - Returns TERMINATED status immediately upon successful processing.
     * Important considerations:
     * - Termination is permanent and cannot be undone.
     * - Termination reasons must be valid for the specific state where the
     *   license is issued.
     * - Some terminations may incur fees (check GetTerminationFees first).
     * - The response indicates whether the termination request was successfully
     *   submitted, not whether the actual termination was completed (since NIPR
     *   processes asynchronously).
     * </pre>
     */
    public void terminateAppointment(com.producerflow.appointment.v1.TerminateAppointmentRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.TerminateAppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists the valid termination reasons for appointments in a specific state.
     * When terminating an appointment, you must provide a valid termination
     * reason that is accepted by NIPR for the state where the license is
     * issued. Termination reasons vary by state, so you should call this method
     * first to retrieve the list of valid reasons before calling
     * TerminateAppointment.
     * The termination reasons returned are based on NIPR's valid termination
     * codes for the specified state. Each reason corresponds to a specific
     * business scenario for why an appointment might be terminated (e.g.,
     * voluntary termination, inadequate production, company merger, etc.).
     * </pre>
     */
    public void listTerminationReasons(com.producerflow.appointment.v1.ListTerminationReasonsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListTerminationReasonsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTerminationReasonsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AppointmentService.
   * <pre>
   * AppointmentService manages license appointments through NIPR.
   * The appointment flow in NIPR is as follows:
   * 1. A new appointment (or termination) is requested for a license number.
   * 2. Some time later, NIPR processes the request and returns the final result.
   * Since NIPR does not return results immediately, RequestAppointment and
   * TerminateAppointment RPCs will return a processing status of IN_PROGRESS if
   * the request is accepted by NIPR. When the appointment is finally processed by
   * NIPR, ProducerFlow will notify via a webhook of the final result. Also, any
   * call from this point on to ListAppointments or GetAppointment will also
   * return the final result.
   * IMPORTANT: Appointments in registry states or with capacity carriers
   * (carriers that do not have NIPR integration) are processed automatically
   * without going through NIPR. In these cases:
   * - RequestAppointment will immediately return APPOINTED status.
   * - TerminateAppointment will immediately return TERMINATED status.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static final class AppointmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AppointmentServiceBlockingStub> {
    private AppointmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the details of an appointment by its ID.
     * </pre>
     */
    public com.producerflow.appointment.v1.GetAppointmentResponse getAppointment(com.producerflow.appointment.v1.GetAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with requesting an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    public com.producerflow.appointment.v1.GetAppointmentFeesResponse getAppointmentFees(com.producerflow.appointment.v1.GetAppointmentFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the carriers that are available to appoint licenses for the tenant.
     * </pre>
     */
    public com.producerflow.appointment.v1.GetAppointableCarriersResponse getAppointableCarriers(com.producerflow.appointment.v1.GetAppointableCarriersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointableCarriersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with terminating an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    public com.producerflow.appointment.v1.GetTerminationFeesResponse getTerminationFees(com.producerflow.appointment.v1.GetTerminationFeesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTerminationFeesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists appointments for the tenant, optionally filtered by processing status.
     * </pre>
     */
    public com.producerflow.appointment.v1.ListAppointmentsResponse listAppointments(com.producerflow.appointment.v1.ListAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAppointmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of licenses that are eligible to be appointed.
     * </pre>
     */
    public com.producerflow.appointment.v1.ListEligibleLicensesResponse listEligibleLicenses(com.producerflow.appointment.v1.ListEligibleLicensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEligibleLicensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Requests a new appointment for a license that is eligible to be appointed.
     * The simpler way to do this is to call ListEligibleLicenses to get a list of
     * licenses that are eligible to be appointed. Then, call RequestAppointment
     * for the licenses in the list that you want to appoint.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - If the request is accepted by NIPR, the appointment will have
     *   IN_PROGRESS processing status.
     * - If rejected, it will have REJECTED status and reasons will be provided
     *   in not_eligible_reasons.
     * - Final result will be delivered via webhook when NIPR completes
     *   processing.
     * For registry states or capacity carriers (carriers without NIPR
     * integration):
     * - The appointment is processed automatically and immediately.
     * - Returns APPOINTED status immediately upon successful processing.
     * </pre>
     */
    public com.producerflow.appointment.v1.RequestAppointmentResponse requestAppointment(com.producerflow.appointment.v1.RequestAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Terminates an existing appointment, permanently ending the relationship
     * between the license holder and the carrier.
     * Before calling this method, you must:
     * 1. Ensure the appointment exists and is in APPOINTED status.
     * 2. Call ListTerminationReasons to get valid termination reasons for the
     *    license's state.
     * 3. Select an appropriate termination reason from the state-specific list.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - The request is submitted to NIPR for processing.
     * - Once NIPR completes processing, the status becomes TERMINATED.
     * - If rejected by NIPR, the appointment remains in its current status.
     * - You will receive webhook notifications when the termination is processed
     *   by NIPR.
     * For registry states, capacity carriers (carriers without NIPR
     * integration), or synthetic appointments:
     * - The termination is processed automatically and immediately.
     * - Returns TERMINATED status immediately upon successful processing.
     * Important considerations:
     * - Termination is permanent and cannot be undone.
     * - Termination reasons must be valid for the specific state where the
     *   license is issued.
     * - Some terminations may incur fees (check GetTerminationFees first).
     * - The response indicates whether the termination request was successfully
     *   submitted, not whether the actual termination was completed (since NIPR
     *   processes asynchronously).
     * </pre>
     */
    public com.producerflow.appointment.v1.TerminateAppointmentResponse terminateAppointment(com.producerflow.appointment.v1.TerminateAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists the valid termination reasons for appointments in a specific state.
     * When terminating an appointment, you must provide a valid termination
     * reason that is accepted by NIPR for the state where the license is
     * issued. Termination reasons vary by state, so you should call this method
     * first to retrieve the list of valid reasons before calling
     * TerminateAppointment.
     * The termination reasons returned are based on NIPR's valid termination
     * codes for the specified state. Each reason corresponds to a specific
     * business scenario for why an appointment might be terminated (e.g.,
     * voluntary termination, inadequate production, company merger, etc.).
     * </pre>
     */
    public com.producerflow.appointment.v1.ListTerminationReasonsResponse listTerminationReasons(com.producerflow.appointment.v1.ListTerminationReasonsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTerminationReasonsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AppointmentService.
   * <pre>
   * AppointmentService manages license appointments through NIPR.
   * The appointment flow in NIPR is as follows:
   * 1. A new appointment (or termination) is requested for a license number.
   * 2. Some time later, NIPR processes the request and returns the final result.
   * Since NIPR does not return results immediately, RequestAppointment and
   * TerminateAppointment RPCs will return a processing status of IN_PROGRESS if
   * the request is accepted by NIPR. When the appointment is finally processed by
   * NIPR, ProducerFlow will notify via a webhook of the final result. Also, any
   * call from this point on to ListAppointments or GetAppointment will also
   * return the final result.
   * IMPORTANT: Appointments in registry states or with capacity carriers
   * (carriers that do not have NIPR integration) are processed automatically
   * without going through NIPR. In these cases:
   * - RequestAppointment will immediately return APPOINTED status.
   * - TerminateAppointment will immediately return TERMINATED status.
   * Any call to this service must be authenticated using an API key in the
   * request headers. The API key can be found in the ProducerFlow API key
   * section of the ProducerFlow UI and it identifies the tenant that is making
   * the request.
   * </pre>
   */
  public static final class AppointmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AppointmentServiceFutureStub> {
    private AppointmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieves the details of an appointment by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.GetAppointmentResponse> getAppointment(
        com.producerflow.appointment.v1.GetAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with requesting an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.GetAppointmentFeesResponse> getAppointmentFees(
        com.producerflow.appointment.v1.GetAppointmentFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the carriers that are available to appoint licenses for the tenant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.GetAppointableCarriersResponse> getAppointableCarriers(
        com.producerflow.appointment.v1.GetAppointableCarriersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointableCarriersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the total fees associated with terminating an appointment for the given license.
     * Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.GetTerminationFeesResponse> getTerminationFees(
        com.producerflow.appointment.v1.GetTerminationFeesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTerminationFeesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists appointments for the tenant, optionally filtered by processing status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.ListAppointmentsResponse> listAppointments(
        com.producerflow.appointment.v1.ListAppointmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAppointmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of licenses that are eligible to be appointed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.ListEligibleLicensesResponse> listEligibleLicenses(
        com.producerflow.appointment.v1.ListEligibleLicensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEligibleLicensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Requests a new appointment for a license that is eligible to be appointed.
     * The simpler way to do this is to call ListEligibleLicenses to get a list of
     * licenses that are eligible to be appointed. Then, call RequestAppointment
     * for the licenses in the list that you want to appoint.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - If the request is accepted by NIPR, the appointment will have
     *   IN_PROGRESS processing status.
     * - If rejected, it will have REJECTED status and reasons will be provided
     *   in not_eligible_reasons.
     * - Final result will be delivered via webhook when NIPR completes
     *   processing.
     * For registry states or capacity carriers (carriers without NIPR
     * integration):
     * - The appointment is processed automatically and immediately.
     * - Returns APPOINTED status immediately upon successful processing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.RequestAppointmentResponse> requestAppointment(
        com.producerflow.appointment.v1.RequestAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Terminates an existing appointment, permanently ending the relationship
     * between the license holder and the carrier.
     * Before calling this method, you must:
     * 1. Ensure the appointment exists and is in APPOINTED status.
     * 2. Call ListTerminationReasons to get valid termination reasons for the
     *    license's state.
     * 3. Select an appropriate termination reason from the state-specific list.
     * Processing behavior varies based on the license state and carrier NIPR
     * integration:
     * For NIPR-integrated carriers in non-registry states:
     * - The request is submitted to NIPR for processing.
     * - Once NIPR completes processing, the status becomes TERMINATED.
     * - If rejected by NIPR, the appointment remains in its current status.
     * - You will receive webhook notifications when the termination is processed
     *   by NIPR.
     * For registry states, capacity carriers (carriers without NIPR
     * integration), or synthetic appointments:
     * - The termination is processed automatically and immediately.
     * - Returns TERMINATED status immediately upon successful processing.
     * Important considerations:
     * - Termination is permanent and cannot be undone.
     * - Termination reasons must be valid for the specific state where the
     *   license is issued.
     * - Some terminations may incur fees (check GetTerminationFees first).
     * - The response indicates whether the termination request was successfully
     *   submitted, not whether the actual termination was completed (since NIPR
     *   processes asynchronously).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.TerminateAppointmentResponse> terminateAppointment(
        com.producerflow.appointment.v1.TerminateAppointmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists the valid termination reasons for appointments in a specific state.
     * When terminating an appointment, you must provide a valid termination
     * reason that is accepted by NIPR for the state where the license is
     * issued. Termination reasons vary by state, so you should call this method
     * first to retrieve the list of valid reasons before calling
     * TerminateAppointment.
     * The termination reasons returned are based on NIPR's valid termination
     * codes for the specified state. Each reason corresponds to a specific
     * business scenario for why an appointment might be terminated (e.g.,
     * voluntary termination, inadequate production, company merger, etc.).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.appointment.v1.ListTerminationReasonsResponse> listTerminationReasons(
        com.producerflow.appointment.v1.ListTerminationReasonsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTerminationReasonsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_APPOINTMENT = 0;
  private static final int METHODID_GET_APPOINTMENT_FEES = 1;
  private static final int METHODID_GET_APPOINTABLE_CARRIERS = 2;
  private static final int METHODID_GET_TERMINATION_FEES = 3;
  private static final int METHODID_LIST_APPOINTMENTS = 4;
  private static final int METHODID_LIST_ELIGIBLE_LICENSES = 5;
  private static final int METHODID_REQUEST_APPOINTMENT = 6;
  private static final int METHODID_TERMINATE_APPOINTMENT = 7;
  private static final int METHODID_LIST_TERMINATION_REASONS = 8;

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
        case METHODID_GET_APPOINTMENT:
          serviceImpl.getAppointment((com.producerflow.appointment.v1.GetAppointmentRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointmentResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENT_FEES:
          serviceImpl.getAppointmentFees((com.producerflow.appointment.v1.GetAppointmentFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointmentFeesResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTABLE_CARRIERS:
          serviceImpl.getAppointableCarriers((com.producerflow.appointment.v1.GetAppointableCarriersRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetAppointableCarriersResponse>) responseObserver);
          break;
        case METHODID_GET_TERMINATION_FEES:
          serviceImpl.getTerminationFees((com.producerflow.appointment.v1.GetTerminationFeesRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.GetTerminationFeesResponse>) responseObserver);
          break;
        case METHODID_LIST_APPOINTMENTS:
          serviceImpl.listAppointments((com.producerflow.appointment.v1.ListAppointmentsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListAppointmentsResponse>) responseObserver);
          break;
        case METHODID_LIST_ELIGIBLE_LICENSES:
          serviceImpl.listEligibleLicenses((com.producerflow.appointment.v1.ListEligibleLicensesRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListEligibleLicensesResponse>) responseObserver);
          break;
        case METHODID_REQUEST_APPOINTMENT:
          serviceImpl.requestAppointment((com.producerflow.appointment.v1.RequestAppointmentRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.RequestAppointmentResponse>) responseObserver);
          break;
        case METHODID_TERMINATE_APPOINTMENT:
          serviceImpl.terminateAppointment((com.producerflow.appointment.v1.TerminateAppointmentRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.TerminateAppointmentResponse>) responseObserver);
          break;
        case METHODID_LIST_TERMINATION_REASONS:
          serviceImpl.listTerminationReasons((com.producerflow.appointment.v1.ListTerminationReasonsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.appointment.v1.ListTerminationReasonsResponse>) responseObserver);
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
          getGetAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.GetAppointmentRequest,
              com.producerflow.appointment.v1.GetAppointmentResponse>(
                service, METHODID_GET_APPOINTMENT)))
        .addMethod(
          getGetAppointmentFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.GetAppointmentFeesRequest,
              com.producerflow.appointment.v1.GetAppointmentFeesResponse>(
                service, METHODID_GET_APPOINTMENT_FEES)))
        .addMethod(
          getGetAppointableCarriersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.GetAppointableCarriersRequest,
              com.producerflow.appointment.v1.GetAppointableCarriersResponse>(
                service, METHODID_GET_APPOINTABLE_CARRIERS)))
        .addMethod(
          getGetTerminationFeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.GetTerminationFeesRequest,
              com.producerflow.appointment.v1.GetTerminationFeesResponse>(
                service, METHODID_GET_TERMINATION_FEES)))
        .addMethod(
          getListAppointmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.ListAppointmentsRequest,
              com.producerflow.appointment.v1.ListAppointmentsResponse>(
                service, METHODID_LIST_APPOINTMENTS)))
        .addMethod(
          getListEligibleLicensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.ListEligibleLicensesRequest,
              com.producerflow.appointment.v1.ListEligibleLicensesResponse>(
                service, METHODID_LIST_ELIGIBLE_LICENSES)))
        .addMethod(
          getRequestAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.RequestAppointmentRequest,
              com.producerflow.appointment.v1.RequestAppointmentResponse>(
                service, METHODID_REQUEST_APPOINTMENT)))
        .addMethod(
          getTerminateAppointmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.TerminateAppointmentRequest,
              com.producerflow.appointment.v1.TerminateAppointmentResponse>(
                service, METHODID_TERMINATE_APPOINTMENT)))
        .addMethod(
          getListTerminationReasonsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.appointment.v1.ListTerminationReasonsRequest,
              com.producerflow.appointment.v1.ListTerminationReasonsResponse>(
                service, METHODID_LIST_TERMINATION_REASONS)))
        .build();
  }

  private static abstract class AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.producerflow.appointment.v1.AppointmentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppointmentService");
    }
  }

  private static final class AppointmentServiceFileDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier {
    AppointmentServiceFileDescriptorSupplier() {}
  }

  private static final class AppointmentServiceMethodDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AppointmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AppointmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentServiceFileDescriptorSupplier())
              .addMethod(getGetAppointmentMethod())
              .addMethod(getGetAppointmentFeesMethod())
              .addMethod(getGetAppointableCarriersMethod())
              .addMethod(getGetTerminationFeesMethod())
              .addMethod(getListAppointmentsMethod())
              .addMethod(getListEligibleLicensesMethod())
              .addMethod(getRequestAppointmentMethod())
              .addMethod(getTerminateAppointmentMethod())
              .addMethod(getListTerminationReasonsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
