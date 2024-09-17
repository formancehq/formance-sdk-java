/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V2GetInstanceStageHistoryRequestBuilder {

    private V2GetInstanceStageHistoryRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetInstanceStageHistory sdk;

    public V2GetInstanceStageHistoryRequestBuilder(SDKMethodInterfaces.MethodCallV2GetInstanceStageHistory sdk) {
        this.sdk = sdk;
    }

    public V2GetInstanceStageHistoryRequestBuilder request(com.formance.formance_sdk.models.operations.V2GetInstanceStageHistoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetInstanceStageHistoryResponse call() throws Exception {

        return sdk.v2GetInstanceStageHistory(
            request);
    }
}
