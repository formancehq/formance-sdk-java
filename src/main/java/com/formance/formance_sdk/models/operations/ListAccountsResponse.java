/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ListAccountsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.AccountsCursorResponse> accountsCursorResponse;

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

    public ListAccountsResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.AccountsCursorResponse> accountsCursorResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(accountsCursorResponse, "accountsCursorResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.accountsCursorResponse = accountsCursorResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.AccountsCursorResponse> accountsCursorResponse() {
        return accountsCursorResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public ListAccountsResponse withAccountsCursorResponse(com.formance.formance_sdk.models.shared.AccountsCursorResponse accountsCursorResponse) {
        Utils.checkNotNull(accountsCursorResponse, "accountsCursorResponse");
        this.accountsCursorResponse = Optional.ofNullable(accountsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public ListAccountsResponse withAccountsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.AccountsCursorResponse> accountsCursorResponse) {
        Utils.checkNotNull(accountsCursorResponse, "accountsCursorResponse");
        this.accountsCursorResponse = accountsCursorResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ListAccountsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListAccountsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAccountsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListAccountsResponse other = (ListAccountsResponse) o;
        return 
            java.util.Objects.deepEquals(this.accountsCursorResponse, other.accountsCursorResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountsCursorResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountsResponse.class,
                "accountsCursorResponse", accountsCursorResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.AccountsCursorResponse> accountsCursorResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder accountsCursorResponse(com.formance.formance_sdk.models.shared.AccountsCursorResponse accountsCursorResponse) {
            Utils.checkNotNull(accountsCursorResponse, "accountsCursorResponse");
            this.accountsCursorResponse = Optional.ofNullable(accountsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder accountsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.AccountsCursorResponse> accountsCursorResponse) {
            Utils.checkNotNull(accountsCursorResponse, "accountsCursorResponse");
            this.accountsCursorResponse = accountsCursorResponse;
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
        
        public ListAccountsResponse build() {
            return new ListAccountsResponse(
                accountsCursorResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

