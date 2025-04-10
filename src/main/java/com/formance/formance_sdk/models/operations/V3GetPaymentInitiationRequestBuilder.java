/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V3GetPaymentInitiationRequestBuilder {

    private V3GetPaymentInitiationRequest request;
    private final SDKMethodInterfaces.MethodCallV3GetPaymentInitiation sdk;

    public V3GetPaymentInitiationRequestBuilder(SDKMethodInterfaces.MethodCallV3GetPaymentInitiation sdk) {
        this.sdk = sdk;
    }

    public V3GetPaymentInitiationRequestBuilder request(V3GetPaymentInitiationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3GetPaymentInitiationResponse call() throws Exception {

        return sdk.getPaymentInitiation(
            request);
    }
}
