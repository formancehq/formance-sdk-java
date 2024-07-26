/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.models.errors.SDKError;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class V2CreateTriggerRequestBuilder {

    private Optional<? extends com.formance.formance_sdk.models.shared.V2TriggerData> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallV2CreateTrigger sdk;

    public V2CreateTriggerRequestBuilder(SDKMethodInterfaces.MethodCallV2CreateTrigger sdk) {
        this.sdk = sdk;
    }
                
    public V2CreateTriggerRequestBuilder request(com.formance.formance_sdk.models.shared.V2TriggerData request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public V2CreateTriggerRequestBuilder request(Optional<? extends com.formance.formance_sdk.models.shared.V2TriggerData> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2CreateTriggerResponse call() throws Exception {

        return sdk.v2CreateTrigger(
            request);
    }
}
