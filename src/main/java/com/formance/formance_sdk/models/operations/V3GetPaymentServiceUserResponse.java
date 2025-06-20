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

public class V3GetPaymentServiceUserResponse implements Response {

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
    private Optional<? extends com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse> v3GetPaymentServiceUserResponse;

    @JsonCreator
    public V3GetPaymentServiceUserResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse> v3GetPaymentServiceUserResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3GetPaymentServiceUserResponse, "v3GetPaymentServiceUserResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3GetPaymentServiceUserResponse = v3GetPaymentServiceUserResponse;
    }
    
    public V3GetPaymentServiceUserResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse> v3GetPaymentServiceUserResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse>) v3GetPaymentServiceUserResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V3GetPaymentServiceUserResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3GetPaymentServiceUserResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3GetPaymentServiceUserResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V3GetPaymentServiceUserResponse withV3GetPaymentServiceUserResponse(com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse v3GetPaymentServiceUserResponse) {
        Utils.checkNotNull(v3GetPaymentServiceUserResponse, "v3GetPaymentServiceUserResponse");
        this.v3GetPaymentServiceUserResponse = Optional.ofNullable(v3GetPaymentServiceUserResponse);
        return this;
    }

    /**
     * OK
     */
    public V3GetPaymentServiceUserResponse withV3GetPaymentServiceUserResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse> v3GetPaymentServiceUserResponse) {
        Utils.checkNotNull(v3GetPaymentServiceUserResponse, "v3GetPaymentServiceUserResponse");
        this.v3GetPaymentServiceUserResponse = v3GetPaymentServiceUserResponse;
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
        V3GetPaymentServiceUserResponse other = (V3GetPaymentServiceUserResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3GetPaymentServiceUserResponse, other.v3GetPaymentServiceUserResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3GetPaymentServiceUserResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3GetPaymentServiceUserResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3GetPaymentServiceUserResponse", v3GetPaymentServiceUserResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse> v3GetPaymentServiceUserResponse = Optional.empty();
        
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
        public Builder v3GetPaymentServiceUserResponse(com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse v3GetPaymentServiceUserResponse) {
            Utils.checkNotNull(v3GetPaymentServiceUserResponse, "v3GetPaymentServiceUserResponse");
            this.v3GetPaymentServiceUserResponse = Optional.ofNullable(v3GetPaymentServiceUserResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v3GetPaymentServiceUserResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3GetPaymentServiceUserResponse> v3GetPaymentServiceUserResponse) {
            Utils.checkNotNull(v3GetPaymentServiceUserResponse, "v3GetPaymentServiceUserResponse");
            this.v3GetPaymentServiceUserResponse = v3GetPaymentServiceUserResponse;
            return this;
        }
        
        public V3GetPaymentServiceUserResponse build() {
            return new V3GetPaymentServiceUserResponse(
                contentType,
                statusCode,
                rawResponse,
                v3GetPaymentServiceUserResponse);
        }
    }
}
