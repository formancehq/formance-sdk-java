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


public class V2CountTransactionsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    private java.util.Map<String, java.util.List<String>> headers;

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

    public V2CountTransactionsResponse(
            String contentType,
            java.util.Map<String, java.util.List<String>> headers,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        headers = Utils.emptyMapIfNull(headers);
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
        this.contentType = contentType;
        this.headers = headers;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2ErrorResponse = v2ErrorResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    public java.util.Map<String, java.util.List<String>> headers() {
        return headers;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2CountTransactionsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public V2CountTransactionsResponse withHeaders(java.util.Map<String, java.util.List<String>> headers) {
        Utils.checkNotNull(headers, "headers");
        this.headers = headers;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2CountTransactionsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2CountTransactionsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error
     */
    public V2CountTransactionsResponse withV2ErrorResponse(com.formance.formance_sdk.models.errors.V2ErrorResponse v2ErrorResponse) {
        Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
        this.v2ErrorResponse = Optional.ofNullable(v2ErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public V2CountTransactionsResponse withV2ErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse) {
        Utils.checkNotNull(v2ErrorResponse, "v2ErrorResponse");
        this.v2ErrorResponse = v2ErrorResponse;
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
        V2CountTransactionsResponse other = (V2CountTransactionsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.headers, other.headers) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2ErrorResponse, other.v2ErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            headers,
            statusCode,
            rawResponse,
            v2ErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CountTransactionsResponse.class,
                "contentType", contentType,
                "headers", headers,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2ErrorResponse", v2ErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private java.util.Map<String, java.util.List<String>> headers;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.V2ErrorResponse> v2ErrorResponse = Optional.empty();  
        
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

        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            Utils.checkNotNull(headers, "headers");
            this.headers = headers;
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
        
        public V2CountTransactionsResponse build() {
            return new V2CountTransactionsResponse(
                contentType,
                headers,
                statusCode,
                rawResponse,
                v2ErrorResponse);
        }
    }
}

