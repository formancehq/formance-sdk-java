# SDKPaymentsV1
(*payments().v1()*)

## Overview

### Available Operations

* [addAccountToPool](#addaccounttopool) - Add an account to a pool
* [connectorsTransfer](#connectorstransfer) - Transfer funds between Connector accounts
* [createAccount](#createaccount) - Create an account
* [createBankAccount](#createbankaccount) - Create a BankAccount in Payments and on the PSP
* [createPayment](#createpayment) - Create a payment
* [createPool](#createpool) - Create a Pool
* [createTransferInitiation](#createtransferinitiation) - Create a TransferInitiation
* [deletePool](#deletepool) - Delete a Pool
* [deleteTransferInitiation](#deletetransferinitiation) - Delete a transfer initiation
* [forwardBankAccount](#forwardbankaccount) - Forward a bank account to a connector
* [getAccountBalances](#getaccountbalances) - Get account balances
* [getBankAccount](#getbankaccount) - Get a bank account created by user on Formance
* [~~getConnectorTask~~](#getconnectortask) - Read a specific task of the connector :warning: **Deprecated**
* [getConnectorTaskV1](#getconnectortaskv1) - Read a specific task of the connector
* [getPayment](#getpayment) - Get a payment
* [getPool](#getpool) - Get a Pool
* [getPoolBalances](#getpoolbalances) - Get pool balances
* [getTransferInitiation](#gettransferinitiation) - Get a transfer initiation
* [installConnector](#installconnector) - Install a connector
* [listAllConnectors](#listallconnectors) - List all installed connectors
* [listBankAccounts](#listbankaccounts) - List bank accounts created by user on Formance
* [listConfigsAvailableConnectors](#listconfigsavailableconnectors) - List the configs of each available connector
* [~~listConnectorTasks~~](#listconnectortasks) - List tasks from a connector :warning: **Deprecated**
* [listConnectorTasksV1](#listconnectortasksv1) - List tasks from a connector
* [listPayments](#listpayments) - List payments
* [listPools](#listpools) - List Pools
* [listTransferInitiations](#listtransferinitiations) - List Transfer Initiations
* [paymentsgetAccount](#paymentsgetaccount) - Get an account
* [paymentsgetServerInfo](#paymentsgetserverinfo) - Get server info
* [paymentslistAccounts](#paymentslistaccounts) - List accounts
* [~~readConnectorConfig~~](#readconnectorconfig) - Read the config of a connector :warning: **Deprecated**
* [readConnectorConfigV1](#readconnectorconfigv1) - Read the config of a connector
* [removeAccountFromPool](#removeaccountfrompool) - Remove an account from a pool
* [~~resetConnector~~](#resetconnector) - Reset a connector :warning: **Deprecated**
* [resetConnectorV1](#resetconnectorv1) - Reset a connector
* [retryTransferInitiation](#retrytransferinitiation) - Retry a failed transfer initiation
* [reverseTransferInitiation](#reversetransferinitiation) - Reverse a transfer initiation
* [udpateTransferInitiationStatus](#udpatetransferinitiationstatus) - Update the status of a transfer initiation
* [~~uninstallConnector~~](#uninstallconnector) - Uninstall a connector :warning: **Deprecated**
* [uninstallConnectorV1](#uninstallconnectorv1) - Uninstall a connector
* [updateBankAccountMetadata](#updatebankaccountmetadata) - Update metadata of a bank account
* [updateConnectorConfigV1](#updateconnectorconfigv1) - Update the config of a connector
* [updateMetadata](#updatemetadata) - Update metadata

## addAccountToPool

Add an account to a pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.AddAccountToPoolRequest;
import com.formance.formance_sdk.models.operations.AddAccountToPoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        AddAccountToPoolRequest req = AddAccountToPoolRequest.builder()
                .addAccountToPoolRequest(com.formance.formance_sdk.models.shared.AddAccountToPoolRequest.builder()
                    .accountID("<id>")
                    .build())
                .poolId("XXX")
                .build();

        AddAccountToPoolResponse res = sdk.payments().v1().addAccountToPool()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AddAccountToPoolRequest](../../models/operations/AddAccountToPoolRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AddAccountToPoolResponse](../../models/operations/AddAccountToPoolResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## connectorsTransfer

Execute a transfer between two accounts.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ConnectorsTransferRequest;
import com.formance.formance_sdk.models.operations.ConnectorsTransferResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransferRequest;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ConnectorsTransferRequest req = ConnectorsTransferRequest.builder()
                .transferRequest(TransferRequest.builder()
                    .amount(new BigInteger("100"))
                    .asset("USD")
                    .destination("acct_1Gqj58KZcSIg2N2q")
                    .source("acct_1Gqj58KZcSIg2N2q")
                    .build())
                .connector(Connector.BANKING_CIRCLE)
                .build();

        ConnectorsTransferResponse res = sdk.payments().v1().connectorsTransfer()
                .request(req)
                .call();

        if (res.transferResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ConnectorsTransferRequest](../../models/operations/ConnectorsTransferRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ConnectorsTransferResponse](../../models/operations/ConnectorsTransferResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## createAccount

Create an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.CreateAccountResponse;
import com.formance.formance_sdk.models.shared.AccountRequest;
import com.formance.formance_sdk.models.shared.AccountType;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        AccountRequest req = AccountRequest.builder()
                .connectorID("<id>")
                .createdAt(OffsetDateTime.parse("2024-08-19T02:15:08.152Z"))
                .reference("<value>")
                .type(AccountType.INTERNAL)
                .build();

        CreateAccountResponse res = sdk.payments().v1().createAccount()
                .request(req)
                .call();

        if (res.paymentsAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [AccountRequest](../../models/shared/AccountRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateAccountResponse](../../models/operations/CreateAccountResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## createBankAccount

Create a bank account in Payments and on the PSP.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.CreateBankAccountResponse;
import com.formance.formance_sdk.models.shared.BankAccountRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        BankAccountRequest req = BankAccountRequest.builder()
                .connectorID("<id>")
                .country("GB")
                .name("My account")
                .build();

        CreateBankAccountResponse res = sdk.payments().v1().createBankAccount()
                .request(req)
                .call();

        if (res.bankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [BankAccountRequest](../../models/shared/BankAccountRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CreateBankAccountResponse](../../models/operations/CreateBankAccountResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## createPayment

Create a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.CreatePaymentResponse;
import com.formance.formance_sdk.models.shared.PaymentRequest;
import com.formance.formance_sdk.models.shared.PaymentScheme;
import com.formance.formance_sdk.models.shared.PaymentStatus;
import com.formance.formance_sdk.models.shared.PaymentType;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        PaymentRequest req = PaymentRequest.builder()
                .amount(new BigInteger("100"))
                .asset("USD")
                .connectorID("<id>")
                .createdAt(OffsetDateTime.parse("2024-11-09T01:03:21.011Z"))
                .reference("<value>")
                .scheme(PaymentScheme.MOLPAY)
                .status(PaymentStatus.REFUNDED_FAILURE)
                .type(PaymentType.PAYOUT)
                .build();

        CreatePaymentResponse res = sdk.payments().v1().createPayment()
                .request(req)
                .call();

        if (res.paymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [PaymentRequest](../../models/shared/PaymentRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreatePaymentResponse](../../models/operations/CreatePaymentResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## createPool

Create a Pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.CreatePoolResponse;
import com.formance.formance_sdk.models.shared.PoolRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        PoolRequest req = PoolRequest.builder()
                .accountIDs(List.of(
                    "<value>"))
                .name("<value>")
                .build();

        CreatePoolResponse res = sdk.payments().v1().createPool()
                .request(req)
                .call();

        if (res.poolResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [PoolRequest](../../models/shared/PoolRequest.md) | :heavy_check_mark:                                | The request object to use for the request.        |

### Response

**[CreatePoolResponse](../../models/operations/CreatePoolResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## createTransferInitiation

Create a transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.CreateTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransferInitiationRequest;
import com.formance.formance_sdk.models.shared.TransferInitiationRequestType;
import java.lang.Exception;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        TransferInitiationRequest req = TransferInitiationRequest.builder()
                .amount(new BigInteger("256698"))
                .asset("USD")
                .description("worthy pace vague ick liberalize between um")
                .destinationAccountID("<id>")
                .reference("XXX")
                .scheduledAt(OffsetDateTime.parse("2024-05-02T09:50:03.622Z"))
                .sourceAccountID("<id>")
                .type(TransferInitiationRequestType.PAYOUT)
                .validated(false)
                .build();

        CreateTransferInitiationResponse res = sdk.payments().v1().createTransferInitiation()
                .request(req)
                .call();

        if (res.transferInitiationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [TransferInitiationRequest](../../models/shared/TransferInitiationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateTransferInitiationResponse](../../models/operations/CreateTransferInitiationResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## deletePool

Delete a pool by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.DeletePoolRequest;
import com.formance.formance_sdk.models.operations.DeletePoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        DeletePoolRequest req = DeletePoolRequest.builder()
                .poolId("XXX")
                .build();

        DeletePoolResponse res = sdk.payments().v1().deletePool()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [DeletePoolRequest](../../models/operations/DeletePoolRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[DeletePoolResponse](../../models/operations/DeletePoolResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## deleteTransferInitiation

Delete a transfer initiation by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.DeleteTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.DeleteTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        DeleteTransferInitiationRequest req = DeleteTransferInitiationRequest.builder()
                .transferId("XXX")
                .build();

        DeleteTransferInitiationResponse res = sdk.payments().v1().deleteTransferInitiation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DeleteTransferInitiationRequest](../../models/operations/DeleteTransferInitiationRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DeleteTransferInitiationResponse](../../models/operations/DeleteTransferInitiationResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## forwardBankAccount

Forward a bank account to a connector

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ForwardBankAccountRequest;
import com.formance.formance_sdk.models.operations.ForwardBankAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ForwardBankAccountRequest req = ForwardBankAccountRequest.builder()
                .forwardBankAccountRequest(com.formance.formance_sdk.models.shared.ForwardBankAccountRequest.builder()
                    .connectorID("<id>")
                    .build())
                .bankAccountId("XXX")
                .build();

        ForwardBankAccountResponse res = sdk.payments().v1().forwardBankAccount()
                .request(req)
                .call();

        if (res.bankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ForwardBankAccountRequest](../../models/operations/ForwardBankAccountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ForwardBankAccountResponse](../../models/operations/ForwardBankAccountResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getAccountBalances

Get account balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetAccountBalancesRequest;
import com.formance.formance_sdk.models.operations.GetAccountBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetAccountBalancesRequest req = GetAccountBalancesRequest.builder()
                .accountId("XXX")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(List.of(
                    "date:asc",
                    "status:desc"))
                .build();

        GetAccountBalancesResponse res = sdk.payments().v1().getAccountBalances()
                .request(req)
                .call();

        if (res.balancesCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAccountBalancesRequest](../../models/operations/GetAccountBalancesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAccountBalancesResponse](../../models/operations/GetAccountBalancesResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getBankAccount

Get a bank account created by user on Formance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetBankAccountRequest;
import com.formance.formance_sdk.models.operations.GetBankAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetBankAccountRequest req = GetBankAccountRequest.builder()
                .bankAccountId("XXX")
                .build();

        GetBankAccountResponse res = sdk.payments().v1().getBankAccount()
                .request(req)
                .call();

        if (res.bankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetBankAccountRequest](../../models/operations/GetBankAccountRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetBankAccountResponse](../../models/operations/GetBankAccountResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## ~~getConnectorTask~~

Get a specific task associated to the connector.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetConnectorTaskRequest;
import com.formance.formance_sdk.models.operations.GetConnectorTaskResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetConnectorTaskRequest req = GetConnectorTaskRequest.builder()
                .connector(Connector.ADYEN)
                .taskId("task1")
                .build();

        GetConnectorTaskResponse res = sdk.payments().v1().getConnectorTask()
                .request(req)
                .call();

        if (res.taskResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetConnectorTaskRequest](../../models/operations/GetConnectorTaskRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetConnectorTaskResponse](../../models/operations/GetConnectorTaskResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getConnectorTaskV1

Get a specific task associated to the connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetConnectorTaskV1Request;
import com.formance.formance_sdk.models.operations.GetConnectorTaskV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetConnectorTaskV1Request req = GetConnectorTaskV1Request.builder()
                .connector(Connector.BANKING_CIRCLE)
                .connectorId("XXX")
                .taskId("task1")
                .build();

        GetConnectorTaskV1Response res = sdk.payments().v1().getConnectorTaskV1()
                .request(req)
                .call();

        if (res.taskResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetConnectorTaskV1Request](../../models/operations/GetConnectorTaskV1Request.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetConnectorTaskV1Response](../../models/operations/GetConnectorTaskV1Response.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getPayment

Get a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetPaymentRequest;
import com.formance.formance_sdk.models.operations.GetPaymentResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetPaymentRequest req = GetPaymentRequest.builder()
                .paymentId("XXX")
                .build();

        GetPaymentResponse res = sdk.payments().v1().getPayment()
                .request(req)
                .call();

        if (res.paymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetPaymentRequest](../../models/operations/GetPaymentRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetPaymentResponse](../../models/operations/GetPaymentResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getPool

Get a Pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetPoolRequest;
import com.formance.formance_sdk.models.operations.GetPoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetPoolRequest req = GetPoolRequest.builder()
                .poolId("XXX")
                .build();

        GetPoolResponse res = sdk.payments().v1().getPool()
                .request(req)
                .call();

        if (res.poolResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetPoolRequest](../../models/operations/GetPoolRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetPoolResponse](../../models/operations/GetPoolResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getPoolBalances

Get pool balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetPoolBalancesRequest;
import com.formance.formance_sdk.models.operations.GetPoolBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetPoolBalancesRequest req = GetPoolBalancesRequest.builder()
                .at(OffsetDateTime.parse("2023-05-05T06:40:23.119Z"))
                .poolId("XXX")
                .build();

        GetPoolBalancesResponse res = sdk.payments().v1().getPoolBalances()
                .request(req)
                .call();

        if (res.poolBalancesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetPoolBalancesRequest](../../models/operations/GetPoolBalancesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetPoolBalancesResponse](../../models/operations/GetPoolBalancesResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getTransferInitiation

Get a transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.GetTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.GetTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetTransferInitiationRequest req = GetTransferInitiationRequest.builder()
                .transferId("XXX")
                .build();

        GetTransferInitiationResponse res = sdk.payments().v1().getTransferInitiation()
                .request(req)
                .call();

        if (res.transferInitiationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetTransferInitiationRequest](../../models/operations/GetTransferInitiationRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetTransferInitiationResponse](../../models/operations/GetTransferInitiationResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## installConnector

Install a connector by its name and config.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.InstallConnectorRequest;
import com.formance.formance_sdk.models.operations.InstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.ConnectorConfig;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.WiseConfig;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        InstallConnectorRequest req = InstallConnectorRequest.builder()
                .connectorConfig(ConnectorConfig.of(WiseConfig.builder()
                    .apiKey("XXX")
                    .name("My Wise Account")
                    .pollingPeriod("60s")
                    .build()))
                .connector(Connector.ATLAR)
                .build();

        InstallConnectorResponse res = sdk.payments().v1().installConnector()
                .request(req)
                .call();

        if (res.connectorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [InstallConnectorRequest](../../models/operations/InstallConnectorRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[InstallConnectorResponse](../../models/operations/InstallConnectorResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listAllConnectors

List all installed connectors.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListAllConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListAllConnectorsResponse res = sdk.payments().v1().listAllConnectors()
                .call();

        if (res.connectorsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListAllConnectorsResponse](../../models/operations/ListAllConnectorsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listBankAccounts

List all bank accounts created by user on Formance.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListBankAccountsRequest;
import com.formance.formance_sdk.models.operations.ListBankAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListBankAccountsRequest req = ListBankAccountsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(List.of(
                    "date:asc",
                    "status:desc"))
                .build();

        ListBankAccountsResponse res = sdk.payments().v1().listBankAccounts()
                .request(req)
                .call();

        if (res.bankAccountsCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListBankAccountsRequest](../../models/operations/ListBankAccountsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListBankAccountsResponse](../../models/operations/ListBankAccountsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listConfigsAvailableConnectors

List the configs of each available connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListConfigsAvailableConnectorsResponse res = sdk.payments().v1().listConfigsAvailableConnectors()
                .call();

        if (res.connectorsConfigsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListConfigsAvailableConnectorsResponse](../../models/operations/ListConfigsAvailableConnectorsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## ~~listConnectorTasks~~

List all tasks associated with this connector.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListConnectorTasksRequest;
import com.formance.formance_sdk.models.operations.ListConnectorTasksResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListConnectorTasksRequest req = ListConnectorTasksRequest.builder()
                .connector(Connector.MODULR)
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListConnectorTasksResponse res = sdk.payments().v1().listConnectorTasks()
                .request(req)
                .call();

        if (res.tasksCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListConnectorTasksRequest](../../models/operations/ListConnectorTasksRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListConnectorTasksResponse](../../models/operations/ListConnectorTasksResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listConnectorTasksV1

List all tasks associated with this connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListConnectorTasksV1Request;
import com.formance.formance_sdk.models.operations.ListConnectorTasksV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListConnectorTasksV1Request req = ListConnectorTasksV1Request.builder()
                .connector(Connector.BANKING_CIRCLE)
                .connectorId("XXX")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListConnectorTasksV1Response res = sdk.payments().v1().listConnectorTasksV1()
                .request(req)
                .call();

        if (res.tasksCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListConnectorTasksV1Request](../../models/operations/ListConnectorTasksV1Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListConnectorTasksV1Response](../../models/operations/ListConnectorTasksV1Response.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listPayments

List payments

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListPaymentsRequest;
import com.formance.formance_sdk.models.operations.ListPaymentsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListPaymentsRequest req = ListPaymentsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(List.of(
                    "date:asc",
                    "status:desc"))
                .build();

        ListPaymentsResponse res = sdk.payments().v1().listPayments()
                .request(req)
                .call();

        if (res.paymentsCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListPaymentsRequest](../../models/operations/ListPaymentsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListPaymentsResponse](../../models/operations/ListPaymentsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listPools

List Pools

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListPoolsRequest;
import com.formance.formance_sdk.models.operations.ListPoolsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListPoolsRequest req = ListPoolsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(List.of(
                    "date:asc",
                    "status:desc"))
                .build();

        ListPoolsResponse res = sdk.payments().v1().listPools()
                .request(req)
                .call();

        if (res.poolsCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListPoolsRequest](../../models/operations/ListPoolsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListPoolsResponse](../../models/operations/ListPoolsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## listTransferInitiations

List Transfer Initiations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ListTransferInitiationsRequest;
import com.formance.formance_sdk.models.operations.ListTransferInitiationsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListTransferInitiationsRequest req = ListTransferInitiationsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(List.of(
                    "date:asc",
                    "status:desc"))
                .build();

        ListTransferInitiationsResponse res = sdk.payments().v1().listTransferInitiations()
                .request(req)
                .call();

        if (res.transferInitiationsCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListTransferInitiationsRequest](../../models/operations/ListTransferInitiationsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListTransferInitiationsResponse](../../models/operations/ListTransferInitiationsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## paymentsgetAccount

Get an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.PaymentsgetAccountRequest;
import com.formance.formance_sdk.models.operations.PaymentsgetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        PaymentsgetAccountRequest req = PaymentsgetAccountRequest.builder()
                .accountId("XXX")
                .build();

        PaymentsgetAccountResponse res = sdk.payments().v1().paymentsgetAccount()
                .request(req)
                .call();

        if (res.paymentsAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PaymentsgetAccountRequest](../../models/operations/PaymentsgetAccountRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PaymentsgetAccountResponse](../../models/operations/PaymentsgetAccountResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## paymentsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        PaymentsgetServerInfoResponse res = sdk.payments().v1().paymentsgetServerInfo()
                .call();

        if (res.serverInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[PaymentsgetServerInfoResponse](../../models/operations/PaymentsgetServerInfoResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## paymentslistAccounts

List accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.PaymentslistAccountsRequest;
import com.formance.formance_sdk.models.operations.PaymentslistAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        PaymentslistAccountsRequest req = PaymentslistAccountsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(List.of(
                    "date:asc",
                    "status:desc"))
                .build();

        PaymentslistAccountsResponse res = sdk.payments().v1().paymentslistAccounts()
                .request(req)
                .call();

        if (res.accountsCursor().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [PaymentslistAccountsRequest](../../models/operations/PaymentslistAccountsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[PaymentslistAccountsResponse](../../models/operations/PaymentslistAccountsResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## ~~readConnectorConfig~~

Read connector config

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigRequest;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ReadConnectorConfigRequest req = ReadConnectorConfigRequest.builder()
                .connector(Connector.GENERIC)
                .build();

        ReadConnectorConfigResponse res = sdk.payments().v1().readConnectorConfig()
                .request(req)
                .call();

        if (res.connectorConfigResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ReadConnectorConfigRequest](../../models/operations/ReadConnectorConfigRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ReadConnectorConfigResponse](../../models/operations/ReadConnectorConfigResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## readConnectorConfigV1

Read connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Request;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ReadConnectorConfigV1Request req = ReadConnectorConfigV1Request.builder()
                .connector(Connector.CURRENCY_CLOUD)
                .connectorId("XXX")
                .build();

        ReadConnectorConfigV1Response res = sdk.payments().v1().readConnectorConfigV1()
                .request(req)
                .call();

        if (res.connectorConfigResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ReadConnectorConfigV1Request](../../models/operations/ReadConnectorConfigV1Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ReadConnectorConfigV1Response](../../models/operations/ReadConnectorConfigV1Response.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## removeAccountFromPool

Remove an account from a pool by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.RemoveAccountFromPoolRequest;
import com.formance.formance_sdk.models.operations.RemoveAccountFromPoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        RemoveAccountFromPoolRequest req = RemoveAccountFromPoolRequest.builder()
                .accountId("XXX")
                .poolId("XXX")
                .build();

        RemoveAccountFromPoolResponse res = sdk.payments().v1().removeAccountFromPool()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [RemoveAccountFromPoolRequest](../../models/operations/RemoveAccountFromPoolRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[RemoveAccountFromPoolResponse](../../models/operations/RemoveAccountFromPoolResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## ~~resetConnector~~

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ResetConnectorRequest;
import com.formance.formance_sdk.models.operations.ResetConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ResetConnectorRequest req = ResetConnectorRequest.builder()
                .connector(Connector.ATLAR)
                .build();

        ResetConnectorResponse res = sdk.payments().v1().resetConnector()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ResetConnectorRequest](../../models/operations/ResetConnectorRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ResetConnectorResponse](../../models/operations/ResetConnectorResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## resetConnectorV1

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ResetConnectorV1Request;
import com.formance.formance_sdk.models.operations.ResetConnectorV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ResetConnectorV1Request req = ResetConnectorV1Request.builder()
                .connector(Connector.GENERIC)
                .connectorId("XXX")
                .build();

        ResetConnectorV1Response res = sdk.payments().v1().resetConnectorV1()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ResetConnectorV1Request](../../models/operations/ResetConnectorV1Request.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ResetConnectorV1Response](../../models/operations/ResetConnectorV1Response.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## retryTransferInitiation

Retry a failed transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.RetryTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.RetryTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        RetryTransferInitiationRequest req = RetryTransferInitiationRequest.builder()
                .transferId("XXX")
                .build();

        RetryTransferInitiationResponse res = sdk.payments().v1().retryTransferInitiation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RetryTransferInitiationRequest](../../models/operations/RetryTransferInitiationRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RetryTransferInitiationResponse](../../models/operations/RetryTransferInitiationResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## reverseTransferInitiation

Reverse transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.ReverseTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.ReverseTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ReverseTransferInitiationRequest req = ReverseTransferInitiationRequest.builder()
                .reverseTransferInitiationRequest(com.formance.formance_sdk.models.shared.ReverseTransferInitiationRequest.builder()
                    .amount(new BigInteger("327549"))
                    .asset("USD")
                    .description("till gosh how proselytise worriedly whoa")
                    .metadata(Map.ofEntries(
                        Map.entry("key", "<value>")))
                    .reference("XXX")
                    .build())
                .transferId("XXX")
                .build();

        ReverseTransferInitiationResponse res = sdk.payments().v1().reverseTransferInitiation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ReverseTransferInitiationRequest](../../models/operations/ReverseTransferInitiationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ReverseTransferInitiationResponse](../../models/operations/ReverseTransferInitiationResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## udpateTransferInitiationStatus

Update a transfer initiation status

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusRequest;
import com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.Status;
import com.formance.formance_sdk.models.shared.UpdateTransferInitiationStatusRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UdpateTransferInitiationStatusRequest req = UdpateTransferInitiationStatusRequest.builder()
                .updateTransferInitiationStatusRequest(UpdateTransferInitiationStatusRequest.builder()
                    .status(Status.VALIDATED)
                    .build())
                .transferId("XXX")
                .build();

        UdpateTransferInitiationStatusResponse res = sdk.payments().v1().udpateTransferInitiationStatus()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UdpateTransferInitiationStatusRequest](../../models/operations/UdpateTransferInitiationStatusRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UdpateTransferInitiationStatusResponse](../../models/operations/UdpateTransferInitiationStatusResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## ~~uninstallConnector~~

Uninstall a connector by its name.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.UninstallConnectorRequest;
import com.formance.formance_sdk.models.operations.UninstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UninstallConnectorRequest req = UninstallConnectorRequest.builder()
                .connector(Connector.MODULR)
                .build();

        UninstallConnectorResponse res = sdk.payments().v1().uninstallConnector()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UninstallConnectorRequest](../../models/operations/UninstallConnectorRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UninstallConnectorResponse](../../models/operations/UninstallConnectorResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## uninstallConnectorV1

Uninstall a connector by its name.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.UninstallConnectorV1Request;
import com.formance.formance_sdk.models.operations.UninstallConnectorV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UninstallConnectorV1Request req = UninstallConnectorV1Request.builder()
                .connector(Connector.GENERIC)
                .connectorId("XXX")
                .build();

        UninstallConnectorV1Response res = sdk.payments().v1().uninstallConnectorV1()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UninstallConnectorV1Request](../../models/operations/UninstallConnectorV1Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UninstallConnectorV1Response](../../models/operations/UninstallConnectorV1Response.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## updateBankAccountMetadata

Update metadata of a bank account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.UpdateBankAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.UpdateBankAccountMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UpdateBankAccountMetadataRequest req = UpdateBankAccountMetadataRequest.builder()
                .updateBankAccountMetadataRequest(com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("key", "<value>")))
                    .build())
                .bankAccountId("XXX")
                .build();

        UpdateBankAccountMetadataResponse res = sdk.payments().v1().updateBankAccountMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateBankAccountMetadataRequest](../../models/operations/UpdateBankAccountMetadataRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateBankAccountMetadataResponse](../../models/operations/UpdateBankAccountMetadataResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## updateConnectorConfigV1

Update connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Request;
import com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.ConnectorConfig;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.StripeConfig;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UpdateConnectorConfigV1Request req = UpdateConnectorConfigV1Request.builder()
                .connectorConfig(ConnectorConfig.of(StripeConfig.builder()
                    .apiKey("XXX")
                    .name("My Stripe Account")
                    .pageSize(50L)
                    .pollingPeriod("60s")
                    .build()))
                .connector(Connector.ADYEN)
                .connectorId("XXX")
                .build();

        UpdateConnectorConfigV1Response res = sdk.payments().v1().updateConnectorConfigV1()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateConnectorConfigV1Request](../../models/operations/UpdateConnectorConfigV1Request.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateConnectorConfigV1Response](../../models/operations/UpdateConnectorConfigV1Response.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## updateMetadata

Update metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.PaymentsErrorResponse;
import com.formance.formance_sdk.models.operations.UpdateMetadataRequest;
import com.formance.formance_sdk.models.operations.UpdateMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws PaymentsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UpdateMetadataRequest req = UpdateMetadataRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("key", "<value>")))
                .paymentId("XXX")
                .build();

        UpdateMetadataResponse res = sdk.payments().v1().updateMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateMetadataRequest](../../models/operations/UpdateMetadataRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateMetadataResponse](../../models/operations/UpdateMetadataResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |