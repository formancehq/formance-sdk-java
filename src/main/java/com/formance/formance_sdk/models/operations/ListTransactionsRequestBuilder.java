/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class ListTransactionsRequestBuilder {

    private ListTransactionsRequest request;
    private final SDKMethodInterfaces.MethodCallListTransactions sdk;

    public ListTransactionsRequestBuilder(SDKMethodInterfaces.MethodCallListTransactions sdk) {
        this.sdk = sdk;
    }

    public ListTransactionsRequestBuilder request(ListTransactionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTransactionsResponse call() throws Exception {

        return sdk.listTransactions(
            request);
    }
}
