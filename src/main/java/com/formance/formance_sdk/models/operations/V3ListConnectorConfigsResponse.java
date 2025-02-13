/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V3ConnectorConfigsResponse;
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


public class V3ListConnectorConfigsResponse implements Response {

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
    private Optional<? extends V3ConnectorConfigsResponse> v3ConnectorConfigsResponse;

    @JsonCreator
    public V3ListConnectorConfigsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V3ConnectorConfigsResponse> v3ConnectorConfigsResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3ConnectorConfigsResponse, "v3ConnectorConfigsResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3ConnectorConfigsResponse = v3ConnectorConfigsResponse;
    }
    
    public V3ListConnectorConfigsResponse(
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
    public Optional<V3ConnectorConfigsResponse> v3ConnectorConfigsResponse() {
        return (Optional<V3ConnectorConfigsResponse>) v3ConnectorConfigsResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3ListConnectorConfigsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3ListConnectorConfigsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3ListConnectorConfigsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V3ListConnectorConfigsResponse withV3ConnectorConfigsResponse(V3ConnectorConfigsResponse v3ConnectorConfigsResponse) {
        Utils.checkNotNull(v3ConnectorConfigsResponse, "v3ConnectorConfigsResponse");
        this.v3ConnectorConfigsResponse = Optional.ofNullable(v3ConnectorConfigsResponse);
        return this;
    }

    /**
     * OK
     */
    public V3ListConnectorConfigsResponse withV3ConnectorConfigsResponse(Optional<? extends V3ConnectorConfigsResponse> v3ConnectorConfigsResponse) {
        Utils.checkNotNull(v3ConnectorConfigsResponse, "v3ConnectorConfigsResponse");
        this.v3ConnectorConfigsResponse = v3ConnectorConfigsResponse;
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
        V3ListConnectorConfigsResponse other = (V3ListConnectorConfigsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3ConnectorConfigsResponse, other.v3ConnectorConfigsResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3ConnectorConfigsResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListConnectorConfigsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3ConnectorConfigsResponse", v3ConnectorConfigsResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V3ConnectorConfigsResponse> v3ConnectorConfigsResponse = Optional.empty();  
        
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
        public Builder v3ConnectorConfigsResponse(V3ConnectorConfigsResponse v3ConnectorConfigsResponse) {
            Utils.checkNotNull(v3ConnectorConfigsResponse, "v3ConnectorConfigsResponse");
            this.v3ConnectorConfigsResponse = Optional.ofNullable(v3ConnectorConfigsResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v3ConnectorConfigsResponse(Optional<? extends V3ConnectorConfigsResponse> v3ConnectorConfigsResponse) {
            Utils.checkNotNull(v3ConnectorConfigsResponse, "v3ConnectorConfigsResponse");
            this.v3ConnectorConfigsResponse = v3ConnectorConfigsResponse;
            return this;
        }
        
        public V3ListConnectorConfigsResponse build() {
            return new V3ListConnectorConfigsResponse(
                contentType,
                statusCode,
                rawResponse,
                v3ConnectorConfigsResponse);
        }
    }
}

