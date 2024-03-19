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


public class AddMetadataOnTransactionResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public AddMetadataOnTransactionResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorResponse, "errorResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorResponse = errorResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse() {
        return errorResponse;
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
     * HTTP response content type for this operation
     */
    public AddMetadataOnTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Error
     */
    public AddMetadataOnTransactionResponse withErrorResponse(com.formance.formance_sdk.models.errors.ErrorResponse errorResponse) {
        Utils.checkNotNull(errorResponse, "errorResponse");
        this.errorResponse = Optional.ofNullable(errorResponse);
        return this;
    }

    /**
     * Error
     */
    public AddMetadataOnTransactionResponse withErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse) {
        Utils.checkNotNull(errorResponse, "errorResponse");
        this.errorResponse = errorResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public AddMetadataOnTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public AddMetadataOnTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        AddMetadataOnTransactionResponse other = (AddMetadataOnTransactionResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorResponse, other.errorResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddMetadataOnTransactionResponse.class,
                "contentType", contentType,
                "errorResponse", errorResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse = Optional.empty();
 
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
         * Error
         */
        public Builder errorResponse(com.formance.formance_sdk.models.errors.ErrorResponse errorResponse) {
            Utils.checkNotNull(errorResponse, "errorResponse");
            this.errorResponse = Optional.ofNullable(errorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder errorResponse(Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse) {
            Utils.checkNotNull(errorResponse, "errorResponse");
            this.errorResponse = errorResponse;
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
        
        public AddMetadataOnTransactionResponse build() {
            return new AddMetadataOnTransactionResponse(
                contentType,
                errorResponse,
                statusCode,
                rawResponse);
        }
    }
}

