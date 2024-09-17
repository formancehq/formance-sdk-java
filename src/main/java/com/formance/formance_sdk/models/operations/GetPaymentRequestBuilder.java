/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class GetPaymentRequestBuilder {

    private GetPaymentRequest request;
    private final SDKMethodInterfaces.MethodCallGetPayment sdk;

    public GetPaymentRequestBuilder(SDKMethodInterfaces.MethodCallGetPayment sdk) {
        this.sdk = sdk;
    }

    public GetPaymentRequestBuilder request(com.formance.formance_sdk.models.operations.GetPaymentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetPaymentResponse call() throws Exception {

        return sdk.getPayment(
            request);
    }
}
