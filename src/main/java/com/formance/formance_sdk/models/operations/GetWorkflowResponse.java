/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class GetWorkflowResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The workflow
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.GetWorkflowResponse> getWorkflowResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetWorkflowResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.GetWorkflowResponse> getWorkflowResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(getWorkflowResponse, "getWorkflowResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.getWorkflowResponse = getWorkflowResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetWorkflowResponse(
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
     * The workflow
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.GetWorkflowResponse> getWorkflowResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.GetWorkflowResponse>) getWorkflowResponse;
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
    public GetWorkflowResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The workflow
     */
    public GetWorkflowResponse withGetWorkflowResponse(com.formance.formance_sdk.models.shared.GetWorkflowResponse getWorkflowResponse) {
        Utils.checkNotNull(getWorkflowResponse, "getWorkflowResponse");
        this.getWorkflowResponse = Optional.ofNullable(getWorkflowResponse);
        return this;
    }

    /**
     * The workflow
     */
    public GetWorkflowResponse withGetWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.GetWorkflowResponse> getWorkflowResponse) {
        Utils.checkNotNull(getWorkflowResponse, "getWorkflowResponse");
        this.getWorkflowResponse = getWorkflowResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetWorkflowResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetWorkflowResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetWorkflowResponse other = (GetWorkflowResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.getWorkflowResponse, other.getWorkflowResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            getWorkflowResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkflowResponse.class,
                "contentType", contentType,
                "getWorkflowResponse", getWorkflowResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.GetWorkflowResponse> getWorkflowResponse = Optional.empty();
 
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
         * The workflow
         */
        public Builder getWorkflowResponse(com.formance.formance_sdk.models.shared.GetWorkflowResponse getWorkflowResponse) {
            Utils.checkNotNull(getWorkflowResponse, "getWorkflowResponse");
            this.getWorkflowResponse = Optional.ofNullable(getWorkflowResponse);
            return this;
        }

        /**
         * The workflow
         */
        public Builder getWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.GetWorkflowResponse> getWorkflowResponse) {
            Utils.checkNotNull(getWorkflowResponse, "getWorkflowResponse");
            this.getWorkflowResponse = getWorkflowResponse;
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
        
        public GetWorkflowResponse build() {
            return new GetWorkflowResponse(
                contentType,
                getWorkflowResponse,
                statusCode,
                rawResponse);
        }
    }
}

