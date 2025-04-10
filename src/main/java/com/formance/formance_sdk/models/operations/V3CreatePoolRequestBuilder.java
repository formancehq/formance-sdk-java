/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.V3CreatePoolRequest;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;
import java.util.Optional;

public class V3CreatePoolRequestBuilder {

    private Optional<? extends V3CreatePoolRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV3CreatePool sdk;

    public V3CreatePoolRequestBuilder(SDKMethodInterfaces.MethodCallV3CreatePool sdk) {
        this.sdk = sdk;
    }
                
    public V3CreatePoolRequestBuilder request(V3CreatePoolRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V3CreatePoolRequestBuilder request(Optional<? extends V3CreatePoolRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3CreatePoolResponse call() throws Exception {

        return sdk.createPool(
            request);
    }
}
