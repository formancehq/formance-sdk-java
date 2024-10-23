# SDKReconciliationV1
(*reconciliation().v1()*)

## Overview

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
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.CreatePolicyResponse;
import com.formance.formance_sdk.models.shared.PolicyRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        PolicyRequest req = PolicyRequest.builder()
                .ledgerName("default")
                .ledgerQuery(Map.ofEntries(
                    Map.entry("key", "<value>")))
                .name("XXX")
                .paymentsPoolID("XXX")
                .build();

        CreatePolicyResponse res = sdk.reconciliation().v1().createPolicy()
                .request(req)
                .call();

        if (res.policyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [PolicyRequest](../../models/shared/PolicyRequest.md) | :heavy_check_mark:                                    | The request object to use for the request.            |

### Response

**[CreatePolicyResponse](../../models/operations/CreatePolicyResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## deletePolicy

Delete a policy by its id.

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.DeletePolicyRequest;
import com.formance.formance_sdk.models.operations.DeletePolicyResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        DeletePolicyRequest req = DeletePolicyRequest.builder()
                .policyID("XXX")
                .build();

        DeletePolicyResponse res = sdk.reconciliation().v1().deletePolicy()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeletePolicyRequest](../../models/operations/DeletePolicyRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeletePolicyResponse](../../models/operations/DeletePolicyResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getPolicy

Get a policy

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.GetPolicyRequest;
import com.formance.formance_sdk.models.operations.GetPolicyResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetPolicyRequest req = GetPolicyRequest.builder()
                .policyID("XXX")
                .build();

        GetPolicyResponse res = sdk.reconciliation().v1().getPolicy()
                .request(req)
                .call();

        if (res.policyResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetPolicyRequest](../../models/operations/GetPolicyRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetPolicyResponse](../../models/operations/GetPolicyResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getReconciliation

Get a reconciliation

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.GetReconciliationRequest;
import com.formance.formance_sdk.models.operations.GetReconciliationResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        GetReconciliationRequest req = GetReconciliationRequest.builder()
                .reconciliationID("XXX")
                .build();

        GetReconciliationResponse res = sdk.reconciliation().v1().getReconciliation()
                .request(req)
                .call();

        if (res.reconciliationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetReconciliationRequest](../../models/operations/GetReconciliationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetReconciliationResponse](../../models/operations/GetReconciliationResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listPolicies

List policies

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.ListPoliciesRequest;
import com.formance.formance_sdk.models.operations.ListPoliciesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListPoliciesRequest req = ListPoliciesRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListPoliciesResponse res = sdk.reconciliation().v1().listPolicies()
                .request(req)
                .call();

        if (res.policiesCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListPoliciesRequest](../../models/operations/ListPoliciesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListPoliciesResponse](../../models/operations/ListPoliciesResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## listReconciliations

List reconciliations

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.ListReconciliationsRequest;
import com.formance.formance_sdk.models.operations.ListReconciliationsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ListReconciliationsRequest req = ListReconciliationsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListReconciliationsResponse res = sdk.reconciliation().v1().listReconciliations()
                .request(req)
                .call();

        if (res.reconciliationsCursorResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListReconciliationsRequest](../../models/operations/ListReconciliationsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListReconciliationsResponse](../../models/operations/ListReconciliationsResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## reconcile

Reconcile using a policy

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.ReconcileRequest;
import com.formance.formance_sdk.models.operations.ReconcileResponse;
import com.formance.formance_sdk.models.shared.ReconciliationRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ReconcileRequest req = ReconcileRequest.builder()
                .reconciliationRequest(ReconciliationRequest.builder()
                    .reconciledAtLedger(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .reconciledAtPayments(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                    .build())
                .policyID("XXX")
                .build();

        ReconcileResponse res = sdk.reconciliation().v1().reconcile()
                .request(req)
                .call();

        if (res.reconciliationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ReconcileRequest](../../models/operations/ReconcileRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ReconcileResponse](../../models/operations/ReconcileResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## reconciliationgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.ReconciliationErrorResponse;
import com.formance.formance_sdk.models.operations.ReconciliationgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ReconciliationErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        ReconciliationgetServerInfoResponse res = sdk.reconciliation().v1().reconciliationgetServerInfo()
                .call();

        if (res.serverInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ReconciliationgetServerInfoResponse](../../models/operations/ReconciliationgetServerInfoResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |