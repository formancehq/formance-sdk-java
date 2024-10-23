# SDKSearchV1
(*search().v1()*)

## Overview

### Available Operations

* [search](#search) - search.v1
* [searchgetServerInfo](#searchgetserverinfo) - Get server info

## search

Elasticsearch.v1 query engine

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SearchResponse;
import com.formance.formance_sdk.models.shared.Query;
import com.formance.formance_sdk.models.shared.QueryRaw;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        Query req = Query.builder()
                .after(List.of(
                    "users:002"))
                .cursor("YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=")
                .ledgers(List.of(
                    "quickstart"))
                .policy("OR")
                .raw(QueryRaw.builder()
                    .build())
                .sort("id:asc")
                .terms(List.of(
                    "destination=central_bank1"))
                .build();

        SearchResponse res = sdk.search().v1().search()
                .request(req)
                .call();

        if (res.response().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Query](../../models/shared/Query.md)      | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[SearchResponse](../../models/operations/SearchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## searchgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SearchgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        SearchgetServerInfoResponse res = sdk.search().v1().searchgetServerInfo()
                .call();

        if (res.serverInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[SearchgetServerInfoResponse](../../models/operations/SearchgetServerInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |