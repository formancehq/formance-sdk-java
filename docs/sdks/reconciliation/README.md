# Reconciliation
(*reconciliation()*)

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

            PolicyRequest req = PolicyRequest.builder()
                .ledgerName("default")
                .ledgerQuery(java.util.Map.ofEntries(
                        entry("key", "<value>")))
                .name("XXX")
                .paymentsPoolID("XXX")
                .build();

            CreatePolicyResponse res = sdk.reconciliation().createPolicy()
                .request(req)
                .call();

            if (res.policyResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [com.formance.formance_sdk.models.shared.PolicyRequest](../../models/shared/PolicyRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[com.formance.formance_sdk.models.operations.CreatePolicyResponse](../../models/operations/CreatePolicyResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## deletePolicy

Delete a policy by its id.

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

            DeletePolicyRequest req = DeletePolicyRequest.builder()
                .policyID("XXX")
                .build();

            DeletePolicyResponse res = sdk.reconciliation().deletePolicy()
                .request(req)
                .call();

            // handle response
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.DeletePolicyRequest](../../models/operations/DeletePolicyRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.DeletePolicyResponse](../../models/operations/DeletePolicyResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## getPolicy

Get a policy

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

            GetPolicyRequest req = GetPolicyRequest.builder()
                .policyID("XXX")
                .build();

            GetPolicyResponse res = sdk.reconciliation().getPolicy()
                .request(req)
                .call();

            if (res.policyResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.GetPolicyRequest](../../models/operations/GetPolicyRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.GetPolicyResponse](../../models/operations/GetPolicyResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## getReconciliation

Get a reconciliation

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

            GetReconciliationRequest req = GetReconciliationRequest.builder()
                .reconciliationID("XXX")
                .build();

            GetReconciliationResponse res = sdk.reconciliation().getReconciliation()
                .request(req)
                .call();

            if (res.reconciliationResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [com.formance.formance_sdk.models.operations.GetReconciliationRequest](../../models/operations/GetReconciliationRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.GetReconciliationResponse](../../models/operations/GetReconciliationResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## listPolicies

List policies

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

            ListPoliciesRequest req = ListPoliciesRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            ListPoliciesResponse res = sdk.reconciliation().listPolicies()
                .request(req)
                .call();

            if (res.policiesCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [com.formance.formance_sdk.models.operations.ListPoliciesRequest](../../models/operations/ListPoliciesRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.ListPoliciesResponse](../../models/operations/ListPoliciesResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## listReconciliations

List reconciliations

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

            ListReconciliationsRequest req = ListReconciliationsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

            ListReconciliationsResponse res = sdk.reconciliation().listReconciliations()
                .request(req)
                .call();

            if (res.reconciliationsCursorResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [com.formance.formance_sdk.models.operations.ListReconciliationsRequest](../../models/operations/ListReconciliationsRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ListReconciliationsResponse](../../models/operations/ListReconciliationsResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## reconcile

Reconcile using a policy

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

            ReconcileRequest req = ReconcileRequest.builder()
                .reconciliationRequest(ReconciliationRequest.builder()
                        .reconciledAtLedger(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                        .reconciledAtPayments(OffsetDateTime.parse("2021-01-01T00:00:00.000Z"))
                        .build())
                .policyID("XXX")
                .build();

            ReconcileResponse res = sdk.reconciliation().reconcile()
                .request(req)
                .call();

            if (res.reconciliationResponse().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.ReconcileRequest](../../models/operations/ReconcileRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.ReconcileResponse](../../models/operations/ReconcileResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## reconciliationgetServerInfo

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

            ReconciliationgetServerInfoResponse res = sdk.reconciliation().reconciliationgetServerInfo()
                .call();

            if (res.serverInfo().isPresent()) {
                // handle response
            }
        } catch (com.formance.formance_sdk.models.errors.ReconciliationErrorResponse e) {
            // handle exception
            throw e;
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

**[com.formance.formance_sdk.models.operations.ReconciliationgetServerInfoResponse](../../models/operations/ReconciliationgetServerInfoResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/ReconciliationErrorResponse | default                                   | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |
