/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class ReadTriggerRequestBuilder {

    private ReadTriggerRequest request;
    private final SDKMethodInterfaces.MethodCallReadTrigger sdk;

    public ReadTriggerRequestBuilder(SDKMethodInterfaces.MethodCallReadTrigger sdk) {
        this.sdk = sdk;
    }

    public ReadTriggerRequestBuilder request(com.formance.formance_sdk.models.operations.ReadTriggerRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ReadTriggerResponse call() throws Exception {

        return sdk.readTrigger(
            request);
    }
}
