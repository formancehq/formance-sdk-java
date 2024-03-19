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
* [getApiAuthWellKnownOpenidConfiguration](#getapiauthwellknownopenidconfiguration)

## getVersions

Show stack version information

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("Bearer <YOUR_ACCESS_TOKEN_HERE>")
                    .build())
                .build();

            GetVersionsResponse res = sdk.getVersions()
                .call();

            if (res.getVersionsResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.GetVersionsResponse>](../../models/operations/GetVersionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getApiAuthWellKnownOpenidConfiguration

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.*;
import com.formance.formance_sdk.models.operations.GetApiAuthWellKnownOpenidConfigurationResponse;
import com.formance.formance_sdk.models.shared.*;
import com.formance.formance_sdk.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .authorization("Bearer <YOUR_ACCESS_TOKEN_HERE>")
                    .build())
                .build();

            GetApiAuthWellKnownOpenidConfigurationResponse res = sdk.getApiAuthWellKnownOpenidConfiguration()
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.formance.formance_sdk.models.operations.GetApiAuthWellKnownOpenidConfigurationResponse>](../../models/operations/GetApiAuthWellKnownOpenidConfigurationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
