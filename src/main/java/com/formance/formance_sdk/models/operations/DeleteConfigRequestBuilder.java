/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class DeleteConfigRequestBuilder {

    private DeleteConfigRequest request;
    private final SDKMethodInterfaces.MethodCallDeleteConfig sdk;

    public DeleteConfigRequestBuilder(SDKMethodInterfaces.MethodCallDeleteConfig sdk) {
        this.sdk = sdk;
    }

    public DeleteConfigRequestBuilder request(DeleteConfigRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public DeleteConfigResponse call() throws Exception {

        return sdk.deleteConfig(
            request);
    }
}
