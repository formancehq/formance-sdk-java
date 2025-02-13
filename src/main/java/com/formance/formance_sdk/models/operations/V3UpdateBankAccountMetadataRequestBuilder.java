/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class V3UpdateBankAccountMetadataRequestBuilder {

    private V3UpdateBankAccountMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallV3UpdateBankAccountMetadata sdk;

    public V3UpdateBankAccountMetadataRequestBuilder(SDKMethodInterfaces.MethodCallV3UpdateBankAccountMetadata sdk) {
        this.sdk = sdk;
    }

    public V3UpdateBankAccountMetadataRequestBuilder request(V3UpdateBankAccountMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3UpdateBankAccountMetadataResponse call() throws Exception {

        return sdk.updateBankAccountMetadata(
            request);
    }
}
