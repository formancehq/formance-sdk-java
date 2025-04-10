/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2UpdateLedgerMetadataRequestBuilder {

    private V2UpdateLedgerMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallV2UpdateLedgerMetadata sdk;

    public V2UpdateLedgerMetadataRequestBuilder(SDKMethodInterfaces.MethodCallV2UpdateLedgerMetadata sdk) {
        this.sdk = sdk;
    }

    public V2UpdateLedgerMetadataRequestBuilder request(V2UpdateLedgerMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2UpdateLedgerMetadataResponse call() throws Exception {

        return sdk.updateLedgerMetadata(
            request);
    }
}
