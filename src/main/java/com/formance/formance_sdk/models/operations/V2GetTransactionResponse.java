/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class V2GetTransactionResponse implements Response {

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
    private Optional<? extends com.formance.formance_sdk.models.shared.V2GetTransactionResponse> v2GetTransactionResponse;

    @JsonCreator
    public V2GetTransactionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2GetTransactionResponse> v2GetTransactionResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2GetTransactionResponse, "v2GetTransactionResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2GetTransactionResponse = v2GetTransactionResponse;
    }
    
    public V2GetTransactionResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.V2GetTransactionResponse> v2GetTransactionResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2GetTransactionResponse>) v2GetTransactionResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V2GetTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2GetTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2GetTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V2GetTransactionResponse withV2GetTransactionResponse(com.formance.formance_sdk.models.shared.V2GetTransactionResponse v2GetTransactionResponse) {
        Utils.checkNotNull(v2GetTransactionResponse, "v2GetTransactionResponse");
        this.v2GetTransactionResponse = Optional.ofNullable(v2GetTransactionResponse);
        return this;
    }

    /**
     * OK
     */
    public V2GetTransactionResponse withV2GetTransactionResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2GetTransactionResponse> v2GetTransactionResponse) {
        Utils.checkNotNull(v2GetTransactionResponse, "v2GetTransactionResponse");
        this.v2GetTransactionResponse = v2GetTransactionResponse;
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
        V2GetTransactionResponse other = (V2GetTransactionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2GetTransactionResponse, other.v2GetTransactionResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2GetTransactionResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetTransactionResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2GetTransactionResponse", v2GetTransactionResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2GetTransactionResponse> v2GetTransactionResponse = Optional.empty();
        
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
        public Builder v2GetTransactionResponse(com.formance.formance_sdk.models.shared.V2GetTransactionResponse v2GetTransactionResponse) {
            Utils.checkNotNull(v2GetTransactionResponse, "v2GetTransactionResponse");
            this.v2GetTransactionResponse = Optional.ofNullable(v2GetTransactionResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2GetTransactionResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2GetTransactionResponse> v2GetTransactionResponse) {
            Utils.checkNotNull(v2GetTransactionResponse, "v2GetTransactionResponse");
            this.v2GetTransactionResponse = v2GetTransactionResponse;
            return this;
        }
        
        public V2GetTransactionResponse build() {
            return new V2GetTransactionResponse(
                contentType,
                statusCode,
                rawResponse,
                v2GetTransactionResponse);
        }
    }
}
