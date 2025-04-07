/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class CountTransactionsRequestBuilder {

    private CountTransactionsRequest request;
    private final SDKMethodInterfaces.MethodCallCountTransactions sdk;

    public CountTransactionsRequestBuilder(SDKMethodInterfaces.MethodCallCountTransactions sdk) {
        this.sdk = sdk;
    }

    public CountTransactionsRequestBuilder request(CountTransactionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CountTransactionsResponse call() throws Exception {

        return sdk.countTransactions(
            request);
    }
}
