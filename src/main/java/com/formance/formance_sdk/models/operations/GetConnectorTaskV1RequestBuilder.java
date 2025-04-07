/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class GetConnectorTaskV1RequestBuilder {

    private GetConnectorTaskV1Request request;
    private final SDKMethodInterfaces.MethodCallGetConnectorTaskV1 sdk;

    public GetConnectorTaskV1RequestBuilder(SDKMethodInterfaces.MethodCallGetConnectorTaskV1 sdk) {
        this.sdk = sdk;
    }

    public GetConnectorTaskV1RequestBuilder request(GetConnectorTaskV1Request request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetConnectorTaskV1Response call() throws Exception {

        return sdk.getConnectorTaskV1(
            request);
    }
}
