# Search
(*search*)

### Available Operations

* [search](#search) - Search
* [searchgetServerInfo](#searchgetserverinfo) - Get server info

## search

ElasticSearch query engine

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SearchResponse;
import com.formance.formance_sdk.models.shared.Query;
import com.formance.formance_sdk.models.shared.QueryRaw;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            com.formance.formance_sdk.models.shared.Query req = new Query(){{
                after = new String[]{{
                    add("u"),
                    add("s"),
                    add("e"),
                    add("r"),
                    add("s"),
                    add(":"),
                    add("0"),
                    add("0"),
                    add("2"),
                }};
                cursor = "YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=";
                ledgers = new String[]{{
                    add("q"),
                    add("u"),
                    add("i"),
                    add("c"),
                    add("k"),
                    add("s"),
                    add("t"),
                    add("a"),
                    add("r"),
                    add("t"),
                }};
                pageSize = 307631L;
                policy = "OR";
                raw = new QueryRaw();
                sort = "id:asc";
                target = "string";
                terms = new String[]{{
                    add("d"),
                    add("e"),
                    add("s"),
                    add("t"),
                    add("i"),
                    add("n"),
                    add("a"),
                    add("t"),
                    add("i"),
                    add("o"),
                    add("n"),
                    add("="),
                    add("c"),
                    add("e"),
                    add("n"),
                    add("t"),
                    add("r"),
                    add("a"),
                    add("l"),
                    add("_"),
                    add("b"),
                    add("a"),
                    add("n"),
                    add("k"),
                    add("1"),
                }};
            }};            

            SearchResponse res = sdk.search.search(req);

            if (res.response != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [com.formance.formance_sdk.models.shared.Query](../../models/shared/Query.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[com.formance.formance_sdk.models.operations.SearchResponse](../../models/operations/SearchResponse.md)**


## searchgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SearchgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            SearchgetServerInfoResponse res = sdk.search.searchgetServerInfo();

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

**[com.formance.formance_sdk.models.operations.SearchgetServerInfoResponse](../../models/operations/SearchgetServerInfoResponse.md)**

