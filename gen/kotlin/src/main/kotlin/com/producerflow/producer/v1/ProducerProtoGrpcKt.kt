package com.producerflow.producer.v1

import com.producerflow.producer.v1.ProducerServiceGrpc.getServiceDescriptor
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
import kotlin.Deprecated
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for producerflow.producer.v1.ProducerService.
 */
public object ProducerServiceGrpcKt {
  public const val SERVICE_NAME: String = ProducerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val createAgencyOnboardingURLMethod:
      MethodDescriptor<CreateAgencyOnboardingURLRequest, CreateAgencyOnboardingURLResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getCreateAgencyOnboardingURLMethod()

  public val createProducerOnboardingURLMethod:
      MethodDescriptor<CreateProducerOnboardingURLRequest, CreateProducerOnboardingURLResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getCreateProducerOnboardingURLMethod()

  public val newAgencyMethod: MethodDescriptor<NewAgencyRequest, NewAgencyResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getNewAgencyMethod()

  public val listAgenciesMethod: MethodDescriptor<ListAgenciesRequest, ListAgenciesResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getListAgenciesMethod()

  public val listOrganizationsMethod:
      MethodDescriptor<ListOrganizationsRequest, ListOrganizationsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getListOrganizationsMethod()

  public val getOrganizationMethod:
      MethodDescriptor<GetOrganizationRequest, GetOrganizationResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getGetOrganizationMethod()

  public val createOrganizationMethod:
      MethodDescriptor<CreateOrganizationRequest, CreateOrganizationResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getCreateOrganizationMethod()

  public val newProducerMethod: MethodDescriptor<NewProducerRequest, NewProducerResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getNewProducerMethod()

  public val newProducersMethod: MethodDescriptor<NewProducersRequest, NewProducersResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getNewProducersMethod()

  public val getAgencyAndProducersMethod:
      MethodDescriptor<GetAgencyAndProducersRequest, GetAgencyAndProducersResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getGetAgencyAndProducersMethod()

  public val getAgencyProducersMethod:
      MethodDescriptor<GetAgencyProducersRequest, GetAgencyProducersResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getGetAgencyProducersMethod()

  public val getAgencyMethod: MethodDescriptor<GetAgencyRequest, GetAgencyResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getGetAgencyMethod()

  public val getProducerMethod: MethodDescriptor<GetProducerRequest, GetProducerResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getGetProducerMethod()

  public val listProducerRolesMethod:
      MethodDescriptor<ListProducerRolesRequest, ListProducerRolesResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getListProducerRolesMethod()

  public val getAgencyFilesMethod: MethodDescriptor<GetAgencyFilesRequest, GetAgencyFilesResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getGetAgencyFilesMethod()

  public val updateProducerMethod: MethodDescriptor<UpdateProducerRequest, UpdateProducerResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getUpdateProducerMethod()

  public val updateAgencyMethod: MethodDescriptor<UpdateAgencyRequest, UpdateAgencyResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getUpdateAgencyMethod()

  public val newContactMethod: MethodDescriptor<NewContactRequest, NewContactResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getNewContactMethod()

  public val newContactsMethod: MethodDescriptor<NewContactsRequest, NewContactsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getNewContactsMethod()

  public val listAgencyContactsMethod:
      MethodDescriptor<ListAgencyContactsRequest, ListAgencyContactsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getListAgencyContactsMethod()

  public val updateContactMethod: MethodDescriptor<UpdateContactRequest, UpdateContactResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getUpdateContactMethod()

  public val setExternalIDMethod: MethodDescriptor<SetExternalIDRequest, SetExternalIDResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getSetExternalIDMethod()

  public val validateProducerNPNMethod:
      MethodDescriptor<ValidateProducerNPNRequest, ValidateProducerNPNResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getValidateProducerNPNMethod()

  public val validateAgencyNPNMethod:
      MethodDescriptor<ValidateAgencyNPNRequest, ValidateAgencyNPNResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getValidateAgencyNPNMethod()

  public val lookupNPNByFEINMethod:
      MethodDescriptor<LookupNPNByFEINRequest, LookupNPNByFEINResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getLookupNPNByFEINMethod()

  public val resyncProducerMethod: MethodDescriptor<ResyncProducerRequest, ResyncProducerResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getResyncProducerMethod()

  public val resyncAgencyMethod: MethodDescriptor<ResyncAgencyRequest, ResyncAgencyResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getResyncAgencyMethod()

  public val syncProducerWithNIPRMethod:
      MethodDescriptor<SyncProducerWithNIPRRequest, SyncProducerWithNIPRResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getSyncProducerWithNIPRMethod()

  public val syncAgencyWithNIPRMethod:
      MethodDescriptor<SyncAgencyWithNIPRRequest, SyncAgencyWithNIPRResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getSyncAgencyWithNIPRMethod()

  public val stopSyncProducerWithNIPRMethod:
      MethodDescriptor<StopSyncProducerWithNIPRRequest, StopSyncProducerWithNIPRResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getStopSyncProducerWithNIPRMethod()

  public val stopSyncAgencyWithNIPRMethod:
      MethodDescriptor<StopSyncAgencyWithNIPRRequest, StopSyncAgencyWithNIPRResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getStopSyncAgencyWithNIPRMethod()

  public val createProducerUploadURLMethod:
      MethodDescriptor<CreateProducerUploadURLRequest, CreateProducerUploadURLResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getCreateProducerUploadURLMethod()

  public val addAgencyLocationsMethod:
      MethodDescriptor<AddAgencyLocationsRequest, AddAgencyLocationsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getAddAgencyLocationsMethod()

  public val removeAgencyLocationsMethod:
      MethodDescriptor<RemoveAgencyLocationsRequest, RemoveAgencyLocationsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getRemoveAgencyLocationsMethod()

  public val listAgencyLocationsMethod:
      MethodDescriptor<ListAgencyLocationsRequest, ListAgencyLocationsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getListAgencyLocationsMethod()

  public val assignProducerToLocationsMethod:
      MethodDescriptor<AssignProducerToLocationsRequest, AssignProducerToLocationsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getAssignProducerToLocationsMethod()

  public val unassignProducerFromLocationsMethod:
      MethodDescriptor<UnassignProducerFromLocationsRequest, UnassignProducerFromLocationsResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getUnassignProducerFromLocationsMethod()

  public val updateAgencyLocationMethod:
      MethodDescriptor<UpdateAgencyLocationRequest, UpdateAgencyLocationResponse>
    @JvmStatic
    get() = ProducerServiceGrpc.getUpdateAgencyLocationMethod()

  /**
   * A stub for issuing RPCs to a(n) producerflow.producer.v1.ProducerService service as suspending coroutines.
   */
  @StubFor(ProducerServiceGrpc::class)
  public class ProducerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ProducerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ProducerServiceCoroutineStub = ProducerServiceCoroutineStub(channel, callOptions)

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
    public suspend fun createAgencyOnboardingURL(request: CreateAgencyOnboardingURLRequest, headers: Metadata = Metadata()): CreateAgencyOnboardingURLResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getCreateAgencyOnboardingURLMethod(),
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
    public suspend fun createProducerOnboardingURL(request: CreateProducerOnboardingURLRequest, headers: Metadata = Metadata()): CreateProducerOnboardingURLResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getCreateProducerOnboardingURLMethod(),
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
    public suspend fun newAgency(request: NewAgencyRequest, headers: Metadata = Metadata()): NewAgencyResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getNewAgencyMethod(),
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
    public suspend fun listAgencies(request: ListAgenciesRequest, headers: Metadata = Metadata()): ListAgenciesResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getListAgenciesMethod(),
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
    public suspend fun listOrganizations(request: ListOrganizationsRequest, headers: Metadata = Metadata()): ListOrganizationsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getListOrganizationsMethod(),
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
    public suspend fun getOrganization(request: GetOrganizationRequest, headers: Metadata = Metadata()): GetOrganizationResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getGetOrganizationMethod(),
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
    public suspend fun createOrganization(request: CreateOrganizationRequest, headers: Metadata = Metadata()): CreateOrganizationResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getCreateOrganizationMethod(),
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
    public suspend fun newProducer(request: NewProducerRequest, headers: Metadata = Metadata()): NewProducerResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getNewProducerMethod(),
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
    public suspend fun newProducers(request: NewProducersRequest, headers: Metadata = Metadata()): NewProducersResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getNewProducersMethod(),
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
    @Deprecated("The underlying service method is marked deprecated.")
    public suspend fun getAgencyAndProducers(request: GetAgencyAndProducersRequest, headers: Metadata = Metadata()): GetAgencyAndProducersResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getGetAgencyAndProducersMethod(),
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
    public suspend fun getAgencyProducers(request: GetAgencyProducersRequest, headers: Metadata = Metadata()): GetAgencyProducersResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getGetAgencyProducersMethod(),
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
    public suspend fun getAgency(request: GetAgencyRequest, headers: Metadata = Metadata()): GetAgencyResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getGetAgencyMethod(),
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
    public suspend fun getProducer(request: GetProducerRequest, headers: Metadata = Metadata()): GetProducerResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getGetProducerMethod(),
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
    public suspend fun listProducerRoles(request: ListProducerRolesRequest, headers: Metadata = Metadata()): ListProducerRolesResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getListProducerRolesMethod(),
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
    public suspend fun getAgencyFiles(request: GetAgencyFilesRequest, headers: Metadata = Metadata()): GetAgencyFilesResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getGetAgencyFilesMethod(),
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
    public suspend fun updateProducer(request: UpdateProducerRequest, headers: Metadata = Metadata()): UpdateProducerResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getUpdateProducerMethod(),
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
    public suspend fun updateAgency(request: UpdateAgencyRequest, headers: Metadata = Metadata()): UpdateAgencyResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getUpdateAgencyMethod(),
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
    public suspend fun newContact(request: NewContactRequest, headers: Metadata = Metadata()): NewContactResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getNewContactMethod(),
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
    public suspend fun newContacts(request: NewContactsRequest, headers: Metadata = Metadata()): NewContactsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getNewContactsMethod(),
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
    public suspend fun listAgencyContacts(request: ListAgencyContactsRequest, headers: Metadata = Metadata()): ListAgencyContactsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getListAgencyContactsMethod(),
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
    public suspend fun updateContact(request: UpdateContactRequest, headers: Metadata = Metadata()): UpdateContactResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getUpdateContactMethod(),
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
    public suspend fun setExternalID(request: SetExternalIDRequest, headers: Metadata = Metadata()): SetExternalIDResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getSetExternalIDMethod(),
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
    public suspend fun validateProducerNPN(request: ValidateProducerNPNRequest, headers: Metadata = Metadata()): ValidateProducerNPNResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getValidateProducerNPNMethod(),
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
    public suspend fun validateAgencyNPN(request: ValidateAgencyNPNRequest, headers: Metadata = Metadata()): ValidateAgencyNPNResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getValidateAgencyNPNMethod(),
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
    public suspend fun lookupNPNByFEIN(request: LookupNPNByFEINRequest, headers: Metadata = Metadata()): LookupNPNByFEINResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getLookupNPNByFEINMethod(),
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
    public suspend fun resyncProducer(request: ResyncProducerRequest, headers: Metadata = Metadata()): ResyncProducerResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getResyncProducerMethod(),
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
    public suspend fun resyncAgency(request: ResyncAgencyRequest, headers: Metadata = Metadata()): ResyncAgencyResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getResyncAgencyMethod(),
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
    public suspend fun syncProducerWithNIPR(request: SyncProducerWithNIPRRequest, headers: Metadata = Metadata()): SyncProducerWithNIPRResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getSyncProducerWithNIPRMethod(),
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
    public suspend fun syncAgencyWithNIPR(request: SyncAgencyWithNIPRRequest, headers: Metadata = Metadata()): SyncAgencyWithNIPRResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getSyncAgencyWithNIPRMethod(),
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
    public suspend fun stopSyncProducerWithNIPR(request: StopSyncProducerWithNIPRRequest, headers: Metadata = Metadata()): StopSyncProducerWithNIPRResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getStopSyncProducerWithNIPRMethod(),
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
    public suspend fun stopSyncAgencyWithNIPR(request: StopSyncAgencyWithNIPRRequest, headers: Metadata = Metadata()): StopSyncAgencyWithNIPRResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getStopSyncAgencyWithNIPRMethod(),
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
    public suspend fun createProducerUploadURL(request: CreateProducerUploadURLRequest, headers: Metadata = Metadata()): CreateProducerUploadURLResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getCreateProducerUploadURLMethod(),
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
    public suspend fun addAgencyLocations(request: AddAgencyLocationsRequest, headers: Metadata = Metadata()): AddAgencyLocationsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getAddAgencyLocationsMethod(),
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
    public suspend fun removeAgencyLocations(request: RemoveAgencyLocationsRequest, headers: Metadata = Metadata()): RemoveAgencyLocationsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getRemoveAgencyLocationsMethod(),
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
    public suspend fun listAgencyLocations(request: ListAgencyLocationsRequest, headers: Metadata = Metadata()): ListAgencyLocationsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getListAgencyLocationsMethod(),
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
    public suspend fun assignProducerToLocations(request: AssignProducerToLocationsRequest, headers: Metadata = Metadata()): AssignProducerToLocationsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getAssignProducerToLocationsMethod(),
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
    public suspend fun unassignProducerFromLocations(request: UnassignProducerFromLocationsRequest, headers: Metadata = Metadata()): UnassignProducerFromLocationsResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getUnassignProducerFromLocationsMethod(),
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
    public suspend fun updateAgencyLocation(request: UpdateAgencyLocationRequest, headers: Metadata = Metadata()): UpdateAgencyLocationResponse = unaryRpc(
      channel,
      ProducerServiceGrpc.getUpdateAgencyLocationMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the producerflow.producer.v1.ProducerService service based on Kotlin coroutines.
   */
  public abstract class ProducerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.CreateAgencyOnboardingURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createAgencyOnboardingURL(request: CreateAgencyOnboardingURLRequest): CreateAgencyOnboardingURLResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.CreateAgencyOnboardingURL is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.CreateProducerOnboardingURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createProducerOnboardingURL(request: CreateProducerOnboardingURLRequest): CreateProducerOnboardingURLResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.CreateProducerOnboardingURL is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.NewAgency.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun newAgency(request: NewAgencyRequest): NewAgencyResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.NewAgency is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ListAgencies.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listAgencies(request: ListAgenciesRequest): ListAgenciesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ListAgencies is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ListOrganizations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listOrganizations(request: ListOrganizationsRequest): ListOrganizationsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ListOrganizations is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.GetOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getOrganization(request: GetOrganizationRequest): GetOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.GetOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.CreateOrganization.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createOrganization(request: CreateOrganizationRequest): CreateOrganizationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.CreateOrganization is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.NewProducer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun newProducer(request: NewProducerRequest): NewProducerResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.NewProducer is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.NewProducers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun newProducers(request: NewProducersRequest): NewProducersResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.NewProducers is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.GetAgencyAndProducers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    @Deprecated("The underlying service method is marked deprecated.")
    public open suspend fun getAgencyAndProducers(request: GetAgencyAndProducersRequest): GetAgencyAndProducersResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.GetAgencyAndProducers is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.GetAgencyProducers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAgencyProducers(request: GetAgencyProducersRequest): GetAgencyProducersResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.GetAgencyProducers is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.GetAgency.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAgency(request: GetAgencyRequest): GetAgencyResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.GetAgency is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.GetProducer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProducer(request: GetProducerRequest): GetProducerResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.GetProducer is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ListProducerRoles.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listProducerRoles(request: ListProducerRolesRequest): ListProducerRolesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ListProducerRoles is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.GetAgencyFiles.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAgencyFiles(request: GetAgencyFilesRequest): GetAgencyFilesResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.GetAgencyFiles is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.UpdateProducer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateProducer(request: UpdateProducerRequest): UpdateProducerResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.UpdateProducer is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.UpdateAgency.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateAgency(request: UpdateAgencyRequest): UpdateAgencyResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.UpdateAgency is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.NewContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun newContact(request: NewContactRequest): NewContactResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.NewContact is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.NewContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun newContacts(request: NewContactsRequest): NewContactsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.NewContacts is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ListAgencyContacts.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listAgencyContacts(request: ListAgencyContactsRequest): ListAgencyContactsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ListAgencyContacts is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.UpdateContact.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateContact(request: UpdateContactRequest): UpdateContactResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.UpdateContact is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.SetExternalID.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setExternalID(request: SetExternalIDRequest): SetExternalIDResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.SetExternalID is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ValidateProducerNPN.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun validateProducerNPN(request: ValidateProducerNPNRequest): ValidateProducerNPNResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ValidateProducerNPN is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ValidateAgencyNPN.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun validateAgencyNPN(request: ValidateAgencyNPNRequest): ValidateAgencyNPNResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ValidateAgencyNPN is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.LookupNPNByFEIN.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun lookupNPNByFEIN(request: LookupNPNByFEINRequest): LookupNPNByFEINResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.LookupNPNByFEIN is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ResyncProducer.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun resyncProducer(request: ResyncProducerRequest): ResyncProducerResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ResyncProducer is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ResyncAgency.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun resyncAgency(request: ResyncAgencyRequest): ResyncAgencyResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ResyncAgency is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.SyncProducerWithNIPR.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun syncProducerWithNIPR(request: SyncProducerWithNIPRRequest): SyncProducerWithNIPRResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.SyncProducerWithNIPR is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.SyncAgencyWithNIPR.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun syncAgencyWithNIPR(request: SyncAgencyWithNIPRRequest): SyncAgencyWithNIPRResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.SyncAgencyWithNIPR is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.StopSyncProducerWithNIPR.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopSyncProducerWithNIPR(request: StopSyncProducerWithNIPRRequest): StopSyncProducerWithNIPRResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.StopSyncProducerWithNIPR is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.StopSyncAgencyWithNIPR.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopSyncAgencyWithNIPR(request: StopSyncAgencyWithNIPRRequest): StopSyncAgencyWithNIPRResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.StopSyncAgencyWithNIPR is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.CreateProducerUploadURL.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createProducerUploadURL(request: CreateProducerUploadURLRequest): CreateProducerUploadURLResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.CreateProducerUploadURL is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.AddAgencyLocations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun addAgencyLocations(request: AddAgencyLocationsRequest): AddAgencyLocationsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.AddAgencyLocations is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.RemoveAgencyLocations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeAgencyLocations(request: RemoveAgencyLocationsRequest): RemoveAgencyLocationsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.RemoveAgencyLocations is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.ListAgencyLocations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listAgencyLocations(request: ListAgencyLocationsRequest): ListAgencyLocationsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.ListAgencyLocations is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.AssignProducerToLocations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun assignProducerToLocations(request: AssignProducerToLocationsRequest): AssignProducerToLocationsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.AssignProducerToLocations is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.UnassignProducerFromLocations.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun unassignProducerFromLocations(request: UnassignProducerFromLocationsRequest): UnassignProducerFromLocationsResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.UnassignProducerFromLocations is unimplemented"))

    /**
     * Returns the response to an RPC for producerflow.producer.v1.ProducerService.UpdateAgencyLocation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateAgencyLocation(request: UpdateAgencyLocationRequest): UpdateAgencyLocationResponse = throw StatusException(UNIMPLEMENTED.withDescription("Method producerflow.producer.v1.ProducerService.UpdateAgencyLocation is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getCreateAgencyOnboardingURLMethod(),
      implementation = ::createAgencyOnboardingURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getCreateProducerOnboardingURLMethod(),
      implementation = ::createProducerOnboardingURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getNewAgencyMethod(),
      implementation = ::newAgency
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getListAgenciesMethod(),
      implementation = ::listAgencies
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getListOrganizationsMethod(),
      implementation = ::listOrganizations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getGetOrganizationMethod(),
      implementation = ::getOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getCreateOrganizationMethod(),
      implementation = ::createOrganization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getNewProducerMethod(),
      implementation = ::newProducer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getNewProducersMethod(),
      implementation = ::newProducers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getGetAgencyAndProducersMethod(),
      implementation = ::getAgencyAndProducers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getGetAgencyProducersMethod(),
      implementation = ::getAgencyProducers
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getGetAgencyMethod(),
      implementation = ::getAgency
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getGetProducerMethod(),
      implementation = ::getProducer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getListProducerRolesMethod(),
      implementation = ::listProducerRoles
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getGetAgencyFilesMethod(),
      implementation = ::getAgencyFiles
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getUpdateProducerMethod(),
      implementation = ::updateProducer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getUpdateAgencyMethod(),
      implementation = ::updateAgency
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getNewContactMethod(),
      implementation = ::newContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getNewContactsMethod(),
      implementation = ::newContacts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getListAgencyContactsMethod(),
      implementation = ::listAgencyContacts
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getUpdateContactMethod(),
      implementation = ::updateContact
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getSetExternalIDMethod(),
      implementation = ::setExternalID
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getValidateProducerNPNMethod(),
      implementation = ::validateProducerNPN
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getValidateAgencyNPNMethod(),
      implementation = ::validateAgencyNPN
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getLookupNPNByFEINMethod(),
      implementation = ::lookupNPNByFEIN
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getResyncProducerMethod(),
      implementation = ::resyncProducer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getResyncAgencyMethod(),
      implementation = ::resyncAgency
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getSyncProducerWithNIPRMethod(),
      implementation = ::syncProducerWithNIPR
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getSyncAgencyWithNIPRMethod(),
      implementation = ::syncAgencyWithNIPR
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getStopSyncProducerWithNIPRMethod(),
      implementation = ::stopSyncProducerWithNIPR
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getStopSyncAgencyWithNIPRMethod(),
      implementation = ::stopSyncAgencyWithNIPR
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getCreateProducerUploadURLMethod(),
      implementation = ::createProducerUploadURL
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getAddAgencyLocationsMethod(),
      implementation = ::addAgencyLocations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getRemoveAgencyLocationsMethod(),
      implementation = ::removeAgencyLocations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getListAgencyLocationsMethod(),
      implementation = ::listAgencyLocations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getAssignProducerToLocationsMethod(),
      implementation = ::assignProducerToLocations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getUnassignProducerFromLocationsMethod(),
      implementation = ::unassignProducerFromLocations
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ProducerServiceGrpc.getUpdateAgencyLocationMethod(),
      implementation = ::updateAgencyLocation
    )).build()
  }
}
