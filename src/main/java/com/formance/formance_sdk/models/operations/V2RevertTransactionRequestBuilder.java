/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2RevertTransactionRequestBuilder {

    private V2RevertTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallV2RevertTransaction sdk;

    public V2RevertTransactionRequestBuilder(SDKMethodInterfaces.MethodCallV2RevertTransaction sdk) {
        this.sdk = sdk;
    }

    public V2RevertTransactionRequestBuilder request(V2RevertTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2RevertTransactionResponse call() throws Exception {

        return sdk.revertTransaction(
            request);
    }
}
