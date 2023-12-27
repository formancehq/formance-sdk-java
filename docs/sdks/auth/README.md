# Auth
(*auth*)

### Available Operations

* [createClient](#createclient) - Create client
* [createSecret](#createsecret) - Add a secret to a client
* [deleteClient](#deleteclient) - Delete client
* [deleteSecret](#deletesecret) - Delete a secret from a client
* [getServerInfo](#getserverinfo) - Get server info
* [listClients](#listclients) - List clients
* [listUsers](#listusers) - List users
* [readClient](#readclient) - Read client
* [readUser](#readuser) - Read user
* [updateClient](#updateclient) - Update client

## createClient

Create client

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateClientResponse;
import com.formance.formance_sdk.models.shared.CreateClientRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            com.formance.formance_sdk.models.shared.CreateClientRequest req = new CreateClientRequest("string"){{
                description = "Managed optimizing help-desk";
                metadata = new java.util.HashMap<String, Object>(){{
                    put("key", "string");
                }};
                postLogoutRedirectUris = new String[]{{
                    add("string"),
                }};
                public_ = false;
                redirectUris = new String[]{{
                    add("string"),
                }};
                scopes = new String[]{{
                    add("string"),
                }};
                trusted = false;
            }};            

            CreateClientResponse res = sdk.auth.createClient(req);

            if (res.createClientResponse != null) {
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
| `request`                                                                                                 | [com.formance.formance_sdk.models.shared.CreateClientRequest](../../models/shared/CreateClientRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.formance.formance_sdk.models.operations.CreateClientResponse](../../models/operations/CreateClientResponse.md)**


## createSecret

Add a secret to a client

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateSecretRequest;
import com.formance.formance_sdk.models.operations.CreateSecretResponse;
import com.formance.formance_sdk.models.shared.CreateSecretRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            CreateSecretRequest req = new CreateSecretRequest("string"){{
                createSecretRequest = new CreateSecretRequest("string"){{
                    metadata = new java.util.HashMap<String, Object>(){{
                        put("key", "string");
                    }};
                }};
            }};            

            CreateSecretResponse res = sdk.auth.createSecret(req);

            if (res.createSecretResponse != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.CreateSecretRequest](../../models/operations/CreateSecretRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.CreateSecretResponse](../../models/operations/CreateSecretResponse.md)**


## deleteClient

Delete client

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteClientRequest;
import com.formance.formance_sdk.models.operations.DeleteClientResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DeleteClientRequest req = new DeleteClientRequest("string");            

            DeleteClientResponse res = sdk.auth.deleteClient(req);

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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.DeleteClientRequest](../../models/operations/DeleteClientRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.DeleteClientResponse](../../models/operations/DeleteClientResponse.md)**


## deleteSecret

Delete a secret from a client

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteSecretRequest;
import com.formance.formance_sdk.models.operations.DeleteSecretResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            DeleteSecretRequest req = new DeleteSecretRequest("string", "string");            

            DeleteSecretResponse res = sdk.auth.deleteSecret(req);

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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.DeleteSecretRequest](../../models/operations/DeleteSecretRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.DeleteSecretResponse](../../models/operations/DeleteSecretResponse.md)**


## getServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetServerInfoResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetServerInfoResponse res = sdk.auth.getServerInfo();

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

**[com.formance.formance_sdk.models.operations.GetServerInfoResponse](../../models/operations/GetServerInfoResponse.md)**


## listClients

List clients

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListClientsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ListClientsResponse res = sdk.auth.listClients();

            if (res.listClientsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListClientsResponse](../../models/operations/ListClientsResponse.md)**


## listUsers

List users

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListUsersResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ListUsersResponse res = sdk.auth.listUsers();

            if (res.listUsersResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListUsersResponse](../../models/operations/ListUsersResponse.md)**


## readClient

Read client

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadClientRequest;
import com.formance.formance_sdk.models.operations.ReadClientResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ReadClientRequest req = new ReadClientRequest("string");            

            ReadClientResponse res = sdk.auth.readClient(req);

            if (res.readClientResponse != null) {
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
| `request`                                                                                                     | [com.formance.formance_sdk.models.operations.ReadClientRequest](../../models/operations/ReadClientRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.ReadClientResponse](../../models/operations/ReadClientResponse.md)**


## readUser

Read user

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadUserRequest;
import com.formance.formance_sdk.models.operations.ReadUserResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            ReadUserRequest req = new ReadUserRequest("string");            

            ReadUserResponse res = sdk.auth.readUser(req);

            if (res.readUserResponse != null) {
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
| `request`                                                                                                 | [com.formance.formance_sdk.models.operations.ReadUserRequest](../../models/operations/ReadUserRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |


### Response

**[com.formance.formance_sdk.models.operations.ReadUserResponse](../../models/operations/ReadUserResponse.md)**


## updateClient

Update client

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UpdateClientRequest;
import com.formance.formance_sdk.models.operations.UpdateClientResponse;
import com.formance.formance_sdk.models.shared.UpdateClientRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            UpdateClientRequest req = new UpdateClientRequest("string"){{
                updateClientRequest = new UpdateClientRequest("string"){{
                    description = "Secured static model";
                    metadata = new java.util.HashMap<String, Object>(){{
                        put("key", "string");
                    }};
                    postLogoutRedirectUris = new String[]{{
                        add("string"),
                    }};
                    public_ = false;
                    redirectUris = new String[]{{
                        add("string"),
                    }};
                    scopes = new String[]{{
                        add("string"),
                    }};
                    trusted = false;
                }};
            }};            

            UpdateClientResponse res = sdk.auth.updateClient(req);

            if (res.updateClientResponse != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.UpdateClientRequest](../../models/operations/UpdateClientRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.UpdateClientResponse](../../models/operations/UpdateClientResponse.md)**

