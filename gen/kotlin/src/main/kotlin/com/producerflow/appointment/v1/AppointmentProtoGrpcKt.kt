package com.producerflow.appointment.v1

import com.producerflow.appointment.v1.AppointmentServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for producerflow.appointment.v1.AppointmentService.
 */
public object AppointmentServiceGrpcKt {
  public const val SERVICE_NAME: String = AppointmentServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getAppointmentMethod: MethodDescriptor<GetAppointmentRequest, GetAppointmentResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getGetAppointmentMethod()

  public val getAppointmentFeesMethod:
      MethodDescriptor<GetAppointmentFeesRequest, GetAppointmentFeesResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getGetAppointmentFeesMethod()

  public val getAppointableCarriersMethod:
      MethodDescriptor<GetAppointableCarriersRequest, GetAppointableCarriersResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getGetAppointableCarriersMethod()

  public val getTerminationFeesMethod:
      MethodDescriptor<GetTerminationFeesRequest, GetTerminationFeesResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getGetTerminationFeesMethod()

  public val listAppointmentsMethod:
      MethodDescriptor<ListAppointmentsRequest, ListAppointmentsResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getListAppointmentsMethod()

  public val listEligibleLicensesMethod:
      MethodDescriptor<ListEligibleLicensesRequest, ListEligibleLicensesResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getListEligibleLicensesMethod()

  public val requestAppointmentMethod:
      MethodDescriptor<RequestAppointmentRequest, RequestAppointmentResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getRequestAppointmentMethod()

  public val terminateAppointmentMethod:
      MethodDescriptor<TerminateAppointmentRequest, TerminateAppointmentResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getTerminateAppointmentMethod()

  public val listTerminationReasonsMethod:
      MethodDescriptor<ListTerminationReasonsRequest, ListTerminationReasonsResponse>
    @JvmStatic
    get() = AppointmentServiceGrpc.getListTerminationReasonsMethod()

  /**
   * A stub for issuing RPCs to a(n) producerflow.appointment.v1.AppointmentService service as suspending coroutines.
   */
  @StubFor(AppointmentServiceGrpc::class)
  public class AppointmentServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<AppointmentServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AppointmentServiceCoroutineStub = AppointmentServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getAppointment(request: GetAppointmentRequest, headers: Metadata = Metadata()): GetAppointmentResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getGetAppointmentMethod(),
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
    public suspend fun getAppointmentFees(request: GetAppointmentFeesRequest, headers: Metadata = Metadata()): GetAppointmentFeesResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getGetAppointmentFeesMethod(),
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
    public suspend fun getAppointableCarriers(request: GetAppointableCarriersRequest, headers: Metadata = Metadata()): GetAppointableCarriersResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getGetAppointableCarriersMethod(),
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
    public suspend fun getTerminationFees(request: GetTerminationFeesRequest, headers: Metadata = Metadata()): GetTerminationFeesResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getGetTerminationFeesMethod(),
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
    public suspend fun listAppointments(request: ListAppointmentsRequest, headers: Metadata = Metadata()): ListAppointmentsResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getListAppointmentsMethod(),
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
    public suspend fun listEligibleLicenses(request: ListEligibleLicensesRequest, headers: Metadata = Metadata()): ListEligibleLicensesResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getListEligibleLicensesMethod(),
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
    public suspend fun requestAppointment(request: RequestAppointmentRequest, headers: Metadata = Metadata()): RequestAppointmentResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getRequestAppointmentMethod(),
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
    public suspend fun terminateAppointment(request: TerminateAppointmentRequest, headers: Metadata = Metadata()): TerminateAppointmentResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getTerminateAppointmentMethod(),
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
    public suspend fun listTerminationReasons(request: ListTerminationReasonsRequest, headers: Metadata = Metadata()): ListTerminationReasonsResponse = unaryRpc(
      channel,
      AppointmentServiceGrpc.getListTerminationReasonsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the producerflow.appointment.v1.AppointmentService service based on Kotlin coroutines.
   */
  public abstract class AppointmentServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.GetAppointment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAppointment(request: GetAppointmentRequest): GetAppointmentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.GetAppointment is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.GetAppointmentFees.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAppointmentFees(request: GetAppointmentFeesRequest): GetAppointmentFeesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.GetAppointmentFees is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.GetAppointableCarriers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAppointableCarriers(request: GetAppointableCarriersRequest): GetAppointableCarriersResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.GetAppointableCarriers is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.GetTerminationFees.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTerminationFees(request: GetTerminationFeesRequest): GetTerminationFeesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.GetTerminationFees is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.ListAppointments.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listAppointments(request: ListAppointmentsRequest): ListAppointmentsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.ListAppointments is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.ListEligibleLicenses.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listEligibleLicenses(request: ListEligibleLicensesRequest): ListEligibleLicensesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.ListEligibleLicenses is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.RequestAppointment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun requestAppointment(request: RequestAppointmentRequest): RequestAppointmentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.RequestAppointment is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.TerminateAppointment.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun terminateAppointment(request: TerminateAppointmentRequest): TerminateAppointmentResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.TerminateAppointment is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.appointment.v1.AppointmentService.ListTerminationReasons.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listTerminationReasons(request: ListTerminationReasonsRequest): ListTerminationReasonsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.appointment.v1.AppointmentService.ListTerminationReasons is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getGetAppointmentMethod(),
      implementation = ::getAppointment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getGetAppointmentFeesMethod(),
      implementation = ::getAppointmentFees
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getGetAppointableCarriersMethod(),
      implementation = ::getAppointableCarriers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getGetTerminationFeesMethod(),
      implementation = ::getTerminationFees
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getListAppointmentsMethod(),
      implementation = ::listAppointments
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getListEligibleLicensesMethod(),
      implementation = ::listEligibleLicenses
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getRequestAppointmentMethod(),
      implementation = ::requestAppointment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getTerminateAppointmentMethod(),
      implementation = ::terminateAppointment
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AppointmentServiceGrpc.getListTerminationReasonsMethod(),
      implementation = ::listTerminationReasons
    )).build()
  }
}
