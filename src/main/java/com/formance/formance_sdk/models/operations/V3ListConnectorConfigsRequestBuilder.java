/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import java.lang.Exception;

public class V3ListConnectorConfigsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallV3ListConnectorConfigs sdk;

    public V3ListConnectorConfigsRequestBuilder(SDKMethodInterfaces.MethodCallV3ListConnectorConfigs sdk) {
        this.sdk = sdk;
    }

    public V3ListConnectorConfigsResponse call() throws Exception {

        return sdk.listConnectorConfigsDirect();
    }
}
