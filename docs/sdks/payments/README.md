# Payments
(*payments*)

### Available Operations

* [addAccountToPool](#addaccounttopool) - Add an account to a pool
* [connectorsTransfer](#connectorstransfer) - Transfer funds between Connector accounts
* [createBankAccount](#createbankaccount) - Create a BankAccount in Payments and on the PSP
* [createPayment](#createpayment) - Create a payment
* [createPool](#createpool) - Create a Pool
* [createTransferInitiation](#createtransferinitiation) - Create a TransferInitiation
* [deletePool](#deletepool) - Delete a Pool
* [deleteTransferInitiation](#deletetransferinitiation) - Delete a transfer initiation
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
* [updateConnectorConfigV1](#updateconnectorconfigv1) - Update the config of a connector
* [updateMetadata](#updatemetadata) - Update metadata

## addAccountToPool

Add an account to a pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.AddAccountToPoolRequest;
import com.formance.formance_sdk.models.operations.AddAccountToPoolResponse;
import com.formance.formance_sdk.models.shared.AddAccountToPoolRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.AddAccountToPoolRequest req = new AddAccountToPoolRequest(
                new AddAccountToPoolRequest(
                    "string"),
                "string");

            com.formance.formance_sdk.models.operations.AddAccountToPoolResponse res = sdk.payments.addAccountToPool(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## connectorsTransfer

Execute a transfer between two accounts.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ConnectorsTransferRequest;
import com.formance.formance_sdk.models.operations.ConnectorsTransferResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransferRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ConnectorsTransferRequest req = new ConnectorsTransferRequest(
                new TransferRequest(
                    100L,
                    "USD",
                    "acct_1Gqj58KZcSIg2N2q"){{
                    source = "acct_1Gqj58KZcSIg2N2q";

                }},
                Connector.CURRENCY_CLOUD);

            com.formance.formance_sdk.models.operations.ConnectorsTransferResponse res = sdk.payments.connectorsTransfer(req);

            if (res.transferResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## createBankAccount

Create a bank account in Payments and on the PSP.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateBankAccountResponse;
import com.formance.formance_sdk.models.shared.BankAccountRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.shared.BankAccountRequest req = new BankAccountRequest(
                "string",
                "GB",
                "My account"){{
                accountNumber = "string";
                iban = "HU80500236840980904027018003";
                metadata = new java.util.HashMap<String, String>(
                ){{
                    put("key", "string");
                }};
                swiftBicCode = "string";

            }};

            com.formance.formance_sdk.models.operations.CreateBankAccountResponse res = sdk.payments.createBankAccount(req);

            if (res.bankAccountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## createPayment

Create a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreatePaymentResponse;
import com.formance.formance_sdk.models.shared.PaymentRequest;
import com.formance.formance_sdk.models.shared.PaymentScheme;
import com.formance.formance_sdk.models.shared.PaymentStatus;
import com.formance.formance_sdk.models.shared.PaymentType;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.shared.PaymentRequest req = new PaymentRequest(
                100L,
                "USD",
                "string",
                OffsetDateTime.parse("2024-11-09T01:03:21.153Z"),
                "string",
                PaymentScheme.GOOGLE_PAY,
                PaymentStatus.DISPUTE_WON,
                PaymentType.TRANSFER){{
                destinationAccountID = "string";
                sourceAccountID = "string";

            }};

            com.formance.formance_sdk.models.operations.CreatePaymentResponse res = sdk.payments.createPayment(req);

            if (res.paymentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## createPool

Create a Pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreatePoolResponse;
import com.formance.formance_sdk.models.shared.PoolRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.shared.PoolRequest req = new PoolRequest(
                new String[]{{
                    add("string"),
                }},
                "string");

            com.formance.formance_sdk.models.operations.CreatePoolResponse res = sdk.payments.createPool(req);

            if (res.poolResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## createTransferInitiation

Create a transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransferInitiationRequest;
import com.formance.formance_sdk.models.shared.TransferInitiationRequestType;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.shared.TransferInitiationRequest req = new TransferInitiationRequest(
                256698L,
                "USD",
                "string",
                "string",
                "XXX",
                OffsetDateTime.parse("2023-06-16T18:59:33.654Z"),
                "string",
                TransferInitiationRequestType.PAYOUT,
                false){{
                connectorID = "string";
                metadata = new java.util.HashMap<String, String>(
                ){{
                    put("key", "string");
                }};
                provider = Connector.MANGOPAY;

            }};

            com.formance.formance_sdk.models.operations.CreateTransferInitiationResponse res = sdk.payments.createTransferInitiation(req);

            if (res.transferInitiationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## deletePool

Delete a pool by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeletePoolRequest;
import com.formance.formance_sdk.models.operations.DeletePoolResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.DeletePoolRequest req = new DeletePoolRequest(
                "string");

            com.formance.formance_sdk.models.operations.DeletePoolResponse res = sdk.payments.deletePool(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## deleteTransferInitiation

Delete a transfer initiation by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.DeleteTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.DeleteTransferInitiationRequest req = new DeleteTransferInitiationRequest(
                "string");

            com.formance.formance_sdk.models.operations.DeleteTransferInitiationResponse res = sdk.payments.deleteTransferInitiation(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getAccountBalances

Get account balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetAccountBalancesRequest;
import com.formance.formance_sdk.models.operations.GetAccountBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetAccountBalancesRequest req = new GetAccountBalancesRequest(
                "string"){{
                asset = "string";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                from = OffsetDateTime.parse("2023-02-05T05:11:20.042Z");
                limit = 743236L;
                pageSize = 125462L;
                sort = new String[]{{
                    add("string"),
                }};
                to = OffsetDateTime.parse("2023-07-15T08:57:06.406Z");

            }};

            com.formance.formance_sdk.models.operations.GetAccountBalancesResponse res = sdk.payments.getAccountBalances(req);

            if (res.balancesCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getBankAccount

Get a bank account created by user on Formance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetBankAccountRequest;
import com.formance.formance_sdk.models.operations.GetBankAccountResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetBankAccountRequest req = new GetBankAccountRequest(
                "string");

            com.formance.formance_sdk.models.operations.GetBankAccountResponse res = sdk.payments.getBankAccount(req);

            if (res.bankAccountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## ~~getConnectorTask~~

Get a specific task associated to the connector.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetConnectorTaskRequest;
import com.formance.formance_sdk.models.operations.GetConnectorTaskResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetConnectorTaskRequest req = new GetConnectorTaskRequest(
                Connector.ATLAR,
                "string");

            com.formance.formance_sdk.models.operations.GetConnectorTaskResponse res = sdk.payments.getConnectorTask(req);

            if (res.taskResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getConnectorTaskV1

Get a specific task associated to the connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetConnectorTaskV1Request;
import com.formance.formance_sdk.models.operations.GetConnectorTaskV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetConnectorTaskV1Request req = new GetConnectorTaskV1Request(
                Connector.CURRENCY_CLOUD,
                "string",
                "string");

            com.formance.formance_sdk.models.operations.GetConnectorTaskV1Response res = sdk.payments.getConnectorTaskV1(req);

            if (res.taskResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getPayment

Get a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetPaymentRequest;
import com.formance.formance_sdk.models.operations.GetPaymentResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetPaymentRequest req = new GetPaymentRequest(
                "string");

            com.formance.formance_sdk.models.operations.GetPaymentResponse res = sdk.payments.getPayment(req);

            if (res.paymentResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getPool

Get a Pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetPoolRequest;
import com.formance.formance_sdk.models.operations.GetPoolResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetPoolRequest req = new GetPoolRequest(
                "string");

            com.formance.formance_sdk.models.operations.GetPoolResponse res = sdk.payments.getPool(req);

            if (res.poolResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getPoolBalances

Get pool balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetPoolBalancesRequest;
import com.formance.formance_sdk.models.operations.GetPoolBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetPoolBalancesRequest req = new GetPoolBalancesRequest(
                OffsetDateTime.parse("2023-05-05T06:40:23.018Z"),
                "string");

            com.formance.formance_sdk.models.operations.GetPoolBalancesResponse res = sdk.payments.getPoolBalances(req);

            if (res.poolBalancesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## getTransferInitiation

Get a transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.GetTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetTransferInitiationRequest req = new GetTransferInitiationRequest(
                "string");

            com.formance.formance_sdk.models.operations.GetTransferInitiationResponse res = sdk.payments.getTransferInitiation(req);

            if (res.transferInitiationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## installConnector

Install a connector by its name and config.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.InstallConnectorRequest;
import com.formance.formance_sdk.models.operations.InstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.InstallConnectorRequest req = new InstallConnectorRequest(
                "string",
                Connector.WISE);

            com.formance.formance_sdk.models.operations.InstallConnectorResponse res = sdk.payments.installConnector(req);

            if (res.connectorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## listAllConnectors

List all installed connectors.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListAllConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListAllConnectorsResponse res = sdk.payments.listAllConnectors();

            if (res.connectorsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListAllConnectorsResponse](../../models/operations/ListAllConnectorsResponse.md)**


## listBankAccounts

List all bank accounts created by user on Formance.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListBankAccountsRequest;
import com.formance.formance_sdk.models.operations.ListBankAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListBankAccountsRequest req = new ListBankAccountsRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 578999L;
                sort = new String[]{{
                    add("string"),
                }};

            }};

            com.formance.formance_sdk.models.operations.ListBankAccountsResponse res = sdk.payments.listBankAccounts(req);

            if (res.bankAccountsCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## listConfigsAvailableConnectors

List the configs of each available connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse res = sdk.payments.listConfigsAvailableConnectors();

            if (res.connectorsConfigsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse](../../models/operations/ListConfigsAvailableConnectorsResponse.md)**


## ~~listConnectorTasks~~

List all tasks associated with this connector.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListConnectorTasksRequest;
import com.formance.formance_sdk.models.operations.ListConnectorTasksResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListConnectorTasksRequest req = new ListConnectorTasksRequest(
                Connector.WISE){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 501686L;

            }};

            com.formance.formance_sdk.models.operations.ListConnectorTasksResponse res = sdk.payments.listConnectorTasks(req);

            if (res.tasksCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## listConnectorTasksV1

List all tasks associated with this connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListConnectorTasksV1Request;
import com.formance.formance_sdk.models.operations.ListConnectorTasksV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListConnectorTasksV1Request req = new ListConnectorTasksV1Request(
                Connector.BANKING_CIRCLE,
                "string"){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 442673L;

            }};

            com.formance.formance_sdk.models.operations.ListConnectorTasksV1Response res = sdk.payments.listConnectorTasksV1(req);

            if (res.tasksCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## listPayments

List payments

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListPaymentsRequest;
import com.formance.formance_sdk.models.operations.ListPaymentsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListPaymentsRequest req = new ListPaymentsRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 13778L;
                sort = new String[]{{
                    add("string"),
                }};

            }};

            com.formance.formance_sdk.models.operations.ListPaymentsResponse res = sdk.payments.listPayments(req);

            if (res.paymentsCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## listPools

List Pools

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListPoolsRequest;
import com.formance.formance_sdk.models.operations.ListPoolsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListPoolsRequest req = new ListPoolsRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 567687L;
                query = "string";
                sort = new String[]{{
                    add("string"),
                }};

            }};

            com.formance.formance_sdk.models.operations.ListPoolsResponse res = sdk.payments.listPools(req);

            if (res.poolsCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## listTransferInitiations

List Transfer Initiations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListTransferInitiationsRequest;
import com.formance.formance_sdk.models.operations.ListTransferInitiationsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListTransferInitiationsRequest req = new ListTransferInitiationsRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 706689L;
                query = "string";
                sort = new String[]{{
                    add("string"),
                }};

            }};

            com.formance.formance_sdk.models.operations.ListTransferInitiationsResponse res = sdk.payments.listTransferInitiations(req);

            if (res.transferInitiationsCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## paymentsgetAccount

Get an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.PaymentsgetAccountRequest;
import com.formance.formance_sdk.models.operations.PaymentsgetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.PaymentsgetAccountRequest req = new PaymentsgetAccountRequest(
                "string");

            com.formance.formance_sdk.models.operations.PaymentsgetAccountResponse res = sdk.payments.paymentsgetAccount(req);

            if (res.paymentsAccountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## paymentsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse res = sdk.payments.paymentsgetServerInfo();

            if (res.serverInfo != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse](../../models/operations/PaymentsgetServerInfoResponse.md)**


## paymentslistAccounts

List accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.PaymentslistAccountsRequest;
import com.formance.formance_sdk.models.operations.PaymentslistAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.PaymentslistAccountsRequest req = new PaymentslistAccountsRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 227071L;
                sort = new String[]{{
                    add("string"),
                }};

            }};

            com.formance.formance_sdk.models.operations.PaymentslistAccountsResponse res = sdk.payments.paymentslistAccounts(req);

            if (res.accountsCursor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## ~~readConnectorConfig~~

Read connector config

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigRequest;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ReadConnectorConfigRequest req = new ReadConnectorConfigRequest(
                Connector.ADYEN);

            com.formance.formance_sdk.models.operations.ReadConnectorConfigResponse res = sdk.payments.readConnectorConfig(req);

            if (res.connectorConfigResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## readConnectorConfigV1

Read connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Request;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Request req = new ReadConnectorConfigV1Request(
                Connector.CURRENCY_CLOUD,
                "string");

            com.formance.formance_sdk.models.operations.ReadConnectorConfigV1Response res = sdk.payments.readConnectorConfigV1(req);

            if (res.connectorConfigResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## removeAccountFromPool

Remove an account from a pool by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.RemoveAccountFromPoolRequest;
import com.formance.formance_sdk.models.operations.RemoveAccountFromPoolResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.RemoveAccountFromPoolRequest req = new RemoveAccountFromPoolRequest(
                "string",
                "string");

            com.formance.formance_sdk.models.operations.RemoveAccountFromPoolResponse res = sdk.payments.removeAccountFromPool(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## ~~resetConnector~~

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ResetConnectorRequest;
import com.formance.formance_sdk.models.operations.ResetConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ResetConnectorRequest req = new ResetConnectorRequest(
                Connector.MONEYCORP);

            com.formance.formance_sdk.models.operations.ResetConnectorResponse res = sdk.payments.resetConnector(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## resetConnectorV1

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ResetConnectorV1Request;
import com.formance.formance_sdk.models.operations.ResetConnectorV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ResetConnectorV1Request req = new ResetConnectorV1Request(
                Connector.ADYEN,
                "string");

            com.formance.formance_sdk.models.operations.ResetConnectorV1Response res = sdk.payments.resetConnectorV1(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## retryTransferInitiation

Retry a failed transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.RetryTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.RetryTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.RetryTransferInitiationRequest req = new RetryTransferInitiationRequest(
                "string");

            com.formance.formance_sdk.models.operations.RetryTransferInitiationResponse res = sdk.payments.retryTransferInitiation(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## reverseTransferInitiation

Reverse transfer initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReverseTransferInitiationRequest;
import com.formance.formance_sdk.models.operations.ReverseTransferInitiationResponse;
import com.formance.formance_sdk.models.shared.ReverseTransferInitiationRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ReverseTransferInitiationRequest req = new ReverseTransferInitiationRequest(
                new ReverseTransferInitiationRequest(
                    327549L,
                    "USD",
                    "string",
                    new java.util.HashMap<String, String>(
                    ){{
                        put("key", "string");
                    }},
                    "XXX"),
                "string");

            com.formance.formance_sdk.models.operations.ReverseTransferInitiationResponse res = sdk.payments.reverseTransferInitiation(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## udpateTransferInitiationStatus

Update a transfer initiation status

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusRequest;
import com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.Status;
import com.formance.formance_sdk.models.shared.UpdateTransferInitiationStatusRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusRequest req = new UdpateTransferInitiationStatusRequest(
                new UpdateTransferInitiationStatusRequest(
                    Status.VALIDATED),
                "string");

            com.formance.formance_sdk.models.operations.UdpateTransferInitiationStatusResponse res = sdk.payments.udpateTransferInitiationStatus(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## ~~uninstallConnector~~

Uninstall a connector by its name.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UninstallConnectorRequest;
import com.formance.formance_sdk.models.operations.UninstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.UninstallConnectorRequest req = new UninstallConnectorRequest(
                Connector.WISE);

            com.formance.formance_sdk.models.operations.UninstallConnectorResponse res = sdk.payments.uninstallConnector(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## uninstallConnectorV1

Uninstall a connector by its name.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UninstallConnectorV1Request;
import com.formance.formance_sdk.models.operations.UninstallConnectorV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.UninstallConnectorV1Request req = new UninstallConnectorV1Request(
                Connector.ADYEN,
                "string");

            com.formance.formance_sdk.models.operations.UninstallConnectorV1Response res = sdk.payments.uninstallConnectorV1(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## updateConnectorConfigV1

Update connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Request;
import com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Response;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Request req = new UpdateConnectorConfigV1Request(
                "string",
                Connector.STRIPE,
                "string");

            com.formance.formance_sdk.models.operations.UpdateConnectorConfigV1Response res = sdk.payments.updateConnectorConfigV1(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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


## updateMetadata

Update metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateMetadataRequest;
import com.formance.formance_sdk.models.operations.UpdateMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.UpdateMetadataRequest req = new UpdateMetadataRequest(
                new java.util.HashMap<String, String>(
                ){{
                    put("key", "string");
                }},
                "string");

            com.formance.formance_sdk.models.operations.UpdateMetadataResponse res = sdk.payments.updateMetadata(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

