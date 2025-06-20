/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class DebitWalletResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Wallet successfully debited as a pending hold
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public DebitWalletResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(debitWalletResponse, "debitWalletResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.debitWalletResponse = debitWalletResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public DebitWalletResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Wallet successfully debited as a pending hold
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.DebitWalletResponse>) debitWalletResponse;
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
     * HTTP response content type for this operation
     */
    public DebitWalletResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Wallet successfully debited as a pending hold
     */
    public DebitWalletResponse withDebitWalletResponse(com.formance.formance_sdk.models.shared.DebitWalletResponse debitWalletResponse) {
        Utils.checkNotNull(debitWalletResponse, "debitWalletResponse");
        this.debitWalletResponse = Optional.ofNullable(debitWalletResponse);
        return this;
    }

    /**
     * Wallet successfully debited as a pending hold
     */
    public DebitWalletResponse withDebitWalletResponse(Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse) {
        Utils.checkNotNull(debitWalletResponse, "debitWalletResponse");
        this.debitWalletResponse = debitWalletResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public DebitWalletResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public DebitWalletResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        DebitWalletResponse other = (DebitWalletResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.debitWalletResponse, other.debitWalletResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            debitWalletResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DebitWalletResponse.class,
                "contentType", contentType,
                "debitWalletResponse", debitWalletResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
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
         * Wallet successfully debited as a pending hold
         */
        public Builder debitWalletResponse(com.formance.formance_sdk.models.shared.DebitWalletResponse debitWalletResponse) {
            Utils.checkNotNull(debitWalletResponse, "debitWalletResponse");
            this.debitWalletResponse = Optional.ofNullable(debitWalletResponse);
            return this;
        }

        /**
         * Wallet successfully debited as a pending hold
         */
        public Builder debitWalletResponse(Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse) {
            Utils.checkNotNull(debitWalletResponse, "debitWalletResponse");
            this.debitWalletResponse = debitWalletResponse;
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
        
        public DebitWalletResponse build() {
            return new DebitWalletResponse(
                contentType,
                debitWalletResponse,
                statusCode,
                rawResponse);
        }
    }
}
