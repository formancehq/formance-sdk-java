/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2GetTransactionRequestBuilder {

    private V2GetTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetTransaction sdk;

    public V2GetTransactionRequestBuilder(SDKMethodInterfaces.MethodCallV2GetTransaction sdk) {
        this.sdk = sdk;
    }

    public V2GetTransactionRequestBuilder request(V2GetTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetTransactionResponse call() throws Exception {

        return sdk.getTransaction(
            request);
    }
}
