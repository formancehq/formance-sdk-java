/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V2GetVolumesWithBalancesRequestBuilder {

    private V2GetVolumesWithBalancesRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetVolumesWithBalances sdk;

    public V2GetVolumesWithBalancesRequestBuilder(SDKMethodInterfaces.MethodCallV2GetVolumesWithBalances sdk) {
        this.sdk = sdk;
    }

    public V2GetVolumesWithBalancesRequestBuilder request(V2GetVolumesWithBalancesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetVolumesWithBalancesResponse call() throws Exception {

        return sdk.getVolumesWithBalances(
            request);
    }
}
