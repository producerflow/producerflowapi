package com.producerflow.event.v2

import com.producerflow.event.v2.EventServiceGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for producerflow.event.v2.EventService.
 */
public object EventServiceGrpcKt {
  public const val SERVICE_NAME: String = EventServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listEventsMethod: MethodDescriptor<ListEventsRequest, ListEventsResponse>
    @JvmStatic
    get() = EventServiceGrpc.getListEventsMethod()

  public val getEventMethod: MethodDescriptor<GetEventRequest, GetEventResponse>
    @JvmStatic
    get() = EventServiceGrpc.getGetEventMethod()

  /**
   * A stub for issuing RPCs to a(n) producerflow.event.v2.EventService service as suspending coroutines.
   */
  @StubFor(EventServiceGrpc::class)
  public class EventServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<EventServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): EventServiceCoroutineStub = EventServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listEvents(request: ListEventsRequest, headers: Metadata = Metadata()): ListEventsResponse = unaryRpc(
      channel,
      EventServiceGrpc.getListEventsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getEvent(request: GetEventRequest, headers: Metadata = Metadata()): GetEventResponse = unaryRpc(
      channel,
      EventServiceGrpc.getGetEventMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the producerflow.event.v2.EventService service based on Kotlin coroutines.
   */
  public abstract class EventServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for producerflow.event.v2.EventService.ListEvents.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listEvents(request: ListEventsRequest): ListEventsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.event.v2.EventService.ListEvents is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.event.v2.EventService.GetEvent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getEvent(request: GetEventRequest): GetEventResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.event.v2.EventService.GetEvent is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getListEventsMethod(),
      implementation = ::listEvents
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = EventServiceGrpc.getGetEventMethod(),
      implementation = ::getEvent
    )).build()
  }
}
