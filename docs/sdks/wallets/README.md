# Wallets
(*wallets()*)

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
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            ConfirmHoldRequest req = ConfirmHoldRequest.builder()
                .holdId("<value>")
                .confirmHoldRequest(ConfirmHoldRequest.builder()
                    .amount(new BigInteger("100"))
                    .final_(true)
                    .build())
                .build();

            ConfirmHoldResponse res = sdk.wallets().confirmHold()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.ConfirmHoldRequest](../../models/operations/ConfirmHoldRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ConfirmHoldResponse](../../models/operations/ConfirmHoldResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## createBalance

Create a balance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            CreateBalanceRequest req = CreateBalanceRequest.builder()
                .id("<value>")
                .build();

            CreateBalanceResponse res = sdk.wallets().createBalance()
                .request(req)
                .call();

            if (res.createBalanceResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.CreateBalanceRequest](../../models/operations/CreateBalanceRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.CreateBalanceResponse](../../models/operations/CreateBalanceResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## createWallet

Create a new wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            CreateWalletRequest req = CreateWalletRequest.builder()
                .metadata(java.util.Map.ofEntries(
                        entry("key", "<value>")))
                .name("<value>")
                .build();

            CreateWalletResponse res = sdk.wallets().createWallet()
                .request(req)
                .call();

            if (res.createWalletResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.formance.formance_sdk.models.shared.CreateWalletRequest](../../models/shared/CreateWalletRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.formance.formance_sdk.models.operations.CreateWalletResponse](../../models/operations/CreateWalletResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## creditWallet

Credit a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            CreditWalletRequest req = CreditWalletRequest.builder()
                .id("<value>")
                .creditWalletRequest(CreditWalletRequest.builder()
                    .amount(Monetary.builder()
                            .amount(new BigInteger("201874"))
                            .asset("<value>")
                            .build())
                    .metadata(java.util.Map.ofEntries(
                        entry("key", "<value>")))
                    .sources(java.util.List.of(
                        Subject.of(LedgerAccountSubject.builder()
                                .identifier("<value>")
                                .type("<value>")
                                .build())))
                    .build())
                .build();

            CreditWalletResponse res = sdk.wallets().creditWallet()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.CreditWalletRequest](../../models/operations/CreditWalletRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.CreditWalletResponse](../../models/operations/CreditWalletResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## debitWallet

Debit a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            DebitWalletRequest req = DebitWalletRequest.builder()
                .id("<value>")
                .debitWalletRequest(DebitWalletRequest.builder()
                    .amount(Monetary.builder()
                            .amount(new BigInteger("245256"))
                            .asset("<value>")
                            .build())
                    .metadata(java.util.Map.ofEntries(
                            entry("key", "<value>")))
                    .pending(false)
                    .build())
                .build();

            DebitWalletResponse res = sdk.wallets().debitWallet()
                .request(req)
                .call();

            if (res.debitWalletResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.DebitWalletRequest](../../models/operations/DebitWalletRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.DebitWalletResponse](../../models/operations/DebitWalletResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## getBalance

Get detailed balance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetBalanceRequest req = GetBalanceRequest.builder()
                .balanceName("<value>")
                .id("<value>")
                .build();

            GetBalanceResponse res = sdk.wallets().getBalance()
                .request(req)
                .call();

            if (res.getBalanceResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.GetBalanceRequest](../../models/operations/GetBalanceRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetBalanceResponse](../../models/operations/GetBalanceResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## getHold

Get a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetHoldRequest req = GetHoldRequest.builder()
                .holdID("<value>")
                .build();

            GetHoldResponse res = sdk.wallets().getHold()
                .request(req)
                .call();

            if (res.getHoldResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                               | [com.formance.formance_sdk.models.operations.GetHoldRequest](../../models/operations/GetHoldRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[com.formance.formance_sdk.models.operations.GetHoldResponse](../../models/operations/GetHoldResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## getHolds

Get all holds for a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetHoldsRequest req = GetHoldsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .metadata(java.util.Map.ofEntries(
                    entry("admin", "true")))
                .pageSize(100L)
                .walletID("wallet1")
                .build();

            GetHoldsResponse res = sdk.wallets().getHolds()
                .request(req)
                .call();

            if (res.getHoldsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.formance.formance_sdk.models.operations.GetHoldsRequest](../../models/operations/GetHoldsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.formance.formance_sdk.models.operations.GetHoldsResponse](../../models/operations/GetHoldsResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## getTransactions

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetTransactionsRequest req = GetTransactionsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .walletID("wallet1")
                .build();

            GetTransactionsResponse res = sdk.wallets().getTransactions()
                .request(req)
                .call();

            if (res.getTransactionsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                                               | [com.formance.formance_sdk.models.operations.GetTransactionsRequest](../../models/operations/GetTransactionsRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.GetTransactionsResponse](../../models/operations/GetTransactionsResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## getWallet

Get a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetWalletRequest req = GetWalletRequest.builder()
                .id("<value>")
                .build();

            GetWalletResponse res = sdk.wallets().getWallet()
                .request(req)
                .call();

            if (res.getWalletResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.GetWalletRequest](../../models/operations/GetWalletRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.GetWalletResponse](../../models/operations/GetWalletResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## getWalletSummary

Get wallet summary

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetWalletSummaryRequest req = GetWalletSummaryRequest.builder()
                .id("<value>")
                .build();

            GetWalletSummaryResponse res = sdk.wallets().getWalletSummary()
                .request(req)
                .call();

            if (res.getWalletSummaryResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.GetWalletSummaryRequest](../../models/operations/GetWalletSummaryRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.GetWalletSummaryResponse](../../models/operations/GetWalletSummaryResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## listBalances

List balances of a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            ListBalancesRequest req = ListBalancesRequest.builder()
                .id("<value>")
                .build();

            ListBalancesResponse res = sdk.wallets().listBalances()
                .request(req)
                .call();

            if (res.listBalancesResponse().isPresent()) {
                // handle response
            }
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.ListBalancesRequest](../../models/operations/ListBalancesRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListBalancesResponse](../../models/operations/ListBalancesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## listWallets

List all wallets

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            ListWalletsRequest req = ListWalletsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .expand("balances")
                .metadata(java.util.Map.ofEntries(
                    entry("admin", "true")))
                .name("wallet1")
                .pageSize(100L)
                .build();

            ListWalletsResponse res = sdk.wallets().listWallets()
                .request(req)
                .call();

            if (res.listWalletsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.ListWalletsRequest](../../models/operations/ListWalletsRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ListWalletsResponse](../../models/operations/ListWalletsResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## updateWallet

Update a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            UpdateWalletRequest req = UpdateWalletRequest.builder()
                .id("<value>")
                .build();

            UpdateWalletResponse res = sdk.wallets().updateWallet()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.UpdateWalletRequest](../../models/operations/UpdateWalletRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.UpdateWalletResponse](../../models/operations/UpdateWalletResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## voidHold

Cancel a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            VoidHoldRequest req = VoidHoldRequest.builder()
                .holdId("<value>")
                .build();

            VoidHoldResponse res = sdk.wallets().voidHold()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.formance.formance_sdk.models.operations.VoidHoldRequest](../../models/operations/VoidHoldRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.formance.formance_sdk.models.operations.VoidHoldResponse](../../models/operations/VoidHoldResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |

## walletsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
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
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            WalletsgetServerInfoResponse res = sdk.wallets().walletsgetServerInfo()
                .call();

            if (res.serverInfo().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WalletsErrorResponse e) {
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

**[com.formance.formance_sdk.models.operations.WalletsgetServerInfoResponse](../../models/operations/WalletsgetServerInfoResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/WalletsErrorResponse | default                            | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |
