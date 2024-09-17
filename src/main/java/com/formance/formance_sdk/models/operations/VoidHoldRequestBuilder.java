/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class VoidHoldRequestBuilder {

    private VoidHoldRequest request;
    private final SDKMethodInterfaces.MethodCallVoidHold sdk;

    public VoidHoldRequestBuilder(SDKMethodInterfaces.MethodCallVoidHold sdk) {
        this.sdk = sdk;
    }

    public VoidHoldRequestBuilder request(com.formance.formance_sdk.models.operations.VoidHoldRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public VoidHoldResponse call() throws Exception {

        return sdk.voidHold(
            request);
    }
}
