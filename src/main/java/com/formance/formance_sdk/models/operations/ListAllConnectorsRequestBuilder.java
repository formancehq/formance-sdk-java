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


public class ListAllConnectorsRequestBuilder {

    private final SDKMethodInterfaces.MethodCallListAllConnectors sdk;

    public ListAllConnectorsRequestBuilder(SDKMethodInterfaces.MethodCallListAllConnectors sdk) {
        this.sdk = sdk;
    }

    public ListAllConnectorsResponse call() throws Exception {

        return sdk.listAllConnectorsDirect();
    }
}
