# Ledger.V2

## Overview

### Available Operations

* [addMetadataOnTransaction](#addmetadataontransaction) - Set the metadata of a transaction by its ID
* [addMetadataToAccount](#addmetadatatoaccount) - Add metadata to an account
* [countAccounts](#countaccounts) - Count the accounts from a ledger
* [countTransactions](#counttransactions) - Count the transactions from a ledger
* [createBulk](#createbulk) - Bulk request
* [createExporter](#createexporter) - Create exporter
* [createLedger](#createledger) - Create a ledger
* [createPipeline](#createpipeline) - Create pipeline
* [createTransaction](#createtransaction) - Create a new transaction to a ledger
* [deleteAccountMetadata](#deleteaccountmetadata) - Delete metadata by key
* [deleteBucket](#deletebucket) - Delete bucket
* [deleteExporter](#deleteexporter) - Delete exporter
* [deleteLedgerMetadata](#deleteledgermetadata) - Delete ledger metadata by key
* [deletePipeline](#deletepipeline) - Delete pipeline
* [deleteTransactionMetadata](#deletetransactionmetadata) - Delete metadata by key
* [exportLogs](#exportlogs) - Export logs
* [getAccount](#getaccount) - Get account by its address
* [getBalancesAggregated](#getbalancesaggregated) - Get the aggregated balances from selected accounts
* [getExporterState](#getexporterstate) - Get exporter state
* [getLedger](#getledger) - Get a ledger
* [getLedgerInfo](#getledgerinfo) - Get information about a ledger
* [getPipelineState](#getpipelinestate) - Get pipeline state
* [getSchema](#getschema) - Get a schema for a ledger by version
* [getTransaction](#gettransaction) - Get transaction from a ledger by its ID
* [getVolumesWithBalances](#getvolumeswithbalances) - Get list of volumes with balances for (account/asset)
* [importLogs](#importlogs)
* [insertSchema](#insertschema) - Insert a schema for a ledger
* [listAccounts](#listaccounts) - List accounts from a ledger
* [listExporters](#listexporters) - List exporters
* [listLedgers](#listledgers) - List ledgers
* [listLogs](#listlogs) - List the logs from a ledger
* [listPipelines](#listpipelines) - List pipelines
* [listSchemas](#listschemas) - List all schemas for a ledger
* [listTransactions](#listtransactions) - List transactions from a ledger
* [readStats](#readstats) - Get statistics from a ledger
* [resetPipeline](#resetpipeline) - Reset pipeline
* [restoreBucket](#restorebucket) - Restore bucket
* [revertTransaction](#reverttransaction) - Revert a ledger transaction by its ID
* [runQuery](#runquery) - Run a query template
* [startPipeline](#startpipeline) - Start pipeline
* [stopPipeline](#stoppipeline) - Stop pipeline
* [updateExporter](#updateexporter) - Update exporter
* [updateLedgerMetadata](#updateledgermetadata) - Update ledger metadata

## addMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

<!-- UsageSnippet language="java" operationID="v2AddMetadataOnTransaction" method="post" path="/api/ledger/v2/{ledger}/transactions/{id}/metadata" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2AddMetadataOnTransactionRequest req = V2AddMetadataOnTransactionRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("admin", "true")))
                .id(new BigInteger("1234"))
                .ledger("ledger001")
                .dryRun(true)
                .schemaVersion("v1.0.0")
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

<!-- UsageSnippet language="java" operationID="v2AddMetadataToAccount" method="post" path="/api/ledger/v2/{ledger}/accounts/{address}/metadata" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2AddMetadataToAccountRequest req = V2AddMetadataToAccountRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("admin", "true")))
                .address("users:001")
                .ledger("ledger001")
                .dryRun(true)
                .schemaVersion("v1.0.0")
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

<!-- UsageSnippet language="java" operationID="v2CountAccounts" method="head" path="/api/ledger/v2/{ledger}/accounts" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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

<!-- UsageSnippet language="java" operationID="v2CountTransactions" method="head" path="/api/ledger/v2/{ledger}/transactions" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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

<!-- UsageSnippet language="java" operationID="v2CreateBulk" method="post" path="/api/ledger/v2/{ledger}/_bulk" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreateBulkRequest;
import com.formance.formance_sdk.models.operations.V2CreateBulkResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2BulkElementRevertTransaction;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2CreateBulkRequest req = V2CreateBulkRequest.builder()
                .requestBody(List.of(
                    V2BulkElementRevertTransaction.builder()
                        .action("REVERT_TRANSACTION")
                        .build()))
                .ledger("ledger001")
                .atomic(true)
                .continueOnFailure(true)
                .parallel(true)
                .schemaVersion("v1.0.0")
                .build();

        V2CreateBulkResponse res = sdk.ledger().v2().createBulk()
                .request(req)
                .call();

        if (res.v2BulkResponse().isPresent()) {
            System.out.println(res.v2BulkResponse().get());
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

## createExporter

Create exporter

### Example Usage

<!-- UsageSnippet language="java" operationID="v2CreateExporter" method="post" path="/api/ledger/v2/_/exporters" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreateExporterResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2CreateExporterRequest;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2CreateExporterRequest req = V2CreateExporterRequest.builder()
                .config(Map.ofEntries(
                    Map.entry("key", "<value>")))
                .driver("<value>")
                .build();

        V2CreateExporterResponse res = sdk.ledger().v2().createExporter()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2CreateExporterRequest](../../models/shared/V2CreateExporterRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2CreateExporterResponse](../../models/operations/V2CreateExporterResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createLedger

Create a ledger

### Example Usage

<!-- UsageSnippet language="java" operationID="v2CreateLedger" method="post" path="/api/ledger/v2/{ledger}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreateLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2CreateLedgerRequest;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.V2CreateLedgerRequest req = com.formance.formance_sdk.models.operations.V2CreateLedgerRequest.builder()
                .v2CreateLedgerRequest(V2CreateLedgerRequest.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("admin", "true")))
                    .build())
                .ledger("ledger001")
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

## createPipeline

Create pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="v2CreatePipeline" method="post" path="/api/ledger/v2/{ledger}/pipelines" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreatePipelineRequest;
import com.formance.formance_sdk.models.operations.V2CreatePipelineResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2CreatePipelineRequest req = V2CreatePipelineRequest.builder()
                .ledger("ledger001")
                .build();

        V2CreatePipelineResponse res = sdk.ledger().v2().createPipeline()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V2CreatePipelineRequest](../../models/operations/V2CreatePipelineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V2CreatePipelineResponse](../../models/operations/V2CreatePipelineResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## createTransaction

Create a new transaction to a ledger

### Example Usage

<!-- UsageSnippet language="java" operationID="v2CreateTransaction" method="post" path="/api/ledger/v2/{ledger}/transactions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2CreateTransactionRequest;
import com.formance.formance_sdk.models.operations.V2CreateTransactionResponse;
import com.formance.formance_sdk.models.shared.*;
import java.lang.Exception;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2CreateTransactionRequest req = V2CreateTransactionRequest.builder()
                .v2PostTransaction(V2PostTransaction.builder()
                    .metadata(Map.ofEntries(
                        Map.entry("admin", "true")))
                    .accountMetadata(Map.ofEntries(
                        Map.entry("key", Map.ofEntries(
                            Map.entry("admin", "true"))),
                        Map.entry("key1", Map.ofEntries(
                            Map.entry("admin", "true"))),
                        Map.entry("key2", Map.ofEntries(
                            Map.entry("admin", "true")))))
                    .postings(List.of(
                        V2Posting.builder()
                            .amount(new BigInteger("100"))
                            .asset("COIN")
                            .destination("users:002")
                            .source("users:001")
                            .build()))
                    .reference("ref:001")
                    .script(V2PostTransactionScript.builder()
                        .plain("vars {\naccount $user\n}\nsend [COIN 10] (\n\tsource = @world\n\tdestination = $user\n)\n")
                        .template("CUSTOMER_DEPOSIT")
                        .vars(Map.ofEntries(
                            Map.entry("user", "users:042")))
                        .build())
                    .build())
                .ledger("ledger001")
                .dryRun(true)
                .force(true)
                .schemaVersion("v1.0.0")
                .build();

        V2CreateTransactionResponse res = sdk.ledger().v2().createTransaction()
                .request(req)
                .call();

        if (res.v2CreateTransactionResponse().isPresent()) {
            System.out.println(res.v2CreateTransactionResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2DeleteAccountMetadata" method="delete" path="/api/ledger/v2/{ledger}/accounts/{address}/metadata/{key}" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2DeleteAccountMetadataRequest req = V2DeleteAccountMetadataRequest.builder()
                .address("6753 S Washington Street")
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

## deleteBucket

Delete a bucket by marking all ledgers in the bucket as deleted (soft delete). All ledgers in the bucket will have their deleted_at field set to the current timestamp.

### Example Usage

<!-- UsageSnippet language="java" operationID="v2DeleteBucket" method="delete" path="/api/ledger/v2/_/buckets/{bucket}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2DeleteBucketRequest;
import com.formance.formance_sdk.models.operations.V2DeleteBucketResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2DeleteBucketRequest req = V2DeleteBucketRequest.builder()
                .bucket("<value>")
                .build();

        V2DeleteBucketResponse res = sdk.ledger().v2().deleteBucket()
                .request(req)
                .call();

        if (res.v2ErrorResponse().isPresent()) {
            System.out.println(res.v2ErrorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2DeleteBucketRequest](../../models/operations/V2DeleteBucketRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2DeleteBucketResponse](../../models/operations/V2DeleteBucketResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deleteExporter

Delete exporter

### Example Usage

<!-- UsageSnippet language="java" operationID="v2DeleteExporter" method="delete" path="/api/ledger/v2/_/exporters/{exporterID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2DeleteExporterRequest;
import com.formance.formance_sdk.models.operations.V2DeleteExporterResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2DeleteExporterRequest req = V2DeleteExporterRequest.builder()
                .exporterID("<id>")
                .build();

        V2DeleteExporterResponse res = sdk.ledger().v2().deleteExporter()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V2DeleteExporterRequest](../../models/operations/V2DeleteExporterRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V2DeleteExporterResponse](../../models/operations/V2DeleteExporterResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deleteLedgerMetadata

Delete ledger metadata by key

### Example Usage

<!-- UsageSnippet language="java" operationID="v2DeleteLedgerMetadata" method="delete" path="/api/ledger/v2/{ledger}/metadata/{key}" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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

## deletePipeline

Delete pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="v2DeletePipeline" method="delete" path="/api/ledger/v2/{ledger}/pipelines/{pipelineID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2DeletePipelineRequest;
import com.formance.formance_sdk.models.operations.V2DeletePipelineResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2DeletePipelineRequest req = V2DeletePipelineRequest.builder()
                .ledger("ledger001")
                .pipelineID("<id>")
                .build();

        V2DeletePipelineResponse res = sdk.ledger().v2().deletePipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V2DeletePipelineRequest](../../models/operations/V2DeletePipelineRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V2DeletePipelineResponse](../../models/operations/V2DeletePipelineResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## deleteTransactionMetadata

Delete metadata by key

### Example Usage

<!-- UsageSnippet language="java" operationID="v2DeleteTransactionMetadata" method="delete" path="/api/ledger/v2/{ledger}/transactions/{id}/metadata/{key}" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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

<!-- UsageSnippet language="java" operationID="v2ExportLogs" method="post" path="/api/ledger/v2/{ledger}/logs/export" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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

<!-- UsageSnippet language="java" operationID="v2GetAccount" method="get" path="/api/ledger/v2/{ledger}/accounts/{address}" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
            System.out.println(res.v2AccountResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2GetBalancesAggregated" method="get" path="/api/ledger/v2/{ledger}/aggregate/balances" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetBalancesAggregatedRequest req = V2GetBalancesAggregatedRequest.builder()
                .ledger("ledger001")
                .build();

        V2GetBalancesAggregatedResponse res = sdk.ledger().v2().getBalancesAggregated()
                .request(req)
                .call();

        if (res.v2AggregateBalancesResponse().isPresent()) {
            System.out.println(res.v2AggregateBalancesResponse().get());
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

## getExporterState

Get exporter state

### Example Usage

<!-- UsageSnippet language="java" operationID="v2GetExporterState" method="get" path="/api/ledger/v2/_/exporters/{exporterID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetExporterStateRequest;
import com.formance.formance_sdk.models.operations.V2GetExporterStateResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetExporterStateRequest req = V2GetExporterStateRequest.builder()
                .exporterID("<id>")
                .build();

        V2GetExporterStateResponse res = sdk.ledger().v2().getExporterState()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [V2GetExporterStateRequest](../../models/operations/V2GetExporterStateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[V2GetExporterStateResponse](../../models/operations/V2GetExporterStateResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getLedger

Get a ledger

### Example Usage

<!-- UsageSnippet language="java" operationID="v2GetLedger" method="get" path="/api/ledger/v2/{ledger}" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetLedgerRequest req = V2GetLedgerRequest.builder()
                .ledger("ledger001")
                .build();

        V2GetLedgerResponse res = sdk.ledger().v2().getLedger()
                .request(req)
                .call();

        if (res.v2GetLedgerResponse().isPresent()) {
            System.out.println(res.v2GetLedgerResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2GetLedgerInfo" method="get" path="/api/ledger/v2/{ledger}/_info" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetLedgerInfoRequest req = V2GetLedgerInfoRequest.builder()
                .ledger("ledger001")
                .build();

        V2GetLedgerInfoResponse res = sdk.ledger().v2().getLedgerInfo()
                .request(req)
                .call();

        if (res.v2LedgerInfoResponse().isPresent()) {
            System.out.println(res.v2LedgerInfoResponse().get());
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

## getPipelineState

Get pipeline state

### Example Usage

<!-- UsageSnippet language="java" operationID="v2GetPipelineState" method="get" path="/api/ledger/v2/{ledger}/pipelines/{pipelineID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetPipelineStateRequest;
import com.formance.formance_sdk.models.operations.V2GetPipelineStateResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetPipelineStateRequest req = V2GetPipelineStateRequest.builder()
                .ledger("ledger001")
                .pipelineID("<id>")
                .build();

        V2GetPipelineStateResponse res = sdk.ledger().v2().getPipelineState()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [V2GetPipelineStateRequest](../../models/operations/V2GetPipelineStateRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[V2GetPipelineStateResponse](../../models/operations/V2GetPipelineStateResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getSchema

Get a schema for a ledger by version

### Example Usage

<!-- UsageSnippet language="java" operationID="v2GetSchema" method="get" path="/api/ledger/v2/{ledger}/schemas/{version}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetSchemaRequest;
import com.formance.formance_sdk.models.operations.V2GetSchemaResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetSchemaRequest req = V2GetSchemaRequest.builder()
                .ledger("ledger001")
                .version("v1.0.0")
                .build();

        V2GetSchemaResponse res = sdk.ledger().v2().getSchema()
                .request(req)
                .call();

        if (res.v2SchemaResponse().isPresent()) {
            System.out.println(res.v2SchemaResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [V2GetSchemaRequest](../../models/operations/V2GetSchemaRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[V2GetSchemaResponse](../../models/operations/V2GetSchemaResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getTransaction

Get transaction from a ledger by its ID

### Example Usage

<!-- UsageSnippet language="java" operationID="v2GetTransaction" method="get" path="/api/ledger/v2/{ledger}/transactions/{id}" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
            System.out.println(res.v2GetTransactionResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2GetVolumesWithBalances" method="get" path="/api/ledger/v2/{ledger}/volumes" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetVolumesWithBalancesRequest req = V2GetVolumesWithBalancesRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .groupBy(3L)
                .pageSize(100L)
                .sort("id:desc")
                .build();

        V2GetVolumesWithBalancesResponse res = sdk.ledger().v2().getVolumesWithBalances()
                .request(req)
                .call();

        if (res.v2VolumesWithBalanceCursorResponse().isPresent()) {
            System.out.println(res.v2VolumesWithBalanceCursorResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2ImportLogs" method="post" path="/api/ledger/v2/{ledger}/logs/import" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ImportLogsRequest;
import com.formance.formance_sdk.models.operations.V2ImportLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ImportLogsRequest req = V2ImportLogsRequest.builder()
                .v2ImportLogsRequest("0xde3EDEE9e6".getBytes(StandardCharsets.UTF_8))
                .ledger("ledger001")
                .build();

        V2ImportLogsResponse res = sdk.ledger().v2().importLogs()
                .request(req)
                .call();

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

## insertSchema

Insert a schema for a ledger

### Example Usage

<!-- UsageSnippet language="java" operationID="v2InsertSchema" method="post" path="/api/ledger/v2/{ledger}/schemas/{version}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2InsertSchemaRequest;
import com.formance.formance_sdk.models.operations.V2InsertSchemaResponse;
import com.formance.formance_sdk.models.shared.*;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2InsertSchemaRequest req = V2InsertSchemaRequest.builder()
                .v2SchemaData(V2SchemaData.builder()
                    .chart(Map.ofEntries(
                        Map.entry("users", V2ChartSegment.builder()
                            .additionalProperties(Map.ofEntries(
                                Map.entry("$userID", V2ChartSegment.builder()
                                    .dotPattern("^[0-9]{16}$")
                                    .build())))
                            .build())))
                    .queries(Map.ofEntries(
                        Map.entry("key", V2QueryTemplate.builder()
                            .params(V2QueryParams.of(QueryTemplateAccountParams.builder()
                                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                                .pageSize(100L)
                                .sort("id:desc")
                                .build()))
                            .build())))
                    .build())
                .ledger("ledger001")
                .version("v1.0.0")
                .build();

        V2InsertSchemaResponse res = sdk.ledger().v2().insertSchema()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2InsertSchemaRequest](../../models/operations/V2InsertSchemaRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2InsertSchemaResponse](../../models/operations/V2InsertSchemaResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ListAccounts" method="get" path="/api/ledger/v2/{ledger}/accounts" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListAccountsRequest req = V2ListAccountsRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort("id:desc")
                .build();

        V2ListAccountsResponse res = sdk.ledger().v2().listAccounts()
                .request(req)
                .call();

        if (res.v2AccountsCursorResponse().isPresent()) {
            System.out.println(res.v2AccountsCursorResponse().get());
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

## listExporters

List exporters

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ListExporters" method="get" path="/api/ledger/v2/_/exporters" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListExportersResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListExportersResponse res = sdk.ledger().v2().listExporters()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Response

**[V2ListExportersResponse](../../models/operations/V2ListExportersResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listLedgers

List ledgers

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ListLedgers" method="get" path="/api/ledger/v2" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListLedgersRequest req = V2ListLedgersRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort("id:desc")
                .build();

        V2ListLedgersResponse res = sdk.ledger().v2().listLedgers()
                .request(req)
                .call();

        if (res.v2LedgerListResponse().isPresent()) {
            System.out.println(res.v2LedgerListResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2ListLogs" method="get" path="/api/ledger/v2/{ledger}/logs" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListLogsRequest req = V2ListLogsRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort("id:desc")
                .build();

        V2ListLogsResponse res = sdk.ledger().v2().listLogs()
                .request(req)
                .call();

        if (res.v2LogsCursorResponse().isPresent()) {
            System.out.println(res.v2LogsCursorResponse().get());
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

## listPipelines

List pipelines

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ListPipelines" method="get" path="/api/ledger/v2/{ledger}/pipelines" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListPipelinesRequest;
import com.formance.formance_sdk.models.operations.V2ListPipelinesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListPipelinesRequest req = V2ListPipelinesRequest.builder()
                .ledger("ledger001")
                .build();

        V2ListPipelinesResponse res = sdk.ledger().v2().listPipelines()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2ListPipelinesRequest](../../models/operations/V2ListPipelinesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2ListPipelinesResponse](../../models/operations/V2ListPipelinesResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listSchemas

List all schemas for a ledger

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ListSchemas" method="get" path="/api/ledger/v2/{ledger}/schemas" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ListSchemasRequest;
import com.formance.formance_sdk.models.operations.V2ListSchemasResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListSchemasRequest req = V2ListSchemasRequest.builder()
                .ledger("ledger001")
                .build();

        V2ListSchemasResponse res = sdk.ledger().v2().listSchemas()
                .request(req)
                .call();

        if (res.v2SchemasCursorResponse().isPresent()) {
            System.out.println(res.v2SchemasCursorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2ListSchemasRequest](../../models/operations/V2ListSchemasRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2ListSchemasResponse](../../models/operations/V2ListSchemasResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## listTransactions

List transactions from a ledger, sorted by id in descending order.

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ListTransactions" method="get" path="/api/ledger/v2/{ledger}/transactions" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ListTransactionsRequest req = V2ListTransactionsRequest.builder()
                .ledger("ledger001")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort("id:desc")
                .build();

        V2ListTransactionsResponse res = sdk.ledger().v2().listTransactions()
                .request(req)
                .call();

        if (res.v2TransactionsCursorResponse().isPresent()) {
            System.out.println(res.v2TransactionsCursorResponse().get());
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

<!-- UsageSnippet language="java" operationID="v2ReadStats" method="get" path="/api/ledger/v2/{ledger}/stats" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ReadStatsRequest req = V2ReadStatsRequest.builder()
                .ledger("ledger001")
                .build();

        V2ReadStatsResponse res = sdk.ledger().v2().readStats()
                .request(req)
                .call();

        if (res.v2StatsResponse().isPresent()) {
            System.out.println(res.v2StatsResponse().get());
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

## resetPipeline

Reset pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="v2ResetPipeline" method="post" path="/api/ledger/v2/{ledger}/pipelines/{pipelineID}/reset" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2ResetPipelineRequest;
import com.formance.formance_sdk.models.operations.V2ResetPipelineResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2ResetPipelineRequest req = V2ResetPipelineRequest.builder()
                .ledger("ledger001")
                .pipelineID("<id>")
                .build();

        V2ResetPipelineResponse res = sdk.ledger().v2().resetPipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2ResetPipelineRequest](../../models/operations/V2ResetPipelineRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2ResetPipelineResponse](../../models/operations/V2ResetPipelineResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## restoreBucket

Restore a deleted bucket by unmarking all ledgers in the bucket as deleted. All ledgers in the bucket will have their deleted_at field set to NULL.

### Example Usage

<!-- UsageSnippet language="java" operationID="v2RestoreBucket" method="post" path="/api/ledger/v2/_/buckets/{bucket}/restore" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2RestoreBucketRequest;
import com.formance.formance_sdk.models.operations.V2RestoreBucketResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2RestoreBucketRequest req = V2RestoreBucketRequest.builder()
                .bucket("<value>")
                .build();

        V2RestoreBucketResponse res = sdk.ledger().v2().restoreBucket()
                .request(req)
                .call();

        if (res.v2ErrorResponse().isPresent()) {
            System.out.println(res.v2ErrorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2RestoreBucketRequest](../../models/operations/V2RestoreBucketRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2RestoreBucketResponse](../../models/operations/V2RestoreBucketResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## revertTransaction

Revert a ledger transaction by its ID

### Example Usage

<!-- UsageSnippet language="java" operationID="v2RevertTransaction" method="post" path="/api/ledger/v2/{ledger}/transactions/{id}/revert" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2RevertTransactionRequest req = V2RevertTransactionRequest.builder()
                .id(new BigInteger("1234"))
                .ledger("ledger001")
                .dryRun(true)
                .schemaVersion("v1.0.0")
                .build();

        V2RevertTransactionResponse res = sdk.ledger().v2().revertTransaction()
                .request(req)
                .call();

        if (res.v2RevertTransactionResponse().isPresent()) {
            System.out.println(res.v2RevertTransactionResponse().get());
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

## runQuery

Run a query template on a ledger

### Example Usage

<!-- UsageSnippet language="java" operationID="v2RunQuery" method="post" path="/api/ledger/v2/{ledger}/queries/{id}/run" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import java.lang.Exception;
import java.lang.Object;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2RunQueryRequest req = V2RunQueryRequest.builder()
                .requestBody(V2RunQueryRequestBody.builder()
                    .params(V2QueryParams.of(QueryTemplateAccountParams.builder()
                        .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                        .pageSize(100L)
                        .sort("id:desc")
                        .build()))
                    .build())
                .id("CUSTOMER_DEPOSIT")
                .ledger("ledger001")
                .schemaVersion("v1.0.0")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .sort("id:desc")
                .build();

        V2RunQueryResponse res = sdk.ledger().v2().runQuery()
                .request(req)
                .call();

        if (res.oneOf().isPresent()) {
            V2RunQueryResponseBody unionValue = res.oneOf().get();
            Object raw = unionValue.value();
            if (raw instanceof V2TransactionsCursorResponse) {
                V2TransactionsCursorResponse v2TransactionsCursorResponseValue = (V2TransactionsCursorResponse) raw;
                // Handle v2TransactionsCursorResponse variant
            } else if (raw instanceof V2AccountsCursorResponse) {
                V2AccountsCursorResponse v2AccountsCursorResponseValue = (V2AccountsCursorResponse) raw;
                // Handle v2AccountsCursorResponse variant
            } else if (raw instanceof V2LogsCursorResponse) {
                V2LogsCursorResponse v2LogsCursorResponseValue = (V2LogsCursorResponse) raw;
                // Handle v2LogsCursorResponse variant
            } else if (raw instanceof V2VolumesWithBalanceCursorResponse) {
                V2VolumesWithBalanceCursorResponse v2VolumesWithBalanceCursorResponseValue = (V2VolumesWithBalanceCursorResponse) raw;
                // Handle v2VolumesWithBalanceCursorResponse variant
            } else {
                // Unknown or unsupported variant
            }
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [V2RunQueryRequest](../../models/operations/V2RunQueryRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[V2RunQueryResponse](../../models/operations/V2RunQueryResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## startPipeline

Start pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="v2StartPipeline" method="post" path="/api/ledger/v2/{ledger}/pipelines/{pipelineID}/start" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2StartPipelineRequest;
import com.formance.formance_sdk.models.operations.V2StartPipelineResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2StartPipelineRequest req = V2StartPipelineRequest.builder()
                .ledger("ledger001")
                .pipelineID("<id>")
                .build();

        V2StartPipelineResponse res = sdk.ledger().v2().startPipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2StartPipelineRequest](../../models/operations/V2StartPipelineRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2StartPipelineResponse](../../models/operations/V2StartPipelineResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## stopPipeline

Stop pipeline

### Example Usage

<!-- UsageSnippet language="java" operationID="v2StopPipeline" method="post" path="/api/ledger/v2/{ledger}/pipelines/{pipelineID}/stop" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2StopPipelineRequest;
import com.formance.formance_sdk.models.operations.V2StopPipelineResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2StopPipelineRequest req = V2StopPipelineRequest.builder()
                .ledger("ledger001")
                .pipelineID("<id>")
                .build();

        V2StopPipelineResponse res = sdk.ledger().v2().stopPipeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2StopPipelineRequest](../../models/operations/V2StopPipelineRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2StopPipelineResponse](../../models/operations/V2StopPipelineResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## updateExporter

Update exporter

### Example Usage

<!-- UsageSnippet language="java" operationID="v2UpdateExporter" method="put" path="/api/ledger/v2/_/exporters/{exporterID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2UpdateExporterRequest;
import com.formance.formance_sdk.models.operations.V2UpdateExporterResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2CreateExporterRequest;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2UpdateExporterRequest req = V2UpdateExporterRequest.builder()
                .v2CreateExporterRequest(V2CreateExporterRequest.builder()
                    .config(Map.ofEntries(
                        Map.entry("key", "<value>"),
                        Map.entry("key1", "<value>"),
                        Map.entry("key2", "<value>")))
                    .driver("<value>")
                    .build())
                .exporterID("<id>")
                .build();

        V2UpdateExporterResponse res = sdk.ledger().v2().updateExporter()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V2UpdateExporterRequest](../../models/operations/V2UpdateExporterRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V2UpdateExporterResponse](../../models/operations/V2UpdateExporterResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## updateLedgerMetadata

Update ledger metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="v2UpdateLedgerMetadata" method="put" path="/api/ledger/v2/{ledger}/metadata" -->
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
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2UpdateLedgerMetadataRequest req = V2UpdateLedgerMetadataRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("admin", "true")))
                .ledger("ledger001")
                .build();

        V2UpdateLedgerMetadataResponse res = sdk.ledger().v2().updateLedgerMetadata()
                .request(req)
                .call();

        if (res.v2ErrorResponse().isPresent()) {
            System.out.println(res.v2ErrorResponse().get());
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

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |