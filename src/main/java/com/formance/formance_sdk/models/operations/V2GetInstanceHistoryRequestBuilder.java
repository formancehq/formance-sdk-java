/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2GetInstanceHistoryRequestBuilder {

    private V2GetInstanceHistoryRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetInstanceHistory sdk;

    public V2GetInstanceHistoryRequestBuilder(SDKMethodInterfaces.MethodCallV2GetInstanceHistory sdk) {
        this.sdk = sdk;
    }

    public V2GetInstanceHistoryRequestBuilder request(V2GetInstanceHistoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetInstanceHistoryResponse call() throws Exception {

        return sdk.getInstanceHistory(
            request);
    }
}
