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


public class GetWalletSummaryResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Wallet summary
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.GetWalletSummaryResponse> getWalletSummaryResponse;

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
    private Optional<? extends com.formance.formance_sdk.models.shared.WalletsErrorResponse> walletsErrorResponse;

    public GetWalletSummaryResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.GetWalletSummaryResponse> getWalletSummaryResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.WalletsErrorResponse> walletsErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(getWalletSummaryResponse, "getWalletSummaryResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.contentType = contentType;
        this.getWalletSummaryResponse = getWalletSummaryResponse;
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
     * Wallet summary
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.GetWalletSummaryResponse> getWalletSummaryResponse() {
        return getWalletSummaryResponse;
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
    public Optional<? extends com.formance.formance_sdk.models.shared.WalletsErrorResponse> walletsErrorResponse() {
        return walletsErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetWalletSummaryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Wallet summary
     */
    public GetWalletSummaryResponse withGetWalletSummaryResponse(com.formance.formance_sdk.models.shared.GetWalletSummaryResponse getWalletSummaryResponse) {
        Utils.checkNotNull(getWalletSummaryResponse, "getWalletSummaryResponse");
        this.getWalletSummaryResponse = Optional.ofNullable(getWalletSummaryResponse);
        return this;
    }

    /**
     * Wallet summary
     */
    public GetWalletSummaryResponse withGetWalletSummaryResponse(Optional<? extends com.formance.formance_sdk.models.shared.GetWalletSummaryResponse> getWalletSummaryResponse) {
        Utils.checkNotNull(getWalletSummaryResponse, "getWalletSummaryResponse");
        this.getWalletSummaryResponse = getWalletSummaryResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetWalletSummaryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetWalletSummaryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error
     */
    public GetWalletSummaryResponse withWalletsErrorResponse(com.formance.formance_sdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
        Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
        this.walletsErrorResponse = Optional.ofNullable(walletsErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public GetWalletSummaryResponse withWalletsErrorResponse(Optional<? extends com.formance.formance_sdk.models.shared.WalletsErrorResponse> walletsErrorResponse) {
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
        GetWalletSummaryResponse other = (GetWalletSummaryResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.getWalletSummaryResponse, other.getWalletSummaryResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.walletsErrorResponse, other.walletsErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            getWalletSummaryResponse,
            statusCode,
            rawResponse,
            walletsErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWalletSummaryResponse.class,
                "contentType", contentType,
                "getWalletSummaryResponse", getWalletSummaryResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "walletsErrorResponse", walletsErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.GetWalletSummaryResponse> getWalletSummaryResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.WalletsErrorResponse> walletsErrorResponse = Optional.empty();  
        
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
         * Wallet summary
         */
        public Builder getWalletSummaryResponse(com.formance.formance_sdk.models.shared.GetWalletSummaryResponse getWalletSummaryResponse) {
            Utils.checkNotNull(getWalletSummaryResponse, "getWalletSummaryResponse");
            this.getWalletSummaryResponse = Optional.ofNullable(getWalletSummaryResponse);
            return this;
        }

        /**
         * Wallet summary
         */
        public Builder getWalletSummaryResponse(Optional<? extends com.formance.formance_sdk.models.shared.GetWalletSummaryResponse> getWalletSummaryResponse) {
            Utils.checkNotNull(getWalletSummaryResponse, "getWalletSummaryResponse");
            this.getWalletSummaryResponse = getWalletSummaryResponse;
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
        public Builder walletsErrorResponse(com.formance.formance_sdk.models.shared.WalletsErrorResponse walletsErrorResponse) {
            Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
            this.walletsErrorResponse = Optional.ofNullable(walletsErrorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder walletsErrorResponse(Optional<? extends com.formance.formance_sdk.models.shared.WalletsErrorResponse> walletsErrorResponse) {
            Utils.checkNotNull(walletsErrorResponse, "walletsErrorResponse");
            this.walletsErrorResponse = walletsErrorResponse;
            return this;
        }
        
        public GetWalletSummaryResponse build() {
            return new GetWalletSummaryResponse(
                contentType,
                getWalletSummaryResponse,
                statusCode,
                rawResponse,
                walletsErrorResponse);
        }
    }
}

