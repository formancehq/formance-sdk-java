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


public class V3UninstallConnectorResponse implements Response {

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
    private Optional<? extends com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse> v3UninstallConnectorResponse;

    @JsonCreator
    public V3UninstallConnectorResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse> v3UninstallConnectorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3UninstallConnectorResponse, "v3UninstallConnectorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3UninstallConnectorResponse = v3UninstallConnectorResponse;
    }
    
    public V3UninstallConnectorResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse> v3UninstallConnectorResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse>) v3UninstallConnectorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3UninstallConnectorResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3UninstallConnectorResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3UninstallConnectorResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Accepted
     */
    public V3UninstallConnectorResponse withV3UninstallConnectorResponse(com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse v3UninstallConnectorResponse) {
        Utils.checkNotNull(v3UninstallConnectorResponse, "v3UninstallConnectorResponse");
        this.v3UninstallConnectorResponse = Optional.ofNullable(v3UninstallConnectorResponse);
        return this;
    }

    /**
     * Accepted
     */
    public V3UninstallConnectorResponse withV3UninstallConnectorResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse> v3UninstallConnectorResponse) {
        Utils.checkNotNull(v3UninstallConnectorResponse, "v3UninstallConnectorResponse");
        this.v3UninstallConnectorResponse = v3UninstallConnectorResponse;
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
        V3UninstallConnectorResponse other = (V3UninstallConnectorResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3UninstallConnectorResponse, other.v3UninstallConnectorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3UninstallConnectorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3UninstallConnectorResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3UninstallConnectorResponse", v3UninstallConnectorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse> v3UninstallConnectorResponse = Optional.empty();  
        
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
        public Builder v3UninstallConnectorResponse(com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse v3UninstallConnectorResponse) {
            Utils.checkNotNull(v3UninstallConnectorResponse, "v3UninstallConnectorResponse");
            this.v3UninstallConnectorResponse = Optional.ofNullable(v3UninstallConnectorResponse);
            return this;
        }

        /**
         * Accepted
         */
        public Builder v3UninstallConnectorResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3UninstallConnectorResponse> v3UninstallConnectorResponse) {
            Utils.checkNotNull(v3UninstallConnectorResponse, "v3UninstallConnectorResponse");
            this.v3UninstallConnectorResponse = v3UninstallConnectorResponse;
            return this;
        }
        
        public V3UninstallConnectorResponse build() {
            return new V3UninstallConnectorResponse(
                contentType,
                statusCode,
                rawResponse,
                v3UninstallConnectorResponse);
        }
    }
}

