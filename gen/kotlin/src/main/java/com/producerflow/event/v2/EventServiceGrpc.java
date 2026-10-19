package com.producerflow.event.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * EventService reads the log of changes to the account of the tenant the API
 * key belongs to: which entity changed, which of its fields, and what each one
 * changed to. Current state comes from the resource APIs; the log says what to
 * read again.
 * A consumer deduplicates on the event id, applies events in the order they
 * are returned, persists the checkpoint every response carries and passes it
 * back, and ignores an event type or a field it does not recognise.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: producerflow/event/v2/event.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "producerflow.event.v2.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.producerflow.event.v2.ListEventsRequest,
      com.producerflow.event.v2.ListEventsResponse> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvents",
      requestType = com.producerflow.event.v2.ListEventsRequest.class,
      responseType = com.producerflow.event.v2.ListEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.event.v2.ListEventsRequest,
      com.producerflow.event.v2.ListEventsResponse> getListEventsMethod() {
    io.grpc.MethodDescriptor<com.producerflow.event.v2.ListEventsRequest, com.producerflow.event.v2.ListEventsResponse> getListEventsMethod;
    if ((getListEventsMethod = EventServiceGrpc.getListEventsMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getListEventsMethod = EventServiceGrpc.getListEventsMethod) == null) {
          EventServiceGrpc.getListEventsMethod = getListEventsMethod =
              io.grpc.MethodDescriptor.<com.producerflow.event.v2.ListEventsRequest, com.producerflow.event.v2.ListEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.event.v2.ListEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.event.v2.ListEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("ListEvents"))
              .build();
        }
      }
    }
    return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.producerflow.event.v2.GetEventRequest,
      com.producerflow.event.v2.GetEventResponse> getGetEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvent",
      requestType = com.producerflow.event.v2.GetEventRequest.class,
      responseType = com.producerflow.event.v2.GetEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.producerflow.event.v2.GetEventRequest,
      com.producerflow.event.v2.GetEventResponse> getGetEventMethod() {
    io.grpc.MethodDescriptor<com.producerflow.event.v2.GetEventRequest, com.producerflow.event.v2.GetEventResponse> getGetEventMethod;
    if ((getGetEventMethod = EventServiceGrpc.getGetEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getGetEventMethod = EventServiceGrpc.getGetEventMethod) == null) {
          EventServiceGrpc.getGetEventMethod = getGetEventMethod =
              io.grpc.MethodDescriptor.<com.producerflow.event.v2.GetEventRequest, com.producerflow.event.v2.GetEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.event.v2.GetEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.producerflow.event.v2.GetEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("GetEvent"))
              .build();
        }
      }
    }
    return getGetEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * EventService reads the log of changes to the account of the tenant the API
   * key belongs to: which entity changed, which of its fields, and what each one
   * changed to. Current state comes from the resource APIs; the log says what to
   * read again.
   * A consumer deduplicates on the event id, applies events in the order they
   * are returned, persists the checkpoint every response carries and passes it
   * back, and ignores an event type or a field it does not recognise.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * ListEvents returns the events after a checkpoint, in log order. Without a
     * checkpoint it returns no events and the present position: take it before
     * reading current state through the resource APIs, then read forward from
     * it.
     * An update whose every change is to a field the entity's resource does not
     * carry says nothing to apply, and is not returned.
     * The log can be read 90 days back. A checkpoint older than that is
     * OUT_OF_RANGE: read current state again and take a new checkpoint. A
     * checkpoint that cannot be read, or one ahead of the log, is
     * INVALID_ARGUMENT.
     * </pre>
     */
    default void listEvents(com.producerflow.event.v2.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.event.v2.ListEventsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEvent returns one event by id. NOT_FOUND means the tenant has no such
     * event in the last 90 days that ListEvents returns.
     * </pre>
     */
    default void getEvent(com.producerflow.event.v2.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.event.v2.GetEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEventMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EventService.
   * <pre>
   * EventService reads the log of changes to the account of the tenant the API
   * key belongs to: which entity changed, which of its fields, and what each one
   * changed to. Current state comes from the resource APIs; the log says what to
   * read again.
   * A consumer deduplicates on the event id, applies events in the order they
   * are returned, persists the checkpoint every response carries and passes it
   * back, and ignores an event type or a field it does not recognise.
   * </pre>
   */
  public static abstract class EventServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EventService.
   * <pre>
   * EventService reads the log of changes to the account of the tenant the API
   * key belongs to: which entity changed, which of its fields, and what each one
   * changed to. Current state comes from the resource APIs; the log says what to
   * read again.
   * A consumer deduplicates on the event id, applies events in the order they
   * are returned, persists the checkpoint every response carries and passes it
   * back, and ignores an event type or a field it does not recognise.
   * </pre>
   */
  public static final class EventServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListEvents returns the events after a checkpoint, in log order. Without a
     * checkpoint it returns no events and the present position: take it before
     * reading current state through the resource APIs, then read forward from
     * it.
     * An update whose every change is to a field the entity's resource does not
     * carry says nothing to apply, and is not returned.
     * The log can be read 90 days back. A checkpoint older than that is
     * OUT_OF_RANGE: read current state again and take a new checkpoint. A
     * checkpoint that cannot be read, or one ahead of the log, is
     * INVALID_ARGUMENT.
     * </pre>
     */
    public void listEvents(com.producerflow.event.v2.ListEventsRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.event.v2.ListEventsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEvent returns one event by id. NOT_FOUND means the tenant has no such
     * event in the last 90 days that ListEvents returns.
     * </pre>
     */
    public void getEvent(com.producerflow.event.v2.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.producerflow.event.v2.GetEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EventService.
   * <pre>
   * EventService reads the log of changes to the account of the tenant the API
   * key belongs to: which entity changed, which of its fields, and what each one
   * changed to. Current state comes from the resource APIs; the log says what to
   * read again.
   * A consumer deduplicates on the event id, applies events in the order they
   * are returned, persists the checkpoint every response carries and passes it
   * back, and ignores an event type or a field it does not recognise.
   * </pre>
   */
  public static final class EventServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListEvents returns the events after a checkpoint, in log order. Without a
     * checkpoint it returns no events and the present position: take it before
     * reading current state through the resource APIs, then read forward from
     * it.
     * An update whose every change is to a field the entity's resource does not
     * carry says nothing to apply, and is not returned.
     * The log can be read 90 days back. A checkpoint older than that is
     * OUT_OF_RANGE: read current state again and take a new checkpoint. A
     * checkpoint that cannot be read, or one ahead of the log, is
     * INVALID_ARGUMENT.
     * </pre>
     */
    public com.producerflow.event.v2.ListEventsResponse listEvents(com.producerflow.event.v2.ListEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEvent returns one event by id. NOT_FOUND means the tenant has no such
     * event in the last 90 days that ListEvents returns.
     * </pre>
     */
    public com.producerflow.event.v2.GetEventResponse getEvent(com.producerflow.event.v2.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEventMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EventService.
   * <pre>
   * EventService reads the log of changes to the account of the tenant the API
   * key belongs to: which entity changed, which of its fields, and what each one
   * changed to. Current state comes from the resource APIs; the log says what to
   * read again.
   * A consumer deduplicates on the event id, applies events in the order they
   * are returned, persists the checkpoint every response carries and passes it
   * back, and ignores an event type or a field it does not recognise.
   * </pre>
   */
  public static final class EventServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListEvents returns the events after a checkpoint, in log order. Without a
     * checkpoint it returns no events and the present position: take it before
     * reading current state through the resource APIs, then read forward from
     * it.
     * An update whose every change is to a field the entity's resource does not
     * carry says nothing to apply, and is not returned.
     * The log can be read 90 days back. A checkpoint older than that is
     * OUT_OF_RANGE: read current state again and take a new checkpoint. A
     * checkpoint that cannot be read, or one ahead of the log, is
     * INVALID_ARGUMENT.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.event.v2.ListEventsResponse> listEvents(
        com.producerflow.event.v2.ListEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEvent returns one event by id. NOT_FOUND means the tenant has no such
     * event in the last 90 days that ListEvents returns.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.producerflow.event.v2.GetEventResponse> getEvent(
        com.producerflow.event.v2.GetEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EVENTS = 0;
  private static final int METHODID_GET_EVENT = 1;

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
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((com.producerflow.event.v2.ListEventsRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.event.v2.ListEventsResponse>) responseObserver);
          break;
        case METHODID_GET_EVENT:
          serviceImpl.getEvent((com.producerflow.event.v2.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<com.producerflow.event.v2.GetEventResponse>) responseObserver);
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
          getListEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.event.v2.ListEventsRequest,
              com.producerflow.event.v2.ListEventsResponse>(
                service, METHODID_LIST_EVENTS)))
        .addMethod(
          getGetEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.producerflow.event.v2.GetEventRequest,
              com.producerflow.event.v2.GetEventResponse>(
                service, METHODID_GET_EVENT)))
        .build();
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.producerflow.event.v2.EventProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EventServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getListEventsMethod())
              .addMethod(getGetEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
