/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.ConnectorConfigResponse;
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

public class ReadConnectorConfigResponse implements Response {

    /**
     * OK
     */
    private Optional<? extends ConnectorConfigResponse> connectorConfigResponse;

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

    @JsonCreator
    public ReadConnectorConfigResponse(
            Optional<? extends ConnectorConfigResponse> connectorConfigResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(connectorConfigResponse, "connectorConfigResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.connectorConfigResponse = connectorConfigResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ReadConnectorConfigResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConnectorConfigResponse> connectorConfigResponse() {
        return (Optional<ConnectorConfigResponse>) connectorConfigResponse;
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public ReadConnectorConfigResponse withConnectorConfigResponse(ConnectorConfigResponse connectorConfigResponse) {
        Utils.checkNotNull(connectorConfigResponse, "connectorConfigResponse");
        this.connectorConfigResponse = Optional.ofNullable(connectorConfigResponse);
        return this;
    }

    /**
     * OK
     */
    public ReadConnectorConfigResponse withConnectorConfigResponse(Optional<? extends ConnectorConfigResponse> connectorConfigResponse) {
        Utils.checkNotNull(connectorConfigResponse, "connectorConfigResponse");
        this.connectorConfigResponse = connectorConfigResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ReadConnectorConfigResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ReadConnectorConfigResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ReadConnectorConfigResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ReadConnectorConfigResponse other = (ReadConnectorConfigResponse) o;
        return 
            Objects.deepEquals(this.connectorConfigResponse, other.connectorConfigResponse) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectorConfigResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadConnectorConfigResponse.class,
                "connectorConfigResponse", connectorConfigResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends ConnectorConfigResponse> connectorConfigResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder connectorConfigResponse(ConnectorConfigResponse connectorConfigResponse) {
            Utils.checkNotNull(connectorConfigResponse, "connectorConfigResponse");
            this.connectorConfigResponse = Optional.ofNullable(connectorConfigResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder connectorConfigResponse(Optional<? extends ConnectorConfigResponse> connectorConfigResponse) {
            Utils.checkNotNull(connectorConfigResponse, "connectorConfigResponse");
            this.connectorConfigResponse = connectorConfigResponse;
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
        
        public ReadConnectorConfigResponse build() {
            return new ReadConnectorConfigResponse(
                connectorConfigResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

