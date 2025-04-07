/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class ActivateConfigRequestBuilder {

    private ActivateConfigRequest request;
    private final SDKMethodInterfaces.MethodCallActivateConfig sdk;

    public ActivateConfigRequestBuilder(SDKMethodInterfaces.MethodCallActivateConfig sdk) {
        this.sdk = sdk;
    }

    public ActivateConfigRequestBuilder request(ActivateConfigRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ActivateConfigResponse call() throws Exception {

        return sdk.activateConfig(
            request);
    }
}
