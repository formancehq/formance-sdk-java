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


public class DebitWalletResponse implements com.formance.formance_sdk.utils.Response {

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

    /**
     * Error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse;

    public DebitWalletResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(debitWalletResponse, "debitWalletResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.contentType = contentType;
        this.debitWalletResponse = debitWalletResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.walletsErrorResponse = walletsErrorResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Wallet successfully debited as a pending hold
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse() {
        return debitWalletResponse;
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

    /**
     * Error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse() {
        return walletsErrorResponse;
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

    /**
     * Error
     */
    public DebitWalletResponse withWalletsErrorResponse(com.formance.formance_sdk.models.errors.WalletsErrorResponse walletsErrorResponse) {
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.walletsErrorResponse = Optional.ofNullable(walletsErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public DebitWalletResponse withWalletsErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse) {
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.walletsErrorResponse = walletsErrorResponse;
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
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.debitWalletResponse, other.debitWalletResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.walletsErrorResponse, other.walletsErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            debitWalletResponse,
            statusCode,
            rawResponse,
            walletsErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DebitWalletResponse.class,
                "contentType", contentType,
                "debitWalletResponse", debitWalletResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "walletsErrorResponse", walletsErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.DebitWalletResponse> debitWalletResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse = Optional.empty();  
        
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

        /**
         * Error
         */
        public Builder walletsErrorResponse(com.formance.formance_sdk.models.errors.WalletsErrorResponse walletsErrorResponse) {
            Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
            this.walletsErrorResponse = Optional.ofNullable(walletsErrorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder walletsErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WalletsErrorResponse> walletsErrorResponse) {
            Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
            this.walletsErrorResponse = walletsErrorResponse;
            return this;
        }
        
        public DebitWalletResponse build() {
            return new DebitWalletResponse(
                contentType,
                debitWalletResponse,
                statusCode,
                rawResponse,
                walletsErrorResponse);
        }
    }
}

