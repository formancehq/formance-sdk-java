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

public class V3RetryPaymentInitiationResponse implements Response {

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
     * Accepted
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse> v3RetryPaymentInitiationResponse;

    @JsonCreator
    public V3RetryPaymentInitiationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse> v3RetryPaymentInitiationResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3RetryPaymentInitiationResponse, "v3RetryPaymentInitiationResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3RetryPaymentInitiationResponse = v3RetryPaymentInitiationResponse;
    }
    
    public V3RetryPaymentInitiationResponse(
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
     * Accepted
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse> v3RetryPaymentInitiationResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse>) v3RetryPaymentInitiationResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V3RetryPaymentInitiationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3RetryPaymentInitiationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3RetryPaymentInitiationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Accepted
     */
    public V3RetryPaymentInitiationResponse withV3RetryPaymentInitiationResponse(com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse v3RetryPaymentInitiationResponse) {
        Utils.checkNotNull(v3RetryPaymentInitiationResponse, "v3RetryPaymentInitiationResponse");
        this.v3RetryPaymentInitiationResponse = Optional.ofNullable(v3RetryPaymentInitiationResponse);
        return this;
    }

    /**
     * Accepted
     */
    public V3RetryPaymentInitiationResponse withV3RetryPaymentInitiationResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse> v3RetryPaymentInitiationResponse) {
        Utils.checkNotNull(v3RetryPaymentInitiationResponse, "v3RetryPaymentInitiationResponse");
        this.v3RetryPaymentInitiationResponse = v3RetryPaymentInitiationResponse;
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
        V3RetryPaymentInitiationResponse other = (V3RetryPaymentInitiationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3RetryPaymentInitiationResponse, other.v3RetryPaymentInitiationResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3RetryPaymentInitiationResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3RetryPaymentInitiationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3RetryPaymentInitiationResponse", v3RetryPaymentInitiationResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse> v3RetryPaymentInitiationResponse = Optional.empty();
        
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
         * Accepted
         */
        public Builder v3RetryPaymentInitiationResponse(com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse v3RetryPaymentInitiationResponse) {
            Utils.checkNotNull(v3RetryPaymentInitiationResponse, "v3RetryPaymentInitiationResponse");
            this.v3RetryPaymentInitiationResponse = Optional.ofNullable(v3RetryPaymentInitiationResponse);
            return this;
        }

        /**
         * Accepted
         */
        public Builder v3RetryPaymentInitiationResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3RetryPaymentInitiationResponse> v3RetryPaymentInitiationResponse) {
            Utils.checkNotNull(v3RetryPaymentInitiationResponse, "v3RetryPaymentInitiationResponse");
            this.v3RetryPaymentInitiationResponse = v3RetryPaymentInitiationResponse;
            return this;
        }
        
        public V3RetryPaymentInitiationResponse build() {
            return new V3RetryPaymentInitiationResponse(
                contentType,
                statusCode,
                rawResponse,
                v3RetryPaymentInitiationResponse);
        }
    }
}
