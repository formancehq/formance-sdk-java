# Reconciliation.V1

## Overview

### Available Operations

* [acceptAlert](#acceptalert) - Accept an alert (accepted_by_business)
* [ackAlert](#ackalert) - Acknowledge an alert
* [createPolicy](#createpolicy) - Create a policy
* [createRule](#createrule) - Create a rule
* [deletePolicy](#deletepolicy) - Delete a policy
* [deleteRule](#deleterule) - Delete a rule (cascades to evaluations + alerts + alert events)
* [evaluateRule](#evaluaterule) - Evaluate a rule now
* [getAlert](#getalert) - Get an alert
* [getEvaluation](#getevaluation) - Get an evaluation
* [getPolicy](#getpolicy) - Get a policy
* [getReconciliation](#getreconciliation) - Get a reconciliation
* [getRule](#getrule) - Get a rule
* [getServerInfoReconciliation](#getserverinforeconciliation) - Get server info
* [listAlertEvents](#listalertevents) - List alert events (append-only timeline)
* [listAlerts](#listalerts) - List alerts
* [listEvaluations](#listevaluations) - List evaluations
* [listPolicies](#listpolicies) - List policies
* [listReconciliations](#listreconciliations) - List reconciliations
* [listRules](#listrules) - List rules
* [patchRule](#patchrule) - Patch a rule (partial update)
* [reconcile](#reconcile) - Reconcile using a policy
* [resolveAlert](#resolvealert) - Resolve an alert (fixed_by_booking)
* [snoozeAlert](#snoozealert) - Snooze an alert's notifications until a future instant
* [unsnoozeAlert](#unsnoozealert) - Lift a snooze early

## acceptAlert

Accept an alert (accepted_by_business)

### Example Usage

<!-- UsageSnippet language="java" operationID="acceptAlert" method="post" path="/api/reconciliation/alerts/{alertID}/accept" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.AcceptAlertResponse;
import com.formance.formance_sdk.models.reconciliation.AcceptAlertRequest;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.AcceptAlertRequest req = com.formance.formance_sdk.models.operations.AcceptAlertRequest.builder()
                .acceptAlertRequest(AcceptAlertRequest.builder()
                    .by("<value>")
                    .note("<value>")
                    .build())
                .alertID("5550ef95-072d-4bbb-9d3b-6a9dd307b2bd")
                .build();

        AcceptAlertResponse res = sdk.reconciliation().v1().acceptAlert()
                .request(req)
                .call();

        if (res.alertResponse().isPresent()) {
            System.out.println(res.alertResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [AcceptAlertRequest](../../models/operations/AcceptAlertRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[AcceptAlertResponse](../../models/operations/AcceptAlertResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## ackAlert

Acknowledge an alert

### Example Usage

<!-- UsageSnippet language="java" operationID="ackAlert" method="post" path="/api/reconciliation/alerts/{alertID}/ack" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.AckAlertResponse;
import com.formance.formance_sdk.models.reconciliation.AckAlertRequest;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.AckAlertRequest req = com.formance.formance_sdk.models.operations.AckAlertRequest.builder()
                .ackAlertRequest(AckAlertRequest.builder()
                    .by("ops@buildr.com")
                    .build())
                .alertID("5439ab64-6482-49fb-993f-3411bfe19fef")
                .build();

        AckAlertResponse res = sdk.reconciliation().v1().ackAlert()
                .request(req)
                .call();

        if (res.alertResponse().isPresent()) {
            System.out.println(res.alertResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [AckAlertRequest](../../models/operations/AckAlertRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[AckAlertResponse](../../models/operations/AckAlertResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## createPolicy

Create a policy

### Example Usage

<!-- UsageSnippet language="java" operationID="createPolicy" method="post" path="/api/reconciliation/policies" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreatePolicyResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.reconciliation.PolicyRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
            System.out.println(res.policyResponse().get());
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## createRule

Create a rule

### Example Usage

<!-- UsageSnippet language="java" operationID="createRule" method="post" path="/api/reconciliation/rules" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateRuleResponse;
import com.formance.formance_sdk.models.reconciliation.*;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        RuleRequest req = RuleRequest.builder()
                .name("<value>")
                .templateKind(TemplateKind.LEDGER_VS_POOL_DRIFT)
                .templateSpec(Map.ofEntries(
                    Map.entry("key", "<value>"),
                    Map.entry("key1", "<value>"),
                    Map.entry("key2", "<value>")))
                .schedule(Schedule.builder()
                    .kind(ScheduleKind.ON_DEMAND)
                    .expr("*/15 * * * *")
                    .safetyMargin("30s")
                    .tz("UTC")
                    .build())
                .build();

        CreateRuleResponse res = sdk.reconciliation().v1().createRule()
                .request(req)
                .call();

        if (res.ruleResponse().isPresent()) {
            System.out.println(res.ruleResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [RuleRequest](../../models/shared/RuleRequest.md) | :heavy_check_mark:                                | The request object to use for the request.        |

### Response

**[CreateRuleResponse](../../models/operations/CreateRuleResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## deletePolicy

Delete a policy by its id.

### Example Usage

<!-- UsageSnippet language="java" operationID="deletePolicy" method="delete" path="/api/reconciliation/policies/{policyID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeletePolicyRequest;
import com.formance.formance_sdk.models.operations.DeletePolicyResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## deleteRule

Delete a rule (cascades to evaluations + alerts + alert events)

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteRule" method="delete" path="/api/reconciliation/rules/{ruleID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteRuleRequest;
import com.formance.formance_sdk.models.operations.DeleteRuleResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        DeleteRuleRequest req = DeleteRuleRequest.builder()
                .ruleID("3254b217-2184-4bf4-bbc8-b529fa29bd7c")
                .build();

        DeleteRuleResponse res = sdk.reconciliation().v1().deleteRule()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [DeleteRuleRequest](../../models/operations/DeleteRuleRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[DeleteRuleResponse](../../models/operations/DeleteRuleResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## evaluateRule

Evaluate a rule now

### Example Usage

<!-- UsageSnippet language="java" operationID="evaluateRule" method="post" path="/api/reconciliation/rules/{ruleID}/evaluate" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.EvaluateRuleRequest;
import com.formance.formance_sdk.models.operations.EvaluateRuleResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        EvaluateRuleRequest req = EvaluateRuleRequest.builder()
                .ruleID("e9d27cb2-b7fc-4383-b319-936c01a66703")
                .evaluateRuleRequest(com.formance.formance_sdk.models.reconciliation.EvaluateRuleRequest.builder()
                    .safetyMargin("30s")
                    .sourcePITs(Map.ofEntries(
                        Map.entry("ledger:main#0", OffsetDateTime.parse("2026-06-30T23:59:59Z")),
                        Map.entry("pool:acct#0", OffsetDateTime.parse("2026-06-30T23:00:00Z"))))
                    .build())
                .build();

        EvaluateRuleResponse res = sdk.reconciliation().v1().evaluateRule()
                .request(req)
                .call();

        if (res.evaluationResponse().isPresent()) {
            System.out.println(res.evaluationResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [EvaluateRuleRequest](../../models/operations/EvaluateRuleRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[EvaluateRuleResponse](../../models/operations/EvaluateRuleResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getAlert

Get an alert

### Example Usage

<!-- UsageSnippet language="java" operationID="getAlert" method="get" path="/api/reconciliation/alerts/{alertID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetAlertRequest;
import com.formance.formance_sdk.models.operations.GetAlertResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetAlertRequest req = GetAlertRequest.builder()
                .alertID("c7c54af9-81a4-4208-844b-4f25f89cf8a1")
                .build();

        GetAlertResponse res = sdk.reconciliation().v1().getAlert()
                .request(req)
                .call();

        if (res.alertResponse().isPresent()) {
            System.out.println(res.alertResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetAlertRequest](../../models/operations/GetAlertRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetAlertResponse](../../models/operations/GetAlertResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getEvaluation

Get an evaluation

### Example Usage

<!-- UsageSnippet language="java" operationID="getEvaluation" method="get" path="/api/reconciliation/evaluations/{evaluationID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetEvaluationRequest;
import com.formance.formance_sdk.models.operations.GetEvaluationResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetEvaluationRequest req = GetEvaluationRequest.builder()
                .evaluationID("121717d3-a7d1-444d-9d11-6ea2dc0d3db5")
                .build();

        GetEvaluationResponse res = sdk.reconciliation().v1().getEvaluation()
                .request(req)
                .call();

        if (res.evaluationResponse().isPresent()) {
            System.out.println(res.evaluationResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetEvaluationRequest](../../models/operations/GetEvaluationRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetEvaluationResponse](../../models/operations/GetEvaluationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getPolicy

Get a policy

### Example Usage

<!-- UsageSnippet language="java" operationID="getPolicy" method="get" path="/api/reconciliation/policies/{policyID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetPolicyRequest;
import com.formance.formance_sdk.models.operations.GetPolicyResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetPolicyRequest req = GetPolicyRequest.builder()
                .policyID("XXX")
                .build();

        GetPolicyResponse res = sdk.reconciliation().v1().getPolicy()
                .request(req)
                .call();

        if (res.policyResponse().isPresent()) {
            System.out.println(res.policyResponse().get());
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getReconciliation

Get a reconciliation

### Example Usage

<!-- UsageSnippet language="java" operationID="getReconciliation" method="get" path="/api/reconciliation/reconciliations/{reconciliationID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetReconciliationRequest;
import com.formance.formance_sdk.models.operations.GetReconciliationResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetReconciliationRequest req = GetReconciliationRequest.builder()
                .reconciliationID("XXX")
                .build();

        GetReconciliationResponse res = sdk.reconciliation().v1().getReconciliation()
                .request(req)
                .call();

        if (res.reconciliationResponse().isPresent()) {
            System.out.println(res.reconciliationResponse().get());
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getRule

Get a rule

### Example Usage

<!-- UsageSnippet language="java" operationID="getRule" method="get" path="/api/reconciliation/rules/{ruleID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetRuleRequest;
import com.formance.formance_sdk.models.operations.GetRuleResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetRuleRequest req = GetRuleRequest.builder()
                .ruleID("fd71d712-041d-4271-b7c5-c9adac177f52")
                .build();

        GetRuleResponse res = sdk.reconciliation().v1().getRule()
                .request(req)
                .call();

        if (res.ruleResponse().isPresent()) {
            System.out.println(res.ruleResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetRuleRequest](../../models/operations/GetRuleRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetRuleResponse](../../models/operations/GetRuleResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## getServerInfoReconciliation

Get server info

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerInfo_reconciliation" method="get" path="/api/reconciliation/_info" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetServerInfoReconciliationResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetServerInfoReconciliationResponse res = sdk.reconciliation().v1().getServerInfoReconciliation()
                .call();

        if (res.serverInfo().isPresent()) {
            System.out.println(res.serverInfo().get());
        }
    }
}
```

### Response

**[GetServerInfoReconciliationResponse](../../models/operations/GetServerInfoReconciliationResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listAlertEvents

Returns a page of the events recorded for this alert — every evaluation
that touched it plus every manual transition. The list is append-only;
events are never modified or deleted. Ordered most-recent-first and
cursor-paginated: a long-lived alert's timeline is unbounded (one row per
failing evaluation), so callers must page through it.


### Example Usage

<!-- UsageSnippet language="java" operationID="listAlertEvents" method="get" path="/api/reconciliation/alerts/{alertID}/events" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListAlertEventsRequest;
import com.formance.formance_sdk.models.operations.ListAlertEventsResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListAlertEventsRequest req = ListAlertEventsRequest.builder()
                .alertID("259536e6-acd5-4e38-9154-10e46ea2bc63")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListAlertEventsResponse res = sdk.reconciliation().v1().listAlertEvents()
                .request(req)
                .call();

        if (res.alertEventsCursorResponse().isPresent()) {
            System.out.println(res.alertEventsCursorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAlertEventsRequest](../../models/operations/ListAlertEventsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAlertEventsResponse](../../models/operations/ListAlertEventsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listAlerts

List alerts

### Example Usage

<!-- UsageSnippet language="java" operationID="listAlerts" method="get" path="/api/reconciliation/alerts" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListAlertsRequest;
import com.formance.formance_sdk.models.operations.ListAlertsResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListAlertsRequest req = ListAlertsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListAlertsResponse res = sdk.reconciliation().v1().listAlerts()
                .request(req)
                .call();

        if (res.alertsCursorResponse().isPresent()) {
            System.out.println(res.alertsCursorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListAlertsRequest](../../models/operations/ListAlertsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListAlertsResponse](../../models/operations/ListAlertsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listEvaluations

List evaluations

### Example Usage

<!-- UsageSnippet language="java" operationID="listEvaluations" method="get" path="/api/reconciliation/evaluations" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListEvaluationsRequest;
import com.formance.formance_sdk.models.operations.ListEvaluationsResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListEvaluationsRequest req = ListEvaluationsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListEvaluationsResponse res = sdk.reconciliation().v1().listEvaluations()
                .request(req)
                .call();

        if (res.evaluationsCursorResponse().isPresent()) {
            System.out.println(res.evaluationsCursorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListEvaluationsRequest](../../models/operations/ListEvaluationsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListEvaluationsResponse](../../models/operations/ListEvaluationsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listPolicies

List policies

### Example Usage

<!-- UsageSnippet language="java" operationID="listPolicies" method="get" path="/api/reconciliation/policies" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListPoliciesRequest;
import com.formance.formance_sdk.models.operations.ListPoliciesResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
            System.out.println(res.policiesCursorResponse().get());
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listReconciliations

List reconciliations

### Example Usage

<!-- UsageSnippet language="java" operationID="listReconciliations" method="get" path="/api/reconciliation/reconciliations" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListReconciliationsRequest;
import com.formance.formance_sdk.models.operations.ListReconciliationsResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
            System.out.println(res.reconciliationsCursorResponse().get());
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## listRules

List rules

### Example Usage

<!-- UsageSnippet language="java" operationID="listRules" method="get" path="/api/reconciliation/rules" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListRulesRequest;
import com.formance.formance_sdk.models.operations.ListRulesResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListRulesRequest req = ListRulesRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        ListRulesResponse res = sdk.reconciliation().v1().listRules()
                .request(req)
                .call();

        if (res.rulesCursorResponse().isPresent()) {
            System.out.println(res.rulesCursorResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListRulesRequest](../../models/operations/ListRulesRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListRulesResponse](../../models/operations/ListRulesResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## patchRule

Patch a rule (partial update)

### Example Usage

<!-- UsageSnippet language="java" operationID="patchRule" method="patch" path="/api/reconciliation/rules/{ruleID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.PatchRuleRequest;
import com.formance.formance_sdk.models.operations.PatchRuleResponse;
import com.formance.formance_sdk.models.reconciliation.*;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        PatchRuleRequest req = PatchRuleRequest.builder()
                .rulePatchRequest(RulePatchRequest.builder()
                    .schedule(Schedule.builder()
                        .kind(ScheduleKind.CRON)
                        .expr("*/15 * * * *")
                        .safetyMargin("30s")
                        .tz("UTC")
                        .build())
                    .build())
                .ruleID("0b4aa7b1-cc5d-4700-91ec-4983510fef86")
                .build();

        PatchRuleResponse res = sdk.reconciliation().v1().patchRule()
                .request(req)
                .call();

        if (res.ruleResponse().isPresent()) {
            System.out.println(res.ruleResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [PatchRuleRequest](../../models/operations/PatchRuleRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[PatchRuleResponse](../../models/operations/PatchRuleResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## reconcile

Reconcile using a policy

### Example Usage

<!-- UsageSnippet language="java" operationID="reconcile" method="post" path="/api/reconciliation/policies/{policyID}/reconciliation" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReconcileRequest;
import com.formance.formance_sdk.models.operations.ReconcileResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.reconciliation.ReconciliationRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
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
            System.out.println(res.reconciliationResponse().get());
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

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## resolveAlert

Resolve an alert (fixed_by_booking)

### Example Usage

<!-- UsageSnippet language="java" operationID="resolveAlert" method="post" path="/api/reconciliation/alerts/{alertID}/resolve" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ResolveAlertResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.reconciliation.ResolveAlertRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.ResolveAlertRequest req = com.formance.formance_sdk.models.operations.ResolveAlertRequest.builder()
                .resolveAlertRequest(ResolveAlertRequest.builder()
                    .by("<value>")
                    .build())
                .alertID("53527ec3-b39f-4eee-ac1d-6e2bad87f240")
                .build();

        ResolveAlertResponse res = sdk.reconciliation().v1().resolveAlert()
                .request(req)
                .call();

        if (res.alertResponse().isPresent()) {
            System.out.println(res.alertResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ResolveAlertRequest](../../models/operations/ResolveAlertRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ResolveAlertResponse](../../models/operations/ResolveAlertResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## snoozeAlert

Mutes the alert's webhook notifications until `until`. The alert keeps
failing, keeps its status, and keeps counting against period-green —
only its notifications are suppressed, even if the discrepancy changes.
The first failing evaluation at or after `until` clears the snooze and
notifies once. Re-snoozing overwrites the window. Rejects RESOLVED
alerts and a non-future `until`.


### Example Usage

<!-- UsageSnippet language="java" operationID="snoozeAlert" method="post" path="/api/reconciliation/alerts/{alertID}/snooze" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SnoozeAlertResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.reconciliation.SnoozeAlertRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.SnoozeAlertRequest req = com.formance.formance_sdk.models.operations.SnoozeAlertRequest.builder()
                .snoozeAlertRequest(SnoozeAlertRequest.builder()
                    .by("ops@buildr.com")
                    .until(OffsetDateTime.parse("2026-07-17T12:27:27.142Z"))
                    .build())
                .alertID("96529a25-9005-499e-a0ec-daa0ae32f4cb")
                .build();

        SnoozeAlertResponse res = sdk.reconciliation().v1().snoozeAlert()
                .request(req)
                .call();

        if (res.alertResponse().isPresent()) {
            System.out.println(res.alertResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [SnoozeAlertRequest](../../models/operations/SnoozeAlertRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[SnoozeAlertResponse](../../models/operations/SnoozeAlertResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## unsnoozeAlert

Clears an active snooze before its window elapses. Idempotent —
unsnoozing an alert that is not snoozed returns it unchanged.


### Example Usage

<!-- UsageSnippet language="java" operationID="unsnoozeAlert" method="post" path="/api/reconciliation/alerts/{alertID}/unsnooze" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.UnsnoozeAlertResponse;
import com.formance.formance_sdk.models.reconciliation.ErrorsErrorResponse;
import com.formance.formance_sdk.models.reconciliation.UnsnoozeAlertRequest;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorsErrorResponse, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        com.formance.formance_sdk.models.operations.UnsnoozeAlertRequest req = com.formance.formance_sdk.models.operations.UnsnoozeAlertRequest.builder()
                .unsnoozeAlertRequest(UnsnoozeAlertRequest.builder()
                    .by("ops@buildr.com")
                    .build())
                .alertID("a1f12fdd-d9de-483a-b3c6-41ec79a76231")
                .build();

        UnsnoozeAlertResponse res = sdk.reconciliation().v1().unsnoozeAlert()
                .request(req)
                .call();

        if (res.alertResponse().isPresent()) {
            System.out.println(res.alertResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UnsnoozeAlertRequest](../../models/operations/UnsnoozeAlertRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UnsnoozeAlertResponse](../../models/operations/UnsnoozeAlertResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/ErrorsErrorResponse | default                           | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |