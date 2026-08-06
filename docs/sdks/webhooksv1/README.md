# Webhooks.V1

## Overview

### Available Operations

* [activateConfig](#activateconfig) - Activate one config
* [changeConfigSecret](#changeconfigsecret) - Change the signing secret of a config
* [deactivateConfig](#deactivateconfig) - Deactivate one config
* [deleteConfig](#deleteconfig) - Delete one config
* [getDeliveries](#getdeliveries) - List webhook deliveries
* [getDelivery](#getdelivery) - Get a webhook delivery
* [getDeliveryAttempts](#getdeliveryattempts) - List attempts for a webhook delivery
* [getManyConfigs](#getmanyconfigs) - Get many configs
* [insertConfig](#insertconfig) - Insert a new config
* [replayDeliveries](#replaydeliveries) - Replay a page of failed or pending deliveries
* [replayDelivery](#replaydelivery) - Replay one failed or pending delivery
* [testConfig](#testconfig) - Test one config
* [updateConfig](#updateconfig) - Update one config

## activateConfig

Activate a webhooks config by ID, to start receiving webhooks to its endpoint.

### Example Usage

<!-- UsageSnippet language="java" operationID="activateConfig" method="put" path="/api/webhooks/configs/{id}/activate" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ActivateConfigRequest;
import com.formance.formance_sdk.models.operations.ActivateConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ActivateConfigRequest req = ActivateConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        ActivateConfigResponse res = sdk.webhooks().v1().activateConfig()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            System.out.println(res.configResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ActivateConfigRequest](../../models/operations/ActivateConfigRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ActivateConfigResponse](../../models/operations/ActivateConfigResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## changeConfigSecret

Change the signing secret of the endpoint of a webhooks config.

If not passed or empty, a secret is automatically generated.
The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)


### Example Usage

<!-- UsageSnippet language="java" operationID="changeConfigSecret" method="put" path="/api/webhooks/configs/{id}/secret/change" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ChangeConfigSecretRequest;
import com.formance.formance_sdk.models.operations.ChangeConfigSecretResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ConfigChangeSecret;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ChangeConfigSecretRequest req = ChangeConfigSecretRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .configChangeSecret(ConfigChangeSecret.builder()
                    .secret("V0bivxRWveaoz08afqjU6Ko/jwO0Cb+3")
                    .build())
                .build();

        ChangeConfigSecretResponse res = sdk.webhooks().v1().changeConfigSecret()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            System.out.println(res.configResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ChangeConfigSecretRequest](../../models/operations/ChangeConfigSecretRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ChangeConfigSecretResponse](../../models/operations/ChangeConfigSecretResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## deactivateConfig

Deactivate a webhooks config by ID, to stop receiving webhooks to its endpoint.

### Example Usage

<!-- UsageSnippet language="java" operationID="deactivateConfig" method="put" path="/api/webhooks/configs/{id}/deactivate" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeactivateConfigRequest;
import com.formance.formance_sdk.models.operations.DeactivateConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        DeactivateConfigRequest req = DeactivateConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        DeactivateConfigResponse res = sdk.webhooks().v1().deactivateConfig()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            System.out.println(res.configResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeactivateConfigRequest](../../models/operations/DeactivateConfigRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeactivateConfigResponse](../../models/operations/DeactivateConfigResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## deleteConfig

Delete a webhooks config by ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteConfig" method="delete" path="/api/webhooks/configs/{id}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteConfigRequest;
import com.formance.formance_sdk.models.operations.DeleteConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        DeleteConfigRequest req = DeleteConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        DeleteConfigResponse res = sdk.webhooks().v1().deleteConfig()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteConfigRequest](../../models/operations/DeleteConfigRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteConfigResponse](../../models/operations/DeleteConfigResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getDeliveries

List webhook deliveries

### Example Usage

<!-- UsageSnippet language="java" operationID="getDeliveries" method="get" path="/api/webhooks/deliveries" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetDeliveriesRequest;
import com.formance.formance_sdk.models.operations.GetDeliveriesResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetDeliveriesRequest req = GetDeliveriesRequest.builder()
                .build();

        GetDeliveriesResponse res = sdk.webhooks().v1().getDeliveries()
                .request(req)
                .call();

        if (res.deliveriesResponse().isPresent()) {
            System.out.println(res.deliveriesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetDeliveriesRequest](../../models/operations/GetDeliveriesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetDeliveriesResponse](../../models/operations/GetDeliveriesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getDelivery

Get a webhook delivery

### Example Usage

<!-- UsageSnippet language="java" operationID="getDelivery" method="get" path="/api/webhooks/deliveries/{id}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetDeliveryRequest;
import com.formance.formance_sdk.models.operations.GetDeliveryResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetDeliveryRequest req = GetDeliveryRequest.builder()
                .id("01e5cac6-75f1-4720-81ca-5563ce22d2e0")
                .build();

        GetDeliveryResponse res = sdk.webhooks().v1().getDelivery()
                .request(req)
                .call();

        if (res.deliveryResponse().isPresent()) {
            System.out.println(res.deliveryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetDeliveryRequest](../../models/operations/GetDeliveryRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetDeliveryResponse](../../models/operations/GetDeliveryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getDeliveryAttempts

List attempts for a webhook delivery

### Example Usage

<!-- UsageSnippet language="java" operationID="getDeliveryAttempts" method="get" path="/api/webhooks/deliveries/{id}/attempts" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetDeliveryAttemptsRequest;
import com.formance.formance_sdk.models.operations.GetDeliveryAttemptsResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetDeliveryAttemptsRequest req = GetDeliveryAttemptsRequest.builder()
                .id("967e7a38-b11b-4809-92cf-6789e24dbe13")
                .build();

        GetDeliveryAttemptsResponse res = sdk.webhooks().v1().getDeliveryAttempts()
                .request(req)
                .call();

        if (res.deliveryAttemptsResponse().isPresent()) {
            System.out.println(res.deliveryAttemptsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetDeliveryAttemptsRequest](../../models/operations/GetDeliveryAttemptsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetDeliveryAttemptsResponse](../../models/operations/GetDeliveryAttemptsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## getManyConfigs

Sorted by updated date descending

### Example Usage

<!-- UsageSnippet language="java" operationID="getManyConfigs" method="get" path="/api/webhooks/configs" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetManyConfigsRequest;
import com.formance.formance_sdk.models.operations.GetManyConfigsResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetManyConfigsRequest req = GetManyConfigsRequest.builder()
                .endpoint("https://example.com")
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        GetManyConfigsResponse res = sdk.webhooks().v1().getManyConfigs()
                .request(req)
                .call();

        if (res.configsResponse().isPresent()) {
            System.out.println(res.configsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetManyConfigsRequest](../../models/operations/GetManyConfigsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetManyConfigsResponse](../../models/operations/GetManyConfigsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## insertConfig

Insert a new webhooks config.

The endpoint should be a valid https URL and be unique.

The secret is the endpoint's verification secret.
If not passed or empty, a secret is automatically generated.
The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)

All eventTypes are converted to lower-case when inserted.


### Example Usage

<!-- UsageSnippet language="java" operationID="insertConfig" method="post" path="/api/webhooks/configs" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.InsertConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ConfigUser;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ConfigUser req = ConfigUser.builder()
                .endpoint("https://example.com")
                .eventTypes(List.of(
                    "TYPE1",
                    "TYPE2"))
                .secret("V0bivxRWveaoz08afqjU6Ko/jwO0Cb+3")
                .build();

        InsertConfigResponse res = sdk.webhooks().v1().insertConfig()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            System.out.println(res.configResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [ConfigUser](../../models/shared/ConfigUser.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[InsertConfigResponse](../../models/operations/InsertConfigResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## replayDeliveries

Replay a page of failed or pending deliveries

### Example Usage

<!-- UsageSnippet language="java" operationID="replayDeliveries" method="post" path="/api/webhooks/deliveries/replay" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReplayDeliveriesResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import com.formance.formance_sdk.models.webhooks.ReplayDeliveriesRequest;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.ReplayDeliveriesRequest req = com.formance.formance_sdk.models.operations.ReplayDeliveriesRequest.builder()
                .idempotencyKey("<value>")
                .replayDeliveriesRequest(ReplayDeliveriesRequest.builder()
                    .createdAtFrom(OffsetDateTime.parse("2026-10-16T11:02:44.647Z"))
                    .build())
                .build();

        ReplayDeliveriesResponse res = sdk.webhooks().v1().replayDeliveries()
                .request(req)
                .call();

        if (res.replayDeliveriesResponse().isPresent()) {
            System.out.println(res.replayDeliveriesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ReplayDeliveriesRequest](../../models/operations/ReplayDeliveriesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ReplayDeliveriesResponse](../../models/operations/ReplayDeliveriesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## replayDelivery

Replay one failed or pending delivery

### Example Usage

<!-- UsageSnippet language="java" operationID="replayDelivery" method="post" path="/api/webhooks/deliveries/{id}/replay" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReplayDeliveryRequest;
import com.formance.formance_sdk.models.operations.ReplayDeliveryResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ReplayDeliveryRequest req = ReplayDeliveryRequest.builder()
                .idempotencyKey("<value>")
                .id("06a0d0bb-48de-45f0-b12f-6458a3a41bbe")
                .build();

        ReplayDeliveryResponse res = sdk.webhooks().v1().replayDelivery()
                .request(req)
                .call();

        if (res.deliveryResponse().isPresent()) {
            System.out.println(res.deliveryResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ReplayDeliveryRequest](../../models/operations/ReplayDeliveryRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ReplayDeliveryResponse](../../models/operations/ReplayDeliveryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## testConfig

Test a config by sending a webhook to its endpoint.

### Example Usage

<!-- UsageSnippet language="java" operationID="testConfig" method="get" path="/api/webhooks/configs/{id}/test" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.TestConfigRequest;
import com.formance.formance_sdk.models.operations.TestConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        TestConfigRequest req = TestConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        TestConfigResponse res = sdk.webhooks().v1().testConfig()
                .request(req)
                .call();

        if (res.attemptResponse().isPresent()) {
            System.out.println(res.attemptResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [TestConfigRequest](../../models/operations/TestConfigRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[TestConfigResponse](../../models/operations/TestConfigResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |

## updateConfig

Update a webhooks config by ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateConfig" method="put" path="/api/webhooks/configs/{id}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateConfigRequest;
import com.formance.formance_sdk.models.operations.UpdateConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.webhooks.ConfigUser;
import com.formance.formance_sdk.models.webhooks.ErrorResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        UpdateConfigRequest req = UpdateConfigRequest.builder()
                .configUser(ConfigUser.builder()
                    .endpoint("https://example.com")
                    .eventTypes(List.of(
                        "TYPE1",
                        "TYPE2"))
                    .secret("V0bivxRWveaoz08afqjU6Ko/jwO0Cb+3")
                    .build())
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        UpdateConfigResponse res = sdk.webhooks().v1().updateConfig()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateConfigRequest](../../models/operations/UpdateConfigRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateConfigResponse](../../models/operations/UpdateConfigResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | default                     | application/json            |
| models/errors/SDKError      | 4XX, 5XX                    | \*/\*                       |