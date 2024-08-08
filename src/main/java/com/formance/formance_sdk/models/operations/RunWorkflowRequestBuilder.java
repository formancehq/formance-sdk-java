/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class RunWorkflowRequestBuilder {

    private RunWorkflowRequest request;
    private final SDKMethodInterfaces.MethodCallRunWorkflow sdk;

    public RunWorkflowRequestBuilder(SDKMethodInterfaces.MethodCallRunWorkflow sdk) {
        this.sdk = sdk;
    }

    public RunWorkflowRequestBuilder request(com.formance.formance_sdk.models.operations.RunWorkflowRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RunWorkflowResponse call() throws Exception {

        return sdk.runWorkflow(
            request);
    }
}
