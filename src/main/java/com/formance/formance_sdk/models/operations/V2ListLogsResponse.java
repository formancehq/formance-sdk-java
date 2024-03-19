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


public class V2ListLogsResponse implements com.formance.formance_sdk.utils.Response {

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
     * Error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2LogsCursorResponse> v2LogsCursorResponse;

    public V2ListLogsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2LogsCursorResponse> v2LogsCursorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
        Utils.checkNotNull(v2LogsCursorResponse, "v2LogsCursorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2ErrorResponse = v2ErrorResponse;
        this.v2LogsCursorResponse = v2LogsCursorResponse;
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

    /**
     * Error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse() {
        return v2ErrorResponse;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.V2LogsCursorResponse> v2LogsCursorResponse() {
        return v2LogsCursorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2ListLogsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2ListLogsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2ListLogsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error
     */
    public V2ListLogsResponse withV2ErrorResponse(com.formance.formance_sdk.models.errors.V2ErrorResponse v2ErrorResponse) {
        Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
        this.v2ErrorResponse = Optional.ofNullable(v2ErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public V2ListLogsResponse withV2ErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse) {
        Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
        this.v2ErrorResponse = v2ErrorResponse;
        return this;
    }

    /**
     * OK
     */
    public V2ListLogsResponse withV2LogsCursorResponse(com.formance.formance_sdk.models.shared.V2LogsCursorResponse v2LogsCursorResponse) {
        Utils.checkNotNull(v2LogsCursorResponse, "v2LogsCursorResponse");
        this.v2LogsCursorResponse = Optional.ofNullable(v2LogsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public V2ListLogsResponse withV2LogsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2LogsCursorResponse> v2LogsCursorResponse) {
        Utils.checkNotNull(v2LogsCursorResponse, "v2LogsCursorResponse");
        this.v2LogsCursorResponse = v2LogsCursorResponse;
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
        V2ListLogsResponse other = (V2ListLogsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2ErrorResponse, other.v2ErrorResponse) &&
            java.util.Objects.deepEquals(this.v2LogsCursorResponse, other.v2LogsCursorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2ErrorResponse,
            v2LogsCursorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListLogsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2ErrorResponse", v2ErrorResponse,
                "v2LogsCursorResponse", v2LogsCursorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse = Optional.empty();
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2LogsCursorResponse> v2LogsCursorResponse = Optional.empty();  
        
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
         * Error
         */
        public Builder v2ErrorResponse(com.formance.formance_sdk.models.errors.V2ErrorResponse v2ErrorResponse) {
            Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
            this.v2ErrorResponse = Optional.ofNullable(v2ErrorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder v2ErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse) {
            Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
            this.v2ErrorResponse = v2ErrorResponse;
            return this;
        }

        /**
         * OK
         */
        public Builder v2LogsCursorResponse(com.formance.formance_sdk.models.shared.V2LogsCursorResponse v2LogsCursorResponse) {
            Utils.checkNotNull(v2LogsCursorResponse, "v2LogsCursorResponse");
            this.v2LogsCursorResponse = Optional.ofNullable(v2LogsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2LogsCursorResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2LogsCursorResponse> v2LogsCursorResponse) {
            Utils.checkNotNull(v2LogsCursorResponse, "v2LogsCursorResponse");
            this.v2LogsCursorResponse = v2LogsCursorResponse;
            return this;
        }
        
        public V2ListLogsResponse build() {
            return new V2ListLogsResponse(
                contentType,
                statusCode,
                rawResponse,
                v2ErrorResponse,
                v2LogsCursorResponse);
        }
    }
}

