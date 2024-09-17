/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V2GetWorkflowRequestBuilder {

    private V2GetWorkflowRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetWorkflow sdk;

    public V2GetWorkflowRequestBuilder(SDKMethodInterfaces.MethodCallV2GetWorkflow sdk) {
        this.sdk = sdk;
    }

    public V2GetWorkflowRequestBuilder request(com.formance.formance_sdk.models.operations.V2GetWorkflowRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetWorkflowResponse call() throws Exception {

        return sdk.getWorkflow(
            request);
    }
}
