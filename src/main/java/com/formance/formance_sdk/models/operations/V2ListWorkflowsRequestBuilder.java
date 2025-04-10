/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2ListWorkflowsRequestBuilder {

    private V2ListWorkflowsRequest request;
    private final SDKMethodInterfaces.MethodCallV2ListWorkflows sdk;

    public V2ListWorkflowsRequestBuilder(SDKMethodInterfaces.MethodCallV2ListWorkflows sdk) {
        this.sdk = sdk;
    }

    public V2ListWorkflowsRequestBuilder request(V2ListWorkflowsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2ListWorkflowsResponse call() throws Exception {

        return sdk.listWorkflows(
            request);
    }
}
