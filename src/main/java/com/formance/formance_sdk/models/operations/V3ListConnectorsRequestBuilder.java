/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V3ListConnectorsRequestBuilder {

    private V3ListConnectorsRequest request;
    private final SDKMethodInterfaces.MethodCallV3ListConnectors sdk;

    public V3ListConnectorsRequestBuilder(SDKMethodInterfaces.MethodCallV3ListConnectors sdk) {
        this.sdk = sdk;
    }

    public V3ListConnectorsRequestBuilder request(V3ListConnectorsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3ListConnectorsResponse call() throws Exception {

        return sdk.listConnectors(
            request);
    }
}
