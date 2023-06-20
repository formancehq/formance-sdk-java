# wallets

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
import com.formance.formance_sdk.models.operations.ConfirmHoldRequest;
import com.formance.formance_sdk.models.operations.ConfirmHoldResponse;
import com.formance.formance_sdk.models.shared.ConfirmHoldRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("amet") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ConfirmHoldRequest req = new ConfirmHoldRequest("aut") {{
                confirmHoldRequest = new ConfirmHoldRequest() {{
                    amount = 100L;
                    final_ = true;
                }};;
            }};            

            ConfirmHoldResponse res = sdk.wallets.confirmHold(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createBalance

Create a balance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateBalanceRequest;
import com.formance.formance_sdk.models.operations.CreateBalanceResponse;
import com.formance.formance_sdk.models.shared.CreateBalanceRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("cumque") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CreateBalanceRequest req = new CreateBalanceRequest("corporis") {{
                createBalanceRequest = new CreateBalanceRequest("hic") {{
                    expiresAt = OffsetDateTime.parse("2021-07-02T12:00:47.197Z");
                    priority = 171629L;
                }};;
            }};            

            CreateBalanceResponse res = sdk.wallets.createBalance(req);

            if (res.createBalanceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createWallet

Create a new wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateWalletResponse;
import com.formance.formance_sdk.models.shared.CreateWalletRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            com.formance.formance_sdk.models.shared.CreateWalletRequest req = new CreateWalletRequest(                new java.util.HashMap<String, String>() {{
                                put("dignissimos", "eaque");
                                put("quis", "nesciunt");
                                put("eos", "perferendis");
                            }}, "dolores");            

            CreateWalletResponse res = sdk.wallets.createWallet(req);

            if (res.createWalletResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## creditWallet

Credit a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreditWalletRequest;
import com.formance.formance_sdk.models.operations.CreditWalletResponse;
import com.formance.formance_sdk.models.shared.CreditWalletRequest;
import com.formance.formance_sdk.models.shared.LedgerAccountSubject;
import com.formance.formance_sdk.models.shared.Monetary;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.WalletSubject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("minus") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CreditWalletRequest req = new CreditWalletRequest("quam") {{
                creditWalletRequest = new CreditWalletRequest(                new Monetary(223924L, "vero");,                 new java.util.HashMap<String, String>() {{
                                    put("hic", "recusandae");
                                    put("omnis", "facilis");
                                }},                 new Object[]{{
                                    add(new LedgerAccountSubject("blanditiis", "error") {{
                                        identifier = "porro";
                                        type = "consequuntur";
                                    }}),
                                    add(new LedgerAccountSubject("adipisci", "asperiores") {{
                                        identifier = "occaecati";
                                        type = "rerum";
                                    }}),
                                    add(new WalletSubject("deleniti", "pariatur") {{
                                        balance = "modi";
                                        identifier = "iste";
                                        type = "dolorum";
                                    }}),
                                }}) {{
                    balance = "provident";
                    reference = "nobis";
                }};;
            }};            

            CreditWalletResponse res = sdk.wallets.creditWallet(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## debitWallet

Debit a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DebitWalletRequest;
import com.formance.formance_sdk.models.operations.DebitWalletResponse;
import com.formance.formance_sdk.models.shared.DebitWalletRequest;
import com.formance.formance_sdk.models.shared.LedgerAccountSubject;
import com.formance.formance_sdk.models.shared.Monetary;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.WalletSubject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("libero") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            DebitWalletRequest req = new DebitWalletRequest("delectus") {{
                debitWalletRequest = new DebitWalletRequest(                new Monetary(311945L, "quos");,                 new java.util.HashMap<String, String>() {{
                                    put("dolorem", "dolorem");
                                    put("dolor", "qui");
                                }}) {{
                    balances = new String[]{{
                        add("hic"),
                    }};
                    description = "excepturi";
                    destination = new WalletSubject("voluptate", "dignissimos") {{
                        balance = "reiciendis";
                    }};;
                    pending = false;
                }};;
            }};            

            DebitWalletResponse res = sdk.wallets.debitWallet(req);

            if (res.debitWalletResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getBalance

Get detailed balance

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetBalanceRequest;
import com.formance.formance_sdk.models.operations.GetBalanceResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("amet") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetBalanceRequest req = new GetBalanceRequest("dolorum", "numquam");            

            GetBalanceResponse res = sdk.wallets.getBalance(req);

            if (res.getBalanceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getHold

Get a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetHoldRequest;
import com.formance.formance_sdk.models.operations.GetHoldResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("veritatis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetHoldRequest req = new GetHoldRequest("ipsa");            

            GetHoldResponse res = sdk.wallets.getHold(req);

            if (res.getHoldResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getHolds

Get all holds for a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetHoldsRequest;
import com.formance.formance_sdk.models.operations.GetHoldsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsa") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetHoldsRequest req = new GetHoldsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                metadata = new java.util.HashMap<String, String>() {{
                    put("odio", "quaerat");
                    put("accusamus", "quidem");
                }};
                pageSize = 976405L;
                walletID = "voluptas";
            }};            

            GetHoldsResponse res = sdk.wallets.getHolds(req);

            if (res.getHoldsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getTransactions

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetTransactionsRequest;
import com.formance.formance_sdk.models.operations.GetTransactionsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("natus") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetTransactionsRequest req = new GetTransactionsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 179603L;
                walletID = "atque";
            }};            

            GetTransactionsResponse res = sdk.wallets.getTransactions(req);

            if (res.getTransactionsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getWallet

Get a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetWalletRequest;
import com.formance.formance_sdk.models.operations.GetWalletResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("sit") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetWalletRequest req = new GetWalletRequest("fugiat");            

            GetWalletResponse res = sdk.wallets.getWallet(req);

            if (res.getWalletResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getWalletSummary

Get wallet summary

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetWalletSummaryRequest;
import com.formance.formance_sdk.models.operations.GetWalletSummaryResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ab") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetWalletSummaryRequest req = new GetWalletSummaryRequest("soluta");            

            GetWalletSummaryResponse res = sdk.wallets.getWalletSummary(req);

            if (res.getWalletSummaryResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listBalances

List balances of a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListBalancesRequest;
import com.formance.formance_sdk.models.operations.ListBalancesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dolorum") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListBalancesRequest req = new ListBalancesRequest("iusto");            

            ListBalancesResponse res = sdk.wallets.listBalances(req);

            if (res.listBalancesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listWallets

List all wallets

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListWalletsRequest;
import com.formance.formance_sdk.models.operations.ListWalletsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("voluptate") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListWalletsRequest req = new ListWalletsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                metadata = new java.util.HashMap<String, String>() {{
                    put("deleniti", "omnis");
                    put("necessitatibus", "distinctio");
                    put("asperiores", "nihil");
                }};
                name = "Tamara Ondricka";
                pageSize = 137220L;
            }};            

            ListWalletsResponse res = sdk.wallets.listWallets(req);

            if (res.listWalletsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updateWallet

Update a wallet

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateWalletRequest;
import com.formance.formance_sdk.models.operations.UpdateWalletRequestBody;
import com.formance.formance_sdk.models.operations.UpdateWalletResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("perferendis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            UpdateWalletRequest req = new UpdateWalletRequest("amet") {{
                requestBody = new UpdateWalletRequestBody(                new java.util.HashMap<String, String>() {{
                                    put("accusamus", "ad");
                                    put("saepe", "suscipit");
                                    put("deserunt", "provident");
                                    put("minima", "repellendus");
                                }});;
            }};            

            UpdateWalletResponse res = sdk.wallets.updateWallet(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## voidHold

Cancel a hold

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.VoidHoldRequest;
import com.formance.formance_sdk.models.operations.VoidHoldResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("totam") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            VoidHoldRequest req = new VoidHoldRequest("similique");            

            VoidHoldResponse res = sdk.wallets.voidHold(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## walletsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.WalletsgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("alias") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            WalletsgetServerInfoResponse res = sdk.wallets.walletsgetServerInfo();

            if (res.serverInfo != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
