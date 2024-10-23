# V2
(*ledger().v2()*)

## Overview

### Available Operations

* [addMetadataOnTransaction](#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](#countaccounts) - Count the accounts from a ledger
* [countTransactions](#counttransactions) - Count the transactions from a ledger
* [createBulk](#createbulk) - Bulk request
* [createLedger](#createledger) - Create a ledger
* [createTransaction](#createtransaction) - Create a new transaction to a ledger
* [deleteAccountMetadata](#deleteaccountmetadata) - Delete metadata by key
* [deleteLedgerMetadata](#deleteledgermetadata) - Delete ledger metadata by key
* [deleteTransactionMetadata](#deletetransactionmetadata) - Delete metadata by key
* [exportLogs](#exportlogs) - Export logs
* [getAccount](#getaccount) - Get account by its address
* [getBalancesAggregated](#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getInfo](#getinfo) - Show server information
* [getLedger](#getledger) - Get a ledger
* [getLedgerInfo](#getledgerinfo) - Get information about a ledger
* [getTransaction](#gettransaction) - Get transaction from a ledger by its ID
* [getVolumesWithBalances](#getvolumeswithbalances) - Get list of volumes with balances for (account/asset)
* [importLogs](#importlogs)
* [listAccounts](#listaccounts) - List accounts from a ledger
* [listLedgers](#listledgers) - List ledgers
* [listLogs](#listlogs) - List the logs from a ledger
* [listTransactions](#listtransactions) - List transactions from a ledger
* [readStats](#readstats) - Get statistics from a ledger
* [revertTransaction](#reverttransaction) - Revert a ledger transaction by its ID
* [updateLedgerMetadata](#updateledgermetadata) - Update ledger metadata

## addMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

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

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [V2AddMetadataOnTransactionRequest](../../models/operations/V2AddMetadataOnTransactionRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[V2AddMetadataOnTransactionResponse](../../models/operations/V2AddMetadataOnTransactionResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## addMetadataToAccount

Add metadata to an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2AddMetadataToAccountRequest;
import com.formance.formance_sdk.models.operations.V2AddMetadataToAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2AddMetadataToAccountResponse res = sdk.ledger().v2().addMetadataToAccount()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## countAccounts

Count the accounts from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CountAccountsRequest;
import com.formance.formance_sdk.models.operations.V2CountAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2CountAccountsRequest req = V2CountAccountsRequest.builder()
                .ledger("ledger001")
                .build();

        V2CountAccountsResponse res = sdk.ledger().v2().countAccounts()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## countTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.V2CountTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2CountTransactionsRequest req = V2CountTransactionsRequest.builder()
                .ledger("ledger001")
                .build();

        V2CountTransactionsResponse res = sdk.ledger().v2().countTransactions()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createBulk

Bulk request

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreateBulkRequest;
import com.formance.formance_sdk.models.operations.V2CreateBulkResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2BulkElementAddMetadata;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2CreateBulkRequest req = V2CreateBulkRequest.builder()
                .ledger("ledger001")
                .requestBody(List.of(
                    V2BulkElementAddMetadata.builder()
                        .action("<value>")
                        .build()))
                .build();

        V2CreateBulkResponse res = sdk.ledger().v2().createBulk()
                .request(req)
                .call();

        if (res.v2BulkResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createLedger

Create a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreateLedgerRequest;
import com.formance.formance_sdk.models.operations.V2CreateLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2CreateLedgerResponse res = sdk.ledger().v2().createLedger()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createTransaction

Create a new transaction to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
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

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2CreateTransactionResponse res = sdk.ledger().v2().createTransaction()
                .request(req)
                .call();

        if (res.v2CreateTransactionResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deleteAccountMetadata

Delete metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2DeleteAccountMetadataRequest req = V2DeleteAccountMetadataRequest.builder()
                .address("96609 Cummings Canyon")
                .key("foo")
                .ledger("ledger001")
                .build();

        V2DeleteAccountMetadataResponse res = sdk.ledger().v2().deleteAccountMetadata()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deleteLedgerMetadata

Delete ledger metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2DeleteLedgerMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteLedgerMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2DeleteLedgerMetadataResponse res = sdk.ledger().v2().deleteLedgerMetadata()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deleteTransactionMetadata

Delete metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2DeleteTransactionMetadataResponse res = sdk.ledger().v2().deleteTransactionMetadata()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## exportLogs

Export logs

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ExportLogsRequest;
import com.formance.formance_sdk.models.operations.V2ExportLogsResponse;
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

        V2ExportLogsRequest req = V2ExportLogsRequest.builder()
                .ledger("ledger001")
                .build();

        V2ExportLogsResponse res = sdk.ledger().v2().exportLogs()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V2ExportLogsRequest](../../models/operations/V2ExportLogsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V2ExportLogsResponse](../../models/operations/V2ExportLogsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccount

Get account by its address

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetAccountRequest;
import com.formance.formance_sdk.models.operations.V2GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2GetAccountResponse res = sdk.ledger().v2().getAccount()
                .request(req)
                .call();

        if (res.v2AccountResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getBalancesAggregated

Get the aggregated balances from selected accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedRequest;
import com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetBalancesAggregatedRequest req = V2GetBalancesAggregatedRequest.builder()
                .ledger("ledger001")
                .build();

        V2GetBalancesAggregatedResponse res = sdk.ledger().v2().getBalancesAggregated()
                .request(req)
                .call();

        if (res.v2AggregateBalancesResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getInfo

Show server information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetInfoResponse res = sdk.ledger().v2().getInfo()
                .call();

        if (res.v2ConfigInfoResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V2GetInfoResponse](../../models/operations/V2GetInfoResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getLedger

Get a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetLedgerRequest;
import com.formance.formance_sdk.models.operations.V2GetLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetLedgerRequest req = V2GetLedgerRequest.builder()
                .ledger("ledger001")
                .build();

        V2GetLedgerResponse res = sdk.ledger().v2().getLedger()
                .request(req)
                .call();

        if (res.v2GetLedgerResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getLedgerInfo

Get information about a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetLedgerInfoRequest;
import com.formance.formance_sdk.models.operations.V2GetLedgerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetLedgerInfoRequest req = V2GetLedgerInfoRequest.builder()
                .ledger("ledger001")
                .build();

        V2GetLedgerInfoResponse res = sdk.ledger().v2().getLedgerInfo()
                .request(req)
                .call();

        if (res.v2LedgerInfoResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getTransaction

Get transaction from a ledger by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetTransactionRequest;
import com.formance.formance_sdk.models.operations.V2GetTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2GetTransactionResponse res = sdk.ledger().v2().getTransaction()
                .request(req)
                .call();

        if (res.v2GetTransactionResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getVolumesWithBalances

Get list of volumes with balances for (account/asset)

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetVolumesWithBalancesRequest;
import com.formance.formance_sdk.models.operations.V2GetVolumesWithBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2GetVolumesWithBalancesResponse res = sdk.ledger().v2().getVolumesWithBalances()
                .request(req)
                .call();

        if (res.v2VolumesWithBalanceCursorResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## importLogs

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ImportLogsRequest;
import com.formance.formance_sdk.models.operations.V2ImportLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ImportLogsRequest req = V2ImportLogsRequest.builder()
                .ledger("ledger001")
                .build();

        V2ImportLogsResponse res = sdk.ledger().v2().importLogs()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [V2ImportLogsRequest](../../models/operations/V2ImportLogsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[V2ImportLogsResponse](../../models/operations/V2ImportLogsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListAccountsRequest;
import com.formance.formance_sdk.models.operations.V2ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2ListAccountsResponse res = sdk.ledger().v2().listAccounts()
                .request(req)
                .call();

        if (res.v2AccountsCursorResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listLedgers

List ledgers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListLedgersRequest;
import com.formance.formance_sdk.models.operations.V2ListLedgersResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2ListLedgersResponse res = sdk.ledger().v2().listLedgers()
                .request(req)
                .call();

        if (res.v2LedgerListResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listLogs

List the logs from a ledger, sorted by ID in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListLogsRequest;
import com.formance.formance_sdk.models.operations.V2ListLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2ListLogsResponse res = sdk.ledger().v2().listLogs()
                .request(req)
                .call();

        if (res.v2LogsCursorResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listTransactions

List transactions from a ledger, sorted by id in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListTransactionsRequest;
import com.formance.formance_sdk.models.operations.V2ListTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2ListTransactionsResponse res = sdk.ledger().v2().listTransactions()
                .request(req)
                .call();

        if (res.v2TransactionsCursorResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## readStats

Get statistics from a ledger. (aggregate metrics on accounts and transactions)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ReadStatsRequest;
import com.formance.formance_sdk.models.operations.V2ReadStatsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ReadStatsRequest req = V2ReadStatsRequest.builder()
                .ledger("ledger001")
                .build();

        V2ReadStatsResponse res = sdk.ledger().v2().readStats()
                .request(req)
                .call();

        if (res.v2StatsResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## revertTransaction

Revert a ledger transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.V2RevertTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.math.BigInteger;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2RevertTransactionResponse res = sdk.ledger().v2().revertTransaction()
                .request(req)
                .call();

        if (res.v2RevertTransactionResponse().isPresent()) {
            // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## updateLedgerMetadata

Update ledger metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2UpdateLedgerMetadataRequest;
import com.formance.formance_sdk.models.operations.V2UpdateLedgerMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

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

        V2UpdateLedgerMetadataResponse res = sdk.ledger().v2().updateLedgerMetadata()
                .request(req)
                .call();

        // handle response
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |