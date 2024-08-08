/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.Query;
import com.formance.formance_sdk.utils.Utils;

public class SearchRequestBuilder {

    private Query request;
    private final SDKMethodInterfaces.MethodCallSearch sdk;

    public SearchRequestBuilder(SDKMethodInterfaces.MethodCallSearch sdk) {
        this.sdk = sdk;
    }

    public SearchRequestBuilder request(com.formance.formance_sdk.models.shared.Query request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SearchResponse call() throws Exception {

        return sdk.search(
            request);
    }
}
