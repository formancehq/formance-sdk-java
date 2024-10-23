# SDKV2
(*orchestration().v2()*)

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
* [getServerInfo](#getserverinfo) - Get server info
* [getWorkflow](#getworkflow) - Get a flow by id
* [listInstances](#listinstances) - List instances of a workflow
* [listTriggers](#listtriggers) - List triggers
* [listTriggersOccurrences](#listtriggersoccurrences) - List triggers occurrences
* [listWorkflows](#listworkflows) - List registered workflows
* [readTrigger](#readtrigger) - Read trigger
* [runWorkflow](#runworkflow) - Run workflow
* [sendEvent](#sendevent) - Send an event to a running workflow
* [testTrigger](#testtrigger) - Test trigger

## cancelEvent

Cancel a running workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2CancelEventRequest;
import com.formance.formance_sdk.models.operations.V2CancelEventResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2CancelEventRequest req = V2CancelEventRequest.builder()
                .instanceID("xxx")
                .build();

        V2CancelEventResponse res = sdk.orchestration().v2().cancelEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2CancelEventRequest](../../models/operations/V2CancelEventRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2CancelEventResponse](../../models/operations/V2CancelEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createTrigger

Create trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2CreateTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2TriggerData;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2TriggerData req = V2TriggerData.builder()
                .event("<value>")
                .workflowID("<id>")
                .build();

        V2CreateTriggerResponse res = sdk.orchestration().v2().createTrigger()
                .request(req)
                .call();

        if (res.v2CreateTriggerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [V2TriggerData](../../models/shared/V2TriggerData.md) | :heavy_check_mark:                                    | The request object to use for the request.            |

### Response

**[V2CreateTriggerResponse](../../models/operations/V2CreateTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createWorkflow

Create a workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2CreateWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2CreateWorkflowRequest;
import java.lang.Exception;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2CreateWorkflowRequest req = V2CreateWorkflowRequest.builder()
                .stages(List.of(
                    Map.ofEntries(
                        Map.entry("key", "<value>"))))
                .build();

        V2CreateWorkflowResponse res = sdk.orchestration().v2().createWorkflow()
                .request(req)
                .call();

        if (res.v2CreateWorkflowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2CreateWorkflowRequest](../../models/shared/V2CreateWorkflowRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2CreateWorkflowResponse](../../models/operations/V2CreateWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteTrigger

Read trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2DeleteTriggerRequest;
import com.formance.formance_sdk.models.operations.V2DeleteTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2DeleteTriggerRequest req = V2DeleteTriggerRequest.builder()
                .triggerID("<id>")
                .build();

        V2DeleteTriggerResponse res = sdk.orchestration().v2().deleteTrigger()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2DeleteTriggerRequest](../../models/operations/V2DeleteTriggerRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2DeleteTriggerResponse](../../models/operations/V2DeleteTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteWorkflow

Delete a flow by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2DeleteWorkflowRequest;
import com.formance.formance_sdk.models.operations.V2DeleteWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2DeleteWorkflowRequest req = V2DeleteWorkflowRequest.builder()
                .flowId("xxx")
                .build();

        V2DeleteWorkflowResponse res = sdk.orchestration().v2().deleteWorkflow()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [V2DeleteWorkflowRequest](../../models/operations/V2DeleteWorkflowRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[V2DeleteWorkflowResponse](../../models/operations/V2DeleteWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getInstance

Get a workflow instance by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2GetInstanceRequest;
import com.formance.formance_sdk.models.operations.V2GetInstanceResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetInstanceRequest req = V2GetInstanceRequest.builder()
                .instanceID("xxx")
                .build();

        V2GetInstanceResponse res = sdk.orchestration().v2().getInstance()
                .request(req)
                .call();

        if (res.v2GetWorkflowInstanceResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2GetInstanceRequest](../../models/operations/V2GetInstanceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2GetInstanceResponse](../../models/operations/V2GetInstanceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getInstanceHistory

Get a workflow instance history by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2GetInstanceHistoryRequest;
import com.formance.formance_sdk.models.operations.V2GetInstanceHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetInstanceHistoryRequest req = V2GetInstanceHistoryRequest.builder()
                .instanceID("xxx")
                .build();

        V2GetInstanceHistoryResponse res = sdk.orchestration().v2().getInstanceHistory()
                .request(req)
                .call();

        if (res.v2GetWorkflowInstanceHistoryResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [V2GetInstanceHistoryRequest](../../models/operations/V2GetInstanceHistoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[V2GetInstanceHistoryResponse](../../models/operations/V2GetInstanceHistoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getInstanceStageHistory

Get a workflow instance stage history

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryRequest;
import com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetInstanceStageHistoryRequest req = V2GetInstanceStageHistoryRequest.builder()
                .instanceID("xxx")
                .number(0L)
                .build();

        V2GetInstanceStageHistoryResponse res = sdk.orchestration().v2().getInstanceStageHistory()
                .request(req)
                .call();

        if (res.v2GetWorkflowInstanceHistoryStageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [V2GetInstanceStageHistoryRequest](../../models/operations/V2GetInstanceStageHistoryRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[V2GetInstanceStageHistoryResponse](../../models/operations/V2GetInstanceStageHistoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2GetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetServerInfoResponse res = sdk.orchestration().v2().getServerInfo()
                .call();

        if (res.v2ServerInfo().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[V2GetServerInfoResponse](../../models/operations/V2GetServerInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getWorkflow

Get a flow by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2GetWorkflowRequest;
import com.formance.formance_sdk.models.operations.V2GetWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2GetWorkflowRequest req = V2GetWorkflowRequest.builder()
                .flowId("xxx")
                .build();

        V2GetWorkflowResponse res = sdk.orchestration().v2().getWorkflow()
                .request(req)
                .call();

        if (res.v2GetWorkflowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2GetWorkflowRequest](../../models/operations/V2GetWorkflowRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2GetWorkflowResponse](../../models/operations/V2GetWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listInstances

List instances of a workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2ListInstancesRequest;
import com.formance.formance_sdk.models.operations.V2ListInstancesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ListInstancesRequest req = V2ListInstancesRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .running(true)
                .workflowID("xxx")
                .build();

        V2ListInstancesResponse res = sdk.orchestration().v2().listInstances()
                .request(req)
                .call();

        if (res.v2ListRunsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2ListInstancesRequest](../../models/operations/V2ListInstancesRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2ListInstancesResponse](../../models/operations/V2ListInstancesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTriggers

List triggers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2ListTriggersRequest;
import com.formance.formance_sdk.models.operations.V2ListTriggersResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ListTriggersRequest req = V2ListTriggersRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V2ListTriggersResponse res = sdk.orchestration().v2().listTriggers()
                .request(req)
                .call();

        if (res.v2ListTriggersResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [V2ListTriggersRequest](../../models/operations/V2ListTriggersRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[V2ListTriggersResponse](../../models/operations/V2ListTriggersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTriggersOccurrences

List triggers occurrences

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2ListTriggersOccurrencesRequest;
import com.formance.formance_sdk.models.operations.V2ListTriggersOccurrencesResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ListTriggersOccurrencesRequest req = V2ListTriggersOccurrencesRequest.builder()
                .triggerID("<id>")
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V2ListTriggersOccurrencesResponse res = sdk.orchestration().v2().listTriggersOccurrences()
                .request(req)
                .call();

        if (res.v2ListTriggersOccurrencesResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [V2ListTriggersOccurrencesRequest](../../models/operations/V2ListTriggersOccurrencesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[V2ListTriggersOccurrencesResponse](../../models/operations/V2ListTriggersOccurrencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listWorkflows

List registered workflows

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2ListWorkflowsRequest;
import com.formance.formance_sdk.models.operations.V2ListWorkflowsResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ListWorkflowsRequest req = V2ListWorkflowsRequest.builder()
                .cursor("aHR0cHM6Ly9nLnBhZ2UvTmVrby1SYW1lbj9zaGFyZQ==")
                .pageSize(100L)
                .build();

        V2ListWorkflowsResponse res = sdk.orchestration().v2().listWorkflows()
                .request(req)
                .call();

        if (res.v2ListWorkflowsResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [V2ListWorkflowsRequest](../../models/operations/V2ListWorkflowsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[V2ListWorkflowsResponse](../../models/operations/V2ListWorkflowsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## readTrigger

Read trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2ReadTriggerRequest;
import com.formance.formance_sdk.models.operations.V2ReadTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2ReadTriggerRequest req = V2ReadTriggerRequest.builder()
                .triggerID("<id>")
                .build();

        V2ReadTriggerResponse res = sdk.orchestration().v2().readTrigger()
                .request(req)
                .call();

        if (res.v2ReadTriggerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2ReadTriggerRequest](../../models/operations/V2ReadTriggerRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2ReadTriggerResponse](../../models/operations/V2ReadTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## runWorkflow

Run workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2RunWorkflowRequest;
import com.formance.formance_sdk.models.operations.V2RunWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2RunWorkflowRequest req = V2RunWorkflowRequest.builder()
                .workflowID("xxx")
                .build();

        V2RunWorkflowResponse res = sdk.orchestration().v2().runWorkflow()
                .request(req)
                .call();

        if (res.v2RunWorkflowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [V2RunWorkflowRequest](../../models/operations/V2RunWorkflowRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[V2RunWorkflowResponse](../../models/operations/V2RunWorkflowResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## sendEvent

Send an event to a running workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.V2SendEventRequest;
import com.formance.formance_sdk.models.operations.V2SendEventResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        V2SendEventRequest req = V2SendEventRequest.builder()
                .instanceID("xxx")
                .build();

        V2SendEventResponse res = sdk.orchestration().v2().sendEvent()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [V2SendEventRequest](../../models/operations/V2SendEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[V2SendEventResponse](../../models/operations/V2SendEventResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## testTrigger

Test trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.errors.V2Error;
import com.formance.formance_sdk.models.operations.TestTriggerRequest;
import com.formance.formance_sdk.models.operations.TestTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws V2Error, Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .clientID("<YOUR_CLIENT_ID_HERE>")
                    .clientSecret("<YOUR_CLIENT_SECRET_HERE>")
                    .build())
            .build();

        TestTriggerRequest req = TestTriggerRequest.builder()
                .triggerID("<id>")
                .build();

        TestTriggerResponse res = sdk.orchestration().v2().testTrigger()
                .request(req)
                .call();

        if (res.v2TestTriggerResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [TestTriggerRequest](../../models/operations/TestTriggerRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[TestTriggerResponse](../../models/operations/TestTriggerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/V2Error  | default                | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |