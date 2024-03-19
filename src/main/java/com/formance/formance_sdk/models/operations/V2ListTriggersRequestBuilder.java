/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class V2ListTriggersRequestBuilder {

    private final SDKMethodInterfaces.MethodCallV2ListTriggers sdk;

    public V2ListTriggersRequestBuilder(SDKMethodInterfaces.MethodCallV2ListTriggers sdk) {
        this.sdk = sdk;
    }

    public V2ListTriggersResponse call() throws Exception {

        return sdk.v2ListTriggersDirect();
    }
}
