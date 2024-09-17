/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.BankAccountsCursor;
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


public class ListBankAccountsResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends BankAccountsCursor> bankAccountsCursor;

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
    public ListBankAccountsResponse(
            Optional<? extends BankAccountsCursor> bankAccountsCursor,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(bankAccountsCursor, "bankAccountsCursor");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.bankAccountsCursor = bankAccountsCursor;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListBankAccountsResponse(
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
    public Optional<BankAccountsCursor> bankAccountsCursor() {
        return (Optional<BankAccountsCursor>) bankAccountsCursor;
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
    public ListBankAccountsResponse withBankAccountsCursor(BankAccountsCursor bankAccountsCursor) {
        Utils.checkNotNull(bankAccountsCursor, "bankAccountsCursor");
        this.bankAccountsCursor = Optional.ofNullable(bankAccountsCursor);
        return this;
    }

    /**
     * OK
     */
    public ListBankAccountsResponse withBankAccountsCursor(Optional<? extends BankAccountsCursor> bankAccountsCursor) {
        Utils.checkNotNull(bankAccountsCursor, "bankAccountsCursor");
        this.bankAccountsCursor = bankAccountsCursor;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListBankAccountsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListBankAccountsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListBankAccountsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListBankAccountsResponse other = (ListBankAccountsResponse) o;
        return 
            Objects.deepEquals(this.bankAccountsCursor, other.bankAccountsCursor) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankAccountsCursor,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListBankAccountsResponse.class,
                "bankAccountsCursor", bankAccountsCursor,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends BankAccountsCursor> bankAccountsCursor = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder bankAccountsCursor(BankAccountsCursor bankAccountsCursor) {
            Utils.checkNotNull(bankAccountsCursor, "bankAccountsCursor");
            this.bankAccountsCursor = Optional.ofNullable(bankAccountsCursor);
            return this;
        }

        /**
         * OK
         */
        public Builder bankAccountsCursor(Optional<? extends BankAccountsCursor> bankAccountsCursor) {
            Utils.checkNotNull(bankAccountsCursor, "bankAccountsCursor");
            this.bankAccountsCursor = bankAccountsCursor;
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
        
        public ListBankAccountsResponse build() {
            return new ListBankAccountsResponse(
                bankAccountsCursor,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

