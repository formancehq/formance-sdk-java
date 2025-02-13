/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V3ListPoolsRequestBuilder {

    private V3ListPoolsRequest request;
    private final SDKMethodInterfaces.MethodCallV3ListPools sdk;

    public V3ListPoolsRequestBuilder(SDKMethodInterfaces.MethodCallV3ListPools sdk) {
        this.sdk = sdk;
    }

    public V3ListPoolsRequestBuilder request(V3ListPoolsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3ListPoolsResponse call() throws Exception {

        return sdk.listPools(
            request);
    }
}
