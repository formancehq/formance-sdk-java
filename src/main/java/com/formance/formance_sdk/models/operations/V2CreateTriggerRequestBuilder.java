/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.models.shared.V2TriggerData;
import com.formance.formance_sdk.utils.Utils;
import java.util.Optional;

public class V2CreateTriggerRequestBuilder {

    private Optional<? extends V2TriggerData> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV2CreateTrigger sdk;

    public V2CreateTriggerRequestBuilder(SDKMethodInterfaces.MethodCallV2CreateTrigger sdk) {
        this.sdk = sdk;
    }
                
    public V2CreateTriggerRequestBuilder request(com.formance.formance_sdk.models.shared.V2TriggerData request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V2CreateTriggerRequestBuilder request(java.util.Optional<? extends com.formance.formance_sdk.models.shared.V2TriggerData> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2CreateTriggerResponse call() throws Exception {

        return sdk.v2CreateTrigger(
            request);
    }
}
