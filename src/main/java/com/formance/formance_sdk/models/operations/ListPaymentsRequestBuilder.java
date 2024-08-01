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


public class ListPaymentsRequestBuilder {

    private ListPaymentsRequest request;
    private final SDKMethodInterfaces.MethodCallListPayments sdk;

    public ListPaymentsRequestBuilder(SDKMethodInterfaces.MethodCallListPayments sdk) {
        this.sdk = sdk;
    }

    public ListPaymentsRequestBuilder request(ListPaymentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPaymentsResponse call() throws Exception {

        return sdk.listPayments(
            request);
    }
}
