<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetVersionsResponse;
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

        GetVersionsResponse res = sdk.getVersions()
                .call();

        if (res.getVersionsResponse().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->