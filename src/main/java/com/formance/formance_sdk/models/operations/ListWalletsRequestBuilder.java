/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class ListWalletsRequestBuilder {

    private ListWalletsRequest request;
    private final SDKMethodInterfaces.MethodCallListWallets sdk;

    public ListWalletsRequestBuilder(SDKMethodInterfaces.MethodCallListWallets sdk) {
        this.sdk = sdk;
    }

    public ListWalletsRequestBuilder request(ListWalletsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListWalletsResponse call() throws Exception {

        return sdk.listWallets(
            request);
    }
}
