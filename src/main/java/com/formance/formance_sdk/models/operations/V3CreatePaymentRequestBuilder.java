/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.V3CreatePaymentRequest;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class V3CreatePaymentRequestBuilder {

    private Optional<? extends V3CreatePaymentRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3CreatePayment sdk;

    public V3CreatePaymentRequestBuilder(SDKMethodInterfaces.MethodCallV3CreatePayment sdk) {
        this.sdk = sdk;
    }
                
    public V3CreatePaymentRequestBuilder request(V3CreatePaymentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3CreatePaymentRequestBuilder request(Optional<? extends V3CreatePaymentRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3CreatePaymentResponse call() throws Exception {

        return sdk.createPayment(
            request);
    }
}
