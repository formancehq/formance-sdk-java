# Ledger.V3

## Overview

### Available Operations

* [addAccountType](#addaccounttype) - Add an account type
* [aggregateVolumes](#aggregatevolumes) - Aggregate volumes
* [analyzeAccounts](#analyzeaccounts) - Analyze accounts and suggest a Chart of Accounts
* [analyzeNumscript](#analyzenumscript) - Analyze Numscript source
* [analyzeTransactions](#analyzetransactions) - Analyze transaction flow patterns
* [bulkOperations](#bulkoperations) - Bulk operations
* [clusterz](#clusterz) - Cluster-availability probe
* [createIndex](#createindex) - Create an index on a ledger
* [createLedger](#createledger) - Create a new ledger
* [createPreparedQuery](#createpreparedquery) - Create a prepared query
* [createTransaction](#createtransaction) - Create a new transaction
* [deleteAccountMetadata](#deleteaccountmetadata) - Delete account metadata
* [deleteLedger](#deleteledger) - Delete a ledger
* [deleteLedgerMetadata](#deleteledgermetadata) - Delete ledger metadata
* [deletePreparedQuery](#deletepreparedquery) - Delete a prepared query
* [deleteTransactionMetadata](#deletetransactionmetadata) - Delete transaction metadata
* [dropIndex](#dropindex) - Drop an index from a ledger
* [executePreparedQuery](#executepreparedquery) - Execute a prepared query
* [getAccount](#getaccount) - Get an account
* [getAccountType](#getaccounttype) - Get an account type
* [getAuditEntry](#getauditentry) - Get an audit entry
* [getBucketIndex](#getbucketindex) - Get a single bucket-scoped index registry entry
* [getBucketIndexEntryStatus](#getbucketindexentrystatus) - Get the per-replica status of a single bucket-scoped index
* [getEventsSinks](#geteventssinks) - List configured event sinks
* [getIndex](#getindex) - Get a single index registry entry
* [getIndexEntryStatus](#getindexentrystatus) - Get the per-replica status of a single index
* [getIndexStatus](#getindexstatus) - Get aggregated index registry status
* [getLedger](#getledger) - Get a ledger
* [getLedgerStats](#getledgerstats) - Get ledger statistics
* [getLog](#getlog) - Get a single system log by bucket-wide sequence
* [getMetadataSchemaStatus](#getmetadataschemastatus) - Get metadata schema
* [getNumscript](#getnumscript) - Get a numscript
* [getNumscriptUsage](#getnumscriptusage) - Get template usage
* [getTransaction](#gettransaction) - Get a transaction
* [health](#health) - Health check
* [info](#info) - Get server build information
* [inspectIndex](#inspectindex) - Inspect a metadata index
* [listAccountTypes](#listaccounttypes) - List account types
* [listAccounts](#listaccounts) - List accounts
* [listAllLedgers](#listallledgers) - List all ledgers
* [listAuditEntries](#listauditentries) - List audit entries
* [listBucketIndexes](#listbucketindexes) - List bucket-wide indexes
* [listLedgerIndexes](#listledgerindexes) - List indexes for a ledger
* [listLedgerLogs](#listledgerlogs) - List logs for a ledger
* [listLedgerTransactions](#listledgertransactions) - List transactions for a ledger
* [listNumscriptVersions](#listnumscriptversions) - List numscript versions
* [listNumscripts](#listnumscripts) - List all numscripts
* [listPreparedQueries](#listpreparedqueries) - List prepared queries
* [listSigningKeys](#listsigningkeys) - List registered Ed25519 signing keys
* [livez](#livez) - Liveness probe
* [promoteLedger](#promoteledger) - Promote a mirror ledger
* [readyz](#readyz) - Readiness probe
* [removeAccountType](#removeaccounttype) - Remove an account type
* [removeEventsSink](#removeeventssink) - Remove an event sink
* [removeMetadataFieldType](#removemetadatafieldtype) - Remove metadata field type
* [revertTransaction](#reverttransaction) - Revert a transaction
* [saveAccountMetadata](#saveaccountmetadata) - Save account metadata
* [saveLedgerMetadata](#saveledgermetadata) - Save ledger metadata
* [saveNumscript](#savenumscript) - Save a numscript
* [saveTransactionMetadata](#savetransactionmetadata) - Save transaction metadata
* [setDefaultEnforcementMode](#setdefaultenforcementmode) - Set default enforcement mode
* [setMetadataFieldType](#setmetadatafieldtype) - Set metadata field type
* [updatePreparedQuery](#updatepreparedquery) - Update a prepared query

## addAccountType

Adds a new account type to a ledger's chart of accounts. Account types define
address patterns for account validation. Requires `ledger:WriteMetadata` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3AddAccountType" method="post" path="/api/ledger/v3/{ledgerName}/account-types" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.*;
import com.formance.formance_sdk.models.operations.V3AddAccountTypeRequest;
import com.formance.formance_sdk.models.operations.V3AddAccountTypeResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3AddAccountTypeRequest req = V3AddAccountTypeRequest.builder()
                .addAccountTypeRequest(AddAccountTypeRequest.builder()
                    .name("user-checking")
                    .pattern("users:{id}:checking")
                    .persistence(AddAccountTypeRequestPersistence.EPHEMERAL)
                    .segmentTypes(Map.ofEntries(
                        Map.entry("id", SegmentType.builder()
                            .type(SegmentTypeType.UUID)
                            .build())))
                    .build())
                .ledgerName("<value>")
                .build();

        V3AddAccountTypeResponse res = sdk.ledger().v3().addAccountType()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3AddAccountTypeRequest](../../models/operations/V3AddAccountTypeRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3AddAccountTypeSecurity](../../models/operations/V3AddAccountTypeSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3AddAccountTypeResponse](../../models/operations/V3AddAccountTypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## aggregateVolumes

Returns aggregated volumes (input/output/balance per asset) across all accounts in the ledger.
Supports filtering accounts with the generic `filter` parameter, grouping by account prefixes,
and max-precision merging.
Requires `ledger:ReadAccount` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3AggregateVolumes" method="get" path="/api/ledger/v3/{ledgerName}/volumes" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3AggregateVolumesRequest;
import com.formance.formance_sdk.models.operations.V3AggregateVolumesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3AggregateVolumesRequest req = V3AggregateVolumesRequest.builder()
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3AggregateVolumesResponse res = sdk.ledger().v3().aggregateVolumes()
                .request(req)
                .call();

        if (res.aggregateVolumesResponse().isPresent()) {
            System.out.println(res.aggregateVolumesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [V3AggregateVolumesRequest](../../models/operations/V3AggregateVolumesRequest.md)                                               | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [com.formance.formance_sdk.models.operations.V3AggregateVolumesSecurity](../../models/operations/V3AggregateVolumesSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |

### Response

**[V3AggregateVolumesResponse](../../models/operations/V3AggregateVolumesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## analyzeAccounts

Scans all accounts in a ledger, discovers address patterns, and returns a
suggested Chart of Accounts. Useful after a mirror import to understand
account structure. Requires `ledger:read` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3AnalyzeAccounts" method="get" path="/api/ledger/v3/{ledgerName}/analyze-accounts" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3AnalyzeAccountsRequest;
import com.formance.formance_sdk.models.operations.V3AnalyzeAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3AnalyzeAccountsRequest req = V3AnalyzeAccountsRequest.builder()
                .ledgerName("<value>")
                .build();

        V3AnalyzeAccountsResponse res = sdk.ledger().v3().analyzeAccounts()
                .request(req)
                .call();

        if (res.analyzeAccountsResponse().isPresent()) {
            System.out.println(res.analyzeAccountsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [V3AnalyzeAccountsRequest](../../models/operations/V3AnalyzeAccountsRequest.md)                                               | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [com.formance.formance_sdk.models.operations.V3AnalyzeAccountsSecurity](../../models/operations/V3AnalyzeAccountsSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |

### Response

**[V3AnalyzeAccountsResponse](../../models/operations/V3AnalyzeAccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## analyzeNumscript

Validates Numscript v1 and returns the external input schema without reading or changing ledger state. Recognized source failures are returned as diagnostics with an empty input list. Sources over 64 KiB or with more than 32 block-comment open markers receive a syntax diagnostic; internal failures return a server error.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3AnalyzeNumscript" method="post" path="/api/ledger/v3/numscripts/analyze" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.AnalyzeNumscriptRequest;
import com.formance.formance_sdk.models.operations.V3AnalyzeNumscriptResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        AnalyzeNumscriptRequest req = AnalyzeNumscriptRequest.builder()
                .source("<value>")
                .version("v1")
                .build();

        V3AnalyzeNumscriptResponse res = sdk.ledger().v3().analyzeNumscript()
                .request(req)
                .call();

        if (res.analyzeNumscriptResponse().isPresent()) {
            System.out.println(res.analyzeNumscriptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [AnalyzeNumscriptRequest](../../models/shared/AnalyzeNumscriptRequest.md)                                                       | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [com.formance.formance_sdk.models.operations.V3AnalyzeNumscriptSecurity](../../models/operations/V3AnalyzeNumscriptSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |

### Response

**[V3AnalyzeNumscriptResponse](../../models/operations/V3AnalyzeNumscriptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## analyzeTransactions

Scans all transactions in a ledger, discovers flow patterns by normalizing
account addresses, and returns statistics per flow type including temporal
distribution and volume metrics. Requires `ledger:read` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3AnalyzeTransactions" method="get" path="/api/ledger/v3/{ledgerName}/analyze-transactions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3AnalyzeTransactionsRequest;
import com.formance.formance_sdk.models.operations.V3AnalyzeTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3AnalyzeTransactionsRequest req = V3AnalyzeTransactionsRequest.builder()
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3AnalyzeTransactionsResponse res = sdk.ledger().v3().analyzeTransactions()
                .request(req)
                .call();

        if (res.analyzeTransactionsResponse().isPresent()) {
            System.out.println(res.analyzeTransactionsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3AnalyzeTransactionsRequest](../../models/operations/V3AnalyzeTransactionsRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3AnalyzeTransactionsSecurity](../../models/operations/V3AnalyzeTransactionsSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3AnalyzeTransactionsResponse](../../models/operations/V3AnalyzeTransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## bulkOperations

Execute multiple operations (create transactions, add metadata,
revert transactions, delete metadata) in a single request. Requires
`ledger:write` scope.

With `atomic=true`, all elements target the URL's ledger and are
submitted as one batch. `Idempotency-Key` identifies that whole batch;
per-element `ik` values are ignored. With `atomic=false`
(default), each element is submitted separately under its own
`ik`; the header is ignored.

`continueOnFailure` controls sequential continuation and business-error
status rollup. It does not allow partial application of an atomic
batch. Non-atomic failures can follow already committed elements:
inspect every result and preserve the original identities when retrying.
A timeout or infrastructure failure does not prove that work was not
committed. This contract does not enable automatic SDK retries.

The response status is decided in three tiers:

1. **Request-level failures** (before per-element processing):
   malformed body → `400`, missing/insufficient scope → `401` or
   `403`, too many elements → `413`. Exceeding the byte limit while
   decoding the body currently returns `400`.
   Returned unconditionally, `continueOnFailure` does not apply.
2. **Infrastructure failures during processing** (transport
   timeout, cache-horizon exceeded, storage error): the overall
   status is `503` for retryable failures and `500` otherwise,
   regardless of `continueOnFailure`. Callers
   must inspect the element outcomes before deciding what to retry.
3. **Per-element errors during processing**: each element's error
   carries the HTTP status it would surface as a single request
   (via the same mapping `handleError` uses). The top-level
   status is the "worst" of them, with `continueOnFailure`
   applying only to per-element business failures (4xx):
   - Business failures (validation, not-found, conflict,
     precondition — 4xx, except authentication/permission): rolled up per
     `continueOnFailure`. `true` → `200`; `false` (default) →
     the highest 4xx among failing elements (typically `400`).
   - Authentication and permission failures: `401`/`403`, regardless
     of `continueOnFailure`, with all processing outcomes retained.
   - Resource exhaustion (`KindResourceExhausted`, `429`), including
     rate limits and permanent authoritative-sequence exhaustion:
     surface unconditionally as `429`.
   - Retryable infrastructure failures (leader loss,
     cache-horizon exceeded, `KindUnavailable`): surface as
     `503` with `Retry-After: 1`, regardless of
     `continueOnFailure`.
   - Non-retryable infrastructure failures (transport / storage
     errors, `KindInternal`, unclassified): surface as `500`.
   - Aborted elements (`context.Canceled` from the sequential
     runner after a prior failure): contribute nothing — the
     originating error drives the rollup.
Signed requests use `application/json` (including MIME parameters) with
`request` and standard-base64 `payload`. Either signing header, even if
empty, selects this wrapper; with neither header present, the ordinary REST body applies.
Runtime headers choose the representation from the documented anyOf.
The signed protobuf batch must
equal the route/body/Idempotency-Key-derived batch in full. Supply exactly
one nonempty Formance-Signing-Key-Id and Formance-Signature header; the
latter is a standard-base64 Ed25519 signature of 64 decoded bytes. Missing,
empty or repeated signing headers, invalid base64 and wrong signature
length return 400. Signing headers with a non-JSON or missing content type return 415.
Signature enforcement
returns 401 `UNAUTHENTICATED` when required but absent and 403
`PERMISSION_DENIED` for invalid, unknown/revoked-key or mismatched
signatures. Malformed signed envelopes return 400. The complete
wrapper counts toward the 4 MiB body limit. JWT scopes still apply.
Signing requires a nonempty array and `atomic=true` (otherwise 400).
The header key applies; per-element `ik` is ignored. Authentication
and permission failures remain 401/403 even with continueOnFailure;
processing errors preserve every element outcome.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3BulkOperations" method="post" path="/api/ledger/v3/{ledgerName}/bulk" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.*;
import com.formance.formance_sdk.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3BulkOperationsRequest req = V3BulkOperationsRequest.builder()
                .requestBody(V3BulkOperationsRequestBody.of(List.of(
                    BulkElement.builder()
                        .action(Action.REVERT_TRANSACTION)
                        .data(BulkElementData.of(RevertTransactionRequest.builder()
                            .id(725647L)
                            .build()))
                        .build())))
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3BulkOperationsResponse res = sdk.ledger().v3().bulkOperations()
                .request(req)
                .call();

        if (res.bulkResponse().isPresent()) {
            System.out.println(res.bulkResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3BulkOperationsRequest](../../models/operations/V3BulkOperationsRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3BulkOperationsSecurity](../../models/operations/V3BulkOperationsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3BulkOperationsResponse](../../models/operations/V3BulkOperationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## clusterz

Returns 200 only when the node is part of a healthy cluster (Raft state
healthy and a leader elected). Disk and clock skew gate writes (see
admission), not cluster readiness. Returns 503 otherwise. Use this
for external monitoring or any client that needs to wait until the node
can actually serve cluster-dependent traffic. Kubernetes readiness
probes should target `/readyz` instead — this endpoint MUST NOT gate
StatefulSet ordering, otherwise the cluster cannot recover from a
full-kill cold start.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3Clusterz" method="get" path="/api/ledger/clusterz" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ClusterzResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ClusterzResponse res = sdk.ledger().v3().clusterz()
                .call();

        if (res.healthResponse().isPresent()) {
            System.out.println(res.healthResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                      | [com.formance.formance_sdk.models.operations.V3ClusterzSecurity](../../models/operations/V3ClusterzSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |

### Response

**[V3ClusterzResponse](../../models/operations/V3ClusterzResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createIndex

Registers a new index on the ledger. An existing canonical index on
this ledger is rejected with `INDEX_ALREADY_EXISTS` (HTTP 409), even
while building or retyping, without changing its definition or progress.
Replaying an identical batch with its retained `Idempotency-Key` returns
the original result. The indexbuilder processes the accepted creation.
The request body carries the target `IndexID` in
canonical form (see `DELETE /v3/{ledgerName}/indexes/{canonicalId}`
for the format). Requires `ledger:WriteLedger` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3CreateIndex" method="post" path="/api/ledger/v3/{ledgerName}/indexes" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3CreateIndexRequest req = V3CreateIndexRequest.builder()
                .requestBody(V3CreateIndexRequestBody.builder()
                    .id("metadata:TARGET_TYPE_ACCOUNT:color")
                    .build())
                .ledgerName("<value>")
                .build();

        V3CreateIndexResponse res = sdk.ledger().v3().createIndex()
                .request(req)
                .call();

        if (res.createIndexResponse().isPresent()) {
            System.out.println(res.createIndexResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [V3CreateIndexRequest](../../models/operations/V3CreateIndexRequest.md)                                               | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |
| `security`                                                                                                            | [com.formance.formance_sdk.models.operations.V3CreateIndexSecurity](../../models/operations/V3CreateIndexSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |

### Response

**[V3CreateIndexResponse](../../models/operations/V3CreateIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createLedger

Creates a new ledger with the specified name. Storage is configured at the server level.
Each ledger has its own Raft group for data consistency. Requires `ledger:write` scope.

The ledger name `_` is reserved: all system / non-ledger routes live
under the `/v3/_/…` segment (e.g. `/v3/_/audit-entries`), so a ledger
named `_` would be unreachable over REST. Creating it is rejected with a
validation error. The exact name `_system` is also reserved for system
events and rejected. Other underscore-prefixed names remain valid.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3CreateLedger" method="post" path="/api/ledger/v3/{ledgerName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.*;
import com.formance.formance_sdk.models.operations.V3CreateLedgerRequest;
import com.formance.formance_sdk.models.operations.V3CreateLedgerResponse;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3CreateLedgerRequest req = V3CreateLedgerRequest.builder()
                .createLedgerRequest(CreateLedgerRequest.builder()
                    .accountTypes(Map.ofEntries(
                        Map.entry("user-checking", AddAccountTypeRequest.builder()
                            .name("user-checking")
                            .pattern("users:{id}:checking")
                            .persistence(AddAccountTypeRequestPersistence.EPHEMERAL)
                            .segmentTypes(Map.ofEntries(
                                Map.entry("id", SegmentType.builder()
                                    .type(SegmentTypeType.UUID)
                                    .build())))
                            .build())))
                    .initialSchema(List.of(
                        MetadataFieldTypeCommand.builder()
                            .key("color")
                            .targetType(MetadataFieldTypeCommandTargetType.ACCOUNT)
                            .type(MetadataFieldTypeCommandType.STRING)
                            .build()))
                    .build())
                .ledgerName("<value>")
                .build();

        V3CreateLedgerResponse res = sdk.ledger().v3().createLedger()
                .request(req)
                .call();

        if (res.createLedgerResponse().isPresent()) {
            System.out.println(res.createLedgerResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [V3CreateLedgerRequest](../../models/operations/V3CreateLedgerRequest.md)                                               | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [com.formance.formance_sdk.models.operations.V3CreateLedgerSecurity](../../models/operations/V3CreateLedgerSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |

### Response

**[V3CreateLedgerResponse](../../models/operations/V3CreateLedgerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createPreparedQuery

Creates a new prepared query for a ledger. A prepared query defines a reusable
filter that can be executed later with parameter substitution. Requires `ledger:WriteQuery` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3CreatePreparedQuery" method="post" path="/api/ledger/v3/{ledgerName}/prepared-queries" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.CreatePreparedQueryRequest;
import com.formance.formance_sdk.models.ledgerv3.CreatePreparedQueryRequestTarget;
import com.formance.formance_sdk.models.operations.V3CreatePreparedQueryRequest;
import com.formance.formance_sdk.models.operations.V3CreatePreparedQueryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3CreatePreparedQueryRequest req = V3CreatePreparedQueryRequest.builder()
                .createPreparedQueryRequest(CreatePreparedQueryRequest.builder()
                    .name("<value>")
                    .target(CreatePreparedQueryRequestTarget.ACCOUNTS)
                    .build())
                .ledgerName("<value>")
                .build();

        V3CreatePreparedQueryResponse res = sdk.ledger().v3().createPreparedQuery()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3CreatePreparedQueryRequest](../../models/operations/V3CreatePreparedQueryRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3CreatePreparedQuerySecurity](../../models/operations/V3CreatePreparedQuerySecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3CreatePreparedQueryResponse](../../models/operations/V3CreatePreparedQueryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTransaction

Creates a new transaction in the specified ledger with the specified postings. Requires `ledger:write` scope.
Signed requests use `application/json` (including MIME parameters) with
`request` and standard-base64 `payload`. Either signing header, even if
empty, selects this wrapper; with neither header present, the ordinary REST body applies.
Runtime headers choose the representation from the documented anyOf.
The signed protobuf batch must
equal the route/body/Idempotency-Key-derived batch in full. Supply exactly
one nonempty Formance-Signing-Key-Id and Formance-Signature header; the
latter is a standard-base64 Ed25519 signature of 64 decoded bytes. Missing,
empty or repeated signing headers, invalid base64 and wrong signature
length return 400. Signing headers with a non-JSON or missing content type return 415.
Signature enforcement
returns 401 `UNAUTHENTICATED` when required but absent and 403
`PERMISSION_DENIED` for invalid, unknown/revoked-key or mismatched
signatures. Malformed signed envelopes return 400. The complete
wrapper counts toward the 4 MiB body limit. JWT scopes still apply.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3CreateTransaction" method="post" path="/api/ledger/v3/{ledgerName}/transactions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.CreateTransactionRequest;
import com.formance.formance_sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3CreateTransactionRequest req = V3CreateTransactionRequest.builder()
                .requestBody(V3CreateTransactionRequestBody.of(CreateTransactionRequest.builder()
                    .build()))
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3CreateTransactionResponse res = sdk.ledger().v3().createTransaction()
                .request(req)
                .call();

        if (res.createTransactionResponse().isPresent()) {
            System.out.println(res.createTransactionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [V3CreateTransactionRequest](../../models/operations/V3CreateTransactionRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.V3CreateTransactionSecurity](../../models/operations/V3CreateTransactionSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[V3CreateTransactionResponse](../../models/operations/V3CreateTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteAccountMetadata

Deletes a metadata key for a specific account in the ledger. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).

### Example Usage

<!-- UsageSnippet language="java" operationID="v3DeleteAccountMetadata" method="delete" path="/api/ledger/v3/{ledgerName}/accounts/{address}/metadata/{key}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3DeleteAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.V3DeleteAccountMetadataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3DeleteAccountMetadataRequest req = V3DeleteAccountMetadataRequest.builder()
                .address("users:001")
                .key("formance.com/reviewed")
                .ledgerName("<value>")
                .build();

        V3DeleteAccountMetadataResponse res = sdk.ledger().v3().deleteAccountMetadata()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [V3DeleteAccountMetadataRequest](../../models/operations/V3DeleteAccountMetadataRequest.md)                                               | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |
| `security`                                                                                                                                | [com.formance.formance_sdk.models.operations.V3DeleteAccountMetadataSecurity](../../models/operations/V3DeleteAccountMetadataSecurity.md) | :heavy_check_mark:                                                                                                                        | The security requirements to use for the request.                                                                                         |

### Response

**[V3DeleteAccountMetadataResponse](../../models/operations/V3DeleteAccountMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteLedger

Deletes a ledger by its name. This operation removes the ledger and its associated Raft group from the cluster. Requires `ledger:write` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3DeleteLedger" method="delete" path="/api/ledger/v3/{ledgerName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3DeleteLedgerRequest;
import com.formance.formance_sdk.models.operations.V3DeleteLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3DeleteLedgerRequest req = V3DeleteLedgerRequest.builder()
                .ledgerName("<value>")
                .build();

        V3DeleteLedgerResponse res = sdk.ledger().v3().deleteLedger()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [V3DeleteLedgerRequest](../../models/operations/V3DeleteLedgerRequest.md)                                               | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [com.formance.formance_sdk.models.operations.V3DeleteLedgerSecurity](../../models/operations/V3DeleteLedgerSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |

### Response

**[V3DeleteLedgerResponse](../../models/operations/V3DeleteLedgerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteLedgerMetadata

Deletes a metadata key from the ledger. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).

### Example Usage

<!-- UsageSnippet language="java" operationID="v3DeleteLedgerMetadata" method="delete" path="/api/ledger/v3/{ledgerName}/metadata/{key}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3DeleteLedgerMetadataRequest;
import com.formance.formance_sdk.models.operations.V3DeleteLedgerMetadataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3DeleteLedgerMetadataRequest req = V3DeleteLedgerMetadataRequest.builder()
                .key("formance.com/reviewed")
                .ledgerName("<value>")
                .build();

        V3DeleteLedgerMetadataResponse res = sdk.ledger().v3().deleteLedgerMetadata()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [V3DeleteLedgerMetadataRequest](../../models/operations/V3DeleteLedgerMetadataRequest.md)                                               | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |
| `security`                                                                                                                              | [com.formance.formance_sdk.models.operations.V3DeleteLedgerMetadataSecurity](../../models/operations/V3DeleteLedgerMetadataSecurity.md) | :heavy_check_mark:                                                                                                                      | The security requirements to use for the request.                                                                                       |

### Response

**[V3DeleteLedgerMetadataResponse](../../models/operations/V3DeleteLedgerMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deletePreparedQuery

Deletes a prepared query from a ledger. Requires `ledger:WriteQuery` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3DeletePreparedQuery" method="delete" path="/api/ledger/v3/{ledgerName}/prepared-queries/{queryName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3DeletePreparedQueryRequest;
import com.formance.formance_sdk.models.operations.V3DeletePreparedQueryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3DeletePreparedQueryRequest req = V3DeletePreparedQueryRequest.builder()
                .ledgerName("<value>")
                .queryName("<value>")
                .build();

        V3DeletePreparedQueryResponse res = sdk.ledger().v3().deletePreparedQuery()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3DeletePreparedQueryRequest](../../models/operations/V3DeletePreparedQueryRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3DeletePreparedQuerySecurity](../../models/operations/V3DeletePreparedQuerySecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3DeletePreparedQueryResponse](../../models/operations/V3DeletePreparedQueryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteTransactionMetadata

Deletes a metadata key for a specific transaction in the ledger. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).
Signed requests use `application/json` (including MIME parameters) with
`request` and standard-base64 `payload`. Either signing header, even if
empty, selects this wrapper; with neither header present, the ordinary REST body applies.
Runtime headers choose the representation from the documented anyOf.
The signed protobuf batch must
equal the route/body/Idempotency-Key-derived batch in full. Supply exactly
one nonempty Formance-Signing-Key-Id and Formance-Signature header; the
latter is a standard-base64 Ed25519 signature of 64 decoded bytes. Missing,
empty or repeated signing headers, invalid base64 and wrong signature
length return 400. Signing headers with a non-JSON or missing content type return 415.
Signature enforcement
returns 401 `UNAUTHENTICATED` when required but absent and 403
`PERMISSION_DENIED` for invalid, unknown/revoked-key or mismatched
signatures. Malformed signed envelopes return 400. The complete
wrapper counts toward the 4 MiB body limit. JWT scopes still apply.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3DeleteTransactionMetadata" method="delete" path="/api/ledger/v3/{ledgerName}/transactions/{transactionId}/metadata/{key}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3DeleteTransactionMetadataRequest;
import com.formance.formance_sdk.models.operations.V3DeleteTransactionMetadataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3DeleteTransactionMetadataRequest req = V3DeleteTransactionMetadataRequest.builder()
                .key("formance.com/reviewed")
                .ledgerName("<value>")
                .transactionId(831017L)
                .build();

        V3DeleteTransactionMetadataResponse res = sdk.ledger().v3().deleteTransactionMetadata()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [V3DeleteTransactionMetadataRequest](../../models/operations/V3DeleteTransactionMetadataRequest.md)                                               | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |
| `security`                                                                                                                                        | [com.formance.formance_sdk.models.operations.V3DeleteTransactionMetadataSecurity](../../models/operations/V3DeleteTransactionMetadataSecurity.md) | :heavy_check_mark:                                                                                                                                | The security requirements to use for the request.                                                                                                 |

### Response

**[V3DeleteTransactionMetadataResponse](../../models/operations/V3DeleteTransactionMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## dropIndex

Removes an index from a ledger. The path parameter carries the target
`IndexID` in canonical form (e.g. `metadata:TARGET_TYPE_ACCOUNT:color`,
`tx_builtin:TX_BUILTIN_INDEX_TIMESTAMP`). Requires `ledger:WriteLedger` scope.

The drop is idempotent. An `IndexID` that has no registry entry on the
ledger (never created, or already dropped) also answers `204`, and each
committed drop appends a `DROP_INDEX` entry to the ledger log. A
mistyped canonical id is therefore not reported; read the index with
`GET /v3/{ledgerName}/indexes/{canonicalId}` first when the caller must
know that it exists. `404` means that the ledger does not exist.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3DropIndex" method="delete" path="/api/ledger/v3/{ledgerName}/indexes/{canonicalId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3DropIndexRequest;
import com.formance.formance_sdk.models.operations.V3DropIndexResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3DropIndexRequest req = V3DropIndexRequest.builder()
                .canonicalId("<id>")
                .ledgerName("<value>")
                .build();

        V3DropIndexResponse res = sdk.ledger().v3().dropIndex()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [V3DropIndexRequest](../../models/operations/V3DropIndexRequest.md)                                               | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [com.formance.formance_sdk.models.operations.V3DropIndexSecurity](../../models/operations/V3DropIndexSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |

### Response

**[V3DropIndexResponse](../../models/operations/V3DropIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## executePreparedQuery

Executes a prepared query with optional parameter substitution. Supports LIST and
AGGREGATE_VOLUMES modes. LIST uses cursor pagination with an effective page size
of 100 when omitted or zero, capped at 1000 before collecting and enriching rows.
AGGREGATE_VOLUMES ignores pageSize and aggregates all matching accounts. Also
accepts pageSize, cursor and reverse as query parameters. Supplied pageSize and
reverse values, and nonempty cursor values, override the body. Requires `ledger:ReadQuery` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ExecutePreparedQuery" method="post" path="/api/ledger/v3/{ledgerName}/prepared-queries/{queryName}/execute" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ExecutePreparedQueryRequest;
import com.formance.formance_sdk.models.operations.V3ExecutePreparedQueryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ExecutePreparedQueryRequest req = V3ExecutePreparedQueryRequest.builder()
                .ledgerName("<value>")
                .queryName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3ExecutePreparedQueryResponse res = sdk.ledger().v3().executePreparedQuery()
                .request(req)
                .call();

        if (res.executePreparedQueryResponse().isPresent()) {
            System.out.println(res.executePreparedQueryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [V3ExecutePreparedQueryRequest](../../models/operations/V3ExecutePreparedQueryRequest.md)                                               | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |
| `security`                                                                                                                              | [com.formance.formance_sdk.models.operations.V3ExecutePreparedQuerySecurity](../../models/operations/V3ExecutePreparedQuerySecurity.md) | :heavy_check_mark:                                                                                                                      | The security requirements to use for the request.                                                                                       |

### Response

**[V3ExecutePreparedQueryResponse](../../models/operations/V3ExecutePreparedQueryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccount

Retrieves account information including metadata for a specific account address. Requires `ledger:read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetAccount_ledgerV3" method="get" path="/api/ledger/v3/{ledgerName}/accounts/{address}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetAccountLedgerV3Request;
import com.formance.formance_sdk.models.operations.V3GetAccountLedgerV3Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetAccountLedgerV3Request req = V3GetAccountLedgerV3Request.builder()
                .address("users:001")
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3GetAccountLedgerV3Response res = sdk.ledger().v3().getAccount()
                .request(req)
                .call();

        if (res.getAccountResponse().isPresent()) {
            System.out.println(res.getAccountResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [V3GetAccountLedgerV3Request](../../models/operations/V3GetAccountLedgerV3Request.md)                                               | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [com.formance.formance_sdk.models.operations.V3GetAccountLedgerV3Security](../../models/operations/V3GetAccountLedgerV3Security.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |

### Response

**[V3GetAccountLedgerV3Response](../../models/operations/V3GetAccountLedgerV3Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountType

Retrieves a specific account type by name from a ledger. Requires `ledger:ReadAccount` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetAccountType" method="get" path="/api/ledger/v3/{ledgerName}/account-types/{typeName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetAccountTypeRequest;
import com.formance.formance_sdk.models.operations.V3GetAccountTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetAccountTypeRequest req = V3GetAccountTypeRequest.builder()
                .ledgerName("<value>")
                .typeName("<value>")
                .build();

        V3GetAccountTypeResponse res = sdk.ledger().v3().getAccountType()
                .request(req)
                .call();

        if (res.getAccountTypeResponse().isPresent()) {
            System.out.println(res.getAccountTypeResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3GetAccountTypeRequest](../../models/operations/V3GetAccountTypeRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetAccountTypeSecurity](../../models/operations/V3GetAccountTypeSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3GetAccountTypeResponse](../../models/operations/V3GetAccountTypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAuditEntry

Returns a single audit entry by its global sequence, with per-order
`items` populated (the list endpoint omits `items` for compactness).
Requires `ledger:ReadAudit` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetAuditEntry" method="get" path="/api/ledger/v3/_/audit-entries/{sequence}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetAuditEntryRequest;
import com.formance.formance_sdk.models.operations.V3GetAuditEntryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetAuditEntryRequest req = V3GetAuditEntryRequest.builder()
                .sequence(98403L)
                .build();

        V3GetAuditEntryResponse res = sdk.ledger().v3().getAuditEntry()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [V3GetAuditEntryRequest](../../models/operations/V3GetAuditEntryRequest.md)                                               | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.formance.formance_sdk.models.operations.V3GetAuditEntrySecurity](../../models/operations/V3GetAuditEntrySecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |

### Response

**[V3GetAuditEntryResponse](../../models/operations/V3GetAuditEntryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getBucketIndex

Returns the `Index` registry entry for a bucket-scoped index
(`Ledger == ""`, e.g. audit indexes). Ledger-scoped lookups go
through `GET /v3/{ledgerName}/indexes/{canonicalId}` — the two
keyspaces are distinct so a bucket-scoped lookup with the same
canonical will NotFound if only the ledger-scoped entry exists.
Requires `ledger:ReadOps` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetBucketIndex" method="get" path="/api/ledger/v3/_/indexes/{canonicalId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetBucketIndexRequest;
import com.formance.formance_sdk.models.operations.V3GetBucketIndexResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetBucketIndexRequest req = V3GetBucketIndexRequest.builder()
                .canonicalId("<id>")
                .build();

        V3GetBucketIndexResponse res = sdk.ledger().v3().getBucketIndex()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3GetBucketIndexRequest](../../models/operations/V3GetBucketIndexRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetBucketIndexSecurity](../../models/operations/V3GetBucketIndexSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3GetBucketIndexResponse](../../models/operations/V3GetBucketIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getBucketIndexEntryStatus

Returns the `IndexEntry` (registry entry + backfill cursor +
per-replica IndexVersionState) for a bucket-scoped index.
Requires `ledger:ReadOps` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetBucketIndexEntryStatus" method="get" path="/api/ledger/v3/_/indexes/{canonicalId}/status" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetBucketIndexEntryStatusRequest;
import com.formance.formance_sdk.models.operations.V3GetBucketIndexEntryStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetBucketIndexEntryStatusRequest req = V3GetBucketIndexEntryStatusRequest.builder()
                .canonicalId("<id>")
                .build();

        V3GetBucketIndexEntryStatusResponse res = sdk.ledger().v3().getBucketIndexEntryStatus()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [V3GetBucketIndexEntryStatusRequest](../../models/operations/V3GetBucketIndexEntryStatusRequest.md)                                               | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |
| `security`                                                                                                                                        | [com.formance.formance_sdk.models.operations.V3GetBucketIndexEntryStatusSecurity](../../models/operations/V3GetBucketIndexEntryStatusSecurity.md) | :heavy_check_mark:                                                                                                                                | The security requirements to use for the request.                                                                                                 |

### Response

**[V3GetBucketIndexEntryStatusResponse](../../models/operations/V3GetBucketIndexEntryStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getEventsSinks

Returns every event sink configured on the cluster. Requires
`ledger:ReadOps` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetEventsSinks" method="get" path="/api/ledger/v3/_/events-sinks" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetEventsSinksRequest;
import com.formance.formance_sdk.models.operations.V3GetEventsSinksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetEventsSinksRequest req = V3GetEventsSinksRequest.builder()
                .build();

        V3GetEventsSinksResponse res = sdk.ledger().v3().getEventsSinks()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3GetEventsSinksRequest](../../models/operations/V3GetEventsSinksRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetEventsSinksSecurity](../../models/operations/V3GetEventsSinksSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3GetEventsSinksResponse](../../models/operations/V3GetEventsSinksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getIndex

Returns the `Index` registry entry (id, ledger, createdAt,
forwardEncodingVersion) for a single index, serialized in
protobuf-JSON camelCase. Requires `ledger:ReadLedger` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetIndex" method="get" path="/api/ledger/v3/{ledgerName}/indexes/{canonicalId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetIndexRequest;
import com.formance.formance_sdk.models.operations.V3GetIndexResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetIndexRequest req = V3GetIndexRequest.builder()
                .canonicalId("<id>")
                .ledgerName("<value>")
                .build();

        V3GetIndexResponse res = sdk.ledger().v3().getIndex()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [V3GetIndexRequest](../../models/operations/V3GetIndexRequest.md)                                               | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |
| `security`                                                                                                      | [com.formance.formance_sdk.models.operations.V3GetIndexSecurity](../../models/operations/V3GetIndexSecurity.md) | :heavy_check_mark:                                                                                              | The security requirements to use for the request.                                                               |

### Response

**[V3GetIndexResponse](../../models/operations/V3GetIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getIndexEntryStatus

Returns the `IndexEntry` for a single index — the registry entry
joined with the backfill cursor and the per-replica
IndexVersionState (current + pending version). Use this to poll
for backfill completion after a `POST /v3/{ledgerName}/indexes`.
Requires `ledger:ReadLedger` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetIndexEntryStatus" method="get" path="/api/ledger/v3/{ledgerName}/indexes/{canonicalId}/status" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetIndexEntryStatusRequest;
import com.formance.formance_sdk.models.operations.V3GetIndexEntryStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetIndexEntryStatusRequest req = V3GetIndexEntryStatusRequest.builder()
                .canonicalId("<id>")
                .ledgerName("<value>")
                .build();

        V3GetIndexEntryStatusResponse res = sdk.ledger().v3().getIndexEntryStatus()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3GetIndexEntryStatusRequest](../../models/operations/V3GetIndexEntryStatusRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3GetIndexEntryStatusSecurity](../../models/operations/V3GetIndexEntryStatusSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3GetIndexEntryStatusResponse](../../models/operations/V3GetIndexEntryStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getIndexStatus

Returns the aggregated index registry status: per-index backfill cursor,
per-replica IndexVersionState (current/pending), and cluster-wide
counters (LastIndexedSequence, LastLogSequence, Lag, IndexFileSize).
The optional `ledger` query parameter narrows the per-index entries to
a single ledger; the aggregated counters always cover the bucket.
Requires `ledger:ReadOps` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetIndexStatus" method="get" path="/api/ledger/v3/_/indexes/status" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetIndexStatusRequest;
import com.formance.formance_sdk.models.operations.V3GetIndexStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetIndexStatusRequest req = V3GetIndexStatusRequest.builder()
                .build();

        V3GetIndexStatusResponse res = sdk.ledger().v3().getIndexStatus()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3GetIndexStatusRequest](../../models/operations/V3GetIndexStatusRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetIndexStatusSecurity](../../models/operations/V3GetIndexStatusSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3GetIndexStatusResponse](../../models/operations/V3GetIndexStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLedger

Retrieves a ledger by its name. Requires `ledger:read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetLedger" method="get" path="/api/ledger/v3/{ledgerName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetLedgerRequest;
import com.formance.formance_sdk.models.operations.V3GetLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetLedgerRequest req = V3GetLedgerRequest.builder()
                .ledgerName("<value>")
                .build();

        V3GetLedgerResponse res = sdk.ledger().v3().getLedger()
                .request(req)
                .call();

        if (res.getLedgerResponse().isPresent()) {
            System.out.println(res.getLedgerResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [V3GetLedgerRequest](../../models/operations/V3GetLedgerRequest.md)                                               | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [com.formance.formance_sdk.models.operations.V3GetLedgerSecurity](../../models/operations/V3GetLedgerSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |

### Response

**[V3GetLedgerResponse](../../models/operations/V3GetLedgerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLedgerStats

Returns aggregate usage statistics (transaction, volume, reference, posting, log, revert and Numscript-execution counts, plus ephemeral-evicted and transient-used volume tallies) for a ledger. Requires `ledger:read` scope. On live reads, `transactionCount` and `logCount` are FSM-backed. The seven usage-derived counters (`postingCount`, `revertCount`, `numscriptExecutionCount`, `referenceCount`, `ephemeralEvictedCount`, `transientUsedCount`, `volumeCount`) are materialised asynchronously in the serving replica's usagestore and may lag committed state even after the request's ReadIndex barrier. Note: for checkpoint-scoped (historical) reads, only `transactionCount` and `logCount` are checkpoint-consistent; the usage-derived counters (`postingCount`, `revertCount`, `numscriptExecutionCount`, `referenceCount`, `ephemeralEvictedCount`, `transientUsedCount`, `volumeCount`) are sourced from the live usagestore projection, which is not checkpoint-aware, and are returned as `0` at a checkpoint rather than a live value — treat `0` on a checkpoint read as "not available at this checkpoint".

### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetLedgerStats" method="get" path="/api/ledger/v3/{ledgerName}/stats" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetLedgerStatsRequest;
import com.formance.formance_sdk.models.operations.V3GetLedgerStatsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetLedgerStatsRequest req = V3GetLedgerStatsRequest.builder()
                .ledgerName("<value>")
                .build();

        V3GetLedgerStatsResponse res = sdk.ledger().v3().getLedgerStats()
                .request(req)
                .call();

        if (res.getLedgerStatsResponse().isPresent()) {
            System.out.println(res.getLedgerStatsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3GetLedgerStatsRequest](../../models/operations/V3GetLedgerStatsRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetLedgerStatsSecurity](../../models/operations/V3GetLedgerStatsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3GetLedgerStatsResponse](../../models/operations/V3GetLedgerStatsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLog

Returns the system log entry with the given bucket-wide sequence number.
Requires `ledger:ReadOps` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetLog" method="get" path="/api/ledger/v3/_/logs/{sequence}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetLogRequest;
import com.formance.formance_sdk.models.operations.V3GetLogResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetLogRequest req = V3GetLogRequest.builder()
                .sequence(593519L)
                .formanceBigintAsString("true")
                .build();

        V3GetLogResponse res = sdk.ledger().v3().getLog()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [V3GetLogRequest](../../models/operations/V3GetLogRequest.md)                                               | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `security`                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetLogSecurity](../../models/operations/V3GetLogSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |

### Response

**[V3GetLogResponse](../../models/operations/V3GetLogResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMetadataSchemaStatus

Returns the declared type of every metadata field on a ledger. Requires `ledger:read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetMetadataSchemaStatus" method="get" path="/api/ledger/v3/{ledgerName}/metadata-schema" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetMetadataSchemaStatusRequest;
import com.formance.formance_sdk.models.operations.V3GetMetadataSchemaStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetMetadataSchemaStatusRequest req = V3GetMetadataSchemaStatusRequest.builder()
                .ledgerName("<value>")
                .build();

        V3GetMetadataSchemaStatusResponse res = sdk.ledger().v3().getMetadataSchemaStatus()
                .request(req)
                .call();

        if (res.metadataSchemaStatusResponse().isPresent()) {
            System.out.println(res.metadataSchemaStatusResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [V3GetMetadataSchemaStatusRequest](../../models/operations/V3GetMetadataSchemaStatusRequest.md)                                               | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |
| `security`                                                                                                                                    | [com.formance.formance_sdk.models.operations.V3GetMetadataSchemaStatusSecurity](../../models/operations/V3GetMetadataSchemaStatusSecurity.md) | :heavy_check_mark:                                                                                                                            | The security requirements to use for the request.                                                                                             |

### Response

**[V3GetMetadataSchemaStatusResponse](../../models/operations/V3GetMetadataSchemaStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getNumscript

Retrieves a numscript by name from a ledger. Use the `version` query parameter to get a specific
semver version. If omitted or empty, the latest version is returned.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetNumscript" method="get" path="/api/ledger/v3/{ledgerName}/numscripts/{name}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetNumscriptRequest;
import com.formance.formance_sdk.models.operations.V3GetNumscriptResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetNumscriptRequest req = V3GetNumscriptRequest.builder()
                .ledgerName("<value>")
                .name("<value>")
                .build();

        V3GetNumscriptResponse res = sdk.ledger().v3().getNumscript()
                .request(req)
                .call();

        if (res.getNumscriptResponse().isPresent()) {
            System.out.println(res.getNumscriptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [V3GetNumscriptRequest](../../models/operations/V3GetNumscriptRequest.md)                                               | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [com.formance.formance_sdk.models.operations.V3GetNumscriptSecurity](../../models/operations/V3GetNumscriptSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |

### Response

**[V3GetNumscriptResponse](../../models/operations/V3GetNumscriptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getNumscriptUsage

Returns the invocation counter and last-used timestamp for a Numscript template. Values are
materialised asynchronously by the `usagebuilder` subsystem from the FSM audit chain and may
lag the live FSM while the worker drains pending batches. A never-invoked template returns a
zero-valued response (not 404), so clients handle "never used" uniformly.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetNumscriptUsage" method="get" path="/api/ledger/v3/{ledgerName}/numscripts/{name}/usage" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetNumscriptUsageRequest;
import com.formance.formance_sdk.models.operations.V3GetNumscriptUsageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetNumscriptUsageRequest req = V3GetNumscriptUsageRequest.builder()
                .ledgerName("<value>")
                .name("<value>")
                .build();

        V3GetNumscriptUsageResponse res = sdk.ledger().v3().getNumscriptUsage()
                .request(req)
                .call();

        if (res.getTemplateUsageResponse().isPresent()) {
            System.out.println(res.getTemplateUsageResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [V3GetNumscriptUsageRequest](../../models/operations/V3GetNumscriptUsageRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.V3GetNumscriptUsageSecurity](../../models/operations/V3GetNumscriptUsageSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[V3GetNumscriptUsageResponse](../../models/operations/V3GetNumscriptUsageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTransaction

Retrieves a transaction by its ID from the specified ledger. Requires `ledger:read` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3GetTransaction" method="get" path="/api/ledger/v3/{ledgerName}/transactions/{transactionId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3GetTransactionRequest;
import com.formance.formance_sdk.models.operations.V3GetTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3GetTransactionRequest req = V3GetTransactionRequest.builder()
                .ledgerName("<value>")
                .transactionId(431503L)
                .formanceBigintAsString("true")
                .build();

        V3GetTransactionResponse res = sdk.ledger().v3().getTransaction()
                .request(req)
                .call();

        if (res.getTransactionResponse().isPresent()) {
            System.out.println(res.getTransactionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3GetTransactionRequest](../../models/operations/V3GetTransactionRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3GetTransactionSecurity](../../models/operations/V3GetTransactionSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3GetTransactionResponse](../../models/operations/V3GetTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## health

Returns the health status of the node. Returns 503 if the node is not connected to the cluster.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3Health" method="get" path="/api/ledger/health" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3HealthResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3HealthResponse res = sdk.ledger().v3().health()
                .call();

        if (res.healthResponse().isPresent()) {
            System.out.println(res.healthResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [com.formance.formance_sdk.models.operations.V3HealthSecurity](../../models/operations/V3HealthSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |

### Response

**[V3HealthResponse](../../models/operations/V3HealthResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## info

Returns the server build metadata (version, commit, build date, Go runtime version). Unauthenticated.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3Info" method="get" path="/api/ledger/_info#ledgerV3" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3InfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3InfoResponse res = sdk.ledger().v3().info()
                .call();

        if (res.serverInfo().isPresent()) {
            System.out.println(res.serverInfo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `security`                                                                                              | [com.formance.formance_sdk.models.operations.V3InfoSecurity](../../models/operations/V3InfoSecurity.md) | :heavy_check_mark:                                                                                      | The security requirements to use for the request.                                                       |

### Response

**[V3InfoResponse](../../models/operations/V3InfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## inspectIndex

Scans a metadata index and returns distinct values, facets (value + count),
or a summary (cardinality, min/max, existence counts). The index must be
in READY state. Only metadata indexes are inspectable (builtin indexes
return 400). Requires `ledger:read` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3InspectIndex" method="get" path="/api/ledger/v3/{ledgerName}/indexes/{canonicalId}/inspect" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3InspectIndexRequest;
import com.formance.formance_sdk.models.operations.V3InspectIndexResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3InspectIndexRequest req = V3InspectIndexRequest.builder()
                .canonicalId("<id>")
                .ledgerName("<value>")
                .build();

        V3InspectIndexResponse res = sdk.ledger().v3().inspectIndex()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [V3InspectIndexRequest](../../models/operations/V3InspectIndexRequest.md)                                               | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [com.formance.formance_sdk.models.operations.V3InspectIndexSecurity](../../models/operations/V3InspectIndexSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |

### Response

**[V3InspectIndexResponse](../../models/operations/V3InspectIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccountTypes

Returns all account types defined on a ledger, sorted by name.
Requires `ledger:ReadAccount` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListAccountTypes" method="get" path="/api/ledger/v3/{ledgerName}/account-types" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListAccountTypesRequest;
import com.formance.formance_sdk.models.operations.V3ListAccountTypesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListAccountTypesRequest req = V3ListAccountTypesRequest.builder()
                .ledgerName("<value>")
                .build();

        V3ListAccountTypesResponse res = sdk.ledger().v3().listAccountTypes()
                .request(req)
                .call();

        if (res.listAccountTypesResponse().isPresent()) {
            System.out.println(res.listAccountTypesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [V3ListAccountTypesRequest](../../models/operations/V3ListAccountTypesRequest.md)                                               | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [com.formance.formance_sdk.models.operations.V3ListAccountTypesSecurity](../../models/operations/V3ListAccountTypesSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |

### Response

**[V3ListAccountTypesResponse](../../models/operations/V3ListAccountTypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAccounts

Lists accounts in a ledger in alphabetical order with cursor
pagination and an optional generic `filter` (e.g. address-prefix
selection via `filter=address ^= "users:"`). Requires `ledger:read`
scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListAccounts_ledgerV3" method="get" path="/api/ledger/v3/{ledgerName}/accounts" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListAccountsLedgerV3Request;
import com.formance.formance_sdk.models.operations.V3ListAccountsLedgerV3Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListAccountsLedgerV3Request req = V3ListAccountsLedgerV3Request.builder()
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3ListAccountsLedgerV3Response res = sdk.ledger().v3().listAccounts()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [V3ListAccountsLedgerV3Request](../../models/operations/V3ListAccountsLedgerV3Request.md)                                               | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |
| `security`                                                                                                                              | [com.formance.formance_sdk.models.operations.V3ListAccountsLedgerV3Security](../../models/operations/V3ListAccountsLedgerV3Security.md) | :heavy_check_mark:                                                                                                                      | The security requirements to use for the request.                                                                                       |

### Response

**[V3ListAccountsLedgerV3Response](../../models/operations/V3ListAccountsLedgerV3Response.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAllLedgers

Lists the ledgers in the cluster, paged by name (ascending unless
`reverse=true`). Requires `ledger:read` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListAllLedgers" method="get" path="/api/ledger/v3/" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListAllLedgersRequest;
import com.formance.formance_sdk.models.operations.V3ListAllLedgersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListAllLedgersRequest req = V3ListAllLedgersRequest.builder()
                .build();

        V3ListAllLedgersResponse res = sdk.ledger().v3().listAllLedgers()
                .request(req)
                .call();

        if (res.listAllLedgersResponse().isPresent()) {
            System.out.println(res.listAllLedgersResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3ListAllLedgersRequest](../../models/operations/V3ListAllLedgersRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3ListAllLedgersSecurity](../../models/operations/V3ListAllLedgersSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3ListAllLedgersResponse](../../models/operations/V3ListAllLedgersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listAuditEntries

Lists audit trail entries (one per proposal, success or failure) across
the whole bucket, paged by audit sequence (ascending unless
`reverse=true`). Audit reads are
not ledger-scoped in the path — a single proposal can touch several
ledgers — so ledger scope, outcome and other dimensions are expressed
through the `filter` query parameter.

This endpoint always performs a live read and does not expose pinned
checkpoint reads. Filters containing indexed audit conditions wait for
the audit projection to certify the request's fixed main-store horizon;
matching entries are loaded from that same main snapshot. Unfiltered
reads and sequence-only bounds scan the audit zone directly without
waiting for the audit projection.

Requires `ledger:ReadAudit` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListAuditEntries" method="get" path="/api/ledger/v3/_/audit-entries" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListAuditEntriesRequest;
import com.formance.formance_sdk.models.operations.V3ListAuditEntriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListAuditEntriesRequest req = V3ListAuditEntriesRequest.builder()
                .build();

        V3ListAuditEntriesResponse res = sdk.ledger().v3().listAuditEntries()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [V3ListAuditEntriesRequest](../../models/operations/V3ListAuditEntriesRequest.md)                                               | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [com.formance.formance_sdk.models.operations.V3ListAuditEntriesSecurity](../../models/operations/V3ListAuditEntriesSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |

### Response

**[V3ListAuditEntriesResponse](../../models/operations/V3ListAuditEntriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listBucketIndexes

Streams the bucket-scoped index registry. The `scope` query parameter
selects the flavor: `all` (default, matches the ListIndexesRequest
proto default) streams every entry across ledgers, skipping orphan
entries whose owning ledger no longer exists; `bucket` surfaces only
bucket-scoped entries (empty ledger, e.g. audit indexes). Use
`GET /v3/{ledgerName}/indexes` for the per-ledger view. Requires
`ledger:ReadOps` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListBucketIndexes" method="get" path="/api/ledger/v3/_/indexes" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListBucketIndexesRequest;
import com.formance.formance_sdk.models.operations.V3ListBucketIndexesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListBucketIndexesRequest req = V3ListBucketIndexesRequest.builder()
                .build();

        V3ListBucketIndexesResponse res = sdk.ledger().v3().listBucketIndexes()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [V3ListBucketIndexesRequest](../../models/operations/V3ListBucketIndexesRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.V3ListBucketIndexesSecurity](../../models/operations/V3ListBucketIndexesSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[V3ListBucketIndexesResponse](../../models/operations/V3ListBucketIndexesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLedgerIndexes

Streams the indexes registered on a specific ledger. Requires
`ledger:ReadLedger` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListLedgerIndexes" method="get" path="/api/ledger/v3/{ledgerName}/indexes" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListLedgerIndexesRequest;
import com.formance.formance_sdk.models.operations.V3ListLedgerIndexesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListLedgerIndexesRequest req = V3ListLedgerIndexesRequest.builder()
                .ledgerName("<value>")
                .build();

        V3ListLedgerIndexesResponse res = sdk.ledger().v3().listLedgerIndexes()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [V3ListLedgerIndexesRequest](../../models/operations/V3ListLedgerIndexesRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.V3ListLedgerIndexesSecurity](../../models/operations/V3ListLedgerIndexesSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[V3ListLedgerIndexesResponse](../../models/operations/V3ListLedgerIndexesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLedgerLogs

Lists log entries for a specific ledger, paged by ledger-local log ID
(ascending unless `reverse=true`).
Requires the builtin `LOG` index to be enabled on the ledger via `CreateIndex`.
Requires `ledger:read` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListLedgerLogs" method="get" path="/api/ledger/v3/{ledgerName}/logs" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListLedgerLogsRequest;
import com.formance.formance_sdk.models.operations.V3ListLedgerLogsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListLedgerLogsRequest req = V3ListLedgerLogsRequest.builder()
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3ListLedgerLogsResponse res = sdk.ledger().v3().listLedgerLogs()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3ListLedgerLogsRequest](../../models/operations/V3ListLedgerLogsRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3ListLedgerLogsSecurity](../../models/operations/V3ListLedgerLogsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3ListLedgerLogsResponse](../../models/operations/V3ListLedgerLogsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLedgerTransactions

Lists transactions for a specific ledger. The default order is
newest-first (descending transaction id); pass `reverse=true` to
get oldest-first (ascending). Supports cursor pagination (`pageSize`,
`cursor`), an optional date range (`startDate`/`endDate`),
and the generic `filter` parameter (e.g. reference selection via
`filter={"$match":{"reference":"..."}}`, URL-encoded). Requires
`ledger:ReadTransaction` scope.

This is a live read, linearizable by default. `X-Consistency: stale`
reads the receiving node's local state, which may lag the leader. Every
projection used by the filter is automatically aligned. Unlike the
gRPC API, it does not accept the `checkpointId` option to pin the read
to a specific historical snapshot — use gRPC for checkpoint-pinned
reads. (Tracked follow-up, same carve-out as the audit reads.)


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListLedgerTransactions" method="get" path="/api/ledger/v3/{ledgerName}/transactions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListLedgerTransactionsRequest;
import com.formance.formance_sdk.models.operations.V3ListLedgerTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListLedgerTransactionsRequest req = V3ListLedgerTransactionsRequest.builder()
                .ledgerName("<value>")
                .formanceBigintAsString("true")
                .build();

        V3ListLedgerTransactionsResponse res = sdk.ledger().v3().listLedgerTransactions()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [V3ListLedgerTransactionsRequest](../../models/operations/V3ListLedgerTransactionsRequest.md)                                               | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |
| `security`                                                                                                                                  | [com.formance.formance_sdk.models.operations.V3ListLedgerTransactionsSecurity](../../models/operations/V3ListLedgerTransactionsSecurity.md) | :heavy_check_mark:                                                                                                                          | The security requirements to use for the request.                                                                                           |

### Response

**[V3ListLedgerTransactionsResponse](../../models/operations/V3ListLedgerTransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listNumscriptVersions

Returns the numscript's history: its current latest (greatest stored
semver) and every stored version, highest-first.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListNumscriptVersions" method="get" path="/api/ledger/v3/{ledgerName}/numscripts/{name}/versions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListNumscriptVersionsRequest;
import com.formance.formance_sdk.models.operations.V3ListNumscriptVersionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListNumscriptVersionsRequest req = V3ListNumscriptVersionsRequest.builder()
                .ledgerName("<value>")
                .name("<value>")
                .build();

        V3ListNumscriptVersionsResponse res = sdk.ledger().v3().listNumscriptVersions()
                .request(req)
                .call();

        if (res.listNumscriptVersionsResponse().isPresent()) {
            System.out.println(res.listNumscriptVersionsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [V3ListNumscriptVersionsRequest](../../models/operations/V3ListNumscriptVersionsRequest.md)                                               | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |
| `security`                                                                                                                                | [com.formance.formance_sdk.models.operations.V3ListNumscriptVersionsSecurity](../../models/operations/V3ListNumscriptVersionsSecurity.md) | :heavy_check_mark:                                                                                                                        | The security requirements to use for the request.                                                                                         |

### Response

**[V3ListNumscriptVersionsResponse](../../models/operations/V3ListNumscriptVersionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listNumscripts

Lists every numscript of a ledger at its greatest stored version, paged
by name (ascending unless `reverse=true`).


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListNumscripts" method="get" path="/api/ledger/v3/{ledgerName}/numscripts" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListNumscriptsRequest;
import com.formance.formance_sdk.models.operations.V3ListNumscriptsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListNumscriptsRequest req = V3ListNumscriptsRequest.builder()
                .ledgerName("<value>")
                .build();

        V3ListNumscriptsResponse res = sdk.ledger().v3().listNumscripts()
                .request(req)
                .call();

        if (res.listNumscriptsResponse().isPresent()) {
            System.out.println(res.listNumscriptsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [V3ListNumscriptsRequest](../../models/operations/V3ListNumscriptsRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.V3ListNumscriptsSecurity](../../models/operations/V3ListNumscriptsSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[V3ListNumscriptsResponse](../../models/operations/V3ListNumscriptsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPreparedQueries

Returns a list of all prepared queries for a ledger. Requires `ledger:ReadQuery` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListPreparedQueries" method="get" path="/api/ledger/v3/{ledgerName}/prepared-queries" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListPreparedQueriesRequest;
import com.formance.formance_sdk.models.operations.V3ListPreparedQueriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListPreparedQueriesRequest req = V3ListPreparedQueriesRequest.builder()
                .ledgerName("<value>")
                .build();

        V3ListPreparedQueriesResponse res = sdk.ledger().v3().listPreparedQueries()
                .request(req)
                .call();

        if (res.listPreparedQueriesResponse().isPresent()) {
            System.out.println(res.listPreparedQueriesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3ListPreparedQueriesRequest](../../models/operations/V3ListPreparedQueriesRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3ListPreparedQueriesSecurity](../../models/operations/V3ListPreparedQueriesSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3ListPreparedQueriesResponse](../../models/operations/V3ListPreparedQueriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSigningKeys

Lists the Ed25519 signing keys registered on the cluster, paged by key
id (ascending unless `reverse=true`). Requires `ledger:ReadOps` scope.

This route performs a live read, linearizable by default.
`X-Consistency: stale` reads the receiving node's local state, which
may lag the leader. Signing-key reads are live-only on both transports.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3ListSigningKeys" method="get" path="/api/ledger/v3/_/signing-keys" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ListSigningKeysRequest;
import com.formance.formance_sdk.models.operations.V3ListSigningKeysResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ListSigningKeysRequest req = V3ListSigningKeysRequest.builder()
                .build();

        V3ListSigningKeysResponse res = sdk.ledger().v3().listSigningKeys()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [V3ListSigningKeysRequest](../../models/operations/V3ListSigningKeysRequest.md)                                               | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [com.formance.formance_sdk.models.operations.V3ListSigningKeysSecurity](../../models/operations/V3ListSigningKeysSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |

### Response

**[V3ListSigningKeysResponse](../../models/operations/V3ListSigningKeysResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## livez

Returns 200 as long as the process is alive. Suitable for Kubernetes liveness probes.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3Livez" method="get" path="/api/ledger/livez" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3LivezResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3LivezResponse res = sdk.ledger().v3().livez()
                .call();

        if (res.healthResponse().isPresent()) {
            System.out.println(res.healthResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                | [com.formance.formance_sdk.models.operations.V3LivezSecurity](../../models/operations/V3LivezSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |

### Response

**[V3LivezResponse](../../models/operations/V3LivezResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## promoteLedger

Promotes a mirror-mode ledger to normal mode. After promotion, the mirror sync
worker is stopped and the ledger accepts direct write operations. Requires `ledger:write` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3PromoteLedger" method="post" path="/api/ledger/v3/{ledgerName}/promote" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3PromoteLedgerRequest;
import com.formance.formance_sdk.models.operations.V3PromoteLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3PromoteLedgerRequest req = V3PromoteLedgerRequest.builder()
                .ledgerName("<value>")
                .build();

        V3PromoteLedgerResponse res = sdk.ledger().v3().promoteLedger()
                .request(req)
                .call();

        if (res.promoteLedgerResponse().isPresent()) {
            System.out.println(res.promoteLedgerResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [V3PromoteLedgerRequest](../../models/operations/V3PromoteLedgerRequest.md)                                               | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.formance.formance_sdk.models.operations.V3PromoteLedgerSecurity](../../models/operations/V3PromoteLedgerSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |

### Response

**[V3PromoteLedgerResponse](../../models/operations/V3PromoteLedgerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## readyz

Returns 200 once the local Raft loop has started, regardless of whether
a leader has been elected. Suitable for Kubernetes readiness probes and
StatefulSet `OrderedReady` ordering: it is intentionally permissive so
peer pods can be brought up during a cold start where quorum cannot
form until they exist. Use `/clusterz` for the stricter
cluster-availability signal.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3Readyz" method="get" path="/api/ledger/readyz" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3ReadyzResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3ReadyzResponse res = sdk.ledger().v3().readyz()
                .call();

        if (res.healthResponse().isPresent()) {
            System.out.println(res.healthResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [com.formance.formance_sdk.models.operations.V3ReadyzSecurity](../../models/operations/V3ReadyzSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |

### Response

**[V3ReadyzResponse](../../models/operations/V3ReadyzResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeAccountType

Removes an account type from a ledger's chart of accounts. Requires `ledger:WriteMetadata` scope.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3RemoveAccountType" method="delete" path="/api/ledger/v3/{ledgerName}/account-types/{typeName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3RemoveAccountTypeRequest;
import com.formance.formance_sdk.models.operations.V3RemoveAccountTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3RemoveAccountTypeRequest req = V3RemoveAccountTypeRequest.builder()
                .ledgerName("<value>")
                .typeName("<value>")
                .build();

        V3RemoveAccountTypeResponse res = sdk.ledger().v3().removeAccountType()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [V3RemoveAccountTypeRequest](../../models/operations/V3RemoveAccountTypeRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.V3RemoveAccountTypeSecurity](../../models/operations/V3RemoveAccountTypeSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[V3RemoveAccountTypeResponse](../../models/operations/V3RemoveAccountTypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeEventsSink

Removes a named event sink from the cluster. Requires `ledger:WriteOps`
scope. A non-empty controllerId must match the sink's controllerId;
a mismatch returns `SINK_CONTROLLER_MISMATCH` (409). An omitted or empty
controllerId removes the sink without an ownership precondition.
A missing sink returns `SINK_NOT_FOUND` (404). Malformed query encoding
or repeated controllerId parameters return `INVALID_REQUEST` (400)
before Apply, instead of becoming unconditional removal.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3RemoveEventsSink" method="delete" path="/api/ledger/v3/_/events-sinks/{sinkName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3RemoveEventsSinkRequest;
import com.formance.formance_sdk.models.operations.V3RemoveEventsSinkResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3RemoveEventsSinkRequest req = V3RemoveEventsSinkRequest.builder()
                .sinkName("<value>")
                .build();

        V3RemoveEventsSinkResponse res = sdk.ledger().v3().removeEventsSink()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [V3RemoveEventsSinkRequest](../../models/operations/V3RemoveEventsSinkRequest.md)                                               | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [com.formance.formance_sdk.models.operations.V3RemoveEventsSinkSecurity](../../models/operations/V3RemoveEventsSinkSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |

### Response

**[V3RemoveEventsSinkResponse](../../models/operations/V3RemoveEventsSinkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeMetadataFieldType

Removes the type declaration for a metadata key on a ledger.
Existing metadata values remain unchanged and any attached index is dropped. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).


### Example Usage

<!-- UsageSnippet language="java" operationID="v3RemoveMetadataFieldType" method="delete" path="/api/ledger/v3/{ledgerName}/metadata-schema/{targetType}/{key}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.TargetTypeParameter;
import com.formance.formance_sdk.models.operations.V3RemoveMetadataFieldTypeRequest;
import com.formance.formance_sdk.models.operations.V3RemoveMetadataFieldTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3RemoveMetadataFieldTypeRequest req = V3RemoveMetadataFieldTypeRequest.builder()
                .key("formance.com/reviewed")
                .ledgerName("<value>")
                .targetType(TargetTypeParameter.LEDGER)
                .build();

        V3RemoveMetadataFieldTypeResponse res = sdk.ledger().v3().removeMetadataFieldType()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [V3RemoveMetadataFieldTypeRequest](../../models/operations/V3RemoveMetadataFieldTypeRequest.md)                                               | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |
| `security`                                                                                                                                    | [com.formance.formance_sdk.models.operations.V3RemoveMetadataFieldTypeSecurity](../../models/operations/V3RemoveMetadataFieldTypeSecurity.md) | :heavy_check_mark:                                                                                                                            | The security requirements to use for the request.                                                                                             |

### Response

**[V3RemoveMetadataFieldTypeResponse](../../models/operations/V3RemoveMetadataFieldTypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## revertTransaction

Reverts a transaction by creating a reverse transaction that undoes its effects. Requires `ledger:write` scope.
The body is optional; an absent or empty body uses default options. Supplied
options and metadata are decoded for both known-length and HTTP/1.1 chunked
requests. Malformed or truncated JSON, extra values, trailing non-whitespace
and options of the wrong JSON type (for example `"atEffectiveDate": "true"`
or a non-object `metadata`) return 400 before applying the revert. A JSON
`null` option uses its default. The complete body, including trailing
whitespace, counts towards the 4 MiB limit; exceeding it returns 413.
Signed requests use `application/json` (including MIME parameters) with
`request` and standard-base64 `payload`. Either signing header, even if
empty, selects this wrapper; with neither header present, the ordinary REST body applies.
Runtime headers choose the representation from the documented anyOf.
The signed protobuf batch must
equal the route/body/Idempotency-Key-derived batch in full. Supply exactly
one nonempty Formance-Signing-Key-Id and Formance-Signature header; the
latter is a standard-base64 Ed25519 signature of 64 decoded bytes. Missing,
empty or repeated signing headers, invalid base64 and wrong signature
length return 400. Signing headers with a non-JSON or missing content type return 415.
Signature enforcement
returns 401 `UNAUTHENTICATED` when required but absent and 403
`PERMISSION_DENIED` for invalid, unknown/revoked-key or mismatched
signatures. Malformed signed envelopes return 400. The complete
wrapper counts toward the 4 MiB body limit. JWT scopes still apply.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3RevertTransaction" method="post" path="/api/ledger/v3/{ledgerName}/transactions/{transactionId}/revert" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V3RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.V3RevertTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3RevertTransactionRequest req = V3RevertTransactionRequest.builder()
                .ledgerName("<value>")
                .transactionId(541831L)
                .formanceBigintAsString("true")
                .build();

        V3RevertTransactionResponse res = sdk.ledger().v3().revertTransaction()
                .request(req)
                .call();

        if (res.revertedTransactionResponse().isPresent()) {
            System.out.println(res.revertedTransactionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [V3RevertTransactionRequest](../../models/operations/V3RevertTransactionRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.V3RevertTransactionSecurity](../../models/operations/V3RevertTransactionSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[V3RevertTransactionResponse](../../models/operations/V3RevertTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## saveAccountMetadata

Saves metadata for a specific account in the ledger. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).

### Example Usage

<!-- UsageSnippet language="java" operationID="v3SaveAccountMetadata" method="post" path="/api/ledger/v3/{ledgerName}/accounts/{address}/metadata" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.MetadataValue;
import com.formance.formance_sdk.models.operations.V3SaveAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.V3SaveAccountMetadataResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3SaveAccountMetadataRequest req = V3SaveAccountMetadataRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("account_type", MetadataValue.of("asset")),
                    Map.entry("label", MetadataValue.of("Bank Account")),
                    Map.entry("active", MetadataValue.of(true)),
                    Map.entry("balance_threshold", MetadataValue.of(1000L))))
                .address("users:001")
                .ledgerName("<value>")
                .build();

        V3SaveAccountMetadataResponse res = sdk.ledger().v3().saveAccountMetadata()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3SaveAccountMetadataRequest](../../models/operations/V3SaveAccountMetadataRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3SaveAccountMetadataSecurity](../../models/operations/V3SaveAccountMetadataSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3SaveAccountMetadataResponse](../../models/operations/V3SaveAccountMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## saveLedgerMetadata

Saves metadata key-value pairs on the ledger itself. Requires `ledger:WriteMetadata`; `ledger:write` grants it under the default scope mapping. Custom scope mappings can differ.

### Example Usage

<!-- UsageSnippet language="java" operationID="v3SaveLedgerMetadata" method="post" path="/api/ledger/v3/{ledgerName}/metadata" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.MetadataValue;
import com.formance.formance_sdk.models.operations.V3SaveLedgerMetadataRequest;
import com.formance.formance_sdk.models.operations.V3SaveLedgerMetadataResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3SaveLedgerMetadataRequest req = V3SaveLedgerMetadataRequest.builder()
                .requestBody(Map.ofEntries(
                    Map.entry("environment", MetadataValue.of("production")),
                    Map.entry("team", MetadataValue.of("payments")),
                    Map.entry("region", MetadataValue.of("eu-west-1"))))
                .ledgerName("<value>")
                .build();

        V3SaveLedgerMetadataResponse res = sdk.ledger().v3().saveLedgerMetadata()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [V3SaveLedgerMetadataRequest](../../models/operations/V3SaveLedgerMetadataRequest.md)                                               | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [com.formance.formance_sdk.models.operations.V3SaveLedgerMetadataSecurity](../../models/operations/V3SaveLedgerMetadataSecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |

### Response

**[V3SaveLedgerMetadataResponse](../../models/operations/V3SaveLedgerMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## saveNumscript

Appends an immutable version to a ledger's numscript library. The `version`
field must be an explicit full semver (e.g. "1.0.0"); it creates a new
version and fails if that version already exists. The per-name latest is
always the greatest stored semver.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3SaveNumscript" method="put" path="/api/ledger/v3/{ledgerName}/numscripts/{name}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.SaveNumscriptRequest;
import com.formance.formance_sdk.models.operations.V3SaveNumscriptRequest;
import com.formance.formance_sdk.models.operations.V3SaveNumscriptResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3SaveNumscriptRequest req = V3SaveNumscriptRequest.builder()
                .saveNumscriptRequest(SaveNumscriptRequest.builder()
                    .content("<value>")
                    .version("1.0.0")
                    .build())
                .ledgerName("<value>")
                .name("<value>")
                .build();

        V3SaveNumscriptResponse res = sdk.ledger().v3().saveNumscript()
                .request(req)
                .call();

        if (res.getNumscriptResponse().isPresent()) {
            System.out.println(res.getNumscriptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [V3SaveNumscriptRequest](../../models/operations/V3SaveNumscriptRequest.md)                                               | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.formance.formance_sdk.models.operations.V3SaveNumscriptSecurity](../../models/operations/V3SaveNumscriptSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |

### Response

**[V3SaveNumscriptResponse](../../models/operations/V3SaveNumscriptResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## saveTransactionMetadata

Saves metadata for a specific transaction in the ledger. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).
Signed requests use `application/json` (including MIME parameters) with
`request` and standard-base64 `payload`. Either signing header, even if
empty, selects this wrapper; with neither header present, the ordinary REST body applies.
Runtime headers choose the representation from the documented anyOf.
The signed protobuf batch must
equal the route/body/Idempotency-Key-derived batch in full. Supply exactly
one nonempty Formance-Signing-Key-Id and Formance-Signature header; the
latter is a standard-base64 Ed25519 signature of 64 decoded bytes. Missing,
empty or repeated signing headers, invalid base64 and wrong signature
length return 400. Signing headers with a non-JSON or missing content type return 415.
Signature enforcement
returns 401 `UNAUTHENTICATED` when required but absent and 403
`PERMISSION_DENIED` for invalid, unknown/revoked-key or mismatched
signatures. Malformed signed envelopes return 400. The complete
wrapper counts toward the 4 MiB body limit. JWT scopes still apply.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3SaveTransactionMetadata" method="post" path="/api/ledger/v3/{ledgerName}/transactions/{transactionId}/metadata" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.MetadataValue;
import com.formance.formance_sdk.models.operations.*;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3SaveTransactionMetadataRequest req = V3SaveTransactionMetadataRequest.builder()
                .requestBody(V3SaveTransactionMetadataRequestBody.of(Map.ofEntries(
                    Map.entry("reason", MetadataValue.of("correction")),
                    Map.entry("source", MetadataValue.of("support")),
                    Map.entry("priority", MetadataValue.of(1L)))))
                .ledgerName("<value>")
                .transactionId(736514L)
                .build();

        V3SaveTransactionMetadataResponse res = sdk.ledger().v3().saveTransactionMetadata()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [V3SaveTransactionMetadataRequest](../../models/operations/V3SaveTransactionMetadataRequest.md)                                               | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |
| `security`                                                                                                                                    | [com.formance.formance_sdk.models.operations.V3SaveTransactionMetadataSecurity](../../models/operations/V3SaveTransactionMetadataSecurity.md) | :heavy_check_mark:                                                                                                                            | The security requirements to use for the request.                                                                                             |

### Response

**[V3SaveTransactionMetadataResponse](../../models/operations/V3SaveTransactionMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setDefaultEnforcementMode

Sets the default enforcement mode for accounts that do not match any defined
account type. Must be STRICT or AUDIT. STRICT rejects an order that uses an
unmatched account with `400 ACCOUNT_NOT_MATCHING_TYPE`. AUDIT accepts the
order and does not report the unmatched account: the response carries no
warning. Requires `ledger:WriteMetadata` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3SetDefaultEnforcementMode" method="put" path="/api/ledger/v3/{ledgerName}/account-types/default-enforcement-mode" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.EnforcementMode;
import com.formance.formance_sdk.models.ledgerv3.SetDefaultEnforcementModeRequest;
import com.formance.formance_sdk.models.operations.V3SetDefaultEnforcementModeRequest;
import com.formance.formance_sdk.models.operations.V3SetDefaultEnforcementModeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3SetDefaultEnforcementModeRequest req = V3SetDefaultEnforcementModeRequest.builder()
                .setDefaultEnforcementModeRequest(SetDefaultEnforcementModeRequest.builder()
                    .enforcementMode(EnforcementMode.AUDIT)
                    .build())
                .ledgerName("<value>")
                .build();

        V3SetDefaultEnforcementModeResponse res = sdk.ledger().v3().setDefaultEnforcementMode()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                         | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                         | [V3SetDefaultEnforcementModeRequest](../../models/operations/V3SetDefaultEnforcementModeRequest.md)                                               | :heavy_check_mark:                                                                                                                                | The request object to use for the request.                                                                                                        |
| `security`                                                                                                                                        | [com.formance.formance_sdk.models.operations.V3SetDefaultEnforcementModeSecurity](../../models/operations/V3SetDefaultEnforcementModeSecurity.md) | :heavy_check_mark:                                                                                                                                | The security requirements to use for the request.                                                                                                 |

### Response

**[V3SetDefaultEnforcementModeResponse](../../models/operations/V3SetDefaultEnforcementModeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setMetadataFieldType

Declares or changes the type used to encode a metadata key in an attached query index.
Metadata values are neither validated nor converted by this declaration, and existing primary values remain unchanged.
Any attached index is rewritten asynchronously. Requires `ledger:WriteMetadata` scope (included in the default `ledger:write` mapping).


### Example Usage

<!-- UsageSnippet language="java" operationID="v3SetMetadataFieldType" method="put" path="/api/ledger/v3/{ledgerName}/metadata-schema/{targetType}/{key}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.*;
import com.formance.formance_sdk.models.operations.V3SetMetadataFieldTypeRequest;
import com.formance.formance_sdk.models.operations.V3SetMetadataFieldTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3SetMetadataFieldTypeRequest req = V3SetMetadataFieldTypeRequest.builder()
                .setMetadataTypeRequest(SetMetadataTypeRequest.builder()
                    .type(SetMetadataTypeRequestType.BOOL)
                    .build())
                .key("formance.com/reviewed")
                .ledgerName("<value>")
                .targetType(TargetTypeParameter.LEDGER)
                .build();

        V3SetMetadataFieldTypeResponse res = sdk.ledger().v3().setMetadataFieldType()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [V3SetMetadataFieldTypeRequest](../../models/operations/V3SetMetadataFieldTypeRequest.md)                                               | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |
| `security`                                                                                                                              | [com.formance.formance_sdk.models.operations.V3SetMetadataFieldTypeSecurity](../../models/operations/V3SetMetadataFieldTypeSecurity.md) | :heavy_check_mark:                                                                                                                      | The security requirements to use for the request.                                                                                       |

### Response

**[V3SetMetadataFieldTypeResponse](../../models/operations/V3SetMetadataFieldTypeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePreparedQuery

Updates the filter of an existing prepared query. Requires `ledger:WriteQuery` scope.


### Example Usage

<!-- UsageSnippet language="java" operationID="v3UpdatePreparedQuery" method="put" path="/api/ledger/v3/{ledgerName}/prepared-queries/{queryName}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.ledgerv3.UpdatePreparedQueryRequest;
import com.formance.formance_sdk.models.operations.V3UpdatePreparedQueryRequest;
import com.formance.formance_sdk.models.operations.V3UpdatePreparedQueryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        V3UpdatePreparedQueryRequest req = V3UpdatePreparedQueryRequest.builder()
                .updatePreparedQueryRequest(UpdatePreparedQueryRequest.builder()
                    .build())
                .ledgerName("<value>")
                .queryName("<value>")
                .build();

        V3UpdatePreparedQueryResponse res = sdk.ledger().v3().updatePreparedQuery()
                .request(req)
                .call();

        if (res.errorResponse().isPresent()) {
            System.out.println(res.errorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [V3UpdatePreparedQueryRequest](../../models/operations/V3UpdatePreparedQueryRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.V3UpdatePreparedQuerySecurity](../../models/operations/V3UpdatePreparedQuerySecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[V3UpdatePreparedQueryResponse](../../models/operations/V3UpdatePreparedQueryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |