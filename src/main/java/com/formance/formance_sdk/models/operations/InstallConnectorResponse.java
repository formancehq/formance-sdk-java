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


public class InstallConnectorResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ConnectorResponse> connectorResponse;

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

    public InstallConnectorResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.ConnectorResponse> connectorResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(connectorResponse, "connectorResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.connectorResponse = connectorResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ConnectorResponse> connectorResponse() {
        return connectorResponse;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public InstallConnectorResponse withConnectorResponse(com.formance.formance_sdk.models.shared.ConnectorResponse connectorResponse) {
        Utils.checkNotNull(connectorResponse, "connectorResponse");
        this.connectorResponse = Optional.ofNullable(connectorResponse);
        return this;
    }

    /**
     * OK
     */
    public InstallConnectorResponse withConnectorResponse(Optional<? extends com.formance.formance_sdk.models.shared.ConnectorResponse> connectorResponse) {
        Utils.checkNotNull(connectorResponse, "connectorResponse");
        this.connectorResponse = connectorResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public InstallConnectorResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public InstallConnectorResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public InstallConnectorResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        InstallConnectorResponse other = (InstallConnectorResponse) o;
        return 
            java.util.Objects.deepEquals(this.connectorResponse, other.connectorResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectorResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InstallConnectorResponse.class,
                "connectorResponse", connectorResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ConnectorResponse> connectorResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder connectorResponse(com.formance.formance_sdk.models.shared.ConnectorResponse connectorResponse) {
            Utils.checkNotNull(connectorResponse, "connectorResponse");
            this.connectorResponse = Optional.ofNullable(connectorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder connectorResponse(Optional<? extends com.formance.formance_sdk.models.shared.ConnectorResponse> connectorResponse) {
            Utils.checkNotNull(connectorResponse, "connectorResponse");
            this.connectorResponse = connectorResponse;
            return this;
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
        
        public InstallConnectorResponse build() {
            return new InstallConnectorResponse(
                connectorResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}
