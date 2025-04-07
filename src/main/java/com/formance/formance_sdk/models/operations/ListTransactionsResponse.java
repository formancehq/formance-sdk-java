/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.TransactionsCursorResponse;
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

public class ListTransactionsResponse implements Response {

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

    /**
     * OK
     */
    private Optional<? extends TransactionsCursorResponse> transactionsCursorResponse;

    @JsonCreator
    public ListTransactionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends TransactionsCursorResponse> transactionsCursorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(transactionsCursorResponse, "transactionsCursorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.transactionsCursorResponse = transactionsCursorResponse;
    }
    
    public ListTransactionsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
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

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransactionsCursorResponse> transactionsCursorResponse() {
        return (Optional<TransactionsCursorResponse>) transactionsCursorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public ListTransactionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListTransactionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListTransactionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public ListTransactionsResponse withTransactionsCursorResponse(TransactionsCursorResponse transactionsCursorResponse) {
        Utils.checkNotNull(transactionsCursorResponse, "transactionsCursorResponse");
        this.transactionsCursorResponse = Optional.ofNullable(transactionsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public ListTransactionsResponse withTransactionsCursorResponse(Optional<? extends TransactionsCursorResponse> transactionsCursorResponse) {
        Utils.checkNotNull(transactionsCursorResponse, "transactionsCursorResponse");
        this.transactionsCursorResponse = transactionsCursorResponse;
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
        ListTransactionsResponse other = (ListTransactionsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.transactionsCursorResponse, other.transactionsCursorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            transactionsCursorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTransactionsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "transactionsCursorResponse", transactionsCursorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends TransactionsCursorResponse> transactionsCursorResponse = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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

        /**
         * OK
         */
        public Builder transactionsCursorResponse(TransactionsCursorResponse transactionsCursorResponse) {
            Utils.checkNotNull(transactionsCursorResponse, "transactionsCursorResponse");
            this.transactionsCursorResponse = Optional.ofNullable(transactionsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder transactionsCursorResponse(Optional<? extends TransactionsCursorResponse> transactionsCursorResponse) {
            Utils.checkNotNull(transactionsCursorResponse, "transactionsCursorResponse");
            this.transactionsCursorResponse = transactionsCursorResponse;
            return this;
        }
        
        public ListTransactionsResponse build() {
            return new ListTransactionsResponse(
                contentType,
                statusCode,
                rawResponse,
                transactionsCursorResponse);
        }
    }
}
