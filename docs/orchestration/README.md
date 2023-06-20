# orchestration

### Available Operations

* [cancelEvent](#cancelevent) - Cancel a running workflow
* [createWorkflow](#createworkflow) - Create workflow
* [getInstance](#getinstance) - Get a workflow instance by id
* [getInstanceHistory](#getinstancehistory) - Get a workflow instance history by id
* [getInstanceStageHistory](#getinstancestagehistory) - Get a workflow instance stage history
* [getWorkflow](#getworkflow) - Get a flow by id
* [listInstances](#listinstances) - List instances of a workflow
* [listWorkflows](#listworkflows) - List registered workflows
* [orchestrationgetServerInfo](#orchestrationgetserverinfo) - Get server info
* [runWorkflow](#runworkflow) - Run workflow
* [sendEvent](#sendevent) - Send an event to a running workflow

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
                .setSecurity(new Security("cumque") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            CancelEventRequest req = new CancelEventRequest("facere");            

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
                .setSecurity(new Security("ea") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            com.formance.formance_sdk.models.shared.CreateWorkflowRequest req = new CreateWorkflowRequest(                new java.util.HashMap<String, Object>[]{{
                                add(new java.util.HashMap<String, Object>() {{
                                    put("accusamus", "non");
                                    put("occaecati", "enim");
                                    put("accusamus", "delectus");
                                }}),
                                add(new java.util.HashMap<String, Object>() {{
                                    put("provident", "nam");
                                    put("id", "blanditiis");
                                    put("deleniti", "sapiente");
                                }}),
                            }}) {{
                name = "Sandy Huels";
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
                .setSecurity(new Security("omnis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetInstanceRequest req = new GetInstanceRequest("molestiae");            

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
                .setSecurity(new Security("perferendis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetInstanceHistoryRequest req = new GetInstanceHistoryRequest("nihil");            

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
                .setSecurity(new Security("magnam") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetInstanceStageHistoryRequest req = new GetInstanceStageHistoryRequest("distinctio", 660174L);            

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
                .setSecurity(new Security("labore") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            GetWorkflowRequest req = new GetWorkflowRequest("labore");            

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
                .setSecurity(new Security("suscipit") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListInstancesRequest req = new ListInstancesRequest() {{
                running = false;
                workflowID = "natus";
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
                .setSecurity(new Security("nobis") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
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
                .setSecurity(new Security("eum") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
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
                .setSecurity(new Security("vero") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            RunWorkflowRequest req = new RunWorkflowRequest("aspernatur") {{
                requestBody = new java.util.HashMap<String, String>() {{
                    put("magnam", "et");
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
                .setSecurity(new Security("excepturi") {{
                    authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            SendEventRequest req = new SendEventRequest("ullam") {{
                requestBody = new SendEventRequestBody("provident");;
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
