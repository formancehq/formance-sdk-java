# SDKWalletsV1
(*wallets().v1()*)

## Overview

### Available Operations

* [confirmHold](#confirmhold) - Confirm a hold
* [createBalance](#createbalance) - Create a balance
* [createWallet](#createwallet) - Create a new wallet
* [creditWallet](#creditwallet) - Credit a wallet
* [debitWallet](#debitwallet) - Debit a wallet
* [getBalance](#getbalance) - Get detailed balance
* [getHold](#gethold) - Get a hold
* [getHolds](#getholds) - Get all holds for a wallet
* [getTransactions](#gettransactions)
* [getWallet](#getwallet) - Get a wallet
* [getWalletSummary](#getwalletsummary) - Get wallet summary
* [listBalances](#listbalances) - List balances of a wallet
* [listWallets](#listwallets) - List all wallets
* [updateWallet](#updatewallet) - Update a wallet
* [voidHold](#voidhold) - Cancel a hold
* [walletsgetServerInfo](#walletsgetserverinfo) - Get server info

## confirmHold

Confirm a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.ConfirmHoldRequest;
import com.formance.formance_sdk.models.operations.ConfirmHoldResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ConfirmHoldRequest req = ConfirmHoldRequest.builder()
                .holdId("<id>")
                .confirmHoldRequest(com.formance.formance_sdk.models.shared.ConfirmHoldRequest.builder()
                    .amount(new BigInteger("100"))
                    .final_(true)
                    .build())
                .build();

        ConfirmHoldResponse res = sdk.wallets().v1().confirmHold()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ConfirmHoldRequest](../../models/operations/ConfirmHoldRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ConfirmHoldResponse](../../models/operations/ConfirmHoldResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## createBalance

Create a balance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.CreateBalanceRequest;
import com.formance.formance_sdk.models.operations.CreateBalanceResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CreateBalanceRequest req = CreateBalanceRequest.builder()
                .id("<id>")
                .build();

        CreateBalanceResponse res = sdk.wallets().v1().createBalance()
                .request(req)
                .call();

        if (res.createBalanceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CreateBalanceRequest](../../models/operations/CreateBalanceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateBalanceResponse](../../models/operations/CreateBalanceResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## createWallet

Create a new wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.CreateWalletRequest;
import com.formance.formance_sdk.models.operations.CreateWalletResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CreateWalletRequest req = CreateWalletRequest.builder()
                .build();

        CreateWalletResponse res = sdk.wallets().v1().createWallet()
                .request(req)
                .call();

        if (res.createWalletResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateWalletRequest](../../models/operations/CreateWalletRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateWalletResponse](../../models/operations/CreateWalletResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## creditWallet

Credit a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.CreditWalletRequest;
import com.formance.formance_sdk.models.operations.CreditWalletResponse;
import com.formance.formance_sdk.models.shared.Monetary;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.WalletSubject;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CreditWalletRequest req = CreditWalletRequest.builder()
                .id("<id>")
                .creditWalletRequest(com.formance.formance_sdk.models.shared.CreditWalletRequest.builder()
                    .amount(Monetary.builder()
                        .amount(new BigInteger("201874"))
                        .asset("<value>")
                        .build())
                    .metadata(Map.ofEntries(
                        Map.entry("key", "")))
                    .sources(List.of(
                        WalletSubject.builder()
                            .identifier("<value>")
                            .type("<value>")
                            .build()))
                    .build())
                .build();

        CreditWalletResponse res = sdk.wallets().v1().creditWallet()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreditWalletRequest](../../models/operations/CreditWalletRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreditWalletResponse](../../models/operations/CreditWalletResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## debitWallet

Debit a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.DebitWalletRequest;
import com.formance.formance_sdk.models.operations.DebitWalletResponse;
import com.formance.formance_sdk.models.shared.Monetary;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        DebitWalletRequest req = DebitWalletRequest.builder()
                .id("<id>")
                .debitWalletRequest(com.formance.formance_sdk.models.shared.DebitWalletRequest.builder()
                    .amount(Monetary.builder()
                        .amount(new BigInteger("245256"))
                        .asset("<value>")
                        .build())
                    .metadata(Map.ofEntries(
                        Map.entry("key", "<value>")))
                    .pending(true)
                    .build())
                .build();

        DebitWalletResponse res = sdk.wallets().v1().debitWallet()
                .request(req)
                .call();

        if (res.debitWalletResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [DebitWalletRequest](../../models/operations/DebitWalletRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[DebitWalletResponse](../../models/operations/DebitWalletResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## getBalance

Get detailed balance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.GetBalanceRequest;
import com.formance.formance_sdk.models.operations.GetBalanceResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetBalanceRequest req = GetBalanceRequest.builder()
                .balanceName("<value>")
                .id("<id>")
                .build();

        GetBalanceResponse res = sdk.wallets().v1().getBalance()
                .request(req)
                .call();

        if (res.getBalanceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetBalanceRequest](../../models/operations/GetBalanceRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetBalanceResponse](../../models/operations/GetBalanceResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## getHold

Get a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.GetHoldRequest;
import com.formance.formance_sdk.models.operations.GetHoldResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetHoldRequest req = GetHoldRequest.builder()
                .holdID("<id>")
                .build();

        GetHoldResponse res = sdk.wallets().v1().getHold()
                .request(req)
                .call();

        if (res.getHoldResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetHoldRequest](../../models/operations/GetHoldRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetHoldResponse](../../models/operations/GetHoldResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## getHolds

Get all holds for a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.GetHoldsRequest;
import com.formance.formance_sdk.models.operations.GetHoldsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetHoldsRequest req = GetHoldsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .metadata(Map.ofEntries(
                    Map.entry("admin", "true")))
                .pageSize(100L)
                .walletID("wallet1")
                .build();

        GetHoldsResponse res = sdk.wallets().v1().getHolds()
                .request(req)
                .call();

        if (res.getHoldsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetHoldsRequest](../../models/operations/GetHoldsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetHoldsResponse](../../models/operations/GetHoldsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## getTransactions

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.GetTransactionsRequest;
import com.formance.formance_sdk.models.operations.GetTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetTransactionsRequest req = GetTransactionsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .walletID("wallet1")
                .build();

        GetTransactionsResponse res = sdk.wallets().v1().getTransactions()
                .request(req)
                .call();

        if (res.getTransactionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTransactionsRequest](../../models/operations/GetTransactionsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetTransactionsResponse](../../models/operations/GetTransactionsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## getWallet

Get a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.GetWalletRequest;
import com.formance.formance_sdk.models.operations.GetWalletResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetWalletRequest req = GetWalletRequest.builder()
                .id("<id>")
                .build();

        GetWalletResponse res = sdk.wallets().v1().getWallet()
                .request(req)
                .call();

        if (res.getWalletResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetWalletRequest](../../models/operations/GetWalletRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetWalletResponse](../../models/operations/GetWalletResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## getWalletSummary

Get wallet summary

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.GetWalletSummaryRequest;
import com.formance.formance_sdk.models.operations.GetWalletSummaryResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetWalletSummaryRequest req = GetWalletSummaryRequest.builder()
                .id("<id>")
                .build();

        GetWalletSummaryResponse res = sdk.wallets().v1().getWalletSummary()
                .request(req)
                .call();

        if (res.getWalletSummaryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetWalletSummaryRequest](../../models/operations/GetWalletSummaryRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetWalletSummaryResponse](../../models/operations/GetWalletSummaryResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## listBalances

List balances of a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListBalancesRequest;
import com.formance.formance_sdk.models.operations.ListBalancesResponse;
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

        ListBalancesRequest req = ListBalancesRequest.builder()
                .id("<id>")
                .build();

        ListBalancesResponse res = sdk.wallets().v1().listBalances()
                .request(req)
                .call();

        if (res.listBalancesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListBalancesRequest](../../models/operations/ListBalancesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListBalancesResponse](../../models/operations/ListBalancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listWallets

List all wallets

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.ListWalletsRequest;
import com.formance.formance_sdk.models.operations.ListWalletsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListWalletsRequest req = ListWalletsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .expand("balances")
                .metadata(Map.ofEntries(
                    Map.entry("admin", "true")))
                .name("wallet1")
                .pageSize(100L)
                .build();

        ListWalletsResponse res = sdk.wallets().v1().listWallets()
                .request(req)
                .call();

        if (res.listWalletsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListWalletsRequest](../../models/operations/ListWalletsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListWalletsResponse](../../models/operations/ListWalletsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## updateWallet

Update a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.UpdateWalletRequest;
import com.formance.formance_sdk.models.operations.UpdateWalletResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UpdateWalletRequest req = UpdateWalletRequest.builder()
                .id("<id>")
                .build();

        UpdateWalletResponse res = sdk.wallets().v1().updateWallet()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateWalletRequest](../../models/operations/UpdateWalletRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateWalletResponse](../../models/operations/UpdateWalletResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## voidHold

Cancel a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.VoidHoldRequest;
import com.formance.formance_sdk.models.operations.VoidHoldResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        VoidHoldRequest req = VoidHoldRequest.builder()
                .holdId("<id>")
                .build();

        VoidHoldResponse res = sdk.wallets().v1().voidHold()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [VoidHoldRequest](../../models/operations/VoidHoldRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[VoidHoldResponse](../../models/operations/VoidHoldResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |

## walletsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WalletsErrorResponse;
import com.formance.formance_sdk.models.operations.WalletsgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WalletsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        WalletsgetServerInfoResponse res = sdk.wallets().v1().walletsgetServerInfo()
                .call();

        if (res.serverInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[WalletsgetServerInfoResponse](../../models/operations/WalletsgetServerInfoResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |