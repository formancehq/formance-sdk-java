/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V2LedgerInfoResponse;
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

public class V2GetLedgerInfoResponse implements Response {

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
    private Optional<? extends V2LedgerInfoResponse> v2LedgerInfoResponse;

    @JsonCreator
    public V2GetLedgerInfoResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V2LedgerInfoResponse> v2LedgerInfoResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2LedgerInfoResponse, "v2LedgerInfoResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2LedgerInfoResponse = v2LedgerInfoResponse;
    }
    
    public V2GetLedgerInfoResponse(
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
    public Optional<V2LedgerInfoResponse> v2LedgerInfoResponse() {
        return (Optional<V2LedgerInfoResponse>) v2LedgerInfoResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V2GetLedgerInfoResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2GetLedgerInfoResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2GetLedgerInfoResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V2GetLedgerInfoResponse withV2LedgerInfoResponse(V2LedgerInfoResponse v2LedgerInfoResponse) {
        Utils.checkNotNull(v2LedgerInfoResponse, "v2LedgerInfoResponse");
        this.v2LedgerInfoResponse = Optional.ofNullable(v2LedgerInfoResponse);
        return this;
    }

    /**
     * OK
     */
    public V2GetLedgerInfoResponse withV2LedgerInfoResponse(Optional<? extends V2LedgerInfoResponse> v2LedgerInfoResponse) {
        Utils.checkNotNull(v2LedgerInfoResponse, "v2LedgerInfoResponse");
        this.v2LedgerInfoResponse = v2LedgerInfoResponse;
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
        V2GetLedgerInfoResponse other = (V2GetLedgerInfoResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2LedgerInfoResponse, other.v2LedgerInfoResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2LedgerInfoResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetLedgerInfoResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2LedgerInfoResponse", v2LedgerInfoResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V2LedgerInfoResponse> v2LedgerInfoResponse = Optional.empty();
        
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
        public Builder v2LedgerInfoResponse(V2LedgerInfoResponse v2LedgerInfoResponse) {
            Utils.checkNotNull(v2LedgerInfoResponse, "v2LedgerInfoResponse");
            this.v2LedgerInfoResponse = Optional.ofNullable(v2LedgerInfoResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2LedgerInfoResponse(Optional<? extends V2LedgerInfoResponse> v2LedgerInfoResponse) {
            Utils.checkNotNull(v2LedgerInfoResponse, "v2LedgerInfoResponse");
            this.v2LedgerInfoResponse = v2LedgerInfoResponse;
            return this;
        }
        
        public V2GetLedgerInfoResponse build() {
            return new V2GetLedgerInfoResponse(
                contentType,
                statusCode,
                rawResponse,
                v2LedgerInfoResponse);
        }
    }
}
