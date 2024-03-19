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


public class V2GetTransactionRequestBuilder {

    private V2GetTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallV2GetTransaction sdk;

    public V2GetTransactionRequestBuilder(SDKMethodInterfaces.MethodCallV2GetTransaction sdk) {
        this.sdk = sdk;
    }

    public V2GetTransactionRequestBuilder request(V2GetTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2GetTransactionResponse call() throws Exception {

        return sdk.v2GetTransaction(
            request);
    }
}
