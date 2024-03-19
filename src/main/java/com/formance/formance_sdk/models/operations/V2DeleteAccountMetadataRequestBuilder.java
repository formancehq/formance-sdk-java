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


public class V2DeleteAccountMetadataRequestBuilder {

    private V2DeleteAccountMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallV2DeleteAccountMetadata sdk;

    public V2DeleteAccountMetadataRequestBuilder(SDKMethodInterfaces.MethodCallV2DeleteAccountMetadata sdk) {
        this.sdk = sdk;
    }

    public V2DeleteAccountMetadataRequestBuilder request(V2DeleteAccountMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V2DeleteAccountMetadataResponse call() throws Exception {

        return sdk.v2DeleteAccountMetadata(
            request);
    }
}
