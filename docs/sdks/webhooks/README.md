# Webhooks
(*webhooks()*)

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
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            ActivateConfigRequest req = ActivateConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

            ActivateConfigResponse res = sdk.webhooks().activateConfig()
                .request(req)
                .call();

            if (res.configResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.ActivateConfigRequest](../../models/operations/ActivateConfigRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.ActivateConfigResponse>](../../models/operations/ActivateConfigResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |

## changeConfigSecret

Change the signing secret of the endpoint of a webhooks config.

If not passed or empty, a secret is automatically generated.
The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)


### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            ChangeConfigSecretRequest req = ChangeConfigSecretRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .configChangeSecret(ConfigChangeSecret.builder()
                    .secret("V0bivxRWveaoz08afqjU6Ko/jwO0Cb+3")
                    .build())
                .build();

            ChangeConfigSecretResponse res = sdk.webhooks().changeConfigSecret()
                .request(req)
                .call();

            if (res.configResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.ChangeConfigSecretRequest](../../models/operations/ChangeConfigSecretRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.ChangeConfigSecretResponse>](../../models/operations/ChangeConfigSecretResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |

## deactivateConfig

Deactivate a webhooks config by ID, to stop receiving webhooks to its endpoint.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            DeactivateConfigRequest req = DeactivateConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

            DeactivateConfigResponse res = sdk.webhooks().deactivateConfig()
                .request(req)
                .call();

            if (res.configResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.DeactivateConfigRequest](../../models/operations/DeactivateConfigRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.DeactivateConfigResponse>](../../models/operations/DeactivateConfigResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |

## deleteConfig

Delete a webhooks config by ID.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            DeleteConfigRequest req = DeleteConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

            DeleteConfigResponse res = sdk.webhooks().deleteConfig()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.DeleteConfigRequest](../../models/operations/DeleteConfigRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.DeleteConfigResponse>](../../models/operations/DeleteConfigResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |

## getManyConfigs

Sorted by updated date descending

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            GetManyConfigsRequest req = GetManyConfigsRequest.builder()
                .endpoint("https://example.com")
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

            GetManyConfigsResponse res = sdk.webhooks().getManyConfigs()
                .request(req)
                .call();

            if (res.configsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.GetManyConfigsRequest](../../models/operations/GetManyConfigsRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.GetManyConfigsResponse>](../../models/operations/GetManyConfigsResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |

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
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            ConfigUser req = ConfigUser.builder()
                .endpoint("https://example.com")
                .eventTypes(java.util.List.of(
                        "TYPE1",
                        "TYPE2"))
                .name("customer_payment")
                .secret("V0bivxRWveaoz08afqjU6Ko/jwO0Cb+3")
                .build();

            InsertConfigResponse res = sdk.webhooks().insertConfig()
                .request(req)
                .call();

            if (res.configResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [com.formance.formance_sdk.models.shared.ConfigUser](../../models/shared/ConfigUser.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.InsertConfigResponse>](../../models/operations/InsertConfigResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |

## testConfig

Test a config by sending a webhook to its endpoint.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("<YOUR_AUTHORIZATION_HERE>")
                    .build())
                .build();

            TestConfigRequest req = TestConfigRequest.builder()
                .id("4997257d-dfb6-445b-929c-cbe2ab182818")
                .build();

            TestConfigResponse res = sdk.webhooks().testConfig()
                .request(req)
                .call();

            if (res.attemptResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.WebhooksErrorResponse e) {
            // handle exception
            throw e;
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.TestConfigRequest](../../models/operations/TestConfigRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.TestConfigResponse>](../../models/operations/TestConfigResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/WebhooksErrorResponse | default                             | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | */*                                 |
