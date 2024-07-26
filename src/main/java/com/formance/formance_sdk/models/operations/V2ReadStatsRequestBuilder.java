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


public class V2ReadStatsRequestBuilder {

    private V2ReadStatsRequest request;
    private final SDKMethodInterfaces.MethodCallV2ReadStats sdk;

    public V2ReadStatsRequestBuilder(SDKMethodInterfaces.MethodCallV2ReadStats sdk) {
        this.sdk = sdk;
    }

    public V2ReadStatsRequestBuilder request(V2ReadStatsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2ReadStatsResponse call() throws Exception {

        return sdk.v2ReadStats(
            request);
    }
}
