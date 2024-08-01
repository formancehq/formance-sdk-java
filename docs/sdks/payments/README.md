# Payments
(*payments()*)

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
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            AddAccountToPoolRequest req = AddAccountToPoolRequest.builder()
                .addAccountToPoolRequest(AddAccountToPoolRequest.builder()
                        .accountID("<value>")
                        .build())
                .poolId("XXX")
                .build();

            AddAccountToPoolResponse res = sdk.payments().addAccountToPool()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.AddAccountToPoolRequest](../../models/operations/AddAccountToPoolRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.AddAccountToPoolResponse](../../models/operations/AddAccountToPoolResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## connectorsTransfer

Execute a transfer between two accounts.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
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

            ConnectorsTransferResponse res = sdk.payments().connectorsTransfer()
                .request(req)
                .call();

            if (res.transferResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.ConnectorsTransferRequest](../../models/operations/ConnectorsTransferRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ConnectorsTransferResponse](../../models/operations/ConnectorsTransferResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## createAccount

Create an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            AccountRequest req = AccountRequest.builder()
                .connectorID("<value>")
                .createdAt(OffsetDateTime.parse("2024-08-19T02:15:08.668Z"))
                .reference("<value>")
                .type(AccountType.UNKNOWN)
                .build();

            CreateAccountResponse res = sdk.payments().createAccount()
                .request(req)
                .call();

            if (res.paymentsAccountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [com.formance.formance_sdk.models.shared.AccountRequest](../../models/shared/AccountRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[com.formance.formance_sdk.models.operations.CreateAccountResponse](../../models/operations/CreateAccountResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## createBankAccount

Create a bank account in Payments and on the PSP.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            BankAccountRequest req = BankAccountRequest.builder()
                .connectorID("<value>")
                .country("GB")
                .name("My account")
                .build();

            CreateBankAccountResponse res = sdk.payments().createBankAccount()
                .request(req)
                .call();

            if (res.bankAccountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.formance.formance_sdk.models.shared.BankAccountRequest](../../models/shared/BankAccountRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.formance.formance_sdk.models.operations.CreateBankAccountResponse](../../models/operations/CreateBankAccountResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## createPayment

Create a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            PaymentRequest req = PaymentRequest.builder()
                .amount(new BigInteger("100"))
                .asset("USD")
                .connectorID("<value>")
                .createdAt(OffsetDateTime.parse("2024-11-09T01:03:21.153Z"))
                .reference("<value>")
                .scheme(PaymentScheme.GOOGLE_PAY)
                .status(PaymentStatus.DISPUTE_WON)
                .type(PaymentType.TRANSFER)
                .build();

            CreatePaymentResponse res = sdk.payments().createPayment()
                .request(req)
                .call();

            if (res.paymentResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [com.formance.formance_sdk.models.shared.PaymentRequest](../../models/shared/PaymentRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |


### Response

**[com.formance.formance_sdk.models.operations.CreatePaymentResponse](../../models/operations/CreatePaymentResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## createPool

Create a Pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            PoolRequest req = PoolRequest.builder()
                .accountIDs(java.util.List.of(
                        "<value>"))
                .name("<value>")
                .build();

            CreatePoolResponse res = sdk.payments().createPool()
                .request(req)
                .call();

            if (res.poolResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [com.formance.formance_sdk.models.shared.PoolRequest](../../models/shared/PoolRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[com.formance.formance_sdk.models.operations.CreatePoolResponse](../../models/operations/CreatePoolResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## createTransferInitiation

Create a transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            TransferInitiationRequest req = TransferInitiationRequest.builder()
                .amount(new BigInteger("256698"))
                .asset("USD")
                .description("<value>")
                .destinationAccountID("<value>")
                .reference("XXX")
                .scheduledAt(OffsetDateTime.parse("2023-06-16T18:59:33.654Z"))
                .sourceAccountID("<value>")
                .type(TransferInitiationRequestType.PAYOUT)
                .validated(false)
                .build();

            CreateTransferInitiationResponse res = sdk.payments().createTransferInitiation()
                .request(req)
                .call();

            if (res.transferInitiationResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.shared.TransferInitiationRequest](../../models/shared/TransferInitiationRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.CreateTransferInitiationResponse](../../models/operations/CreateTransferInitiationResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## deletePool

Delete a pool by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            DeletePoolRequest req = DeletePoolRequest.builder()
                .poolId("XXX")
                .build();

            DeletePoolResponse res = sdk.payments().deletePool()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.DeletePoolRequest](../../models/operations/DeletePoolRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.DeletePoolResponse](../../models/operations/DeletePoolResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## deleteTransferInitiation

Delete a transfer initiation by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            DeleteTransferInitiationRequest req = DeleteTransferInitiationRequest.builder()
                .transferId("XXX")
                .build();

            DeleteTransferInitiationResponse res = sdk.payments().deleteTransferInitiation()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [com.formance.formance_sdk.models.operations.DeleteTransferInitiationRequest](../../models/operations/DeleteTransferInitiationRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.DeleteTransferInitiationResponse](../../models/operations/DeleteTransferInitiationResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## forwardBankAccount

Forward a bank account to a connector

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ForwardBankAccountRequest req = ForwardBankAccountRequest.builder()
                .forwardBankAccountRequest(ForwardBankAccountRequest.builder()
                        .connectorID("<value>")
                        .build())
                .bankAccountId("XXX")
                .build();

            ForwardBankAccountResponse res = sdk.payments().forwardBankAccount()
                .request(req)
                .call();

            if (res.bankAccountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.ForwardBankAccountRequest](../../models/operations/ForwardBankAccountRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ForwardBankAccountResponse](../../models/operations/ForwardBankAccountResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getAccountBalances

Get account balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetAccountBalancesRequest req = GetAccountBalancesRequest.builder()
                .accountId("XXX")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(java.util.List.of(
                    "date:asc",
                    "status:desc"))
                .build();

            GetAccountBalancesResponse res = sdk.payments().getAccountBalances()
                .request(req)
                .call();

            if (res.balancesCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.GetAccountBalancesRequest](../../models/operations/GetAccountBalancesRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetAccountBalancesResponse](../../models/operations/GetAccountBalancesResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getBankAccount

Get a bank account created by user on Formance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetBankAccountRequest req = GetBankAccountRequest.builder()
                .bankAccountId("XXX")
                .build();

            GetBankAccountResponse res = sdk.payments().getBankAccount()
                .request(req)
                .call();

            if (res.bankAccountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.GetBankAccountRequest](../../models/operations/GetBankAccountRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.GetBankAccountResponse](../../models/operations/GetBankAccountResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## ~~getConnectorTask~~

Get a specific task associated to the connector.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetConnectorTaskRequest req = GetConnectorTaskRequest.builder()
                .connector(Connector.ADYEN)
                .taskId("task1")
                .build();

            GetConnectorTaskResponse res = sdk.payments().getConnectorTask()
                .request(req)
                .call();

            if (res.taskResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.GetConnectorTaskRequest](../../models/operations/GetConnectorTaskRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.GetConnectorTaskResponse](../../models/operations/GetConnectorTaskResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getConnectorTaskV1

Get a specific task associated to the connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetConnectorTaskV1Request req = GetConnectorTaskV1Request.builder()
                .connector(Connector.BANKING_CIRCLE)
                .connectorId("XXX")
                .taskId("task1")
                .build();

            GetConnectorTaskV1Response res = sdk.payments().getConnectorTaskV1()
                .request(req)
                .call();

            if (res.taskResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.GetConnectorTaskV1Request](../../models/operations/GetConnectorTaskV1Request.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetConnectorTaskV1Response](../../models/operations/GetConnectorTaskV1Response.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getPayment

Get a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetPaymentRequest req = GetPaymentRequest.builder()
                .paymentId("XXX")
                .build();

            GetPaymentResponse res = sdk.payments().getPayment()
                .request(req)
                .call();

            if (res.paymentResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.GetPaymentRequest](../../models/operations/GetPaymentRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetPaymentResponse](../../models/operations/GetPaymentResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getPool

Get a Pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetPoolRequest req = GetPoolRequest.builder()
                .poolId("XXX")
                .build();

            GetPoolResponse res = sdk.payments().getPool()
                .request(req)
                .call();

            if (res.poolResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [com.formance.formance_sdk.models.operations.GetPoolRequest](../../models/operations/GetPoolRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.formance.formance_sdk.models.operations.GetPoolResponse](../../models/operations/GetPoolResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getPoolBalances

Get pool balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetPoolBalancesRequest req = GetPoolBalancesRequest.builder()
                .at(OffsetDateTime.parse("2023-05-05T06:40:23.018Z"))
                .poolId("XXX")
                .build();

            GetPoolBalancesResponse res = sdk.payments().getPoolBalances()
                .request(req)
                .call();

            if (res.poolBalancesResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [com.formance.formance_sdk.models.operations.GetPoolBalancesRequest](../../models/operations/GetPoolBalancesRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.GetPoolBalancesResponse](../../models/operations/GetPoolBalancesResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## getTransferInitiation

Get a transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            GetTransferInitiationRequest req = GetTransferInitiationRequest.builder()
                .transferId("XXX")
                .build();

            GetTransferInitiationResponse res = sdk.payments().getTransferInitiation()
                .request(req)
                .call();

            if (res.transferInitiationResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [com.formance.formance_sdk.models.operations.GetTransferInitiationRequest](../../models/operations/GetTransferInitiationRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.GetTransferInitiationResponse](../../models/operations/GetTransferInitiationResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## installConnector

Install a connector by its name and config.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            InstallConnectorRequest req = InstallConnectorRequest.builder()
                .connectorConfig(ConnectorConfig.of(WiseConfig.builder()
                            .apiKey("XXX")
                            .name("My Wise Account")
                            .pollingPeriod("60s")
                            .build()))
                .connector(Connector.ADYEN)
                .build();

            InstallConnectorResponse res = sdk.payments().installConnector()
                .request(req)
                .call();

            if (res.connectorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.InstallConnectorRequest](../../models/operations/InstallConnectorRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.InstallConnectorResponse](../../models/operations/InstallConnectorResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listAllConnectors

List all installed connectors.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListAllConnectorsResponse res = sdk.payments().listAllConnectors()
                .call();

            if (res.connectorsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListAllConnectorsResponse](../../models/operations/ListAllConnectorsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listBankAccounts

List all bank accounts created by user on Formance.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListBankAccountsRequest req = ListBankAccountsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(java.util.List.of(
                    "date:asc",
                    "status:desc"))
                .build();

            ListBankAccountsResponse res = sdk.payments().listBankAccounts()
                .request(req)
                .call();

            if (res.bankAccountsCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.ListBankAccountsRequest](../../models/operations/ListBankAccountsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.ListBankAccountsResponse](../../models/operations/ListBankAccountsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listConfigsAvailableConnectors

List the configs of each available connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListConfigsAvailableConnectorsResponse res = sdk.payments().listConfigsAvailableConnectors()
                .call();

            if (res.connectorsConfigsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse](../../models/operations/ListConfigsAvailableConnectorsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## ~~listConnectorTasks~~

List all tasks associated with this connector.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListConnectorTasksRequest req = ListConnectorTasksRequest.builder()
                .connector(Connector.MODULR)
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            ListConnectorTasksResponse res = sdk.payments().listConnectorTasks()
                .request(req)
                .call();

            if (res.tasksCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.ListConnectorTasksRequest](../../models/operations/ListConnectorTasksRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ListConnectorTasksResponse](../../models/operations/ListConnectorTasksResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listConnectorTasksV1

List all tasks associated with this connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListConnectorTasksV1Request req = ListConnectorTasksV1Request.builder()
                .connector(Connector.BANKING_CIRCLE)
                .connectorId("XXX")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            ListConnectorTasksV1Response res = sdk.payments().listConnectorTasksV1()
                .request(req)
                .call();

            if (res.tasksCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [com.formance.formance_sdk.models.operations.ListConnectorTasksV1Request](../../models/operations/ListConnectorTasksV1Request.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListConnectorTasksV1Response](../../models/operations/ListConnectorTasksV1Response.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listPayments

List payments

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListPaymentsRequest req = ListPaymentsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(java.util.List.of(
                    "date:asc",
                    "status:desc"))
                .build();

            ListPaymentsResponse res = sdk.payments().listPayments()
                .request(req)
                .call();

            if (res.paymentsCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.ListPaymentsRequest](../../models/operations/ListPaymentsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListPaymentsResponse](../../models/operations/ListPaymentsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listPools

List Pools

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListPoolsRequest req = ListPoolsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(java.util.List.of(
                    "date:asc",
                    "status:desc"))
                .build();

            ListPoolsResponse res = sdk.payments().listPools()
                .request(req)
                .call();

            if (res.poolsCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.ListPoolsRequest](../../models/operations/ListPoolsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.ListPoolsResponse](../../models/operations/ListPoolsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## listTransferInitiations

List Transfer Initiations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ListTransferInitiationsRequest req = ListTransferInitiationsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(java.util.List.of(
                    "date:asc",
                    "status:desc"))
                .build();

            ListTransferInitiationsResponse res = sdk.payments().listTransferInitiations()
                .request(req)
                .call();

            if (res.transferInitiationsCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.ListTransferInitiationsRequest](../../models/operations/ListTransferInitiationsRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.ListTransferInitiationsResponse](../../models/operations/ListTransferInitiationsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## paymentsgetAccount

Get an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            PaymentsgetAccountRequest req = PaymentsgetAccountRequest.builder()
                .accountId("XXX")
                .build();

            PaymentsgetAccountResponse res = sdk.payments().paymentsgetAccount()
                .request(req)
                .call();

            if (res.paymentsAccountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.PaymentsgetAccountRequest](../../models/operations/PaymentsgetAccountRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.PaymentsgetAccountResponse](../../models/operations/PaymentsgetAccountResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## paymentsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            PaymentsgetServerInfoResponse res = sdk.payments().paymentsgetServerInfo()
                .call();

            if (res.serverInfo().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse](../../models/operations/PaymentsgetServerInfoResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## paymentslistAccounts

List accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            PaymentslistAccountsRequest req = PaymentslistAccountsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort(java.util.List.of(
                    "date:asc",
                    "status:desc"))
                .build();

            PaymentslistAccountsResponse res = sdk.payments().paymentslistAccounts()
                .request(req)
                .call();

            if (res.accountsCursor().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [com.formance.formance_sdk.models.operations.PaymentslistAccountsRequest](../../models/operations/PaymentslistAccountsRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.PaymentslistAccountsResponse](../../models/operations/PaymentslistAccountsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## ~~readConnectorConfig~~

Read connector config

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ReadConnectorConfigRequest req = ReadConnectorConfigRequest.builder()
                .connector(Connector.GENERIC)
                .build();

            ReadConnectorConfigResponse res = sdk.payments().readConnectorConfig()
                .request(req)
                .call();

            if (res.connectorConfigResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.ReadConnectorConfigRequest](../../models/operations/ReadConnectorConfigRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ReadConnectorConfigResponse](../../models/operations/ReadConnectorConfigResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## readConnectorConfigV1

Read connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ReadConnectorConfigV1Request req = ReadConnectorConfigV1Request.builder()
                .connector(Connector.CURRENCY_CLOUD)
                .connectorId("XXX")
                .build();

            ReadConnectorConfigV1Response res = sdk.payments().readConnectorConfigV1()
                .request(req)
                .call();

            if (res.connectorConfigResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Request](../../models/operations/ReadConnectorConfigV1Request.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Response](../../models/operations/ReadConnectorConfigV1Response.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## removeAccountFromPool

Remove an account from a pool by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            RemoveAccountFromPoolRequest req = RemoveAccountFromPoolRequest.builder()
                .accountId("XXX")
                .poolId("XXX")
                .build();

            RemoveAccountFromPoolResponse res = sdk.payments().removeAccountFromPool()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [com.formance.formance_sdk.models.operations.RemoveAccountFromPoolRequest](../../models/operations/RemoveAccountFromPoolRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.RemoveAccountFromPoolResponse](../../models/operations/RemoveAccountFromPoolResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## ~~resetConnector~~

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ResetConnectorRequest req = ResetConnectorRequest.builder()
                .connector(Connector.ATLAR)
                .build();

            ResetConnectorResponse res = sdk.payments().resetConnector()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.ResetConnectorRequest](../../models/operations/ResetConnectorRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.ResetConnectorResponse](../../models/operations/ResetConnectorResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## resetConnectorV1

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ResetConnectorV1Request req = ResetConnectorV1Request.builder()
                .connector(Connector.GENERIC)
                .connectorId("XXX")
                .build();

            ResetConnectorV1Response res = sdk.payments().resetConnectorV1()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.ResetConnectorV1Request](../../models/operations/ResetConnectorV1Request.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.ResetConnectorV1Response](../../models/operations/ResetConnectorV1Response.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## retryTransferInitiation

Retry a failed transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            RetryTransferInitiationRequest req = RetryTransferInitiationRequest.builder()
                .transferId("XXX")
                .build();

            RetryTransferInitiationResponse res = sdk.payments().retryTransferInitiation()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.RetryTransferInitiationRequest](../../models/operations/RetryTransferInitiationRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.RetryTransferInitiationResponse](../../models/operations/RetryTransferInitiationResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## reverseTransferInitiation

Reverse transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            ReverseTransferInitiationRequest req = ReverseTransferInitiationRequest.builder()
                .reverseTransferInitiationRequest(ReverseTransferInitiationRequest.builder()
                        .amount(new BigInteger("327549"))
                        .asset("USD")
                        .description("<value>")
                        .metadata(java.util.Map.ofEntries(
                                entry("key", "<value>")))
                        .reference("XXX")
                        .build())
                .transferId("XXX")
                .build();

            ReverseTransferInitiationResponse res = sdk.payments().reverseTransferInitiation()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [com.formance.formance_sdk.models.operations.ReverseTransferInitiationRequest](../../models/operations/ReverseTransferInitiationRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.ReverseTransferInitiationResponse](../../models/operations/ReverseTransferInitiationResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## udpateTransferInitiationStatus

Update a transfer initiation status

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            UdpateTransferInitiationStatusRequest req = UdpateTransferInitiationStatusRequest.builder()
                .updateTransferInitiationStatusRequest(UpdateTransferInitiationStatusRequest.builder()
                        .status(Status.VALIDATED)
                        .build())
                .transferId("XXX")
                .build();

            UdpateTransferInitiationStatusResponse res = sdk.payments().udpateTransferInitiationStatus()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                             | [com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusRequest](../../models/operations/UdpateTransferInitiationStatusRequest.md) | :heavy_check_mark:                                                                                                                                    | The request object to use for the request.                                                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusResponse](../../models/operations/UdpateTransferInitiationStatusResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## ~~uninstallConnector~~

Uninstall a connector by its name.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            UninstallConnectorRequest req = UninstallConnectorRequest.builder()
                .connector(Connector.MODULR)
                .build();

            UninstallConnectorResponse res = sdk.payments().uninstallConnector()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.UninstallConnectorRequest](../../models/operations/UninstallConnectorRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.UninstallConnectorResponse](../../models/operations/UninstallConnectorResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## uninstallConnectorV1

Uninstall a connector by its name.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            UninstallConnectorV1Request req = UninstallConnectorV1Request.builder()
                .connector(Connector.GENERIC)
                .connectorId("XXX")
                .build();

            UninstallConnectorV1Response res = sdk.payments().uninstallConnectorV1()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [com.formance.formance_sdk.models.operations.UninstallConnectorV1Request](../../models/operations/UninstallConnectorV1Request.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.UninstallConnectorV1Response](../../models/operations/UninstallConnectorV1Response.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## updateBankAccountMetadata

Update metadata of a bank account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            UpdateBankAccountMetadataRequest req = UpdateBankAccountMetadataRequest.builder()
                .updateBankAccountMetadataRequest(UpdateBankAccountMetadataRequest.builder()
                        .metadata(java.util.Map.ofEntries(
                                entry("key", "<value>")))
                        .build())
                .bankAccountId("XXX")
                .build();

            UpdateBankAccountMetadataResponse res = sdk.payments().updateBankAccountMetadata()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [com.formance.formance_sdk.models.operations.UpdateBankAccountMetadataRequest](../../models/operations/UpdateBankAccountMetadataRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.UpdateBankAccountMetadataResponse](../../models/operations/UpdateBankAccountMetadataResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## updateConnectorConfigV1

Update connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            UpdateConnectorConfigV1Request req = UpdateConnectorConfigV1Request.builder()
                .connectorConfig(ConnectorConfig.of(StripeConfig.builder()
                            .apiKey("XXX")
                            .name("My Stripe Account")
                            .pageSize(50L)
                            .pollingPeriod("60s")
                            .build()))
                .connector(Connector.STRIPE)
                .connectorId("XXX")
                .build();

            UpdateConnectorConfigV1Response res = sdk.payments().updateConnectorConfigV1()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Request](../../models/operations/UpdateConnectorConfigV1Request.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Response](../../models/operations/UpdateConnectorConfigV1Response.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## updateMetadata

Update metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("")
                    .clientSecret("")
                    .build())
                .build();

            UpdateMetadataRequest req = UpdateMetadataRequest.builder()
                .requestBody(java.util.Map.ofEntries(
                        entry("key", "<value>")))
                .paymentId("XXX")
                .build();

            UpdateMetadataResponse res = sdk.payments().updateMetadata()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.PaymentsErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.UpdateMetadataRequest](../../models/operations/UpdateMetadataRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.UpdateMetadataResponse](../../models/operations/UpdateMetadataResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/PaymentsErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
