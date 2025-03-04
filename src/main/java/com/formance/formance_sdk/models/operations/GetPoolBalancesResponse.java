/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.PoolBalancesResponse;
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

public class GetPoolBalancesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends PoolBalancesResponse> poolBalancesResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetPoolBalancesResponse(
            String contentType,
            Optional<? extends PoolBalancesResponse> poolBalancesResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(poolBalancesResponse, "poolBalancesResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.poolBalancesResponse = poolBalancesResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetPoolBalancesResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PoolBalancesResponse> poolBalancesResponse() {
        return (Optional<PoolBalancesResponse>) poolBalancesResponse;
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
    public GetPoolBalancesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetPoolBalancesResponse withPoolBalancesResponse(PoolBalancesResponse poolBalancesResponse) {
        Utils.checkNotNull(poolBalancesResponse, "poolBalancesResponse");
        this.poolBalancesResponse = Optional.ofNullable(poolBalancesResponse);
        return this;
    }

    /**
     * OK
     */
    public GetPoolBalancesResponse withPoolBalancesResponse(Optional<? extends PoolBalancesResponse> poolBalancesResponse) {
        Utils.checkNotNull(poolBalancesResponse, "poolBalancesResponse");
        this.poolBalancesResponse = poolBalancesResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPoolBalancesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPoolBalancesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetPoolBalancesResponse other = (GetPoolBalancesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.poolBalancesResponse, other.poolBalancesResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            poolBalancesResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPoolBalancesResponse.class,
                "contentType", contentType,
                "poolBalancesResponse", poolBalancesResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends PoolBalancesResponse> poolBalancesResponse = Optional.empty();
 
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
         * OK
         */
        public Builder poolBalancesResponse(PoolBalancesResponse poolBalancesResponse) {
            Utils.checkNotNull(poolBalancesResponse, "poolBalancesResponse");
            this.poolBalancesResponse = Optional.ofNullable(poolBalancesResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder poolBalancesResponse(Optional<? extends PoolBalancesResponse> poolBalancesResponse) {
            Utils.checkNotNull(poolBalancesResponse, "poolBalancesResponse");
            this.poolBalancesResponse = poolBalancesResponse;
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
        
        public GetPoolBalancesResponse build() {
            return new GetPoolBalancesResponse(
                contentType,
                poolBalancesResponse,
                statusCode,
                rawResponse);
        }
    }
}

