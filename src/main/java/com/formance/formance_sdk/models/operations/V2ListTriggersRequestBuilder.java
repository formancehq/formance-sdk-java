/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2ListTriggersRequestBuilder {

    private V2ListTriggersRequest request;
    private final SDKMethodInterfaces.MethodCallV2ListTriggers sdk;

    public V2ListTriggersRequestBuilder(SDKMethodInterfaces.MethodCallV2ListTriggers sdk) {
        this.sdk = sdk;
    }

    public V2ListTriggersRequestBuilder request(V2ListTriggersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2ListTriggersResponse call() throws Exception {

        return sdk.listTriggers(
            request);
    }
}
