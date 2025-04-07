/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class GetManyConfigsRequestBuilder {

    private GetManyConfigsRequest request;
    private final SDKMethodInterfaces.MethodCallGetManyConfigs sdk;

    public GetManyConfigsRequestBuilder(SDKMethodInterfaces.MethodCallGetManyConfigs sdk) {
        this.sdk = sdk;
    }

    public GetManyConfigsRequestBuilder request(GetManyConfigsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetManyConfigsResponse call() throws Exception {

        return sdk.getManyConfigs(
            request);
    }
}
