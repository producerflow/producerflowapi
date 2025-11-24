# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [producerflow/appointment/v1/appointment.proto](#producerflow_appointment_v1_appointment-proto)
    - [Appointment](#producerflow-appointment-v1-Appointment)
    - [AppointmentOperationalStatus](#producerflow-appointment-v1-AppointmentOperationalStatus)
    - [Carrier](#producerflow-appointment-v1-Carrier)
    - [GetAppointableCarriersRequest](#producerflow-appointment-v1-GetAppointableCarriersRequest)
    - [GetAppointableCarriersResponse](#producerflow-appointment-v1-GetAppointableCarriersResponse)
    - [GetAppointmentFeesRequest](#producerflow-appointment-v1-GetAppointmentFeesRequest)
    - [GetAppointmentFeesResponse](#producerflow-appointment-v1-GetAppointmentFeesResponse)
    - [GetAppointmentRequest](#producerflow-appointment-v1-GetAppointmentRequest)
    - [GetAppointmentResponse](#producerflow-appointment-v1-GetAppointmentResponse)
    - [GetTerminationFeesRequest](#producerflow-appointment-v1-GetTerminationFeesRequest)
    - [GetTerminationFeesResponse](#producerflow-appointment-v1-GetTerminationFeesResponse)
    - [License](#producerflow-appointment-v1-License)
    - [ListAppointmentsRequest](#producerflow-appointment-v1-ListAppointmentsRequest)
    - [ListAppointmentsResponse](#producerflow-appointment-v1-ListAppointmentsResponse)
    - [ListEligibleLicensesRequest](#producerflow-appointment-v1-ListEligibleLicensesRequest)
    - [ListEligibleLicensesResponse](#producerflow-appointment-v1-ListEligibleLicensesResponse)
    - [ListTerminationReasonsRequest](#producerflow-appointment-v1-ListTerminationReasonsRequest)
    - [ListTerminationReasonsResponse](#producerflow-appointment-v1-ListTerminationReasonsResponse)
    - [RequestAppointmentRequest](#producerflow-appointment-v1-RequestAppointmentRequest)
    - [RequestAppointmentResponse](#producerflow-appointment-v1-RequestAppointmentResponse)
    - [TerminateAppointmentRequest](#producerflow-appointment-v1-TerminateAppointmentRequest)
    - [TerminateAppointmentResponse](#producerflow-appointment-v1-TerminateAppointmentResponse)
  
    - [AppointmentType](#producerflow-appointment-v1-AppointmentType)
    - [OperationalStatus](#producerflow-appointment-v1-OperationalStatus)
    - [ProcessingStatus](#producerflow-appointment-v1-ProcessingStatus)
    - [RiskReason](#producerflow-appointment-v1-RiskReason)
    - [TerminationReason](#producerflow-appointment-v1-TerminationReason)
  
    - [AppointmentService](#producerflow-appointment-v1-AppointmentService)
  
- [producerflow/producer/v1/producer.proto](#producerflow_producer_v1_producer-proto)
    - [AddAgencyLocationsRequest](#producerflow-producer-v1-AddAgencyLocationsRequest)
    - [AddAgencyLocationsResponse](#producerflow-producer-v1-AddAgencyLocationsResponse)
    - [Address](#producerflow-producer-v1-Address)
    - [Agency](#producerflow-producer-v1-Agency)
    - [Agency.Address](#producerflow-producer-v1-Agency-Address)
    - [Agency.AgencyInfo](#producerflow-producer-v1-Agency-AgencyInfo)
    - [Agency.AgencyInfo.ExternalMetadataEntry](#producerflow-producer-v1-Agency-AgencyInfo-ExternalMetadataEntry)
    - [Agency.AgencyInfo.MetadataQuestionsEntry](#producerflow-producer-v1-Agency-AgencyInfo-MetadataQuestionsEntry)
    - [Agency.AgencyInfo.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-Agency-AgencyInfo-TenantAdditionalQuestionsEntry)
    - [Agency.BankAccount](#producerflow-producer-v1-Agency-BankAccount)
    - [Agency.BusinessHours](#producerflow-producer-v1-Agency-BusinessHours)
    - [Agency.BusinessHours.BusinessHour](#producerflow-producer-v1-Agency-BusinessHours-BusinessHour)
    - [Agency.EOInfo](#producerflow-producer-v1-Agency-EOInfo)
    - [Agency.IvansAccount](#producerflow-producer-v1-Agency-IvansAccount)
    - [Agency.NIPR](#producerflow-producer-v1-Agency-NIPR)
    - [Agency.NIPR.Address](#producerflow-producer-v1-Agency-NIPR-Address)
    - [Agency.NIPR.Appointment](#producerflow-producer-v1-Agency-NIPR-Appointment)
    - [Agency.NIPR.Biographic](#producerflow-producer-v1-Agency-NIPR-Biographic)
    - [Agency.NIPR.License](#producerflow-producer-v1-Agency-NIPR-License)
    - [Agency.NIPR.License.LineOfAuthority](#producerflow-producer-v1-Agency-NIPR-License-LineOfAuthority)
    - [Agency.NIPR.RegulatoryInfo](#producerflow-producer-v1-Agency-NIPR-RegulatoryInfo)
    - [Agency.NIPR.RegulatoryInfo.RegulatoryAction](#producerflow-producer-v1-Agency-NIPR-RegulatoryInfo-RegulatoryAction)
    - [Agency.Principal](#producerflow-producer-v1-Agency-Principal)
    - [AgencySummary](#producerflow-producer-v1-AgencySummary)
    - [AssignProducerToLocationsRequest](#producerflow-producer-v1-AssignProducerToLocationsRequest)
    - [AssignProducerToLocationsResponse](#producerflow-producer-v1-AssignProducerToLocationsResponse)
    - [Contact](#producerflow-producer-v1-Contact)
    - [CreateAgencyOnboardingURLRequest](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest)
    - [CreateAgencyOnboardingURLRequest.Agency](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency)
    - [CreateAgencyOnboardingURLRequest.Agency.Principal](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency-Principal)
    - [CreateAgencyOnboardingURLResponse](#producerflow-producer-v1-CreateAgencyOnboardingURLResponse)
    - [CreateProducerOnboardingURLRequest](#producerflow-producer-v1-CreateProducerOnboardingURLRequest)
    - [CreateProducerOnboardingURLResponse](#producerflow-producer-v1-CreateProducerOnboardingURLResponse)
    - [CreateProducerUploadURLRequest](#producerflow-producer-v1-CreateProducerUploadURLRequest)
    - [CreateProducerUploadURLResponse](#producerflow-producer-v1-CreateProducerUploadURLResponse)
    - [GetAgencyAndProducersRequest](#producerflow-producer-v1-GetAgencyAndProducersRequest)
    - [GetAgencyAndProducersResponse](#producerflow-producer-v1-GetAgencyAndProducersResponse)
    - [GetAgencyFilesRequest](#producerflow-producer-v1-GetAgencyFilesRequest)
    - [GetAgencyFilesResponse](#producerflow-producer-v1-GetAgencyFilesResponse)
    - [GetOrganizationRequest](#producerflow-producer-v1-GetOrganizationRequest)
    - [GetOrganizationResponse](#producerflow-producer-v1-GetOrganizationResponse)
    - [GetProducerRequest](#producerflow-producer-v1-GetProducerRequest)
    - [GetProducerRequest.EmailLookup](#producerflow-producer-v1-GetProducerRequest-EmailLookup)
    - [GetProducerRequest.ProducerIDLookup](#producerflow-producer-v1-GetProducerRequest-ProducerIDLookup)
    - [GetProducerRequest.ProducerNPNLookup](#producerflow-producer-v1-GetProducerRequest-ProducerNPNLookup)
    - [GetProducerResponse](#producerflow-producer-v1-GetProducerResponse)
    - [ListAgenciesRequest](#producerflow-producer-v1-ListAgenciesRequest)
    - [ListAgenciesResponse](#producerflow-producer-v1-ListAgenciesResponse)
    - [ListAgencyContactsRequest](#producerflow-producer-v1-ListAgencyContactsRequest)
    - [ListAgencyContactsResponse](#producerflow-producer-v1-ListAgencyContactsResponse)
    - [ListAgencyLocationsRequest](#producerflow-producer-v1-ListAgencyLocationsRequest)
    - [ListAgencyLocationsResponse](#producerflow-producer-v1-ListAgencyLocationsResponse)
    - [ListNewProducersRequest](#producerflow-producer-v1-ListNewProducersRequest)
    - [ListNewProducersResponse](#producerflow-producer-v1-ListNewProducersResponse)
    - [ListOrganizationsRequest](#producerflow-producer-v1-ListOrganizationsRequest)
    - [ListOrganizationsResponse](#producerflow-producer-v1-ListOrganizationsResponse)
    - [Location](#producerflow-producer-v1-Location)
    - [LocationInput](#producerflow-producer-v1-LocationInput)
    - [LookupNPNByFEINRequest](#producerflow-producer-v1-LookupNPNByFEINRequest)
    - [LookupNPNByFEINResponse](#producerflow-producer-v1-LookupNPNByFEINResponse)
    - [NewAgencyRequest](#producerflow-producer-v1-NewAgencyRequest)
    - [NewAgencyRequest.Agency](#producerflow-producer-v1-NewAgencyRequest-Agency)
    - [NewAgencyRequest.Agency.BankAccount](#producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount)
    - [NewAgencyRequest.Agency.BusinessHours](#producerflow-producer-v1-NewAgencyRequest-Agency-BusinessHours)
    - [NewAgencyRequest.Agency.BusinessHours.BusinessHour](#producerflow-producer-v1-NewAgencyRequest-Agency-BusinessHours-BusinessHour)
    - [NewAgencyRequest.Agency.EOInfo](#producerflow-producer-v1-NewAgencyRequest-Agency-EOInfo)
    - [NewAgencyRequest.Agency.MetadataQuestionsEntry](#producerflow-producer-v1-NewAgencyRequest-Agency-MetadataQuestionsEntry)
    - [NewAgencyRequest.Agency.PointOfContact](#producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact)
    - [NewAgencyRequest.Agency.Principal](#producerflow-producer-v1-NewAgencyRequest-Agency-Principal)
    - [NewAgencyRequest.Agency.Principal.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-NewAgencyRequest-Agency-Principal-TenantAdditionalQuestionsEntry)
    - [NewAgencyRequest.Agency.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-NewAgencyRequest-Agency-TenantAdditionalQuestionsEntry)
    - [NewAgencyResponse](#producerflow-producer-v1-NewAgencyResponse)
    - [NewContact](#producerflow-producer-v1-NewContact)
    - [NewContactRequest](#producerflow-producer-v1-NewContactRequest)
    - [NewContactResponse](#producerflow-producer-v1-NewContactResponse)
    - [NewContactsRequest](#producerflow-producer-v1-NewContactsRequest)
    - [NewContactsResponse](#producerflow-producer-v1-NewContactsResponse)
    - [NewProducer](#producerflow-producer-v1-NewProducer)
    - [NewProducer.Address](#producerflow-producer-v1-NewProducer-Address)
    - [NewProducer.MetadataQuestionsEntry](#producerflow-producer-v1-NewProducer-MetadataQuestionsEntry)
    - [NewProducer.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-NewProducer-TenantAdditionalQuestionsEntry)
    - [NewProducerRequest](#producerflow-producer-v1-NewProducerRequest)
    - [NewProducerResponse](#producerflow-producer-v1-NewProducerResponse)
    - [NewProducersRequest](#producerflow-producer-v1-NewProducersRequest)
    - [NewProducersResponse](#producerflow-producer-v1-NewProducersResponse)
    - [Organization](#producerflow-producer-v1-Organization)
    - [Pagination](#producerflow-producer-v1-Pagination)
    - [Producer](#producerflow-producer-v1-Producer)
    - [Producer.Address](#producerflow-producer-v1-Producer-Address)
    - [Producer.Agency](#producerflow-producer-v1-Producer-Agency)
    - [Producer.ExternalMetadataEntry](#producerflow-producer-v1-Producer-ExternalMetadataEntry)
    - [Producer.MetadataQuestionsEntry](#producerflow-producer-v1-Producer-MetadataQuestionsEntry)
    - [Producer.NIPR](#producerflow-producer-v1-Producer-NIPR)
    - [Producer.NIPR.Appointment](#producerflow-producer-v1-Producer-NIPR-Appointment)
    - [Producer.NIPR.Biographic](#producerflow-producer-v1-Producer-NIPR-Biographic)
    - [Producer.NIPR.License](#producerflow-producer-v1-Producer-NIPR-License)
    - [Producer.NIPR.License.LineOfAuthority](#producerflow-producer-v1-Producer-NIPR-License-LineOfAuthority)
    - [Producer.NIPR.ProducerRegulatoryInfo](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo)
    - [Producer.NIPR.ProducerRegulatoryInfo.RegulatoryAction](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryAction)
    - [Producer.NIPR.ProducerRegulatoryInfo.RegulatoryActionsByStateEntry](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryActionsByStateEntry)
    - [Producer.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-Producer-TenantAdditionalQuestionsEntry)
    - [ProducerData](#producerflow-producer-v1-ProducerData)
    - [ProducerData.Address](#producerflow-producer-v1-ProducerData-Address)
    - [RemoveAgencyLocationsRequest](#producerflow-producer-v1-RemoveAgencyLocationsRequest)
    - [RemoveAgencyLocationsResponse](#producerflow-producer-v1-RemoveAgencyLocationsResponse)
    - [ResyncAgencyRequest](#producerflow-producer-v1-ResyncAgencyRequest)
    - [ResyncAgencyResponse](#producerflow-producer-v1-ResyncAgencyResponse)
    - [ResyncProducerRequest](#producerflow-producer-v1-ResyncProducerRequest)
    - [ResyncProducerResponse](#producerflow-producer-v1-ResyncProducerResponse)
    - [SetExternalIDRequest](#producerflow-producer-v1-SetExternalIDRequest)
    - [SetExternalIDResponse](#producerflow-producer-v1-SetExternalIDResponse)
    - [StopSyncAgencyWithNIPRRequest](#producerflow-producer-v1-StopSyncAgencyWithNIPRRequest)
    - [StopSyncAgencyWithNIPRResponse](#producerflow-producer-v1-StopSyncAgencyWithNIPRResponse)
    - [StopSyncProducerWithNIPRRequest](#producerflow-producer-v1-StopSyncProducerWithNIPRRequest)
    - [StopSyncProducerWithNIPRResponse](#producerflow-producer-v1-StopSyncProducerWithNIPRResponse)
    - [SyncAgencyWithNIPRRequest](#producerflow-producer-v1-SyncAgencyWithNIPRRequest)
    - [SyncAgencyWithNIPRResponse](#producerflow-producer-v1-SyncAgencyWithNIPRResponse)
    - [SyncProducerWithNIPRRequest](#producerflow-producer-v1-SyncProducerWithNIPRRequest)
    - [SyncProducerWithNIPRResponse](#producerflow-producer-v1-SyncProducerWithNIPRResponse)
    - [UnassignProducerFromLocationsRequest](#producerflow-producer-v1-UnassignProducerFromLocationsRequest)
    - [UnassignProducerFromLocationsResponse](#producerflow-producer-v1-UnassignProducerFromLocationsResponse)
    - [UpdateAgencyLocationRequest](#producerflow-producer-v1-UpdateAgencyLocationRequest)
    - [UpdateAgencyLocationResponse](#producerflow-producer-v1-UpdateAgencyLocationResponse)
    - [UpdateAgencyRequest](#producerflow-producer-v1-UpdateAgencyRequest)
    - [UpdateAgencyRequest.Agency](#producerflow-producer-v1-UpdateAgencyRequest-Agency)
    - [UpdateAgencyRequest.Agency.Address](#producerflow-producer-v1-UpdateAgencyRequest-Agency-Address)
    - [UpdateAgencyRequest.Agency.ExternalMetadataEntry](#producerflow-producer-v1-UpdateAgencyRequest-Agency-ExternalMetadataEntry)
    - [UpdateAgencyResponse](#producerflow-producer-v1-UpdateAgencyResponse)
    - [UpdateProducerRequest](#producerflow-producer-v1-UpdateProducerRequest)
    - [UpdateProducerRequest.Producer](#producerflow-producer-v1-UpdateProducerRequest-Producer)
    - [UpdateProducerRequest.Producer.ExternalMetadataEntry](#producerflow-producer-v1-UpdateProducerRequest-Producer-ExternalMetadataEntry)
    - [UpdateProducerResponse](#producerflow-producer-v1-UpdateProducerResponse)
    - [ValidateAgencyNPNRequest](#producerflow-producer-v1-ValidateAgencyNPNRequest)
    - [ValidateAgencyNPNResponse](#producerflow-producer-v1-ValidateAgencyNPNResponse)
    - [ValidateProducerNPNRequest](#producerflow-producer-v1-ValidateProducerNPNRequest)
    - [ValidateProducerNPNResponse](#producerflow-producer-v1-ValidateProducerNPNResponse)
  
    - [Agency.BankAccount.AccountType](#producerflow-producer-v1-Agency-BankAccount-AccountType)
    - [Agency.NIPR.License.LicenseStatus](#producerflow-producer-v1-Agency-NIPR-License-LicenseStatus)
    - [AgencyType](#producerflow-producer-v1-AgencyType)
    - [EntityType](#producerflow-producer-v1-EntityType)
    - [NIPRSyncState](#producerflow-producer-v1-NIPRSyncState)
    - [NewAgencyRequest.Agency.BankAccount.AccountType](#producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount-AccountType)
    - [NewAgencyRequest.Agency.PointOfContact.CommunicationRole](#producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact-CommunicationRole)
    - [Producer.NIPR.License.LicenseStatus](#producerflow-producer-v1-Producer-NIPR-License-LicenseStatus)
  
    - [ProducerService](#producerflow-producer-v1-ProducerService)
  
- [Scalar Value Types](#scalar-value-types)



<a name="producerflow_appointment_v1_appointment-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## producerflow/appointment/v1/appointment.proto



<a name="producerflow-appointment-v1-Appointment"></a>

### Appointment
Represents an appointment for a license.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| appointment_id | [string](#string) |  | Unique identifier for the appointment. |
| license | [License](#producerflow-appointment-v1-License) |  | Information about the license being appointed. |
| name | [string](#string) |  | The license number of the license being appointed. |
| agency_id | [string](#string) |  | The id of the agency that is appointed. |
| producer_id | [string](#string) | optional | The id of the producer that is appointed, if any. |
| carrier | [string](#string) |  | The name of the carrier to which the license is appointed. |
| appointment_type | [AppointmentType](#producerflow-appointment-v1-AppointmentType) |  | Type of appointment (e.g., up-front, registry). |
| processing_status | [ProcessingStatus](#producerflow-appointment-v1-ProcessingStatus) |  | Processing status of the appointment (e.g., in progress, appointed). |
| comments | [string](#string) |  | Optional comments or notes related to the appointment. |
| effective_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Timestamp of the last update to the appointment. |
| termination_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) | optional | Timestamp of the termination of the appointment. |
| updated_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Timestamp of the last update to the appointment. |
| operational_status | [AppointmentOperationalStatus](#producerflow-appointment-v1-AppointmentOperationalStatus) |  | Operational status information for the appointment. This field provides insight into the current operational health and any risk factors that may affect the appointment. |
| cocode | [string](#string) |  | The NAIC cocode of the carrier. |
| parent_appointment_id | [string](#string) |  | The id of the parent appointment, if this is a synthetic appointment. It should be empty for non-synthetic appointments. |






<a name="producerflow-appointment-v1-AppointmentOperationalStatus"></a>

### AppointmentOperationalStatus
AppointmentOperationalStatus contains operational status information for an appointment.
This message provides detailed information about the current operational state
and any risk factors that may affect the appointment&#39;s continued validity.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [OperationalStatus](#producerflow-appointment-v1-OperationalStatus) |  | The current operational status of the appointment. |
| risk_reasons | [RiskReason](#producerflow-appointment-v1-RiskReason) | repeated | Specific reason(s) why the appointment is at risk, if applicable. This field is only populated when status is AT_RISK. |
| last_updated | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Timestamp when the operational status was last updated. This helps track when status changes occurred. |






<a name="producerflow-appointment-v1-Carrier"></a>

### Carrier
Represents a carrier that is available to be appointed.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| carrier_id | [string](#string) |  | The ID of the carrier. |
| name | [string](#string) |  | The name of the carrier. |
| npn | [string](#string) |  | The NPN of the carrier. |
| fein | [string](#string) |  | The state of the carrier. |
| cocode | [string](#string) |  | The NAIC cocode of the carrier. |
| has_nipr_integration | [bool](#bool) |  | Indicates whether this carrier has NIPR integration enabled. Capacity carriers (carriers without NIPR integration) process appointments and terminations automatically without going through NIPR. |






<a name="producerflow-appointment-v1-GetAppointableCarriersRequest"></a>

### GetAppointableCarriersRequest







<a name="producerflow-appointment-v1-GetAppointableCarriersResponse"></a>

### GetAppointableCarriersResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| carriers | [Carrier](#producerflow-appointment-v1-Carrier) | repeated | The list of carriers that are available to be appointed. |






<a name="producerflow-appointment-v1-GetAppointmentFeesRequest"></a>

### GetAppointmentFeesRequest
Request to get appointment fees.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| license_id | [string](#string) |  | Required. The ID of the license to get the appointment fee for. |






<a name="producerflow-appointment-v1-GetAppointmentFeesResponse"></a>

### GetAppointmentFeesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fee_in_cents | [int64](#int64) |  | Total fee for the appointment in cents. |






<a name="producerflow-appointment-v1-GetAppointmentRequest"></a>

### GetAppointmentRequest
Request to retrieve an appointment by ID.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| appointment_id | [string](#string) |  | Required. The ID of the appointment to retrieve. |






<a name="producerflow-appointment-v1-GetAppointmentResponse"></a>

### GetAppointmentResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| appointment | [Appointment](#producerflow-appointment-v1-Appointment) |  | The appointment details. |






<a name="producerflow-appointment-v1-GetTerminationFeesRequest"></a>

### GetTerminationFeesRequest
Request to get termination fees.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| license_id | [string](#string) |  | Required. The ID of the license to get the termination fee for. |






<a name="producerflow-appointment-v1-GetTerminationFeesResponse"></a>

### GetTerminationFeesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fee_in_cents | [int64](#int64) |  | Total fee for the termination in cents. |






<a name="producerflow-appointment-v1-License"></a>

### License



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| license_id | [string](#string) |  | The ID of the license. |
| license_number | [string](#string) |  | The license number. |
| producer_id | [string](#string) |  |  |
| agency_id | [string](#string) |  |  |
| state | [string](#string) |  | The two-letter state code of the license. |
| license_class | [string](#string) |  | The license class. |
| is_registry_state | [bool](#bool) |  | Indicates whether this license is in a registry state. Licenses in registry states and capacity carriers are processed automatically without going through NIPR. |






<a name="producerflow-appointment-v1-ListAppointmentsRequest"></a>

### ListAppointmentsRequest
Request to list appointments, optionally filtered by processing status.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| processing_status | [ProcessingStatus](#producerflow-appointment-v1-ProcessingStatus) | repeated | Optional. Filter results by processing status. |
| producer_id | [string](#string) |  |  |
| agency_id | [string](#string) |  |  |






<a name="producerflow-appointment-v1-ListAppointmentsResponse"></a>

### ListAppointmentsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| appointments | [Appointment](#producerflow-appointment-v1-Appointment) | repeated | List of appointments. |
| next_page_token | [string](#string) |  | Token for fetching the next page of results. |






<a name="producerflow-appointment-v1-ListEligibleLicensesRequest"></a>

### ListEligibleLicensesRequest
Request to retrieve a list of licenses that are eligible to be appointed.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  |  |
| agency_id | [string](#string) |  |  |






<a name="producerflow-appointment-v1-ListEligibleLicensesResponse"></a>

### ListEligibleLicensesResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| licenses | [License](#producerflow-appointment-v1-License) | repeated | List of licenses that are eligible to be appointed. |






<a name="producerflow-appointment-v1-ListTerminationReasonsRequest"></a>

### ListTerminationReasonsRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| state | [string](#string) |  | Required. The two-letter state code of the license for which you want to retrieve valid termination reasons. Different states may have different sets of valid termination reasons accepted by NIPR. |






<a name="producerflow-appointment-v1-ListTerminationReasonsResponse"></a>

### ListTerminationReasonsResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| termination_reasons | [TerminationReason](#producerflow-appointment-v1-TerminationReason) | repeated | The list of valid termination reasons for the specified state. These reasons can be used when calling TerminateAppointment for licenses issued in this state. |






<a name="producerflow-appointment-v1-RequestAppointmentRequest"></a>

### RequestAppointmentRequest
Request to create a new appointment.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| license_id | [string](#string) |  | Required. The ID of the license to appoint. |
| carrier_id | [string](#string) |  | Required. The ID of the carrier to appoint the license with. |






<a name="producerflow-appointment-v1-RequestAppointmentResponse"></a>

### RequestAppointmentResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| appointment_id | [string](#string) |  | The ID of the created appointment. |
| processing_status | [ProcessingStatus](#producerflow-appointment-v1-ProcessingStatus) |  | Processing status of the appointment request. For NIPR-integrated carriers: IN_PROGRESS if accepted, REJECTED if rejected For registry states or non-NIPR carriers: APPOINTED if successful |
| not_eligible_reasons | [string](#string) | repeated | If the appointment was rejected or ineligible, these reasons explain why. Only populated when processing_status is REJECTED. |






<a name="producerflow-appointment-v1-TerminateAppointmentRequest"></a>

### TerminateAppointmentRequest
Request to terminate an appointment.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| appointment_id | [string](#string) |  | ID of the appointment to terminate. |
| reason | [TerminationReason](#producerflow-appointment-v1-TerminationReason) |  | Reason for termination. This must be a valid termination reason for the state where the license is issued. Call ListTerminationReasons first to get the list of valid reasons for the specific state. |






<a name="producerflow-appointment-v1-TerminateAppointmentResponse"></a>

### TerminateAppointmentResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| success | [bool](#bool) |  | Indicates whether the termination request was successfully processed. For NIPR-integrated carriers: Indicates whether the termination request was successfully submitted to NIPR. This does not indicate that the appointment has been terminated, only that the request has been accepted for processing. The actual termination will be processed asynchronously by NIPR, and you will be notified via webhook when the process completes. For registry states or non-NIPR carriers: Indicates whether the termination was successfully completed immediately. |





 


<a name="producerflow-appointment-v1-AppointmentType"></a>

### AppointmentType
Type of appointment.

| Name | Number | Description |
| ---- | ------ | ----------- |
| APPOINTMENT_TYPE_UNSPECIFIED | 0 |  |
| APPOINTMENT_TYPE_REGISTRY | 1 |  |
| APPOINTMENT_TYPE_UP_FRONT | 2 |  |
| APPOINTMENT_TYPE_JUST_IN_TIME | 3 |  |
| APPOINTMENT_TYPE_SYNTHETIC | 4 | Synthetic appointments are programmatically created for individual producers in states where only agency-level appointments are permitted (CA, DC, HI, KY, LA, MA, MT, UT, WA). They are automatically created when an agency appointment is approved and inherit properties from the parent agency appointment. The parent_appointment_id field links to the parent agency appointment. Synthetic appointments do not require separate regulatory approval and are terminated when the parent appointment is terminated. |



<a name="producerflow-appointment-v1-OperationalStatus"></a>

### OperationalStatus
OperationalStatus represents the current operational status of an appointment.
This indicates whether the appointment is actively functioning or at risk of termination.

| Name | Number | Description |
| ---- | ------ | ----------- |
| OPERATIONAL_STATUS_UNSPECIFIED | 0 |  |
| OPERATIONAL_STATUS_ACTIVE | 1 | Appointment is actively functioning and meeting all requirements. |
| OPERATIONAL_STATUS_AT_RISK | 2 | Appointment is at risk of termination due to various factors. |



<a name="producerflow-appointment-v1-ProcessingStatus"></a>

### ProcessingStatus
Processing status of the appointment.

| Name | Number | Description |
| ---- | ------ | ----------- |
| PROCESSING_STATUS_UNSPECIFIED | 0 |  |
| PROCESSING_STATUS_IN_PROGRESS | 1 |  |
| PROCESSING_STATUS_APPOINTED | 2 |  |
| PROCESSING_STATUS_TERMINATED | 3 |  |
| PROCESSING_STATUS_REJECTED | 4 |  |
| PROCESSING_STATUS_MISSING_LICENSE | 5 |  |
| PROCESSING_STATUS_TERMINATION_REQUESTED | 6 |  |



<a name="producerflow-appointment-v1-RiskReason"></a>

### RiskReason
RiskReason represents the specific reason why an appointment is considered at risk.
These reasons correspond to business rules and compliance requirements that may
trigger operational status changes.

| Name | Number | Description |
| ---- | ------ | ----------- |
| RISK_REASON_UNSPECIFIED | 0 |  |
| RISK_REASON_LICENSE_INACTIVE | 1 | License is inactive (License Active = false). |
| RISK_REASON_LICENSE_EXPIRED | 2 | License has expired (License ExpirationDate &lt; current date). |
| RISK_REASON_EO_NOT_FOUND | 3 | No E&amp;O coverage exists for agency. |
| RISK_REASON_EO_INACTIVE | 4 | E&amp;O Status is not &#34;Active&#34;. |
| RISK_REASON_EO_EXPIRED | 5 | E&amp;O coverage has expired (E&amp;O ExpirationDate &lt; current date). |



<a name="producerflow-appointment-v1-TerminationReason"></a>

### TerminationReason
TerminationReason represents the reason for the termination of an appointment. These reasons correspond to NIPR&#39;s valid termination codes and vary by state. Use ListTerminationReasons to get the valid reasons for a specific state before terminating an appointment. Reference: https://pdb.nipr.com/Gateway/ValidTerms

| Name | Number | Description |
| ---- | ------ | ----------- |
| TERMINATION_REASON_UNSPECIFIED | 0 |  |
| TERMINATION_REASON_VOLUNTARY_TERMINATION | 1 |  |
| TERMINATION_REASON_INADEQUATE_PRODUCTION | 2 |  |
| TERMINATION_REASON_CANCELLED_BY_GENERAL_AGENT | 3 |  |
| TERMINATION_REASON_DEATH | 4 |  |
| TERMINATION_REASON_COMPANY_DEFUNCT_OR_LIQUIDATION | 5 |  |
| TERMINATION_REASON_COMPANY_INDEBTEDNESS | 6 |  |
| TERMINATION_REASON_POOR_POLICYHOLDER_SERVICE | 7 |  |
| TERMINATION_REASON_AGENT_MOVED | 8 |  |
| TERMINATION_REASON_APPOINTED_IN_ERROR | 9 |  |
| TERMINATION_REASON_CANCELLED | 10 |  |
| TERMINATION_REASON_CANCELLED_FOR_CAUSE | 11 |  |
| TERMINATION_REASON_COMPANY_MERGER | 12 |  |
| TERMINATION_REASON_REVOKED | 13 |  |
| TERMINATION_REASON_SUSPENDED_FOR_COMPLIANCE | 14 |  |
| TERMINATION_REASON_REQUEST_REGULATORY_REVIEW | 15 |  |


 

 


<a name="producerflow-appointment-v1-AppointmentService"></a>

### AppointmentService
AppointmentService manages license appointments through NIPR. The appointment flow in NIPR is as follows: 1. A new appointment (or termination) is requested for a license number. 2. Some time later, NIPR processes the request and returns the final result. Since NIPR does not return results immediately, RequestAppointment and TerminateAppointment RPCs will return a processing status of IN_PROGRESS if the request is accepted by NIPR. When the appointment is finally processed by NIPR, ProducerFlow will notify via a webhook of the final result. Also, any call from this point on to ListAppointments or GetAppointment will also return the final result. IMPORTANT: Appointments in registry states or with capacity carriers (carriers that do not have NIPR integration) are processed automatically without going through NIPR. In these cases: RequestAppointment will immediately return APPOINTED status. TerminateAppointment will immediately return TERMINATED status. Any call to this service must be authenticated using an API key in the request headers. The API key can be found in the ProducerFlow API key section of the ProducerFlow UI and it identifies the tenant that is making the request.

Available endpoints:
  UAT (User Acceptance Testing): https://api.uat.producerflow.com
  Production: https://api.producerflow.com

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetAppointment | [GetAppointmentRequest](#producerflow-appointment-v1-GetAppointmentRequest) | [GetAppointmentResponse](#producerflow-appointment-v1-GetAppointmentResponse) | Retrieves the details of an appointment by its ID. |
| GetAppointmentFees | [GetAppointmentFeesRequest](#producerflow-appointment-v1-GetAppointmentFeesRequest) | [GetAppointmentFeesResponse](#producerflow-appointment-v1-GetAppointmentFeesResponse) | Retrieves the total fees associated with requesting an appointment for the given license. Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034. |
| GetAppointableCarriers | [GetAppointableCarriersRequest](#producerflow-appointment-v1-GetAppointableCarriersRequest) | [GetAppointableCarriersResponse](#producerflow-appointment-v1-GetAppointableCarriersResponse) | Retrieves the carriers that are available to appoint licenses for the tenant. |
| GetTerminationFees | [GetTerminationFeesRequest](#producerflow-appointment-v1-GetTerminationFeesRequest) | [GetTerminationFeesResponse](#producerflow-appointment-v1-GetTerminationFeesResponse) | Retrieves the total fees associated with terminating an appointment for the given license. Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034. |
| ListAppointments | [ListAppointmentsRequest](#producerflow-appointment-v1-ListAppointmentsRequest) | [ListAppointmentsResponse](#producerflow-appointment-v1-ListAppointmentsResponse) | Lists appointments for the tenant, optionally filtered by processing status. |
| ListEligibleLicenses | [ListEligibleLicensesRequest](#producerflow-appointment-v1-ListEligibleLicensesRequest) | [ListEligibleLicensesResponse](#producerflow-appointment-v1-ListEligibleLicensesResponse) | Returns a list of licenses that are eligible to be appointed. |
| RequestAppointment | [RequestAppointmentRequest](#producerflow-appointment-v1-RequestAppointmentRequest) | [RequestAppointmentResponse](#producerflow-appointment-v1-RequestAppointmentResponse) | Requests a new appointment for a license that is eligible to be appointed. The simpler way to do this is to call ListEligibleLicenses to get a list of licenses that are eligible to be appointed. Then, call RequestAppointment for the licenses in the list that you want to appoint. Processing behavior varies based on the license state and carrier NIPR integration: For NIPR-integrated carriers in non-registry states: If the request is accepted by NIPR, the appointment will have IN_PROGRESS processing status. If rejected, it will have REJECTED status and reasons will be provided in not_eligible_reasons. Final result will be delivered via webhook when NIPR completes processing. For registry states or capacity carriers (carriers without NIPR integration): The appointment is processed automatically and immediately. Returns APPOINTED status immediately upon successful processing. |
| TerminateAppointment | [TerminateAppointmentRequest](#producerflow-appointment-v1-TerminateAppointmentRequest) | [TerminateAppointmentResponse](#producerflow-appointment-v1-TerminateAppointmentResponse) | Terminates an existing appointment, permanently ending the relationship between the license holder and the carrier. Before calling this method, you must: 1. Ensure the appointment exists and is in APPOINTED status. 2. Call ListTerminationReasons to get valid termination reasons for the license&#39;s state. 3. Select an appropriate termination reason from the state-specific list. Processing behavior varies based on the license state and carrier NIPR integration: For NIPR-integrated carriers in non-registry states: The request is submitted to NIPR for processing. Once NIPR completes processing, the status becomes TERMINATED. If rejected by NIPR, the appointment remains in its current status. You will receive webhook notifications when the termination is processed by NIPR. For registry states or capacity carriers (carriers without NIPR integration): The termination is processed automatically and immediately. Returns TERMINATED status immediately upon successful processing. Important considerations: Termination is permanent and cannot be undone. Termination reasons must be valid for the specific state where the license is issued. Some terminations may incur fees (check GetTerminationFees first). The response indicates whether the termination request was successfully submitted, not whether the actual termination was completed (since NIPR processes asynchronously). |
| ListTerminationReasons | [ListTerminationReasonsRequest](#producerflow-appointment-v1-ListTerminationReasonsRequest) | [ListTerminationReasonsResponse](#producerflow-appointment-v1-ListTerminationReasonsResponse) | Lists the valid termination reasons for appointments in a specific state. When terminating an appointment, you must provide a valid termination reason that is accepted by NIPR for the state where the license is issued. Termination reasons vary by state, so you should call this method first to retrieve the list of valid reasons before calling TerminateAppointment. The termination reasons returned are based on NIPR&#39;s valid termination codes for the specified state. Each reason corresponds to a specific business scenario for why an appointment might be terminated (e.g., voluntary termination, inadequate production, company merger, etc.). |

 



<a name="producerflow_producer_v1_producer-proto"></a>
<p align="right"><a href="#top">Top</a></p>

## producerflow/producer/v1/producer.proto



<a name="producerflow-producer-v1-AddAgencyLocationsRequest"></a>

### AddAgencyLocationsRequest
AddAgencyLocationsRequest adds new locations to an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Required. Agency ID to add locations to. |
| locations | [LocationInput](#producerflow-producer-v1-LocationInput) | repeated | Required. List of locations to add. |






<a name="producerflow-producer-v1-AddAgencyLocationsResponse"></a>

### AddAgencyLocationsResponse
AddAgencyLocationsResponse contains the results of adding locations.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| location_ids | [string](#string) | repeated | IDs of successfully created locations, in the same order as the input. |






<a name="producerflow-producer-v1-Address"></a>

### Address
Address represents a physical location with standard address components.
Used for mailing, physical, and invoicing addresses throughout the API.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street address including house/building number and street name |
| city | [string](#string) |  | City of the address |
| state | [string](#string) |  | State of the address |
| zip | [string](#string) |  | Zip code of the address |
| county | [string](#string) |  | County of the address |
| address_line_2 | [string](#string) | optional | Optional second line of address (apt, suite, unit, etc.) |






<a name="producerflow-producer-v1-Agency"></a>

### Agency
Agency represents a complete agency entity with all associated information.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Unique identifier for the agency. |
| agency_info | [Agency.AgencyInfo](#producerflow-producer-v1-Agency-AgencyInfo) |  | AgencyInfo type field named agency_info |
| physical_address | [Agency.Address](#producerflow-producer-v1-Agency-Address) |  | Physical address of the agency. |
| mailing_address | [Agency.Address](#producerflow-producer-v1-Agency-Address) |  | Mailing address of the agency. |
| invoicing_address | [Agency.Address](#producerflow-producer-v1-Agency-Address) |  | Invoicing address of the agency. |
| bank_account | [Agency.BankAccount](#producerflow-producer-v1-Agency-BankAccount) |  | Banking information for commission payments. Used for electronic transfers of commissions and other payments. |
| eo_info | [Agency.EOInfo](#producerflow-producer-v1-Agency-EOInfo) |  |  |
| principal | [Agency.Principal](#producerflow-producer-v1-Agency-Principal) |  | Information about the agency&#39;s principal. This is a required field as each agency must have a principal. |
| ivans_account | [Agency.IvansAccount](#producerflow-producer-v1-Agency-IvansAccount) |  | IVANS account information for electronic carrier communication. This is optional and only used if the agency uses IVANS. |
| requested_appointments | [string](#string) | repeated | The list of requested appointments for the agency. |
| business_hours | [Agency.BusinessHours](#producerflow-producer-v1-Agency-BusinessHours) |  | Operating hours of the agency. |
| nipr | [Agency.NIPR](#producerflow-producer-v1-Agency-NIPR) |  | Data synchronized from the NIPR service. Contains basic information, addresses, licenses, regulatory actions, and carrier appointments. |
| locations | [Location](#producerflow-producer-v1-Location) | repeated | Locations associated with the agency. |






<a name="producerflow-producer-v1-Agency-Address"></a>

### Agency.Address
Address is a data structure that represents a physical or mailing
location.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street name and number of the location. |
| city | [string](#string) |  | City where the location resides. |
| state | [string](#string) |  | State/Province where the location resides. |
| zip | [string](#string) |  | ZIP/Postal code of the location. |






<a name="producerflow-producer-v1-Agency-AgencyInfo"></a>

### Agency.AgencyInfo
AgencyInfo contains contact and identification information for an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| onboarding_id | [string](#string) |  | The unique identifier for the onboarding process. Used to track the agency through the onboarding flow. |
| root_organization_id | [string](#string) |  | The organization ID represents the ID of the root organization that the agency belongs to. An example of a root organization is an Aggregator (Like AgencyHero) or an Agency Network. We currently don&#39;t support multiple levels of organizations or agencies. Agencies are not always part of an organization, so this field is optional. |
| agency_name | [string](#string) |  | The official name of the agency. This is typically the legal name of the entity. |
| agency_fein | [string](#string) |  | Federal Employer Identification Number (FEIN) of the agency. This is a unique nine-digit number assigned by the Internal Revenue Service (IRS) to businesses operating in the United States. |
| email | [string](#string) |  | Primary email address for the agency. Used for communication and must be unique. |
| phone | [string](#string) |  | Phone number for the agency. |
| fax | [string](#string) |  | Fax number for the agency. |
| website | [string](#string) |  | Website URL for the agency, if available. |
| npn | [string](#string) |  | National Producer Number (NPN) of the agency. This is a unique identifier assigned by the National Association of Insurance Commissioners (NAIC). |
| pdb_alerts_sync_enabled | [bool](#bool) |  | Indicates whether the agency is enabled to be synchronized with NIPR API. When true, the system will regularly check for updates from NIPR. |
| metadata_questions | [Agency.AgencyInfo.MetadataQuestionsEntry](#producerflow-producer-v1-Agency-AgencyInfo-MetadataQuestionsEntry) | repeated | MetadataQuestions contains custom metadata questions and answers for the agency. This field stores tenant-specific questions that were collected during agency onboarding. The map key is the question identifier/text, and the value is the answer provided. This field is deprecated and will be removed in a future release. |
| external_metadata | [Agency.AgencyInfo.ExternalMetadataEntry](#producerflow-producer-v1-Agency-AgencyInfo-ExternalMetadataEntry) | repeated | ExternalMetadata contains additional custom information that the tenant stores in ProducerFlow&#39;s data model. This field allows tenants to attach arbitrary key-value pairs to agencies for their own business logic, reporting, or integration needs. This field is populated programmatically via API calls by the tenant&#39;s systems. Common use cases include: - Storing references to external system states or categories - Adding custom tags or classifications - Maintaining tenant-specific business attributes - Storing computed values or derived data The map key is the metadata field name, and the value is the associated data. |
| tenant_additional_questions | [Agency.AgencyInfo.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-Agency-AgencyInfo-TenantAdditionalQuestionsEntry) | repeated | tenant_additional_questions contains tenant-specific custom questions configured by Producerflow and their corresponding responses. Keys are question identifiers or text, values are the answers provided. |






<a name="producerflow-producer-v1-Agency-AgencyInfo-ExternalMetadataEntry"></a>

### Agency.AgencyInfo.ExternalMetadataEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-Agency-AgencyInfo-MetadataQuestionsEntry"></a>

### Agency.AgencyInfo.MetadataQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-Agency-AgencyInfo-TenantAdditionalQuestionsEntry"></a>

### Agency.AgencyInfo.TenantAdditionalQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-Agency-BankAccount"></a>

### Agency.BankAccount
BankAccount contains information about a bank account for commission payments.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| account_number | [string](#string) |  | Account number for the bank account. |
| routing_number | [string](#string) |  | Routing number for the bank. This is a nine-digit code identifying the financial institution. |
| account_type | [Agency.BankAccount.AccountType](#producerflow-producer-v1-Agency-BankAccount-AccountType) |  | Type of account (checking or savings). Indicates how the account should be treated for electronic transfers. |
| account_holder_name | [string](#string) |  | Name of the account holder as it appears on bank records. |






<a name="producerflow-producer-v1-Agency-BusinessHours"></a>

### Agency.BusinessHours
BusinessHours contains the operating hours of the agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| timezone | [string](#string) |  | Timezone of the agency. |
| business_hours | [Agency.BusinessHours.BusinessHour](#producerflow-producer-v1-Agency-BusinessHours-BusinessHour) | repeated | List of business hour entries. |






<a name="producerflow-producer-v1-Agency-BusinessHours-BusinessHour"></a>

### Agency.BusinessHours.BusinessHour
BusinessHour represents operating hours for specific days.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| week_days | [google.type.DayOfWeek](#google-type-DayOfWeek) | repeated | Days of the week when the agency is open. |
| opening_time | [google.type.TimeOfDay](#google-type-TimeOfDay) |  | Time when the agency opens. |
| closing_time | [google.type.TimeOfDay](#google-type-TimeOfDay) |  | Time when the agency closes. |






<a name="producerflow-producer-v1-Agency-EOInfo"></a>

### Agency.EOInfo
EOInfo contains Errors &amp; Omissions insurance information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| carrier | [string](#string) |  | Insurance carrier providing the E&amp;O coverage |
| expiration_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date when the E&amp;O coverage will expire |
| coverage_amount | [string](#string) |  | Amount of coverage provided by the E&amp;O policy (aggregate limit) |
| per_occurrence | [string](#string) |  | Per occurrence limit for the E&amp;O policy |
| effective_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Effective date of the E&amp;O policy |






<a name="producerflow-producer-v1-Agency-IvansAccount"></a>

### Agency.IvansAccount
IvansAccount contains information for IVANS integration.
IVANS is a system for electronic communication between insurance agencies and carriers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| account_number | [string](#string) |  | Account number for the IVANS service. |
| ams_software | [string](#string) |  | Software used for IVANS communication. |
| ams_version | [string](#string) |  | Version of the IVANS software. |
| mailbox_number | [string](#string) |  | Mailbox number for the IVANS service. Used for routing electronic messages. |






<a name="producerflow-producer-v1-Agency-NIPR"></a>

### Agency.NIPR
NIPR contains data synchronized from the National Insurance Producer Registry.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| biographic | [Agency.NIPR.Biographic](#producerflow-producer-v1-Agency-NIPR-Biographic) |  | Biographic information from NIPR |
| addresses | [Agency.NIPR.Address](#producerflow-producer-v1-Agency-NIPR-Address) | repeated | List of addresses from NIPR. |
| licenses | [Agency.NIPR.License](#producerflow-producer-v1-Agency-NIPR-License) | repeated | List of all licenses held across different states. |
| regulatory_info | [Agency.NIPR.RegulatoryInfo](#producerflow-producer-v1-Agency-NIPR-RegulatoryInfo) |  | Regulatory information from NIPR |
| appointments | [Agency.NIPR.Appointment](#producerflow-producer-v1-Agency-NIPR-Appointment) | repeated | List of carrier appointments held in NIPR. These represent relationships with insurance carriers. |






<a name="producerflow-producer-v1-Agency-NIPR-Address"></a>

### Agency.NIPR.Address
Address represents address information from NIPR.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address_type | [string](#string) |  | Type of address (Residence, Business, Mailing). |
| state | [string](#string) |  | License state: state of the license for which the address is registered in NIPR. |
| address_state | [string](#string) |  | Address state: state of the actual address registered in NIPR. |
| street | [string](#string) |  | Street address. |
| zip_code | [string](#string) |  | ZIP code of the address. |
| city | [string](#string) |  | City of the address. |
| country | [string](#string) |  | Country of the address. |
| date_updated | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date when the address was last updated. |
| updated_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The last time this address information was updated from NIPR. |






<a name="producerflow-producer-v1-Agency-NIPR-Appointment"></a>

### Agency.NIPR.Appointment
Appointment represents a relationship with an insurance carrier.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| branch_id | [string](#string) |  |  |
| company_name | [string](#string) |  | Name of the insurance company for this appointment. |
| fein | [string](#string) |  | Federal Employer Identification Number of the carrier. |
| co_code | [string](#string) |  | Company code for the insurance carrier. |
| line_of_authority | [string](#string) |  | Line of authority for this appointment (e.g., Life, Property, Casualty). Indicates what types of insurance can be sold. |
| loa_code | [string](#string) |  | Code for the line of authority for this appointment. |
| status | [string](#string) |  | Current status of the appointment (e.g., Active, Terminated). |
| termination_reason | [string](#string) |  | Reason for termination if the appointment has been terminated. |
| status_reason_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date associated with the current status or reason. |
| appointment_renewal_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date when the appointment will renew. |
| agency_affiliations | [string](#string) |  | Additional affiliations or roles with the agency. |






<a name="producerflow-producer-v1-Agency-NIPR-Biographic"></a>

### Agency.NIPR.Biographic
Biographic contains basic information from NIPR.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| company_name | [string](#string) |  | Company name as recorded in NIPR. |
| fein | [string](#string) |  | Federal Employer Identification Number. |
| npn | [string](#string) |  | National Producer Number. |
| business_email | [string](#string) |  | Business email address. |
| business_phone | [string](#string) |  | Business phone number. |
| updated_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The last time this biographic information was updated from NIPR. |






<a name="producerflow-producer-v1-Agency-NIPR-License"></a>

### Agency.NIPR.License
License contains information about an insurance license.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| license_number | [string](#string) |  | The license number assigned by the state regulatory authority. |
| license_state | [string](#string) |  | The state that issued the license. |
| residency_status | [string](#string) |  | Indicates whether this is a resident or non-resident license. |
| active | [bool](#bool) |  | Indicates whether the license is currently active. |
| status | [Agency.NIPR.License.LicenseStatus](#producerflow-producer-v1-Agency-NIPR-License-LicenseStatus) |  | The current status of the license (valid, expired, etc.). |
| expiration_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the license will expire if not renewed. |
| license_class | [string](#string) |  | License class description. |
| license_class_code | [int32](#int32) |  | License class code. |
| issue_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the license was originally issued. |
| update_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the license was last updated. |
| updated_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The last time this license information was updated from NIPR. |
| lines_of_authority | [Agency.NIPR.License.LineOfAuthority](#producerflow-producer-v1-Agency-NIPR-License-LineOfAuthority) | repeated | Lines of Authority associated with this license. |






<a name="producerflow-producer-v1-Agency-NIPR-License-LineOfAuthority"></a>

### Agency.NIPR.License.LineOfAuthority
LineOfAuthority represents a specific type of insurance coverage
that is authorized under this license.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| loa | [string](#string) |  | The Line of Authority description (e.g., &#34;Life&#34;, &#34;Property and Casualty&#34;, &#34;Health&#34;). This is typically an uppercase string that describes the insurance type. |
| active | [bool](#bool) |  | Whether this Line of Authority is currently active. |
| issue_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when this Line of Authority was issued. |






<a name="producerflow-producer-v1-Agency-NIPR-RegulatoryInfo"></a>

### Agency.NIPR.RegulatoryInfo
RegulatoryInfo contains regulatory information,
including any regulatory actions.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| regulatory_actions | [Agency.NIPR.RegulatoryInfo.RegulatoryAction](#producerflow-producer-v1-Agency-NIPR-RegulatoryInfo-RegulatoryAction) | repeated | List of regulatory actions across different states. Each regulatory action includes the state code where it applies. |






<a name="producerflow-producer-v1-Agency-NIPR-RegulatoryInfo-RegulatoryAction"></a>

### Agency.NIPR.RegulatoryInfo.RegulatoryAction
RegulatoryAction represents a regulatory action.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| action_id | [string](#string) |  | Unique identifier for the regulatory action. |
| state_code | [string](#string) |  | The state code where this regulatory action applies. |
| reason_for_action | [string](#string) |  | The reason why the regulatory action was taken. |
| disposition | [string](#string) |  | The outcome or resolution of the regulatory action. |
| date_of_action | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the regulatory action was taken. |
| effective_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the regulatory action became effective. |
| enter_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the entity entered into the regulatory action. |
| file_ref | [string](#string) |  | Reference number for the regulatory action file. |
| penalty_fine_forfeiture | [string](#string) |  | Any financial penalties associated with the regulatory action. |
| length_of_order | [string](#string) |  | Duration of any orders associated with the regulatory action. |






<a name="producerflow-producer-v1-Agency-Principal"></a>

### Agency.Principal
Principal is a data structure that represents the principal of a agency.
A principal is the person or entity that is responsible for the day-to-day operations of the agency.
The principal is usually the CEO or CFO of the agency.nThe principal is also known as the &#34;owner&#34; of the agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Unique identifier for the principal (as a producer). |
| first_name | [string](#string) |  | First name of the principal. |
| last_name | [string](#string) |  | Last name of the principal. |
| middle_name | [string](#string) |  | Middle name of the principal. |
| email | [string](#string) |  | Email address of the principal. Must be unique and is used for communication. |
| npn | [string](#string) |  | The NPN of the principal. This is used to retrieve the license information of the principal from the NIPR API. |
| phone | [string](#string) |  | Phone number of the principal. Used for communication. |
| address | [Agency.Address](#producerflow-producer-v1-Agency-Address) |  | Address of the principal. This may differ from the agency address. |






<a name="producerflow-producer-v1-AgencySummary"></a>

### AgencySummary
AgencySummary contains a lightweight summary of an agency for list views.
This message contains only the essential fields needed for displaying agencies in a list.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Unique identifier for the agency. |
| name | [string](#string) |  | Agency name. |
| email | [string](#string) |  | Agency email address. |
| phone | [string](#string) |  | Agency phone number. |
| npn | [string](#string) |  | Agency NPN (National Producer Number). |
| fein | [string](#string) |  | Agency FEIN (Federal Employer Identification Number). |
| organization_id | [string](#string) | optional | Organization ID that the agency belongs to. |
| is_tenant_agency | [bool](#bool) |  | Whether this is an internal tenant agency. |
| is_sole_proprietor | [bool](#bool) |  | Whether this is a sole proprietor. |
| created_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | When the agency was created. |






<a name="producerflow-producer-v1-AssignProducerToLocationsRequest"></a>

### AssignProducerToLocationsRequest
AssignProducerToLocationsRequest assigns locations to a producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | Required. Producer ID to assign locations to. |
| location_ids | [string](#string) | repeated | Required. Location IDs to assign (1-100 items). These locations must belong to the same agency as the producer. |






<a name="producerflow-producer-v1-AssignProducerToLocationsResponse"></a>

### AssignProducerToLocationsResponse
AssignProducerToLocationsResponse contains the assigned location IDs.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| assigned_location_ids | [string](#string) | repeated | IDs of successfully assigned locations. |






<a name="producerflow-producer-v1-Contact"></a>

### Contact
Contact represents a contact associated with an agency.
Contacts are non-producer individuals linked to the agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Unique identifier for the contact. |
| first_name | [string](#string) |  | First name of the contact. |
| middle_name | [string](#string) |  | Middle name of the contact. |
| last_name | [string](#string) |  | Last name of the contact. |
| email | [string](#string) |  | Email address of the contact. Must be unique within the tenant. |
| phone | [string](#string) |  | Phone number of the contact. |
| role | [string](#string) |  | Role or position of the contact within the agency. |
| address | [Address](#producerflow-producer-v1-Address) |  | Mailing address of the contact. |
| npn | [string](#string) |  | National Producer Number (NPN) of the contact, if applicable. |
| created_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | When the contact was created. |






<a name="producerflow-producer-v1-CreateAgencyOnboardingURLRequest"></a>

### CreateAgencyOnboardingURLRequest
CreateAgencyOnboardingURLRequest contains information needed to generate an agency onboarding URL. This includes basic agency information and defaults. All fields in this request are optional. You can provide as much or as little information as you have available. Any missing information will be collected from the user during the onboarding process through the generated URL.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency | [CreateAgencyOnboardingURLRequest.Agency](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency) |  |  |






<a name="producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency"></a>

### CreateAgencyOnboardingURLRequest.Agency
Agency contains the information about the agency to be onboarded.
All fields within the Agency message are also optional.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Name of the agency |
| entity_type | [EntityType](#producerflow-producer-v1-EntityType) |  | Entity type of the agency: Sole Proprietor, Agency or Ask during onboarding |
| tenant_agency_id | [string](#string) |  | Tenant agency id is a unique identifier for the agency used by the tenant this is used to identify the agency in the tenant system not in the producerflow system |
| docusign_template_id | [string](#string) |  | DocuSign template id is the id of the docusign template used to send the contract to the agency |
| fein | [string](#string) |  | FEIN (Federal Employer Identification Number) of the agency |
| email | [string](#string) |  | Email of the agency |
| phone | [string](#string) |  | Phone of the agency |
| fax | [string](#string) |  | Fax of the agency |
| website | [string](#string) |  | Website of the agency |
| npn | [string](#string) |  | NPN of the agency. Note that if the entity type is Sole Proprietor the NPN will be ignored |
| mailing_address | [Address](#producerflow-producer-v1-Address) |  | Mailing address of the agency |
| physical_address | [Address](#producerflow-producer-v1-Address) |  | Physical address of the agency |
| invoicing_address | [Address](#producerflow-producer-v1-Address) |  | Invoicing address of the agency |
| organization_id | [string](#string) |  | Organization ID of the agency. To get valid organization IDs, use the ListOrganizations RPC. |
| principal | [CreateAgencyOnboardingURLRequest.Agency.Principal](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency-Principal) |  |  |






<a name="producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency-Principal"></a>

### CreateAgencyOnboardingURLRequest.Agency.Principal
Principal is the person responsible for the agency.
All fields within the Principal message are also optional.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| tenant_id | [string](#string) |  | Optional. External identifier for the principal in the tenant&#39;s system. This field allows tenants to maintain a reference to their own internal ID for this principal, enabling bi-directional synchronization between ProducerFlow and the tenant&#39;s system. Usage: Provide this when you have an existing identifier for the principal in your system. Omit if you don&#39;t need to track a reference to your internal system. This is independent of ProducerFlow&#39;s internal IDs and the authentication tenant context. Format: Any string identifier that is meaningful in your system (e.g., &#34;USR-12345&#34;, &#34;uuid&#34;). Validation: Maximum length of 255 characters. |
| first_name | [string](#string) |  | First name of the principal |
| last_name | [string](#string) |  | Last name of the principal |
| middle_name | [string](#string) |  | Middle name of the principal |
| email | [string](#string) |  | Email of the principal |
| phone | [string](#string) |  | Phone of the principal |
| npn | [string](#string) |  | NPN of the principal |
| address | [Address](#producerflow-producer-v1-Address) |  | Address of the principal |






<a name="producerflow-producer-v1-CreateAgencyOnboardingURLResponse"></a>

### CreateAgencyOnboardingURLResponse
CreateAgencyOnboardingURLResponse contains the generated URL for agency onboarding


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  | URL that can be shared with the agency for self-onboarding |






<a name="producerflow-producer-v1-CreateProducerOnboardingURLRequest"></a>

### CreateProducerOnboardingURLRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Agency ID for which the producer will be onboarded |
| producer_data | [ProducerData](#producerflow-producer-v1-ProducerData) |  | Optional producer data to pre-fill in the onboarding form |






<a name="producerflow-producer-v1-CreateProducerOnboardingURLResponse"></a>

### CreateProducerOnboardingURLResponse



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| onboarding_url | [string](#string) |  | The secure onboarding URL that can be shared with the producer |






<a name="producerflow-producer-v1-CreateProducerUploadURLRequest"></a>

### CreateProducerUploadURLRequest
CreateProducerUploadURLRequest contains information needed to generate
a producer upload URL. This includes the agency NPN.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_npn | [string](#string) |  | The National Producer Number (NPN) of the agency. Required and must be a valid NPN format (numeric string between 2-10 digits). |






<a name="producerflow-producer-v1-CreateProducerUploadURLResponse"></a>

### CreateProducerUploadURLResponse
CreateProducerUploadURLResponse contains the generated URL for producer uploads


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| url | [string](#string) |  | URL that can be shared with the agency for producer uploads. The URL is time-limited and includes necessary security tokens. |






<a name="producerflow-producer-v1-GetAgencyAndProducersRequest"></a>

### GetAgencyAndProducersRequest
GetAgencyAndProducersRequest requests information about an agency and all associated producers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to retrieve information for. Must be a valid UUID format. |






<a name="producerflow-producer-v1-GetAgencyAndProducersResponse"></a>

### GetAgencyAndProducersResponse
GetAgencyAndProducersResponse contains the agency information and all associated producers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency | [Agency](#producerflow-producer-v1-Agency) |  | Complete agency information including contact details, principal, and bank account. |
| producers | [Producer](#producerflow-producer-v1-Producer) | repeated | List of all producers associated with the specified agency. |






<a name="producerflow-producer-v1-GetAgencyFilesRequest"></a>

### GetAgencyFilesRequest
GetAgencyFilesRequest requests URLs for files associated with an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to retrieve files for. Must be a valid UUID format. |






<a name="producerflow-producer-v1-GetAgencyFilesResponse"></a>

### GetAgencyFilesResponse
GetAgencyFilesResponse contains URLs for various documents associated with an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| eo_doc_url | [string](#string) |  | URL of the Errors &amp; Omissions (E&amp;O) insurance document. |
| voided_check_doc_url | [string](#string) |  | URL of the bank voided check document. It&#39;s used to safely share bank account information for electronic transfers. |
| w9_doc_url | [string](#string) |  | URL of the W9 form document. It&#39;s a U.S. internal revenue service form, an identification document used in the onboarding process for tax reporting purposes. |
| license_doc_url | [string](#string) |  | URL of the license document. An identification document that shows that the agency is licensed to carry out its operations in the relevant jurisdictions. |
| broker_bond_doc_url | [string](#string) |  | URL of the broker bond document. It&#39;s a surety bond that a broker needs to operate legally, providing financial security for clients. |






<a name="producerflow-producer-v1-GetOrganizationRequest"></a>

### GetOrganizationRequest
GetOrganizationRequest specifies which organization to retrieve.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| organization_id | [string](#string) |  | Unique identifier of the organization to retrieve. Must be a valid UUID. |






<a name="producerflow-producer-v1-GetOrganizationResponse"></a>

### GetOrganizationResponse
GetOrganizationResponse contains the details of the requested organization.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| organization | [Organization](#producerflow-producer-v1-Organization) |  | The requested organization. |






<a name="producerflow-producer-v1-GetProducerRequest"></a>

### GetProducerRequest
GetProducerRequest allows retrieving producer information through one of three
possible lookup methods: by ID, by NPN, or by email address.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id_lookup | [GetProducerRequest.ProducerIDLookup](#producerflow-producer-v1-GetProducerRequest-ProducerIDLookup) |  | Look up producer by ID. |
| npn_lookup | [GetProducerRequest.ProducerNPNLookup](#producerflow-producer-v1-GetProducerRequest-ProducerNPNLookup) |  | Look up producer by NPN. |
| email_lookup | [GetProducerRequest.EmailLookup](#producerflow-producer-v1-GetProducerRequest-EmailLookup) |  | Look up producer by email. |






<a name="producerflow-producer-v1-GetProducerRequest-EmailLookup"></a>

### GetProducerRequest.EmailLookup
EmailLookup allows looking up a producer by their email address.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| email | [string](#string) |  | The email address of the producer to retrieve. Must be a valid email format. |






<a name="producerflow-producer-v1-GetProducerRequest-ProducerIDLookup"></a>

### GetProducerRequest.ProducerIDLookup
ProducerIDLookup allows looking up a producer by their unique identifier.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to retrieve. Must be a valid UUID format. |






<a name="producerflow-producer-v1-GetProducerRequest-ProducerNPNLookup"></a>

### GetProducerRequest.ProducerNPNLookup
ProducerNPNLookup allows looking up a producer by their National Producer Number (NPN).


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_npn | [string](#string) |  | The National Producer Number (NPN) of the producer to retrieve. Must be a non-empty string. |






<a name="producerflow-producer-v1-GetProducerResponse"></a>

### GetProducerResponse
GetProducerResponse contains the producer information retrieved by the GetProducer RPC.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer | [Producer](#producerflow-producer-v1-Producer) |  | The complete producer information including personal details, agency association, and NIPR data. |






<a name="producerflow-producer-v1-ListAgenciesRequest"></a>

### ListAgenciesRequest
ListAgenciesRequest requests a list of agencies associated with the tenant.
Supports optional filtering and pagination parameters.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| organization_id | [string](#string) | optional | Optional. Filter agencies by organization ID. If provided, only agencies belonging to this organization will be returned. |
| search_query | [string](#string) | optional | Optional. Search query to filter agencies by name, NPN, or email. If provided, only agencies matching the search query will be returned. |
| pagination | [Pagination](#producerflow-producer-v1-Pagination) |  | Optional. Pagination parameters. If not provided, defaults to page_size=50. |
| agency_type | [AgencyType](#producerflow-producer-v1-AgencyType) | optional | Optional. Filter by agency type (internal vs external). If not provided, returns all agencies regardless of type. |
| entity_type | [EntityType](#producerflow-producer-v1-EntityType) | optional | Optional. Filter by entity type (sole proprietor vs agency). If not provided, returns all agencies regardless of entity type. |
| nipr_sync_statuses | [NIPRSyncState](#producerflow-producer-v1-NIPRSyncState) | repeated | Optional. Filter by NIPR sync status. If not provided, returns all agencies regardless of sync status. |






<a name="producerflow-producer-v1-ListAgenciesResponse"></a>

### ListAgenciesResponse
ListAgenciesResponse contains the list of agencies matching the filter criteria.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agencies | [AgencySummary](#producerflow-producer-v1-AgencySummary) | repeated | List of agency summaries matching the filter criteria. The agencies are ordered by creation date, most recent first. |
| next_page_token | [string](#string) |  | A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. |
| total_count | [int32](#int32) |  | Total number of agencies matching the filter criteria. |






<a name="producerflow-producer-v1-ListAgencyContactsRequest"></a>

### ListAgencyContactsRequest
ListAgencyContactsRequest requests all contacts associated with an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to retrieve contacts for. Must be a valid UUID format. |






<a name="producerflow-producer-v1-ListAgencyContactsResponse"></a>

### ListAgencyContactsResponse
ListAgencyContactsResponse contains all contacts associated with an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contacts | [Contact](#producerflow-producer-v1-Contact) | repeated | List of all contacts associated with the specified agency. |






<a name="producerflow-producer-v1-ListAgencyLocationsRequest"></a>

### ListAgencyLocationsRequest
ListAgencyLocationsRequest retrieves all locations for an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Required. Agency ID to list locations for. |






<a name="producerflow-producer-v1-ListAgencyLocationsResponse"></a>

### ListAgencyLocationsResponse
ListAgencyLocationsResponse contains the list of agency locations.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| locations | [Location](#producerflow-producer-v1-Location) | repeated | List of all locations associated with the agency. |






<a name="producerflow-producer-v1-ListNewProducersRequest"></a>

### ListNewProducersRequest
ListNewProducersRequest requests a list of new producers, optionally filtered by agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) | optional | Optional agency ID to filter producers by. If provided, only producers belonging to this agency will be returned. If not provided, producers from all agencies will be returned. |






<a name="producerflow-producer-v1-ListNewProducersResponse"></a>

### ListNewProducersResponse
ListNewProducersResponse contains a list of new producers that match the filter criteria.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| new_producers | [Producer](#producerflow-producer-v1-Producer) | repeated | List of new producers matching the filter criteria. These are producers typically in the NEW or pending onboarding state. |






<a name="producerflow-producer-v1-ListOrganizationsRequest"></a>

### ListOrganizationsRequest
ListOrganizationsRequest requests a list of all organizations associated with the tenant.
This request requires no parameters  and will return all organizations that
the authenticated tenant has access to.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| pagination | [Pagination](#producerflow-producer-v1-Pagination) |  | Optional. Pagination parameters. If not provided, defaults to page_size=50. |






<a name="producerflow-producer-v1-ListOrganizationsResponse"></a>

### ListOrganizationsResponse
ListOrganizationsResponse contains the list of organizations associated with the tenant.
The organizations are returned ordered by name. If the tenant has no organizations,
the organizations list will be empty.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| organizations | [Organization](#producerflow-producer-v1-Organization) | repeated | List of organizations associated with the tenant. Each organization includes its unique identifier and display name. The list may be empty if no organizations are associated with the tenant. Organizations are ordered alphabetically by name. |
| next_page_token | [string](#string) |  | A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. |
| total_count | [int32](#int32) |  | Total number of organizations matching the filter criteria. |






<a name="producerflow-producer-v1-Location"></a>

### Location
Location represents a physical or virtual location where an agency operates.
Each location includes address information and optional contact details.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Unique identifier for the location. |
| name | [string](#string) |  | Required. Name of the location. Must be unique within the agency. |
| address | [Address](#producerflow-producer-v1-Address) |  | Required. Physical address of the location. |
| phone | [string](#string) |  | Required. Phone number for the location. |
| email | [string](#string) |  | Required. Email address for the location. |
| is_primary | [bool](#bool) |  | Whether this is the primary location for the agency. |






<a name="producerflow-producer-v1-LocationInput"></a>

### LocationInput
LocationInput represents the input data for creating a new location.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | Required. Name of the location. Must be unique within the agency. |
| address | [Address](#producerflow-producer-v1-Address) |  | Required. Physical address of the location. |
| phone | [string](#string) |  | Required. Phone number for the location. |
| email | [string](#string) |  | Required. Email address for the location. |
| is_primary | [bool](#bool) |  | Whether this should be marked as the primary location. |






<a name="producerflow-producer-v1-LookupNPNByFEINRequest"></a>

### LookupNPNByFEINRequest
LookupNPNByFEINRequest is used to look up a producer&#39;s National Producer Number by their Federal Employer Identification Number (FEIN).


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| fein | [string](#string) |  | The Federal Employer Identification Number (FEIN) to look up. Required and must be exactly 9 characters. |






<a name="producerflow-producer-v1-LookupNPNByFEINResponse"></a>

### LookupNPNByFEINResponse
LookupNPNByFEINResponse contains the National Producer Number (NPN) for the producer associated with the given FEIN.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| npn | [string](#string) |  | The National Producer Number (NPN) for the producer. |






<a name="producerflow-producer-v1-NewAgencyRequest"></a>

### NewAgencyRequest
NewAgencyRequest contains complete information for creating a new agency


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency | [NewAgencyRequest.Agency](#producerflow-producer-v1-NewAgencyRequest-Agency) |  |  |
| sync_with_nipr | [bool](#bool) | optional | Optional. Overrides the tenant&#39;s default NIPR sync setting during onboarding. Most tenants have this enabled by default, so it usually doesn&#39;t need to be set. If specified, this value takes precedence over the tenant&#39;s default behavior. |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency"></a>

### NewAgencyRequest.Agency
Agency contains all information about the agency to be created


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| name | [string](#string) |  | The name of the agency. |
| email | [string](#string) |  | The email address of the agency. |
| npn | [string](#string) |  | National Producer Number for the agency Required for ENTITY_TYPE_AGENCY if FEIN is not provided Not allowed for ENTITY_TYPE_SOLE_PROPRIETOR |
| phone | [string](#string) |  | The phone number of the agency. |
| website | [string](#string) |  | The website of the agency. |
| principal | [NewAgencyRequest.Agency.Principal](#producerflow-producer-v1-NewAgencyRequest-Agency-Principal) |  | Information about the agency&#39;s principal. This is a required field as each agency must have a principal. |
| bank_account | [NewAgencyRequest.Agency.BankAccount](#producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount) |  |  |
| eo_info | [NewAgencyRequest.Agency.EOInfo](#producerflow-producer-v1-NewAgencyRequest-Agency-EOInfo) |  |  |
| business_hours | [NewAgencyRequest.Agency.BusinessHours](#producerflow-producer-v1-NewAgencyRequest-Agency-BusinessHours) |  |  |
| producers | [NewProducer](#producerflow-producer-v1-NewProducer) | repeated | List of producers associated with the agency |
| points_of_contact | [NewAgencyRequest.Agency.PointOfContact](#producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact) | repeated |  |
| root_organization_id | [string](#string) | optional | RootOrganizationID represents the ID of the root organization that the agency belongs to. An example of a root organization is an Aggregator (Like AgencyHero) or an Agency Network. We currently don&#39;t support multiple levels of organizations or agencies. Agencies are not always part of an organization, so this field is optional. To get valid organization IDs, use the ListOrganizations RPC. |
| entity_type | [EntityType](#producerflow-producer-v1-EntityType) |  | EntityType represents the type of business entity for an agency. |
| fein | [string](#string) | optional | FEIN represents the Federal Employer Identification Number of the agency. Required for ENTITY_TYPE_AGENCY Not allowed for ENTITY_TYPE_SOLE_PROPRIETOR |
| mailing_address | [Address](#producerflow-producer-v1-Address) |  | MailingAddress represents the mailing address of the agency. |
| physical_address | [Address](#producerflow-producer-v1-Address) |  | PhysicalAddress represents the physical address of the agency. |
| invoicing_address | [Address](#producerflow-producer-v1-Address) |  | InvoicingAddress represents the invoicing address of the agency. |
| tenant_agency_id | [string](#string) |  | TenantAgencyID represents the ID of the agency in the tenant. This is used to link the agency to the tenant. |
| locations | [LocationInput](#producerflow-producer-v1-LocationInput) | repeated | Optional field that allows specifying multiple locations during agency creation. |
| metadata_questions | [NewAgencyRequest.Agency.MetadataQuestionsEntry](#producerflow-producer-v1-NewAgencyRequest-Agency-MetadataQuestionsEntry) | repeated | MetadataQuestions contains custom metadata questions and answers for the agency. The map key is the question identifier/text, and the value is the answer provided. This field is deprecated and will be removed in a future release. |
| tenant_additional_questions | [NewAgencyRequest.Agency.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-NewAgencyRequest-Agency-TenantAdditionalQuestionsEntry) | repeated | tenant_additional_questions contains tenant-specific custom questions configured by Producerflow and their corresponding responses. Keys are question identifiers or text, values are the answers provided. |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount"></a>

### NewAgencyRequest.Agency.BankAccount
BankAccount contains banking information for commission payments
This is used to store the bank account information for the agency


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| account_number | [string](#string) |  |  |
| routing_number | [string](#string) |  | Routing number for the bank account |
| account_type | [NewAgencyRequest.Agency.BankAccount.AccountType](#producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount-AccountType) |  | Type of account (checking or savings) |
| account_holder_name | [string](#string) |  | Name of the account holder |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-BusinessHours"></a>

### NewAgencyRequest.Agency.BusinessHours
BusinessHours contains the business hours of the agency


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| timezone | [string](#string) |  | Timezone of the agency |
| business_hours | [NewAgencyRequest.Agency.BusinessHours.BusinessHour](#producerflow-producer-v1-NewAgencyRequest-Agency-BusinessHours-BusinessHour) | repeated |  |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-BusinessHours-BusinessHour"></a>

### NewAgencyRequest.Agency.BusinessHours.BusinessHour



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| week_days | [google.type.DayOfWeek](#google-type-DayOfWeek) | repeated | Days of the week when the agency is open |
| opening_time | [google.type.TimeOfDay](#google-type-TimeOfDay) |  | Time when the agency opens |
| closing_time | [google.type.TimeOfDay](#google-type-TimeOfDay) |  | Time when the agency closes |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-EOInfo"></a>

### NewAgencyRequest.Agency.EOInfo
EOInfo contains Errors &amp; Omissions insurance information


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| carrier | [string](#string) |  | Insurance carrier providing the E&amp;O coverage |
| expiration_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date when the E&amp;O coverage will expire |
| coverage_amount | [string](#string) |  | Amount of coverage provided by the E&amp;O policy (aggregate limit) |
| effective_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date when the E&amp;O coverage will become effective |
| per_occurrence | [string](#string) |  | Per occurrence limit for the E&amp;O policy |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-MetadataQuestionsEntry"></a>

### NewAgencyRequest.Agency.MetadataQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact"></a>

### NewAgencyRequest.Agency.PointOfContact
PointOfContact contains contact information for the agency. Each point of contact
consists of an email address with an associated role. Carriers will send specific
information to these email addresses based on their roles. For example, if an email
is assigned the COMMUNICATION_ROLE_ACCOUNTING role, all accounting information from
the carrier will be sent to that email address.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| email | [string](#string) |  | Email address of the point of contact |
| role | [NewAgencyRequest.Agency.PointOfContact.CommunicationRole](#producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact-CommunicationRole) |  | Role of the point of contact |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-Principal"></a>

### NewAgencyRequest.Agency.Principal
Principal is a data structure that represents the principal of a agency.
A principal is the person or entity that is responsible for the day-to-day operations of the agency.
The principal is usually the CEO or CFO of the agency.nThe principal is also known as the &#34;owner&#34; of the agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| first_name | [string](#string) |  | The first name of the principal. |
| last_name | [string](#string) |  | The last name of the principal. |
| middle_name | [string](#string) |  | The middle name of the principal. |
| email | [string](#string) |  | The email address of the principal. |
| phone | [string](#string) |  | The phone number of the principal. |
| npn | [string](#string) |  | The National Producer Number (NPN) of the principal. |
| tenant_id | [string](#string) |  | Optional. External identifier for the principal in the tenant&#39;s system. This field allows tenants to maintain a reference to their own internal ID for this principal, enabling bi-directional synchronization between ProducerFlow and the tenant&#39;s system. Usage: Provide this when you have an existing identifier for the principal in your system. Omit if you don&#39;t need to track a reference to your internal system. This is independent of ProducerFlow&#39;s internal IDs and the authentication tenant context. Format: Any string identifier that is meaningful in your system (e.g., &#34;USR-12345&#34;, &#34;uuid&#34;). Validation: Maximum length of 255 characters. |
| sync_with_nipr | [bool](#bool) | optional | Optional. Controls whether the principal should be validated and synced with NIPR. If set to false, the principal&#39;s NPN will not be validated against NIPR and the principal will not be synced with NIPR. Defaults to true if not specified. |
| tenant_additional_questions | [NewAgencyRequest.Agency.Principal.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-NewAgencyRequest-Agency-Principal-TenantAdditionalQuestionsEntry) | repeated | tenant_additional_questions contains tenant-specific custom questions configured by Producerflow and their corresponding responses. Keys are question identifiers or text, values are the answers provided. |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-Principal-TenantAdditionalQuestionsEntry"></a>

### NewAgencyRequest.Agency.Principal.TenantAdditionalQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-NewAgencyRequest-Agency-TenantAdditionalQuestionsEntry"></a>

### NewAgencyRequest.Agency.TenantAdditionalQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-NewAgencyResponse"></a>

### NewAgencyResponse
NewAgencyResponse contains the IDs of created resources after a successful agency creation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Unique identifier for the created agency |
| producer_ids | [string](#string) | repeated | List of unique identifiers for any producers created with the agency |
| principal_id | [string](#string) |  | Unique identifier for the principal producer |
| location_ids | [string](#string) | repeated | IDs of the locations created for the agency (if any were provided in the request) |






<a name="producerflow-producer-v1-NewContact"></a>

### NewContact
NewContact represents the data needed to create a new contact in the system.
Contacts represent non-producer individuals associated with an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| first_name | [string](#string) |  | First name of the contact. Required and must be non-empty. |
| last_name | [string](#string) |  | Last name of the contact. Required and must be non-empty. |
| middle_name | [string](#string) |  | Middle name of the contact. Optional. |
| email | [string](#string) |  | Email address of the contact. Required and must be a valid email format. Must be unique within the tenant. |
| phone | [string](#string) |  | Phone number of the contact. Optional if default value, but if provided must match the pattern of a valid phone number. |
| address | [Address](#producerflow-producer-v1-Address) |  | Mailing address of the contact. |
| role | [string](#string) |  | Role or position of the contact within the agency. Required and must be non-empty. |
| tenant_id | [string](#string) |  | Optional. External identifier for the contact in the tenant&#39;s system. This field allows tenants to maintain a reference to their own internal ID for this contact, enabling bi-directional synchronization between ProducerFlow and the tenant&#39;s system. Usage: Provide this when you have an existing identifier for the contact in your system. Omit if you don&#39;t need to track a reference to your internal system. This is independent of ProducerFlow&#39;s internal IDs and the authentication tenant context. Can be used with SetExternalID RPC to update this value after creation. Common use cases: Linking to an existing CRM or AMS system contact ID. Maintaining synchronization with legacy systems. Enabling lookups from external systems back to ProducerFlow. Format: Any string identifier that is meaningful in your system (e.g., &#34;CONT-12345&#34;, &#34;uuid&#34;). Validation: Maximum length of 255 characters |
| npn | [string](#string) | optional | National Producer Number (NPN) of the contact. |






<a name="producerflow-producer-v1-NewContactRequest"></a>

### NewContactRequest
NewContactRequest is used to create a new contact and associate it with an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to associate the contact with. Must be a valid UUID format. |
| contact | [NewContact](#producerflow-producer-v1-NewContact) |  | Information about the contact to create. |






<a name="producerflow-producer-v1-NewContactResponse"></a>

### NewContactResponse
NewContactResponse contains the ID of the created contact.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contact_id | [string](#string) |  | The UUID of the created contact. Must be a valid UUID format. |






<a name="producerflow-producer-v1-NewContactsRequest"></a>

### NewContactsRequest
NewContactsRequest is used to create multiple contacts in a single request.
All contacts will be associated with the specified agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to associate the contacts with. Must be a valid UUID format. |
| contacts | [NewContact](#producerflow-producer-v1-NewContact) | repeated | List of contacts to create. This field is required and must contain at least one contact. |






<a name="producerflow-producer-v1-NewContactsResponse"></a>

### NewContactsResponse
NewContactsResponse contains the IDs of all created contacts.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| contact_ids | [string](#string) | repeated | List of UUIDs for the newly created contacts. The order matches the order of contacts in the request. |






<a name="producerflow-producer-v1-NewProducer"></a>

### NewProducer
NewProducer represents the data needed to create a new producer in the system.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| first_name | [string](#string) |  | First name of the producer. Required and must be non-empty. |
| last_name | [string](#string) |  | Last name of the producer. Required and must be non-empty. |
| middle_name | [string](#string) |  | Middle name of the producer. Optional. |
| email | [string](#string) |  | Email address of the producer. Required and must be a valid email format. Must be unique within the tenant. |
| npn | [string](#string) |  | National Producer Number (NPN) of the producer. |
| phone | [string](#string) |  | Phone number of the producer. Optional if default value, but if provided must match the pattern of a valid phone number. |
| mailing_address | [NewProducer.Address](#producerflow-producer-v1-NewProducer-Address) |  | Mailing address of the producer. This is where correspondence will be sent. |
| tenant_id | [string](#string) |  | Optional. External identifier for the producer in the tenant&#39;s system. This field allows tenants to maintain a reference to their own internal ID for this producer, enabling bi-directional synchronization between ProducerFlow and the tenant&#39;s system. Usage: Provide this when you have an existing identifier for the producer in your system. Omit if you don&#39;t need to track a reference to your internal system. This is independent of ProducerFlow&#39;s internal IDs and the authentication tenant context. Can be used with SetExternalID RPC to update this value after creation. Common use cases: Linking to an existing CRM or AMS system producer ID. Maintaining synchronization with legacy systems. Enabling lookups from external systems back to ProducerFlow. Format: Any string identifier that is meaningful in your system (e.g., &#34;PROD-12345&#34;, &#34;uuid&#34;). Validation: Maximum length of 255 characters. |
| location_ids | [string](#string) | repeated | Optional list of location IDs to assign to the producer during creation. All locations must exist and belong to the specified agency. |
| metadata_questions | [NewProducer.MetadataQuestionsEntry](#producerflow-producer-v1-NewProducer-MetadataQuestionsEntry) | repeated | MetadataQuestions contains custom metadata questions and answers for the producer. The map key is the question identifier/text, and the value is the answer provided. This field is deprecated and will be removed in a future release. |
| tenant_additional_questions | [NewProducer.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-NewProducer-TenantAdditionalQuestionsEntry) | repeated | tenant_additional_questions contains tenant-specific custom questions configured by Producerflow and their corresponding responses. Keys are question identifiers or text, values are the answers provided. |






<a name="producerflow-producer-v1-NewProducer-Address"></a>

### NewProducer.Address
Address represents a mailing address for the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street address of the producer. Required and must be non-empty. |
| city | [string](#string) |  | City of the producer. Required and must be non-empty. |
| state | [string](#string) |  | State of the producer. Required and must be a 2-letter state code. |
| zip | [string](#string) |  | Zip code of the producer. Required and must be between 1 and 10 characters. |
| address_line_2 | [string](#string) | optional | Optional second line of address (apt, suite, unit, etc.) |






<a name="producerflow-producer-v1-NewProducer-MetadataQuestionsEntry"></a>

### NewProducer.MetadataQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-NewProducer-TenantAdditionalQuestionsEntry"></a>

### NewProducer.TenantAdditionalQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-NewProducerRequest"></a>

### NewProducerRequest
NewProducerRequest is used to create a new producer and associate it with an agency.
This will trigger a call to the NIPR API to retrieve license information of the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to associate the producer with. Must be a valid UUID format. |
| producer | [NewProducer](#producerflow-producer-v1-NewProducer) |  | Information about the producer to create. This field is required. |
| sync_with_nipr | [bool](#bool) | optional | Optional. Overrides the tenant&#39;s default NIPR sync setting during onboarding. Most tenants have this enabled by default, so it usually doesn&#39;t need to be set. If specified, this value takes precedence over the tenant&#39;s default behavior. |






<a name="producerflow-producer-v1-NewProducerResponse"></a>

### NewProducerResponse
NewProducerResponse contains the ID of the created producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the created producer. Must be a valid UUID format. |






<a name="producerflow-producer-v1-NewProducersRequest"></a>

### NewProducersRequest
NewProducersRequest is used to create multiple producers in a single request.
All producers will be associated with the specified agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to associate the producers with. Must be a valid UUID format. |
| producers | [NewProducer](#producerflow-producer-v1-NewProducer) | repeated | List of producers to create. This field is required and must contain at least one producer. |
| sync_with_nipr | [bool](#bool) | optional | Optional. Overrides the tenant&#39;s default NIPR sync setting during onboarding. Most tenants have this enabled by default, so it usually doesn&#39;t need to be set. If specified, this value takes precedence over the tenant&#39;s default behavior. |






<a name="producerflow-producer-v1-NewProducersResponse"></a>

### NewProducersResponse
NewProducersResponse contains the IDs of all created producers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_ids | [string](#string) | repeated | List of UUIDs for the newly created producers. The order matches the order of producers in the request. |






<a name="producerflow-producer-v1-Organization"></a>

### Organization
Organization represents a logical grouping or hierarchical structure within a tenant.
Organizations can be used to organize agencies into meaningful groups
such as agency networks, aggregators, or other business hierarchies.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Unique identifier for the organization. This is a UUID that can be used to reference the organization in other API calls. |
| name | [string](#string) |  | Display name of the organization. This is the human-readable name that identifies the organization to users. |
| external_id | [string](#string) |  | External identifier for the organization. This is the identifier used by the tenant&#39;s system to identify the organization. |
| email | [string](#string) |  | Contact email address for the organization. |






<a name="producerflow-producer-v1-Pagination"></a>

### Pagination
Pagination provides page token and page size for paginating list results.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| page_size | [int32](#int32) |  | The maximum number of items to return. The service may return fewer than this value. If unspecified, at most 50 items will be returned. The maximum value is 200; values above 200 will be rejected. |
| page_token | [string](#string) |  | A page token, received from a previous list call. Provide this to retrieve the subsequent page. When paginating, all other parameters must match the call that provided the page token. |






<a name="producerflow-producer-v1-Producer"></a>

### Producer
Producer represents a producer that has been onboarded.

Internal ID of the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |
| first_name | [string](#string) |  | First name of the producer. |
| middle_name | [string](#string) |  | Middle name of the producer. |
| last_name | [string](#string) |  | Last name of the producer. |
| email | [string](#string) |  | The email address of the producer. Used for communication and must be unique within the tenant. Must be a valid email format. |
| npn | [string](#string) |  | The National Producer Number (NPN) of the producer. This is used to retrieve license information from the NIPR API. Must be non-empty. |
| phone | [string](#string) |  | Phone number of the producer. |
| pdb_alerts_sync_enabled | [bool](#bool) |  | Indicates whether the producer is enabled to be synchronized with NIPR API. When true, the system will regularly check for updates from NIPR. |
| agency | [Producer.Agency](#producerflow-producer-v1-Producer-Agency) |  | Basic information about the agency this producer is associated with. |
| nipr | [Producer.NIPR](#producerflow-producer-v1-Producer-NIPR) |  | Data synchronized from the NIPR service. Contains license information, biographic data, regulatory actions, and carrier appointments. |
| is_principal | [bool](#bool) |  | Indicates whether this producer is the principal of an agency. A principal producer has additional responsibilities and permissions. |
| requested_appointments | [string](#string) | repeated | The list of requested appointments for the producer. |
| address | [Producer.Address](#producerflow-producer-v1-Producer-Address) |  | Address of the producer. |
| locations | [Location](#producerflow-producer-v1-Location) | repeated | Locations assigned to this producer. |
| metadata_questions | [Producer.MetadataQuestionsEntry](#producerflow-producer-v1-Producer-MetadataQuestionsEntry) | repeated | MetadataQuestions contains custom metadata questions and answers for the producer. This field stores tenant-specific questions that need to be asked during producer onboarding. The map key is the question identifier/text, and the value is the answer provided. This field is deprecated and will be removed in a future release. |
| external_metadata | [Producer.ExternalMetadataEntry](#producerflow-producer-v1-Producer-ExternalMetadataEntry) | repeated | ExternalMetadata contains additional custom information that the tenant stores in ProducerFlow&#39;s data model. This field allows tenants to attach arbitrary key-value pairs to producers for their own business logic, reporting, or integration needs. This field is populated programmatically via API calls by the tenant&#39;s systems. Common use cases include: - Storing references to external system states or categories - Adding custom tags or classifications - Maintaining tenant-specific business attributes - Storing computed values or derived data The map key is the metadata field name, and the value is the associated data. |
| tenant_additional_questions | [Producer.TenantAdditionalQuestionsEntry](#producerflow-producer-v1-Producer-TenantAdditionalQuestionsEntry) | repeated | tenant_additional_questions contains tenant-specific custom questions configured by Producerflow and their corresponding responses. Keys are question identifiers or text, values are the answers provided. |






<a name="producerflow-producer-v1-Producer-Address"></a>

### Producer.Address
Address represents a mailing address for the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street address of the producer. |
| city | [string](#string) |  | City of the producer. |
| state | [string](#string) |  | State of the producer. |
| zip | [string](#string) |  | Zip code of the producer. |
| address_line_2 | [string](#string) | optional | Optional second line of address (apt, suite, unit, etc.) |






<a name="producerflow-producer-v1-Producer-Agency"></a>

### Producer.Agency
Agency contains basic information about the agency this producer is associated with.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Unique identifier for the associated agency. |
| name | [string](#string) |  | Name of the associated agency. |






<a name="producerflow-producer-v1-Producer-ExternalMetadataEntry"></a>

### Producer.ExternalMetadataEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-Producer-MetadataQuestionsEntry"></a>

### Producer.MetadataQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-Producer-NIPR"></a>

### Producer.NIPR
NIPR contains data synchronized from the National Insurance Producer Registry.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| licenses | [Producer.NIPR.License](#producerflow-producer-v1-Producer-NIPR-License) | repeated | List of all licenses held by the producer across different states. |
| biographic | [Producer.NIPR.Biographic](#producerflow-producer-v1-Producer-NIPR-Biographic) |  | Biographic information of the producer from NIPR |
| regulatory_info | [Producer.NIPR.ProducerRegulatoryInfo](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo) |  | Producer&#39;s regulatory information from NIPR |
| appointments | [Producer.NIPR.Appointment](#producerflow-producer-v1-Producer-NIPR-Appointment) | repeated | List of carrier appointments held by the producer in NIPR. These represent relationships with insurance carriers that allow the producer to sell their products. |






<a name="producerflow-producer-v1-Producer-NIPR-Appointment"></a>

### Producer.NIPR.Appointment
Appointment represents a relationship between a producer and an insurance carrier.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| branch_id | [string](#string) |  |  |
| company_name | [string](#string) |  | Name of the insurance company for this appointment. |
| fein | [string](#string) |  | Federal Employer Identification Number of the producer&#39;s company. |
| co_code | [string](#string) |  | Company code for the insurance carrier. |
| line_of_authority | [string](#string) |  | Line of authority for this appointment (e.g., Life, Property, Casualty). Indicates what types of insurance the producer can sell. |
| loa_code | [string](#string) |  | Code for the line of authority for this appointment. |
| status | [string](#string) |  | Current status of the appointment (e.g., Active, Terminated). |
| termination_reason | [string](#string) |  | Reason for termination if the appointment has been terminated. |
| status_reason_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date associated with the current status or reason. |
| appointment_renewal_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date when the appointment will renew. |
| agency_affiliations | [string](#string) |  | Additional affiliations or roles the producer has with the agency. |






<a name="producerflow-producer-v1-Producer-NIPR-Biographic"></a>

### Producer.NIPR.Biographic
Biographic contains personal and identifying information about the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| last_name | [string](#string) |  | Last name of the producer as recorded in NIPR. |
| first_name | [string](#string) |  | First name of the producer as recorded in NIPR. |
| middle_name | [string](#string) |  | Middle name of the producer as recorded in NIPR. |
| date_of_birth | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Date of birth of the producer. |
| fein | [string](#string) |  | Federal Employer Identification Number if the producer is a business entity. |
| company_name | [string](#string) |  | Company name if the producer is a business entity. |
| state_domicile | [string](#string) |  | State of domicile (resident state) for the producer. This is the state where the producer is primarily located. |






<a name="producerflow-producer-v1-Producer-NIPR-License"></a>

### Producer.NIPR.License
License contains information about a producer&#39;s insurance license.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| license_number | [string](#string) |  | The license number assigned by the state regulatory authority. |
| license_state | [string](#string) |  | The state that issued the license. Typically a two-letter state code. |
| residency_status | [string](#string) |  | Indicates whether this is a resident or non-resident license. Values are typically &#34;Resident&#34; or &#34;Non-Resident&#34;. |
| active | [bool](#bool) |  | Indicates whether the license is currently active. |
| status | [Producer.NIPR.License.LicenseStatus](#producerflow-producer-v1-Producer-NIPR-License-LicenseStatus) |  | The current status of the license (valid, expired, etc.). |
| expiration_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the license will expire if not renewed. |
| updated_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The last time this license information was updated from NIPR. |
| lines_of_authority | [Producer.NIPR.License.LineOfAuthority](#producerflow-producer-v1-Producer-NIPR-License-LineOfAuthority) | repeated | Lines of Authority associated with this license. These define what types of insurance the producer can sell in this state. |






<a name="producerflow-producer-v1-Producer-NIPR-License-LineOfAuthority"></a>

### Producer.NIPR.License.LineOfAuthority
LineOfAuthority represents a specific type of insurance coverage
that a producer is authorized to sell under this license.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| loa | [string](#string) |  | The Line of Authority description (e.g., &#34;Life&#34;, &#34;Property and Casualty&#34;, &#34;Health&#34;). This is typically an uppercase string that describes the insurance type. |
| active | [bool](#bool) |  | Whether this Line of Authority is currently active. |
| issue_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when this Line of Authority was issued. |






<a name="producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo"></a>

### Producer.NIPR.ProducerRegulatoryInfo
ProducerRegulatoryInfo contains regulatory information about a producer,
including any regulatory actions taken against them.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| regulatory_actions_by_state | [Producer.NIPR.ProducerRegulatoryInfo.RegulatoryActionsByStateEntry](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryActionsByStateEntry) | repeated | Map of regulatory actions by state. The key is the state code, and the value is the regulatory action. |
| clearance_certification_info | [string](#string) |  | Clearance certification information for the producer. |
| nasd_exam_details | [string](#string) |  | Details about NASD/FINRA examinations taken by the producer. |






<a name="producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryAction"></a>

### Producer.NIPR.ProducerRegulatoryInfo.RegulatoryAction
RegulatoryAction represents a regulatory action taken against a producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| action_id | [string](#string) |  | Unique identifier for the regulatory action. |
| origin_of_action | [string](#string) |  | The regulatory body that originated the action. Typically a state insurance department or FINRA. |
| reason_for_action | [string](#string) |  | The reason why the regulatory action was taken. |
| disposition | [string](#string) |  | The outcome or resolution of the regulatory action. |
| date_of_action | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the regulatory action was taken. |
| effective_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the regulatory action became effective. |
| enter_date | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | The date when the producer entered into the regulatory action. |
| file_ref | [string](#string) |  | Reference number for the regulatory action file. |
| penalty_fine_forfeiture | [string](#string) |  | Any financial penalties associated with the regulatory action. |
| length_of_order | [string](#string) |  | Duration of any orders associated with the regulatory action. |






<a name="producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryActionsByStateEntry"></a>

### Producer.NIPR.ProducerRegulatoryInfo.RegulatoryActionsByStateEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [Producer.NIPR.ProducerRegulatoryInfo.RegulatoryAction](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryAction) |  |  |






<a name="producerflow-producer-v1-Producer-TenantAdditionalQuestionsEntry"></a>

### Producer.TenantAdditionalQuestionsEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-ProducerData"></a>

### ProducerData



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| npn | [string](#string) | optional |  |
| first_name | [string](#string) | optional | First name of the producer |
| last_name | [string](#string) | optional | Last name of the producer |
| middle_name | [string](#string) | optional | Middle name of the producer |
| email | [string](#string) | optional | Email address of the producer |
| phone | [string](#string) | optional | Phone number of the producer |
| mailing_address | [ProducerData.Address](#producerflow-producer-v1-ProducerData-Address) |  | Mailing address of the producer |






<a name="producerflow-producer-v1-ProducerData-Address"></a>

### ProducerData.Address



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  |  |
| city | [string](#string) |  |  |
| state | [string](#string) |  |  |
| zip | [string](#string) |  |  |
| country | [string](#string) |  |  |
| address_line_2 | [string](#string) | optional |  |






<a name="producerflow-producer-v1-RemoveAgencyLocationsRequest"></a>

### RemoveAgencyLocationsRequest
RemoveAgencyLocationsRequest removes locations from an agency.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Required. Agency ID to remove locations from. |
| location_ids | [string](#string) | repeated | Required. IDs of locations to remove. |






<a name="producerflow-producer-v1-RemoveAgencyLocationsResponse"></a>

### RemoveAgencyLocationsResponse
RemoveAgencyLocationsResponse contains the results of removing locations.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| removed_location_ids | [string](#string) | repeated | IDs of successfully removed locations. |






<a name="producerflow-producer-v1-ResyncAgencyRequest"></a>

### ResyncAgencyRequest
ResyncAgencyRequest is used to trigger a manual resynchronization of agency data.
This will re-fetch all data from the NIPR API for the agency and all associated producers.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to resynchronize. Must be a valid UUID format. |






<a name="producerflow-producer-v1-ResyncAgencyResponse"></a>

### ResyncAgencyResponse
ResyncAgencyResponse is the empty response returned after successfully triggering a resynchronization.






<a name="producerflow-producer-v1-ResyncProducerRequest"></a>

### ResyncProducerRequest
ResyncProducerRequest is used to trigger a manual resynchronization of producer data.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to resynchronize. Must be a valid UUID format. |






<a name="producerflow-producer-v1-ResyncProducerResponse"></a>

### ResyncProducerResponse
ResyncProducerResponse is the empty response returned after successfully triggering a resynchronization.






<a name="producerflow-producer-v1-SetExternalIDRequest"></a>

### SetExternalIDRequest
SetExternalIDRequest is used to associate an external identifier with a producer, agency, or contact.
This allows integration with external systems that use different ID schemes.

Only one entity type can be specified.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to set an external ID for. |
| agency_id | [string](#string) |  | The UUID of the agency to set an external ID for. |
| contact_id | [string](#string) |  | The UUID of the contact to set an external ID for. |
| organization_id | [string](#string) |  | The UUID of the organization to set an external ID for. |
| tenant_id | [string](#string) |  | External identifier to associate with the entity in the tenant&#39;s system. This field allows tenants to maintain a reference to their own internal ID for the specified entity (producer, agency, contact, or organization), enabling bi-directional synchronization between ProducerFlow and the tenant&#39;s system. Purpose: Links ProducerFlow entities to corresponding entities in external systems. Enables lookups and synchronization across systems. Maintains referential integrity with tenant&#39;s internal databases. Usage: Call this RPC after creating an entity if you need to add or update the external reference. This can also be provided during entity creation for producers and contacts. This is independent of ProducerFlow&#39;s internal IDs and the authentication tenant context. Relationship to authentication: The tenant context is determined by the API key used for authentication. This tenant_id field is purely for storing the tenant&#39;s own external identifier. Multiple tenants cannot share the same entity; each tenant has their own isolated data. Common use cases: Syncing with CRM systems (e.g., Salesforce IDs, HubSpot IDs). Integrating with AMS platforms (e.g., Applied Epic, Vertafore). Maintaining references to legacy system identifiers. Format: Any string identifier that is meaningful in your system (e.g., &#34;SF-001234&#34;, &#34;LEGACY-9876&#34;). Validation: Must be non-empty, maximum length of 255 characters |






<a name="producerflow-producer-v1-SetExternalIDResponse"></a>

### SetExternalIDResponse
SetExternalIDResponse is the empty response returned after successfully setting an external ID.






<a name="producerflow-producer-v1-StopSyncAgencyWithNIPRRequest"></a>

### StopSyncAgencyWithNIPRRequest
StopSyncAgencyWithNIPRRequest is used to stop synchronizing an agency&#39;s data with the NIPR API.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to stop synchronizing. Must be a valid UUID format. |
| stop_all_producers | [bool](#bool) |  | If true, all producers associated with the agency will be stopped from synchronizing. If false, only the agency will be stopped from synchronizing. |






<a name="producerflow-producer-v1-StopSyncAgencyWithNIPRResponse"></a>

### StopSyncAgencyWithNIPRResponse
StopSyncAgencyWithNIPRResponse is the empty response returned after successfully stopping the synchronization of an agency&#39;s data with the NIPR API.






<a name="producerflow-producer-v1-StopSyncProducerWithNIPRRequest"></a>

### StopSyncProducerWithNIPRRequest
StopSyncProducerWithNIPRRequest is used to stop synchronizing a producer&#39;s data with the NIPR API.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to stop synchronizing. Must be a valid UUID format. |






<a name="producerflow-producer-v1-StopSyncProducerWithNIPRResponse"></a>

### StopSyncProducerWithNIPRResponse
StopSyncProducerWithNIPRResponse is the empty response returned after successfully stopping the synchronization of a producer&#39;s data with the NIPR API.






<a name="producerflow-producer-v1-SyncAgencyWithNIPRRequest"></a>

### SyncAgencyWithNIPRRequest
SyncAgencyWithNIPRRequest is used to synchronize an agency&#39;s data with the NIPR API.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to synchronize. Must be a valid UUID format. |
| sync_all_producers | [bool](#bool) |  | If true, all producers associated with the agency will be synchronized. If false, only the agency will be synchronized. |






<a name="producerflow-producer-v1-SyncAgencyWithNIPRResponse"></a>

### SyncAgencyWithNIPRResponse
SyncAgencyWithNIPRResponse is the empty response returned after successfully synchronizing an agency&#39;s data with the NIPR API.






<a name="producerflow-producer-v1-SyncProducerWithNIPRRequest"></a>

### SyncProducerWithNIPRRequest
SyncProducerWithNIPRRequest is used to synchronize a producer&#39;s data with the NIPR API.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to synchronize. Must be a valid UUID format. |






<a name="producerflow-producer-v1-SyncProducerWithNIPRResponse"></a>

### SyncProducerWithNIPRResponse
SyncProducerWithNIPRResponse is the empty response returned after successfully synchronizing a producer&#39;s data with the NIPR API.






<a name="producerflow-producer-v1-UnassignProducerFromLocationsRequest"></a>

### UnassignProducerFromLocationsRequest
UnassignProducerFromLocationsRequest removes location assignments from a producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | Required. Producer ID to unassign locations from. |
| location_ids | [string](#string) | repeated | Required. Location IDs to unassign (1-100 items). |






<a name="producerflow-producer-v1-UnassignProducerFromLocationsResponse"></a>

### UnassignProducerFromLocationsResponse
UnassignProducerFromLocationsResponse contains the unassigned location IDs.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| unassigned_location_ids | [string](#string) | repeated | IDs of successfully unassigned locations. |






<a name="producerflow-producer-v1-UpdateAgencyLocationRequest"></a>

### UpdateAgencyLocationRequest
UpdateAgencyLocationRequest updates an existing agency location.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Required. Agency ID that owns the location. |
| location_id | [string](#string) |  | Required. Location ID to update. |
| name | [string](#string) | optional | Optional. New name for the location. Must be unique within the agency. |
| address | [Address](#producerflow-producer-v1-Address) | optional | Optional. New address for the location. |
| phone | [string](#string) | optional | Optional. New phone number. Must be in E.164 format. |
| email | [string](#string) | optional | Optional. New email address. |
| is_primary | [bool](#bool) | optional | Optional. Whether this should be the primary location. |






<a name="producerflow-producer-v1-UpdateAgencyLocationResponse"></a>

### UpdateAgencyLocationResponse
UpdateAgencyLocationResponse contains the updated location details.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| location | [Location](#producerflow-producer-v1-Location) |  | The updated location with all current values. |






<a name="producerflow-producer-v1-UpdateAgencyRequest"></a>

### UpdateAgencyRequest
UpdateAgencyRequest contains the fields that can be updated in an agency record.
Only information collected during the onboarding process can be updated.
Information from NIPR and other third-party sources cannot be updated directly.
All fields are optional, allowing partial updates.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The ID of the agency to update. Must be a valid UUID format. |
| agency | [UpdateAgencyRequest.Agency](#producerflow-producer-v1-UpdateAgencyRequest-Agency) |  | The agency information to update. |






<a name="producerflow-producer-v1-UpdateAgencyRequest-Agency"></a>

### UpdateAgencyRequest.Agency
Agency contains the fields that can be updated for an agency.
All fields are optional, allowing partial updates.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| email | [string](#string) | optional | Email address of the agency. |
| phone | [string](#string) | optional | Phone number of the agency. |
| fax | [string](#string) | optional | Fax number of the agency. |
| website | [string](#string) | optional | Website URL of the agency. |
| requested_appointments | [string](#string) | repeated | List of requested appointments for the agency (state codes). The list contains a list of two-lettercd country codes where the appointments are requested. The only valid values are the U.S country codes. |
| notes | [string](#string) | optional |  |
| physical_address | [UpdateAgencyRequest.Agency.Address](#producerflow-producer-v1-UpdateAgencyRequest-Agency-Address) | optional | Physical address of the agency. |
| external_metadata | [UpdateAgencyRequest.Agency.ExternalMetadataEntry](#producerflow-producer-v1-UpdateAgencyRequest-Agency-ExternalMetadataEntry) | repeated | ExternalMetadata contains additional custom information that the tenant stores in ProducerFlow&#39;s data model. This field allows tenants to attach arbitrary key-value pairs to agencies for their own business logic, reporting, or integration needs. This field is populated programmatically via API calls by the tenant&#39;s systems. Common use cases include: - Storing references to external system states or categories - Adding custom tags or classifications - Maintaining tenant-specific business attributes - Storing computed values or derived data The map key is the metadata field name, and the value is the associated data.

Update behavior: - If not provided (null): existing metadata is preserved unchanged - If provided as empty map {}: existing metadata is cleared - If provided with values: existing metadata is completely replaced with the new values |






<a name="producerflow-producer-v1-UpdateAgencyRequest-Agency-Address"></a>

### UpdateAgencyRequest.Agency.Address
Address represents a physical location with standard address components.
All fields are optional, allowing partial updates of address fields.
Address fields cannot be cleared - if provided, they must have valid values.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) | optional | Street address including house/building number and street name. If provided, must be non-empty. |
| city | [string](#string) | optional | City of the address. If provided, must be non-empty. |
| state | [string](#string) | optional | State of the address. If provided, must be exactly 2 characters (state code). |
| zip | [string](#string) | optional | Zip code of the address. If provided, must be between 1 and 10 characters. |
| address_line_2 | [string](#string) | optional | Additional address line (e.g., apartment, suite, floor number). If provided, must be non-empty. |






<a name="producerflow-producer-v1-UpdateAgencyRequest-Agency-ExternalMetadataEntry"></a>

### UpdateAgencyRequest.Agency.ExternalMetadataEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-UpdateAgencyResponse"></a>

### UpdateAgencyResponse
UpdateAgencyResponse is the empty response returned after successfully updating an agency.






<a name="producerflow-producer-v1-UpdateProducerRequest"></a>

### UpdateProducerRequest
UpdateProducerRequest contains the fields that can be updated in a producer record.
Only information collected during the onboarding process can be updated.
Information from NIPR and other third-party sources cannot be updated directly.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The ID of the producer to update. Must be a valid UUID format. |
| producer | [UpdateProducerRequest.Producer](#producerflow-producer-v1-UpdateProducerRequest-Producer) |  | The producer information to update. The field is required. |






<a name="producerflow-producer-v1-UpdateProducerRequest-Producer"></a>

### UpdateProducerRequest.Producer
Producer contains the fields that can be updated for a producer.
All fields are optional, allowing partial updates.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| first_name | [string](#string) | optional | First name of the producer. If provided, must be non-empty. |
| last_name | [string](#string) | optional | Last name of the producer. If provided, must be non-empty. |
| middle_name | [string](#string) | optional | Middle name of the producer. If provided, must be non-empty. |
| email | [string](#string) | optional | Email address of the producer. If provided, must be a valid email format. Must be unique within the tenant. |
| npn | [string](#string) | optional | **Deprecated.** National Producer Number (NPN) of the producer. If provided, must be non-empty. Deprecated: NPN cannot be updated. This field is ignored and will be removed in a future version. |
| phone | [string](#string) | optional | Phone number of the producer. If provided, must be a valid phone number format. |
| street | [string](#string) | optional | Street address of the producer. If provided, must be non-empty. |
| address_line_2 | [string](#string) | optional | Second line of the address (apartment, suite, unit, etc.). If provided, must be non-empty. |
| city | [string](#string) | optional | City of the producer. If provided, must be non-empty. |
| state | [string](#string) | optional | State of the producer. If provided, must be a valid 2-letter US state code. |
| zip | [string](#string) | optional | ZIP code of the producer&#39;s address. If provided, must be at least 5 characters. |
| external_metadata | [UpdateProducerRequest.Producer.ExternalMetadataEntry](#producerflow-producer-v1-UpdateProducerRequest-Producer-ExternalMetadataEntry) | repeated | ExternalMetadata contains additional custom information that the tenant stores in ProducerFlow&#39;s data model. This field allows tenants to attach arbitrary key-value pairs to agencies for their own business logic, reporting, or integration needs. This field is populated programmatically via API calls by the tenant&#39;s systems. Common use cases include: - Storing references to external system states or categories - Adding custom tags or classifications - Maintaining tenant-specific business attributes - Storing computed values or derived data The map key is the metadata field name, and the value is the associated data.

Update behavior: - If not provided (null): existing metadata is preserved unchanged - If provided as empty map {}: existing metadata is cleared - If provided with values: existing metadata is completely replaced with the new values |






<a name="producerflow-producer-v1-UpdateProducerRequest-Producer-ExternalMetadataEntry"></a>

### UpdateProducerRequest.Producer.ExternalMetadataEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [string](#string) |  |  |






<a name="producerflow-producer-v1-UpdateProducerResponse"></a>

### UpdateProducerResponse
UpdateProducerResponse is the empty response returned after successfully updating a producer.






<a name="producerflow-producer-v1-ValidateAgencyNPNRequest"></a>

### ValidateAgencyNPNRequest
ValidateAgencyNPNRequest is used to validate an agency&#39;s National Producer Number.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| npn | [string](#string) |  | The National Producer Number (NPN) to validate. Required and must be non-empty. |






<a name="producerflow-producer-v1-ValidateAgencyNPNResponse"></a>

### ValidateAgencyNPNResponse
ValidateAgencyNPNResponse contains the result of validating an agency&#39;s NPN.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| valid | [bool](#bool) |  | Indicates whether the NPN is valid. True if the NPN exists and is valid, false otherwise. |






<a name="producerflow-producer-v1-ValidateProducerNPNRequest"></a>

### ValidateProducerNPNRequest
ValidateProducerNPNRequest is used to validate a producer&#39;s National Producer Number.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| npn | [string](#string) |  | The National Producer Number (NPN) to validate. Required and must be non-empty. |
| name | [string](#string) | optional | Optional name of the producer to validate. If provided, the NPN will be validated against this name. |






<a name="producerflow-producer-v1-ValidateProducerNPNResponse"></a>

### ValidateProducerNPNResponse
ValidateProducerNPNResponse contains the result of validating a producer&#39;s NPN.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| valid | [bool](#bool) |  | Indicates whether the NPN is valid. True if the NPN exists and is valid, false otherwise. |





 


<a name="producerflow-producer-v1-Agency-BankAccount-AccountType"></a>

### Agency.BankAccount.AccountType
The type of account.

| Name | Number | Description |
| ---- | ------ | ----------- |
| ACCOUNT_TYPE_UNSPECIFIED | 0 | Default unspecified value. Avoid using this. |
| ACCOUNT_TYPE_CHECKING | 1 | Standard checking account. |
| ACCOUNT_TYPE_SAVINGS | 2 | Savings account. |



<a name="producerflow-producer-v1-Agency-NIPR-License-LicenseStatus"></a>

### Agency.NIPR.License.LicenseStatus
LicenseStatus defines the possible statuses of an insurance license.

| Name | Number | Description |
| ---- | ------ | ----------- |
| LICENSE_STATUS_UNSPECIFIED | 0 | Default unspecified value. Avoid using this. |
| LICENSE_STATUS_EXPIRED | 1 | The license has expired and is no longer valid. |
| LICENSE_STATUS_VALID | 2 | License is currently active. |
| LICENSE_STATUS_NOT_ACTIVE | 3 | The license exists but is not in an active state. This could be due to suspension, revocation, or other reasons. |



<a name="producerflow-producer-v1-AgencyType"></a>

### AgencyType
AgencyType defines whether an agency is internal (tenant agency) or external.

| Name | Number | Description |
| ---- | ------ | ----------- |
| AGENCY_TYPE_UNSPECIFIED | 0 | Default unspecified value. Do not use. |
| AGENCY_TYPE_INTERNAL | 1 | Internal agencies are the agencies that are tenant agencies. |
| AGENCY_TYPE_EXTERNAL | 2 | External agencies are the agencies that are not tenant agencies. |



<a name="producerflow-producer-v1-EntityType"></a>

### EntityType
EntityType defines the business entity type for an agency.

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENTITY_TYPE_UNSPECIFIED | 0 | Default unspecified value. Do not use. |
| ENTITY_TYPE_SOLE_PROPRIETOR | 1 | An individual producer operating as their own agency. For this type, an agency NPN is not allowed, and additional producers are not supported. |
| ENTITY_TYPE_AGENCY | 2 | A standard insurance agency that can have multiple producers. For this type, either NPN or FEIN is required. |
| ENTITY_TYPE_ASK_DURING_ONBOARDING | 3 | Ask during onboarding because the entity type is not known when the agency onboarding url is created. The UI will ask the user to select the entity type. |



<a name="producerflow-producer-v1-NIPRSyncState"></a>

### NIPRSyncState
NIPRSyncState defines the synchronization state with the NIPR system.

| Name | Number | Description |
| ---- | ------ | ----------- |
| NIPR_SYNC_STATE_UNSPECIFIED | 0 | Default unspecified value. Do not use. |
| NIPR_SYNC_STATE_ACTIVE | 1 | Synchronization is active and working properly. |
| NIPR_SYNC_STATE_FAILING | 2 | Synchronization is failing due to errors. |
| NIPR_SYNC_STATE_PENDING | 3 | Synchronization is pending and has not started yet. |
| NIPR_SYNC_STATE_DISABLED | 4 | Synchronization has been disabled. |



<a name="producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount-AccountType"></a>

### NewAgencyRequest.Agency.BankAccount.AccountType


| Name | Number | Description |
| ---- | ------ | ----------- |
| ACCOUNT_TYPE_UNSPECIFIED | 0 | Default unspecified value. Avoid using this. |
| ACCOUNT_TYPE_CHECKING | 1 | Standard checking account |
| ACCOUNT_TYPE_SAVINGS | 2 | Savings account |



<a name="producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact-CommunicationRole"></a>

### NewAgencyRequest.Agency.PointOfContact.CommunicationRole


| Name | Number | Description |
| ---- | ------ | ----------- |
| COMMUNICATION_ROLE_UNSPECIFIED | 0 | Default unspecified value. Avoid using this. |
| COMMUNICATION_ROLE_ACCOUNTING | 1 | Accounting role |
| COMMUNICATION_ROLE_LICENSING | 2 | Licensing role |
| COMMUNICATION_ROLE_REPORTING | 3 | Reporting role |
| COMMUNICATION_ROLE_SALES | 4 | Sales role |
| COMMUNICATION_ROLE_CUSTOMER_SERVICE | 5 | Customer service role |
| COMMUNICATION_ROLE_ALL | 6 | All roles |



<a name="producerflow-producer-v1-Producer-NIPR-License-LicenseStatus"></a>

### Producer.NIPR.License.LicenseStatus
LicenseStatus defines the possible statuses of an insurance license.

| Name | Number | Description |
| ---- | ------ | ----------- |
| LICENSE_STATUS_UNSPECIFIED | 0 | Default unspecified value. Avoid using this. |
| LICENSE_STATUS_EXPIRED | 1 | The license has expired and is no longer valid. |
| LICENSE_STATUS_VALID | 2 | License is currently active. |
| LICENSE_STATUS_NOT_ACTIVE | 3 | The license exists but is not in an active state. This could be due to suspension, revocation, or other reasons. |


 

 


<a name="producerflow-producer-v1-ProducerService"></a>

### ProducerService
ProducerService provides a comprehensive API for managing insurance producers
and agencies, including onboarding, data synchronization, and integration with
external systems like NIPR for license verification.

Available endpoints:
  UAT (User Acceptance Testing): https://api.uat.producerflow.com
  Production: https://api.producerflow.com

RPCs for starting the onboarding agency process.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateAgencyOnboardingURL | [CreateAgencyOnboardingURLRequest](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest) | [CreateAgencyOnboardingURLResponse](#producerflow-producer-v1-CreateAgencyOnboardingURLResponse) | CreateAgencyOnboardingURL generates a URL that can be used to onboard a new agency. The URL contains encoded information about the agency defaults and tenant context. All fields in the request are optional - you can provide as much or as little information as available. Any missing information will be collected during the onboarding process. Returns a URL string that can be shared with the agency for self-onboarding. |
| CreateProducerOnboardingURL | [CreateProducerOnboardingURLRequest](#producerflow-producer-v1-CreateProducerOnboardingURLRequest) | [CreateProducerOnboardingURLResponse](#producerflow-producer-v1-CreateProducerOnboardingURLResponse) | CreateProducerOnboardingURL generates a secure, time-limited link for onboarding a new producer with optional pre-filled NPN. The URL can be shared directly with the producer. The generated URL will take the producer through the onboarding flow with the NPN field pre-populated if provided, reducing friction in the onboarding process. |
| NewAgency | [NewAgencyRequest](#producerflow-producer-v1-NewAgencyRequest) | [NewAgencyResponse](#producerflow-producer-v1-NewAgencyResponse) | NewAgency creates a new agency, optionally with associated producers. It performs the following validation checks: Ensures all required fields are present and valid. Checks whether the NPN is already registered. Verifies agency and principal information with NIPR. Business rules: Sole proprietors can&#39;t have an agency NPN or additional producers. Regular agencies must provide either an NPN or a FEIN. If validation passes, it creates the agency, principal, and any producers. Returns the IDs of the created agency, principal, and producers. |
| ListAgencies | [ListAgenciesRequest](#producerflow-producer-v1-ListAgenciesRequest) | [ListAgenciesResponse](#producerflow-producer-v1-ListAgenciesResponse) | ListAgencies returns a list of agencies associated with the tenant. Supports optional filtering by organization ID and search queries. |
| ListOrganizations | [ListOrganizationsRequest](#producerflow-producer-v1-ListOrganizationsRequest) | [ListOrganizationsResponse](#producerflow-producer-v1-ListOrganizationsResponse) | ListOrganizations returns a list of organizations associated with the tenant. Organizations represent logical groupings or hierarchical structures within a tenant that can be used to organize agencies and producers. |
| GetOrganization | [GetOrganizationRequest](#producerflow-producer-v1-GetOrganizationRequest) | [GetOrganizationResponse](#producerflow-producer-v1-GetOrganizationResponse) | GetOrganization retrieves details of a specific organization by ID. Returns the organization&#39;s information including name and external ID. |
| NewProducer | [NewProducerRequest](#producerflow-producer-v1-NewProducerRequest) | [NewProducerResponse](#producerflow-producer-v1-NewProducerResponse) | NewProducer creates a new producer and associates them with an existing agency. It validates the producer&#39;s information and checks that the email is unique. Returns the ID of the created producer. |
| NewProducers | [NewProducersRequest](#producerflow-producer-v1-NewProducersRequest) | [NewProducersResponse](#producerflow-producer-v1-NewProducersResponse) | NewProducers creates multiple producers and associates them with the specified agency. It performs the same validations as NewProducer for each entry. Returns the IDs of all created producers. |
| GetAgencyAndProducers | [GetAgencyAndProducersRequest](#producerflow-producer-v1-GetAgencyAndProducersRequest) | [GetAgencyAndProducersResponse](#producerflow-producer-v1-GetAgencyAndProducersResponse) | GetAgencyAndProducers retrieves details for an agency and all associated producers. Returns the agency information and a list of producers. |
| GetProducer | [GetProducerRequest](#producerflow-producer-v1-GetProducerRequest) | [GetProducerResponse](#producerflow-producer-v1-GetProducerResponse) | GetProducer retrieves detailed information about a specific producer. The producer can be found by ID, NPN, or email. Returns the producer&#39;s information, including NIPR data and agency association. |
| GetAgencyFiles | [GetAgencyFilesRequest](#producerflow-producer-v1-GetAgencyFilesRequest) | [GetAgencyFilesResponse](#producerflow-producer-v1-GetAgencyFilesResponse) | GetAgencyFiles returns URLs for accessing files associated with an agency, such as contracts. |
| UpdateProducer | [UpdateProducerRequest](#producerflow-producer-v1-UpdateProducerRequest) | [UpdateProducerResponse](#producerflow-producer-v1-UpdateProducerResponse) | UpdateProducer updates information for an existing producer. Supports updating contact details, background check responses, employment history, and non-uniform licensing questions. Information from NIPR and other third-party sources cannot be updated. Validates email uniqueness if the email is changed. |
| UpdateAgency | [UpdateAgencyRequest](#producerflow-producer-v1-UpdateAgencyRequest) | [UpdateAgencyResponse](#producerflow-producer-v1-UpdateAgencyResponse) | UpdateAgency updates information for an existing agency. Supports updating contact details (email, phone, fax), website, physical address, requested appointments, and notes. Information from NIPR and other third-party sources cannot be updated. All fields are optional - only provide the fields you want to update. Validates email uniqueness if the email is changed. |
| NewContact | [NewContactRequest](#producerflow-producer-v1-NewContactRequest) | [NewContactResponse](#producerflow-producer-v1-NewContactResponse) | NewContact creates a new contact associated with an agency. Contacts represent non-producer individuals linked to the agency. Returns the ID of the created contact. |
| NewContacts | [NewContactsRequest](#producerflow-producer-v1-NewContactsRequest) | [NewContactsResponse](#producerflow-producer-v1-NewContactsResponse) | NewContacts creates multiple contacts in a single request. Each contact is associated with the specified agency. Returns the IDs of all created contacts. |
| ListAgencyContacts | [ListAgencyContactsRequest](#producerflow-producer-v1-ListAgencyContactsRequest) | [ListAgencyContactsResponse](#producerflow-producer-v1-ListAgencyContactsResponse) | ListAgencyContacts retrieves all contacts associated with an agency. Returns a list of contacts with their full details. |
| SetExternalID | [SetExternalIDRequest](#producerflow-producer-v1-SetExternalIDRequest) | [SetExternalIDResponse](#producerflow-producer-v1-SetExternalIDResponse) | SetExternalID sets an external identifier for a producer or contact. Useful for integrating with external systems that use different ID schemes. |
| ValidateProducerNPN | [ValidateProducerNPNRequest](#producerflow-producer-v1-ValidateProducerNPNRequest) | [ValidateProducerNPNResponse](#producerflow-producer-v1-ValidateProducerNPNResponse) | ValidateProducerNPN checks whether a producer’s National Producer Number (NPN) is valid. It performs a lookup against NIPR and applies internal validation rules. Returns a validity flag and any associated error messages. |
| ValidateAgencyNPN | [ValidateAgencyNPNRequest](#producerflow-producer-v1-ValidateAgencyNPNRequest) | [ValidateAgencyNPNResponse](#producerflow-producer-v1-ValidateAgencyNPNResponse) | ValidateAgencyNPN checks whether an agency’s National Producer Number (NPN) is valid. It performs a lookup against NIPR and applies internal validation rules. Returns a validity flag and any associated error messages. |
| LookupNPNByFEIN | [LookupNPNByFEINRequest](#producerflow-producer-v1-LookupNPNByFEINRequest) | [LookupNPNByFEINResponse](#producerflow-producer-v1-LookupNPNByFEINResponse) | LookupNPNByFEIN finds an NPN using a Federal Employer Identification Number. Used to help agencies that know their FEIN but not their NPN. Returns the NPN if found or an error message. |
| ResyncProducer | [ResyncProducerRequest](#producerflow-producer-v1-ResyncProducerRequest) | [ResyncProducerResponse](#producerflow-producer-v1-ResyncProducerResponse) | ResyncProducer triggers a manual resynchronization of a producer&#39;s data. This can be used to refresh data after external changes. WARNING: This call counts as an additional NPN lookup for billing purposes. Most billing plans are based on unique NPNs per month, so using this method may result in extra charges. |
| ResyncAgency | [ResyncAgencyRequest](#producerflow-producer-v1-ResyncAgencyRequest) | [ResyncAgencyResponse](#producerflow-producer-v1-ResyncAgencyResponse) | ResyncAgency triggers a manual resynchronization of an agency&#39;s data. Similar to ResyncProducer, this can be used to refresh data after external changes. WARNING: This call counts as an additional NPN lookup for billing purposes. Most billing plans are based on unique NPNs per month, so using this method may result in extra charges. |
| SyncProducerWithNIPR | [SyncProducerWithNIPRRequest](#producerflow-producer-v1-SyncProducerWithNIPRRequest) | [SyncProducerWithNIPRResponse](#producerflow-producer-v1-SyncProducerWithNIPRResponse) | SyncProducerWithNIPR synchronizes a producer&#39;s data with the NIPR system. Fetches the latest producer information and appointments. WARNING: This call counts as an extra NPN lookup against your billing. Most billing plans are based on unique NPNs per month, so using this method may result in additional charges. |
| SyncAgencyWithNIPR | [SyncAgencyWithNIPRRequest](#producerflow-producer-v1-SyncAgencyWithNIPRRequest) | [SyncAgencyWithNIPRResponse](#producerflow-producer-v1-SyncAgencyWithNIPRResponse) | SyncAgencyWithNIPR synchronizes an agency&#39;s data with the NIPR system. Fetches the latest agency information and appointments. WARNING: This call counts as an extra NPN lookup against your billing. Most billing plans are based on unique NPNs per month, so using this method may result in additional charges. |
| StopSyncProducerWithNIPR | [StopSyncProducerWithNIPRRequest](#producerflow-producer-v1-StopSyncProducerWithNIPRRequest) | [StopSyncProducerWithNIPRResponse](#producerflow-producer-v1-StopSyncProducerWithNIPRResponse) | StopSyncProducerWithNIPR stops the synchronization process with NIPR for a producer. Use this to prevent further automatic updates from NIPR. |
| StopSyncAgencyWithNIPR | [StopSyncAgencyWithNIPRRequest](#producerflow-producer-v1-StopSyncAgencyWithNIPRRequest) | [StopSyncAgencyWithNIPRResponse](#producerflow-producer-v1-StopSyncAgencyWithNIPRResponse) | StopSyncAgencyWithNIPR stops the synchronization process with NIPR for an agency. Use this to prevent further automatic updates from NIPR. |
| CreateProducerUploadURL | [CreateProducerUploadURLRequest](#producerflow-producer-v1-CreateProducerUploadURLRequest) | [CreateProducerUploadURLResponse](#producerflow-producer-v1-CreateProducerUploadURLResponse) | CreateProducerUploadURL generates a URL that can be used to upload new producers for an existing agency. The agency is identified by its NPN, and the URL can be shared with the agency to allow them to upload producer information securely. The URL is time-limited and includes necessary security tokens. A default expiration of 7 days will be used. The agency must: Exist and belong to the authenticated tenant. Have a valid NPN. Returns a URL string that can be shared with the agency for producer uploads. Returns errors in the following cases: INVALID_ARGUMENT: if agency NPN is empty or invalid format. NOT_FOUND: if agency NPN doesn&#39;t exist. INTERNAL: for other unexpected errors. |
| AddAgencyLocations | [AddAgencyLocationsRequest](#producerflow-producer-v1-AddAgencyLocationsRequest) | [AddAgencyLocationsResponse](#producerflow-producer-v1-AddAgencyLocationsResponse) | AddAgencyLocations adds one or more locations to an existing agency. Each location must have a unique name within the agency and valid address information. You can add up to 100 locations in a single request. This is a bulk operation with all-or-nothing behavior - if any location fails validation, the entire request will fail and no locations will be added. Returns the IDs of successfully added locations. Returns errors in the following cases: UNAUTHENTICATED: if the API key is invalid or missing. INVALID_ARGUMENT: if the request is nil, agency_id is empty, no locations provided, location names are duplicated within the request or already exist for the agency. NOT_FOUND: if the agency doesn&#39;t exist or doesn&#39;t belong to the authenticated tenant. |
| RemoveAgencyLocations | [RemoveAgencyLocationsRequest](#producerflow-producer-v1-RemoveAgencyLocationsRequest) | [RemoveAgencyLocationsResponse](#producerflow-producer-v1-RemoveAgencyLocationsResponse) | RemoveAgencyLocations removes one or more locations from an agency. Locations that don&#39;t exist will be silently ignored. Returns the IDs of successfully removed locations. When a location is removed, all the producers associated with that location will be unassigned from that location. Returns errors in the following cases: UNAUTHENTICATED: if the API key is invalid or missing. INVALID_ARGUMENT: if the request is nil, agency_id is empty, or no location_ids provided. NOT_FOUND: if the agency doesn&#39;t exist or doesn&#39;t belong to the authenticated tenant. |
| ListAgencyLocations | [ListAgencyLocationsRequest](#producerflow-producer-v1-ListAgencyLocationsRequest) | [ListAgencyLocationsResponse](#producerflow-producer-v1-ListAgencyLocationsResponse) | ListAgencyLocations retrieves all locations associated with an agency. Returns errors in the following cases: UNAUTHENTICATED: if the API key is invalid or missing. INVALID_ARGUMENT: if the agency_id is empty. NOT_FOUND: if the agency doesn&#39;t exist. |
| AssignProducerToLocations | [AssignProducerToLocationsRequest](#producerflow-producer-v1-AssignProducerToLocationsRequest) | [AssignProducerToLocationsResponse](#producerflow-producer-v1-AssignProducerToLocationsResponse) | AssignProducerToLocations assigns one or more locations to a producer. The locations must belong to the same agency as the producer. Error cases: UNAUTHENTICATED: Invalid or missing API key. INVALID_ARGUMENT: Empty producer_id or no location_ids. NOT_FOUND: Producer or locations don&#39;t exist. PERMISSION_DENIED: Locations don&#39;t belong to the producer&#39;s agency. |
| UnassignProducerFromLocations | [UnassignProducerFromLocationsRequest](#producerflow-producer-v1-UnassignProducerFromLocationsRequest) | [UnassignProducerFromLocationsResponse](#producerflow-producer-v1-UnassignProducerFromLocationsResponse) | UnassignProducerFromLocations removes one or more location assignments from a producer. The locations must belong to the same agency as the producer. Error cases: UNAUTHENTICATED: Invalid or missing API key. INVALID_ARGUMENT: Empty producer_id or no location_ids. NOT_FOUND: Producer doesn&#39;t exist. |
| UpdateAgencyLocation | [UpdateAgencyLocationRequest](#producerflow-producer-v1-UpdateAgencyLocationRequest) | [UpdateAgencyLocationResponse](#producerflow-producer-v1-UpdateAgencyLocationResponse) | UpdateAgencyLocation updates an existing agency location. You can update the name, address, contact information, and primary status of a location. All fields are optional - only provide the fields you want to update. Location name must be unique within the agency. Returns the updated location details. Error cases: UNAUTHENTICATED: Invalid or missing API key. INVALID_ARGUMENT: Missing agency_id or location_id. NOT_FOUND: Agency or location doesn&#39;t exist. ALREADY_EXISTS: Location name already exists within the agency. |

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

