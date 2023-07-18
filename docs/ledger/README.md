# ledger

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
                .setSecurity(new Security("reiciendis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CreateTransactionsRequest req = new CreateTransactionsRequest(                new Transactions(                new com.formance.formance_sdk.models.shared.TransactionData[]{{
                                                add(new TransactionData(                new com.formance.formance_sdk.models.shared.Posting[]{{
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                }}) {{
                                                    metadata = new java.util.HashMap<String, Object>() {{
                                                        put("nihil", "praesentium");
                                                        put("voluptatibus", "ipsa");
                                                        put("omnis", "voluptate");
                                                        put("cum", "perferendis");
                                                    }};
                                                    postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                                                        add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                            amount = 100L;
                                                            asset = "COIN";
                                                            destination = "users:002";
                                                            source = "users:001";
                                                        }}),
                                                    }};
                                                    reference = "ref:001";
                                                    timestamp = OffsetDateTime.parse("2022-09-19T18:36:39.009Z");
                                                }}),
                                                add(new TransactionData(                new com.formance.formance_sdk.models.shared.Posting[]{{
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                }}) {{
                                                    metadata = new java.util.HashMap<String, Object>() {{
                                                        put("corporis", "dolore");
                                                    }};
                                                    postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                                                        add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                            amount = 100L;
                                                            asset = "COIN";
                                                            destination = "users:002";
                                                            source = "users:001";
                                                        }}),
                                                        add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                            amount = 100L;
                                                            asset = "COIN";
                                                            destination = "users:002";
                                                            source = "users:001";
                                                        }}),
                                                    }};
                                                    reference = "ref:001";
                                                    timestamp = OffsetDateTime.parse("2022-04-24T15:19:40.519Z");
                                                }}),
                                                add(new TransactionData(                new com.formance.formance_sdk.models.shared.Posting[]{{
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                }}) {{
                                                    metadata = new java.util.HashMap<String, Object>() {{
                                                        put("commodi", "repudiandae");
                                                        put("quae", "ipsum");
                                                        put("quidem", "molestias");
                                                        put("excepturi", "pariatur");
                                                    }};
                                                    postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                                                        add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                            amount = 100L;
                                                            asset = "COIN";
                                                            destination = "users:002";
                                                            source = "users:001";
                                                        }}),
                                                        add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                            amount = 100L;
                                                            asset = "COIN";
                                                            destination = "users:002";
                                                            source = "users:001";
                                                        }}),
                                                    }};
                                                    reference = "ref:001";
                                                    timestamp = OffsetDateTime.parse("2021-12-15T00:41:38.329Z");
                                                }}),
                                                add(new TransactionData(                new com.formance.formance_sdk.models.shared.Posting[]{{
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                                        amount = 100L;
                                                                        asset = "COIN";
                                                                        destination = "users:002";
                                                                        source = "users:001";
                                                                    }}),
                                                                }}) {{
                                                    metadata = new java.util.HashMap<String, Object>() {{
                                                        put("repudiandae", "sint");
                                                    }};
                                                    postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                                                        add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                                            amount = 100L;
                                                            asset = "COIN";
                                                            destination = "users:002";
                                                            source = "users:001";
                                                        }}),
                                                    }};
                                                    reference = "ref:001";
                                                    timestamp = OffsetDateTime.parse("2022-03-02T21:33:21.372Z");
                                                }}),
                                            }});, "ledger001");            

            CreateTransactionsResponse res = sdk.ledger.createTransactions(req);

            if (res.transactionsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("consequatur") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            AddMetadataOnTransactionRequest req = new AddMetadataOnTransactionRequest("ledger001", 1234L) {{
                requestBody = new java.util.HashMap<String, Object>() {{
                    put("quibusdam", "explicabo");
                    put("deserunt", "distinctio");
                    put("quibusdam", "labore");
                }};
            }};            

            AddMetadataOnTransactionResponse res = sdk.ledger.addMetadataOnTransaction(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("modi") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            AddMetadataToAccountRequest req = new AddMetadataToAccountRequest(                new java.util.HashMap<String, Object>() {{
                                put("aliquid", "cupiditate");
                            }}, "users:001", "ledger001");            

            AddMetadataToAccountResponse res = sdk.ledger.addMetadataToAccount(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("quos") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CountAccountsRequest req = new CountAccountsRequest("ledger001") {{
                address = "users:.+";
                metadata = new java.util.HashMap<String, Object>() {{
                    put("magni", "assumenda");
                }};
            }};            

            CountAccountsResponse res = sdk.ledger.countAccounts(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## countTransactions

Count the transactions from a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CountTransactionsRequest;
import com.formance.formance_sdk.models.operations.CountTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsam") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CountTransactionsRequest req = new CountTransactionsRequest("ledger001") {{
                account = "users:001";
                destination = "users:001";
                endTime = OffsetDateTime.parse("2022-11-08T13:10:11.700Z");
                metadata = new java.util.HashMap<String, Object>() {{
                    put("excepturi", "tempora");
                    put("facilis", "tempore");
                    put("labore", "delectus");
                }};
                reference = "ref:001";
                source = "users:001";
                startTime = OffsetDateTime.parse("2022-10-02T04:55:20.234Z");
            }};            

            CountTransactionsResponse res = sdk.ledger.countTransactions(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("eligendi") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CreateTransactionRequest req = new CreateTransactionRequest(                new PostTransaction() {{
                                metadata = new java.util.HashMap<String, Object>() {{
                                    put("aliquid", "provident");
                                    put("necessitatibus", "sint");
                                    put("officia", "dolor");
                                }};
                                postings = new com.formance.formance_sdk.models.shared.Posting[]{{
                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                        amount = 100L;
                                        asset = "COIN";
                                        destination = "users:002";
                                        source = "users:001";
                                    }}),
                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                        amount = 100L;
                                        asset = "COIN";
                                        destination = "users:002";
                                        source = "users:001";
                                    }}),
                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                        amount = 100L;
                                        asset = "COIN";
                                        destination = "users:002";
                                        source = "users:001";
                                    }}),
                                    add(new Posting(100L, "COIN", "users:002", "users:001") {{
                                        amount = 100L;
                                        asset = "COIN";
                                        destination = "users:002";
                                        source = "users:001";
                                    }}),
                                }};
                                reference = "ref:001";
                                script = new PostTransactionScript("vars {
                                account $user
                                }
                                send [COIN 10] (
                                	source = @world
                                	destination = $user
                                )
                                ") {{
                                    vars = new java.util.HashMap<String, Object>() {{
                                        put("dolorum", "in");
                                        put("in", "illum");
                                        put("maiores", "rerum");
                                        put("dicta", "magnam");
                                    }};
                                }};;
                                timestamp = OffsetDateTime.parse("2020-07-23T21:23:35.691Z");
                            }};, "ledger001") {{
                preview = true;
            }};            

            CreateTransactionResponse res = sdk.ledger.createTransaction(req);

            if (res.transactionsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("ea") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetAccountRequest req = new GetAccountRequest("users:001", "ledger001");            

            GetAccountResponse res = sdk.ledger.getAccount(req);

            if (res.accountResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("aliquid") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetBalancesRequest req = new GetBalancesRequest("ledger001") {{
                address = "users:001";
                after = "users:003";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
            }};            

            GetBalancesResponse res = sdk.ledger.getBalances(req);

            if (res.balancesCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("laborum") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetBalancesAggregatedRequest req = new GetBalancesAggregatedRequest("ledger001") {{
                address = "users:001";
            }};            

            GetBalancesAggregatedResponse res = sdk.ledger.getBalancesAggregated(req);

            if (res.aggregateBalancesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("accusamus") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetInfoResponse res = sdk.ledger.getInfo();

            if (res.configInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("non") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetLedgerInfoRequest req = new GetLedgerInfoRequest("ledger001");            

            GetLedgerInfoResponse res = sdk.ledger.getLedgerInfo(req);

            if (res.ledgerInfoResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("occaecati") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetMappingRequest req = new GetMappingRequest("ledger001");            

            GetMappingResponse res = sdk.ledger.getMapping(req);

            if (res.mappingResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("enim") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetTransactionRequest req = new GetTransactionRequest("ledger001", 1234L);            

            GetTransactionResponse res = sdk.ledger.getTransaction(req);

            if (res.transactionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listAccounts

List accounts from a ledger, sorted by address in descending order.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListAccountsBalanceOperator;
import com.formance.formance_sdk.models.operations.ListAccountsRequest;
import com.formance.formance_sdk.models.operations.ListAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("accusamus") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListAccountsRequest req = new ListAccountsRequest("ledger001") {{
                address = "users:.+";
                after = "users:003";
                balance = 2400L;
                balanceOperator = ListAccountsBalanceOperator.GTE;
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                metadata = new java.util.HashMap<String, Object>() {{
                    put("quidem", "provident");
                    put("nam", "id");
                    put("blanditiis", "deleniti");
                    put("sapiente", "amet");
                }};
                pageSize = 643990L;
                paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
            }};            

            ListAccountsResponse res = sdk.ledger.listAccounts(req);

            if (res.accountsCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("nisi") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListLogsRequest req = new ListLogsRequest("ledger001") {{
                after = "1234";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                endTime = OffsetDateTime.parse("2022-05-20T03:14:12.839Z");
                pageSize = 606393L;
                paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                startTime = OffsetDateTime.parse("2022-12-24T23:52:02.245Z");
            }};            

            ListLogsResponse res = sdk.ledger.listLogs(req);

            if (res.logsCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("nihil") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListTransactionsRequest req = new ListTransactionsRequest("ledger001") {{
                account = "users:001";
                after = "1234";
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                destination = "users:001";
                endTime = OffsetDateTime.parse("2022-04-14T15:11:13.227Z");
                metadata = new java.util.HashMap<String, Object>() {{
                    put("labore", "labore");
                    put("suscipit", "natus");
                    put("nobis", "eum");
                }};
                pageSize = 878453L;
                paginationToken = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                reference = "ref:001";
                source = "users:001";
                startTime = OffsetDateTime.parse("2022-11-24T10:55:00.183Z");
            }};            

            ListTransactionsResponse res = sdk.ledger.listTransactions(req);

            if (res.transactionsCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("magnam") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ReadStatsRequest req = new ReadStatsRequest("ledger001");            

            ReadStatsResponse res = sdk.ledger.readStats(req);

            if (res.statsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("et") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            RevertTransactionRequest req = new RevertTransactionRequest("ledger001", 1234L);            

            RevertTransactionResponse res = sdk.ledger.revertTransaction(req);

            if (res.transactionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## ~~runScript~~

This route is deprecated, and has been merged into `POST /{ledger}/transactions`.


> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

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
                .setSecurity(new Security("excepturi") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            RunScriptRequest req = new RunScriptRequest(                new Script("vars {
                            account $user
                            }
                            send [COIN 10] (
                            	source = @world
                            	destination = $user
                            )
                            ") {{
                                metadata = new java.util.HashMap<String, Object>() {{
                                    put("provident", "quos");
                                    put("sint", "accusantium");
                                }};
                                reference = "order_1234";
                                vars = new java.util.HashMap<String, Object>() {{
                                    put("reiciendis", "mollitia");
                                    put("ad", "eum");
                                    put("dolor", "necessitatibus");
                                }};
                            }};, "ledger001") {{
                preview = true;
            }};            

            RunScriptResponse res = sdk.ledger.runScript(req);

            if (res.scriptResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updateMapping

Update the mapping of a ledger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateMappingRequest;
import com.formance.formance_sdk.models.operations.UpdateMappingResponse;
import com.formance.formance_sdk.models.shared.Contract;
import com.formance.formance_sdk.models.shared.Mapping;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("odit") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            UpdateMappingRequest req = new UpdateMappingRequest(                new Mapping(                new com.formance.formance_sdk.models.shared.Contract[]{{
                                                add(new Contract(                new java.util.HashMap<String, Object>() {{
                                                                    put("eius", "maxime");
                                                                    put("deleniti", "facilis");
                                                                    put("in", "architecto");
                                                                    put("architecto", "repudiandae");
                                                                }}) {{
                                                    account = "users:001";
                                                    expr = new java.util.HashMap<String, Object>() {{
                                                        put("iure", "doloribus");
                                                    }};
                                                }}),
                                                add(new Contract(                new java.util.HashMap<String, Object>() {{
                                                                    put("saepe", "pariatur");
                                                                }}) {{
                                                    account = "users:001";
                                                    expr = new java.util.HashMap<String, Object>() {{
                                                        put("expedita", "nihil");
                                                        put("repellat", "quibusdam");
                                                    }};
                                                }}),
                                            }});, "ledger001");            

            UpdateMappingResponse res = sdk.ledger.updateMapping(req);

            if (res.mappingResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
