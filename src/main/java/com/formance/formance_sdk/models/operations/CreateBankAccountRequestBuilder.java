/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.BankAccountRequest;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class CreateBankAccountRequestBuilder {

    private BankAccountRequest request;
    private final SDKMethodInterfaces.MethodCallCreateBankAccount sdk;

    public CreateBankAccountRequestBuilder(SDKMethodInterfaces.MethodCallCreateBankAccount sdk) {
        this.sdk = sdk;
    }

    public CreateBankAccountRequestBuilder request(BankAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateBankAccountResponse call() throws Exception {

        return sdk.createBankAccount(
            request);
    }
}
