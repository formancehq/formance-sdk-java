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


public class ListBankAccountsRequestBuilder {

    private ListBankAccountsRequest request;
    private final SDKMethodInterfaces.MethodCallListBankAccounts sdk;

    public ListBankAccountsRequestBuilder(SDKMethodInterfaces.MethodCallListBankAccounts sdk) {
        this.sdk = sdk;
    }

    public ListBankAccountsRequestBuilder request(ListBankAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListBankAccountsResponse call() throws Exception {

        return sdk.listBankAccounts(
            request);
    }
}
