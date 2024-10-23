# SDKV1
(*ledger().v1()*)

## Overview

### Available Operations

* [createTransactions](#createtransactions) - Create a new batch of transactions to a ledger
* [addMetadataOnTransaction](#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](#countaccounts) - Count the accounts from a ledger
* [countTransactions](#counttransactions) - Count the transactions from a ledger
* [createTransaction](#createtransaction) - Create a new transaction to a ledger
* [getAccount](#getaccount) - Get account by its address
* [getBalances](#getbalances) - Get the balances from a ledger's account
* [getBalancesAggregated](#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getInfo](#getinfo) - Show server information
* [getLedgerInfo](#getledgerinfo) - Get information about a ledger
* [getMapping](#getmapping) - Get the mapping of a ledger
* [getTransaction](#gettransaction) - Get transaction from a ledger by its ID
* [listAccounts](#listaccounts) - List accounts from a ledger
* [listLogs](#listlogs) - List the logs from a ledger
* [listTransactions](#listtransactions) - List transactions from a ledger
* [readStats](#readstats) - Get statistics from a ledger
* [revertTransaction](#reverttransaction) - Revert a ledger transaction by its ID
* [~~runScript~~](#runscript) - Execute a Numscript :warning: **Deprecated**
* [updateMapping](#updatemapping) - Update the mapping of a ledger

## createTransactions

Create a new batch of transactions to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.CreateTransactionsRequest;
import com.formance.formance_sdk.models.operations.CreateTransactionsResponse;
import com.formance.formance_sdk.models.shared.Posting;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransactionData;
import com.formance.formance_sdk.models.shared.Transactions;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CreateTransactionsRequest req = CreateTransactionsRequest.builder()
                .transactions(Transactions.builder()
                    .transactions(List.of(
                        TransactionData.builder()
                            .postings(List.of(
                                Posting.builder()
                                    .amount(new BigInteger("100"))
                                    .asset("COIN")
                                    .destination("users:002")
                                    .source("users:001")
                                    .build()))
                            .reference("ref:001")
                            .build()))
                    .build())
                .ledger("ledger001")
                .build();

        CreateTransactionsResponse res = sdk.ledger().v1().createTransactions()
                .request(req)
                .call();

        if (res.transactionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateTransactionsRequest](../../models/operations/CreateTransactionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateTransactionsResponse](../../models/operations/CreateTransactionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## addMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.AddMetadataOnTransactionRequest;
import com.formance.formance_sdk.models.operations.AddMetadataOnTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        AddMetadataOnTransactionRequest req = AddMetadataOnTransactionRequest.builder()
                .ledger("ledger001")
                .txid(new BigInteger("1234"))
                .build();

        AddMetadataOnTransactionResponse res = sdk.ledger().v1().addMetadataOnTransaction()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AddMetadataOnTransactionRequest](../../models/operations/AddMetadataOnTransactionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AddMetadataOnTransactionResponse](../../models/operations/AddMetadataOnTransactionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## addMetadataToAccount

Add metadata to an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.AddMetadataToAccountRequest;
import com.formance.formance_sdk.models.operations.AddMetadataToAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        AddMetadataToAccountRequest req = AddMetadataToAccountRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("key", "<value>")))
                .address("users:001")
                .ledger("ledger001")
                .build();

        AddMetadataToAccountResponse res = sdk.ledger().v1().addMetadataToAccount()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AddMetadataToAccountRequest](../../models/operations/AddMetadataToAccountRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AddMetadataToAccountResponse](../../models/operations/AddMetadataToAccountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## countAccounts

Count the accounts from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.CountAccountsRequest;
import com.formance.formance_sdk.models.operations.CountAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CountAccountsRequest req = CountAccountsRequest.builder()
                .ledger("ledger001")
                .address("users:.+")
                .metadata(Map.ofEntries(
                    Map.entry("0", "m"),
                    Map.entry("1", "e"),
                    Map.entry("2", "t"),
                    Map.entry("3", "a"),
                    Map.entry("4", "d"),
                    Map.entry("5", "a"),
                    Map.entry("6", "t"),
                    Map.entry("7", "a"),
                    Map.entry("8", "["),
                    Map.entry("9", "k"),
                    Map.entry("10", "e"),
                    Map.entry("11", "y"),
                    Map.entry("12", "]"),
                    Map.entry("13", "="),
                    Map.entry("14", "v"),
                    Map.entry("15", "a"),
                    Map.entry("16", "l"),
                    Map.entry("17", "u"),
                    Map.entry("18", "e"),
                    Map.entry("19", "1"),
                    Map.entry("20", "&"),
                    Map.entry("21", "m"),
                    Map.entry("22", "e"),
                    Map.entry("23", "t"),
                    Map.entry("24", "a"),
                    Map.entry("25", "d"),
                    Map.entry("26", "a"),
                    Map.entry("27", "t"),
                    Map.entry("28", "a"),
                    Map.entry("29", "["),
                    Map.entry("30", "a"),
                    Map.entry("31", "."),
                    Map.entry("32", "n"),
                    Map.entry("33", "e"),
                    Map.entry("34", "s"),
                    Map.entry("35", "t"),
                    Map.entry("36", "e"),
                    Map.entry("37", "d"),
                    Map.entry("38", "."),
                    Map.entry("39", "k"),
                    Map.entry("40", "e"),
                    Map.entry("41", "y"),
                    Map.entry("42", "]"),
                    Map.entry("43", "="),
                    Map.entry("44", "v"),
                    Map.entry("45", "a"),
                    Map.entry("46", "l"),
                    Map.entry("47", "u"),
                    Map.entry("48", "e"),
                    Map.entry("49", "2")))
                .build();

        CountAccountsResponse res = sdk.ledger().v1().countAccounts()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CountAccountsRequest](../../models/operations/CountAccountsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CountAccountsResponse](../../models/operations/CountAccountsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## countTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.CountTransactionsResponse;
import com.formance.formance_sdk.models.operations.Metadata;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CountTransactionsRequest req = CountTransactionsRequest.builder()
                .ledger("ledger001")
                .account("users:001")
                .destination("users:001")
                .metadata(Metadata.builder()
                    .build())
                .reference("ref:001")
                .source("users:001")
                .build();

        CountTransactionsResponse res = sdk.ledger().v1().countTransactions()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CountTransactionsRequest](../../models/operations/CountTransactionsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CountTransactionsResponse](../../models/operations/CountTransactionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## createTransaction

Create a new transaction to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.CreateTransactionRequest;
import com.formance.formance_sdk.models.operations.CreateTransactionResponse;
import com.formance.formance_sdk.models.shared.PostTransaction;
import com.formance.formance_sdk.models.shared.PostTransactionScript;
import com.formance.formance_sdk.models.shared.Posting;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        CreateTransactionRequest req = CreateTransactionRequest.builder()
                .postTransaction(PostTransaction.builder()
                    .postings(List.of(
                        Posting.builder()
                            .amount(new BigInteger("100"))
                            .asset("COIN")
                            .destination("users:002")
                            .source("users:001")
                            .build()))
                    .reference("ref:001")
                    .script(PostTransactionScript.builder()
                        .plain("vars {\naccount $user
                        }
                        send [COIN 10] (
                        	source = @world
                        	destination = $user
                        )
                        ")
                        .vars(Map.ofEntries(
                            Map.entry("user", "users:042")))
                        .build())
                    .build())
                .ledger("ledger001")
                .preview(true)
                .build();

        CreateTransactionResponse res = sdk.ledger().v1().createTransaction()
                .request(req)
                .call();

        if (res.transactionsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateTransactionRequest](../../models/operations/CreateTransactionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateTransactionResponse](../../models/operations/CreateTransactionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getAccount

Get account by its address

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetAccountRequest;
import com.formance.formance_sdk.models.operations.GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetAccountRequest req = GetAccountRequest.builder()
                .address("users:001")
                .ledger("ledger001")
                .build();

        GetAccountResponse res = sdk.ledger().v1().getAccount()
                .request(req)
                .call();

        if (res.accountResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetAccountRequest](../../models/operations/GetAccountRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetAccountResponse](../../models/operations/GetAccountResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getBalances

Get the balances from a ledger's account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetBalancesRequest;
import com.formance.formance_sdk.models.operations.GetBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetBalancesRequest req = GetBalancesRequest.builder()
                .ledger("ledger001")
                .address("users:001")
                .after("users:003")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .build();

        GetBalancesResponse res = sdk.ledger().v1().getBalances()
                .request(req)
                .call();

        if (res.balancesCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetBalancesRequest](../../models/operations/GetBalancesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetBalancesResponse](../../models/operations/GetBalancesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getBalancesAggregated

Get the aggregated balances from selected accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetBalancesAggregatedRequest;
import com.formance.formance_sdk.models.operations.GetBalancesAggregatedResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetBalancesAggregatedRequest req = GetBalancesAggregatedRequest.builder()
                .ledger("ledger001")
                .address("users:001")
                .build();

        GetBalancesAggregatedResponse res = sdk.ledger().v1().getBalancesAggregated()
                .request(req)
                .call();

        if (res.aggregateBalancesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetBalancesAggregatedRequest](../../models/operations/GetBalancesAggregatedRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetBalancesAggregatedResponse](../../models/operations/GetBalancesAggregatedResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getInfo

Show server information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetInfoResponse res = sdk.ledger().v1().getInfo()
                .call();

        if (res.configInfoResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetInfoResponse](../../models/operations/GetInfoResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getLedgerInfo

Get information about a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetLedgerInfoRequest;
import com.formance.formance_sdk.models.operations.GetLedgerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetLedgerInfoRequest req = GetLedgerInfoRequest.builder()
                .ledger("ledger001")
                .build();

        GetLedgerInfoResponse res = sdk.ledger().v1().getLedgerInfo()
                .request(req)
                .call();

        if (res.ledgerInfoResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLedgerInfoRequest](../../models/operations/GetLedgerInfoRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLedgerInfoResponse](../../models/operations/GetLedgerInfoResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getMapping

Get the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetMappingRequest;
import com.formance.formance_sdk.models.operations.GetMappingResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetMappingRequest req = GetMappingRequest.builder()
                .ledger("ledger001")
                .build();

        GetMappingResponse res = sdk.ledger().v1().getMapping()
                .request(req)
                .call();

        if (res.mappingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetMappingRequest](../../models/operations/GetMappingRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetMappingResponse](../../models/operations/GetMappingResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getTransaction

Get transaction from a ledger by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.GetTransactionRequest;
import com.formance.formance_sdk.models.operations.GetTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetTransactionRequest req = GetTransactionRequest.builder()
                .ledger("ledger001")
                .txid(new BigInteger("1234"))
                .build();

        GetTransactionResponse res = sdk.ledger().v1().getTransaction()
                .request(req)
                .call();

        if (res.transactionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTransactionRequest](../../models/operations/GetTransactionRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.ListAccountsRequest;
import com.formance.formance_sdk.models.operations.ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListAccountsRequest req = ListAccountsRequest.builder()
                .ledger("ledger001")
                .address("users:.+")
                .after("users:003")
                .balance(2400L)
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .metadata(Map.ofEntries(
                    Map.entry("0", "m"),
                    Map.entry("1", "e"),
                    Map.entry("2", "t"),
                    Map.entry("3", "a"),
                    Map.entry("4", "d"),
                    Map.entry("5", "a"),
                    Map.entry("6", "t"),
                    Map.entry("7", "a"),
                    Map.entry("8", "["),
                    Map.entry("9", "k"),
                    Map.entry("10", "e"),
                    Map.entry("11", "y"),
                    Map.entry("12", "]"),
                    Map.entry("13", "="),
                    Map.entry("14", "v"),
                    Map.entry("15", "a"),
                    Map.entry("16", "l"),
                    Map.entry("17", "u"),
                    Map.entry("18", "e"),
                    Map.entry("19", "1"),
                    Map.entry("20", "&"),
                    Map.entry("21", "m"),
                    Map.entry("22", "e"),
                    Map.entry("23", "t"),
                    Map.entry("24", "a"),
                    Map.entry("25", "d"),
                    Map.entry("26", "a"),
                    Map.entry("27", "t"),
                    Map.entry("28", "a"),
                    Map.entry("29", "["),
                    Map.entry("30", "a"),
                    Map.entry("31", "."),
                    Map.entry("32", "n"),
                    Map.entry("33", "e"),
                    Map.entry("34", "s"),
                    Map.entry("35", "t"),
                    Map.entry("36", "e"),
                    Map.entry("37", "d"),
                    Map.entry("38", "."),
                    Map.entry("39", "k"),
                    Map.entry("40", "e"),
                    Map.entry("41", "y"),
                    Map.entry("42", "]"),
                    Map.entry("43", "="),
                    Map.entry("44", "v"),
                    Map.entry("45", "a"),
                    Map.entry("46", "l"),
                    Map.entry("47", "u"),
                    Map.entry("48", "e"),
                    Map.entry("49", "2")))
                .pageSize(100L)
                .build();

        ListAccountsResponse res = sdk.ledger().v1().listAccounts()
                .request(req)
                .call();

        if (res.accountsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListAccountsRequest](../../models/operations/ListAccountsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListAccountsResponse](../../models/operations/ListAccountsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## listLogs

List the logs from a ledger, sorted by ID in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.ListLogsRequest;
import com.formance.formance_sdk.models.operations.ListLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListLogsRequest req = ListLogsRequest.builder()
                .ledger("ledger001")
                .after("1234")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListLogsResponse res = sdk.ledger().v1().listLogs()
                .request(req)
                .call();

        if (res.logsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListLogsRequest](../../models/operations/ListLogsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListLogsResponse](../../models/operations/ListLogsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## listTransactions

List transactions from a ledger, sorted by txid in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.ListTransactionsRequest;
import com.formance.formance_sdk.models.operations.ListTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListTransactionsRequest req = ListTransactionsRequest.builder()
                .ledger("ledger001")
                .account("users:001")
                .after("1234")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .destination("users:001")
                .pageSize(100L)
                .reference("ref:001")
                .source("users:001")
                .build();

        ListTransactionsResponse res = sdk.ledger().v1().listTransactions()
                .request(req)
                .call();

        if (res.transactionsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTransactionsResponse](../../models/operations/ListTransactionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## readStats

Get statistics from a ledger. (aggregate metrics on accounts and transactions)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.ReadStatsRequest;
import com.formance.formance_sdk.models.operations.ReadStatsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ReadStatsRequest req = ReadStatsRequest.builder()
                .ledger("ledger001")
                .build();

        ReadStatsResponse res = sdk.ledger().v1().readStats()
                .request(req)
                .call();

        if (res.statsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ReadStatsRequest](../../models/operations/ReadStatsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ReadStatsResponse](../../models/operations/ReadStatsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## revertTransaction

Revert a ledger transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.RevertTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        RevertTransactionRequest req = RevertTransactionRequest.builder()
                .ledger("ledger001")
                .txid(new BigInteger("1234"))
                .build();

        RevertTransactionResponse res = sdk.ledger().v1().revertTransaction()
                .request(req)
                .call();

        if (res.transactionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RevertTransactionRequest](../../models/operations/RevertTransactionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RevertTransactionResponse](../../models/operations/RevertTransactionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## ~~runScript~~

This route is deprecated, and has been merged into `POST /{ledger}/transactions`.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.RunScriptRequest;
import com.formance.formance_sdk.models.operations.RunScriptResponse;
import com.formance.formance_sdk.models.shared.Script;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        RunScriptRequest req = RunScriptRequest.builder()
                .script(Script.builder()
                    .plain("vars {\naccount $user
                    }
                    send [COIN 10] (
                    	source = @world
                    	destination = $user
                    )
                    ")
                    .reference("order_1234")
                    .vars(Map.ofEntries(
                        Map.entry("user", "users:042")))
                    .build())
                .ledger("ledger001")
                .preview(true)
                .build();

        RunScriptResponse res = sdk.ledger().v1().runScript()
                .request(req)
                .call();

        if (res.scriptResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [RunScriptRequest](../../models/operations/RunScriptRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[RunScriptResponse](../../models/operations/RunScriptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateMapping

Update the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ErrorResponse;
import com.formance.formance_sdk.models.operations.UpdateMappingRequest;
import com.formance.formance_sdk.models.operations.UpdateMappingResponse;
import com.formance.formance_sdk.models.shared.Contract;
import com.formance.formance_sdk.models.shared.Expr;
import com.formance.formance_sdk.models.shared.Mapping;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        UpdateMappingRequest req = UpdateMappingRequest.builder()
                .mapping(Mapping.builder()
                    .contracts(List.of(
                        Contract.builder()
                            .expr(Expr.builder()
                                .build())
                            .account("users:001")
                            .build()))
                    .build())
                .ledger("ledger001")
                .build();

        UpdateMappingResponse res = sdk.ledger().v1().updateMapping()
                .request(req)
                .call();

        if (res.mappingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateMappingRequest](../../models/operations/UpdateMappingRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateMappingResponse](../../models/operations/UpdateMappingResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |