/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class GetBalancesAggregatedResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.AggregateBalancesResponse> aggregateBalancesResponse;

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
    public GetBalancesAggregatedResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.AggregateBalancesResponse> aggregateBalancesResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(aggregateBalancesResponse, "aggregateBalancesResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.aggregateBalancesResponse = aggregateBalancesResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetBalancesAggregatedResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.AggregateBalancesResponse> aggregateBalancesResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.AggregateBalancesResponse>) aggregateBalancesResponse;
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
    public GetBalancesAggregatedResponse withAggregateBalancesResponse(com.formance.formance_sdk.models.shared.AggregateBalancesResponse aggregateBalancesResponse) {
        Utils.checkNotNull(aggregateBalancesResponse, "aggregateBalancesResponse");
        this.aggregateBalancesResponse = Optional.ofNullable(aggregateBalancesResponse);
        return this;
    }

    /**
     * OK
     */
    public GetBalancesAggregatedResponse withAggregateBalancesResponse(Optional<? extends com.formance.formance_sdk.models.shared.AggregateBalancesResponse> aggregateBalancesResponse) {
        Utils.checkNotNull(aggregateBalancesResponse, "aggregateBalancesResponse");
        this.aggregateBalancesResponse = aggregateBalancesResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetBalancesAggregatedResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetBalancesAggregatedResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBalancesAggregatedResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetBalancesAggregatedResponse other = (GetBalancesAggregatedResponse) o;
        return 
            java.util.Objects.deepEquals(this.aggregateBalancesResponse, other.aggregateBalancesResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            aggregateBalancesResponse,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBalancesAggregatedResponse.class,
                "aggregateBalancesResponse", aggregateBalancesResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.AggregateBalancesResponse> aggregateBalancesResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder aggregateBalancesResponse(com.formance.formance_sdk.models.shared.AggregateBalancesResponse aggregateBalancesResponse) {
            Utils.checkNotNull(aggregateBalancesResponse, "aggregateBalancesResponse");
            this.aggregateBalancesResponse = Optional.ofNullable(aggregateBalancesResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder aggregateBalancesResponse(Optional<? extends com.formance.formance_sdk.models.shared.AggregateBalancesResponse> aggregateBalancesResponse) {
            Utils.checkNotNull(aggregateBalancesResponse, "aggregateBalancesResponse");
            this.aggregateBalancesResponse = aggregateBalancesResponse;
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
        
        public GetBalancesAggregatedResponse build() {
            return new GetBalancesAggregatedResponse(
                aggregateBalancesResponse,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}

