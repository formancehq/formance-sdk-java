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


public class CreatePoolRequestBuilder {

    private com.formance.formance_sdk.models.shared.PoolRequest request;
    private final SDKMethodInterfaces.MethodCallCreatePool sdk;

    public CreatePoolRequestBuilder(SDKMethodInterfaces.MethodCallCreatePool sdk) {
        this.sdk = sdk;
    }

    public CreatePoolRequestBuilder request(com.formance.formance_sdk.models.shared.PoolRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePoolResponse call() throws Exception {

        return sdk.createPool(
            request);
    }
}