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


public class CreateWalletRequestBuilder {

    private Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletRequest> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateWallet sdk;

    public CreateWalletRequestBuilder(SDKMethodInterfaces.MethodCallCreateWallet sdk) {
        this.sdk = sdk;
    }
                
    public CreateWalletRequestBuilder request(com.formance.formance_sdk.models.shared.CreateWalletRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateWalletRequestBuilder request(Optional<? extends com.formance.formance_sdk.models.shared.CreateWalletRequest> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateWalletResponse call() throws Exception {

        return sdk.createWallet(
            request);
    }
}