/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import java.lang.Exception;

public class ListAllConnectorsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallListAllConnectors sdk;

    public ListAllConnectorsRequestBuilder(SDKMethodInterfaces.MethodCallListAllConnectors sdk) {
        this.sdk = sdk;
    }

    public ListAllConnectorsResponse call() throws Exception {

        return sdk.listAllConnectorsDirect();
    }
}
