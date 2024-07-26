/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class CreateBankAccountResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.BankAccountResponse> bankAccountResponse;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateBankAccountResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.BankAccountResponse> bankAccountResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.bankAccountResponse = bankAccountResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateBankAccountResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.BankAccountResponse> bankAccountResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.BankAccountResponse>) bankAccountResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public CreateBankAccountResponse withBankAccountResponse(com.formance.formance_sdk.models.shared.BankAccountResponse bankAccountResponse) {
        Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
        this.bankAccountResponse = Optional.ofNullable(bankAccountResponse);
        return this;
    }

    /**
     * OK
     */
    public CreateBankAccountResponse withBankAccountResponse(Optional<? extends com.formance.formance_sdk.models.shared.BankAccountResponse> bankAccountResponse) {
        Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
        this.bankAccountResponse = bankAccountResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateBankAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateBankAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateBankAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBankAccountResponse other = (CreateBankAccountResponse) o;
        return 
            java.util.Objects.deepEquals(this.bankAccountResponse, other.bankAccountResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankAccountResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBankAccountResponse.class,
                "bankAccountResponse", bankAccountResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.BankAccountResponse> bankAccountResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder bankAccountResponse(com.formance.formance_sdk.models.shared.BankAccountResponse bankAccountResponse) {
            Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
            this.bankAccountResponse = Optional.ofNullable(bankAccountResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder bankAccountResponse(Optional<? extends com.formance.formance_sdk.models.shared.BankAccountResponse> bankAccountResponse) {
            Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
            this.bankAccountResponse = bankAccountResponse;
            return this;
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public CreateBankAccountResponse build() {
            return new CreateBankAccountResponse(
                bankAccountResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

