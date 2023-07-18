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
                .setSecurity(new Security("facilis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ConfirmHoldRequest req = new ConfirmHoldRequest("perspiciatis") {{
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
                .setSecurity(new Security("voluptatem") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CreateBalanceRequest req = new CreateBalanceRequest("porro") {{
                createBalanceRequest = new CreateBalanceRequest("consequuntur") {{
                    expiresAt = OffsetDateTime.parse("2021-10-04T07:41:53.553Z");
                    priority = 50370L;
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
                .setSecurity(new Security("occaecati") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            com.formance.formance_sdk.models.shared.CreateWalletRequest req = new CreateWalletRequest(                new java.util.HashMap<String, String>() {{
                                put("adipisci", "asperiores");
                                put("earum", "modi");
                                put("iste", "dolorum");
                            }}, "deleniti");            

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
                .setSecurity(new Security("pariatur") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CreditWalletRequest req = new CreditWalletRequest("provident") {{
                creditWalletRequest = new CreditWalletRequest(                new Monetary(750844L, "libero");,                 new java.util.HashMap<String, String>() {{
                                    put("quaerat", "quos");
                                    put("aliquid", "dolorem");
                                    put("dolorem", "dolor");
                                    put("qui", "ipsum");
                                }},                 new Object[]{{
                                    add(new WalletSubject("reiciendis", "amet") {{
                                        balance = "cum";
                                        identifier = "voluptate";
                                        type = "dignissimos";
                                    }}),
                                    add(new WalletSubject("ipsa", "iure") {{
                                        balance = "numquam";
                                        identifier = "veritatis";
                                        type = "ipsa";
                                    }}),
                                    add(new LedgerAccountSubject("quidem", "voluptatibus") {{
                                        identifier = "quaerat";
                                        type = "accusamus";
                                    }}),
                                    add(new LedgerAccountSubject("atque", "sit") {{
                                        identifier = "natus";
                                        type = "eos";
                                    }}),
                                }}) {{
                    balance = "fugiat";
                    reference = "ab";
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
                .setSecurity(new Security("soluta") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            DebitWalletRequest req = new DebitWalletRequest("dolorum") {{
                debitWalletRequest = new DebitWalletRequest(                new Monetary(478596L, "voluptate");,                 new java.util.HashMap<String, String>() {{
                                    put("deleniti", "omnis");
                                    put("necessitatibus", "distinctio");
                                    put("asperiores", "nihil");
                                }}) {{
                    balances = new String[]{{
                        add("voluptate"),
                    }};
                    description = "id";
                    destination = new WalletSubject("eius", "aspernatur") {{
                        balance = "perferendis";
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

            GetBalanceRequest req = new GetBalanceRequest("optio", "accusamus");            

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
                .setSecurity(new Security("ad") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetHoldRequest req = new GetHoldRequest("saepe");            

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
                .setSecurity(new Security("suscipit") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetHoldsRequest req = new GetHoldsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                metadata = new java.util.HashMap<String, String>() {{
                    put("provident", "minima");
                    put("repellendus", "totam");
                    put("similique", "alias");
                }};
                pageSize = 872651L;
                walletID = "quaerat";
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
                .setSecurity(new Security("tempora") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetTransactionsRequest req = new GetTransactionsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 425451L;
                walletID = "quod";
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
                .setSecurity(new Security("officiis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetWalletRequest req = new GetWalletRequest("qui");            

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
                .setSecurity(new Security("dolorum") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetWalletSummaryRequest req = new GetWalletSummaryRequest("a");            

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
                .setSecurity(new Security("esse") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListBalancesRequest req = new ListBalancesRequest("harum");            

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
                .setSecurity(new Security("iusto") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListWalletsRequest req = new ListWalletsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                metadata = new java.util.HashMap<String, String>() {{
                    put("quisquam", "tenetur");
                }};
                name = "Kelli Thompson";
                pageSize = 213312L;
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
                .setSecurity(new Security("sapiente") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            UpdateWalletRequest req = new UpdateWalletRequest("totam") {{
                requestBody = new UpdateWalletRequestBody(                new java.util.HashMap<String, String>() {{
                                    put("sit", "expedita");
                                    put("neque", "sed");
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
                .setSecurity(new Security("vel") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            VoidHoldRequest req = new VoidHoldRequest("libero");            

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
                .setSecurity(new Security("voluptas") {{
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
