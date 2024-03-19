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


public class ListLogsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.LogsCursorResponse> logsCursorResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ListLogsResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.LogsCursorResponse> logsCursorResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(errorResponse, "errorResponse");
        Utils.checkNotNull(logsCursorResponse, "logsCursorResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.errorResponse = errorResponse;
        this.logsCursorResponse = logsCursorResponse;
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
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.LogsCursorResponse> logsCursorResponse() {
        return logsCursorResponse;
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
    public ListLogsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Error
     */
    public ListLogsResponse withErrorResponse(com.formance.formance_sdk.models.errors.ErrorResponse errorResponse) {
        Utils.checkNotNull(errorResponse, "errorResponse");
        this.errorResponse = Optional.ofNullable(errorResponse);
        return this;
    }

    /**
     * Error
     */
    public ListLogsResponse withErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse) {
        Utils.checkNotNull(errorResponse, "errorResponse");
        this.errorResponse = errorResponse;
        return this;
    }

    /**
     * OK
     */
    public ListLogsResponse withLogsCursorResponse(com.formance.formance_sdk.models.shared.LogsCursorResponse logsCursorResponse) {
        Utils.checkNotNull(logsCursorResponse, "logsCursorResponse");
        this.logsCursorResponse = Optional.ofNullable(logsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public ListLogsResponse withLogsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.LogsCursorResponse> logsCursorResponse) {
        Utils.checkNotNull(logsCursorResponse, "logsCursorResponse");
        this.logsCursorResponse = logsCursorResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListLogsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListLogsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListLogsResponse other = (ListLogsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.errorResponse, other.errorResponse) &&
            java.util.Objects.deepEquals(this.logsCursorResponse, other.logsCursorResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            errorResponse,
            logsCursorResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListLogsResponse.class,
                "contentType", contentType,
                "errorResponse", errorResponse,
                "logsCursorResponse", logsCursorResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.ErrorResponse> errorResponse = Optional.empty();
 
        private Optional<? extends com.formance.formance_sdk.models.shared.LogsCursorResponse> logsCursorResponse = Optional.empty();
 
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
         * OK
         */
        public Builder logsCursorResponse(com.formance.formance_sdk.models.shared.LogsCursorResponse logsCursorResponse) {
            Utils.checkNotNull(logsCursorResponse, "logsCursorResponse");
            this.logsCursorResponse = Optional.ofNullable(logsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder logsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.LogsCursorResponse> logsCursorResponse) {
            Utils.checkNotNull(logsCursorResponse, "logsCursorResponse");
            this.logsCursorResponse = logsCursorResponse;
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
        
        public ListLogsResponse build() {
            return new ListLogsResponse(
                contentType,
                errorResponse,
                logsCursorResponse,
                statusCode,
                rawResponse);
        }
    }
}
