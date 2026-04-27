# Auth.V1

## Overview

### Available Operations

* [createClient](#createclient) - Create client
* [createSecret](#createsecret) - Add a secret to a client
* [deleteClient](#deleteclient) - Delete client
* [deleteSecret](#deletesecret) - Delete a secret from a client
* [getOIDCWellKnowns](#getoidcwellknowns) - Retrieve OpenID connect well-knowns.
* [getServerInfoAuth](#getserverinfoauth) - Get server info
* [listClients](#listclients) - List clients
* [listUsers](#listusers) - List users
* [readClient](#readclient) - Read client
* [readUser](#readuser) - Read user
* [updateClient](#updateclient) - Update client

## createClient

Create client

### Example Usage

<!-- UsageSnippet language="java" operationID="createClient" method="post" path="/api/auth/clients" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateClientResponse;
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

        CreateClientResponse res = sdk.auth().v1().createClient()
                .call();

        if (res.createClientResponse().isPresent()) {
            System.out.println(res.createClientResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [ClientOptions2](../../models/shared/ClientOptions2.md) | :heavy_check_mark:                                      | The request object to use for the request.              |
| `serverURL`                                             | *String*                                                | :heavy_minus_sign:                                      | An optional server URL to use.                          |

### Response

**[CreateClientResponse](../../models/operations/CreateClientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createSecret

Add a secret to a client

### Example Usage

<!-- UsageSnippet language="java" operationID="createSecret" method="post" path="/api/auth/clients/{clientId}/secrets" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateSecretRequest;
import com.formance.formance_sdk.models.operations.CreateSecretResponse;
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

        CreateSecretRequest req = CreateSecretRequest.builder()
                .clientId("<id>")
                .build();

        CreateSecretResponse res = sdk.auth().v1().createSecret()
                .request(req)
                .call();

        if (res.createSecretResponse().isPresent()) {
            System.out.println(res.createSecretResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateSecretRequest](../../models/operations/CreateSecretRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[CreateSecretResponse](../../models/operations/CreateSecretResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteClient

Delete client

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteClient" method="delete" path="/api/auth/clients/{clientId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteClientRequest;
import com.formance.formance_sdk.models.operations.DeleteClientResponse;
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

        DeleteClientRequest req = DeleteClientRequest.builder()
                .clientId("<id>")
                .build();

        DeleteClientResponse res = sdk.auth().v1().deleteClient()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteClientRequest](../../models/operations/DeleteClientRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[DeleteClientResponse](../../models/operations/DeleteClientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteSecret

Delete a secret from a client

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSecret" method="delete" path="/api/auth/clients/{clientId}/secrets/{secretId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteSecretRequest;
import com.formance.formance_sdk.models.operations.DeleteSecretResponse;
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

        DeleteSecretRequest req = DeleteSecretRequest.builder()
                .clientId("<id>")
                .secretId("<id>")
                .build();

        DeleteSecretResponse res = sdk.auth().v1().deleteSecret()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteSecretRequest](../../models/operations/DeleteSecretRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[DeleteSecretResponse](../../models/operations/DeleteSecretResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getOIDCWellKnowns

Retrieve OpenID connect well-knowns.

### Example Usage

<!-- UsageSnippet language="java" operationID="getOIDCWellKnowns" method="get" path="/api/auth/.well-known/openid-configuration" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetOIDCWellKnownsResponse;
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

        GetOIDCWellKnownsResponse res = sdk.auth().v1().getOIDCWellKnowns()
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetOIDCWellKnownsResponse](../../models/operations/GetOIDCWellKnownsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getServerInfoAuth

Get server info

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerInfo_auth" method="get" path="/api/auth/_info" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetServerInfoAuthResponse;
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

        GetServerInfoAuthResponse res = sdk.auth().v1().getServerInfoAuth()
                .call();

        if (res.serverInfo().isPresent()) {
            System.out.println(res.serverInfo().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetServerInfoAuthResponse](../../models/operations/GetServerInfoAuthResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listClients

List clients

### Example Usage

<!-- UsageSnippet language="java" operationID="listClients" method="get" path="/api/auth/clients" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListClientsResponse;
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

        ListClientsResponse res = sdk.auth().v1().listClients()
                .call();

        if (res.listClientsResponse().isPresent()) {
            System.out.println(res.listClientsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[ListClientsResponse](../../models/operations/ListClientsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listUsers

List users

### Example Usage

<!-- UsageSnippet language="java" operationID="listUsers" method="get" path="/api/auth/users" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListUsersResponse;
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

        ListUsersResponse res = sdk.auth().v1().listUsers()
                .call();

        if (res.listUsersResponse().isPresent()) {
            System.out.println(res.listUsersResponse().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[ListUsersResponse](../../models/operations/ListUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## readClient

Read client

### Example Usage

<!-- UsageSnippet language="java" operationID="readClient" method="get" path="/api/auth/clients/{clientId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadClientRequest;
import com.formance.formance_sdk.models.operations.ReadClientResponse;
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

        ReadClientRequest req = ReadClientRequest.builder()
                .clientId("<id>")
                .build();

        ReadClientResponse res = sdk.auth().v1().readClient()
                .request(req)
                .call();

        if (res.readClientResponse().isPresent()) {
            System.out.println(res.readClientResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ReadClientRequest](../../models/operations/ReadClientRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *String*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |

### Response

**[ReadClientResponse](../../models/operations/ReadClientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## readUser

Read user

### Example Usage

<!-- UsageSnippet language="java" operationID="readUser" method="get" path="/api/auth/users/{userId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadUserRequest;
import com.formance.formance_sdk.models.operations.ReadUserResponse;
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

        ReadUserRequest req = ReadUserRequest.builder()
                .userId("<id>")
                .build();

        ReadUserResponse res = sdk.auth().v1().readUser()
                .request(req)
                .call();

        if (res.readUserResponse().isPresent()) {
            System.out.println(res.readUserResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ReadUserRequest](../../models/operations/ReadUserRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[ReadUserResponse](../../models/operations/ReadUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateClient

Update client

### Example Usage

<!-- UsageSnippet language="java" operationID="updateClient" method="put" path="/api/auth/clients/{clientId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateClientRequest;
import com.formance.formance_sdk.models.operations.UpdateClientResponse;
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

        UpdateClientRequest req = UpdateClientRequest.builder()
                .clientId("<id>")
                .build();

        UpdateClientResponse res = sdk.auth().v1().updateClient()
                .request(req)
                .call();

        if (res.createClientResponse().isPresent()) {
            System.out.println(res.createClientResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateClientRequest](../../models/operations/UpdateClientRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[UpdateClientResponse](../../models/operations/UpdateClientResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |