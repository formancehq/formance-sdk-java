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


public class ChangeConfigSecretRequestBuilder {

    private ChangeConfigSecretRequest request;
    private final SDKMethodInterfaces.MethodCallChangeConfigSecret sdk;

    public ChangeConfigSecretRequestBuilder(SDKMethodInterfaces.MethodCallChangeConfigSecret sdk) {
        this.sdk = sdk;
    }

    public ChangeConfigSecretRequestBuilder request(ChangeConfigSecretRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ChangeConfigSecretResponse call() throws Exception {

        return sdk.changeConfigSecret(
            request);
    }
}
