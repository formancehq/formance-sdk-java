# Reconciliation
(*reconciliation*)

### Available Operations

* [createPolicy](#createpolicy) - Create a policy
* [deletePolicy](#deletepolicy) - Delete a policy
* [getPolicy](#getpolicy) - Get a policy
* [getReconciliation](#getreconciliation) - Get a reconciliation
* [listPolicies](#listpolicies) - List policies
* [listReconciliations](#listreconciliations) - List reconciliations
* [reconcile](#reconcile) - Reconcile using a policy
* [reconciliationgetServerInfo](#reconciliationgetserverinfo) - Get server info

## createPolicy

Create a policy

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreatePolicyResponse;
import com.formance.formance_sdk.models.shared.PolicyRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.shared.PolicyRequest req = new PolicyRequest(
                "default",
                new java.util.HashMap<String, Object>(
                ){{
                    put("key", "string");
                }},
                "XXX",
                "XXX");

            com.formance.formance_sdk.models.operations.CreatePolicyResponse res = sdk.reconciliation.createPolicy(req);

            if (res.policyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [com.formance.formance_sdk.models.shared.PolicyRequest](../../models/shared/PolicyRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[com.formance.formance_sdk.models.operations.CreatePolicyResponse](../../models/operations/CreatePolicyResponse.md)**


## deletePolicy

Delete a policy by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeletePolicyRequest;
import com.formance.formance_sdk.models.operations.DeletePolicyResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.DeletePolicyRequest req = new DeletePolicyRequest(
                "string");

            com.formance.formance_sdk.models.operations.DeletePolicyResponse res = sdk.reconciliation.deletePolicy(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.DeletePolicyRequest](../../models/operations/DeletePolicyRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.DeletePolicyResponse](../../models/operations/DeletePolicyResponse.md)**


## getPolicy

Get a policy

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetPolicyRequest;
import com.formance.formance_sdk.models.operations.GetPolicyResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetPolicyRequest req = new GetPolicyRequest(
                "string");

            com.formance.formance_sdk.models.operations.GetPolicyResponse res = sdk.reconciliation.getPolicy(req);

            if (res.policyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.GetPolicyRequest](../../models/operations/GetPolicyRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.GetPolicyResponse](../../models/operations/GetPolicyResponse.md)**


## getReconciliation

Get a reconciliation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetReconciliationRequest;
import com.formance.formance_sdk.models.operations.GetReconciliationResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.GetReconciliationRequest req = new GetReconciliationRequest(
                "string");

            com.formance.formance_sdk.models.operations.GetReconciliationResponse res = sdk.reconciliation.getReconciliation(req);

            if (res.reconciliationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [com.formance.formance_sdk.models.operations.GetReconciliationRequest](../../models/operations/GetReconciliationRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.GetReconciliationResponse](../../models/operations/GetReconciliationResponse.md)**


## listPolicies

List policies

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListPoliciesRequest;
import com.formance.formance_sdk.models.operations.ListPoliciesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListPoliciesRequest req = new ListPoliciesRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 520028L;

            }};

            com.formance.formance_sdk.models.operations.ListPoliciesResponse res = sdk.reconciliation.listPolicies(req);

            if (res.policiesCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.ListPoliciesRequest](../../models/operations/ListPoliciesRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListPoliciesResponse](../../models/operations/ListPoliciesResponse.md)**


## listReconciliations

List reconciliations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListReconciliationsRequest;
import com.formance.formance_sdk.models.operations.ListReconciliationsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ListReconciliationsRequest req = new ListReconciliationsRequest(
){{
                cursor = "aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==";
                pageSize = 954636L;

            }};

            com.formance.formance_sdk.models.operations.ListReconciliationsResponse res = sdk.reconciliation.listReconciliations(req);

            if (res.reconciliationsCursorResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.ListReconciliationsRequest](../../models/operations/ListReconciliationsRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ListReconciliationsResponse](../../models/operations/ListReconciliationsResponse.md)**


## reconcile

Reconcile using a policy

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReconcileRequest;
import com.formance.formance_sdk.models.operations.ReconcileResponse;
import com.formance.formance_sdk.models.shared.ReconciliationRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ReconcileRequest req = new ReconcileRequest(
                new ReconciliationRequest(
                    OffsetDateTime.parse("2021-01-01T00:00:00.000Z"),
                    OffsetDateTime.parse("2021-01-01T00:00:00.000Z")),
                "string");

            com.formance.formance_sdk.models.operations.ReconcileResponse res = sdk.reconciliation.reconcile(req);

            if (res.reconciliationResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.ReconcileRequest](../../models/operations/ReconcileRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.ReconcileResponse](../../models/operations/ReconcileResponse.md)**


## reconciliationgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReconciliationgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    authorization = "Bearer <YOUR_ACCESS_TOKEN_HERE>";
                }})
                .build();

            com.formance.formance_sdk.models.operations.ReconciliationgetServerInfoResponse res = sdk.reconciliation.reconciliationgetServerInfo();

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

**[com.formance.formance_sdk.models.operations.ReconciliationgetServerInfoResponse](../../models/operations/ReconciliationgetServerInfoResponse.md)**

