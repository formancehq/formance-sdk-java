/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class GetBankAccountRequestBuilder {

    private GetBankAccountRequest request;
    private final SDKMethodInterfaces.MethodCallGetBankAccount sdk;

    public GetBankAccountRequestBuilder(SDKMethodInterfaces.MethodCallGetBankAccount sdk) {
        this.sdk = sdk;
    }

    public GetBankAccountRequestBuilder request(GetBankAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetBankAccountResponse call() throws Exception {

        return sdk.getBankAccount(
            request);
    }
}
