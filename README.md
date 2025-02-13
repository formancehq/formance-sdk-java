# formance-sdk-java

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://opensource.org/licenses/MIT">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README

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
  * [🏗 **Welcome to your new SDK!** 🏗](#welcome-to-your-new-sdk)
* [Introduction](#introduction)
* [Authentication](#authentication)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Server Selection](#server-selection)
  * [Error Handling](#error-handling)
  * [Authentication](#authentication-1)
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
implementation 'com.formance:formance-sdk:5.0.0'
```

Maven:
```xml
<dependency>
    <groupId>com.formance</groupId>
    <artifactId>formance-sdk</artifactId>
    <version>5.0.0</version>
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
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [auth()](docs/sdks/auth/README.md)


#### [auth().v1()](docs/sdks/v1/README.md)

* [createClient](docs/sdks/v1/README.md#createclient) - Create client
* [createSecret](docs/sdks/v1/README.md#createsecret) - Add a secret to a client
* [deleteClient](docs/sdks/v1/README.md#deleteclient) - Delete client
* [deleteSecret](docs/sdks/v1/README.md#deletesecret) - Delete a secret from a client
* [getOIDCWellKnowns](docs/sdks/v1/README.md#getoidcwellknowns) - Retrieve OpenID connect well-knowns.
* [getServerInfo](docs/sdks/v1/README.md#getserverinfo) - Get server info
* [listClients](docs/sdks/v1/README.md#listclients) - List clients
* [listUsers](docs/sdks/v1/README.md#listusers) - List users
* [readClient](docs/sdks/v1/README.md#readclient) - Read client
* [readUser](docs/sdks/v1/README.md#readuser) - Read user
* [updateClient](docs/sdks/v1/README.md#updateclient) - Update client

### [ledger()](docs/sdks/ledger/README.md)


#### [ledger().v1()](docs/sdks/sdkv1/README.md)

* [createTransactions](docs/sdks/sdkv1/README.md#createtransactions) - Create a new batch of transactions to a ledger
* [addMetadataOnTransaction](docs/sdks/sdkv1/README.md#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](docs/sdks/sdkv1/README.md#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](docs/sdks/sdkv1/README.md#countaccounts) - Count the accounts from a ledger
* [countTransactions](docs/sdks/sdkv1/README.md#counttransactions) - Count the transactions from a ledger
* [createTransaction](docs/sdks/sdkv1/README.md#createtransaction) - Create a new transaction to a ledger
* [getAccount](docs/sdks/sdkv1/README.md#getaccount) - Get account by its address
* [getBalances](docs/sdks/sdkv1/README.md#getbalances) - Get the balances from a ledger's account
* [getBalancesAggregated](docs/sdks/sdkv1/README.md#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getInfo](docs/sdks/sdkv1/README.md#getinfo) - Show server information
* [getLedgerInfo](docs/sdks/sdkv1/README.md#getledgerinfo) - Get information about a ledger
* [getMapping](docs/sdks/sdkv1/README.md#getmapping) - Get the mapping of a ledger
* [getTransaction](docs/sdks/sdkv1/README.md#gettransaction) - Get transaction from a ledger by its ID
* [listAccounts](docs/sdks/sdkv1/README.md#listaccounts) - List accounts from a ledger
* [listLogs](docs/sdks/sdkv1/README.md#listlogs) - List the logs from a ledger
* [listTransactions](docs/sdks/sdkv1/README.md#listtransactions) - List transactions from a ledger
* [readStats](docs/sdks/sdkv1/README.md#readstats) - Get statistics from a ledger
* [revertTransaction](docs/sdks/sdkv1/README.md#reverttransaction) - Revert a ledger transaction by its ID
* [~~runScript~~](docs/sdks/sdkv1/README.md#runscript) - Execute a Numscript :warning: **Deprecated**
* [updateMapping](docs/sdks/sdkv1/README.md#updatemapping) - Update the mapping of a ledger

#### [ledger().v2()](docs/sdks/v2/README.md)

* [addMetadataOnTransaction](docs/sdks/v2/README.md#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](docs/sdks/v2/README.md#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](docs/sdks/v2/README.md#countaccounts) - Count the accounts from a ledger
* [countTransactions](docs/sdks/v2/README.md#counttransactions) - Count the transactions from a ledger
* [createBulk](docs/sdks/v2/README.md#createbulk) - Bulk request
* [createLedger](docs/sdks/v2/README.md#createledger) - Create a ledger
* [createTransaction](docs/sdks/v2/README.md#createtransaction) - Create a new transaction to a ledger
* [deleteAccountMetadata](docs/sdks/v2/README.md#deleteaccountmetadata) - Delete metadata by key
* [deleteLedgerMetadata](docs/sdks/v2/README.md#deleteledgermetadata) - Delete ledger metadata by key
* [deleteTransactionMetadata](docs/sdks/v2/README.md#deletetransactionmetadata) - Delete metadata by key
* [exportLogs](docs/sdks/v2/README.md#exportlogs) - Export logs
* [getAccount](docs/sdks/v2/README.md#getaccount) - Get account by its address
* [getBalancesAggregated](docs/sdks/v2/README.md#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getInfo](docs/sdks/v2/README.md#getinfo) - Show server information
* [getLedger](docs/sdks/v2/README.md#getledger) - Get a ledger
* [getLedgerInfo](docs/sdks/v2/README.md#getledgerinfo) - Get information about a ledger
* [getMetrics](docs/sdks/v2/README.md#getmetrics) - Read in memory metrics
* [getTransaction](docs/sdks/v2/README.md#gettransaction) - Get transaction from a ledger by its ID
* [getVolumesWithBalances](docs/sdks/v2/README.md#getvolumeswithbalances) - Get list of volumes with balances for (account/asset)
* [importLogs](docs/sdks/v2/README.md#importlogs)
* [listAccounts](docs/sdks/v2/README.md#listaccounts) - List accounts from a ledger
* [listLedgers](docs/sdks/v2/README.md#listledgers) - List ledgers
* [listLogs](docs/sdks/v2/README.md#listlogs) - List the logs from a ledger
* [listTransactions](docs/sdks/v2/README.md#listtransactions) - List transactions from a ledger
* [readStats](docs/sdks/v2/README.md#readstats) - Get statistics from a ledger
* [revertTransaction](docs/sdks/v2/README.md#reverttransaction) - Revert a ledger transaction by its ID
* [updateLedgerMetadata](docs/sdks/v2/README.md#updateledgermetadata) - Update ledger metadata

### [orchestration()](docs/sdks/orchestration/README.md)


#### [orchestration().v1()](docs/sdks/sdkorchestrationv1/README.md)

* [cancelEvent](docs/sdks/sdkorchestrationv1/README.md#cancelevent) - Cancel a running workflow
* [createTrigger](docs/sdks/sdkorchestrationv1/README.md#createtrigger) - Create trigger
* [createWorkflow](docs/sdks/sdkorchestrationv1/README.md#createworkflow) - Create workflow
* [deleteTrigger](docs/sdks/sdkorchestrationv1/README.md#deletetrigger) - Delete trigger
* [deleteWorkflow](docs/sdks/sdkorchestrationv1/README.md#deleteworkflow) - Delete a flow by id
* [getInstance](docs/sdks/sdkorchestrationv1/README.md#getinstance) - Get a workflow instance by id
* [getInstanceHistory](docs/sdks/sdkorchestrationv1/README.md#getinstancehistory) - Get a workflow instance history by id
* [getInstanceStageHistory](docs/sdks/sdkorchestrationv1/README.md#getinstancestagehistory) - Get a workflow instance stage history
* [getWorkflow](docs/sdks/sdkorchestrationv1/README.md#getworkflow) - Get a flow by id
* [listInstances](docs/sdks/sdkorchestrationv1/README.md#listinstances) - List instances of a workflow
* [listTriggers](docs/sdks/sdkorchestrationv1/README.md#listtriggers) - List triggers
* [listTriggersOccurrences](docs/sdks/sdkorchestrationv1/README.md#listtriggersoccurrences) - List triggers occurrences
* [listWorkflows](docs/sdks/sdkorchestrationv1/README.md#listworkflows) - List registered workflows
* [orchestrationgetServerInfo](docs/sdks/sdkorchestrationv1/README.md#orchestrationgetserverinfo) - Get server info
* [readTrigger](docs/sdks/sdkorchestrationv1/README.md#readtrigger) - Read trigger
* [runWorkflow](docs/sdks/sdkorchestrationv1/README.md#runworkflow) - Run workflow
* [sendEvent](docs/sdks/sdkorchestrationv1/README.md#sendevent) - Send an event to a running workflow

#### [orchestration().v2()](docs/sdks/sdkv2/README.md)

* [cancelEvent](docs/sdks/sdkv2/README.md#cancelevent) - Cancel a running workflow
* [createTrigger](docs/sdks/sdkv2/README.md#createtrigger) - Create trigger
* [createWorkflow](docs/sdks/sdkv2/README.md#createworkflow) - Create workflow
* [deleteTrigger](docs/sdks/sdkv2/README.md#deletetrigger) - Delete trigger
* [deleteWorkflow](docs/sdks/sdkv2/README.md#deleteworkflow) - Delete a flow by id
* [getInstance](docs/sdks/sdkv2/README.md#getinstance) - Get a workflow instance by id
* [getInstanceHistory](docs/sdks/sdkv2/README.md#getinstancehistory) - Get a workflow instance history by id
* [getInstanceStageHistory](docs/sdks/sdkv2/README.md#getinstancestagehistory) - Get a workflow instance stage history
* [getServerInfo](docs/sdks/sdkv2/README.md#getserverinfo) - Get server info
* [getWorkflow](docs/sdks/sdkv2/README.md#getworkflow) - Get a flow by id
* [listInstances](docs/sdks/sdkv2/README.md#listinstances) - List instances of a workflow
* [listTriggers](docs/sdks/sdkv2/README.md#listtriggers) - List triggers
* [listTriggersOccurrences](docs/sdks/sdkv2/README.md#listtriggersoccurrences) - List triggers occurrences
* [listWorkflows](docs/sdks/sdkv2/README.md#listworkflows) - List registered workflows
* [readTrigger](docs/sdks/sdkv2/README.md#readtrigger) - Read trigger
* [runWorkflow](docs/sdks/sdkv2/README.md#runworkflow) - Run workflow
* [sendEvent](docs/sdks/sdkv2/README.md#sendevent) - Send an event to a running workflow
* [testTrigger](docs/sdks/sdkv2/README.md#testtrigger) - Test trigger

### [payments()](docs/sdks/payments/README.md)


#### [payments().v1()](docs/sdks/sdkpaymentsv1/README.md)

* [addAccountToPool](docs/sdks/sdkpaymentsv1/README.md#addaccounttopool) - Add an account to a pool
* [connectorsTransfer](docs/sdks/sdkpaymentsv1/README.md#connectorstransfer) - Transfer funds between Connector accounts
* [createAccount](docs/sdks/sdkpaymentsv1/README.md#createaccount) - Create an account
* [createBankAccount](docs/sdks/sdkpaymentsv1/README.md#createbankaccount) - Create a BankAccount in Payments and on the PSP
* [createPayment](docs/sdks/sdkpaymentsv1/README.md#createpayment) - Create a payment
* [createPool](docs/sdks/sdkpaymentsv1/README.md#createpool) - Create a Pool
* [createTransferInitiation](docs/sdks/sdkpaymentsv1/README.md#createtransferinitiation) - Create a TransferInitiation
* [deletePool](docs/sdks/sdkpaymentsv1/README.md#deletepool) - Delete a Pool
* [deleteTransferInitiation](docs/sdks/sdkpaymentsv1/README.md#deletetransferinitiation) - Delete a transfer initiation
* [forwardBankAccount](docs/sdks/sdkpaymentsv1/README.md#forwardbankaccount) - Forward a bank account to a connector
* [getAccountBalances](docs/sdks/sdkpaymentsv1/README.md#getaccountbalances) - Get account balances
* [getBankAccount](docs/sdks/sdkpaymentsv1/README.md#getbankaccount) - Get a bank account created by user on Formance
* [~~getConnectorTask~~](docs/sdks/sdkpaymentsv1/README.md#getconnectortask) - Read a specific task of the connector :warning: **Deprecated**
* [getConnectorTaskV1](docs/sdks/sdkpaymentsv1/README.md#getconnectortaskv1) - Read a specific task of the connector
* [getPayment](docs/sdks/sdkpaymentsv1/README.md#getpayment) - Get a payment
* [getPool](docs/sdks/sdkpaymentsv1/README.md#getpool) - Get a Pool
* [getPoolBalances](docs/sdks/sdkpaymentsv1/README.md#getpoolbalances) - Get pool balances
* [getTransferInitiation](docs/sdks/sdkpaymentsv1/README.md#gettransferinitiation) - Get a transfer initiation
* [installConnector](docs/sdks/sdkpaymentsv1/README.md#installconnector) - Install a connector
* [listAllConnectors](docs/sdks/sdkpaymentsv1/README.md#listallconnectors) - List all installed connectors
* [listBankAccounts](docs/sdks/sdkpaymentsv1/README.md#listbankaccounts) - List bank accounts created by user on Formance
* [listConfigsAvailableConnectors](docs/sdks/sdkpaymentsv1/README.md#listconfigsavailableconnectors) - List the configs of each available connector
* [~~listConnectorTasks~~](docs/sdks/sdkpaymentsv1/README.md#listconnectortasks) - List tasks from a connector :warning: **Deprecated**
* [listConnectorTasksV1](docs/sdks/sdkpaymentsv1/README.md#listconnectortasksv1) - List tasks from a connector
* [listPayments](docs/sdks/sdkpaymentsv1/README.md#listpayments) - List payments
* [listPools](docs/sdks/sdkpaymentsv1/README.md#listpools) - List Pools
* [listTransferInitiations](docs/sdks/sdkpaymentsv1/README.md#listtransferinitiations) - List Transfer Initiations
* [paymentsgetAccount](docs/sdks/sdkpaymentsv1/README.md#paymentsgetaccount) - Get an account
* [paymentsgetServerInfo](docs/sdks/sdkpaymentsv1/README.md#paymentsgetserverinfo) - Get server info
* [paymentslistAccounts](docs/sdks/sdkpaymentsv1/README.md#paymentslistaccounts) - List accounts
* [~~readConnectorConfig~~](docs/sdks/sdkpaymentsv1/README.md#readconnectorconfig) - Read the config of a connector :warning: **Deprecated**
* [readConnectorConfigV1](docs/sdks/sdkpaymentsv1/README.md#readconnectorconfigv1) - Read the config of a connector
* [removeAccountFromPool](docs/sdks/sdkpaymentsv1/README.md#removeaccountfrompool) - Remove an account from a pool
* [~~resetConnector~~](docs/sdks/sdkpaymentsv1/README.md#resetconnector) - Reset a connector :warning: **Deprecated**
* [resetConnectorV1](docs/sdks/sdkpaymentsv1/README.md#resetconnectorv1) - Reset a connector
* [retryTransferInitiation](docs/sdks/sdkpaymentsv1/README.md#retrytransferinitiation) - Retry a failed transfer initiation
* [reverseTransferInitiation](docs/sdks/sdkpaymentsv1/README.md#reversetransferinitiation) - Reverse a transfer initiation
* [udpateTransferInitiationStatus](docs/sdks/sdkpaymentsv1/README.md#udpatetransferinitiationstatus) - Update the status of a transfer initiation
* [~~uninstallConnector~~](docs/sdks/sdkpaymentsv1/README.md#uninstallconnector) - Uninstall a connector :warning: **Deprecated**
* [uninstallConnectorV1](docs/sdks/sdkpaymentsv1/README.md#uninstallconnectorv1) - Uninstall a connector
* [updateBankAccountMetadata](docs/sdks/sdkpaymentsv1/README.md#updatebankaccountmetadata) - Update metadata of a bank account
* [updateConnectorConfigV1](docs/sdks/sdkpaymentsv1/README.md#updateconnectorconfigv1) - Update the config of a connector
* [updateMetadata](docs/sdks/sdkpaymentsv1/README.md#updatemetadata) - Update metadata

#### [payments().v3()](docs/sdks/v3/README.md)

* [addAccountToPool](docs/sdks/v3/README.md#addaccounttopool) - Add an account to a pool
* [approvePaymentInitiation](docs/sdks/v3/README.md#approvepaymentinitiation) - Approve a payment initiation
* [createAccount](docs/sdks/v3/README.md#createaccount) - Create a formance account object. This object will not be forwarded to the connector. It is only used for internal purposes.

* [createBankAccount](docs/sdks/v3/README.md#createbankaccount) - Create a formance bank account object. This object will not be forwarded to the connector until you called the forwardBankAccount method.

* [createPayment](docs/sdks/v3/README.md#createpayment) - Create a formance payment object. This object will not be forwarded to the connector. It is only used for internal purposes.

* [createPool](docs/sdks/v3/README.md#createpool) - Create a formance pool object
* [deletePaymentInitiation](docs/sdks/v3/README.md#deletepaymentinitiation) - Delete a payment initiation by ID
* [deletePool](docs/sdks/v3/README.md#deletepool) - Delete a pool by ID
* [forwardBankAccount](docs/sdks/v3/README.md#forwardbankaccount) - Forward a Bank Account to a PSP for creation
* [getAccount](docs/sdks/v3/README.md#getaccount) - Get an account by ID
* [getAccountBalances](docs/sdks/v3/README.md#getaccountbalances) - Get account balances
* [getBankAccount](docs/sdks/v3/README.md#getbankaccount) - Get a Bank Account by ID
* [getConnectorConfig](docs/sdks/v3/README.md#getconnectorconfig) - Get a connector configuration by ID
* [getConnectorSchedule](docs/sdks/v3/README.md#getconnectorschedule) - Get a connector schedule by ID
* [getInfo](docs/sdks/v3/README.md#getinfo) - Show server information
* [getPayment](docs/sdks/v3/README.md#getpayment) - Get a payment by ID
* [getPaymentInitiation](docs/sdks/v3/README.md#getpaymentinitiation) - Get a payment initiation by ID
* [getPool](docs/sdks/v3/README.md#getpool) - Get a pool by ID
* [getPoolBalances](docs/sdks/v3/README.md#getpoolbalances) - Get pool balances
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
* [listPayments](docs/sdks/v3/README.md#listpayments) - List all payments
* [listPools](docs/sdks/v3/README.md#listpools) - List all pools
* [rejectPaymentInitiation](docs/sdks/v3/README.md#rejectpaymentinitiation) - Reject a payment initiation
* [removeAccountFromPool](docs/sdks/v3/README.md#removeaccountfrompool) - Remove an account from a pool
* [resetConnector](docs/sdks/v3/README.md#resetconnector) - Reset a connector. Be aware that this will delete all data and stop all existing tasks like payment initiations and bank account creations.
* [retryPaymentInitiation](docs/sdks/v3/README.md#retrypaymentinitiation) - Retry a payment initiation
* [reversePaymentInitiation](docs/sdks/v3/README.md#reversepaymentinitiation) - Reverse a payment initiation
* [uninstallConnector](docs/sdks/v3/README.md#uninstallconnector) - Uninstall a connector
* [updateBankAccountMetadata](docs/sdks/v3/README.md#updatebankaccountmetadata) - Update a bank account's metadata
* [updatePaymentMetadata](docs/sdks/v3/README.md#updatepaymentmetadata) - Update a payment's metadata

### [reconciliation()](docs/sdks/reconciliation/README.md)


#### [reconciliation().v1()](docs/sdks/sdkreconciliationv1/README.md)

* [createPolicy](docs/sdks/sdkreconciliationv1/README.md#createpolicy) - Create a policy
* [deletePolicy](docs/sdks/sdkreconciliationv1/README.md#deletepolicy) - Delete a policy
* [getPolicy](docs/sdks/sdkreconciliationv1/README.md#getpolicy) - Get a policy
* [getReconciliation](docs/sdks/sdkreconciliationv1/README.md#getreconciliation) - Get a reconciliation
* [listPolicies](docs/sdks/sdkreconciliationv1/README.md#listpolicies) - List policies
* [listReconciliations](docs/sdks/sdkreconciliationv1/README.md#listreconciliations) - List reconciliations
* [reconcile](docs/sdks/sdkreconciliationv1/README.md#reconcile) - Reconcile using a policy
* [reconciliationgetServerInfo](docs/sdks/sdkreconciliationv1/README.md#reconciliationgetserverinfo) - Get server info

### [SDK](docs/sdks/sdk/README.md)

* [getVersions](docs/sdks/sdk/README.md#getversions) - Show stack version information

### [~~search()~~](docs/sdks/search/README.md)


#### [~~search().v1()~~](docs/sdks/sdksearchv1/README.md)

* [~~search~~](docs/sdks/sdksearchv1/README.md#search) - search.v1 :warning: **Deprecated**
* [~~searchgetServerInfo~~](docs/sdks/sdksearchv1/README.md#searchgetserverinfo) - Get server info :warning: **Deprecated**

### [wallets()](docs/sdks/wallets/README.md)


#### [wallets().v1()](docs/sdks/sdkwalletsv1/README.md)

* [confirmHold](docs/sdks/sdkwalletsv1/README.md#confirmhold) - Confirm a hold
* [createBalance](docs/sdks/sdkwalletsv1/README.md#createbalance) - Create a balance
* [createWallet](docs/sdks/sdkwalletsv1/README.md#createwallet) - Create a new wallet
* [creditWallet](docs/sdks/sdkwalletsv1/README.md#creditwallet) - Credit a wallet
* [debitWallet](docs/sdks/sdkwalletsv1/README.md#debitwallet) - Debit a wallet
* [getBalance](docs/sdks/sdkwalletsv1/README.md#getbalance) - Get detailed balance
* [getHold](docs/sdks/sdkwalletsv1/README.md#gethold) - Get a hold
* [getHolds](docs/sdks/sdkwalletsv1/README.md#getholds) - Get all holds for a wallet
* [getTransactions](docs/sdks/sdkwalletsv1/README.md#gettransactions)
* [getWallet](docs/sdks/sdkwalletsv1/README.md#getwallet) - Get a wallet
* [getWalletSummary](docs/sdks/sdkwalletsv1/README.md#getwalletsummary) - Get wallet summary
* [listBalances](docs/sdks/sdkwalletsv1/README.md#listbalances) - List balances of a wallet
* [listWallets](docs/sdks/sdkwalletsv1/README.md#listwallets) - List all wallets
* [updateWallet](docs/sdks/sdkwalletsv1/README.md#updatewallet) - Update a wallet
* [voidHold](docs/sdks/sdkwalletsv1/README.md#voidhold) - Cancel a hold
* [walletsgetServerInfo](docs/sdks/sdkwalletsv1/README.md#walletsgetserverinfo) - Get server info

### [webhooks()](docs/sdks/webhooks/README.md)


#### [webhooks().v1()](docs/sdks/sdkwebhooksv1/README.md)

* [activateConfig](docs/sdks/sdkwebhooksv1/README.md#activateconfig) - Activate one config
* [changeConfigSecret](docs/sdks/sdkwebhooksv1/README.md#changeconfigsecret) - Change the signing secret of a config
* [deactivateConfig](docs/sdks/sdkwebhooksv1/README.md#deactivateconfig) - Deactivate one config
* [deleteConfig](docs/sdks/sdkwebhooksv1/README.md#deleteconfig) - Delete one config
* [getManyConfigs](docs/sdks/sdkwebhooksv1/README.md#getmanyconfigs) - Get many configs
* [insertConfig](docs/sdks/sdkwebhooksv1/README.md#insertconfig) - Insert a new config
* [testConfig](docs/sdks/sdkwebhooksv1/README.md#testconfig) - Test one config
* [updateConfig](docs/sdks/sdkwebhooksv1/README.md#updateconfig) - Update one config

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                                | Variables                                                 | Default values                       |
| --- | ----------------------------------------------------- | --------------------------------------------------------- | ------------------------------------ |
| 0   | `http://localhost`                                    |                                                           |                                      |
| 1   | `https://{organization}.{environment}.formance.cloud` | `ServerEnvironment environment`<br/>`String organization` | `"eu.sandbox"`<br/>`"orgID-stackID"` |

If the selected server has variables, you may override their default values using their associated builder method(s):
 * `environment(ServerEnvironment environment)`
 * `organization(String organization)`

#### Example

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .serverIndex(1)
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            // handle response
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
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .serverURL("http://localhost")
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `addMetadataOnTransaction` method throws the following exceptions:

| Error Type                    | Status Code | Content Type     |
| ----------------------------- | ----------- | ---------------- |
| models/errors/V2ErrorResponse | default     | application/json |
| models/errors/SDKError        | 4XX, 5XX    | \*/\*            |

### Example

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionRequest;
import com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2AddMetadataOnTransactionRequest req = V2AddMetadataOnTransactionRequest.builder()
                .id(new BigInteger("1234"))
                .ledger("ledger001")
                .requestBody(Map.ofEntries(
                    Map.entry("admin", "true")))
                .dryRun(true)
                .build();

        V2AddMetadataOnTransactionResponse res = sdk.ledger().v2().addMetadataOnTransaction()
                .request(req)
                .call();

        // handle response
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name                          | Type   | Scheme                         |
| ----------------------------- | ------ | ------------------------------ |
| `clientID`<br/>`clientSecret` | oauth2 | OAuth2 Client Credentials Flow |

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
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

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
