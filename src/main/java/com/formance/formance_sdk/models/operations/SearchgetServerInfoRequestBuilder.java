/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import java.lang.Exception;

public class SearchgetServerInfoRequestBuilder {

    private final SDKMethodInterfaces.MethodCallSearchgetServerInfo sdk;

    public SearchgetServerInfoRequestBuilder(SDKMethodInterfaces.MethodCallSearchgetServerInfo sdk) {
        this.sdk = sdk;
    }

    public SearchgetServerInfoResponse call() throws Exception {

        return sdk.searchgetServerInfoDirect();
    }
}
