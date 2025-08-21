# OrchestrationV1
(*orchestration().v1()*)

## Overview

### Available Operations

* [cancelEvent](#cancelevent) - Cancel a running workflow
* [createTrigger](#createtrigger) - Create trigger
* [createWorkflow](#createworkflow) - Create workflow
* [deleteTrigger](#deletetrigger) - Delete trigger
* [deleteWorkflow](#deleteworkflow) - Delete a flow by id
* [getInstance](#getinstance) - Get a workflow instance by id
* [getInstanceHistory](#getinstancehistory) - Get a workflow instance history by id
* [getInstanceStageHistory](#getinstancestagehistory) - Get a workflow instance stage history
* [getWorkflow](#getworkflow) - Get a flow by id
* [listInstances](#listinstances) - List instances of a workflow
* [listTriggers](#listtriggers) - List triggers
* [listTriggersOccurrences](#listtriggersoccurrences) - List triggers occurrences
* [listWorkflows](#listworkflows) - List registered workflows
* [orchestrationgetServerInfo](#orchestrationgetserverinfo) - Get server info
* [readTrigger](#readtrigger) - Read trigger
* [runWorkflow](#runworkflow) - Run workflow
* [sendEvent](#sendevent) - Send an event to a running workflow

## cancelEvent

Cancel a running workflow

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelEvent" method="put" path="/api/orchestration/instances/{instanceID}/abort" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.CancelEventRequest;
import com.formance.formance_sdk.models.operations.CancelEventResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        CancelEventRequest req = CancelEventRequest.builder()
                .instanceID("xxx")
                .build();

        CancelEventResponse res = sdk.orchestration().v1().cancelEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [CancelEventRequest](../../models/operations/CancelEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CancelEventResponse](../../models/operations/CancelEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTrigger

Create trigger

### Example Usage

<!-- UsageSnippet language="java" operationID="createTrigger" method="post" path="/api/orchestration/triggers" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.CreateTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        CreateTriggerResponse res = sdk.orchestration().v1().createTrigger()
                .call();

        if (res.createTriggerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                         | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `request`                                         | [TriggerData](../../models/shared/TriggerData.md) | :heavy_check_mark:                                | The request object to use for the request.        |

### Response

**[CreateTriggerResponse](../../models/operations/CreateTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createWorkflow

Create a workflow

### Example Usage

<!-- UsageSnippet language="java" operationID="createWorkflow" method="post" path="/api/orchestration/workflows" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.CreateWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        CreateWorkflowResponse res = sdk.orchestration().v1().createWorkflow()
                .call();

        if (res.createWorkflowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [WorkflowConfig](../../models/shared/WorkflowConfig.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateWorkflowResponse](../../models/operations/CreateWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteTrigger

Read trigger

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteTrigger" method="delete" path="/api/orchestration/triggers/{triggerID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.DeleteTriggerRequest;
import com.formance.formance_sdk.models.operations.DeleteTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        DeleteTriggerRequest req = DeleteTriggerRequest.builder()
                .triggerID("<id>")
                .build();

        DeleteTriggerResponse res = sdk.orchestration().v1().deleteTrigger()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeleteTriggerRequest](../../models/operations/DeleteTriggerRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeleteTriggerResponse](../../models/operations/DeleteTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteWorkflow

Delete a flow by id

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteWorkflow" method="delete" path="/api/orchestration/workflows/{flowId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.DeleteWorkflowRequest;
import com.formance.formance_sdk.models.operations.DeleteWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        DeleteWorkflowRequest req = DeleteWorkflowRequest.builder()
                .flowId("xxx")
                .build();

        DeleteWorkflowResponse res = sdk.orchestration().v1().deleteWorkflow()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DeleteWorkflowRequest](../../models/operations/DeleteWorkflowRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DeleteWorkflowResponse](../../models/operations/DeleteWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getInstance

Get a workflow instance by id

### Example Usage

<!-- UsageSnippet language="java" operationID="getInstance" method="get" path="/api/orchestration/instances/{instanceID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.GetInstanceRequest;
import com.formance.formance_sdk.models.operations.GetInstanceResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetInstanceRequest req = GetInstanceRequest.builder()
                .instanceID("xxx")
                .build();

        GetInstanceResponse res = sdk.orchestration().v1().getInstance()
                .request(req)
                .call();

        if (res.getWorkflowInstanceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetInstanceRequest](../../models/operations/GetInstanceRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetInstanceResponse](../../models/operations/GetInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getInstanceHistory

Get a workflow instance history by id

### Example Usage

<!-- UsageSnippet language="java" operationID="getInstanceHistory" method="get" path="/api/orchestration/instances/{instanceID}/history" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.GetInstanceHistoryRequest;
import com.formance.formance_sdk.models.operations.GetInstanceHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetInstanceHistoryRequest req = GetInstanceHistoryRequest.builder()
                .instanceID("xxx")
                .build();

        GetInstanceHistoryResponse res = sdk.orchestration().v1().getInstanceHistory()
                .request(req)
                .call();

        if (res.getWorkflowInstanceHistoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetInstanceHistoryRequest](../../models/operations/GetInstanceHistoryRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetInstanceHistoryResponse](../../models/operations/GetInstanceHistoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getInstanceStageHistory

Get a workflow instance stage history

### Example Usage

<!-- UsageSnippet language="java" operationID="getInstanceStageHistory" method="get" path="/api/orchestration/instances/{instanceID}/stages/{number}/history" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.GetInstanceStageHistoryRequest;
import com.formance.formance_sdk.models.operations.GetInstanceStageHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetInstanceStageHistoryRequest req = GetInstanceStageHistoryRequest.builder()
                .instanceID("xxx")
                .number(0L)
                .build();

        GetInstanceStageHistoryResponse res = sdk.orchestration().v1().getInstanceStageHistory()
                .request(req)
                .call();

        if (res.getWorkflowInstanceHistoryStageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetInstanceStageHistoryRequest](../../models/operations/GetInstanceStageHistoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetInstanceStageHistoryResponse](../../models/operations/GetInstanceStageHistoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getWorkflow

Get a flow by id

### Example Usage

<!-- UsageSnippet language="java" operationID="getWorkflow" method="get" path="/api/orchestration/workflows/{flowId}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.GetWorkflowRequest;
import com.formance.formance_sdk.models.operations.GetWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        GetWorkflowRequest req = GetWorkflowRequest.builder()
                .flowId("xxx")
                .build();

        GetWorkflowResponse res = sdk.orchestration().v1().getWorkflow()
                .request(req)
                .call();

        if (res.getWorkflowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetWorkflowRequest](../../models/operations/GetWorkflowRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetWorkflowResponse](../../models/operations/GetWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listInstances

List instances of a workflow

### Example Usage

<!-- UsageSnippet language="java" operationID="listInstances" method="get" path="/api/orchestration/instances" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.ListInstancesRequest;
import com.formance.formance_sdk.models.operations.ListInstancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListInstancesRequest req = ListInstancesRequest.builder()
                .running(true)
                .workflowID("xxx")
                .build();

        ListInstancesResponse res = sdk.orchestration().v1().listInstances()
                .request(req)
                .call();

        if (res.listRunsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListInstancesRequest](../../models/operations/ListInstancesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListInstancesResponse](../../models/operations/ListInstancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTriggers

List triggers

### Example Usage

<!-- UsageSnippet language="java" operationID="listTriggers" method="get" path="/api/orchestration/triggers" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.ListTriggersResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListTriggersResponse res = sdk.orchestration().v1().listTriggers()
                .call();

        if (res.listTriggersResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListTriggersRequest](../../models/operations/ListTriggersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListTriggersResponse](../../models/operations/ListTriggersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTriggersOccurrences

List triggers occurrences

### Example Usage

<!-- UsageSnippet language="java" operationID="listTriggersOccurrences" method="get" path="/api/orchestration/triggers/{triggerID}/occurrences" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.ListTriggersOccurrencesRequest;
import com.formance.formance_sdk.models.operations.ListTriggersOccurrencesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListTriggersOccurrencesRequest req = ListTriggersOccurrencesRequest.builder()
                .triggerID("<id>")
                .build();

        ListTriggersOccurrencesResponse res = sdk.orchestration().v1().listTriggersOccurrences()
                .request(req)
                .call();

        if (res.listTriggersOccurrencesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListTriggersOccurrencesRequest](../../models/operations/ListTriggersOccurrencesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListTriggersOccurrencesResponse](../../models/operations/ListTriggersOccurrencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listWorkflows

List registered workflows

### Example Usage

<!-- UsageSnippet language="java" operationID="listWorkflows" method="get" path="/api/orchestration/workflows" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.ListWorkflowsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ListWorkflowsResponse res = sdk.orchestration().v1().listWorkflows()
                .call();

        if (res.listWorkflowsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListWorkflowsResponse](../../models/operations/ListWorkflowsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## orchestrationgetServerInfo

Get server info

### Example Usage

<!-- UsageSnippet language="java" operationID="orchestrationgetServerInfo" method="get" path="/api/orchestration/_info" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.OrchestrationgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        OrchestrationgetServerInfoResponse res = sdk.orchestration().v1().orchestrationgetServerInfo()
                .call();

        if (res.serverInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[OrchestrationgetServerInfoResponse](../../models/operations/OrchestrationgetServerInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## readTrigger

Read trigger

### Example Usage

<!-- UsageSnippet language="java" operationID="readTrigger" method="get" path="/api/orchestration/triggers/{triggerID}" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.ReadTriggerRequest;
import com.formance.formance_sdk.models.operations.ReadTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        ReadTriggerRequest req = ReadTriggerRequest.builder()
                .triggerID("<id>")
                .build();

        ReadTriggerResponse res = sdk.orchestration().v1().readTrigger()
                .request(req)
                .call();

        if (res.readTriggerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ReadTriggerRequest](../../models/operations/ReadTriggerRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ReadTriggerResponse](../../models/operations/ReadTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## runWorkflow

Run workflow

### Example Usage

<!-- UsageSnippet language="java" operationID="runWorkflow" method="post" path="/api/orchestration/workflows/{workflowID}/instances" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.RunWorkflowRequest;
import com.formance.formance_sdk.models.operations.RunWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        RunWorkflowRequest req = RunWorkflowRequest.builder()
                .workflowID("xxx")
                .build();

        RunWorkflowResponse res = sdk.orchestration().v1().runWorkflow()
                .request(req)
                .call();

        if (res.runWorkflowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [RunWorkflowRequest](../../models/operations/RunWorkflowRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[RunWorkflowResponse](../../models/operations/RunWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## sendEvent

Send an event to a running workflow

### Example Usage

<!-- UsageSnippet language="java" operationID="sendEvent" method="post" path="/api/orchestration/instances/{instanceID}/events" -->
```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.Error;
import com.formance.formance_sdk.models.operations.SendEventRequest;
import com.formance.formance_sdk.models.operations.SendEventResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID(System.getenv().getOrDefault("CLIENT_ID", ""))
                    .clientSecret(System.getenv().getOrDefault("CLIENT_SECRET", ""))
                    .build())
            .build();

        SendEventRequest req = SendEventRequest.builder()
                .instanceID("xxx")
                .build();

        SendEventResponse res = sdk.orchestration().v1().sendEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [SendEventRequest](../../models/operations/SendEventRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[SendEventResponse](../../models/operations/SendEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |