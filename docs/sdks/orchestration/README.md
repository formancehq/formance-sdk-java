# Orchestration
(*orchestration*)

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
* [testTrigger](#testtrigger) - Test trigger
* [v2CancelEvent](#v2cancelevent) - Cancel a running workflow
* [v2CreateTrigger](#v2createtrigger) - Create trigger
* [v2CreateWorkflow](#v2createworkflow) - Create workflow
* [v2DeleteTrigger](#v2deletetrigger) - Delete trigger
* [v2DeleteWorkflow](#v2deleteworkflow) - Delete a flow by id
* [v2GetInstance](#v2getinstance) - Get a workflow instance by id
* [v2GetInstanceHistory](#v2getinstancehistory) - Get a workflow instance history by id
* [v2GetInstanceStageHistory](#v2getinstancestagehistory) - Get a workflow instance stage history
* [v2GetServerInfo](#v2getserverinfo) - Get server info
* [v2GetWorkflow](#v2getworkflow) - Get a flow by id
* [v2ListInstances](#v2listinstances) - List instances of a workflow
* [v2ListTriggers](#v2listtriggers) - List triggers
* [v2ListTriggersOccurrences](#v2listtriggersoccurrences) - List triggers occurrences
* [v2ListWorkflows](#v2listworkflows) - List registered workflows
* [v2ReadTrigger](#v2readtrigger) - Read trigger
* [v2RunWorkflow](#v2runworkflow) - Run workflow
* [v2SendEvent](#v2sendevent) - Send an event to a running workflow

## cancelEvent

Cancel a running workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CancelEventRequest;
import com.formance.formance_sdk.models.operations.CancelEventResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            CancelEventRequest req = new CancelEventRequest("string");            

            CancelEventResponse res = sdk.orchestration.cancelEvent(req);

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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.CancelEventRequest](../../models/operations/CancelEventRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.CancelEventResponse](../../models/operations/CancelEventResponse.md)**


## createTrigger

Create trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.TriggerData;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            com.formance.formance_sdk.models.shared.TriggerData req = new TriggerData("string", "string"){{
                filter = "string";
                vars = new java.util.HashMap<String, Object>(){{
                    put("key", "string");
                }};
            }};            

            CreateTriggerResponse res = sdk.orchestration.createTrigger(req);

            if (res.createTriggerResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [com.formance.formance_sdk.models.shared.TriggerData](../../models/shared/TriggerData.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[com.formance.formance_sdk.models.operations.CreateTriggerResponse](../../models/operations/CreateTriggerResponse.md)**


## createWorkflow

Create a workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.CreateWorkflowResponse;
import com.formance.formance_sdk.models.shared.CreateWorkflowRequest;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            com.formance.formance_sdk.models.shared.CreateWorkflowRequest req = new CreateWorkflowRequest(new java.util.HashMap<String, Object>[]{{
    add(new java.util.HashMap<String, Object>(){{
        put("key", "string");
    }}),
}}){{
                name = "string";
            }};            

            CreateWorkflowResponse res = sdk.orchestration.createWorkflow(req);

            if (res.createWorkflowResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [com.formance.formance_sdk.models.shared.CreateWorkflowRequest](../../models/shared/CreateWorkflowRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.CreateWorkflowResponse](../../models/operations/CreateWorkflowResponse.md)**


## deleteTrigger

Read trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteTriggerRequest;
import com.formance.formance_sdk.models.operations.DeleteTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            DeleteTriggerRequest req = new DeleteTriggerRequest("string");            

            DeleteTriggerResponse res = sdk.orchestration.deleteTrigger(req);

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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.DeleteTriggerRequest](../../models/operations/DeleteTriggerRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.DeleteTriggerResponse](../../models/operations/DeleteTriggerResponse.md)**


## deleteWorkflow

Delete a flow by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.DeleteWorkflowRequest;
import com.formance.formance_sdk.models.operations.DeleteWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            DeleteWorkflowRequest req = new DeleteWorkflowRequest("string");            

            DeleteWorkflowResponse res = sdk.orchestration.deleteWorkflow(req);

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

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [com.formance.formance_sdk.models.operations.DeleteWorkflowRequest](../../models/operations/DeleteWorkflowRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |


### Response

**[com.formance.formance_sdk.models.operations.DeleteWorkflowResponse](../../models/operations/DeleteWorkflowResponse.md)**


## getInstance

Get a workflow instance by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetInstanceRequest;
import com.formance.formance_sdk.models.operations.GetInstanceResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            GetInstanceRequest req = new GetInstanceRequest("string");            

            GetInstanceResponse res = sdk.orchestration.getInstance(req);

            if (res.getWorkflowInstanceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.GetInstanceRequest](../../models/operations/GetInstanceRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.GetInstanceResponse](../../models/operations/GetInstanceResponse.md)**


## getInstanceHistory

Get a workflow instance history by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetInstanceHistoryRequest;
import com.formance.formance_sdk.models.operations.GetInstanceHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            GetInstanceHistoryRequest req = new GetInstanceHistoryRequest("string");            

            GetInstanceHistoryResponse res = sdk.orchestration.getInstanceHistory(req);

            if (res.getWorkflowInstanceHistoryResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [com.formance.formance_sdk.models.operations.GetInstanceHistoryRequest](../../models/operations/GetInstanceHistoryRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |


### Response

**[com.formance.formance_sdk.models.operations.GetInstanceHistoryResponse](../../models/operations/GetInstanceHistoryResponse.md)**


## getInstanceStageHistory

Get a workflow instance stage history

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetInstanceStageHistoryRequest;
import com.formance.formance_sdk.models.operations.GetInstanceStageHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            GetInstanceStageHistoryRequest req = new GetInstanceStageHistoryRequest("string", 600636L);            

            GetInstanceStageHistoryResponse res = sdk.orchestration.getInstanceStageHistory(req);

            if (res.getWorkflowInstanceHistoryStageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.GetInstanceStageHistoryRequest](../../models/operations/GetInstanceStageHistoryRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.GetInstanceStageHistoryResponse](../../models/operations/GetInstanceStageHistoryResponse.md)**


## getWorkflow

Get a flow by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.GetWorkflowRequest;
import com.formance.formance_sdk.models.operations.GetWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            GetWorkflowRequest req = new GetWorkflowRequest("string");            

            GetWorkflowResponse res = sdk.orchestration.getWorkflow(req);

            if (res.getWorkflowResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.GetWorkflowRequest](../../models/operations/GetWorkflowRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.GetWorkflowResponse](../../models/operations/GetWorkflowResponse.md)**


## listInstances

List instances of a workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListInstancesRequest;
import com.formance.formance_sdk.models.operations.ListInstancesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            ListInstancesRequest req = new ListInstancesRequest(){{
                running = false;
                workflowID = "string";
            }};            

            ListInstancesResponse res = sdk.orchestration.listInstances(req);

            if (res.listRunsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.ListInstancesRequest](../../models/operations/ListInstancesRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.ListInstancesResponse](../../models/operations/ListInstancesResponse.md)**


## listTriggers

List triggers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListTriggersResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            ListTriggersResponse res = sdk.orchestration.listTriggers();

            if (res.listTriggersResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListTriggersResponse](../../models/operations/ListTriggersResponse.md)**


## listTriggersOccurrences

List triggers occurrences

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListTriggersOccurrencesRequest;
import com.formance.formance_sdk.models.operations.ListTriggersOccurrencesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            ListTriggersOccurrencesRequest req = new ListTriggersOccurrencesRequest("string");            

            ListTriggersOccurrencesResponse res = sdk.orchestration.listTriggersOccurrences(req);

            if (res.listTriggersOccurrencesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [com.formance.formance_sdk.models.operations.ListTriggersOccurrencesRequest](../../models/operations/ListTriggersOccurrencesRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.ListTriggersOccurrencesResponse](../../models/operations/ListTriggersOccurrencesResponse.md)**


## listWorkflows

List registered workflows

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ListWorkflowsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            ListWorkflowsResponse res = sdk.orchestration.listWorkflows();

            if (res.listWorkflowsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.ListWorkflowsResponse](../../models/operations/ListWorkflowsResponse.md)**


## orchestrationgetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.OrchestrationgetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            OrchestrationgetServerInfoResponse res = sdk.orchestration.orchestrationgetServerInfo();

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

**[com.formance.formance_sdk.models.operations.OrchestrationgetServerInfoResponse](../../models/operations/OrchestrationgetServerInfoResponse.md)**


## readTrigger

Read trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.ReadTriggerRequest;
import com.formance.formance_sdk.models.operations.ReadTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            ReadTriggerRequest req = new ReadTriggerRequest("string");            

            ReadTriggerResponse res = sdk.orchestration.readTrigger(req);

            if (res.readTriggerResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.ReadTriggerRequest](../../models/operations/ReadTriggerRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.ReadTriggerResponse](../../models/operations/ReadTriggerResponse.md)**


## runWorkflow

Run workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.RunWorkflowRequest;
import com.formance.formance_sdk.models.operations.RunWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            RunWorkflowRequest req = new RunWorkflowRequest("string"){{
                requestBody = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                wait = false;
            }};            

            RunWorkflowResponse res = sdk.orchestration.runWorkflow(req);

            if (res.runWorkflowResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.RunWorkflowRequest](../../models/operations/RunWorkflowRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.RunWorkflowResponse](../../models/operations/RunWorkflowResponse.md)**


## sendEvent

Send an event to a running workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.SendEventRequest;
import com.formance.formance_sdk.models.operations.SendEventRequestBody;
import com.formance.formance_sdk.models.operations.SendEventResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            SendEventRequest req = new SendEventRequest("string"){{
                requestBody = new SendEventRequestBody("string");
            }};            

            SendEventResponse res = sdk.orchestration.sendEvent(req);

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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [com.formance.formance_sdk.models.operations.SendEventRequest](../../models/operations/SendEventRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.SendEventResponse](../../models/operations/SendEventResponse.md)**


## testTrigger

Test trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.TestTriggerRequest;
import com.formance.formance_sdk.models.operations.TestTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            TestTriggerRequest req = new TestTriggerRequest("string"){{
                requestBody = new java.util.HashMap<String, Object>(){{
                    put("key", "string");
                }};
            }};            

            TestTriggerResponse res = sdk.orchestration.testTrigger(req);

            if (res.v2TestTriggerResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.TestTriggerRequest](../../models/operations/TestTriggerRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.TestTriggerResponse](../../models/operations/TestTriggerResponse.md)**


## v2CancelEvent

Cancel a running workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CancelEventRequest;
import com.formance.formance_sdk.models.operations.V2CancelEventResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2CancelEventRequest req = new V2CancelEventRequest("string");            

            V2CancelEventResponse res = sdk.orchestration.v2CancelEvent(req);

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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.V2CancelEventRequest](../../models/operations/V2CancelEventRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.V2CancelEventResponse](../../models/operations/V2CancelEventResponse.md)**


## v2CreateTrigger

Create trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CreateTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2TriggerData;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            com.formance.formance_sdk.models.shared.V2TriggerData req = new V2TriggerData("string", "string"){{
                filter = "string";
                vars = new java.util.HashMap<String, Object>(){{
                    put("key", "string");
                }};
            }};            

            V2CreateTriggerResponse res = sdk.orchestration.v2CreateTrigger(req);

            if (res.v2CreateTriggerResponse != null) {
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
| `request`                                                                                     | [com.formance.formance_sdk.models.shared.V2TriggerData](../../models/shared/V2TriggerData.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[com.formance.formance_sdk.models.operations.V2CreateTriggerResponse](../../models/operations/V2CreateTriggerResponse.md)**


## v2CreateWorkflow

Create a workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2CreateWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;
import com.formance.formance_sdk.models.shared.V2CreateWorkflowRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            com.formance.formance_sdk.models.shared.V2CreateWorkflowRequest req = new V2CreateWorkflowRequest(new java.util.HashMap<String, Object>[]{{
    add(new java.util.HashMap<String, Object>(){{
        put("key", "string");
    }}),
}}){{
                name = "string";
            }};            

            V2CreateWorkflowResponse res = sdk.orchestration.v2CreateWorkflow(req);

            if (res.v2CreateWorkflowResponse != null) {
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
| `request`                                                                                                         | [com.formance.formance_sdk.models.shared.V2CreateWorkflowRequest](../../models/shared/V2CreateWorkflowRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.V2CreateWorkflowResponse](../../models/operations/V2CreateWorkflowResponse.md)**


## v2DeleteTrigger

Read trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2DeleteTriggerRequest;
import com.formance.formance_sdk.models.operations.V2DeleteTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2DeleteTriggerRequest req = new V2DeleteTriggerRequest("string");            

            V2DeleteTriggerResponse res = sdk.orchestration.v2DeleteTrigger(req);

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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [com.formance.formance_sdk.models.operations.V2DeleteTriggerRequest](../../models/operations/V2DeleteTriggerRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.V2DeleteTriggerResponse](../../models/operations/V2DeleteTriggerResponse.md)**


## v2DeleteWorkflow

Delete a flow by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2DeleteWorkflowRequest;
import com.formance.formance_sdk.models.operations.V2DeleteWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2DeleteWorkflowRequest req = new V2DeleteWorkflowRequest("string");            

            V2DeleteWorkflowResponse res = sdk.orchestration.v2DeleteWorkflow(req);

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

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.formance.formance_sdk.models.operations.V2DeleteWorkflowRequest](../../models/operations/V2DeleteWorkflowRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.formance.formance_sdk.models.operations.V2DeleteWorkflowResponse](../../models/operations/V2DeleteWorkflowResponse.md)**


## v2GetInstance

Get a workflow instance by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetInstanceRequest;
import com.formance.formance_sdk.models.operations.V2GetInstanceResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2GetInstanceRequest req = new V2GetInstanceRequest("string");            

            V2GetInstanceResponse res = sdk.orchestration.v2GetInstance(req);

            if (res.v2GetWorkflowInstanceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.V2GetInstanceRequest](../../models/operations/V2GetInstanceRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.V2GetInstanceResponse](../../models/operations/V2GetInstanceResponse.md)**


## v2GetInstanceHistory

Get a workflow instance history by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetInstanceHistoryRequest;
import com.formance.formance_sdk.models.operations.V2GetInstanceHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2GetInstanceHistoryRequest req = new V2GetInstanceHistoryRequest("string");            

            V2GetInstanceHistoryResponse res = sdk.orchestration.v2GetInstanceHistory(req);

            if (res.v2GetWorkflowInstanceHistoryResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [com.formance.formance_sdk.models.operations.V2GetInstanceHistoryRequest](../../models/operations/V2GetInstanceHistoryRequest.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |


### Response

**[com.formance.formance_sdk.models.operations.V2GetInstanceHistoryResponse](../../models/operations/V2GetInstanceHistoryResponse.md)**


## v2GetInstanceStageHistory

Get a workflow instance stage history

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryRequest;
import com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2GetInstanceStageHistoryRequest req = new V2GetInstanceStageHistoryRequest("string", 465454L);            

            V2GetInstanceStageHistoryResponse res = sdk.orchestration.v2GetInstanceStageHistory(req);

            if (res.v2GetWorkflowInstanceHistoryStageResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryRequest](../../models/operations/V2GetInstanceStageHistoryRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryResponse](../../models/operations/V2GetInstanceStageHistoryResponse.md)**


## v2GetServerInfo

Get server info

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetServerInfoResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2GetServerInfoResponse res = sdk.orchestration.v2GetServerInfo();

            if (res.v2ServerInfo != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.V2GetServerInfoResponse](../../models/operations/V2GetServerInfoResponse.md)**


## v2GetWorkflow

Get a flow by id

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2GetWorkflowRequest;
import com.formance.formance_sdk.models.operations.V2GetWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2GetWorkflowRequest req = new V2GetWorkflowRequest("string");            

            V2GetWorkflowResponse res = sdk.orchestration.v2GetWorkflow(req);

            if (res.v2GetWorkflowResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.V2GetWorkflowRequest](../../models/operations/V2GetWorkflowRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.V2GetWorkflowResponse](../../models/operations/V2GetWorkflowResponse.md)**


## v2ListInstances

List instances of a workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListInstancesRequest;
import com.formance.formance_sdk.models.operations.V2ListInstancesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2ListInstancesRequest req = new V2ListInstancesRequest(){{
                running = false;
                workflowID = "string";
            }};            

            V2ListInstancesResponse res = sdk.orchestration.v2ListInstances(req);

            if (res.v2ListRunsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [com.formance.formance_sdk.models.operations.V2ListInstancesRequest](../../models/operations/V2ListInstancesRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[com.formance.formance_sdk.models.operations.V2ListInstancesResponse](../../models/operations/V2ListInstancesResponse.md)**


## v2ListTriggers

List triggers

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListTriggersResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2ListTriggersResponse res = sdk.orchestration.v2ListTriggers();

            if (res.v2ListTriggersResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.V2ListTriggersResponse](../../models/operations/V2ListTriggersResponse.md)**


## v2ListTriggersOccurrences

List triggers occurrences

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListTriggersOccurrencesRequest;
import com.formance.formance_sdk.models.operations.V2ListTriggersOccurrencesResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2ListTriggersOccurrencesRequest req = new V2ListTriggersOccurrencesRequest("string");            

            V2ListTriggersOccurrencesResponse res = sdk.orchestration.v2ListTriggersOccurrences(req);

            if (res.v2ListTriggersOccurrencesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [com.formance.formance_sdk.models.operations.V2ListTriggersOccurrencesRequest](../../models/operations/V2ListTriggersOccurrencesRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |


### Response

**[com.formance.formance_sdk.models.operations.V2ListTriggersOccurrencesResponse](../../models/operations/V2ListTriggersOccurrencesResponse.md)**


## v2ListWorkflows

List registered workflows

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ListWorkflowsResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2ListWorkflowsResponse res = sdk.orchestration.v2ListWorkflows();

            if (res.v2ListWorkflowsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.formance.formance_sdk.models.operations.V2ListWorkflowsResponse](../../models/operations/V2ListWorkflowsResponse.md)**


## v2ReadTrigger

Read trigger

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2ReadTriggerRequest;
import com.formance.formance_sdk.models.operations.V2ReadTriggerResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2ReadTriggerRequest req = new V2ReadTriggerRequest("string");            

            V2ReadTriggerResponse res = sdk.orchestration.v2ReadTrigger(req);

            if (res.v2ReadTriggerResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.V2ReadTriggerRequest](../../models/operations/V2ReadTriggerRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.V2ReadTriggerResponse](../../models/operations/V2ReadTriggerResponse.md)**


## v2RunWorkflow

Run workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2RunWorkflowRequest;
import com.formance.formance_sdk.models.operations.V2RunWorkflowResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2RunWorkflowRequest req = new V2RunWorkflowRequest("string"){{
                requestBody = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                wait = false;
            }};            

            V2RunWorkflowResponse res = sdk.orchestration.v2RunWorkflow(req);

            if (res.v2RunWorkflowResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.formance.formance_sdk.models.operations.V2RunWorkflowRequest](../../models/operations/V2RunWorkflowRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.formance.formance_sdk.models.operations.V2RunWorkflowResponse](../../models/operations/V2RunWorkflowResponse.md)**


## v2SendEvent

Send an event to a running workflow

### Example Usage

```java
package hello.world;

import com.formance.formance_sdk.SDK;
import com.formance.formance_sdk.models.operations.V2SendEventRequest;
import com.formance.formance_sdk.models.operations.V2SendEventRequestBody;
import com.formance.formance_sdk.models.operations.V2SendEventResponse;
import com.formance.formance_sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    authorization = "";
                }})
                .build();

            V2SendEventRequest req = new V2SendEventRequest("string"){{
                requestBody = new V2SendEventRequestBody("string");
            }};            

            V2SendEventResponse res = sdk.orchestration.v2SendEvent(req);

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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [com.formance.formance_sdk.models.operations.V2SendEventRequest](../../models/operations/V2SendEventRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[com.formance.formance_sdk.models.operations.V2SendEventResponse](../../models/operations/V2SendEventResponse.md)**

