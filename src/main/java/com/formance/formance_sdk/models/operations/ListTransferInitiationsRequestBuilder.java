/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class ListTransferInitiationsRequestBuilder {

    private ListTransferInitiationsRequest request;
    private final SDKMethodInterfaces.MethodCallListTransferInitiations sdk;

    public ListTransferInitiationsRequestBuilder(SDKMethodInterfaces.MethodCallListTransferInitiations sdk) {
        this.sdk = sdk;
    }

    public ListTransferInitiationsRequestBuilder request(com.formance.formance_sdk.models.operations.ListTransferInitiationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTransferInitiationsResponse call() throws Exception {

        return sdk.listTransferInitiations(
            request);
    }
}
