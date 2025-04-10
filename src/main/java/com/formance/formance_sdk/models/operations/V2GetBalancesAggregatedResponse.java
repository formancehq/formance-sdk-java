/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V2AggregateBalancesResponse;
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

public class V2GetBalancesAggregatedResponse implements Response {

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
    private Optional<? extends V2AggregateBalancesResponse> v2AggregateBalancesResponse;

    @JsonCreator
    public V2GetBalancesAggregatedResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V2AggregateBalancesResponse> v2AggregateBalancesResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2AggregateBalancesResponse, "v2AggregateBalancesResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2AggregateBalancesResponse = v2AggregateBalancesResponse;
    }
    
    public V2GetBalancesAggregatedResponse(
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
    public Optional<V2AggregateBalancesResponse> v2AggregateBalancesResponse() {
        return (Optional<V2AggregateBalancesResponse>) v2AggregateBalancesResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V2GetBalancesAggregatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2GetBalancesAggregatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2GetBalancesAggregatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V2GetBalancesAggregatedResponse withV2AggregateBalancesResponse(V2AggregateBalancesResponse v2AggregateBalancesResponse) {
        Utils.checkNotNull(v2AggregateBalancesResponse, "v2AggregateBalancesResponse");
        this.v2AggregateBalancesResponse = Optional.ofNullable(v2AggregateBalancesResponse);
        return this;
    }

    /**
     * OK
     */
    public V2GetBalancesAggregatedResponse withV2AggregateBalancesResponse(Optional<? extends V2AggregateBalancesResponse> v2AggregateBalancesResponse) {
        Utils.checkNotNull(v2AggregateBalancesResponse, "v2AggregateBalancesResponse");
        this.v2AggregateBalancesResponse = v2AggregateBalancesResponse;
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
        V2GetBalancesAggregatedResponse other = (V2GetBalancesAggregatedResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2AggregateBalancesResponse, other.v2AggregateBalancesResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2AggregateBalancesResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetBalancesAggregatedResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2AggregateBalancesResponse", v2AggregateBalancesResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V2AggregateBalancesResponse> v2AggregateBalancesResponse = Optional.empty();
        
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
        public Builder v2AggregateBalancesResponse(V2AggregateBalancesResponse v2AggregateBalancesResponse) {
            Utils.checkNotNull(v2AggregateBalancesResponse, "v2AggregateBalancesResponse");
            this.v2AggregateBalancesResponse = Optional.ofNullable(v2AggregateBalancesResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2AggregateBalancesResponse(Optional<? extends V2AggregateBalancesResponse> v2AggregateBalancesResponse) {
            Utils.checkNotNull(v2AggregateBalancesResponse, "v2AggregateBalancesResponse");
            this.v2AggregateBalancesResponse = v2AggregateBalancesResponse;
            return this;
        }
        
        public V2GetBalancesAggregatedResponse build() {
            return new V2GetBalancesAggregatedResponse(
                contentType,
                statusCode,
                rawResponse,
                v2AggregateBalancesResponse);
        }
    }
}
