# SDKWebhooksV1
(*webhooks().v1()*)

## Overview

### Available Operations

* [activateConfig](#activateconfig) - Activate one config
* [changeConfigSecret](#changeconfigsecret) - Change the signing secret of a config
* [deactivateConfig](#deactivateconfig) - Deactivate one config
* [deleteConfig](#deleteconfig) - Delete one config
* [getManyConfigs](#getmanyconfigs) - Get many configs
* [insertConfig](#insertconfig) - Insert a new config
* [testConfig](#testconfig) - Test one config

## activateConfig

Activate a webhooks config by ID, to start receiving webhooks to its endpoint.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.ActivateConfigRequest;
import com.formance.formance_sdk.models.operations.ActivateConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ActivateConfigRequest req = ActivateConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        ActivateConfigResponse res = sdk.webhooks().v1().activateConfig()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            // handle response
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## changeConfigSecret

Change the signing secret of the endpoint of a webhooks config.

If not passed or empty, a secret is automatically generated.
The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.ChangeConfigSecretRequest;
import com.formance.formance_sdk.models.operations.ChangeConfigSecretResponse;
import com.formance.formance_sdk.models.shared.ConfigChangeSecret;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
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
            // handle response
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## deactivateConfig

Deactivate a webhooks config by ID, to stop receiving webhooks to its endpoint.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.DeactivateConfigRequest;
import com.formance.formance_sdk.models.operations.DeactivateConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        DeactivateConfigRequest req = DeactivateConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        DeactivateConfigResponse res = sdk.webhooks().v1().deactivateConfig()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            // handle response
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## deleteConfig

Delete a webhooks config by ID.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.DeleteConfigRequest;
import com.formance.formance_sdk.models.operations.DeleteConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## getManyConfigs

Sorted by updated date descending

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.GetManyConfigsRequest;
import com.formance.formance_sdk.models.operations.GetManyConfigsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
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
            // handle response
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## insertConfig

Insert a new webhooks config.

The endpoint should be a valid https URL and be unique.

The secret is the endpoint's verification secret.
If not passed or empty, a secret is automatically generated.
The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)

All eventTypes are converted to lower-case when inserted.


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.InsertConfigResponse;
import com.formance.formance_sdk.models.shared.ConfigUser;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ConfigUser req = ConfigUser.builder()
                .endpoint("https://example.com")
                .eventTypes(List.of(
                    "TYPE1",
                    "TYPE2"))
                .name("customer_payment")
                .secret("V0bivxRWveaoz08afqjU6Ko/jwO0Cb+3")
                .build();

        InsertConfigResponse res = sdk.webhooks().v1().insertConfig()
                .request(req)
                .call();

        if (res.configResponse().isPresent()) {
            // handle response
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## testConfig

Test a config by sending a webhook to its endpoint.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.WebhooksErrorResponse;
import com.formance.formance_sdk.models.operations.TestConfigRequest;
import com.formance.formance_sdk.models.operations.TestConfigResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws WebhooksErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        TestConfigRequest req = TestConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

        TestConfigResponse res = sdk.webhooks().v1().testConfig()
                .request(req)
                .call();

        if (res.attemptResponse().isPresent()) {
            // handle response
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

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |