/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class UninstallConnectorV1RequestBuilder {

    private UninstallConnectorV1Request request;
    private final SDKMethodInterfaces.MethodCallUninstallConnectorV1 sdk;

    public UninstallConnectorV1RequestBuilder(SDKMethodInterfaces.MethodCallUninstallConnectorV1 sdk) {
        this.sdk = sdk;
    }

    public UninstallConnectorV1RequestBuilder request(UninstallConnectorV1Request request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UninstallConnectorV1Response call() throws Exception {

        return sdk.uninstallConnectorV1(
            request);
    }
}
