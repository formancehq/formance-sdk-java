/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


public class ListClientsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallListClients sdk;

    public ListClientsRequestBuilder(SDKMethodInterfaces.MethodCallListClients sdk) {
        this.sdk = sdk;
    }

    public ListClientsResponse call() throws Exception {

        return sdk.listClientsDirect();
    }
}
