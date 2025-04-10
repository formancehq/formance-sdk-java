/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class GetBalancesAggregatedRequestBuilder {

    private GetBalancesAggregatedRequest request;
    private final SDKMethodInterfaces.MethodCallGetBalancesAggregated sdk;

    public GetBalancesAggregatedRequestBuilder(SDKMethodInterfaces.MethodCallGetBalancesAggregated sdk) {
        this.sdk = sdk;
    }

    public GetBalancesAggregatedRequestBuilder request(GetBalancesAggregatedRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBalancesAggregatedResponse call() throws Exception {

        return sdk.getBalancesAggregated(
            request);
    }
}
