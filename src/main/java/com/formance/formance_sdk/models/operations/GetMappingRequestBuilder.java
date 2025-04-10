/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class GetMappingRequestBuilder {

    private GetMappingRequest request;
    private final SDKMethodInterfaces.MethodCallGetMapping sdk;

    public GetMappingRequestBuilder(SDKMethodInterfaces.MethodCallGetMapping sdk) {
        this.sdk = sdk;
    }

    public GetMappingRequestBuilder request(GetMappingRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMappingResponse call() throws Exception {

        return sdk.getMapping(
            request);
    }
}
