/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class ListPaymentsRequestBuilder {

    private ListPaymentsRequest request;
    private final SDKMethodInterfaces.MethodCallListPayments sdk;

    public ListPaymentsRequestBuilder(SDKMethodInterfaces.MethodCallListPayments sdk) {
        this.sdk = sdk;
    }

    public ListPaymentsRequestBuilder request(ListPaymentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPaymentsResponse call() throws Exception {

        return sdk.listPayments(
            request);
    }
}
