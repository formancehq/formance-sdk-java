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
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            GetVersionsResponse res = sdk.sdk.getVersions();

            if (res.getVersionsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.GetVersionsResponse](../../models/operations/GetVersionsResponse.md)**


## getApiAuthWellKnownOpenidConfiguration

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetApiAuthWellKnownOpenidConfigurationResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            GetApiAuthWellKnownOpenidConfigurationResponse res = sdk.sdk.getApiAuthWellKnownOpenidConfiguration();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.GetApiAuthWellKnownOpenidConfigurationResponse](../../models/operations/GetApiAuthWellKnownOpenidConfigurationResponse.md)**

