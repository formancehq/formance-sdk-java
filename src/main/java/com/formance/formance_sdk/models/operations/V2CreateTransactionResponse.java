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


public class V2CreateTransactionResponse implements com.formance.formance_sdk.utils.Response {

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
    private Optional<? extends com.formance.formance_sdk.models.shared.V2CreateTransactionResponse> v2CreateTransactionResponse;

    @JsonCreator
    public V2CreateTransactionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2CreateTransactionResponse> v2CreateTransactionResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2CreateTransactionResponse, "v2CreateTransactionResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2CreateTransactionResponse = v2CreateTransactionResponse;
    }
    
    public V2CreateTransactionResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.V2CreateTransactionResponse> v2CreateTransactionResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2CreateTransactionResponse>) v2CreateTransactionResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2CreateTransactionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2CreateTransactionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2CreateTransactionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V2CreateTransactionResponse withV2CreateTransactionResponse(com.formance.formance_sdk.models.shared.V2CreateTransactionResponse v2CreateTransactionResponse) {
        Utils.checkNotNull(v2CreateTransactionResponse, "v2CreateTransactionResponse");
        this.v2CreateTransactionResponse = Optional.ofNullable(v2CreateTransactionResponse);
        return this;
    }

    /**
     * OK
     */
    public V2CreateTransactionResponse withV2CreateTransactionResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2CreateTransactionResponse> v2CreateTransactionResponse) {
        Utils.checkNotNull(v2CreateTransactionResponse, "v2CreateTransactionResponse");
        this.v2CreateTransactionResponse = v2CreateTransactionResponse;
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
        V2CreateTransactionResponse other = (V2CreateTransactionResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2CreateTransactionResponse, other.v2CreateTransactionResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2CreateTransactionResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateTransactionResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2CreateTransactionResponse", v2CreateTransactionResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2CreateTransactionResponse> v2CreateTransactionResponse = Optional.empty();  
        
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
        public Builder v2CreateTransactionResponse(com.formance.formance_sdk.models.shared.V2CreateTransactionResponse v2CreateTransactionResponse) {
            Utils.checkNotNull(v2CreateTransactionResponse, "v2CreateTransactionResponse");
            this.v2CreateTransactionResponse = Optional.ofNullable(v2CreateTransactionResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v2CreateTransactionResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2CreateTransactionResponse> v2CreateTransactionResponse) {
            Utils.checkNotNull(v2CreateTransactionResponse, "v2CreateTransactionResponse");
            this.v2CreateTransactionResponse = v2CreateTransactionResponse;
            return this;
        }
        
        public V2CreateTransactionResponse build() {
            return new V2CreateTransactionResponse(
                contentType,
                statusCode,
                rawResponse,
                v2CreateTransactionResponse);
        }
    }
}

