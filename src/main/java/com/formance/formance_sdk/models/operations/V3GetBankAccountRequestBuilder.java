/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V3GetBankAccountRequestBuilder {

    private V3GetBankAccountRequest request;
    private final SDKMethodInterfaces.MethodCallV3GetBankAccount sdk;

    public V3GetBankAccountRequestBuilder(SDKMethodInterfaces.MethodCallV3GetBankAccount sdk) {
        this.sdk = sdk;
    }

    public V3GetBankAccountRequestBuilder request(V3GetBankAccountRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3GetBankAccountResponse call() throws Exception {

        return sdk.getBankAccount(
            request);
    }
}
