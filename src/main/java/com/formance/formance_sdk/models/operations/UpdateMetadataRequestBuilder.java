/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class UpdateMetadataRequestBuilder {

    private UpdateMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateMetadata sdk;

    public UpdateMetadataRequestBuilder(SDKMethodInterfaces.MethodCallUpdateMetadata sdk) {
        this.sdk = sdk;
    }

    public UpdateMetadataRequestBuilder request(UpdateMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateMetadataResponse call() throws Exception {

        return sdk.updateMetadata(
            request);
    }
}
