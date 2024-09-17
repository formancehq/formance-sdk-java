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


public class V2ReadTriggerResponse implements Response {

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
     * A specific trigger
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2ReadTriggerResponse> v2ReadTriggerResponse;

    @JsonCreator
    public V2ReadTriggerResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2ReadTriggerResponse> v2ReadTriggerResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2ReadTriggerResponse, "v2ReadTriggerResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2ReadTriggerResponse = v2ReadTriggerResponse;
    }
    
    public V2ReadTriggerResponse(
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
     * A specific trigger
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V2ReadTriggerResponse> v2ReadTriggerResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2ReadTriggerResponse>) v2ReadTriggerResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2ReadTriggerResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2ReadTriggerResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2ReadTriggerResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * A specific trigger
     */
    public V2ReadTriggerResponse withV2ReadTriggerResponse(com.formance.formance_sdk.models.shared.V2ReadTriggerResponse v2ReadTriggerResponse) {
        Utils.checkNotNull(v2ReadTriggerResponse, "v2ReadTriggerResponse");
        this.v2ReadTriggerResponse = Optional.ofNullable(v2ReadTriggerResponse);
        return this;
    }

    /**
     * A specific trigger
     */
    public V2ReadTriggerResponse withV2ReadTriggerResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2ReadTriggerResponse> v2ReadTriggerResponse) {
        Utils.checkNotNull(v2ReadTriggerResponse, "v2ReadTriggerResponse");
        this.v2ReadTriggerResponse = v2ReadTriggerResponse;
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
        V2ReadTriggerResponse other = (V2ReadTriggerResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2ReadTriggerResponse, other.v2ReadTriggerResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2ReadTriggerResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ReadTriggerResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2ReadTriggerResponse", v2ReadTriggerResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2ReadTriggerResponse> v2ReadTriggerResponse = Optional.empty();  
        
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
         * A specific trigger
         */
        public Builder v2ReadTriggerResponse(com.formance.formance_sdk.models.shared.V2ReadTriggerResponse v2ReadTriggerResponse) {
            Utils.checkNotNull(v2ReadTriggerResponse, "v2ReadTriggerResponse");
            this.v2ReadTriggerResponse = Optional.ofNullable(v2ReadTriggerResponse);
            return this;
        }

        /**
         * A specific trigger
         */
        public Builder v2ReadTriggerResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2ReadTriggerResponse> v2ReadTriggerResponse) {
            Utils.checkNotNull(v2ReadTriggerResponse, "v2ReadTriggerResponse");
            this.v2ReadTriggerResponse = v2ReadTriggerResponse;
            return this;
        }
        
        public V2ReadTriggerResponse build() {
            return new V2ReadTriggerResponse(
                contentType,
                statusCode,
                rawResponse,
                v2ReadTriggerResponse);
        }
    }
}

