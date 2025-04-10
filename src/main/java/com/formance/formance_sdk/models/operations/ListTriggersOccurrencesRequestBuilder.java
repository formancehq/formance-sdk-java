/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class ListTriggersOccurrencesRequestBuilder {

    private ListTriggersOccurrencesRequest request;
    private final SDKMethodInterfaces.MethodCallListTriggersOccurrences sdk;

    public ListTriggersOccurrencesRequestBuilder(SDKMethodInterfaces.MethodCallListTriggersOccurrences sdk) {
        this.sdk = sdk;
    }

    public ListTriggersOccurrencesRequestBuilder request(ListTriggersOccurrencesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTriggersOccurrencesResponse call() throws Exception {

        return sdk.listTriggersOccurrences(
            request);
    }
}
