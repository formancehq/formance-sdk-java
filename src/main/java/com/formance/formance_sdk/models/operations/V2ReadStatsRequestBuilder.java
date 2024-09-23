/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V2ReadStatsRequestBuilder {

    private V2ReadStatsRequest request;
    private final SDKMethodInterfaces.MethodCallV2ReadStats sdk;

    public V2ReadStatsRequestBuilder(SDKMethodInterfaces.MethodCallV2ReadStats sdk) {
        this.sdk = sdk;
    }

    public V2ReadStatsRequestBuilder request(V2ReadStatsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2ReadStatsResponse call() throws Exception {

        return sdk.readStats(
            request);
    }
}
