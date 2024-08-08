/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.CreateWorkflowRequest;
import com.formance.formance_sdk.utils.Utils;
import java.util.Optional;

public class CreateWorkflowRequestBuilder {

    private Optional<? extends CreateWorkflowRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateWorkflow sdk;

    public CreateWorkflowRequestBuilder(SDKMethodInterfaces.MethodCallCreateWorkflow sdk) {
        this.sdk = sdk;
    }
                
    public CreateWorkflowRequestBuilder request(com.formance.formance_sdk.models.shared.CreateWorkflowRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateWorkflowRequestBuilder request(java.util.Optional<? extends com.formance.formance_sdk.models.shared.CreateWorkflowRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateWorkflowResponse call() throws Exception {

        return sdk.createWorkflow(
            request);
    }
}
