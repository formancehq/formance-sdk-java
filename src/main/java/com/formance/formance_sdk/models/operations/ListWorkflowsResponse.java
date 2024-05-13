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


public class ListWorkflowsResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * List of workflows
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ListWorkflowsResponse> listWorkflowsResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListWorkflowsResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ListWorkflowsResponse> listWorkflowsResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(listWorkflowsResponse, "listWorkflowsResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.listWorkflowsResponse = listWorkflowsResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListWorkflowsResponse(
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
     * List of workflows
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ListWorkflowsResponse> listWorkflowsResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ListWorkflowsResponse>) listWorkflowsResponse;
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
    public ListWorkflowsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * List of workflows
     */
    public ListWorkflowsResponse withListWorkflowsResponse(com.formance.formance_sdk.models.shared.ListWorkflowsResponse listWorkflowsResponse) {
        Utils.checkNotNull(listWorkflowsResponse, "listWorkflowsResponse");
        this.listWorkflowsResponse = Optional.ofNullable(listWorkflowsResponse);
        return this;
    }

    /**
     * List of workflows
     */
    public ListWorkflowsResponse withListWorkflowsResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListWorkflowsResponse> listWorkflowsResponse) {
        Utils.checkNotNull(listWorkflowsResponse, "listWorkflowsResponse");
        this.listWorkflowsResponse = listWorkflowsResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListWorkflowsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListWorkflowsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListWorkflowsResponse other = (ListWorkflowsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.listWorkflowsResponse, other.listWorkflowsResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            listWorkflowsResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListWorkflowsResponse.class,
                "contentType", contentType,
                "listWorkflowsResponse", listWorkflowsResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ListWorkflowsResponse> listWorkflowsResponse = Optional.empty();
 
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
         * List of workflows
         */
        public Builder listWorkflowsResponse(com.formance.formance_sdk.models.shared.ListWorkflowsResponse listWorkflowsResponse) {
            Utils.checkNotNull(listWorkflowsResponse, "listWorkflowsResponse");
            this.listWorkflowsResponse = Optional.ofNullable(listWorkflowsResponse);
            return this;
        }

        /**
         * List of workflows
         */
        public Builder listWorkflowsResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListWorkflowsResponse> listWorkflowsResponse) {
            Utils.checkNotNull(listWorkflowsResponse, "listWorkflowsResponse");
            this.listWorkflowsResponse = listWorkflowsResponse;
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
        
        public ListWorkflowsResponse build() {
            return new ListWorkflowsResponse(
                contentType,
                listWorkflowsResponse,
                statusCode,
                rawResponse);
        }
    }
}

