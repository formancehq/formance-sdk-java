# Connectivity.V1

## Overview

### Available Operations

* [connectivityInfo](#connectivityinfo) - Build information
* [createConnection](#createconnection) - Create a Connection
* [deleteConnection](#deleteconnection) - Delete a Connection
* [getConnection](#getconnection) - Get a Connection
* [getConnector](#getconnector) - Get a Connector (lean connector metadata)
* [getConnectorFacets](#getconnectorfacets) - Facet-value distribution over the published catalogue
* [getConnectorVersion](#getconnectorversion) - Get one Connector version (including its configSchema and additionalMetadata)
* [getQueryCapabilities](#getquerycapabilities) - The filterable keys, operators and value enums per resource
* [healthcheck](#healthcheck) - Health probe
* [listConnections](#listconnections) - List connector instances for this tenant
* [listConnectorVersions](#listconnectorversions) - List the installable versions of a Connector
* [listConnectors](#listconnectors) - List published Connectors with their catalogue identity
* [patchConnection](#patchconnection) - Merge-patch a connector instance configuration
* [replaceConnection](#replaceconnection) - Replace a connector instance configuration

## connectivityInfo

Version probe used by the stack gateway to report this module in the
`/versions` aggregation. Response shape follows the platform-wide
ServiceInfo contract.


### Example Usage

<!-- UsageSnippet language="java" operationID="connectivityInfo" method="get" path="/api/connectivity/_info" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.ConnectivityInfoResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ConnectivityInfoResponse res = sdk.connectivity().v1().connectivityInfo()
                .call();

        if (res.info().isPresent()) {
            System.out.println(res.info().get());
        }
    }
}
```

### Response

**[ConnectivityInfoResponse](../../models/operations/ConnectivityInfoResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## createConnection

Creates a new `Connection` in the caller's environment.
`configuration.connector`, `configuration.ledger` and exactly one of `configuration.version` or
`configuration.channel` are required. `env` and `files` are string key/value maps;
properties marked `format: password` by the selected connector schema
are stored confidentially and omitted from read responses.
Storage metadata and configuration references are rejected on input.
A field outside the tenant contract,
including unsupported instance fields such as `image`, `additionalEnv`,
`additionalFiles` or `replicas`, is rejected with
`400 unsupported_field`.


### Example Usage: channel

<!-- UsageSnippet language="java" operationID="createConnection" method="post" path="/api/connectivity/connections" example="channel" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.*;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.CreateConnectionResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ConnectionCreate req = ConnectionCreate.builder()
                .configuration(ConnectionCreateConfiguration.builder()
                    .connector("stripe")
                    .ledger("main")
                    .channel(ConnectionCreateChannel.STABLE)
                    .env(Map.ofEntries(
                        Map.entry("STRIPE_API_KEY", "<your-api-key>")))
                    .pollInterval("30s")
                    .build())
                .name("stripe-main")
                .build();

        CreateConnectionResponse res = sdk.connectivity().v1().createConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```
### Example Usage: version

<!-- UsageSnippet language="java" operationID="createConnection" method="post" path="/api/connectivity/connections" example="version" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.*;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.CreateConnectionResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ConnectionCreate req = ConnectionCreate.builder()
                .configuration(ConnectionCreateConfiguration.builder()
                    .connector("bitcoin")
                    .ledger("btc")
                    .env(Map.ofEntries(
                        Map.entry("RPC_URL", "http://bitcoind:8332")))
                    .files(Map.ofEntries(
                        Map.entry("/etc/bitcoin/ca.pem", "<PEM certificate content>")))
                    .initialCursor("AAAAAAAAA+g=")
                    .version("v1.4.2")
                    .build())
                .name("bitcoin-main")
                .build();

        CreateConnectionResponse res = sdk.connectivity().v1().createConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [ConnectionCreate](../../models/shared/ConnectionCreate.md)                                                                 | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.CreateConnectionSecurity](../../models/operations/CreateConnectionSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[CreateConnectionResponse](../../models/operations/CreateConnectionResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## deleteConnection

Delete a Connection

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteConnection" method="delete" path="/api/connectivity/connections/{name}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.DeleteConnectionRequest;
import com.formance.formance_sdk.models.operations.DeleteConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        DeleteConnectionRequest req = DeleteConnectionRequest.builder()
                .name("<value>")
                .build();

        DeleteConnectionResponse res = sdk.connectivity().v1().deleteConnection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [DeleteConnectionRequest](../../models/operations/DeleteConnectionRequest.md)                                               | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `security`                                                                                                                  | [com.formance.formance_sdk.models.operations.DeleteConnectionSecurity](../../models/operations/DeleteConnectionSecurity.md) | :heavy_check_mark:                                                                                                          | The security requirements to use for the request.                                                                           |

### Response

**[DeleteConnectionResponse](../../models/operations/DeleteConnectionResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## getConnection

Get a Connection

### Example Usage

<!-- UsageSnippet language="java" operationID="getConnection" method="get" path="/api/connectivity/connections/{name}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.GetConnectionRequest;
import com.formance.formance_sdk.models.operations.GetConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetConnectionRequest req = GetConnectionRequest.builder()
                .name("<value>")
                .build();

        GetConnectionResponse res = sdk.connectivity().v1().getConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [GetConnectionRequest](../../models/operations/GetConnectionRequest.md)                                               | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |
| `security`                                                                                                            | [com.formance.formance_sdk.models.operations.GetConnectionSecurity](../../models/operations/GetConnectionSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |

### Response

**[GetConnectionResponse](../../models/operations/GetConnectionResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## getConnector

Get a Connector (lean connector metadata)

### Example Usage

<!-- UsageSnippet language="java" operationID="getConnector" method="get" path="/api/connectivity/connectors/{name}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.GetConnectorRequest;
import com.formance.formance_sdk.models.operations.GetConnectorResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetConnectorRequest req = GetConnectorRequest.builder()
                .name("<value>")
                .build();

        GetConnectorResponse res = sdk.connectivity().v1().getConnector()
                .request(req)
                .call();

        if (res.connector().isPresent()) {
            System.out.println(res.connector().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [GetConnectorRequest](../../models/operations/GetConnectorRequest.md)                                               | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |
| `security`                                                                                                          | [com.formance.formance_sdk.models.operations.GetConnectorSecurity](../../models/operations/GetConnectorSecurity.md) | :heavy_check_mark:                                                                                                  | The security requirements to use for the request.                                                                   |

### Response

**[GetConnectorResponse](../../models/operations/GetConnectorResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## getConnectorFacets

Counts distinct published `Connector`s per `facet:value` tag (split on
the first `:`; flat tags carry no facet and are excluded), narrowed by
the same `query` filter as the list. `_facets` can never collide with
a connector: names are DNS labels, which cannot contain `_`.


### Example Usage

<!-- UsageSnippet language="java" operationID="getConnectorFacets" method="get" path="/api/connectivity/connectors/_facets" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.GetConnectorFacetsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetConnectorFacetsResponse res = sdk.connectivity().v1().getConnectorFacets()
                .call();

        if (res.facetDistribution().isPresent()) {
            System.out.println(res.facetDistribution().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [GetConnectorFacetsRequest](../../models/operations/GetConnectorFacetsRequest.md)                                               | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `security`                                                                                                                      | [com.formance.formance_sdk.models.operations.GetConnectorFacetsSecurity](../../models/operations/GetConnectorFacetsSecurity.md) | :heavy_check_mark:                                                                                                              | The security requirements to use for the request.                                                                               |

### Response

**[GetConnectorFacetsResponse](../../models/operations/GetConnectorFacetsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## getConnectorVersion

Get one Connector version (including its configSchema and additionalMetadata)

### Example Usage

<!-- UsageSnippet language="java" operationID="getConnectorVersion" method="get" path="/api/connectivity/connectors/{name}/versions/{version}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.GetConnectorVersionRequest;
import com.formance.formance_sdk.models.operations.GetConnectorVersionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetConnectorVersionRequest req = GetConnectorVersionRequest.builder()
                .name("<value>")
                .version("<value>")
                .build();

        GetConnectorVersionResponse res = sdk.connectivity().v1().getConnectorVersion()
                .request(req)
                .call();

        if (res.connectorVersion().isPresent()) {
            System.out.println(res.connectorVersion().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [GetConnectorVersionRequest](../../models/operations/GetConnectorVersionRequest.md)                                               | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |
| `security`                                                                                                                        | [com.formance.formance_sdk.models.operations.GetConnectorVersionSecurity](../../models/operations/GetConnectorVersionSecurity.md) | :heavy_check_mark:                                                                                                                | The security requirements to use for the request.                                                                                 |

### Response

**[GetConnectorVersionResponse](../../models/operations/GetConnectorVersionResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## getQueryCapabilities

Serialized from the same allowlist the server enforces on `?query=`,
so a UI can build its filter bar dynamically and never drift from
what the API accepts.


### Example Usage

<!-- UsageSnippet language="java" operationID="getQueryCapabilities" method="get" path="/api/connectivity/_query/capabilities" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.GetQueryCapabilitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetQueryCapabilitiesResponse res = sdk.connectivity().v1().getQueryCapabilities()
                .call();

        if (res.queryCapabilities().isPresent()) {
            System.out.println(res.queryCapabilities().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                          | [com.formance.formance_sdk.models.operations.GetQueryCapabilitiesSecurity](../../models/operations/GetQueryCapabilitiesSecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |

### Response

**[GetQueryCapabilitiesResponse](../../models/operations/GetQueryCapabilitiesResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## healthcheck

Single health endpoint, probed by the stack gateway for the `/versions`
aggregation and by service readiness/liveness probes. Ready
means the service can reach its storage dependency.


### Example Usage

<!-- UsageSnippet language="java" operationID="healthcheck" method="get" path="/api/connectivity/_healthcheck" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.connectivity.HealthException;
import com.formance.formance_sdk.models.operations.HealthcheckResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws HealthException, Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        HealthcheckResponse res = sdk.connectivity().v1().healthcheck()
                .call();

        if (res.health().isPresent()) {
            System.out.println(res.health().get());
        }
    }
}
```

### Response

**[HealthcheckResponse](../../models/operations/HealthcheckResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/HealthException | 500                           | application/json              |
| models/errors/Error           | 4XX                           | application/json              |
| models/errors/Error           | 5XX                           | application/json              |

## listConnections

List connector instances for this tenant

### Example Usage

<!-- UsageSnippet language="java" operationID="listConnections" method="get" path="/api/connectivity/connections" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.ListConnectionsRequest;
import com.formance.formance_sdk.models.operations.ListConnectionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ListConnectionsRequest req = ListConnectionsRequest.builder()
                .build();

        ListConnectionsResponse res = sdk.connectivity().v1().listConnections()
                .request(req)
                .call();

        if (res.connectionCursor().isPresent()) {
            System.out.println(res.connectionCursor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [ListConnectionsRequest](../../models/operations/ListConnectionsRequest.md)                                               | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.formance.formance_sdk.models.operations.ListConnectionsSecurity](../../models/operations/ListConnectionsSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |

### Response

**[ListConnectionsResponse](../../models/operations/ListConnectionsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## listConnectorVersions

Returns the `ConnectorVersion`s published for this Connector, sorted
ascending by semantic version. Use `configuration.version` to pin a Connection,
or `configuration.channel` to track a maturity channel.


### Example Usage

<!-- UsageSnippet language="java" operationID="listConnectorVersions" method="get" path="/api/connectivity/connectors/{name}/versions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.ListConnectorVersionsRequest;
import com.formance.formance_sdk.models.operations.ListConnectorVersionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ListConnectorVersionsRequest req = ListConnectorVersionsRequest.builder()
                .name("<value>")
                .build();

        ListConnectorVersionsResponse res = sdk.connectivity().v1().listConnectorVersions()
                .request(req)
                .call();

        if (res.connectorVersionCursor().isPresent()) {
            System.out.println(res.connectorVersionCursor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                             | Type                                                                                                                                  | Required                                                                                                                              | Description                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                             | [ListConnectorVersionsRequest](../../models/operations/ListConnectorVersionsRequest.md)                                               | :heavy_check_mark:                                                                                                                    | The request object to use for the request.                                                                                            |
| `security`                                                                                                                            | [com.formance.formance_sdk.models.operations.ListConnectorVersionsSecurity](../../models/operations/ListConnectorVersionsSecurity.md) | :heavy_check_mark:                                                                                                                    | The security requirements to use for the request.                                                                                     |

### Response

**[ListConnectorVersionsResponse](../../models/operations/ListConnectorVersionsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## listConnectors

Returns the published `Connector`s, each carrying the identity of its
newest Validated version (branding, tagline, tags, `latestVersion`) so
a catalogue UI renders and filters from this single request.


### Example Usage

<!-- UsageSnippet language="java" operationID="listConnectors" method="get" path="/api/connectivity/connectors" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.ListConnectorsRequest;
import com.formance.formance_sdk.models.operations.ListConnectorsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ListConnectorsRequest req = ListConnectorsRequest.builder()
                .build();

        ListConnectorsResponse res = sdk.connectivity().v1().listConnectors()
                .request(req)
                .call();

        if (res.connectorCursor().isPresent()) {
            System.out.println(res.connectorCursor().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [ListConnectorsRequest](../../models/operations/ListConnectorsRequest.md)                                               | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [com.formance.formance_sdk.models.operations.ListConnectorsSecurity](../../models/operations/ListConnectorsSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |

### Response

**[ListConnectorsResponse](../../models/operations/ListConnectorsResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## patchConnection

JSON merge patch (RFC 7396) over tenant `configuration` fields only. Other fields
are rejected with `400 unsupported_field`. `env` and `files` are string
maps: omitted entries are preserved, including secret-backed values;
`null` deletes a field or map entry. A supplied literal replaces the
stored source. `connector` and `ledger` are not PATCH fields: any presence, including
unchanged values and null, returns `400 unsupported_field`. The merged
result must retain exactly one of `version` and `channel`, so
switching selectors sends `null` for the other one.


### Example Usage: rotatePassword

<!-- UsageSnippet language="java" operationID="patchConnection" method="patch" path="/api/connectivity/connections/{name}" example="rotatePassword" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.*;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.PatchConnectionRequest;
import com.formance.formance_sdk.models.operations.PatchConnectionResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        PatchConnectionRequest req = PatchConnectionRequest.builder()
                .connectionPatch(ConnectionPatch.builder()
                    .configuration(ConnectionPatchConfiguration.builder()
                        .env(Map.ofEntries(
                            Map.entry("STRIPE_API_KEY", "<new-api-key>")))
                        .build())
                    .build())
                .name("<value>")
                .build();

        PatchConnectionResponse res = sdk.connectivity().v1().patchConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```
### Example Usage: suspend

<!-- UsageSnippet language="java" operationID="patchConnection" method="patch" path="/api/connectivity/connections/{name}" example="suspend" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.*;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.PatchConnectionRequest;
import com.formance.formance_sdk.models.operations.PatchConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        PatchConnectionRequest req = PatchConnectionRequest.builder()
                .connectionPatch(ConnectionPatch.builder()
                    .configuration(ConnectionPatchConfiguration.builder()
                        .suspend(true)
                        .build())
                    .build())
                .name("<value>")
                .build();

        PatchConnectionResponse res = sdk.connectivity().v1().patchConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```
### Example Usage: switchToChannel

<!-- UsageSnippet language="java" operationID="patchConnection" method="patch" path="/api/connectivity/connections/{name}" example="switchToChannel" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.*;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.PatchConnectionRequest;
import com.formance.formance_sdk.models.operations.PatchConnectionResponse;
import java.lang.Exception;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        PatchConnectionRequest req = PatchConnectionRequest.builder()
                .connectionPatch(ConnectionPatch.builder()
                    .configuration(ConnectionPatchConfiguration.builder()
                        .channel(ConnectionPatchChannel.STABLE)
                        .version(JsonNullable.of(null))
                        .build())
                    .build())
                .name("<value>")
                .build();

        PatchConnectionResponse res = sdk.connectivity().v1().patchConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [PatchConnectionRequest](../../models/operations/PatchConnectionRequest.md)                                               | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |
| `security`                                                                                                                | [com.formance.formance_sdk.models.operations.PatchConnectionSecurity](../../models/operations/PatchConnectionSecurity.md) | :heavy_check_mark:                                                                                                        | The security requirements to use for the request.                                                                         |

### Response

**[PatchConnectionResponse](../../models/operations/PatchConnectionResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |

## replaceConnection

Full-replace semantics on mutable tenant `configuration`: omitted mutable
fields are cleared. The API does not write fields outside its tenant scope.
`status` is preserved. `connector` and `ledger` are immutable once set:
omission preserves them, first assignment and unchanged values are accepted,
and changes or null return `422 connector_immutable` or `422 ledger_immutable`. Read responses omit reference-backed entries,
so PUT must supply the complete configuration, including required secrets.
Use PATCH to preserve omitted configuration. Fields outside the tenant contract are rejected with
`400 unsupported_field`.


### Example Usage

<!-- UsageSnippet language="java" operationID="replaceConnection" method="put" path="/api/connectivity/connections/{name}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.connectivity.*;
import com.formance.formance_sdk.models.connectivity.Error;
import com.formance.formance_sdk.models.operations.ReplaceConnectionRequest;
import com.formance.formance_sdk.models.operations.ReplaceConnectionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
            .build();

        ReplaceConnectionRequest req = ReplaceConnectionRequest.builder()
                .connectionUpdate(ConnectionUpdate.builder()
                    .configuration(ConnectionConfiguration.builder()
                        .build())
                    .build())
                .name("<value>")
                .build();

        ReplaceConnectionResponse res = sdk.connectivity().v1().replaceConnection()
                .request(req)
                .call();

        if (res.connection().isPresent()) {
            System.out.println(res.connection().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [ReplaceConnectionRequest](../../models/operations/ReplaceConnectionRequest.md)                                               | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |
| `security`                                                                                                                    | [com.formance.formance_sdk.models.operations.ReplaceConnectionSecurity](../../models/operations/ReplaceConnectionSecurity.md) | :heavy_check_mark:                                                                                                            | The security requirements to use for the request.                                                                             |

### Response

**[ReplaceConnectionResponse](../../models/operations/ReplaceConnectionResponse.md)**

### Errors

| Error Type          | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| models/errors/Error | 4XX                 | application/json    |
| models/errors/Error | 5XX                 | application/json    |