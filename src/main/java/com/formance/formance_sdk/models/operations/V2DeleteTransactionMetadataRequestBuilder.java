/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2DeleteTransactionMetadataRequestBuilder {

    private V2DeleteTransactionMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallV2DeleteTransactionMetadata sdk;

    public V2DeleteTransactionMetadataRequestBuilder(SDKMethodInterfaces.MethodCallV2DeleteTransactionMetadata sdk) {
        this.sdk = sdk;
    }

    public V2DeleteTransactionMetadataRequestBuilder request(V2DeleteTransactionMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2DeleteTransactionMetadataResponse call() throws Exception {

        return sdk.deleteTransactionMetadata(
            request);
    }
}
