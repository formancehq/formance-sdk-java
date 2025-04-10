/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V3GetPoolBalancesRequestBuilder {

    private V3GetPoolBalancesRequest request;
    private final SDKMethodInterfaces.MethodCallV3GetPoolBalances sdk;

    public V3GetPoolBalancesRequestBuilder(SDKMethodInterfaces.MethodCallV3GetPoolBalances sdk) {
        this.sdk = sdk;
    }

    public V3GetPoolBalancesRequestBuilder request(V3GetPoolBalancesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3GetPoolBalancesResponse call() throws Exception {

        return sdk.getPoolBalances(
            request);
    }
}
