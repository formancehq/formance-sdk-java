/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


public class V2GetServerInfoRequestBuilder {

    private final SDKMethodInterfaces.MethodCallV2GetServerInfo sdk;

    public V2GetServerInfoRequestBuilder(SDKMethodInterfaces.MethodCallV2GetServerInfo sdk) {
        this.sdk = sdk;
    }

    public V2GetServerInfoResponse call() throws Exception {

        return sdk.getServerInfoDirect();
    }
}
