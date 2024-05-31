# Search
(*search()*)

### Available Operations

* [search](#search) - Search
* [searchgetServerInfo](#searchgetserverinfo) - Get server info

## search

ElasticSearch query engine

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

            Query req = Query.builder()
                .after(java.util.List.of(
                    "users:002"))
                .cursor("YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol=")
                .ledgers(java.util.List.of(
                    "quickstart"))
                .policy("OR")
                .raw(QueryRaw.builder()
                    .build())
                .sort("id:asc")
                .terms(java.util.List.of(
                    "destination=central_bank1"))
                .build();

            SearchResponse res = sdk.search().search()
                .request(req)
                .call();

            if (res.response().isPresent()) {
                // handle response
            }
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

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [com.formance.formance_sdk.models.shared.Query](../../models/shared/Query.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.SearchResponse>](../../models/operations/SearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## searchgetServerInfo

Get server info

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

            SearchgetServerInfoResponse res = sdk.search().searchgetServerInfo()
                .call();

            if (res.serverInfo().isPresent()) {
                // handle response
            }
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


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.SearchgetServerInfoResponse>](../../models/operations/SearchgetServerInfoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
