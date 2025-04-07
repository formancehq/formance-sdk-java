/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V3ListBankAccountsRequestBuilder {

    private V3ListBankAccountsRequest request;
    private final SDKMethodInterfaces.MethodCallV3ListBankAccounts sdk;

    public V3ListBankAccountsRequestBuilder(SDKMethodInterfaces.MethodCallV3ListBankAccounts sdk) {
        this.sdk = sdk;
    }

    public V3ListBankAccountsRequestBuilder request(V3ListBankAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3ListBankAccountsResponse call() throws Exception {

        return sdk.listBankAccounts(
            request);
    }
}
