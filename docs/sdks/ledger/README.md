# Ledger
(*ledger()*)

## Overview

### Available Operations

* [getInfo](#getinfo) - Show server information
* [getMetrics](#getmetrics) - Read in memory metrics

## getInfo

Show server information

### Example Usage

<!-- UsageSnippet language="java" operationID="v2GetInfo" method="get" path="/api/ledger/_/info" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.V2GetInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        V2GetInfoResponse res = sdk.ledger().getInfo()
                .call();

        if (res.v2ConfigInfoResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V2GetInfoResponse](../../models/operations/V2GetInfoResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |

## getMetrics

Read in memory metrics

### Example Usage

<!-- UsageSnippet language="java" operationID="getMetrics" method="get" path="/api/ledger/_/metrics" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2ErrorResponse;
import com.formance.formance_sdk.models.operations.GetMetricsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2ErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetMetricsResponse res = sdk.ledger().getMetrics()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetMetricsResponse](../../models/operations/GetMetricsResponse.md)**

### Errors

| Error Type                    | Status Code                   | Content Type                  |
| ----------------------------- | ----------------------------- | ----------------------------- |
| models/errors/V2ErrorResponse | default                       | application/json              |
| models/errors/SDKError        | 4XX, 5XX                      | \*/\*                         |