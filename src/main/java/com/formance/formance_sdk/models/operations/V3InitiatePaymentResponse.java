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


public class V3InitiatePaymentResponse implements Response {

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
    private Optional<? extends com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse> v3InitiatePaymentResponse;

    @JsonCreator
    public V3InitiatePaymentResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse> v3InitiatePaymentResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3InitiatePaymentResponse, "v3InitiatePaymentResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3InitiatePaymentResponse = v3InitiatePaymentResponse;
    }
    
    public V3InitiatePaymentResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse> v3InitiatePaymentResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse>) v3InitiatePaymentResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3InitiatePaymentResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3InitiatePaymentResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3InitiatePaymentResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Accepted
     */
    public V3InitiatePaymentResponse withV3InitiatePaymentResponse(com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse v3InitiatePaymentResponse) {
        Utils.checkNotNull(v3InitiatePaymentResponse, "v3InitiatePaymentResponse");
        this.v3InitiatePaymentResponse = Optional.ofNullable(v3InitiatePaymentResponse);
        return this;
    }

    /**
     * Accepted
     */
    public V3InitiatePaymentResponse withV3InitiatePaymentResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse> v3InitiatePaymentResponse) {
        Utils.checkNotNull(v3InitiatePaymentResponse, "v3InitiatePaymentResponse");
        this.v3InitiatePaymentResponse = v3InitiatePaymentResponse;
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
        V3InitiatePaymentResponse other = (V3InitiatePaymentResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3InitiatePaymentResponse, other.v3InitiatePaymentResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3InitiatePaymentResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3InitiatePaymentResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3InitiatePaymentResponse", v3InitiatePaymentResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse> v3InitiatePaymentResponse = Optional.empty();  
        
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
        public Builder v3InitiatePaymentResponse(com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse v3InitiatePaymentResponse) {
            Utils.checkNotNull(v3InitiatePaymentResponse, "v3InitiatePaymentResponse");
            this.v3InitiatePaymentResponse = Optional.ofNullable(v3InitiatePaymentResponse);
            return this;
        }

        /**
         * Accepted
         */
        public Builder v3InitiatePaymentResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3InitiatePaymentResponse> v3InitiatePaymentResponse) {
            Utils.checkNotNull(v3InitiatePaymentResponse, "v3InitiatePaymentResponse");
            this.v3InitiatePaymentResponse = v3InitiatePaymentResponse;
            return this;
        }
        
        public V3InitiatePaymentResponse build() {
            return new V3InitiatePaymentResponse(
                contentType,
                statusCode,
                rawResponse,
                v3InitiatePaymentResponse);
        }
    }
}

