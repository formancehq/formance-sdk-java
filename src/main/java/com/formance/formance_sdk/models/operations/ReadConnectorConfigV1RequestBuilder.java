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


public class ReadConnectorConfigV1RequestBuilder {

    private ReadConnectorConfigV1Request request;
    private final SDKMethodInterfaces.MethodCallReadConnectorConfigV1 sdk;

    public ReadConnectorConfigV1RequestBuilder(SDKMethodInterfaces.MethodCallReadConnectorConfigV1 sdk) {
        this.sdk = sdk;
    }

    public ReadConnectorConfigV1RequestBuilder request(ReadConnectorConfigV1Request request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ReadConnectorConfigV1Response call() throws Exception {

        return sdk.readConnectorConfigV1(
            request);
    }
}
