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

public class V2RunWorkflowResponse implements Response {

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
     * The workflow instance
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2RunWorkflowResponse> v2RunWorkflowResponse;

    @JsonCreator
    public V2RunWorkflowResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2RunWorkflowResponse> v2RunWorkflowResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2RunWorkflowResponse, "v2RunWorkflowResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2RunWorkflowResponse = v2RunWorkflowResponse;
    }
    
    public V2RunWorkflowResponse(
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
     * The workflow instance
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V2RunWorkflowResponse> v2RunWorkflowResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2RunWorkflowResponse>) v2RunWorkflowResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V2RunWorkflowResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2RunWorkflowResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2RunWorkflowResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The workflow instance
     */
    public V2RunWorkflowResponse withV2RunWorkflowResponse(com.formance.formance_sdk.models.shared.V2RunWorkflowResponse v2RunWorkflowResponse) {
        Utils.checkNotNull(v2RunWorkflowResponse, "v2RunWorkflowResponse");
        this.v2RunWorkflowResponse = Optional.ofNullable(v2RunWorkflowResponse);
        return this;
    }

    /**
     * The workflow instance
     */
    public V2RunWorkflowResponse withV2RunWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2RunWorkflowResponse> v2RunWorkflowResponse) {
        Utils.checkNotNull(v2RunWorkflowResponse, "v2RunWorkflowResponse");
        this.v2RunWorkflowResponse = v2RunWorkflowResponse;
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
        V2RunWorkflowResponse other = (V2RunWorkflowResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2RunWorkflowResponse, other.v2RunWorkflowResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2RunWorkflowResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2RunWorkflowResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2RunWorkflowResponse", v2RunWorkflowResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2RunWorkflowResponse> v2RunWorkflowResponse = Optional.empty();
        
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
         * The workflow instance
         */
        public Builder v2RunWorkflowResponse(com.formance.formance_sdk.models.shared.V2RunWorkflowResponse v2RunWorkflowResponse) {
            Utils.checkNotNull(v2RunWorkflowResponse, "v2RunWorkflowResponse");
            this.v2RunWorkflowResponse = Optional.ofNullable(v2RunWorkflowResponse);
            return this;
        }

        /**
         * The workflow instance
         */
        public Builder v2RunWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2RunWorkflowResponse> v2RunWorkflowResponse) {
            Utils.checkNotNull(v2RunWorkflowResponse, "v2RunWorkflowResponse");
            this.v2RunWorkflowResponse = v2RunWorkflowResponse;
            return this;
        }
        
        public V2RunWorkflowResponse build() {
            return new V2RunWorkflowResponse(
                contentType,
                statusCode,
                rawResponse,
                v2RunWorkflowResponse);
        }
    }
}
