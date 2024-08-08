/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V2GetWorkflowInstanceHistoryResponse;
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


public class V2GetInstanceHistoryResponse implements Response {

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
     * The workflow instance history
     */
    private Optional<? extends V2GetWorkflowInstanceHistoryResponse> v2GetWorkflowInstanceHistoryResponse;

    @JsonCreator
    public V2GetInstanceHistoryResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V2GetWorkflowInstanceHistoryResponse> v2GetWorkflowInstanceHistoryResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2GetWorkflowInstanceHistoryResponse, "v2GetWorkflowInstanceHistoryResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2GetWorkflowInstanceHistoryResponse = v2GetWorkflowInstanceHistoryResponse;
    }
    
    public V2GetInstanceHistoryResponse(
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
     * The workflow instance history
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2GetWorkflowInstanceHistoryResponse> v2GetWorkflowInstanceHistoryResponse() {
        return (Optional<V2GetWorkflowInstanceHistoryResponse>) v2GetWorkflowInstanceHistoryResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2GetInstanceHistoryResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2GetInstanceHistoryResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2GetInstanceHistoryResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * The workflow instance history
     */
    public V2GetInstanceHistoryResponse withV2GetWorkflowInstanceHistoryResponse(V2GetWorkflowInstanceHistoryResponse v2GetWorkflowInstanceHistoryResponse) {
        Utils.checkNotNull(v2GetWorkflowInstanceHistoryResponse, "v2GetWorkflowInstanceHistoryResponse");
        this.v2GetWorkflowInstanceHistoryResponse = Optional.ofNullable(v2GetWorkflowInstanceHistoryResponse);
        return this;
    }

    /**
     * The workflow instance history
     */
    public V2GetInstanceHistoryResponse withV2GetWorkflowInstanceHistoryResponse(Optional<? extends V2GetWorkflowInstanceHistoryResponse> v2GetWorkflowInstanceHistoryResponse) {
        Utils.checkNotNull(v2GetWorkflowInstanceHistoryResponse, "v2GetWorkflowInstanceHistoryResponse");
        this.v2GetWorkflowInstanceHistoryResponse = v2GetWorkflowInstanceHistoryResponse;
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
        V2GetInstanceHistoryResponse other = (V2GetInstanceHistoryResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2GetWorkflowInstanceHistoryResponse, other.v2GetWorkflowInstanceHistoryResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2GetWorkflowInstanceHistoryResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetInstanceHistoryResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2GetWorkflowInstanceHistoryResponse", v2GetWorkflowInstanceHistoryResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V2GetWorkflowInstanceHistoryResponse> v2GetWorkflowInstanceHistoryResponse = Optional.empty();  
        
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
         * The workflow instance history
         */
        public Builder v2GetWorkflowInstanceHistoryResponse(V2GetWorkflowInstanceHistoryResponse v2GetWorkflowInstanceHistoryResponse) {
            Utils.checkNotNull(v2GetWorkflowInstanceHistoryResponse, "v2GetWorkflowInstanceHistoryResponse");
            this.v2GetWorkflowInstanceHistoryResponse = Optional.ofNullable(v2GetWorkflowInstanceHistoryResponse);
            return this;
        }

        /**
         * The workflow instance history
         */
        public Builder v2GetWorkflowInstanceHistoryResponse(Optional<? extends V2GetWorkflowInstanceHistoryResponse> v2GetWorkflowInstanceHistoryResponse) {
            Utils.checkNotNull(v2GetWorkflowInstanceHistoryResponse, "v2GetWorkflowInstanceHistoryResponse");
            this.v2GetWorkflowInstanceHistoryResponse = v2GetWorkflowInstanceHistoryResponse;
            return this;
        }
        
        public V2GetInstanceHistoryResponse build() {
            return new V2GetInstanceHistoryResponse(
                contentType,
                statusCode,
                rawResponse,
                v2GetWorkflowInstanceHistoryResponse);
        }
    }
}

