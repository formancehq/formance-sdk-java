/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class GetWalletRequestBuilder {

    private GetWalletRequest request;
    private final SDKMethodInterfaces.MethodCallGetWallet sdk;

    public GetWalletRequestBuilder(SDKMethodInterfaces.MethodCallGetWallet sdk) {
        this.sdk = sdk;
    }

    public GetWalletRequestBuilder request(GetWalletRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetWalletResponse call() throws Exception {

        return sdk.getWallet(
            request);
    }
}
