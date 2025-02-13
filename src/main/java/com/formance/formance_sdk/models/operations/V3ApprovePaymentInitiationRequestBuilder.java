/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V3ApprovePaymentInitiationRequestBuilder {

    private V3ApprovePaymentInitiationRequest request;
    private final SDKMethodInterfaces.MethodCallV3ApprovePaymentInitiation sdk;

    public V3ApprovePaymentInitiationRequestBuilder(SDKMethodInterfaces.MethodCallV3ApprovePaymentInitiation sdk) {
        this.sdk = sdk;
    }

    public V3ApprovePaymentInitiationRequestBuilder request(V3ApprovePaymentInitiationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3ApprovePaymentInitiationResponse call() throws Exception {

        return sdk.approvePaymentInitiation(
            request);
    }
}
