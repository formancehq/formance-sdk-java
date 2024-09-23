/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class GetAccountRequestBuilder {

    private GetAccountRequest request;
    private final SDKMethodInterfaces.MethodCallGetAccount sdk;

    public GetAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetAccount sdk) {
        this.sdk = sdk;
    }

    public GetAccountRequestBuilder request(GetAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountResponse call() throws Exception {

        return sdk.getAccount(
            request);
    }
}
