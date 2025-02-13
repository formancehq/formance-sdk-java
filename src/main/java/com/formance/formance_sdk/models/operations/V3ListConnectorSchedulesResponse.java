/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V3ConnectorSchedulesCursorResponse;
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


public class V3ListConnectorSchedulesResponse implements Response {

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
    private Optional<? extends V3ConnectorSchedulesCursorResponse> v3ConnectorSchedulesCursorResponse;

    @JsonCreator
    public V3ListConnectorSchedulesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V3ConnectorSchedulesCursorResponse> v3ConnectorSchedulesCursorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3ConnectorSchedulesCursorResponse, "v3ConnectorSchedulesCursorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3ConnectorSchedulesCursorResponse = v3ConnectorSchedulesCursorResponse;
    }
    
    public V3ListConnectorSchedulesResponse(
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
    public Optional<V3ConnectorSchedulesCursorResponse> v3ConnectorSchedulesCursorResponse() {
        return (Optional<V3ConnectorSchedulesCursorResponse>) v3ConnectorSchedulesCursorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3ListConnectorSchedulesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3ListConnectorSchedulesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3ListConnectorSchedulesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V3ListConnectorSchedulesResponse withV3ConnectorSchedulesCursorResponse(V3ConnectorSchedulesCursorResponse v3ConnectorSchedulesCursorResponse) {
        Utils.checkNotNull(v3ConnectorSchedulesCursorResponse, "v3ConnectorSchedulesCursorResponse");
        this.v3ConnectorSchedulesCursorResponse = Optional.ofNullable(v3ConnectorSchedulesCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public V3ListConnectorSchedulesResponse withV3ConnectorSchedulesCursorResponse(Optional<? extends V3ConnectorSchedulesCursorResponse> v3ConnectorSchedulesCursorResponse) {
        Utils.checkNotNull(v3ConnectorSchedulesCursorResponse, "v3ConnectorSchedulesCursorResponse");
        this.v3ConnectorSchedulesCursorResponse = v3ConnectorSchedulesCursorResponse;
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
        V3ListConnectorSchedulesResponse other = (V3ListConnectorSchedulesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3ConnectorSchedulesCursorResponse, other.v3ConnectorSchedulesCursorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3ConnectorSchedulesCursorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListConnectorSchedulesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3ConnectorSchedulesCursorResponse", v3ConnectorSchedulesCursorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V3ConnectorSchedulesCursorResponse> v3ConnectorSchedulesCursorResponse = Optional.empty();  
        
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
        public Builder v3ConnectorSchedulesCursorResponse(V3ConnectorSchedulesCursorResponse v3ConnectorSchedulesCursorResponse) {
            Utils.checkNotNull(v3ConnectorSchedulesCursorResponse, "v3ConnectorSchedulesCursorResponse");
            this.v3ConnectorSchedulesCursorResponse = Optional.ofNullable(v3ConnectorSchedulesCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v3ConnectorSchedulesCursorResponse(Optional<? extends V3ConnectorSchedulesCursorResponse> v3ConnectorSchedulesCursorResponse) {
            Utils.checkNotNull(v3ConnectorSchedulesCursorResponse, "v3ConnectorSchedulesCursorResponse");
            this.v3ConnectorSchedulesCursorResponse = v3ConnectorSchedulesCursorResponse;
            return this;
        }
        
        public V3ListConnectorSchedulesResponse build() {
            return new V3ListConnectorSchedulesResponse(
                contentType,
                statusCode,
                rawResponse,
                v3ConnectorSchedulesCursorResponse);
        }
    }
}

