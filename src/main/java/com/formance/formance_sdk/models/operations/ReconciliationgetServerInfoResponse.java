/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.ServerInfo;
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


public class ReconciliationgetServerInfoResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Server information
     */
    private Optional<? extends ServerInfo> serverInfo;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ReconciliationgetServerInfoResponse(
            String contentType,
            Optional<? extends ServerInfo> serverInfo,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(serverInfo, "serverInfo");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.serverInfo = serverInfo;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ReconciliationgetServerInfoResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Server information
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ServerInfo> serverInfo() {
        return (Optional<ServerInfo>) serverInfo;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ReconciliationgetServerInfoResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Server information
     */
    public ReconciliationgetServerInfoResponse withServerInfo(ServerInfo serverInfo) {
        Utils.checkNotNull(serverInfo, "serverInfo");
        this.serverInfo = Optional.ofNullable(serverInfo);
        return this;
    }

    /**
     * Server information
     */
    public ReconciliationgetServerInfoResponse withServerInfo(Optional<? extends ServerInfo> serverInfo) {
        Utils.checkNotNull(serverInfo, "serverInfo");
        this.serverInfo = serverInfo;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ReconciliationgetServerInfoResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ReconciliationgetServerInfoResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ReconciliationgetServerInfoResponse other = (ReconciliationgetServerInfoResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.serverInfo, other.serverInfo) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            serverInfo,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconciliationgetServerInfoResponse.class,
                "contentType", contentType,
                "serverInfo", serverInfo,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends ServerInfo> serverInfo = Optional.empty();
 
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
         * Server information
         */
        public Builder serverInfo(ServerInfo serverInfo) {
            Utils.checkNotNull(serverInfo, "serverInfo");
            this.serverInfo = Optional.ofNullable(serverInfo);
            return this;
        }

        /**
         * Server information
         */
        public Builder serverInfo(Optional<? extends ServerInfo> serverInfo) {
            Utils.checkNotNull(serverInfo, "serverInfo");
            this.serverInfo = serverInfo;
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
        
        public ReconciliationgetServerInfoResponse build() {
            return new ReconciliationgetServerInfoResponse(
                contentType,
                serverInfo,
                statusCode,
                rawResponse);
        }
    }
}

