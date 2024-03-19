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


public class InsertConfigRequestBuilder {

    private com.formance.formance_sdk.models.shared.ConfigUser request;
    private final SDKMethodInterfaces.MethodCallInsertConfig sdk;

    public InsertConfigRequestBuilder(SDKMethodInterfaces.MethodCallInsertConfig sdk) {
        this.sdk = sdk;
    }

    public InsertConfigRequestBuilder request(com.formance.formance_sdk.models.shared.ConfigUser request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public InsertConfigResponse call() throws Exception {

        return sdk.insertConfig(
            request);
    }
}