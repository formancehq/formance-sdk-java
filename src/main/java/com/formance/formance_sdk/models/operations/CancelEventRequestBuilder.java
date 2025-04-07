/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class CancelEventRequestBuilder {

    private CancelEventRequest request;
    private final SDKMethodInterfaces.MethodCallCancelEvent sdk;

    public CancelEventRequestBuilder(SDKMethodInterfaces.MethodCallCancelEvent sdk) {
        this.sdk = sdk;
    }

    public CancelEventRequestBuilder request(CancelEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CancelEventResponse call() throws Exception {

        return sdk.cancelEvent(
            request);
    }
}
