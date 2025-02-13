/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V3DeletePaymentInitiationRequestBuilder {

    private V3DeletePaymentInitiationRequest request;
    private final SDKMethodInterfaces.MethodCallV3DeletePaymentInitiation sdk;

    public V3DeletePaymentInitiationRequestBuilder(SDKMethodInterfaces.MethodCallV3DeletePaymentInitiation sdk) {
        this.sdk = sdk;
    }

    public V3DeletePaymentInitiationRequestBuilder request(V3DeletePaymentInitiationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3DeletePaymentInitiationResponse call() throws Exception {

        return sdk.deletePaymentInitiation(
            request);
    }
}
