/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2CancelEventRequestBuilder {

    private V2CancelEventRequest request;
    private final SDKMethodInterfaces.MethodCallV2CancelEvent sdk;

    public V2CancelEventRequestBuilder(SDKMethodInterfaces.MethodCallV2CancelEvent sdk) {
        this.sdk = sdk;
    }

    public V2CancelEventRequestBuilder request(V2CancelEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2CancelEventResponse call() throws Exception {

        return sdk.cancelEvent(
            request);
    }
}
