# Ledger
(*ledger()*)

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
* [v2AddMetadataOnTransaction](#v2addmetadataontransaction) - Set the metadata of a transaction by its ID
* [v2AddMetadataToAccount](#v2addmetadatatoaccount) - Add metadata to an account
* [v2CountAccounts](#v2countaccounts) - Count the accounts from a ledger
* [v2CountTransactions](#v2counttransactions) - Count the transactions from a ledger
* [v2CreateBulk](#v2createbulk) - Bulk request
* [v2CreateLedger](#v2createledger) - Create a ledger
* [v2CreateTransaction](#v2createtransaction) - Create a new transaction to a ledger
* [v2DeleteAccountMetadata](#v2deleteaccountmetadata) - Delete metadata by key
* [v2DeleteLedgerMetadata](#v2deleteledgermetadata) - Delete ledger metadata by key
* [v2DeleteTransactionMetadata](#v2deletetransactionmetadata) - Delete metadata by key
* [v2GetAccount](#v2getaccount) - Get account by its address
* [v2GetBalancesAggregated](#v2getbalancesaggregated) - Get the aggregated balances from selected accounts
* [v2GetInfo](#v2getinfo) - Show server information
* [v2GetLedger](#v2getledger) - Get a ledger
* [v2GetLedgerInfo](#v2getledgerinfo) - Get information about a ledger
* [v2GetTransaction](#v2gettransaction) - Get transaction from a ledger by its ID
* [v2GetVolumesWithBalances](#v2getvolumeswithbalances) - Get list of volumes with balances for (account/asset)
* [v2ListAccounts](#v2listaccounts) - List accounts from a ledger
* [v2ListLedgers](#v2listledgers) - List ledgers
* [v2ListLogs](#v2listlogs) - List the logs from a ledger
* [v2ListTransactions](#v2listtransactions) - List transactions from a ledger
* [v2ReadStats](#v2readstats) - Get statistics from a ledger
* [v2RevertTransaction](#v2reverttransaction) - Revert a ledger transaction by its ID
* [v2UpdateLedgerMetadata](#v2updateledgermetadata) - Update ledger metadata

## createTransactions

Create a new batch of transactions to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
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

    public static void main(String[] args) throws Exception {
        try {
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

            CreateTransactionsResponse res = sdk.ledger().createTransactions()
                .request(req)
                .call();

            if (res.transactionsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateTransactionsRequest](../../models/operations/CreateTransactionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateTransactionsResponse](../../models/operations/CreateTransactionsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## addMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.AddMetadataOnTransactionRequest;
import com.formance.formance_sdk.models.operations.AddMetadataOnTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            AddMetadataOnTransactionResponse res = sdk.ledger().addMetadataOnTransaction()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AddMetadataOnTransactionRequest](../../models/operations/AddMetadataOnTransactionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AddMetadataOnTransactionResponse](../../models/operations/AddMetadataOnTransactionResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## addMetadataToAccount

Add metadata to an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.AddMetadataToAccountRequest;
import com.formance.formance_sdk.models.operations.AddMetadataToAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            AddMetadataToAccountResponse res = sdk.ledger().addMetadataToAccount()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [AddMetadataToAccountRequest](../../models/operations/AddMetadataToAccountRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[AddMetadataToAccountResponse](../../models/operations/AddMetadataToAccountResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## countAccounts

Count the accounts from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.CountAccountsRequest;
import com.formance.formance_sdk.models.operations.CountAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            CountAccountsResponse res = sdk.ledger().countAccounts()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CountAccountsRequest](../../models/operations/CountAccountsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CountAccountsResponse](../../models/operations/CountAccountsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## countTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.CountTransactionsResponse;
import com.formance.formance_sdk.models.operations.Metadata;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            CountTransactionsResponse res = sdk.ledger().countTransactions()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CountTransactionsRequest](../../models/operations/CountTransactionsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CountTransactionsResponse](../../models/operations/CountTransactionsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## createTransaction

Create a new transaction to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
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

    public static void main(String[] args) throws Exception {
        try {
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

            CreateTransactionResponse res = sdk.ledger().createTransaction()
                .request(req)
                .call();

            if (res.transactionsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateTransactionRequest](../../models/operations/CreateTransactionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateTransactionResponse](../../models/operations/CreateTransactionResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getAccount

Get account by its address

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetAccountRequest;
import com.formance.formance_sdk.models.operations.GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            GetAccountResponse res = sdk.ledger().getAccount()
                .request(req)
                .call();

            if (res.accountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetAccountRequest](../../models/operations/GetAccountRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetAccountResponse](../../models/operations/GetAccountResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getBalances

Get the balances from a ledger's account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetBalancesRequest;
import com.formance.formance_sdk.models.operations.GetBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            GetBalancesResponse res = sdk.ledger().getBalances()
                .request(req)
                .call();

            if (res.balancesCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetBalancesRequest](../../models/operations/GetBalancesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetBalancesResponse](../../models/operations/GetBalancesResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getBalancesAggregated

Get the aggregated balances from selected accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetBalancesAggregatedRequest;
import com.formance.formance_sdk.models.operations.GetBalancesAggregatedResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            GetBalancesAggregatedResponse res = sdk.ledger().getBalancesAggregated()
                .request(req)
                .call();

            if (res.aggregateBalancesResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetBalancesAggregatedRequest](../../models/operations/GetBalancesAggregatedRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetBalancesAggregatedResponse](../../models/operations/GetBalancesAggregatedResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getInfo

Show server information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            GetInfoResponse res = sdk.ledger().getInfo()
                .call();

            if (res.configInfoResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

**[GetInfoResponse](../../models/operations/GetInfoResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getLedgerInfo

Get information about a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetLedgerInfoRequest;
import com.formance.formance_sdk.models.operations.GetLedgerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            GetLedgerInfoRequest req = GetLedgerInfoRequest.builder()
                .ledger("ledger001")
                .build();

            GetLedgerInfoResponse res = sdk.ledger().getLedgerInfo()
                .request(req)
                .call();

            if (res.ledgerInfoResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetLedgerInfoRequest](../../models/operations/GetLedgerInfoRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetLedgerInfoResponse](../../models/operations/GetLedgerInfoResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getMapping

Get the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetMappingRequest;
import com.formance.formance_sdk.models.operations.GetMappingResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            GetMappingRequest req = GetMappingRequest.builder()
                .ledger("ledger001")
                .build();

            GetMappingResponse res = sdk.ledger().getMapping()
                .request(req)
                .call();

            if (res.mappingResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetMappingRequest](../../models/operations/GetMappingRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetMappingResponse](../../models/operations/GetMappingResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## getTransaction

Get transaction from a ledger by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.GetTransactionRequest;
import com.formance.formance_sdk.models.operations.GetTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            GetTransactionResponse res = sdk.ledger().getTransaction()
                .request(req)
                .call();

            if (res.transactionResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTransactionRequest](../../models/operations/GetTransactionRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.ListAccountsRequest;
import com.formance.formance_sdk.models.operations.ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            ListAccountsResponse res = sdk.ledger().listAccounts()
                .request(req)
                .call();

            if (res.accountsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListAccountsRequest](../../models/operations/ListAccountsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListAccountsResponse](../../models/operations/ListAccountsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listLogs

List the logs from a ledger, sorted by ID in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.ListLogsRequest;
import com.formance.formance_sdk.models.operations.ListLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            ListLogsResponse res = sdk.ledger().listLogs()
                .request(req)
                .call();

            if (res.logsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListLogsRequest](../../models/operations/ListLogsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListLogsResponse](../../models/operations/ListLogsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## listTransactions

List transactions from a ledger, sorted by txid in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.ListTransactionsRequest;
import com.formance.formance_sdk.models.operations.ListTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            ListTransactionsResponse res = sdk.ledger().listTransactions()
                .request(req)
                .call();

            if (res.transactionsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTransactionsResponse](../../models/operations/ListTransactionsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## readStats

Get statistics from a ledger. (aggregate metrics on accounts and transactions)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.ReadStatsRequest;
import com.formance.formance_sdk.models.operations.ReadStatsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            ReadStatsRequest req = ReadStatsRequest.builder()
                .ledger("ledger001")
                .build();

            ReadStatsResponse res = sdk.ledger().readStats()
                .request(req)
                .call();

            if (res.statsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ReadStatsRequest](../../models/operations/ReadStatsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ReadStatsResponse](../../models/operations/ReadStatsResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## revertTransaction

Revert a ledger transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.RevertTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            RevertTransactionResponse res = sdk.ledger().revertTransaction()
                .request(req)
                .call();

            if (res.transactionResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [RevertTransactionRequest](../../models/operations/RevertTransactionRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[RevertTransactionResponse](../../models/operations/RevertTransactionResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## ~~runScript~~

This route is deprecated, and has been merged into `POST /{ledger}/transactions`.


> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.RunScriptRequest;
import com.formance.formance_sdk.models.operations.RunScriptResponse;
import com.formance.formance_sdk.models.shared.Script;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            RunScriptResponse res = sdk.ledger().runScript()
                .request(req)
                .call();

            if (res.scriptResponse().isPresent()) {
                // handle response
            }
        } catch (SDKError e) {
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

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [RunScriptRequest](../../models/operations/RunScriptRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[RunScriptResponse](../../models/operations/RunScriptResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## updateMapping

Update the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.UpdateMappingRequest;
import com.formance.formance_sdk.models.operations.UpdateMappingResponse;
import com.formance.formance_sdk.models.shared.Contract;
import com.formance.formance_sdk.models.shared.Expr;
import com.formance.formance_sdk.models.shared.Mapping;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            UpdateMappingResponse res = sdk.ledger().updateMapping()
                .request(req)
                .call();

            if (res.mappingResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateMappingRequest](../../models/operations/UpdateMappingRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateMappingResponse](../../models/operations/UpdateMappingResponse.md)**

### Errors

| Error Object                | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4xx-5xx                     | \*\/*                       |


## v2AddMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionRequest;
import com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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

            V2AddMetadataOnTransactionResponse res = sdk.ledger().v2AddMetadataOnTransaction()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [V2AddMetadataOnTransactionRequest](../../models/operations/V2AddMetadataOnTransactionRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[V2AddMetadataOnTransactionResponse](../../models/operations/V2AddMetadataOnTransactionResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2AddMetadataToAccount

Add metadata to an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2AddMetadataToAccountRequest;
import com.formance.formance_sdk.models.operations.V2AddMetadataToAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2AddMetadataToAccountRequest req = V2AddMetadataToAccountRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("admin", "true")))
                .address("users:001")
                .ledger("ledger001")
                .dryRun(true)
                .build();

            V2AddMetadataToAccountResponse res = sdk.ledger().v2AddMetadataToAccount()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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
| `request`                                                                                 | [V2AddMetadataToAccountRequest](../../models/operations/V2AddMetadataToAccountRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[V2AddMetadataToAccountResponse](../../models/operations/V2AddMetadataToAccountResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2CountAccounts

Count the accounts from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2CountAccountsRequest;
import com.formance.formance_sdk.models.operations.V2CountAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2CountAccountsRequest req = V2CountAccountsRequest.builder()
                .ledger("ledger001")
                .build();

            V2CountAccountsResponse res = sdk.ledger().v2CountAccounts()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2CountAccountsRequest](../../models/operations/V2CountAccountsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2CountAccountsResponse](../../models/operations/V2CountAccountsResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2CountTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.V2CountTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2CountTransactionsRequest req = V2CountTransactionsRequest.builder()
                .ledger("ledger001")
                .build();

            V2CountTransactionsResponse res = sdk.ledger().v2CountTransactions()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [V2CountTransactionsRequest](../../models/operations/V2CountTransactionsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[V2CountTransactionsResponse](../../models/operations/V2CountTransactionsResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2CreateBulk

Bulk request

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2CreateBulkRequest;
import com.formance.formance_sdk.models.operations.V2CreateBulkResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2CreateBulkRequest req = V2CreateBulkRequest.builder()
                .ledger("ledger001")
                .requestBody(List.of(
                ))
                .build();

            V2CreateBulkResponse res = sdk.ledger().v2CreateBulk()
                .request(req)
                .call();

            if (res.v2BulkResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V2CreateBulkRequest](../../models/operations/V2CreateBulkRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V2CreateBulkResponse](../../models/operations/V2CreateBulkResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2CreateLedger

Create a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2CreateLedgerRequest;
import com.formance.formance_sdk.models.operations.V2CreateLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2CreateLedgerRequest req = V2CreateLedgerRequest.builder()
                .ledger("ledger001")
                .v2CreateLedgerRequest(com.formance.formance_sdk.models.shared.V2CreateLedgerRequest.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("admin", "true")))
                    .build())
                .build();

            V2CreateLedgerResponse res = sdk.ledger().v2CreateLedger()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2CreateLedgerRequest](../../models/operations/V2CreateLedgerRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2CreateLedgerResponse](../../models/operations/V2CreateLedgerResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2CreateTransaction

Create a new transaction to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2CreateTransactionRequest;
import com.formance.formance_sdk.models.operations.V2CreateTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2PostTransaction;
import com.formance.formance_sdk.models.shared.V2PostTransactionScript;
import com.formance.formance_sdk.models.shared.V2Posting;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2CreateTransactionRequest req = V2CreateTransactionRequest.builder()
                .v2PostTransaction(V2PostTransaction.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("admin", "true")))
                    .postings(List.of(
                        V2Posting.builder()
                            .amount(new BigInteger("100"))
                            .asset("COIN")
                            .destination("users:002")
                            .source("users:001")
                            .build()))
                    .reference("ref:001")
                    .script(V2PostTransactionScript.builder()
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
                .dryRun(true)
                .build();

            V2CreateTransactionResponse res = sdk.ledger().v2CreateTransaction()
                .request(req)
                .call();

            if (res.v2CreateTransactionResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [V2CreateTransactionRequest](../../models/operations/V2CreateTransactionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[V2CreateTransactionResponse](../../models/operations/V2CreateTransactionResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2DeleteAccountMetadata

Delete metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2DeleteAccountMetadataRequest req = V2DeleteAccountMetadataRequest.builder()
                .address("3680 Emile Grove")
                .key("foo")
                .ledger("ledger001")
                .build();

            V2DeleteAccountMetadataResponse res = sdk.ledger().v2DeleteAccountMetadata()
                .request(req)
                .call();

            // handle response
        } catch (SDKError e) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [V2DeleteAccountMetadataRequest](../../models/operations/V2DeleteAccountMetadataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[V2DeleteAccountMetadataResponse](../../models/operations/V2DeleteAccountMetadataResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## v2DeleteLedgerMetadata

Delete ledger metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2DeleteLedgerMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteLedgerMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2DeleteLedgerMetadataRequest req = V2DeleteLedgerMetadataRequest.builder()
                .key("foo")
                .ledger("ledger001")
                .build();

            V2DeleteLedgerMetadataResponse res = sdk.ledger().v2DeleteLedgerMetadata()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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
| `request`                                                                                 | [V2DeleteLedgerMetadataRequest](../../models/operations/V2DeleteLedgerMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[V2DeleteLedgerMetadataResponse](../../models/operations/V2DeleteLedgerMetadataResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2DeleteTransactionMetadata

Delete metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2DeleteTransactionMetadataRequest req = V2DeleteTransactionMetadataRequest.builder()
                .id(new BigInteger("1234"))
                .key("foo")
                .ledger("ledger001")
                .build();

            V2DeleteTransactionMetadataResponse res = sdk.ledger().v2DeleteTransactionMetadata()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [V2DeleteTransactionMetadataRequest](../../models/operations/V2DeleteTransactionMetadataRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[V2DeleteTransactionMetadataResponse](../../models/operations/V2DeleteTransactionMetadataResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetAccount

Get account by its address

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetAccountRequest;
import com.formance.formance_sdk.models.operations.V2GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetAccountRequest req = V2GetAccountRequest.builder()
                .address("users:001")
                .ledger("ledger001")
                .build();

            V2GetAccountResponse res = sdk.ledger().v2GetAccount()
                .request(req)
                .call();

            if (res.v2AccountResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V2GetAccountRequest](../../models/operations/V2GetAccountRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V2GetAccountResponse](../../models/operations/V2GetAccountResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetBalancesAggregated

Get the aggregated balances from selected accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedRequest;
import com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetBalancesAggregatedRequest req = V2GetBalancesAggregatedRequest.builder()
                .ledger("ledger001")
                .build();

            V2GetBalancesAggregatedResponse res = sdk.ledger().v2GetBalancesAggregated()
                .request(req)
                .call();

            if (res.v2AggregateBalancesResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [V2GetBalancesAggregatedRequest](../../models/operations/V2GetBalancesAggregatedRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[V2GetBalancesAggregatedResponse](../../models/operations/V2GetBalancesAggregatedResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetInfo

Show server information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetInfoResponse res = sdk.ledger().v2GetInfo()
                .call();

            if (res.v2ConfigInfoResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

**[V2GetInfoResponse](../../models/operations/V2GetInfoResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetLedger

Get a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetLedgerRequest;
import com.formance.formance_sdk.models.operations.V2GetLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetLedgerRequest req = V2GetLedgerRequest.builder()
                .ledger("ledger001")
                .build();

            V2GetLedgerResponse res = sdk.ledger().v2GetLedger()
                .request(req)
                .call();

            if (res.v2GetLedgerResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [V2GetLedgerRequest](../../models/operations/V2GetLedgerRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[V2GetLedgerResponse](../../models/operations/V2GetLedgerResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetLedgerInfo

Get information about a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetLedgerInfoRequest;
import com.formance.formance_sdk.models.operations.V2GetLedgerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetLedgerInfoRequest req = V2GetLedgerInfoRequest.builder()
                .ledger("ledger001")
                .build();

            V2GetLedgerInfoResponse res = sdk.ledger().v2GetLedgerInfo()
                .request(req)
                .call();

            if (res.v2LedgerInfoResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2GetLedgerInfoRequest](../../models/operations/V2GetLedgerInfoRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2GetLedgerInfoResponse](../../models/operations/V2GetLedgerInfoResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetTransaction

Get transaction from a ledger by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetTransactionRequest;
import com.formance.formance_sdk.models.operations.V2GetTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetTransactionRequest req = V2GetTransactionRequest.builder()
                .id(new BigInteger("1234"))
                .ledger("ledger001")
                .build();

            V2GetTransactionResponse res = sdk.ledger().v2GetTransaction()
                .request(req)
                .call();

            if (res.v2GetTransactionResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V2GetTransactionRequest](../../models/operations/V2GetTransactionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V2GetTransactionResponse](../../models/operations/V2GetTransactionResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2GetVolumesWithBalances

Get list of volumes with balances for (account/asset)

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2GetVolumesWithBalancesRequest;
import com.formance.formance_sdk.models.operations.V2GetVolumesWithBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2GetVolumesWithBalancesRequest req = V2GetVolumesWithBalancesRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .groupBy(3L)
                .pageSize(100L)
                .build();

            V2GetVolumesWithBalancesResponse res = sdk.ledger().v2GetVolumesWithBalances()
                .request(req)
                .call();

            if (res.v2VolumesWithBalanceCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [V2GetVolumesWithBalancesRequest](../../models/operations/V2GetVolumesWithBalancesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[V2GetVolumesWithBalancesResponse](../../models/operations/V2GetVolumesWithBalancesResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2ListAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2ListAccountsRequest;
import com.formance.formance_sdk.models.operations.V2ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2ListAccountsRequest req = V2ListAccountsRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            V2ListAccountsResponse res = sdk.ledger().v2ListAccounts()
                .request(req)
                .call();

            if (res.v2AccountsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2ListAccountsRequest](../../models/operations/V2ListAccountsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2ListAccountsResponse](../../models/operations/V2ListAccountsResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2ListLedgers

List ledgers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2ListLedgersRequest;
import com.formance.formance_sdk.models.operations.V2ListLedgersResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2ListLedgersRequest req = V2ListLedgersRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            V2ListLedgersResponse res = sdk.ledger().v2ListLedgers()
                .request(req)
                .call();

            if (res.v2LedgerListResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2ListLedgersRequest](../../models/operations/V2ListLedgersRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2ListLedgersResponse](../../models/operations/V2ListLedgersResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2ListLogs

List the logs from a ledger, sorted by ID in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2ListLogsRequest;
import com.formance.formance_sdk.models.operations.V2ListLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2ListLogsRequest req = V2ListLogsRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            V2ListLogsResponse res = sdk.ledger().v2ListLogs()
                .request(req)
                .call();

            if (res.v2LogsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [V2ListLogsRequest](../../models/operations/V2ListLogsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[V2ListLogsResponse](../../models/operations/V2ListLogsResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2ListTransactions

List transactions from a ledger, sorted by id in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2ListTransactionsRequest;
import com.formance.formance_sdk.models.operations.V2ListTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2ListTransactionsRequest req = V2ListTransactionsRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            V2ListTransactionsResponse res = sdk.ledger().v2ListTransactions()
                .request(req)
                .call();

            if (res.v2TransactionsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [V2ListTransactionsRequest](../../models/operations/V2ListTransactionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[V2ListTransactionsResponse](../../models/operations/V2ListTransactionsResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2ReadStats

Get statistics from a ledger. (aggregate metrics on accounts and transactions)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2ReadStatsRequest;
import com.formance.formance_sdk.models.operations.V2ReadStatsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2ReadStatsRequest req = V2ReadStatsRequest.builder()
                .ledger("ledger001")
                .build();

            V2ReadStatsResponse res = sdk.ledger().v2ReadStats()
                .request(req)
                .call();

            if (res.v2StatsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [V2ReadStatsRequest](../../models/operations/V2ReadStatsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[V2ReadStatsResponse](../../models/operations/V2ReadStatsResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2RevertTransaction

Revert a ledger transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.V2RevertTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2RevertTransactionRequest req = V2RevertTransactionRequest.builder()
                .id(new BigInteger("1234"))
                .ledger("ledger001")
                .build();

            V2RevertTransactionResponse res = sdk.ledger().v2RevertTransaction()
                .request(req)
                .call();

            if (res.v2RevertTransactionResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [V2RevertTransactionRequest](../../models/operations/V2RevertTransactionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[V2RevertTransactionResponse](../../models/operations/V2RevertTransactionResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |


## v2UpdateLedgerMetadata

Update ledger metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.models.operations.V2UpdateLedgerMetadataRequest;
import com.formance.formance_sdk.models.operations.V2UpdateLedgerMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
                .build();

            V2UpdateLedgerMetadataRequest req = V2UpdateLedgerMetadataRequest.builder()
                .ledger("ledger001")
                .requestBody(Map.ofEntries(
                    Map.entry("admin", "true")))
                .build();

            V2UpdateLedgerMetadataResponse res = sdk.ledger().v2UpdateLedgerMetadata()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.V2ErrorResponse e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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
| `request`                                                                                 | [V2UpdateLedgerMetadataRequest](../../models/operations/V2UpdateLedgerMetadataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[V2UpdateLedgerMetadataResponse](../../models/operations/V2UpdateLedgerMetadataResponse.md)**

### Errors

| Error Object                  | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4xx-5xx                       | \*\/*                         |
