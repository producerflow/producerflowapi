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
    - [Agency.BankAccount](#producerflow-producer-v1-Agency-BankAccount)
    - [Agency.BusinessHours](#producerflow-producer-v1-Agency-BusinessHours)
    - [Agency.BusinessHours.BusinessHour](#producerflow-producer-v1-Agency-BusinessHours-BusinessHour)
    - [Agency.EOInfo](#producerflow-producer-v1-Agency-EOInfo)
    - [Agency.IvansAccount](#producerflow-producer-v1-Agency-IvansAccount)
    - [Agency.Principal](#producerflow-producer-v1-Agency-Principal)
    - [ApproveProducerRequest](#producerflow-producer-v1-ApproveProducerRequest)
    - [ApproveProducerResponse](#producerflow-producer-v1-ApproveProducerResponse)
    - [AssignProducerToLocationsRequest](#producerflow-producer-v1-AssignProducerToLocationsRequest)
    - [AssignProducerToLocationsResponse](#producerflow-producer-v1-AssignProducerToLocationsResponse)
    - [CreateAgencyOnboardingURLRequest](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest)
    - [CreateAgencyOnboardingURLRequest.Agency](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency)
    - [CreateAgencyOnboardingURLRequest.Agency.Principal](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest-Agency-Principal)
    - [CreateAgencyOnboardingURLResponse](#producerflow-producer-v1-CreateAgencyOnboardingURLResponse)
    - [CreateProducerUploadURLRequest](#producerflow-producer-v1-CreateProducerUploadURLRequest)
    - [CreateProducerUploadURLResponse](#producerflow-producer-v1-CreateProducerUploadURLResponse)
    - [GetAgencyAndProducersRequest](#producerflow-producer-v1-GetAgencyAndProducersRequest)
    - [GetAgencyAndProducersResponse](#producerflow-producer-v1-GetAgencyAndProducersResponse)
    - [GetAgencyFilesRequest](#producerflow-producer-v1-GetAgencyFilesRequest)
    - [GetAgencyFilesResponse](#producerflow-producer-v1-GetAgencyFilesResponse)
    - [GetProducerRequest](#producerflow-producer-v1-GetProducerRequest)
    - [GetProducerRequest.EmailLookup](#producerflow-producer-v1-GetProducerRequest-EmailLookup)
    - [GetProducerRequest.ProducerIDLookup](#producerflow-producer-v1-GetProducerRequest-ProducerIDLookup)
    - [GetProducerRequest.ProducerNPNLookup](#producerflow-producer-v1-GetProducerRequest-ProducerNPNLookup)
    - [GetProducerResponse](#producerflow-producer-v1-GetProducerResponse)
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
    - [NewAgencyRequest.Agency.PointOfContact](#producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact)
    - [NewAgencyRequest.Agency.Principal](#producerflow-producer-v1-NewAgencyRequest-Agency-Principal)
    - [NewAgencyResponse](#producerflow-producer-v1-NewAgencyResponse)
    - [NewContact](#producerflow-producer-v1-NewContact)
    - [NewContact.Address](#producerflow-producer-v1-NewContact-Address)
    - [NewContactRequest](#producerflow-producer-v1-NewContactRequest)
    - [NewContactResponse](#producerflow-producer-v1-NewContactResponse)
    - [NewContactsRequest](#producerflow-producer-v1-NewContactsRequest)
    - [NewContactsResponse](#producerflow-producer-v1-NewContactsResponse)
    - [NewProducer](#producerflow-producer-v1-NewProducer)
    - [NewProducer.Address](#producerflow-producer-v1-NewProducer-Address)
    - [NewProducerRequest](#producerflow-producer-v1-NewProducerRequest)
    - [NewProducerResponse](#producerflow-producer-v1-NewProducerResponse)
    - [NewProducersRequest](#producerflow-producer-v1-NewProducersRequest)
    - [NewProducersResponse](#producerflow-producer-v1-NewProducersResponse)
    - [Organization](#producerflow-producer-v1-Organization)
    - [Producer](#producerflow-producer-v1-Producer)
    - [Producer.Address](#producerflow-producer-v1-Producer-Address)
    - [Producer.Agency](#producerflow-producer-v1-Producer-Agency)
    - [Producer.NIPR](#producerflow-producer-v1-Producer-NIPR)
    - [Producer.NIPR.Appointment](#producerflow-producer-v1-Producer-NIPR-Appointment)
    - [Producer.NIPR.Biographic](#producerflow-producer-v1-Producer-NIPR-Biographic)
    - [Producer.NIPR.License](#producerflow-producer-v1-Producer-NIPR-License)
    - [Producer.NIPR.License.LineOfAuthority](#producerflow-producer-v1-Producer-NIPR-License-LineOfAuthority)
    - [Producer.NIPR.ProducerRegulatoryInfo](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo)
    - [Producer.NIPR.ProducerRegulatoryInfo.RegulatoryAction](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryAction)
    - [Producer.NIPR.ProducerRegulatoryInfo.RegulatoryActionsByStateEntry](#producerflow-producer-v1-Producer-NIPR-ProducerRegulatoryInfo-RegulatoryActionsByStateEntry)
    - [RejectProducerRequest](#producerflow-producer-v1-RejectProducerRequest)
    - [RejectProducerResponse](#producerflow-producer-v1-RejectProducerResponse)
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
    - [UpdateProducerRequest](#producerflow-producer-v1-UpdateProducerRequest)
    - [UpdateProducerRequest.Producer](#producerflow-producer-v1-UpdateProducerRequest-Producer)
    - [UpdateProducerResponse](#producerflow-producer-v1-UpdateProducerResponse)
    - [ValidateAgencyNPNRequest](#producerflow-producer-v1-ValidateAgencyNPNRequest)
    - [ValidateAgencyNPNResponse](#producerflow-producer-v1-ValidateAgencyNPNResponse)
    - [ValidateProducerNPNRequest](#producerflow-producer-v1-ValidateProducerNPNRequest)
    - [ValidateProducerNPNResponse](#producerflow-producer-v1-ValidateProducerNPNResponse)
  
    - [Agency.BankAccount.AccountType](#producerflow-producer-v1-Agency-BankAccount-AccountType)
    - [EntityType](#producerflow-producer-v1-EntityType)
    - [NewAgencyRequest.Agency.BankAccount.AccountType](#producerflow-producer-v1-NewAgencyRequest-Agency-BankAccount-AccountType)
    - [NewAgencyRequest.Agency.PointOfContact.CommunicationRole](#producerflow-producer-v1-NewAgencyRequest-Agency-PointOfContact-CommunicationRole)
    - [Producer.NIPR.License.LicenseStatus](#producerflow-producer-v1-Producer-NIPR-License-LicenseStatus)
    - [ProducerOnboardingState](#producerflow-producer-v1-ProducerOnboardingState)
  
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
| processing_status | [ProcessingStatus](#producerflow-appointment-v1-ProcessingStatus) |  | Processing status of the appointment request. |
| not_eligible_reasons | [string](#string) | repeated | If the appointment was rejected or ineligible, these reasons explain why. |






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
| success | [bool](#bool) |  | Indicates whether the termination request was successfully submitted to NIPR. This does not indicate that the appointment has been terminated, only that the request has been accepted for processing. The actual termination will be processed asynchronously by NIPR, and you will be notified via webhook when the process completes. |





 


<a name="producerflow-appointment-v1-AppointmentType"></a>

### AppointmentType
Type of appointment.

| Name | Number | Description |
| ---- | ------ | ----------- |
| APPOINTMENT_TYPE_UNSPECIFIED | 0 |  |
| APPOINTMENT_TYPE_REGISTRY | 1 |  |
| APPOINTMENT_TYPE_UP_FRONT | 2 |  |
| APPOINTMENT_TYPE_JUST_IN_TIME | 3 |  |



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
TerminationReason represents the reason for the termination of an appointment.
These reasons correspond to NIPR&#39;s valid termination codes and vary by state.
Use ListTerminationReasons to get the valid reasons for a specific state
before terminating an appointment.

Reference: https://pdb.nipr.com/Gateway/ValidTerms

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
AppointmentService manages license appointments through NIPR.

The appointment flow in NIPR is as follows:
1. A new appointment (or termination) is requested for a license number.
2. Some time later, NIPR processes the request and returns the final result.

Since NIPR does not return results immediately, RequestAppointment and TerminateAppointment
RPCs will return a processing status of IN_PROGRESS if the request is accepted by NIPR.
When the appointment is finally processed by NIPR, ProducerFlow will notify via a webhook of
the final result. Also, any call from this point on to ListAppointments or GetAppointment will
also return the final result.

Any call to this service must be authenticated using an API key in the request headers. The API key
can be found in the ProducerFlow API key section of the ProducerFlow UI and it identifies the tenant
that is making the request.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GetAppointment | [GetAppointmentRequest](#producerflow-appointment-v1-GetAppointmentRequest) | [GetAppointmentResponse](#producerflow-appointment-v1-GetAppointmentResponse) | Retrieves the details of an appointment by its ID. |
| GetAppointmentFees | [GetAppointmentFeesRequest](#producerflow-appointment-v1-GetAppointmentFeesRequest) | [GetAppointmentFeesResponse](#producerflow-appointment-v1-GetAppointmentFeesResponse) | Retrieves the total fees associated with requesting an appointment for the given license. Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034. |
| GetAppointableCarriers | [GetAppointableCarriersRequest](#producerflow-appointment-v1-GetAppointableCarriersRequest) | [GetAppointableCarriersResponse](#producerflow-appointment-v1-GetAppointableCarriersResponse) | Retrieves the carriers that are available to appoint licenses for the tenant. |
| GetTerminationFees | [GetTerminationFeesRequest](#producerflow-appointment-v1-GetTerminationFeesRequest) | [GetTerminationFeesResponse](#producerflow-appointment-v1-GetTerminationFeesResponse) | Retrieves the total fees associated with terminating an appointment for the given license. Fee amounts are represented as integer values in cents. E.g. $10.34 is sent as 1034. |
| ListAppointments | [ListAppointmentsRequest](#producerflow-appointment-v1-ListAppointmentsRequest) | [ListAppointmentsResponse](#producerflow-appointment-v1-ListAppointmentsResponse) | Lists appointments for the tenant, optionally filtered by processing status. |
| ListEligibleLicenses | [ListEligibleLicensesRequest](#producerflow-appointment-v1-ListEligibleLicensesRequest) | [ListEligibleLicensesResponse](#producerflow-appointment-v1-ListEligibleLicensesResponse) | Returns a list of licenses that are eligible to be appointed. |
| RequestAppointment | [RequestAppointmentRequest](#producerflow-appointment-v1-RequestAppointmentRequest) | [RequestAppointmentResponse](#producerflow-appointment-v1-RequestAppointmentResponse) | Requests a new appointment for a license that is eligible to be appointed. The simpler way to do this is to call ListEligibleLicenses to get a list of licenses that are eligible to be appointed. Then, call RequestAppointment for the licenses in the list that you want to appoint.

If the request is accepted by NIPR, the appointment will have IN_PROGRESS processing status. If rejected, it will have REJECTED status and reasons will be provided in not_eligible_reasons. |
| TerminateAppointment | [TerminateAppointmentRequest](#producerflow-appointment-v1-TerminateAppointmentRequest) | [TerminateAppointmentResponse](#producerflow-appointment-v1-TerminateAppointmentResponse) | Terminates an existing appointment, permanently ending the relationship between the license holder and the carrier.

Before calling this method, you must: 1. Ensure the appointment exists and is in APPOINTED status 2. Call ListTerminationReasons to get valid termination reasons for the license&#39;s state 3. Select an appropriate termination reason from the state-specific list

The termination process works as follows: - The request is submitted to NIPR for processing - Once NIPR completes processing, the status becomes TERMINATED - If rejected by NIPR, the appointment remains in its current status

Important considerations: - Termination is permanent and cannot be undone - Termination reasons must be valid for the specific state where the license is issued - Some terminations may incur fees (check GetTerminationFees first) - You will receive webhook notifications when the termination is processed by NIPR

The response indicates whether the termination request was successfully submitted, not whether the actual termination was completed (since NIPR processes asynchronously). |
| ListTerminationReasons | [ListTerminationReasonsRequest](#producerflow-appointment-v1-ListTerminationReasonsRequest) | [ListTerminationReasonsResponse](#producerflow-appointment-v1-ListTerminationReasonsResponse) | Lists the valid termination reasons for appointments in a specific state.

When terminating an appointment, you must provide a valid termination reason that is accepted by NIPR for the state where the license is issued. Termination reasons vary by state, so you should call this method first to retrieve the list of valid reasons before calling TerminateAppointment.

The termination reasons returned are based on NIPR&#39;s valid termination codes for the specified state. Each reason corresponds to a specific business scenario for why an appointment might be terminated (e.g., voluntary termination, inadequate production, company merger, etc.). |

 



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






<a name="producerflow-producer-v1-ApproveProducerRequest"></a>

### ApproveProducerRequest
ApproveProducerRequest requests approval for a producer in the onboarding process.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to approve. Must be a valid UUID format. |






<a name="producerflow-producer-v1-ApproveProducerResponse"></a>

### ApproveProducerResponse
ApproveProducerResponse is the empty response returned after successfully approving a producer.






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






<a name="producerflow-producer-v1-CreateAgencyOnboardingURLRequest"></a>

### CreateAgencyOnboardingURLRequest
CreateAgencyOnboardingURLRequest contains information needed to generate
an agency onboarding URL. This includes basic agency information and defaults.

All fields in this request are optional. You can provide as much or as little
information as you have available. Any missing information will be collected
from the user during the onboarding process through the generated URL.


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
| tenant_id | [string](#string) |  | Tenant ID of the principal |
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






<a name="producerflow-producer-v1-ListOrganizationsResponse"></a>

### ListOrganizationsResponse
ListOrganizationsResponse contains the list of organizations associated with the tenant.
The organizations are returned in no particular order. If the tenant has no organizations,
the organizations list will be empty.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| organizations | [Organization](#producerflow-producer-v1-Organization) | repeated | List of organizations associated with the tenant. Each organization includes its unique identifier and display name. The list may be empty if no organizations are associated with the tenant. |






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
| created_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Timestamp when the location was created. |
| updated_at | [google.protobuf.Timestamp](#google-protobuf-Timestamp) |  | Timestamp when the location was last updated. |






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
| auto_approve | [bool](#bool) |  | **Deprecated.** Determines if the agency should be auto approved. |






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
| tenant_id | [string](#string) |  |  |






<a name="producerflow-producer-v1-NewAgencyResponse"></a>

### NewAgencyResponse
NewAgencyResponse contains the IDs of created resources after a successful agency creation


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Unique identifier for the created agency |
| producer_ids | [string](#string) | repeated | List of unique identifiers for any producers created with the agency |
| principal_id | [string](#string) |  | Unique identifier for the principal producer |






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
| address | [NewContact.Address](#producerflow-producer-v1-NewContact-Address) |  | Mailing address of the contact. |
| role | [string](#string) |  | Role or position of the contact within the agency. Required and must be non-empty. |
| tenant_id | [string](#string) |  | External tenant identifier for the contact. Used for integration with external systems. |
| npn | [string](#string) | optional | National Producer Number (NPN) of the contact. |






<a name="producerflow-producer-v1-NewContact-Address"></a>

### NewContact.Address
Address represents a mailing address for the contact.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street address of the contact. Required and must be non-empty. |
| city | [string](#string) |  | City of the contact. Required and must be non-empty. |
| state | [string](#string) |  | State of the contact&#39;s address. Required and must be exactly 2 characters (state code). |
| zip | [string](#string) |  | Zip code of the contact&#39;s address. Required and must be between 1 and 10 characters. |






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
| npn | [string](#string) |  | National Producer Number (NPN) of the producer. Optional, but recommended for license verification. |
| phone | [string](#string) |  | Phone number of the producer. Optional if default value, but if provided must match the pattern of a valid phone number. |
| mailing_address | [NewProducer.Address](#producerflow-producer-v1-NewProducer-Address) |  | Mailing address of the producer. This is where correspondence will be sent. |
| tenant_id | [string](#string) |  | External tenant identifier for the producer. Used for integration with external systems. |
| auto_approve | [bool](#bool) |  | **Deprecated.** Indicates whether the producer should be automatically approved. This field is deprecated and should not be used in new code. |






<a name="producerflow-producer-v1-NewProducer-Address"></a>

### NewProducer.Address
Address represents a mailing address for the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street address of the producer. Required and must be non-empty. |
| city | [string](#string) |  | City of the producer. Required and must be non-empty. |
| state | [string](#string) |  | State of the producer. Required and must be a 2-letter state code. |
| zip | [string](#string) |  | Zip code of the producer. Required and must be between 1 and 10 characters. |






<a name="producerflow-producer-v1-NewProducerRequest"></a>

### NewProducerRequest
NewProducerRequest is used to create a new producer and associate it with an agency.
This will trigger a call to the NIPR API to retrieve license information of the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | The UUID of the agency to associate the producer with. Must be a valid UUID format. |
| producer | [NewProducer](#producerflow-producer-v1-NewProducer) |  | Information about the producer to create. This field is required. |






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






<a name="producerflow-producer-v1-Producer"></a>

### Producer
Producer represents a producer that has been onboarded.

Internal ID of the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  |  |
| name | [string](#string) |  | **Deprecated.** The full name of the producer. This field is deprecated. Use first_name and last_name instead. |
| first_name | [string](#string) |  | First name of the producer. |
| middle_name | [string](#string) |  | Middle name of the producer. |
| last_name | [string](#string) |  | Last name of the producer. |
| email | [string](#string) |  | The email address of the producer. Used for communication and must be unique within the tenant. Must be a valid email format. |
| npn | [string](#string) |  | The National Producer Number (NPN) of the producer. This is used to retrieve license information from the NIPR API. Must be non-empty. |
| phone | [string](#string) |  | Phone number of the producer. |
| pdb_alerts_sync_enabled | [bool](#bool) |  | Indicates whether the producer is enabled to be synchronized with NIPR API. When true, the system will regularly check for updates from NIPR. |
| agency | [Producer.Agency](#producerflow-producer-v1-Producer-Agency) |  | Basic information about the agency this producer is associated with. |
| nipr | [Producer.NIPR](#producerflow-producer-v1-Producer-NIPR) |  | Data synchronized from the NIPR service. Contains license information, biographic data, regulatory actions, and carrier appointments. |
| onboarding_status | [ProducerOnboardingState](#producerflow-producer-v1-ProducerOnboardingState) |  | **Deprecated.** The status of the producer onboarding process. This field is deprecated and should not be used in new code. |
| is_principal | [bool](#bool) |  | Indicates whether this producer is the principal of an agency. A principal producer has additional responsibilities and permissions. |
| requested_appointments | [string](#string) | repeated | The list of requested appointments for the producer. |
| address | [Producer.Address](#producerflow-producer-v1-Producer-Address) |  | Address of the producer. |
| locations | [Location](#producerflow-producer-v1-Location) | repeated | Locations assigned to this producer. |






<a name="producerflow-producer-v1-Producer-Address"></a>

### Producer.Address
Address represents a mailing address for the producer.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| street | [string](#string) |  | Street address of the producer. |
| city | [string](#string) |  | City of the producer. |
| state | [string](#string) |  | State of the producer. |
| zip | [string](#string) |  | Zip code of the producer. |






<a name="producerflow-producer-v1-Producer-Agency"></a>

### Producer.Agency
Agency contains basic information about the agency this producer is associated with.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| agency_id | [string](#string) |  | Unique identifier for the associated agency. |
| name | [string](#string) |  | Name of the associated agency. |






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






<a name="producerflow-producer-v1-RejectProducerRequest"></a>

### RejectProducerRequest
RejectProducerRequest requests rejection of a producer in the onboarding process.


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| producer_id | [string](#string) |  | The UUID of the producer to reject. Must be a valid UUID format. |
| reason | [string](#string) |  | The reason for rejecting the producer. Must be non-empty to provide context for the rejection. |






<a name="producerflow-producer-v1-RejectProducerResponse"></a>

### RejectProducerResponse
RejectProducerResponse is the empty response returned after successfully rejecting a producer.






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
| tenant_id | [string](#string) |  | The external tenant identifier to associate with the entity. Required and must be non-empty. |






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
| npn | [string](#string) | optional | National Producer Number (NPN) of the producer. If provided, must be non-empty. |
| phone | [string](#string) | optional | Phone number of the producer. If provided, must be a valid phone number format. |
| street | [string](#string) | optional | Street address of the producer. If provided, must be non-empty. |
| city | [string](#string) | optional | City of the producer. If provided, must be non-empty. |
| state | [string](#string) | optional | State of the producer. If provided, must be non-empty. |
| zip | [string](#string) | optional | ZIP code of the producer&#39;s address. If provided, must be at least 5 characters. |






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



<a name="producerflow-producer-v1-EntityType"></a>

### EntityType
EntityType defines the business entity type for an agency.

| Name | Number | Description |
| ---- | ------ | ----------- |
| ENTITY_TYPE_UNSPECIFIED | 0 | Default unspecified value. Do not use. |
| ENTITY_TYPE_SOLE_PROPRIETOR | 1 | An individual producer operating as their own agency. For this type, an agency NPN is not allowed, and additional producers are not supported. |
| ENTITY_TYPE_AGENCY | 2 | A standard insurance agency that can have multiple producers. For this type, either NPN or FEIN is required. |
| ENTITY_TYPE_ASK_DURING_ONBOARDING | 3 | Ask during onboarding because the entity type is not known when the agency onboarding url is created. The UI will ask the user to select the entity type. |



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



<a name="producerflow-producer-v1-ProducerOnboardingState"></a>

### ProducerOnboardingState
ProducerOnboardingState defines the possible states in the producer onboarding workflow.
This enum is deprecated and should not be used in new code.

| Name | Number | Description |
| ---- | ------ | ----------- |
| PRODUCER_ONBOARDING_STATE_UNSPECIFIED | 0 |  |
| PRODUCER_ONBOARDING_STATE_NEW | 1 | The producer has been added to the agency and is awaiting approval from the tenant. |
| PRODUCER_ONBOARDING_STATE_APPROVED_BY_TENANT | 2 | The producer has been approved by the tenant. |
| PRODUCER_ONBOARDING_STATE_REJECTED_BY_TENANT | 3 | The producer has been rejected by the tenant. |


 

 


<a name="producerflow-producer-v1-ProducerService"></a>

### ProducerService
ProducerService provides a comprehensive API for managing insurance producers
and agencies, including onboarding, data synchronization, and integration with
external systems like NIPR for license verification.

RPCs for starting the onboarding agency process.

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| CreateAgencyOnboardingURL | [CreateAgencyOnboardingURLRequest](#producerflow-producer-v1-CreateAgencyOnboardingURLRequest) | [CreateAgencyOnboardingURLResponse](#producerflow-producer-v1-CreateAgencyOnboardingURLResponse) | CreateAgencyOnboardingURL generates a URL that can be used to onboard a new agency. The URL contains encoded information about the agency defaults and tenant context. All fields in the request are optional - you can provide as much or as little information as available. Any missing information will be collected during the onboarding process. Returns a URL string that can be shared with the agency for self-onboarding. |
| NewAgency | [NewAgencyRequest](#producerflow-producer-v1-NewAgencyRequest) | [NewAgencyResponse](#producerflow-producer-v1-NewAgencyResponse) | NewAgency creates a new agency, optionally with associated producers. It performs the following validation checks: - Ensures all required fields are present and valid - Checks whether the NPN is already registered - Verifies agency and principal information with NIPR

Business rules: - Sole proprietors can&#39;t have an agency NPN or additional producers - Regular agencies must provide either an NPN or a FEIN

If validation passes, it creates the agency, principal, and any producers. Returns the IDs of the created agency, principal, and producers. |
| ListOrganizations | [ListOrganizationsRequest](#producerflow-producer-v1-ListOrganizationsRequest) | [ListOrganizationsResponse](#producerflow-producer-v1-ListOrganizationsResponse) | ListOrganizations returns a list of organizations associated with the tenant. Organizations represent logical groupings or hierarchical structures within a tenant that can be used to organize agencies and producers. |
| NewProducer | [NewProducerRequest](#producerflow-producer-v1-NewProducerRequest) | [NewProducerResponse](#producerflow-producer-v1-NewProducerResponse) | NewProducer creates a new producer and associates them with an existing agency. It validates the producer&#39;s information and checks that the email is unique. Returns the ID of the created producer. |
| NewProducers | [NewProducersRequest](#producerflow-producer-v1-NewProducersRequest) | [NewProducersResponse](#producerflow-producer-v1-NewProducersResponse) | NewProducers creates multiple producers and associates them with the specified agency. It performs the same validations as NewProducer for each entry. Returns the IDs of all created producers. |
| GetAgencyAndProducers | [GetAgencyAndProducersRequest](#producerflow-producer-v1-GetAgencyAndProducersRequest) | [GetAgencyAndProducersResponse](#producerflow-producer-v1-GetAgencyAndProducersResponse) | GetAgencyAndProducers retrieves details for an agency and all associated producers. Returns the agency information and a list of producers. |
| GetProducer | [GetProducerRequest](#producerflow-producer-v1-GetProducerRequest) | [GetProducerResponse](#producerflow-producer-v1-GetProducerResponse) | GetProducer retrieves detailed information about a specific producer. The producer can be found by ID, NPN, or email. Returns the producer&#39;s information, including NIPR data and agency association. |
| GetAgencyFiles | [GetAgencyFilesRequest](#producerflow-producer-v1-GetAgencyFilesRequest) | [GetAgencyFilesResponse](#producerflow-producer-v1-GetAgencyFilesResponse) | GetAgencyFiles returns URLs for accessing files associated with an agency, such as contracts. |
| UpdateProducer | [UpdateProducerRequest](#producerflow-producer-v1-UpdateProducerRequest) | [UpdateProducerResponse](#producerflow-producer-v1-UpdateProducerResponse) | UpdateProducer updates information for an existing producer. Supports updating contact details, background check responses, employment history, and non-uniform licensing questions. Information from NIPR and other third-party sources cannot be updated. Validates email uniqueness if the email is changed. |
| ApproveProducer | [ApproveProducerRequest](#producerflow-producer-v1-ApproveProducerRequest) | [ApproveProducerResponse](#producerflow-producer-v1-ApproveProducerResponse) | ApproveProducer changes a producer&#39;s onboarding state to APPROVED. This typically happens after all verification steps are complete. This method is deprecated. Use SyncProducerWithNIPR instead. |
| RejectProducer | [RejectProducerRequest](#producerflow-producer-v1-RejectProducerRequest) | [RejectProducerResponse](#producerflow-producer-v1-RejectProducerResponse) | RejectProducer changes a producer&#39;s onboarding state to REJECTED. An optional reason for rejection can be provided. This method is deprecated. Use StopSyncAgencyWithNIPR instead. |
| NewContact | [NewContactRequest](#producerflow-producer-v1-NewContactRequest) | [NewContactResponse](#producerflow-producer-v1-NewContactResponse) | NewContact creates a new contact associated with an agency. Contacts represent non-producer individuals linked to the agency. Returns the ID of the created contact. |
| NewContacts | [NewContactsRequest](#producerflow-producer-v1-NewContactsRequest) | [NewContactsResponse](#producerflow-producer-v1-NewContactsResponse) | NewContacts creates multiple contacts in a single request. Each contact is associated with the specified agency. Returns the IDs of all created contacts. |
| SetExternalID | [SetExternalIDRequest](#producerflow-producer-v1-SetExternalIDRequest) | [SetExternalIDResponse](#producerflow-producer-v1-SetExternalIDResponse) | SetExternalID sets an external identifier for a producer or contact. Useful for integrating with external systems that use different ID schemes. |
| ValidateProducerNPN | [ValidateProducerNPNRequest](#producerflow-producer-v1-ValidateProducerNPNRequest) | [ValidateProducerNPNResponse](#producerflow-producer-v1-ValidateProducerNPNResponse) | ValidateProducerNPN checks whether a producer’s National Producer Number (NPN) is valid. It performs a lookup against NIPR and applies internal validation rules. Returns a validity flag and any associated error messages. |
| ValidateAgencyNPN | [ValidateAgencyNPNRequest](#producerflow-producer-v1-ValidateAgencyNPNRequest) | [ValidateAgencyNPNResponse](#producerflow-producer-v1-ValidateAgencyNPNResponse) | ValidateAgencyNPN checks whether an agency’s National Producer Number (NPN) is valid. It performs a lookup against NIPR and applies internal validation rules. Returns a validity flag and any associated error messages. |
| LookupNPNByFEIN | [LookupNPNByFEINRequest](#producerflow-producer-v1-LookupNPNByFEINRequest) | [LookupNPNByFEINResponse](#producerflow-producer-v1-LookupNPNByFEINResponse) | LookupNPNByFEIN finds an NPN using a Federal Employer Identification Number. Used to help agencies that know their FEIN but not their NPN. Returns the NPN if found or an error message. |
| ResyncProducer | [ResyncProducerRequest](#producerflow-producer-v1-ResyncProducerRequest) | [ResyncProducerResponse](#producerflow-producer-v1-ResyncProducerResponse) | ResyncProducer triggers a manual resynchronization of a producer’s data. This can be used to refresh data after external changes.

WARNING: This call counts as an additional NPN lookup for billing purposes. Most billing plans are based on unique NPNs per month, so using this method may result in extra charges. |
| ResyncAgency | [ResyncAgencyRequest](#producerflow-producer-v1-ResyncAgencyRequest) | [ResyncAgencyResponse](#producerflow-producer-v1-ResyncAgencyResponse) | ResyncAgency triggers a manual resynchronization of an agency’s data. Similar to ResyncProducer, this can be used to refresh data after external changes.

WARNING: This call counts as an additional NPN lookup for billing purposes. Most billing plans are based on unique NPNs per month, so using this method may result in extra charges. |
| SyncProducerWithNIPR | [SyncProducerWithNIPRRequest](#producerflow-producer-v1-SyncProducerWithNIPRRequest) | [SyncProducerWithNIPRResponse](#producerflow-producer-v1-SyncProducerWithNIPRResponse) | SyncAgencyWithNIPR synchronizes an producer’s data with the NIPR system. Fetches the latest producer information and appointments.

WARNING: This call counts as an extra NPN lookup against your billing. Most billing plans are based on unique NPNs per month, so using this method may result in additional charges. |
| SyncAgencyWithNIPR | [SyncAgencyWithNIPRRequest](#producerflow-producer-v1-SyncAgencyWithNIPRRequest) | [SyncAgencyWithNIPRResponse](#producerflow-producer-v1-SyncAgencyWithNIPRResponse) | SyncAgencyWithNIPR synchronizes an agency’s data with the NIPR system. Fetches the latest agency information and appointments.

WARNING: This call counts as an extra NPN lookup against your billing. Most billing plans are based on unique NPNs per month, so using this method may result in additional charges. |
| StopSyncProducerWithNIPR | [StopSyncProducerWithNIPRRequest](#producerflow-producer-v1-StopSyncProducerWithNIPRRequest) | [StopSyncProducerWithNIPRResponse](#producerflow-producer-v1-StopSyncProducerWithNIPRResponse) | StopSyncProducerWithNIPR stops the synchronization process with NIPR for a producer. Use this to prevent further automatic updates from NIPR. |
| StopSyncAgencyWithNIPR | [StopSyncAgencyWithNIPRRequest](#producerflow-producer-v1-StopSyncAgencyWithNIPRRequest) | [StopSyncAgencyWithNIPRResponse](#producerflow-producer-v1-StopSyncAgencyWithNIPRResponse) | StopSyncAgencyWithNIPR stops the synchronization process with NIPR for an agency. Use this to prevent further automatic updates from NIPR. |
| CreateProducerUploadURL | [CreateProducerUploadURLRequest](#producerflow-producer-v1-CreateProducerUploadURLRequest) | [CreateProducerUploadURLResponse](#producerflow-producer-v1-CreateProducerUploadURLResponse) | CreateProducerUploadURL generates a URL that can be used to upload new producers for an existing agency. The agency is identified by its NPN, and the URL can be shared with the agency to allow them to upload producer information securely.

The URL is time-limited and includes necessary security tokens. A default expiration of 7 days will be used.

The agency must: - Exist and belong to the authenticated tenant - Have a valid NPN

Returns a URL string that can be shared with the agency for producer uploads. Returns errors in the following cases: - INVALID_ARGUMENT: if agency NPN is empty or invalid format - NOT_FOUND: if agency NPN doesn&#39;t exist - INTERNAL: for other unexpected errors |
| AddAgencyLocations | [AddAgencyLocationsRequest](#producerflow-producer-v1-AddAgencyLocationsRequest) | [AddAgencyLocationsResponse](#producerflow-producer-v1-AddAgencyLocationsResponse) | AddAgencyLocations adds one or more locations to an existing agency.

Each location must have a unique name within the agency and valid address information. You can add up to 100 locations in a single request. This is a bulk operation with all-or-nothing behavior - if any location fails validation, the entire request will fail and no locations will be added.

Returns the IDs of successfully added locations.

Returns errors in the following cases: - UNAUTHENTICATED: if the API key is invalid or missing. - INVALID_ARGUMENT: if the request is nil, agency_id is empty, no locations provided, location names are duplicated within the request or already exist for the agency, or if the agency already has a primary location and the request includes a primary. - NOT_FOUND: if the agency doesn&#39;t exist or doesn&#39;t belong to the authenticated tenant. |
| RemoveAgencyLocations | [RemoveAgencyLocationsRequest](#producerflow-producer-v1-RemoveAgencyLocationsRequest) | [RemoveAgencyLocationsResponse](#producerflow-producer-v1-RemoveAgencyLocationsResponse) | RemoveAgencyLocations removes one or more locations from an agency.

Locations that don&#39;t exist will be silently ignored. Returns the IDs of successfully removed locations. When a location is removed, all the producers associated with that location will be unassigned from that location. Returns errors in the following cases: - UNAUTHENTICATED: if the API key is invalid or missing. - INVALID_ARGUMENT: if the request is nil, agency_id is empty, or no location_ids provided. - NOT_FOUND: if the agency doesn&#39;t exist or doesn&#39;t belong to the authenticated tenant. |
| ListAgencyLocations | [ListAgencyLocationsRequest](#producerflow-producer-v1-ListAgencyLocationsRequest) | [ListAgencyLocationsResponse](#producerflow-producer-v1-ListAgencyLocationsResponse) | ListAgencyLocations retrieves all locations associated with an agency.

Returns errors in the following cases: - UNAUTHENTICATED: if the API key is invalid or missing. - INVALID_ARGUMENT: if the agency_id is empty. - NOT_FOUND: if the agency doesn&#39;t exist. |
| AssignProducerToLocations | [AssignProducerToLocationsRequest](#producerflow-producer-v1-AssignProducerToLocationsRequest) | [AssignProducerToLocationsResponse](#producerflow-producer-v1-AssignProducerToLocationsResponse) | AssignProducerToLocations assigns one or more locations to a producer. The locations must belong to the same agency as the producer.

Error cases: - UNAUTHENTICATED: Invalid or missing API key - INVALID_ARGUMENT: Empty producer_id or no location_ids - NOT_FOUND: Producer or locations don&#39;t exist - PERMISSION_DENIED: Locations don&#39;t belong to the producer&#39;s agency |

 



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

