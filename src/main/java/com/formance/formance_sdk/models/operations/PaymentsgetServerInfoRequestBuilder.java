/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import java.lang.Exception;

public class PaymentsgetServerInfoRequestBuilder {

    private final SDKMethodInterfaces.MethodCallPaymentsgetServerInfo sdk;

    public PaymentsgetServerInfoRequestBuilder(SDKMethodInterfaces.MethodCallPaymentsgetServerInfo sdk) {
        this.sdk = sdk;
    }

    public PaymentsgetServerInfoResponse call() throws Exception {

        return sdk.paymentsgetServerInfoDirect();
    }
}
