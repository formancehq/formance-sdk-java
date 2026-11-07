# SDK

## Overview

Formance Stack API: Open, modular foundation for unique payments flows

# Introduction
This API is documented in **OpenAPI format**.

# Authentication
Formance Stack offers one forms of authentication:
  - OAuth2
OAuth2 - an open protocol to allow secure authorization in a simple
and standard method from web, mobile and desktop applications.
<SecurityDefinitions />


### Available Operations

* [getVersions](#getversions) - Show stack version information

## getVersions

Show stack version information

### Example Usage

<!-- UsageSnippet language="java" operationID="getVersions" method="get" path="/versions" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
            .build();

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            System.out.println(res.getVersionsResponse().get());
        }
    }
}
```

### Response

**[GetVersionsResponse](../../models/operations/GetVersionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |