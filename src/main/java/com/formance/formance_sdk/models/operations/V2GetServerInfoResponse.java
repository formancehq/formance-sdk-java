/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V2ServerInfo;
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

public class V2GetServerInfoResponse implements Response {

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
     * Server information
     */
    private Optional<? extends V2ServerInfo> v2ServerInfo;

    @JsonCreator
    public V2GetServerInfoResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V2ServerInfo> v2ServerInfo) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2ServerInfo, "v2ServerInfo");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2ServerInfo = v2ServerInfo;
    }
    
    public V2GetServerInfoResponse(
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
     * Server information
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ServerInfo> v2ServerInfo() {
        return (Optional<V2ServerInfo>) v2ServerInfo;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V2GetServerInfoResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2GetServerInfoResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2GetServerInfoResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Server information
     */
    public V2GetServerInfoResponse withV2ServerInfo(V2ServerInfo v2ServerInfo) {
        Utils.checkNotNull(v2ServerInfo, "v2ServerInfo");
        this.v2ServerInfo = Optional.ofNullable(v2ServerInfo);
        return this;
    }

    /**
     * Server information
     */
    public V2GetServerInfoResponse withV2ServerInfo(Optional<? extends V2ServerInfo> v2ServerInfo) {
        Utils.checkNotNull(v2ServerInfo, "v2ServerInfo");
        this.v2ServerInfo = v2ServerInfo;
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
        V2GetServerInfoResponse other = (V2GetServerInfoResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2ServerInfo, other.v2ServerInfo);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2ServerInfo);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetServerInfoResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2ServerInfo", v2ServerInfo);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V2ServerInfo> v2ServerInfo = Optional.empty();
        
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
         * Server information
         */
        public Builder v2ServerInfo(V2ServerInfo v2ServerInfo) {
            Utils.checkNotNull(v2ServerInfo, "v2ServerInfo");
            this.v2ServerInfo = Optional.ofNullable(v2ServerInfo);
            return this;
        }

        /**
         * Server information
         */
        public Builder v2ServerInfo(Optional<? extends V2ServerInfo> v2ServerInfo) {
            Utils.checkNotNull(v2ServerInfo, "v2ServerInfo");
            this.v2ServerInfo = v2ServerInfo;
            return this;
        }
        
        public V2GetServerInfoResponse build() {
            return new V2GetServerInfoResponse(
                contentType,
                statusCode,
                rawResponse,
                v2ServerInfo);
        }
    }
}
