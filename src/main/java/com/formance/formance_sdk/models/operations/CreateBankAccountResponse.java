/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.BankAccountResponse;
import com.formance.formance_sdk.utils.Response;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class CreateBankAccountResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends BankAccountResponse> bankAccountResponse;

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
            Optional<? extends BankAccountResponse> bankAccountResponse,
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
    public Optional<BankAccountResponse> bankAccountResponse() {
        return (Optional<BankAccountResponse>) bankAccountResponse;
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
    public CreateBankAccountResponse withBankAccountResponse(BankAccountResponse bankAccountResponse) {
        Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
        this.bankAccountResponse = Optional.ofNullable(bankAccountResponse);
        return this;
    }

    /**
     * OK
     */
    public CreateBankAccountResponse withBankAccountResponse(Optional<? extends BankAccountResponse> bankAccountResponse) {
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
            Objects.deepEquals(this.bankAccountResponse, other.bankAccountResponse) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends BankAccountResponse> bankAccountResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder bankAccountResponse(BankAccountResponse bankAccountResponse) {
            Utils.checkNotNull(bankAccountResponse, "bankAccountResponse");
            this.bankAccountResponse = Optional.ofNullable(bankAccountResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder bankAccountResponse(Optional<? extends BankAccountResponse> bankAccountResponse) {
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
