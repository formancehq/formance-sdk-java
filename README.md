# formance-sdk-java

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://opensource.org/licenses/MIT">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>

<!-- Start Summary [summary] -->
## Summary

Formance Stack API: Open, modular foundation for unique payments flows

# Introduction
This API is documented in **OpenAPI format**.

# Authentication
Formance Stack offers one forms of authentication:
  - OAuth2
OAuth2 - an open protocol to allow secure authorization in a simple
and standard method from web, mobile and desktop applications.
<SecurityDefinitions />
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [formance-sdk-java](#formance-sdk-java)
* [Introduction](#introduction)
* [Authentication](#authentication)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Server Selection](#server-selection)
  * [Error Handling](#error-handling)
  * [Authentication](#authentication-1)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
  * [Jackson Configuration](#jackson-configuration)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.formance:formance-sdk:8.0.0'
```

Maven:
```xml
<dependency>
    <groupId>com.formance</groupId>
    <artifactId>formance-sdk</artifactId>
    <version>8.0.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            System.out.println(res.getVersionsResponse().get());
        }
    }
}
```

#### Union Consumption Patterns

When a response field is a union model:

- Discriminated unions: branch on the discriminator (`switch`) and then narrow to the concrete type.
- Non-discriminated unions: use generated accessors (for example `string()`, `asLong()`, `simpleObject()`) to determine the active variant.

For full model-specific examples (including Java 11/16/21 variants), see each union model's **Supported Types** section in the generated model docs.
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [SDK](docs/sdks/sdk/README.md)

* [getVersions](docs/sdks/sdk/README.md#getversions) - Show stack version information

### [Auth.V1](docs/sdks/authv1/README.md)

* [createClient](docs/sdks/authv1/README.md#createclient) - Create client
* [createSecret](docs/sdks/authv1/README.md#createsecret) - Add a secret to a client
* [deleteClient](docs/sdks/authv1/README.md#deleteclient) - Delete client
* [deleteSecret](docs/sdks/authv1/README.md#deletesecret) - Delete a secret from a client
* [getOIDCWellKnowns](docs/sdks/authv1/README.md#getoidcwellknowns) - Retrieve OpenID connect well-knowns.
* [getServerInfo](docs/sdks/authv1/README.md#getserverinfo) - Get server info
* [listClients](docs/sdks/authv1/README.md#listclients) - List clients
* [listUsers](docs/sdks/authv1/README.md#listusers) - List users
* [readClient](docs/sdks/authv1/README.md#readclient) - Read client
* [readUser](docs/sdks/authv1/README.md#readuser) - Read user
* [updateClient](docs/sdks/authv1/README.md#updateclient) - Update client

### [Ledger](docs/sdks/ledger/README.md)

* [getInfo](docs/sdks/ledger/README.md#getinfo) - Show server information
* [getMetrics](docs/sdks/ledger/README.md#getmetrics) - Read in memory metrics

#### [Ledger.V1](docs/sdks/ledgerv1/README.md)

* [createTransactions](docs/sdks/ledgerv1/README.md#createtransactions) - Create a new batch of transactions to a ledger
* [addMetadataOnTransaction](docs/sdks/ledgerv1/README.md#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](docs/sdks/ledgerv1/README.md#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](docs/sdks/ledgerv1/README.md#countaccounts) - Count the accounts from a ledger
* [countTransactions](docs/sdks/ledgerv1/README.md#counttransactions) - Count the transactions from a ledger
* [createTransaction](docs/sdks/ledgerv1/README.md#createtransaction) - Create a new transaction to a ledger
* [getAccount](docs/sdks/ledgerv1/README.md#getaccount) - Get account by its address
* [getBalances](docs/sdks/ledgerv1/README.md#getbalances) - Get the balances from a ledger's account
* [getBalancesAggregated](docs/sdks/ledgerv1/README.md#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getInfo](docs/sdks/ledgerv1/README.md#getinfo) - Show server information
* [getLedgerInfo](docs/sdks/ledgerv1/README.md#getledgerinfo) - Get information about a ledger
* [getMapping](docs/sdks/ledgerv1/README.md#getmapping) - Get the mapping of a ledger
* [getTransaction](docs/sdks/ledgerv1/README.md#gettransaction) - Get transaction from a ledger by its ID
* [listAccounts](docs/sdks/ledgerv1/README.md#listaccounts) - List accounts from a ledger
* [listLogs](docs/sdks/ledgerv1/README.md#listlogs) - List the logs from a ledger
* [listTransactions](docs/sdks/ledgerv1/README.md#listtransactions) - List transactions from a ledger
* [readStats](docs/sdks/ledgerv1/README.md#readstats) - Get statistics from a ledger
* [revertTransaction](docs/sdks/ledgerv1/README.md#reverttransaction) - Revert a ledger transaction by its ID
* [~~runScript~~](docs/sdks/ledgerv1/README.md#runscript) - Execute a Numscript :warning: **Deprecated**
* [updateMapping](docs/sdks/ledgerv1/README.md#updatemapping) - Update the mapping of a ledger

#### [Ledger.V2](docs/sdks/ledgerv2/README.md)

* [addMetadataOnTransaction](docs/sdks/ledgerv2/README.md#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](docs/sdks/ledgerv2/README.md#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](docs/sdks/ledgerv2/README.md#countaccounts) - Count the accounts from a ledger
* [countTransactions](docs/sdks/ledgerv2/README.md#counttransactions) - Count the transactions from a ledger
* [createBulk](docs/sdks/ledgerv2/README.md#createbulk) - Bulk request
* [createExporter](docs/sdks/ledgerv2/README.md#createexporter) - Create exporter
* [createLedger](docs/sdks/ledgerv2/README.md#createledger) - Create a ledger
* [createPipeline](docs/sdks/ledgerv2/README.md#createpipeline) - Create pipeline
* [createTransaction](docs/sdks/ledgerv2/README.md#createtransaction) - Create a new transaction to a ledger
* [deleteAccountMetadata](docs/sdks/ledgerv2/README.md#deleteaccountmetadata) - Delete metadata by key
* [deleteBucket](docs/sdks/ledgerv2/README.md#deletebucket) - Delete bucket
* [deleteExporter](docs/sdks/ledgerv2/README.md#deleteexporter) - Delete exporter
* [deleteLedgerMetadata](docs/sdks/ledgerv2/README.md#deleteledgermetadata) - Delete ledger metadata by key
* [deletePipeline](docs/sdks/ledgerv2/README.md#deletepipeline) - Delete pipeline
* [deleteTransactionMetadata](docs/sdks/ledgerv2/README.md#deletetransactionmetadata) - Delete metadata by key
* [exportLogs](docs/sdks/ledgerv2/README.md#exportlogs) - Export logs
* [getAccount](docs/sdks/ledgerv2/README.md#getaccount) - Get account by its address
* [getBalancesAggregated](docs/sdks/ledgerv2/README.md#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getExporterState](docs/sdks/ledgerv2/README.md#getexporterstate) - Get exporter state
* [getLedger](docs/sdks/ledgerv2/README.md#getledger) - Get a ledger
* [getLedgerInfo](docs/sdks/ledgerv2/README.md#getledgerinfo) - Get information about a ledger
* [getPipelineState](docs/sdks/ledgerv2/README.md#getpipelinestate) - Get pipeline state
* [getSchema](docs/sdks/ledgerv2/README.md#getschema) - Get a schema for a ledger by version
* [getTransaction](docs/sdks/ledgerv2/README.md#gettransaction) - Get transaction from a ledger by its ID
* [getVolumesWithBalances](docs/sdks/ledgerv2/README.md#getvolumeswithbalances) - Get list of volumes with balances for (account/asset)
* [importLogs](docs/sdks/ledgerv2/README.md#importlogs)
* [insertSchema](docs/sdks/ledgerv2/README.md#insertschema) - Insert a schema for a ledger
* [listAccounts](docs/sdks/ledgerv2/README.md#listaccounts) - List accounts from a ledger
* [listExporters](docs/sdks/ledgerv2/README.md#listexporters) - List exporters
* [listLedgers](docs/sdks/ledgerv2/README.md#listledgers) - List ledgers
* [listLogs](docs/sdks/ledgerv2/README.md#listlogs) - List the logs from a ledger
* [listPipelines](docs/sdks/ledgerv2/README.md#listpipelines) - List pipelines
* [listSchemas](docs/sdks/ledgerv2/README.md#listschemas) - List all schemas for a ledger
* [listTransactions](docs/sdks/ledgerv2/README.md#listtransactions) - List transactions from a ledger
* [readStats](docs/sdks/ledgerv2/README.md#readstats) - Get statistics from a ledger
* [resetPipeline](docs/sdks/ledgerv2/README.md#resetpipeline) - Reset pipeline
* [restoreBucket](docs/sdks/ledgerv2/README.md#restorebucket) - Restore bucket
* [revertTransaction](docs/sdks/ledgerv2/README.md#reverttransaction) - Revert a ledger transaction by its ID
* [runQuery](docs/sdks/ledgerv2/README.md#runquery) - Run a query template
* [startPipeline](docs/sdks/ledgerv2/README.md#startpipeline) - Start pipeline
* [stopPipeline](docs/sdks/ledgerv2/README.md#stoppipeline) - Stop pipeline
* [updateExporter](docs/sdks/ledgerv2/README.md#updateexporter) - Update exporter
* [updateLedgerMetadata](docs/sdks/ledgerv2/README.md#updateledgermetadata) - Update ledger metadata

### [Orchestration.V1](docs/sdks/orchestrationv1/README.md)

* [cancelEvent](docs/sdks/orchestrationv1/README.md#cancelevent) - Cancel a running workflow
* [createTrigger](docs/sdks/orchestrationv1/README.md#createtrigger) - Create trigger
* [createWorkflow](docs/sdks/orchestrationv1/README.md#createworkflow) - Create workflow
* [deleteTrigger](docs/sdks/orchestrationv1/README.md#deletetrigger) - Delete trigger
* [deleteWorkflow](docs/sdks/orchestrationv1/README.md#deleteworkflow) - Delete a flow by id
* [getInstance](docs/sdks/orchestrationv1/README.md#getinstance) - Get a workflow instance by id
* [getInstanceHistory](docs/sdks/orchestrationv1/README.md#getinstancehistory) - Get a workflow instance history by id
* [getInstanceStageHistory](docs/sdks/orchestrationv1/README.md#getinstancestagehistory) - Get a workflow instance stage history
* [getWorkflow](docs/sdks/orchestrationv1/README.md#getworkflow) - Get a flow by id
* [listInstances](docs/sdks/orchestrationv1/README.md#listinstances) - List instances of a workflow
* [listTriggers](docs/sdks/orchestrationv1/README.md#listtriggers) - List triggers
* [listTriggersOccurrences](docs/sdks/orchestrationv1/README.md#listtriggersoccurrences) - List triggers occurrences
* [listWorkflows](docs/sdks/orchestrationv1/README.md#listworkflows) - List registered workflows
* [orchestrationgetServerInfo](docs/sdks/orchestrationv1/README.md#orchestrationgetserverinfo) - Get server info
* [readTrigger](docs/sdks/orchestrationv1/README.md#readtrigger) - Read trigger
* [runWorkflow](docs/sdks/orchestrationv1/README.md#runworkflow) - Run workflow
* [sendEvent](docs/sdks/orchestrationv1/README.md#sendevent) - Send an event to a running workflow

### [Orchestration.V2](docs/sdks/orchestrationv2/README.md)

* [cancelEvent](docs/sdks/orchestrationv2/README.md#cancelevent) - Cancel a running workflow
* [createTrigger](docs/sdks/orchestrationv2/README.md#createtrigger) - Create trigger
* [createWorkflow](docs/sdks/orchestrationv2/README.md#createworkflow) - Create workflow
* [deleteTrigger](docs/sdks/orchestrationv2/README.md#deletetrigger) - Delete trigger
* [deleteWorkflow](docs/sdks/orchestrationv2/README.md#deleteworkflow) - Delete a flow by id
* [getInstance](docs/sdks/orchestrationv2/README.md#getinstance) - Get a workflow instance by id
* [getInstanceHistory](docs/sdks/orchestrationv2/README.md#getinstancehistory) - Get a workflow instance history by id
* [getInstanceStageHistory](docs/sdks/orchestrationv2/README.md#getinstancestagehistory) - Get a workflow instance stage history
* [getServerInfo](docs/sdks/orchestrationv2/README.md#getserverinfo) - Get server info
* [getWorkflow](docs/sdks/orchestrationv2/README.md#getworkflow) - Get a flow by id
* [listInstances](docs/sdks/orchestrationv2/README.md#listinstances) - List instances of a workflow
* [listTriggers](docs/sdks/orchestrationv2/README.md#listtriggers) - List triggers
* [listTriggersOccurrences](docs/sdks/orchestrationv2/README.md#listtriggersoccurrences) - List triggers occurrences
* [listWorkflows](docs/sdks/orchestrationv2/README.md#listworkflows) - List registered workflows
* [readTrigger](docs/sdks/orchestrationv2/README.md#readtrigger) - Read trigger
* [runWorkflow](docs/sdks/orchestrationv2/README.md#runworkflow) - Run workflow
* [sendEvent](docs/sdks/orchestrationv2/README.md#sendevent) - Send an event to a running workflow
* [testTrigger](docs/sdks/orchestrationv2/README.md#testtrigger) - Test trigger

### [Payments.V1](docs/sdks/paymentsv1/README.md)

* [addAccountToPool](docs/sdks/paymentsv1/README.md#addaccounttopool) - Add an account to a pool
* [connectorsTransfer](docs/sdks/paymentsv1/README.md#connectorstransfer) - Transfer funds between Connector accounts
* [createAccount](docs/sdks/paymentsv1/README.md#createaccount) - Create an account
* [createBankAccount](docs/sdks/paymentsv1/README.md#createbankaccount) - Create a BankAccount in Payments and on the PSP
* [createPayment](docs/sdks/paymentsv1/README.md#createpayment) - Create a payment
* [createPool](docs/sdks/paymentsv1/README.md#createpool) - Create a Pool
* [createTransferInitiation](docs/sdks/paymentsv1/README.md#createtransferinitiation) - Create a TransferInitiation
* [deletePool](docs/sdks/paymentsv1/README.md#deletepool) - Delete a Pool
* [deleteTransferInitiation](docs/sdks/paymentsv1/README.md#deletetransferinitiation) - Delete a transfer initiation
* [forwardBankAccount](docs/sdks/paymentsv1/README.md#forwardbankaccount) - Forward a bank account to a connector
* [getAccountBalances](docs/sdks/paymentsv1/README.md#getaccountbalances) - Get account balances
* [getBankAccount](docs/sdks/paymentsv1/README.md#getbankaccount) - Get a bank account created by user on Formance
* [~~getConnectorTask~~](docs/sdks/paymentsv1/README.md#getconnectortask) - Read a specific task of the connector :warning: **Deprecated**
* [getConnectorTaskV1](docs/sdks/paymentsv1/README.md#getconnectortaskv1) - Read a specific task of the connector
* [getPayment](docs/sdks/paymentsv1/README.md#getpayment) - Get a payment
* [getPool](docs/sdks/paymentsv1/README.md#getpool) - Get a Pool
* [getPoolBalances](docs/sdks/paymentsv1/README.md#getpoolbalances) - Get historical pool balances at a particular point in time
* [getPoolBalancesLatest](docs/sdks/paymentsv1/README.md#getpoolbalanceslatest) - Get latest pool balances
* [getTransferInitiation](docs/sdks/paymentsv1/README.md#gettransferinitiation) - Get a transfer initiation
* [installConnector](docs/sdks/paymentsv1/README.md#installconnector) - Install a connector
* [listAllConnectors](docs/sdks/paymentsv1/README.md#listallconnectors) - List all installed connectors
* [listBankAccounts](docs/sdks/paymentsv1/README.md#listbankaccounts) - List bank accounts created by user on Formance
* [listConfigsAvailableConnectors](docs/sdks/paymentsv1/README.md#listconfigsavailableconnectors) - List the configs of each available connector
* [~~listConnectorTasks~~](docs/sdks/paymentsv1/README.md#listconnectortasks) - List tasks from a connector :warning: **Deprecated**
* [listConnectorTasksV1](docs/sdks/paymentsv1/README.md#listconnectortasksv1) - List tasks from a connector
* [listPayments](docs/sdks/paymentsv1/README.md#listpayments) - List payments
* [listPools](docs/sdks/paymentsv1/README.md#listpools) - List Pools
* [listTransferInitiations](docs/sdks/paymentsv1/README.md#listtransferinitiations) - List Transfer Initiations
* [paymentsgetAccount](docs/sdks/paymentsv1/README.md#paymentsgetaccount) - Get an account
* [paymentsgetServerInfo](docs/sdks/paymentsv1/README.md#paymentsgetserverinfo) - Get server info
* [paymentslistAccounts](docs/sdks/paymentsv1/README.md#paymentslistaccounts) - List accounts
* [~~readConnectorConfig~~](docs/sdks/paymentsv1/README.md#readconnectorconfig) - Read the config of a connector :warning: **Deprecated**
* [readConnectorConfigV1](docs/sdks/paymentsv1/README.md#readconnectorconfigv1) - Read the config of a connector
* [removeAccountFromPool](docs/sdks/paymentsv1/README.md#removeaccountfrompool) - Remove an account from a pool
* [~~resetConnector~~](docs/sdks/paymentsv1/README.md#resetconnector) - Reset a connector :warning: **Deprecated**
* [resetConnectorV1](docs/sdks/paymentsv1/README.md#resetconnectorv1) - Reset a connector
* [retryTransferInitiation](docs/sdks/paymentsv1/README.md#retrytransferinitiation) - Retry a failed transfer initiation
* [reverseTransferInitiation](docs/sdks/paymentsv1/README.md#reversetransferinitiation) - Reverse a transfer initiation
* [~~uninstallConnector~~](docs/sdks/paymentsv1/README.md#uninstallconnector) - Uninstall a connector :warning: **Deprecated**
* [uninstallConnectorV1](docs/sdks/paymentsv1/README.md#uninstallconnectorv1) - Uninstall a connector
* [updateBankAccountMetadata](docs/sdks/paymentsv1/README.md#updatebankaccountmetadata) - Update metadata of a bank account
* [updateConnectorConfigV1](docs/sdks/paymentsv1/README.md#updateconnectorconfigv1) - Update the config of a connector
* [updateMetadata](docs/sdks/paymentsv1/README.md#updatemetadata) - Update metadata
* [updatePoolQuery](docs/sdks/paymentsv1/README.md#updatepoolquery) - Update the query of a pool
* [updateTransferInitiationStatus](docs/sdks/paymentsv1/README.md#updatetransferinitiationstatus) - Update the status of a transfer initiation

### [Payments.V3](docs/sdks/v3/README.md)

* [addAccountToPool](docs/sdks/v3/README.md#addaccounttopool) - Add an account to a pool
* [addBankAccountToPaymentServiceUser](docs/sdks/v3/README.md#addbankaccounttopaymentserviceuser) - Add a bank account to a payment service user
* [approvePaymentInitiation](docs/sdks/v3/README.md#approvepaymentinitiation) - Approve a payment initiation
* [createAccount](docs/sdks/v3/README.md#createaccount) - Create a formance account object. This object will not be forwarded to the connector. It is only used for internal purposes.

* [createBankAccount](docs/sdks/v3/README.md#createbankaccount) - Create a formance bank account object. This object will not be forwarded to the connector until you called the forwardBankAccount method.

* [createLinkForPaymentServiceUser](docs/sdks/v3/README.md#createlinkforpaymentserviceuser) - Create an authentication link for a payment service user on a connector, for oauth flow
* [createPayment](docs/sdks/v3/README.md#createpayment) - Create a formance payment object. This object will not be forwarded to the connector. It is only used for internal purposes.

* [createPaymentServiceUser](docs/sdks/v3/README.md#createpaymentserviceuser) - Create a formance payment service user object
* [createPool](docs/sdks/v3/README.md#createpool) - Create a formance pool object
* [deletePaymentInitiation](docs/sdks/v3/README.md#deletepaymentinitiation) - Delete a payment initiation by ID
* [deletePaymentServiceUser](docs/sdks/v3/README.md#deletepaymentserviceuser) - Delete a payment service user by ID
* [deletePaymentServiceUserConnectionFromConnectorID](docs/sdks/v3/README.md#deletepaymentserviceuserconnectionfromconnectorid) - Delete a connection for a payment service user on a connector
* [deletePaymentServiceUserConnector](docs/sdks/v3/README.md#deletepaymentserviceuserconnector) - Remove a payment service user from a connector, the PSU will still exist in Formance
* [deletePool](docs/sdks/v3/README.md#deletepool) - Delete a pool by ID
* [forwardBankAccount](docs/sdks/v3/README.md#forwardbankaccount) - Forward a Bank Account to a PSP for creation
* [forwardPaymentServiceUserBankAccount](docs/sdks/v3/README.md#forwardpaymentserviceuserbankaccount) - Forward a payment service user's bank account to a connector
* [forwardPaymentServiceUserToProvider](docs/sdks/v3/README.md#forwardpaymentserviceusertoprovider) - Register/forward a payment service user on/to a connector
* [getAccount](docs/sdks/v3/README.md#getaccount) - Get an account by ID
* [getAccountBalances](docs/sdks/v3/README.md#getaccountbalances) - Get account balances
* [getBankAccount](docs/sdks/v3/README.md#getbankaccount) - Get a Bank Account by ID
* [getConnectorConfig](docs/sdks/v3/README.md#getconnectorconfig) - Get a connector configuration by ID
* [getConnectorSchedule](docs/sdks/v3/README.md#getconnectorschedule) - Get a connector schedule by ID
* [getPayment](docs/sdks/v3/README.md#getpayment) - Get a payment by ID
* [getPaymentInitiation](docs/sdks/v3/README.md#getpaymentinitiation) - Get a payment initiation by ID
* [getPaymentServiceUser](docs/sdks/v3/README.md#getpaymentserviceuser) - Get a payment service user by ID
* [getPaymentServiceUserLinkAttemptFromConnectorID](docs/sdks/v3/README.md#getpaymentserviceuserlinkattemptfromconnectorid) - Get a link attempt for a payment service user on a connector
* [getPool](docs/sdks/v3/README.md#getpool) - Get a pool by ID
* [getPoolBalances](docs/sdks/v3/README.md#getpoolbalances) - Get historical pool balances from a particular point in time
* [getPoolBalancesLatest](docs/sdks/v3/README.md#getpoolbalanceslatest) - Get latest pool balances
* [getTask](docs/sdks/v3/README.md#gettask) - Get a task and its result by ID
* [initiatePayment](docs/sdks/v3/README.md#initiatepayment) - Initiate a payment
* [installConnector](docs/sdks/v3/README.md#installconnector) - Install a connector
* [listAccounts](docs/sdks/v3/README.md#listaccounts) - List all accounts
* [listBankAccounts](docs/sdks/v3/README.md#listbankaccounts) - List all bank accounts
* [listConnectorConfigs](docs/sdks/v3/README.md#listconnectorconfigs) - List all connector configurations
* [listConnectorScheduleInstances](docs/sdks/v3/README.md#listconnectorscheduleinstances) - List all connector schedule instances
* [listConnectorSchedules](docs/sdks/v3/README.md#listconnectorschedules) - List all connector schedules
* [listConnectors](docs/sdks/v3/README.md#listconnectors) - List all connectors
* [listPaymentInitiationAdjustments](docs/sdks/v3/README.md#listpaymentinitiationadjustments) - List all payment initiation adjustments
* [listPaymentInitiationRelatedPayments](docs/sdks/v3/README.md#listpaymentinitiationrelatedpayments) - List all payments related to a payment initiation
* [listPaymentInitiations](docs/sdks/v3/README.md#listpaymentinitiations) - List all payment initiations
* [listPaymentServiceUserConnections](docs/sdks/v3/README.md#listpaymentserviceuserconnections) - List all connections for a payment service user
* [listPaymentServiceUserConnectionsFromConnectorID](docs/sdks/v3/README.md#listpaymentserviceuserconnectionsfromconnectorid) - List enabled connections for a payment service user on a connector (i.e. the various banks PSUser has enabled on the connector)
* [listPaymentServiceUserLinkAttemptsFromConnectorID](docs/sdks/v3/README.md#listpaymentserviceuserlinkattemptsfromconnectorid) - List all link attempts for a payment service user on a connector.
Allows to check if users used the link and completed the oauth flow.

* [listPaymentServiceUsers](docs/sdks/v3/README.md#listpaymentserviceusers) - List all payment service users
* [listPayments](docs/sdks/v3/README.md#listpayments) - List all payments
* [listPools](docs/sdks/v3/README.md#listpools) - List all pools
* [rejectPaymentInitiation](docs/sdks/v3/README.md#rejectpaymentinitiation) - Reject a payment initiation
* [removeAccountFromPool](docs/sdks/v3/README.md#removeaccountfrompool) - Remove an account from a pool
* [resetConnector](docs/sdks/v3/README.md#resetconnector) - Reset a connector. Be aware that this will delete all data and stop all existing tasks like payment initiations and bank account creations.
* [retryPaymentInitiation](docs/sdks/v3/README.md#retrypaymentinitiation) - Retry a payment initiation
* [reversePaymentInitiation](docs/sdks/v3/README.md#reversepaymentinitiation) - Reverse a payment initiation
* [uninstallConnector](docs/sdks/v3/README.md#uninstallconnector) - Uninstall a connector
* [updateBankAccountMetadata](docs/sdks/v3/README.md#updatebankaccountmetadata) - Update a bank account's metadata
* [updateLinkForPaymentServiceUserOnConnector](docs/sdks/v3/README.md#updatelinkforpaymentserviceuseronconnector) - Update/Regenerate a link for a payment service user on a connector
* [updatePaymentMetadata](docs/sdks/v3/README.md#updatepaymentmetadata) - Update a payment's metadata
* [updatePoolQuery](docs/sdks/v3/README.md#updatepoolquery) - Update the query of a pool
* [v3UpdateConnectorConfig](docs/sdks/v3/README.md#v3updateconnectorconfig) - Update the config of a connector

### [Reconciliation.V1](docs/sdks/reconciliationv1/README.md)

* [createPolicy](docs/sdks/reconciliationv1/README.md#createpolicy) - Create a policy
* [deletePolicy](docs/sdks/reconciliationv1/README.md#deletepolicy) - Delete a policy
* [getPolicy](docs/sdks/reconciliationv1/README.md#getpolicy) - Get a policy
* [getReconciliation](docs/sdks/reconciliationv1/README.md#getreconciliation) - Get a reconciliation
* [listPolicies](docs/sdks/reconciliationv1/README.md#listpolicies) - List policies
* [listReconciliations](docs/sdks/reconciliationv1/README.md#listreconciliations) - List reconciliations
* [reconcile](docs/sdks/reconciliationv1/README.md#reconcile) - Reconcile using a policy
* [reconciliationgetServerInfo](docs/sdks/reconciliationv1/README.md#reconciliationgetserverinfo) - Get server info

### [~~Search.V1~~](docs/sdks/searchv1/README.md)

* [~~search~~](docs/sdks/searchv1/README.md#search) - search.v1 :warning: **Deprecated**
* [~~searchgetServerInfo~~](docs/sdks/searchv1/README.md#searchgetserverinfo) - Get server info :warning: **Deprecated**

### [Wallets.V1](docs/sdks/walletsv1/README.md)

* [confirmHold](docs/sdks/walletsv1/README.md#confirmhold) - Confirm a hold
* [createBalance](docs/sdks/walletsv1/README.md#createbalance) - Create a balance
* [createWallet](docs/sdks/walletsv1/README.md#createwallet) - Create a new wallet
* [creditWallet](docs/sdks/walletsv1/README.md#creditwallet) - Credit a wallet
* [debitWallet](docs/sdks/walletsv1/README.md#debitwallet) - Debit a wallet
* [getBalance](docs/sdks/walletsv1/README.md#getbalance) - Get detailed balance
* [getHold](docs/sdks/walletsv1/README.md#gethold) - Get a hold
* [getHolds](docs/sdks/walletsv1/README.md#getholds) - Get all holds for a wallet
* [getTransactions](docs/sdks/walletsv1/README.md#gettransactions)
* [getWallet](docs/sdks/walletsv1/README.md#getwallet) - Get a wallet
* [getWalletSummary](docs/sdks/walletsv1/README.md#getwalletsummary) - Get wallet summary
* [listBalances](docs/sdks/walletsv1/README.md#listbalances) - List balances of a wallet
* [listWallets](docs/sdks/walletsv1/README.md#listwallets) - List all wallets
* [updateWallet](docs/sdks/walletsv1/README.md#updatewallet) - Update a wallet
* [voidHold](docs/sdks/walletsv1/README.md#voidhold) - Cancel a hold
* [walletsgetServerInfo](docs/sdks/walletsv1/README.md#walletsgetserverinfo) - Get server info

### [Webhooks.V1](docs/sdks/webhooksv1/README.md)

* [activateConfig](docs/sdks/webhooksv1/README.md#activateconfig) - Activate one config
* [changeConfigSecret](docs/sdks/webhooksv1/README.md#changeconfigsecret) - Change the signing secret of a config
* [deactivateConfig](docs/sdks/webhooksv1/README.md#deactivateconfig) - Deactivate one config
* [deleteConfig](docs/sdks/webhooksv1/README.md#deleteconfig) - Delete one config
* [getManyConfigs](docs/sdks/webhooksv1/README.md#getmanyconfigs) - Get many configs
* [insertConfig](docs/sdks/webhooksv1/README.md#insertconfig) - Insert a new config
* [testConfig](docs/sdks/webhooksv1/README.md#testconfig) - Test one config
* [updateConfig](docs/sdks/webhooksv1/README.md#updateconfig) - Update one config

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                                | Variables                        | Description                                |
| --- | ----------------------------------------------------- | -------------------------------- | ------------------------------------------ |
| 0   | `http://localhost`                                    |                                  | local server                               |
| 1   | `https://{organization}.{environment}.formance.cloud` | `environment`<br/>`organization` | A per-organization and per-environment API |

If the selected server has variables, you may override its default values using the associated builder method(s):

| Variable       | BuilderMethod                                | Supported Values                                         | Default           | Description                                                   |
| -------------- | -------------------------------------------- | -------------------------------------------------------- | ----------------- | ------------------------------------------------------------- |
| `environment`  | `environment(ServerEnvironment environment)` | - `"eu.sandbox"`<br/>- `"eu-west-1"`<br/>- `"us-east-1"` | `"eu.sandbox"`    | The environment name. Defaults to the production environment. |
| `organization` | `organization(String organization)`          | java.lang.String                                         | `"orgID-stackID"` | The organization name. Defaults to a generic organization.    |

#### Example

```java
package hello.world;

import com.formance.formance_sdk.SDK.Builder.ServerEnvironment;
import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .serverIndex(1)
                .environment(ServerEnvironment.US_EAST1)
                .organization("<value>")
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            System.out.println(res.getVersionsResponse().get());
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .serverURL("https://orgID-stackID.eu.sandbox.formance.cloud")
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            System.out.println(res.getVersionsResponse().get());
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`SDKBaseError`](./src/main/java/models/errors/SDKBaseError.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKBaseError;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2ErrorsEnum;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();
        try {

            V2GetInfoResponse res = sdk.ledger().getInfo()
                    .call();

            if (res.v2ConfigInfoResponse().isPresent()) {
                System.out.println(res.v2ConfigInfoResponse().get());
            }
        } catch (SDKBaseError ex) { // all SDK exceptions inherit from SDKBaseError

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();

            // different error subclasses may be thrown 
            // depending on the service call
            if (ex instanceof V2ErrorResponse) {
                var e = (V2ErrorResponse) ex;
                // Check error data fields
                e.data().ifPresent(payload -> {
                      Optional<String> details = payload.details();
                      V2ErrorsEnum errorCode = payload.errorCode();
                      // ...
                });
            }

            // An underlying cause may be provided. If the error payload 
            // cannot be deserialized then the deserialization exception 
            // will be set as the cause.
            if (ex.getCause() != null) {
                var cause = ex.getCause();
            }
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary error:**
* [`SDKBaseError`](./src/main/java/models/errors/SDKBaseError.java): The base class for HTTP error responses.

<details><summary>Less common errors (15)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`SDKBaseError`](./src/main/java/models/errors/SDKBaseError.java)**:
* [`com.formance.formance_sdk.models.errors.V3ErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.V3ErrorResponse.java): Error. Applicable to 57 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.PaymentsErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.PaymentsErrorResponse.java): Error. Applicable to 46 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.V2ErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.V2ErrorResponse.java): Applicable to 44 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.ErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.ErrorResponse.java): Applicable to 19 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.V2Error`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.V2Error.java): General error. Applicable to 18 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.Error`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.Error.java): General error. Applicable to 17 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.WalletsErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.WalletsErrorResponse.java): Applicable to 15 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.ReconciliationErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.ReconciliationErrorResponse.java): Error response. Applicable to 8 of 249 methods.*
* [`com.formance.formance_sdk.models.errors.WebhooksErrorResponse`](./src/main/java/models/errors/com.formance.formance_sdk.models.errors.WebhooksErrorResponse.java): Error. Applicable to 8 of 249 methods.*


</details>

\* Check [the method documentation](#available-resources-and-operations) to see if the error is applicable.
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                                         | Type   | Scheme                         |
| -------------------------------------------- | ------ | ------------------------------ |
| `clientID`<br/>`clientSecret`<br/>`tokenURL` | oauth2 | OAuth2 Client Credentials Flow |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            System.out.println(res.getVersionsResponse().get());
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods.

The following example shows how to add a custom header and handle errors:

```java
import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.utils.SpeakeasyHTTPClient;
import com.formance.formance_sdk.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        SDK sdk = SDK.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.utils.HTTPClient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }
        };

        SDK sdk = SDK.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        SDK sdk = SDK.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug

You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Start Jackson Configuration [jackson] -->
## Jackson Configuration

The SDK ships with a pre-configured Jackson [`ObjectMapper`][jackson-databind] accessible via
`JSON.getMapper()`. It is set up with type modules, strict deserializers, and the feature flags
needed for full SDK compatibility (including ISO-8601 `OffsetDateTime` serialization):

```java
import com.formance.formance_sdk.utils.JSON;

String json = JSON.getMapper().writeValueAsString(response);
```

To compose with your own `ObjectMapper`, register the provided `FormanceSDKJacksonModule`, which
bundles all the same modules and feature flags as a single plug-and-play module:

```java
import com.formance.formance_sdk.utils.FormanceSDKJacksonModule;
import com.fasterxml.jackson.databind.ObjectMapper;

ObjectMapper myMapper = new ObjectMapper()
    .registerModule(new FormanceSDKJacksonModule());

String json = myMapper.writeValueAsString(response);
```

[jackson-databind]: https://github.com/FasterXML/jackson-databind
[jackson-jsr310]: https://github.com/FasterXML/jackson-modules-java8/tree/master/datetime
<!-- End Jackson Configuration [jackson] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
