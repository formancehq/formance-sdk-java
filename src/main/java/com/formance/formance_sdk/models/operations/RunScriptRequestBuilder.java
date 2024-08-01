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


public class RunScriptRequestBuilder {

    private RunScriptRequest request;
    private final SDKMethodInterfaces.MethodCallRunScript sdk;

    public RunScriptRequestBuilder(SDKMethodInterfaces.MethodCallRunScript sdk) {
        this.sdk = sdk;
    }

    public RunScriptRequestBuilder request(RunScriptRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RunScriptResponse call() throws Exception {

        return sdk.runScript(
            request);
    }
}
