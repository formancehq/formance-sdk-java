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


public class ReadTriggerResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * A specific trigger
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ReadTriggerResponse> readTriggerResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ReadTriggerResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ReadTriggerResponse> readTriggerResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(readTriggerResponse, "readTriggerResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.readTriggerResponse = readTriggerResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ReadTriggerResponse(
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
     * A specific trigger
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ReadTriggerResponse> readTriggerResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ReadTriggerResponse>) readTriggerResponse;
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
    public ReadTriggerResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * A specific trigger
     */
    public ReadTriggerResponse withReadTriggerResponse(com.formance.formance_sdk.models.shared.ReadTriggerResponse readTriggerResponse) {
        Utils.checkNotNull(readTriggerResponse, "readTriggerResponse");
        this.readTriggerResponse = Optional.ofNullable(readTriggerResponse);
        return this;
    }

    /**
     * A specific trigger
     */
    public ReadTriggerResponse withReadTriggerResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReadTriggerResponse> readTriggerResponse) {
        Utils.checkNotNull(readTriggerResponse, "readTriggerResponse");
        this.readTriggerResponse = readTriggerResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ReadTriggerResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ReadTriggerResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ReadTriggerResponse other = (ReadTriggerResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.readTriggerResponse, other.readTriggerResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            readTriggerResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadTriggerResponse.class,
                "contentType", contentType,
                "readTriggerResponse", readTriggerResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ReadTriggerResponse> readTriggerResponse = Optional.empty();
 
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
         * A specific trigger
         */
        public Builder readTriggerResponse(com.formance.formance_sdk.models.shared.ReadTriggerResponse readTriggerResponse) {
            Utils.checkNotNull(readTriggerResponse, "readTriggerResponse");
            this.readTriggerResponse = Optional.ofNullable(readTriggerResponse);
            return this;
        }

        /**
         * A specific trigger
         */
        public Builder readTriggerResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReadTriggerResponse> readTriggerResponse) {
            Utils.checkNotNull(readTriggerResponse, "readTriggerResponse");
            this.readTriggerResponse = readTriggerResponse;
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
        
        public ReadTriggerResponse build() {
            return new ReadTriggerResponse(
                contentType,
                readTriggerResponse,
                statusCode,
                rawResponse);
        }
    }
}

