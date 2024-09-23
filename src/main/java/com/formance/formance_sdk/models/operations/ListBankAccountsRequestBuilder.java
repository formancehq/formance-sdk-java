/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class ListBankAccountsRequestBuilder {

    private ListBankAccountsRequest request;
    private final SDKMethodInterfaces.MethodCallListBankAccounts sdk;

    public ListBankAccountsRequestBuilder(SDKMethodInterfaces.MethodCallListBankAccounts sdk) {
        this.sdk = sdk;
    }

    public ListBankAccountsRequestBuilder request(ListBankAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListBankAccountsResponse call() throws Exception {

        return sdk.listBankAccounts(
            request);
    }
}
