/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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


public class V2ListTransactionsRequestBuilder {

    private V2ListTransactionsRequest request;
    private final SDKMethodInterfaces.MethodCallV2ListTransactions sdk;

    public V2ListTransactionsRequestBuilder(SDKMethodInterfaces.MethodCallV2ListTransactions sdk) {
        this.sdk = sdk;
    }

    public V2ListTransactionsRequestBuilder request(V2ListTransactionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2ListTransactionsResponse call() throws Exception {

        return sdk.v2ListTransactions(
            request);
    }
}
