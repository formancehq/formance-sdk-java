# ~~Search.V1~~

> [!WARNING]
> This SDK is **DEPRECATED**

## Overview

### Available Operations

* [~~getServerInfoSearch~~](#getserverinfosearch) - Get server info :warning: **Deprecated**
* [~~search~~](#search) - search.v1 :warning: **Deprecated**

## ~~getServerInfoSearch~~

Get server info

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerInfo_search" method="get" path="/api/search/_info" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetServerInfoSearchResponse;
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

        GetServerInfoSearchResponse res = sdk.search().v1().getServerInfoSearch()
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

**[GetServerInfoSearchResponse](../../models/operations/GetServerInfoSearchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~search~~

Elasticsearch.v1 query engine

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="search" method="post" path="/api/search/" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SearchResponse;
import com.formance.formance_sdk.models.search.Query;
import com.formance.formance_sdk.models.search.Raw;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        Query req = Query.builder()
                .after(List.of(
                    "users:002"))
                .cursor("YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=")
                .ledgers(List.of(
                    "quickstart"))
                .policy("OR")
                .raw(Raw.builder()
                    .build())
                .sort("id:asc")
                .terms(List.of(
                    "destination=central_bank1"))
                .build();

        SearchResponse res = sdk.search().v1().search()
                .request(req)
                .call();

        if (res.response().isPresent()) {
            System.out.println(res.response().get());
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Query](../../models/shared/Query.md)      | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[SearchResponse](../../models/operations/SearchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |