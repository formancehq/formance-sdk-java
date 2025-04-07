/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class ReadConnectorConfigRequestBuilder {

    private ReadConnectorConfigRequest request;
    private final SDKMethodInterfaces.MethodCallReadConnectorConfig sdk;

    public ReadConnectorConfigRequestBuilder(SDKMethodInterfaces.MethodCallReadConnectorConfig sdk) {
        this.sdk = sdk;
    }

    public ReadConnectorConfigRequestBuilder request(ReadConnectorConfigRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ReadConnectorConfigResponse call() throws Exception {

        return sdk.readConnectorConfig(
            request);
    }
}
