# payments

### Available Operations

* [connectorsStripeTransfer](#connectorsstripetransfer) - Transfer funds between Stripe accounts
* [connectorsTransfer](#connectorstransfer) - Transfer funds between Connector accounts
* [getConnectorTask](#getconnectortask) - Read a specific task of the connector
* [getPayment](#getpayment) - Get a payment
* [installConnector](#installconnector) - Install a connector
* [listAllConnectors](#listallconnectors) - List all installed connectors
* [listConfigsAvailableConnectors](#listconfigsavailableconnectors) - List the configs of each available connector
* [listConnectorTasks](#listconnectortasks) - List tasks from a connector
* [listConnectorsTransfers](#listconnectorstransfers) - List transfers and their statuses
* [listPayments](#listpayments) - List payments
* [paymentsgetServerInfo](#paymentsgetserverinfo) - Get server info
* [paymentslistAccounts](#paymentslistaccounts) - List accounts
* [readConnectorConfig](#readconnectorconfig) - Read the config of a connector
* [resetConnector](#resetconnector) - Reset a connector
* [uninstallConnector](#uninstallconnector) - Uninstall a connector
* [updateMetadata](#updatemetadata) - Update metadata

## connectorsStripeTransfer

Execute a transfer between two Stripe accounts.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ConnectorsStripeTransferResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.StripeTransferRequest;
import com.formance.formance_sdk.models.shared.StripeTransferRequestMetadata;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("officia") {{
                    authorization = "";
                }})
                .build();

            com.formance.formance_sdk.models.shared.StripeTransferRequest req = new StripeTransferRequest() {{
                amount = 100L;
                asset = "USD";
                destination = "acct_1Gqj58KZcSIg2N2q";
                metadata = new StripeTransferRequestMetadata();;
            }};            

            ConnectorsStripeTransferResponse res = sdk.payments.connectorsStripeTransfer(req);

            if (res.stripeTransferResponse != null) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.shared.StripeTransferRequest](../../models/shared/StripeTransferRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ConnectorsStripeTransferResponse](../../models/operations/ConnectorsStripeTransferResponse.md)**


## connectorsTransfer

Execute a transfer between two accounts.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ConnectorsTransferRequest;
import com.formance.formance_sdk.models.operations.ConnectorsTransferResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TransferRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dolor") {{
                    authorization = "";
                }})
                .build();

            ConnectorsTransferRequest req = new ConnectorsTransferRequest(                new TransferRequest(100L, "USD", "acct_1Gqj58KZcSIg2N2q") {{
                                source = "acct_1Gqj58KZcSIg2N2q";
                            }};, Connector.BANKING_CIRCLE);            

            ConnectorsTransferResponse res = sdk.payments.connectorsTransfer(req);

            if (res.transferResponse != null) {
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
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.ConnectorsTransferRequest](../../models/operations/ConnectorsTransferRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ConnectorsTransferResponse](../../models/operations/ConnectorsTransferResponse.md)**


## getConnectorTask

Get a specific task associated to the connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetConnectorTaskRequest;
import com.formance.formance_sdk.models.operations.GetConnectorTaskResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("a") {{
                    authorization = "";
                }})
                .build();

            GetConnectorTaskRequest req = new GetConnectorTaskRequest(Connector.CURRENCY_CLOUD, "in");            

            GetConnectorTaskResponse res = sdk.payments.getConnectorTask(req);

            if (res.taskResponse != null) {
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
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.GetConnectorTaskRequest](../../models/operations/GetConnectorTaskRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.GetConnectorTaskResponse](../../models/operations/GetConnectorTaskResponse.md)**


## getPayment

Get a payment

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetPaymentRequest;
import com.formance.formance_sdk.models.operations.GetPaymentResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("in") {{
                    authorization = "";
                }})
                .build();

            GetPaymentRequest req = new GetPaymentRequest("illum");            

            GetPaymentResponse res = sdk.payments.getPayment(req);

            if (res.paymentResponse != null) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.GetPaymentRequest](../../models/operations/GetPaymentRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetPaymentResponse](../../models/operations/GetPaymentResponse.md)**


## installConnector

Install a connector by its name and config.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.InstallConnectorRequest;
import com.formance.formance_sdk.models.operations.InstallConnectorResponse;
import com.formance.formance_sdk.models.shared.BankingCircleConfig;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.CurrencyCloudConfig;
import com.formance.formance_sdk.models.shared.DummyPayConfig;
import com.formance.formance_sdk.models.shared.ModulrConfig;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.StripeConfig;
import com.formance.formance_sdk.models.shared.WiseConfig;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("maiores") {{
                    authorization = "";
                }})
                .build();

            InstallConnectorRequest req = new InstallConnectorRequest(                new CurrencyCloudConfig("XXX", "XXX") {{
                                apiKey = "XXX";
                                endpoint = "XXX";
                                loginID = "XXX";
                                pollingPeriod = "60s";
                            }}, Connector.STRIPE);            

            InstallConnectorResponse res = sdk.payments.installConnector(req);

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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.InstallConnectorRequest](../../models/operations/InstallConnectorRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.InstallConnectorResponse](../../models/operations/InstallConnectorResponse.md)**


## listAllConnectors

List all installed connectors.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListAllConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("magnam") {{
                    authorization = "";
                }})
                .build();

            ListAllConnectorsResponse res = sdk.payments.listAllConnectors();

            if (res.connectorsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListAllConnectorsResponse](../../models/operations/ListAllConnectorsResponse.md)**


## listConfigsAvailableConnectors

List the configs of each available connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("cumque") {{
                    authorization = "";
                }})
                .build();

            ListConfigsAvailableConnectorsResponse res = sdk.payments.listConfigsAvailableConnectors();

            if (res.connectorsConfigsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListConfigsAvailableConnectorsResponse](../../models/operations/ListConfigsAvailableConnectorsResponse.md)**


## listConnectorTasks

List all tasks associated with this connector.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListConnectorTasksRequest;
import com.formance.formance_sdk.models.operations.ListConnectorTasksResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("facere") {{
                    authorization = "";
                }})
                .build();

            ListConnectorTasksRequest req = new ListConnectorTasksRequest(Connector.WISE) {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 396506L;
            }};            

            ListConnectorTasksResponse res = sdk.payments.listConnectorTasks(req);

            if (res.tasksCursor != null) {
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
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.ListConnectorTasksRequest](../../models/operations/ListConnectorTasksRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ListConnectorTasksResponse](../../models/operations/ListConnectorTasksResponse.md)**


## listConnectorsTransfers

List transfers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListConnectorsTransfersRequest;
import com.formance.formance_sdk.models.operations.ListConnectorsTransfersResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("laborum") {{
                    authorization = "";
                }})
                .build();

            ListConnectorsTransfersRequest req = new ListConnectorsTransfersRequest(Connector.BANKING_CIRCLE);            

            ListConnectorsTransfersResponse res = sdk.payments.listConnectorsTransfers(req);

            if (res.transfersResponse != null) {
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
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.ListConnectorsTransfersRequest](../../models/operations/ListConnectorsTransfersRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.ListConnectorsTransfersResponse](../../models/operations/ListConnectorsTransfersResponse.md)**


## listPayments

List payments

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListPaymentsRequest;
import com.formance.formance_sdk.models.operations.ListPaymentsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("non") {{
                    authorization = "";
                }})
                .build();

            ListPaymentsRequest req = new ListPaymentsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 581273L;
                sort = new String[]{{
                    add("accusamus"),
                    add("delectus"),
                }};
            }};            

            ListPaymentsResponse res = sdk.payments.listPayments(req);

            if (res.paymentsCursor != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.ListPaymentsRequest](../../models/operations/ListPaymentsRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListPaymentsResponse](../../models/operations/ListPaymentsResponse.md)**


## paymentsgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quidem") {{
                    authorization = "";
                }})
                .build();

            PaymentsgetServerInfoResponse res = sdk.payments.paymentsgetServerInfo();

            if (res.serverInfo != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.PaymentsgetServerInfoResponse](../../models/operations/PaymentsgetServerInfoResponse.md)**


## paymentslistAccounts

List accounts

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.PaymentslistAccountsRequest;
import com.formance.formance_sdk.models.operations.PaymentslistAccountsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("provident") {{
                    authorization = "";
                }})
                .build();

            PaymentslistAccountsRequest req = new PaymentslistAccountsRequest() {{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 725255L;
                sort = new String[]{{
                    add("blanditiis"),
                    add("deleniti"),
                    add("sapiente"),
                }};
            }};            

            PaymentslistAccountsResponse res = sdk.payments.paymentslistAccounts(req);

            if (res.accountsCursor != null) {
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
| `request`                                                                                                                         | [com.formance.formance_sdk.models.operations.PaymentslistAccountsRequest](../../models/operations/PaymentslistAccountsRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.PaymentslistAccountsResponse](../../models/operations/PaymentslistAccountsResponse.md)**


## readConnectorConfig

Read connector config

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigRequest;
import com.formance.formance_sdk.models.operations.ReadConnectorConfigResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("amet") {{
                    authorization = "";
                }})
                .build();

            ReadConnectorConfigRequest req = new ReadConnectorConfigRequest(Connector.MODULR);            

            ReadConnectorConfigResponse res = sdk.payments.readConnectorConfig(req);

            if (res.connectorConfigResponse != null) {
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
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.ReadConnectorConfigRequest](../../models/operations/ReadConnectorConfigRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ReadConnectorConfigResponse](../../models/operations/ReadConnectorConfigResponse.md)**


## resetConnector

Reset a connector by its name.
It will remove the connector and ALL PAYMENTS generated with it.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ResetConnectorRequest;
import com.formance.formance_sdk.models.operations.ResetConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nisi") {{
                    authorization = "";
                }})
                .build();

            ResetConnectorRequest req = new ResetConnectorRequest(Connector.WISE);            

            ResetConnectorResponse res = sdk.payments.resetConnector(req);

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
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.ResetConnectorRequest](../../models/operations/ResetConnectorRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.ResetConnectorResponse](../../models/operations/ResetConnectorResponse.md)**


## uninstallConnector

Uninstall a connector by its name.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UninstallConnectorRequest;
import com.formance.formance_sdk.models.operations.UninstallConnectorResponse;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("natus") {{
                    authorization = "";
                }})
                .build();

            UninstallConnectorRequest req = new UninstallConnectorRequest(Connector.MODULR);            

            UninstallConnectorResponse res = sdk.payments.uninstallConnector(req);

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

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.UninstallConnectorRequest](../../models/operations/UninstallConnectorRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.UninstallConnectorResponse](../../models/operations/UninstallConnectorResponse.md)**


## updateMetadata

Update metadata

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateMetadataRequest;
import com.formance.formance_sdk.models.operations.UpdateMetadataResponse;
import com.formance.formance_sdk.models.shared.PaymentMetadata;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("molestiae") {{
                    authorization = "";
                }})
                .build();

            UpdateMetadataRequest req = new UpdateMetadataRequest(                new PaymentMetadata() {{
                                key = "perferendis";
                            }};, "nihil");            

            UpdateMetadataResponse res = sdk.payments.updateMetadata(req);

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
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.UpdateMetadataRequest](../../models/operations/UpdateMetadataRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.UpdateMetadataResponse](../../models/operations/UpdateMetadataResponse.md)**

