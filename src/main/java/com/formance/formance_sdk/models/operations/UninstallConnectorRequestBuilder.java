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


public class UninstallConnectorRequestBuilder {

    private UninstallConnectorRequest request;
    private final SDKMethodInterfaces.MethodCallUninstallConnector sdk;

    public UninstallConnectorRequestBuilder(SDKMethodInterfaces.MethodCallUninstallConnector sdk) {
        this.sdk = sdk;
    }

    public UninstallConnectorRequestBuilder request(UninstallConnectorRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UninstallConnectorResponse call() throws Exception {

        return sdk.uninstallConnector(
            request);
    }
}
