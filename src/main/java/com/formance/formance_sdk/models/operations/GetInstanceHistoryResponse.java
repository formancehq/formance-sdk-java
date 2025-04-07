/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.GetWorkflowInstanceHistoryResponse;
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

public class GetInstanceHistoryResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The workflow instance history
     */
    private Optional<? extends GetWorkflowInstanceHistoryResponse> getWorkflowInstanceHistoryResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetInstanceHistoryResponse(
            String contentType,
            Optional<? extends GetWorkflowInstanceHistoryResponse> getWorkflowInstanceHistoryResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(getWorkflowInstanceHistoryResponse, "getWorkflowInstanceHistoryResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.getWorkflowInstanceHistoryResponse = getWorkflowInstanceHistoryResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetInstanceHistoryResponse(
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
     * The workflow instance history
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetWorkflowInstanceHistoryResponse> getWorkflowInstanceHistoryResponse() {
        return (Optional<GetWorkflowInstanceHistoryResponse>) getWorkflowInstanceHistoryResponse;
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
    public GetInstanceHistoryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The workflow instance history
     */
    public GetInstanceHistoryResponse withGetWorkflowInstanceHistoryResponse(GetWorkflowInstanceHistoryResponse getWorkflowInstanceHistoryResponse) {
        Utils.checkNotNull(getWorkflowInstanceHistoryResponse, "getWorkflowInstanceHistoryResponse");
        this.getWorkflowInstanceHistoryResponse = Optional.ofNullable(getWorkflowInstanceHistoryResponse);
        return this;
    }

    /**
     * The workflow instance history
     */
    public GetInstanceHistoryResponse withGetWorkflowInstanceHistoryResponse(Optional<? extends GetWorkflowInstanceHistoryResponse> getWorkflowInstanceHistoryResponse) {
        Utils.checkNotNull(getWorkflowInstanceHistoryResponse, "getWorkflowInstanceHistoryResponse");
        this.getWorkflowInstanceHistoryResponse = getWorkflowInstanceHistoryResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetInstanceHistoryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetInstanceHistoryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetInstanceHistoryResponse other = (GetInstanceHistoryResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.getWorkflowInstanceHistoryResponse, other.getWorkflowInstanceHistoryResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            getWorkflowInstanceHistoryResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetInstanceHistoryResponse.class,
                "contentType", contentType,
                "getWorkflowInstanceHistoryResponse", getWorkflowInstanceHistoryResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends GetWorkflowInstanceHistoryResponse> getWorkflowInstanceHistoryResponse = Optional.empty();
 
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
         * The workflow instance history
         */
        public Builder getWorkflowInstanceHistoryResponse(GetWorkflowInstanceHistoryResponse getWorkflowInstanceHistoryResponse) {
            Utils.checkNotNull(getWorkflowInstanceHistoryResponse, "getWorkflowInstanceHistoryResponse");
            this.getWorkflowInstanceHistoryResponse = Optional.ofNullable(getWorkflowInstanceHistoryResponse);
            return this;
        }

        /**
         * The workflow instance history
         */
        public Builder getWorkflowInstanceHistoryResponse(Optional<? extends GetWorkflowInstanceHistoryResponse> getWorkflowInstanceHistoryResponse) {
            Utils.checkNotNull(getWorkflowInstanceHistoryResponse, "getWorkflowInstanceHistoryResponse");
            this.getWorkflowInstanceHistoryResponse = getWorkflowInstanceHistoryResponse;
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
        
        public GetInstanceHistoryResponse build() {
            return new GetInstanceHistoryResponse(
                contentType,
                getWorkflowInstanceHistoryResponse,
                statusCode,
                rawResponse);
        }
    }
}
