# Ledger
(*ledger*)

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
* [v2DeleteTransactionMetadata](#v2deletetransactionmetadata) - Delete metadata by key
* [v2GetAccount](#v2getaccount) - Get account by its address
* [v2GetBalancesAggregated](#v2getbalancesaggregated) - Get the aggregated balances from selected accounts
* [v2GetInfo](#v2getinfo) - Show server information
* [v2GetLedger](#v2getledger) - Get a ledger
* [v2GetLedgerInfo](#v2getledgerinfo) - Get information about a ledger
* [v2GetTransaction](#v2gettransaction) - Get transaction from a ledger by its ID
* [v2ListAccounts](#v2listaccounts) - List accounts from a ledger
* [v2ListLedgers](#v2listledgers) - List ledgers
* [v2ListLogs](#v2listlogs) - List the logs from a ledger
* [v2ListTransactions](#v2listtransactions) - List transactions from a ledger
* [v2ReadStats](#v2readstats) - Get statistics from a ledger
* [v2RevertTransaction](#v2reverttransaction) - Revert a ledger transaction by its ID

## createTransactions

Create a new batch of transactions to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateTransactionsRequest;
import com.formance.formance_sdk.models.operations.CreateTransactionsResponse;
import com.formance.formance_sdk.models.shared.Posting;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransactionData;
import com.formance.formance_sdk.models.shared.Transactions;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.CreateTransactionsRequest req = new CreateTransactionsRequest(
                new Transactions(
                    new com.formance.formance_sdk.models.shared.TransactionData[]{{
                        add(new TransactionData(
                        new com.formance.formance_sdk.models.shared.Posting[]{{
                            add(new Posting(
                            100L,
                            "COIN",
                            "users:002",
                            "users:001"){{
                                amount = 100L;
                                asset = "COIN";
                                destination = "users:002";
                                source = "users:001";
                            }}),
                        }}){{
                            postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                                add(new Posting(
                                100L,
                                "COIN",
                                "users:002",
                                "users:001"){{
                                    amount = 100L;
                                    asset = "COIN";
                                    destination = "users:002";
                                    source = "users:001";
                                }}),
                            }};
                            reference = "ref:001";
                        }}),
                    }}),
                "ledger001");

            com.formance.formance_sdk.models.operations.CreateTransactionsResponse res = sdk.ledger.createTransactions(req);

            if (res.transactionsResponse != null) {
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
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.CreateTransactionsRequest](../../models/operations/CreateTransactionsRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.CreateTransactionsResponse](../../models/operations/CreateTransactionsResponse.md)**


## addMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.AddMetadataOnTransactionRequest;
import com.formance.formance_sdk.models.operations.AddMetadataOnTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.AddMetadataOnTransactionRequest req = new AddMetadataOnTransactionRequest(
                "ledger001",
                1234L){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};

            }};

            com.formance.formance_sdk.models.operations.AddMetadataOnTransactionResponse res = sdk.ledger.addMetadataOnTransaction(req);

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
| `request`                                                                                                                                 | [com.formance.formance_sdk.models.operations.AddMetadataOnTransactionRequest](../../models/operations/AddMetadataOnTransactionRequest.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.AddMetadataOnTransactionResponse](../../models/operations/AddMetadataOnTransactionResponse.md)**


## addMetadataToAccount

Add metadata to an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.AddMetadataToAccountRequest;
import com.formance.formance_sdk.models.operations.AddMetadataToAccountResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.AddMetadataToAccountRequest req = new AddMetadataToAccountRequest(
                new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }},
                "users:001",
                "ledger001");

            com.formance.formance_sdk.models.operations.AddMetadataToAccountResponse res = sdk.ledger.addMetadataToAccount(req);

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
| `request`                                                                                                                         | [com.formance.formance_sdk.models.operations.AddMetadataToAccountRequest](../../models/operations/AddMetadataToAccountRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.AddMetadataToAccountResponse](../../models/operations/AddMetadataToAccountResponse.md)**


## countAccounts

Count the accounts from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CountAccountsRequest;
import com.formance.formance_sdk.models.operations.CountAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.CountAccountsRequest req = new CountAccountsRequest(
                "ledger001"){{
                address = "users:.+";
                metadata = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};

            }};

            com.formance.formance_sdk.models.operations.CountAccountsResponse res = sdk.ledger.countAccounts(req);

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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.CountAccountsRequest](../../models/operations/CountAccountsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.CountAccountsResponse](../../models/operations/CountAccountsResponse.md)**


## countTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.CountTransactionsResponse;
import com.formance.formance_sdk.models.operations.Metadata;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.CountTransactionsRequest req = new CountTransactionsRequest(
                "ledger001"){{
                account = "users:001";
                destination = "users:001";
                endTime = OffsetDateTime.parse("2022-07-20T14:23:01.272Z");
                metadata = new Metadata(
);
                reference = "ref:001";
                source = "users:001";
                startTime = OffsetDateTime.parse("2024-09-26T22:46:35.189Z");

            }};

            com.formance.formance_sdk.models.operations.CountTransactionsResponse res = sdk.ledger.countTransactions(req);

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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [com.formance.formance_sdk.models.operations.CountTransactionsRequest](../../models/operations/CountTransactionsRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.CountTransactionsResponse](../../models/operations/CountTransactionsResponse.md)**


## createTransaction

Create a new transaction to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateTransactionRequest;
import com.formance.formance_sdk.models.operations.CreateTransactionResponse;
import com.formance.formance_sdk.models.shared.PostTransaction;
import com.formance.formance_sdk.models.shared.PostTransactionScript;
import com.formance.formance_sdk.models.shared.Posting;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.CreateTransactionRequest req = new CreateTransactionRequest(
                new PostTransaction(
){{
                    metadata = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                        add(new Posting(
                        100L,
                        "COIN",
                        "users:002",
                        "users:001"){{
                            amount = 100L;
                            asset = "COIN";
                            destination = "users:002";
                            source = "users:001";
                        }}),
                    }};
                    reference = "ref:001";
                    script = new PostTransactionScript(
                        "vars {
account $user
}
send [COIN 10] (
	source = @world
	destination = $user
)
"){{
                        vars = new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("user", "users:042");
                        }};

                    }};
                    timestamp = OffsetDateTime.parse("2024-11-28T10:23:22.557Z");

                }},
                "ledger001"){{
                preview = true;

            }};

            com.formance.formance_sdk.models.operations.CreateTransactionResponse res = sdk.ledger.createTransaction(req);

            if (res.transactionsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [com.formance.formance_sdk.models.operations.CreateTransactionRequest](../../models/operations/CreateTransactionRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.CreateTransactionResponse](../../models/operations/CreateTransactionResponse.md)**


## getAccount

Get account by its address

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetAccountRequest;
import com.formance.formance_sdk.models.operations.GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetAccountRequest req = new GetAccountRequest(
                "users:001",
                "ledger001");

            com.formance.formance_sdk.models.operations.GetAccountResponse res = sdk.ledger.getAccount(req);

            if (res.accountResponse != null) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.GetAccountRequest](../../models/operations/GetAccountRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetAccountResponse](../../models/operations/GetAccountResponse.md)**


## getBalances

Get the balances from a ledger's account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetBalancesRequest;
import com.formance.formance_sdk.models.operations.GetBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetBalancesRequest req = new GetBalancesRequest(
                "ledger001"){{
                address = "users:001";
                after = "users:003";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 755286L;

            }};

            com.formance.formance_sdk.models.operations.GetBalancesResponse res = sdk.ledger.getBalances(req);

            if (res.balancesCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.GetBalancesRequest](../../models/operations/GetBalancesRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.GetBalancesResponse](../../models/operations/GetBalancesResponse.md)**


## getBalancesAggregated

Get the aggregated balances from selected accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetBalancesAggregatedRequest;
import com.formance.formance_sdk.models.operations.GetBalancesAggregatedResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetBalancesAggregatedRequest req = new GetBalancesAggregatedRequest(
                "ledger001"){{
                address = "users:001";
                useInsertionDate = false;

            }};

            com.formance.formance_sdk.models.operations.GetBalancesAggregatedResponse res = sdk.ledger.getBalancesAggregated(req);

            if (res.aggregateBalancesResponse != null) {
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
| `request`                                                                                                                           | [com.formance.formance_sdk.models.operations.GetBalancesAggregatedRequest](../../models/operations/GetBalancesAggregatedRequest.md) | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.GetBalancesAggregatedResponse](../../models/operations/GetBalancesAggregatedResponse.md)**


## getInfo

Show server information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetInfoResponse res = sdk.ledger.getInfo();

            if (res.configInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.GetInfoResponse](../../models/operations/GetInfoResponse.md)**


## getLedgerInfo

Get information about a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetLedgerInfoRequest;
import com.formance.formance_sdk.models.operations.GetLedgerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetLedgerInfoRequest req = new GetLedgerInfoRequest(
                "ledger001");

            com.formance.formance_sdk.models.operations.GetLedgerInfoResponse res = sdk.ledger.getLedgerInfo(req);

            if (res.ledgerInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.GetLedgerInfoRequest](../../models/operations/GetLedgerInfoRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.GetLedgerInfoResponse](../../models/operations/GetLedgerInfoResponse.md)**


## getMapping

Get the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetMappingRequest;
import com.formance.formance_sdk.models.operations.GetMappingResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetMappingRequest req = new GetMappingRequest(
                "ledger001");

            com.formance.formance_sdk.models.operations.GetMappingResponse res = sdk.ledger.getMapping(req);

            if (res.mappingResponse != null) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.GetMappingRequest](../../models/operations/GetMappingRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetMappingResponse](../../models/operations/GetMappingResponse.md)**


## getTransaction

Get transaction from a ledger by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetTransactionRequest;
import com.formance.formance_sdk.models.operations.GetTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetTransactionRequest req = new GetTransactionRequest(
                "ledger001",
                1234L);

            com.formance.formance_sdk.models.operations.GetTransactionResponse res = sdk.ledger.getTransaction(req);

            if (res.transactionResponse != null) {
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
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.GetTransactionRequest](../../models/operations/GetTransactionRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**


## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListAccountsRequest;
import com.formance.formance_sdk.models.operations.ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListAccountsRequest req = new ListAccountsRequest(
                "ledger001"){{
                address = "users:.+";
                after = "users:003";
                balance = 2400L;
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                metadata = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                pageSize = 875058L;
                paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";

            }};

            com.formance.formance_sdk.models.operations.ListAccountsResponse res = sdk.ledger.listAccounts(req);

            if (res.accountsCursorResponse != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.ListAccountsRequest](../../models/operations/ListAccountsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListAccountsResponse](../../models/operations/ListAccountsResponse.md)**


## listLogs

List the logs from a ledger, sorted by ID in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListLogsRequest;
import com.formance.formance_sdk.models.operations.ListLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListLogsRequest req = new ListLogsRequest(
                "ledger001"){{
                after = "1234";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                endTime = OffsetDateTime.parse("2023-09-04T18:34:28.222Z");
                pageSize = 657242L;
                startTime = OffsetDateTime.parse("2022-11-03T09:19:08.045Z");

            }};

            com.formance.formance_sdk.models.operations.ListLogsResponse res = sdk.ledger.listLogs(req);

            if (res.logsCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [com.formance.formance_sdk.models.operations.ListLogsRequest](../../models/operations/ListLogsRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.formance.formance_sdk.models.operations.ListLogsResponse](../../models/operations/ListLogsResponse.md)**


## listTransactions

List transactions from a ledger, sorted by txid in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListTransactionsRequest;
import com.formance.formance_sdk.models.operations.ListTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListTransactionsRequest req = new ListTransactionsRequest(
                "ledger001"){{
                account = "users:001";
                after = "1234";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                destination = "users:001";
                endTime = OffsetDateTime.parse("2023-09-09T05:38:58.239Z");
                metadata = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                pageSize = 1306L;
                reference = "ref:001";
                source = "users:001";
                startTime = OffsetDateTime.parse("2023-12-04T18:07:06.082Z");

            }};

            com.formance.formance_sdk.models.operations.ListTransactionsResponse res = sdk.ledger.listTransactions(req);

            if (res.transactionsCursorResponse != null) {
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
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.ListTransactionsResponse](../../models/operations/ListTransactionsResponse.md)**


## readStats

Get statistics from a ledger. (aggregate metrics on accounts and transactions)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadStatsRequest;
import com.formance.formance_sdk.models.operations.ReadStatsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ReadStatsRequest req = new ReadStatsRequest(
                "ledger001");

            com.formance.formance_sdk.models.operations.ReadStatsResponse res = sdk.ledger.readStats(req);

            if (res.statsResponse != null) {
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
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.ReadStatsRequest](../../models/operations/ReadStatsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.ReadStatsResponse](../../models/operations/ReadStatsResponse.md)**


## revertTransaction

Revert a ledger transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.RevertTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.RevertTransactionRequest req = new RevertTransactionRequest(
                "ledger001",
                1234L){{
                disableChecks = false;

            }};

            com.formance.formance_sdk.models.operations.RevertTransactionResponse res = sdk.ledger.revertTransaction(req);

            if (res.transactionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [com.formance.formance_sdk.models.operations.RevertTransactionRequest](../../models/operations/RevertTransactionRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.RevertTransactionResponse](../../models/operations/RevertTransactionResponse.md)**


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

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.RunScriptRequest req = new RunScriptRequest(
                new Script(
                    "vars {
account $user
}
send [COIN 10] (
	source = @world
	destination = $user
)
"){{
                    metadata = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("key", "<value>");
                    }};
                    reference = "order_1234";
                    vars = new java.util.HashMap<String, java.lang.Object>(
                    ){{
                        put("user", "users:042");
                    }};

                }},
                "ledger001"){{
                preview = true;

            }};

            com.formance.formance_sdk.models.operations.RunScriptResponse res = sdk.ledger.runScript(req);

            if (res.scriptResponse != null) {
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
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.RunScriptRequest](../../models/operations/RunScriptRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.RunScriptResponse](../../models/operations/RunScriptResponse.md)**


## updateMapping

Update the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateMappingRequest;
import com.formance.formance_sdk.models.operations.UpdateMappingResponse;
import com.formance.formance_sdk.models.shared.Contract;
import com.formance.formance_sdk.models.shared.Expr;
import com.formance.formance_sdk.models.shared.Mapping;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.UpdateMappingRequest req = new UpdateMappingRequest(
                new Mapping(
                    new com.formance.formance_sdk.models.shared.Contract[]{{
                        add(new Contract(
                        new Expr(
                        )){{
                            account = "users:001";
                            expr = new Expr(
                            ){{}};
                        }}),
                    }}),
                "ledger001");

            com.formance.formance_sdk.models.operations.UpdateMappingResponse res = sdk.ledger.updateMapping(req);

            if (res.mappingResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.UpdateMappingRequest](../../models/operations/UpdateMappingRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.UpdateMappingResponse](../../models/operations/UpdateMappingResponse.md)**


## v2AddMetadataOnTransaction

Set the metadata of a transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionRequest;
import com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionRequest req = new V2AddMetadataOnTransactionRequest(
                1234L,
                "ledger001"){{
                idempotencyKey = "<value>";
                requestBody = new java.util.HashMap<String, String>(
                ){{
                    put("admin", "true");
                }};
                dryRun = true;

            }};

            com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionResponse res = sdk.ledger.v2AddMetadataOnTransaction(req);

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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionRequest](../../models/operations/V2AddMetadataOnTransactionRequest.md) | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.V2AddMetadataOnTransactionResponse](../../models/operations/V2AddMetadataOnTransactionResponse.md)**


## v2AddMetadataToAccount

Add metadata to an account

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2AddMetadataToAccountRequest;
import com.formance.formance_sdk.models.operations.V2AddMetadataToAccountResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2AddMetadataToAccountRequest req = new V2AddMetadataToAccountRequest(
                new java.util.HashMap<String, String>(
                ){{
                    put("admin", "true");
                }},
                "users:001",
                "ledger001"){{
                idempotencyKey = "<value>";
                dryRun = true;

            }};

            com.formance.formance_sdk.models.operations.V2AddMetadataToAccountResponse res = sdk.ledger.v2AddMetadataToAccount(req);

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

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [com.formance.formance_sdk.models.operations.V2AddMetadataToAccountRequest](../../models/operations/V2AddMetadataToAccountRequest.md) | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.V2AddMetadataToAccountResponse](../../models/operations/V2AddMetadataToAccountResponse.md)**


## v2CountAccounts

Count the accounts from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CountAccountsRequest;
import com.formance.formance_sdk.models.operations.V2CountAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2CountAccountsRequest req = new V2CountAccountsRequest(
                "ledger001"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                pit = OffsetDateTime.parse("2023-11-24T08:09:15.014Z");

            }};

            com.formance.formance_sdk.models.operations.V2CountAccountsResponse res = sdk.ledger.v2CountAccounts(req);

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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [com.formance.formance_sdk.models.operations.V2CountAccountsRequest](../../models/operations/V2CountAccountsRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.V2CountAccountsResponse](../../models/operations/V2CountAccountsResponse.md)**


## v2CountTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.V2CountTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2CountTransactionsRequest req = new V2CountTransactionsRequest(
                "ledger001"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                pit = OffsetDateTime.parse("2022-01-19T17:22:57.577Z");

            }};

            com.formance.formance_sdk.models.operations.V2CountTransactionsResponse res = sdk.ledger.v2CountTransactions(req);

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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.V2CountTransactionsRequest](../../models/operations/V2CountTransactionsRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2CountTransactionsResponse](../../models/operations/V2CountTransactionsResponse.md)**


## v2CreateBulk

Bulk request

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CreateBulkRequest;
import com.formance.formance_sdk.models.operations.V2CreateBulkResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2CreateBulkRequest req = new V2CreateBulkRequest(
                "ledger001"){{
                requestBody = new java.lang.Object[]{{
                    add("<value>"),
                }};

            }};

            com.formance.formance_sdk.models.operations.V2CreateBulkResponse res = sdk.ledger.v2CreateBulk(req);

            if (res.v2BulkResponse != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.V2CreateBulkRequest](../../models/operations/V2CreateBulkRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.V2CreateBulkResponse](../../models/operations/V2CreateBulkResponse.md)**


## v2CreateLedger

Create a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CreateLedgerRequest;
import com.formance.formance_sdk.models.operations.V2CreateLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2CreateLedgerRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2CreateLedgerRequest req = new V2CreateLedgerRequest(
                "ledger001"){{
                v2CreateLedgerRequest = new V2CreateLedgerRequest(
){{
                    bucket = "<value>";

                }};

            }};

            com.formance.formance_sdk.models.operations.V2CreateLedgerResponse res = sdk.ledger.v2CreateLedger(req);

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
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.V2CreateLedgerRequest](../../models/operations/V2CreateLedgerRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.V2CreateLedgerResponse](../../models/operations/V2CreateLedgerResponse.md)**


## v2CreateTransaction

Create a new transaction to a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CreateTransactionRequest;
import com.formance.formance_sdk.models.operations.V2CreateTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2PostTransaction;
import com.formance.formance_sdk.models.shared.V2PostTransactionScript;
import com.formance.formance_sdk.models.shared.V2Posting;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2CreateTransactionRequest req = new V2CreateTransactionRequest(
                new V2PostTransaction(
                    new java.util.HashMap<String, String>(
                    ){{
                        put("admin", "true");
                    }}){{
                    postings = new com.formance.formance_sdk.models.shared.V2Posting[]{{
                        add(new V2Posting(
                        100L,
                        "COIN",
                        "users:002",
                        "users:001"){{
                            amount = 100L;
                            asset = "COIN";
                            destination = "users:002";
                            source = "users:001";
                        }}),
                    }};
                    reference = "ref:001";
                    script = new V2PostTransactionScript(
                        "vars {
account $user
}
send [COIN 10] (
	source = @world
	destination = $user
)
"){{
                        vars = new java.util.HashMap<String, java.lang.Object>(
                        ){{
                            put("user", "users:042");
                        }};

                    }};
                    timestamp = OffsetDateTime.parse("2024-06-13T20:20:19.652Z");

                }},
                "ledger001"){{
                idempotencyKey = "<value>";
                dryRun = true;

            }};

            com.formance.formance_sdk.models.operations.V2CreateTransactionResponse res = sdk.ledger.v2CreateTransaction(req);

            if (res.v2CreateTransactionResponse != null) {
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
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.V2CreateTransactionRequest](../../models/operations/V2CreateTransactionRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2CreateTransactionResponse](../../models/operations/V2CreateTransactionResponse.md)**


## v2DeleteAccountMetadata

Delete metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataRequest req = new V2DeleteAccountMetadataRequest(
                "<value>",
                "foo",
                "ledger001");

            com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataResponse res = sdk.ledger.v2DeleteAccountMetadata(req);

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
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataRequest](../../models/operations/V2DeleteAccountMetadataRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.V2DeleteAccountMetadataResponse](../../models/operations/V2DeleteAccountMetadataResponse.md)**


## v2DeleteTransactionMetadata

Delete metadata by key

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataRequest;
import com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataRequest req = new V2DeleteTransactionMetadataRequest(
                1234L,
                "foo",
                "ledger001");

            com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataResponse res = sdk.ledger.v2DeleteTransactionMetadata(req);

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

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                       | [com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataRequest](../../models/operations/V2DeleteTransactionMetadataRequest.md) | :heavy_check_mark:                                                                                                                              | The request object to use for the request.                                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2DeleteTransactionMetadataResponse](../../models/operations/V2DeleteTransactionMetadataResponse.md)**


## v2GetAccount

Get account by its address

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetAccountRequest;
import com.formance.formance_sdk.models.operations.V2GetAccountResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2GetAccountRequest req = new V2GetAccountRequest(
                "users:001",
                "ledger001"){{
                expand = "<value>";
                pit = OffsetDateTime.parse("2022-01-12T20:42:33.400Z");

            }};

            com.formance.formance_sdk.models.operations.V2GetAccountResponse res = sdk.ledger.v2GetAccount(req);

            if (res.v2AccountResponse != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.V2GetAccountRequest](../../models/operations/V2GetAccountRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.V2GetAccountResponse](../../models/operations/V2GetAccountResponse.md)**


## v2GetBalancesAggregated

Get the aggregated balances from selected accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedRequest;
import com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedRequest req = new V2GetBalancesAggregatedRequest(
                "ledger001"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                pit = OffsetDateTime.parse("2024-12-10T15:05:25.901Z");
                useInsertionDate = false;

            }};

            com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedResponse res = sdk.ledger.v2GetBalancesAggregated(req);

            if (res.v2AggregateBalancesResponse != null) {
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
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedRequest](../../models/operations/V2GetBalancesAggregatedRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.V2GetBalancesAggregatedResponse](../../models/operations/V2GetBalancesAggregatedResponse.md)**


## v2GetInfo

Show server information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2GetInfoResponse res = sdk.ledger.v2GetInfo();

            if (res.v2ConfigInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.V2GetInfoResponse](../../models/operations/V2GetInfoResponse.md)**


## v2GetLedger

Get a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetLedgerRequest;
import com.formance.formance_sdk.models.operations.V2GetLedgerResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2GetLedgerRequest req = new V2GetLedgerRequest(
                "ledger001");

            com.formance.formance_sdk.models.operations.V2GetLedgerResponse res = sdk.ledger.v2GetLedger(req);

            if (res.v2Ledger != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.V2GetLedgerRequest](../../models/operations/V2GetLedgerRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2GetLedgerResponse](../../models/operations/V2GetLedgerResponse.md)**


## v2GetLedgerInfo

Get information about a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetLedgerInfoRequest;
import com.formance.formance_sdk.models.operations.V2GetLedgerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2GetLedgerInfoRequest req = new V2GetLedgerInfoRequest(
                "ledger001");

            com.formance.formance_sdk.models.operations.V2GetLedgerInfoResponse res = sdk.ledger.v2GetLedgerInfo(req);

            if (res.v2LedgerInfoResponse != null) {
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
| `request`                                                                                                               | [com.formance.formance_sdk.models.operations.V2GetLedgerInfoRequest](../../models/operations/V2GetLedgerInfoRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.V2GetLedgerInfoResponse](../../models/operations/V2GetLedgerInfoResponse.md)**


## v2GetTransaction

Get transaction from a ledger by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetTransactionRequest;
import com.formance.formance_sdk.models.operations.V2GetTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2GetTransactionRequest req = new V2GetTransactionRequest(
                1234L,
                "ledger001"){{
                expand = "<value>";
                pit = OffsetDateTime.parse("2023-04-12T09:39:55.552Z");

            }};

            com.formance.formance_sdk.models.operations.V2GetTransactionResponse res = sdk.ledger.v2GetTransaction(req);

            if (res.v2GetTransactionResponse != null) {
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
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.V2GetTransactionRequest](../../models/operations/V2GetTransactionRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.V2GetTransactionResponse](../../models/operations/V2GetTransactionResponse.md)**


## v2ListAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListAccountsRequest;
import com.formance.formance_sdk.models.operations.V2ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2ListAccountsRequest req = new V2ListAccountsRequest(
                "ledger001"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                expand = "<value>";
                pageSize = 26583L;
                pit = OffsetDateTime.parse("2022-03-24T02:49:23.883Z");

            }};

            com.formance.formance_sdk.models.operations.V2ListAccountsResponse res = sdk.ledger.v2ListAccounts(req);

            if (res.v2AccountsCursorResponse != null) {
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
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.V2ListAccountsRequest](../../models/operations/V2ListAccountsRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.V2ListAccountsResponse](../../models/operations/V2ListAccountsResponse.md)**


## v2ListLedgers

List ledgers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListLedgersRequest;
import com.formance.formance_sdk.models.operations.V2ListLedgersResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2ListLedgersRequest req = new V2ListLedgersRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 748636L;

            }};

            com.formance.formance_sdk.models.operations.V2ListLedgersResponse res = sdk.ledger.v2ListLedgers(req);

            if (res.v2LedgerListResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.V2ListLedgersRequest](../../models/operations/V2ListLedgersRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.V2ListLedgersResponse](../../models/operations/V2ListLedgersResponse.md)**


## v2ListLogs

List the logs from a ledger, sorted by ID in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListLogsRequest;
import com.formance.formance_sdk.models.operations.V2ListLogsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2ListLogsRequest req = new V2ListLogsRequest(
                "ledger001"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 549084L;
                pit = OffsetDateTime.parse("2024-12-11T15:21:13.915Z");

            }};

            com.formance.formance_sdk.models.operations.V2ListLogsResponse res = sdk.ledger.v2ListLogs(req);

            if (res.v2LogsCursorResponse != null) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.V2ListLogsRequest](../../models/operations/V2ListLogsRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.V2ListLogsResponse](../../models/operations/V2ListLogsResponse.md)**


## v2ListTransactions

List transactions from a ledger, sorted by id in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListTransactionsRequest;
import com.formance.formance_sdk.models.operations.V2ListTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2ListTransactionsRequest req = new V2ListTransactionsRequest(
                "ledger001"){{
                requestBody = new java.util.HashMap<String, java.lang.Object>(
                ){{
                    put("key", "<value>");
                }};
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                expand = "<value>";
                pageSize = 639042L;
                pit = OffsetDateTime.parse("2024-02-16T01:05:00.445Z");

            }};

            com.formance.formance_sdk.models.operations.V2ListTransactionsResponse res = sdk.ledger.v2ListTransactions(req);

            if (res.v2TransactionsCursorResponse != null) {
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
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.V2ListTransactionsRequest](../../models/operations/V2ListTransactionsRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.V2ListTransactionsResponse](../../models/operations/V2ListTransactionsResponse.md)**


## v2ReadStats

Get statistics from a ledger. (aggregate metrics on accounts and transactions)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ReadStatsRequest;
import com.formance.formance_sdk.models.operations.V2ReadStatsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2ReadStatsRequest req = new V2ReadStatsRequest(
                "ledger001");

            com.formance.formance_sdk.models.operations.V2ReadStatsResponse res = sdk.ledger.v2ReadStats(req);

            if (res.v2StatsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.V2ReadStatsRequest](../../models/operations/V2ReadStatsRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2ReadStatsResponse](../../models/operations/V2ReadStatsResponse.md)**


## v2RevertTransaction

Revert a ledger transaction by its ID

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2RevertTransactionRequest;
import com.formance.formance_sdk.models.operations.V2RevertTransactionResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "<value>"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.V2RevertTransactionRequest req = new V2RevertTransactionRequest(
                1234L,
                "ledger001"){{
                force = false;

            }};

            com.formance.formance_sdk.models.operations.V2RevertTransactionResponse res = sdk.ledger.v2RevertTransaction(req);

            if (res.v2RevertTransactionResponse != null) {
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
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.V2RevertTransactionRequest](../../models/operations/V2RevertTransactionRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2RevertTransactionResponse](../../models/operations/V2RevertTransactionResponse.md)**

