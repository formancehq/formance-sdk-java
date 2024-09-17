/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class GetPoolBalancesRequestBuilder {

    private GetPoolBalancesRequest request;
    private final SDKMethodInterfaces.MethodCallGetPoolBalances sdk;

    public GetPoolBalancesRequestBuilder(SDKMethodInterfaces.MethodCallGetPoolBalances sdk) {
        this.sdk = sdk;
    }

    public GetPoolBalancesRequestBuilder request(com.formance.formance_sdk.models.operations.GetPoolBalancesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetPoolBalancesResponse call() throws Exception {

        return sdk.getPoolBalances(
            request);
    }
}
