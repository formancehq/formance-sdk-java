# V3
(*payments().v3()*)

## Overview

### Available Operations

* [addAccountToPool](#addaccounttopool) - Add an account to a pool
* [approvePaymentInitiation](#approvepaymentinitiation) - Approve a payment initiation
* [createAccount](#createaccount) - Create a formance account object. This object will not be forwarded to the connector. It is only used for internal purposes.

* [createBankAccount](#createbankaccount) - Create a formance bank account object. This object will not be forwarded to the connector until you called the forwardBankAccount method.

* [createPayment](#createpayment) - Create a formance payment object. This object will not be forwarded to the connector. It is only used for internal purposes.

* [createPool](#createpool) - Create a formance pool object
* [deletePaymentInitiation](#deletepaymentinitiation) - Delete a payment initiation by ID
* [deletePool](#deletepool) - Delete a pool by ID
* [forwardBankAccount](#forwardbankaccount) - Forward a Bank Account to a PSP for creation
* [getAccount](#getaccount) - Get an account by ID
* [getAccountBalances](#getaccountbalances) - Get account balances
* [getBankAccount](#getbankaccount) - Get a Bank Account by ID
* [getConnectorConfig](#getconnectorconfig) - Get a connector configuration by ID
* [getConnectorSchedule](#getconnectorschedule) - Get a connector schedule by ID
* [getPayment](#getpayment) - Get a payment by ID
* [getPaymentInitiation](#getpaymentinitiation) - Get a payment initiation by ID
* [getPool](#getpool) - Get a pool by ID
* [getPoolBalances](#getpoolbalances) - Get pool balances
* [getTask](#gettask) - Get a task and its result by ID
* [initiatePayment](#initiatepayment) - Initiate a payment
* [installConnector](#installconnector) - Install a connector
* [listAccounts](#listaccounts) - List all accounts
* [listBankAccounts](#listbankaccounts) - List all bank accounts
* [listConnectorConfigs](#listconnectorconfigs) - List all connector configurations
* [listConnectorScheduleInstances](#listconnectorscheduleinstances) - List all connector schedule instances
* [listConnectorSchedules](#listconnectorschedules) - List all connector schedules
* [listConnectors](#listconnectors) - List all connectors
* [listPaymentInitiationAdjustments](#listpaymentinitiationadjustments) - List all payment initiation adjustments
* [listPaymentInitiationRelatedPayments](#listpaymentinitiationrelatedpayments) - List all payments related to a payment initiation
* [listPaymentInitiations](#listpaymentinitiations) - List all payment initiations
* [listPayments](#listpayments) - List all payments
* [listPools](#listpools) - List all pools
* [rejectPaymentInitiation](#rejectpaymentinitiation) - Reject a payment initiation
* [removeAccountFromPool](#removeaccountfrompool) - Remove an account from a pool
* [resetConnector](#resetconnector) - Reset a connector. Be aware that this will delete all data and stop all existing tasks like payment initiations and bank account creations.
* [retryPaymentInitiation](#retrypaymentinitiation) - Retry a payment initiation
* [reversePaymentInitiation](#reversepaymentinitiation) - Reverse a payment initiation
* [uninstallConnector](#uninstallconnector) - Uninstall a connector
* [updateBankAccountMetadata](#updatebankaccountmetadata) - Update a bank account's metadata
* [updatePaymentMetadata](#updatepaymentmetadata) - Update a payment's metadata

## addAccountToPool

Add an account to a pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3AddAccountToPoolRequest;
import com.formance.formance_sdk.models.operations.V3AddAccountToPoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3AddAccountToPoolRequest req = V3AddAccountToPoolRequest.builder()
                .accountID("<id>")
                .poolID("<id>")
                .build();

        V3AddAccountToPoolResponse res = sdk.payments().v3().addAccountToPool()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [V3AddAccountToPoolRequest](../../models/operations/V3AddAccountToPoolRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[V3AddAccountToPoolResponse](../../models/operations/V3AddAccountToPoolResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## approvePaymentInitiation

Approve a payment initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ApprovePaymentInitiationRequest;
import com.formance.formance_sdk.models.operations.V3ApprovePaymentInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ApprovePaymentInitiationRequest req = V3ApprovePaymentInitiationRequest.builder()
                .paymentInitiationID("<id>")
                .build();

        V3ApprovePaymentInitiationResponse res = sdk.payments().v3().approvePaymentInitiation()
                .request(req)
                .call();

        if (res.v3ApprovePaymentInitiationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [V3ApprovePaymentInitiationRequest](../../models/operations/V3ApprovePaymentInitiationRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[V3ApprovePaymentInitiationResponse](../../models/operations/V3ApprovePaymentInitiationResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createAccount

Create a formance account object. This object will not be forwarded to the connector. It is only used for internal purposes.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3CreateAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V3AccountTypeEnum;
import com.formance.formance_sdk.models.shared.V3CreateAccountRequest;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3CreateAccountRequest req = V3CreateAccountRequest.builder()
                .accountName("<value>")
                .connectorID("<value>")
                .createdAt(OffsetDateTime.parse("2023-08-09T11:34:36.410Z"))
                .reference("<value>")
                .type(V3AccountTypeEnum.UNKNOWN)
                .build();

        V3CreateAccountResponse res = sdk.payments().v3().createAccount()
                .request(req)
                .call();

        if (res.v3CreateAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V3CreateAccountRequest](../../models/shared/V3CreateAccountRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V3CreateAccountResponse](../../models/operations/V3CreateAccountResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createBankAccount

Create a formance bank account object. This object will not be forwarded to the connector until you called the forwardBankAccount method.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3CreateBankAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V3CreateBankAccountRequest;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3CreateBankAccountRequest req = V3CreateBankAccountRequest.builder()
                .name("<value>")
                .build();

        V3CreateBankAccountResponse res = sdk.payments().v3().createBankAccount()
                .request(req)
                .call();

        if (res.v3CreateBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [V3CreateBankAccountRequest](../../models/shared/V3CreateBankAccountRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[V3CreateBankAccountResponse](../../models/operations/V3CreateBankAccountResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createPayment

Create a formance payment object. This object will not be forwarded to the connector. It is only used for internal purposes.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3CreatePaymentResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V3CreatePaymentRequest;
import com.formance.formance_sdk.models.shared.V3PaymentTypeEnum;
import java.lang.Exception;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3CreatePaymentRequest req = V3CreatePaymentRequest.builder()
                .amount(new BigInteger("252554"))
                .asset("<value>")
                .connectorID("<value>")
                .createdAt(OffsetDateTime.parse("2024-12-31T19:31:25.838Z"))
                .initialAmount(new BigInteger("581056"))
                .reference("<value>")
                .scheme("<value>")
                .type(V3PaymentTypeEnum.PAYOUT)
                .build();

        V3CreatePaymentResponse res = sdk.payments().v3().createPayment()
                .request(req)
                .call();

        if (res.v3CreatePaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V3CreatePaymentRequest](../../models/shared/V3CreatePaymentRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V3CreatePaymentResponse](../../models/operations/V3CreatePaymentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createPool

Create a formance pool object

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3CreatePoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V3CreatePoolRequest;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3CreatePoolRequest req = V3CreatePoolRequest.builder()
                .accountIDs(List.of(
                    "<value>"))
                .name("<value>")
                .build();

        V3CreatePoolResponse res = sdk.payments().v3().createPool()
                .request(req)
                .call();

        if (res.v3CreatePoolResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [V3CreatePoolRequest](../../models/shared/V3CreatePoolRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[V3CreatePoolResponse](../../models/operations/V3CreatePoolResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deletePaymentInitiation

Delete a payment initiation by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3DeletePaymentInitiationRequest;
import com.formance.formance_sdk.models.operations.V3DeletePaymentInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3DeletePaymentInitiationRequest req = V3DeletePaymentInitiationRequest.builder()
                .paymentInitiationID("<id>")
                .build();

        V3DeletePaymentInitiationResponse res = sdk.payments().v3().deletePaymentInitiation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [V3DeletePaymentInitiationRequest](../../models/operations/V3DeletePaymentInitiationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[V3DeletePaymentInitiationResponse](../../models/operations/V3DeletePaymentInitiationResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deletePool

Delete a pool by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3DeletePoolRequest;
import com.formance.formance_sdk.models.operations.V3DeletePoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3DeletePoolRequest req = V3DeletePoolRequest.builder()
                .poolID("<id>")
                .build();

        V3DeletePoolResponse res = sdk.payments().v3().deletePool()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V3DeletePoolRequest](../../models/operations/V3DeletePoolRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V3DeletePoolResponse](../../models/operations/V3DeletePoolResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## forwardBankAccount

Forward a Bank Account to a PSP for creation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ForwardBankAccountRequest;
import com.formance.formance_sdk.models.operations.V3ForwardBankAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ForwardBankAccountRequest req = V3ForwardBankAccountRequest.builder()
                .bankAccountID("<id>")
                .build();

        V3ForwardBankAccountResponse res = sdk.payments().v3().forwardBankAccount()
                .request(req)
                .call();

        if (res.v3ForwardBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [V3ForwardBankAccountRequest](../../models/operations/V3ForwardBankAccountRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[V3ForwardBankAccountResponse](../../models/operations/V3ForwardBankAccountResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getAccount

Get an account by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetAccountRequest;
import com.formance.formance_sdk.models.operations.V3GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetAccountRequest req = V3GetAccountRequest.builder()
                .accountID("<id>")
                .build();

        V3GetAccountResponse res = sdk.payments().v3().getAccount()
                .request(req)
                .call();

        if (res.v3GetAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V3GetAccountRequest](../../models/operations/V3GetAccountRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V3GetAccountResponse](../../models/operations/V3GetAccountResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getAccountBalances

Get account balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetAccountBalancesRequest;
import com.formance.formance_sdk.models.operations.V3GetAccountBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetAccountBalancesRequest req = V3GetAccountBalancesRequest.builder()
                .accountID("<id>")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3GetAccountBalancesResponse res = sdk.payments().v3().getAccountBalances()
                .request(req)
                .call();

        if (res.v3BalancesCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [V3GetAccountBalancesRequest](../../models/operations/V3GetAccountBalancesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[V3GetAccountBalancesResponse](../../models/operations/V3GetAccountBalancesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getBankAccount

Get a Bank Account by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetBankAccountRequest;
import com.formance.formance_sdk.models.operations.V3GetBankAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetBankAccountRequest req = V3GetBankAccountRequest.builder()
                .bankAccountID("<id>")
                .build();

        V3GetBankAccountResponse res = sdk.payments().v3().getBankAccount()
                .request(req)
                .call();

        if (res.v3GetBankAccountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V3GetBankAccountRequest](../../models/operations/V3GetBankAccountRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V3GetBankAccountResponse](../../models/operations/V3GetBankAccountResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getConnectorConfig

Get a connector configuration by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetConnectorConfigRequest;
import com.formance.formance_sdk.models.operations.V3GetConnectorConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetConnectorConfigRequest req = V3GetConnectorConfigRequest.builder()
                .connectorID("<id>")
                .build();

        V3GetConnectorConfigResponse res = sdk.payments().v3().getConnectorConfig()
                .request(req)
                .call();

        if (res.v3GetConnectorConfigResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [V3GetConnectorConfigRequest](../../models/operations/V3GetConnectorConfigRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[V3GetConnectorConfigResponse](../../models/operations/V3GetConnectorConfigResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getConnectorSchedule

Get a connector schedule by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetConnectorScheduleRequest;
import com.formance.formance_sdk.models.operations.V3GetConnectorScheduleResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetConnectorScheduleRequest req = V3GetConnectorScheduleRequest.builder()
                .connectorID("<id>")
                .scheduleID("<id>")
                .build();

        V3GetConnectorScheduleResponse res = sdk.payments().v3().getConnectorSchedule()
                .request(req)
                .call();

        if (res.v3ConnectorScheduleResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [V3GetConnectorScheduleRequest](../../models/operations/V3GetConnectorScheduleRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[V3GetConnectorScheduleResponse](../../models/operations/V3GetConnectorScheduleResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getPayment

Get a payment by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetPaymentRequest;
import com.formance.formance_sdk.models.operations.V3GetPaymentResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetPaymentRequest req = V3GetPaymentRequest.builder()
                .paymentID("<id>")
                .build();

        V3GetPaymentResponse res = sdk.payments().v3().getPayment()
                .request(req)
                .call();

        if (res.v3GetPaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V3GetPaymentRequest](../../models/operations/V3GetPaymentRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V3GetPaymentResponse](../../models/operations/V3GetPaymentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getPaymentInitiation

Get a payment initiation by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetPaymentInitiationRequest;
import com.formance.formance_sdk.models.operations.V3GetPaymentInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetPaymentInitiationRequest req = V3GetPaymentInitiationRequest.builder()
                .paymentInitiationID("<id>")
                .build();

        V3GetPaymentInitiationResponse res = sdk.payments().v3().getPaymentInitiation()
                .request(req)
                .call();

        if (res.v3GetPaymentInitiationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [V3GetPaymentInitiationRequest](../../models/operations/V3GetPaymentInitiationRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[V3GetPaymentInitiationResponse](../../models/operations/V3GetPaymentInitiationResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getPool

Get a pool by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetPoolRequest;
import com.formance.formance_sdk.models.operations.V3GetPoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetPoolRequest req = V3GetPoolRequest.builder()
                .poolID("<id>")
                .build();

        V3GetPoolResponse res = sdk.payments().v3().getPool()
                .request(req)
                .call();

        if (res.v3GetPoolResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [V3GetPoolRequest](../../models/operations/V3GetPoolRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[V3GetPoolResponse](../../models/operations/V3GetPoolResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getPoolBalances

Get pool balances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetPoolBalancesRequest;
import com.formance.formance_sdk.models.operations.V3GetPoolBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetPoolBalancesRequest req = V3GetPoolBalancesRequest.builder()
                .poolID("<id>")
                .build();

        V3GetPoolBalancesResponse res = sdk.payments().v3().getPoolBalances()
                .request(req)
                .call();

        if (res.v3PoolBalancesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [V3GetPoolBalancesRequest](../../models/operations/V3GetPoolBalancesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[V3GetPoolBalancesResponse](../../models/operations/V3GetPoolBalancesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getTask

Get a task and its result by ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3GetTaskRequest;
import com.formance.formance_sdk.models.operations.V3GetTaskResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3GetTaskRequest req = V3GetTaskRequest.builder()
                .taskID("<id>")
                .build();

        V3GetTaskResponse res = sdk.payments().v3().getTask()
                .request(req)
                .call();

        if (res.v3GetTaskResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [V3GetTaskRequest](../../models/operations/V3GetTaskRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[V3GetTaskResponse](../../models/operations/V3GetTaskResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## initiatePayment

Initiate a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3InitiatePaymentRequest;
import com.formance.formance_sdk.models.operations.V3InitiatePaymentResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3InitiatePaymentRequest req = V3InitiatePaymentRequest.builder()
                .build();

        V3InitiatePaymentResponse res = sdk.payments().v3().initiatePayment()
                .request(req)
                .call();

        if (res.v3InitiatePaymentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [V3InitiatePaymentRequest](../../models/operations/V3InitiatePaymentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[V3InitiatePaymentResponse](../../models/operations/V3InitiatePaymentResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## installConnector

Install a connector

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3InstallConnectorRequest;
import com.formance.formance_sdk.models.operations.V3InstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3InstallConnectorRequest req = V3InstallConnectorRequest.builder()
                .connector("<value>")
                .build();

        V3InstallConnectorResponse res = sdk.payments().v3().installConnector()
                .request(req)
                .call();

        if (res.v3InstallConnectorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [V3InstallConnectorRequest](../../models/operations/V3InstallConnectorRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[V3InstallConnectorResponse](../../models/operations/V3InstallConnectorResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listAccounts

List all accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListAccountsRequest;
import com.formance.formance_sdk.models.operations.V3ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListAccountsRequest req = V3ListAccountsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListAccountsResponse res = sdk.payments().v3().listAccounts()
                .request(req)
                .call();

        if (res.v3AccountsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V3ListAccountsRequest](../../models/operations/V3ListAccountsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V3ListAccountsResponse](../../models/operations/V3ListAccountsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listBankAccounts

List all bank accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListBankAccountsRequest;
import com.formance.formance_sdk.models.operations.V3ListBankAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListBankAccountsRequest req = V3ListBankAccountsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListBankAccountsResponse res = sdk.payments().v3().listBankAccounts()
                .request(req)
                .call();

        if (res.v3BankAccountsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [V3ListBankAccountsRequest](../../models/operations/V3ListBankAccountsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[V3ListBankAccountsResponse](../../models/operations/V3ListBankAccountsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listConnectorConfigs

List all connector configurations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListConnectorConfigsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListConnectorConfigsResponse res = sdk.payments().v3().listConnectorConfigs()
                .call();

        if (res.v3ConnectorConfigsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V3ListConnectorConfigsResponse](../../models/operations/V3ListConnectorConfigsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listConnectorScheduleInstances

List all connector schedule instances

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListConnectorScheduleInstancesRequest;
import com.formance.formance_sdk.models.operations.V3ListConnectorScheduleInstancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListConnectorScheduleInstancesRequest req = V3ListConnectorScheduleInstancesRequest.builder()
                .connectorID("<id>")
                .scheduleID("<id>")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListConnectorScheduleInstancesResponse res = sdk.payments().v3().listConnectorScheduleInstances()
                .request(req)
                .call();

        if (res.v3ConnectorScheduleInstancesCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [V3ListConnectorScheduleInstancesRequest](../../models/operations/V3ListConnectorScheduleInstancesRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[V3ListConnectorScheduleInstancesResponse](../../models/operations/V3ListConnectorScheduleInstancesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listConnectorSchedules

List all connector schedules

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListConnectorSchedulesRequest;
import com.formance.formance_sdk.models.operations.V3ListConnectorSchedulesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListConnectorSchedulesRequest req = V3ListConnectorSchedulesRequest.builder()
                .connectorID("<id>")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListConnectorSchedulesResponse res = sdk.payments().v3().listConnectorSchedules()
                .request(req)
                .call();

        if (res.v3ConnectorSchedulesCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [V3ListConnectorSchedulesRequest](../../models/operations/V3ListConnectorSchedulesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[V3ListConnectorSchedulesResponse](../../models/operations/V3ListConnectorSchedulesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listConnectors

List all connectors

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListConnectorsRequest;
import com.formance.formance_sdk.models.operations.V3ListConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListConnectorsRequest req = V3ListConnectorsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListConnectorsResponse res = sdk.payments().v3().listConnectors()
                .request(req)
                .call();

        if (res.v3ConnectorsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V3ListConnectorsRequest](../../models/operations/V3ListConnectorsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V3ListConnectorsResponse](../../models/operations/V3ListConnectorsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listPaymentInitiationAdjustments

List all payment initiation adjustments

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListPaymentInitiationAdjustmentsRequest;
import com.formance.formance_sdk.models.operations.V3ListPaymentInitiationAdjustmentsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListPaymentInitiationAdjustmentsRequest req = V3ListPaymentInitiationAdjustmentsRequest.builder()
                .paymentInitiationID("<id>")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListPaymentInitiationAdjustmentsResponse res = sdk.payments().v3().listPaymentInitiationAdjustments()
                .request(req)
                .call();

        if (res.v3PaymentInitiationAdjustmentsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [V3ListPaymentInitiationAdjustmentsRequest](../../models/operations/V3ListPaymentInitiationAdjustmentsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[V3ListPaymentInitiationAdjustmentsResponse](../../models/operations/V3ListPaymentInitiationAdjustmentsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listPaymentInitiationRelatedPayments

List all payments related to a payment initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListPaymentInitiationRelatedPaymentsRequest;
import com.formance.formance_sdk.models.operations.V3ListPaymentInitiationRelatedPaymentsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListPaymentInitiationRelatedPaymentsRequest req = V3ListPaymentInitiationRelatedPaymentsRequest.builder()
                .paymentInitiationID("<id>")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListPaymentInitiationRelatedPaymentsResponse res = sdk.payments().v3().listPaymentInitiationRelatedPayments()
                .request(req)
                .call();

        if (res.v3PaymentInitiationRelatedPaymentsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [V3ListPaymentInitiationRelatedPaymentsRequest](../../models/operations/V3ListPaymentInitiationRelatedPaymentsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[V3ListPaymentInitiationRelatedPaymentsResponse](../../models/operations/V3ListPaymentInitiationRelatedPaymentsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listPaymentInitiations

List all payment initiations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListPaymentInitiationsRequest;
import com.formance.formance_sdk.models.operations.V3ListPaymentInitiationsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListPaymentInitiationsRequest req = V3ListPaymentInitiationsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListPaymentInitiationsResponse res = sdk.payments().v3().listPaymentInitiations()
                .request(req)
                .call();

        if (res.v3PaymentInitiationsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [V3ListPaymentInitiationsRequest](../../models/operations/V3ListPaymentInitiationsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[V3ListPaymentInitiationsResponse](../../models/operations/V3ListPaymentInitiationsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listPayments

List all payments

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListPaymentsRequest;
import com.formance.formance_sdk.models.operations.V3ListPaymentsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListPaymentsRequest req = V3ListPaymentsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListPaymentsResponse res = sdk.payments().v3().listPayments()
                .request(req)
                .call();

        if (res.v3PaymentsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V3ListPaymentsRequest](../../models/operations/V3ListPaymentsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V3ListPaymentsResponse](../../models/operations/V3ListPaymentsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listPools

List all pools

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ListPoolsRequest;
import com.formance.formance_sdk.models.operations.V3ListPoolsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ListPoolsRequest req = V3ListPoolsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V3ListPoolsResponse res = sdk.payments().v3().listPools()
                .request(req)
                .call();

        if (res.v3PoolsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [V3ListPoolsRequest](../../models/operations/V3ListPoolsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[V3ListPoolsResponse](../../models/operations/V3ListPoolsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## rejectPaymentInitiation

Reject a payment initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3RejectPaymentInitiationRequest;
import com.formance.formance_sdk.models.operations.V3RejectPaymentInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3RejectPaymentInitiationRequest req = V3RejectPaymentInitiationRequest.builder()
                .paymentInitiationID("<id>")
                .build();

        V3RejectPaymentInitiationResponse res = sdk.payments().v3().rejectPaymentInitiation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [V3RejectPaymentInitiationRequest](../../models/operations/V3RejectPaymentInitiationRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[V3RejectPaymentInitiationResponse](../../models/operations/V3RejectPaymentInitiationResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## removeAccountFromPool

Remove an account from a pool

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3RemoveAccountFromPoolRequest;
import com.formance.formance_sdk.models.operations.V3RemoveAccountFromPoolResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3RemoveAccountFromPoolRequest req = V3RemoveAccountFromPoolRequest.builder()
                .accountID("<id>")
                .poolID("<id>")
                .build();

        V3RemoveAccountFromPoolResponse res = sdk.payments().v3().removeAccountFromPool()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [V3RemoveAccountFromPoolRequest](../../models/operations/V3RemoveAccountFromPoolRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[V3RemoveAccountFromPoolResponse](../../models/operations/V3RemoveAccountFromPoolResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## resetConnector

Reset a connector. Be aware that this will delete all data and stop all existing tasks like payment initiations and bank account creations.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ResetConnectorRequest;
import com.formance.formance_sdk.models.operations.V3ResetConnectorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ResetConnectorRequest req = V3ResetConnectorRequest.builder()
                .connectorID("<id>")
                .build();

        V3ResetConnectorResponse res = sdk.payments().v3().resetConnector()
                .request(req)
                .call();

        if (res.v3ResetConnectorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V3ResetConnectorRequest](../../models/operations/V3ResetConnectorRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V3ResetConnectorResponse](../../models/operations/V3ResetConnectorResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## retryPaymentInitiation

Retry a payment initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3RetryPaymentInitiationRequest;
import com.formance.formance_sdk.models.operations.V3RetryPaymentInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3RetryPaymentInitiationRequest req = V3RetryPaymentInitiationRequest.builder()
                .paymentInitiationID("<id>")
                .build();

        V3RetryPaymentInitiationResponse res = sdk.payments().v3().retryPaymentInitiation()
                .request(req)
                .call();

        if (res.v3RetryPaymentInitiationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [V3RetryPaymentInitiationRequest](../../models/operations/V3RetryPaymentInitiationRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[V3RetryPaymentInitiationResponse](../../models/operations/V3RetryPaymentInitiationResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## reversePaymentInitiation

Reverse a payment initiation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3ReversePaymentInitiationRequest;
import com.formance.formance_sdk.models.operations.V3ReversePaymentInitiationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3ReversePaymentInitiationRequest req = V3ReversePaymentInitiationRequest.builder()
                .paymentInitiationID("<id>")
                .build();

        V3ReversePaymentInitiationResponse res = sdk.payments().v3().reversePaymentInitiation()
                .request(req)
                .call();

        if (res.v3ReversePaymentInitiationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [V3ReversePaymentInitiationRequest](../../models/operations/V3ReversePaymentInitiationRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[V3ReversePaymentInitiationResponse](../../models/operations/V3ReversePaymentInitiationResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## uninstallConnector

Uninstall a connector

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3UninstallConnectorRequest;
import com.formance.formance_sdk.models.operations.V3UninstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UninstallConnectorRequest req = V3UninstallConnectorRequest.builder()
                .connectorID("<id>")
                .build();

        V3UninstallConnectorResponse res = sdk.payments().v3().uninstallConnector()
                .request(req)
                .call();

        if (res.v3UninstallConnectorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [V3UninstallConnectorRequest](../../models/operations/V3UninstallConnectorRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[V3UninstallConnectorResponse](../../models/operations/V3UninstallConnectorResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## updateBankAccountMetadata

Update a bank account's metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3UpdateBankAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.V3UpdateBankAccountMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UpdateBankAccountMetadataRequest req = V3UpdateBankAccountMetadataRequest.builder()
                .bankAccountID("<id>")
                .build();

        V3UpdateBankAccountMetadataResponse res = sdk.payments().v3().updateBankAccountMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [V3UpdateBankAccountMetadataRequest](../../models/operations/V3UpdateBankAccountMetadataRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[V3UpdateBankAccountMetadataResponse](../../models/operations/V3UpdateBankAccountMetadataResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## updatePaymentMetadata

Update a payment's metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V3ErrorResponse;
import com.formance.formance_sdk.models.operations.V3UpdatePaymentMetadataRequest;
import com.formance.formance_sdk.models.operations.V3UpdatePaymentMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V3ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V3UpdatePaymentMetadataRequest req = V3UpdatePaymentMetadataRequest.builder()
                .paymentID("<id>")
                .build();

        V3UpdatePaymentMetadataResponse res = sdk.payments().v3().updatePaymentMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [V3UpdatePaymentMetadataRequest](../../models/operations/V3UpdatePaymentMetadataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[V3UpdatePaymentMetadataResponse](../../models/operations/V3UpdatePaymentMetadataResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V3ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |