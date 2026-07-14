package com.producerflow.testing.v1

import com.producerflow.testing.v1.TestingServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for producerflow.testing.v1.TestingService.
 */
public object TestingServiceGrpcKt {
  public const val SERVICE_NAME: String = TestingServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val deleteAgencyMethod: MethodDescriptor<DeleteAgencyRequest, DeleteAgencyResponse>
    @JvmStatic
    get() = TestingServiceGrpc.getDeleteAgencyMethod()

  public val deleteAppointmentMethod:
      MethodDescriptor<DeleteAppointmentRequest, DeleteAppointmentResponse>
    @JvmStatic
    get() = TestingServiceGrpc.getDeleteAppointmentMethod()

  /**
   * A stub for issuing RPCs to a(n) producerflow.testing.v1.TestingService service as suspending coroutines.
   */
  @StubFor(TestingServiceGrpc::class)
  public class TestingServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TestingServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TestingServiceCoroutineStub = TestingServiceCoroutineStub(channel, callOptions)

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
    public suspend fun deleteAgency(request: DeleteAgencyRequest, headers: Metadata = Metadata()): DeleteAgencyResponse = unaryRpc(
      channel,
      TestingServiceGrpc.getDeleteAgencyMethod(),
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
    public suspend fun deleteAppointment(request: DeleteAppointmentRequest, headers: Metadata = Metadata()): DeleteAppointmentResponse = unaryRpc(
      channel,
      TestingServiceGrpc.getDeleteAppointmentMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the producerflow.testing.v1.TestingService service based on Kotlin coroutines.
   */
  public abstract class TestingServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for producerflow.testing.v1.TestingService.DeleteAgency.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteAgency(request: DeleteAgencyRequest): DeleteAgencyResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.testing.v1.TestingService.DeleteAgency is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.testing.v1.TestingService.DeleteAppointment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteAppointment(request: DeleteAppointmentRequest): DeleteAppointmentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.testing.v1.TestingService.DeleteAppointment is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TestingServiceGrpc.getDeleteAgencyMethod(),
      implementation = ::deleteAgency
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TestingServiceGrpc.getDeleteAppointmentMethod(),
      implementation = ::deleteAppointment
    )).build()
  }
}
