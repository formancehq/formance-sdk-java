/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class DeleteWorkflowRequestBuilder {

    private DeleteWorkflowRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteWorkflow sdk;

    public DeleteWorkflowRequestBuilder(SDKMethodInterfaces.MethodCallDeleteWorkflow sdk) {
        this.sdk = sdk;
    }

    public DeleteWorkflowRequestBuilder request(DeleteWorkflowRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteWorkflowResponse call() throws Exception {

        return sdk.deleteWorkflow(
            request);
    }
}
