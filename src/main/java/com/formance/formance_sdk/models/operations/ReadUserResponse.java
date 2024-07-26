/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class ReadUserResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Retrieved user
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ReadUserResponse> readUserResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ReadUserResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ReadUserResponse> readUserResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(readUserResponse, "readUserResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.readUserResponse = readUserResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ReadUserResponse(
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
     * Retrieved user
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ReadUserResponse> readUserResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ReadUserResponse>) readUserResponse;
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
    public ReadUserResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Retrieved user
     */
    public ReadUserResponse withReadUserResponse(com.formance.formance_sdk.models.shared.ReadUserResponse readUserResponse) {
        Utils.checkNotNull(readUserResponse, "readUserResponse");
        this.readUserResponse = Optional.ofNullable(readUserResponse);
        return this;
    }

    /**
     * Retrieved user
     */
    public ReadUserResponse withReadUserResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReadUserResponse> readUserResponse) {
        Utils.checkNotNull(readUserResponse, "readUserResponse");
        this.readUserResponse = readUserResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ReadUserResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ReadUserResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ReadUserResponse other = (ReadUserResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.readUserResponse, other.readUserResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            readUserResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadUserResponse.class,
                "contentType", contentType,
                "readUserResponse", readUserResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ReadUserResponse> readUserResponse = Optional.empty();
 
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
         * Retrieved user
         */
        public Builder readUserResponse(com.formance.formance_sdk.models.shared.ReadUserResponse readUserResponse) {
            Utils.checkNotNull(readUserResponse, "readUserResponse");
            this.readUserResponse = Optional.ofNullable(readUserResponse);
            return this;
        }

        /**
         * Retrieved user
         */
        public Builder readUserResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReadUserResponse> readUserResponse) {
            Utils.checkNotNull(readUserResponse, "readUserResponse");
            this.readUserResponse = readUserResponse;
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
        
        public ReadUserResponse build() {
            return new ReadUserResponse(
                contentType,
                readUserResponse,
                statusCode,
                rawResponse);
        }
    }
}

