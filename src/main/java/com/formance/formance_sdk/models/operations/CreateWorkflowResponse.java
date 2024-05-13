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


public class CreateWorkflowResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Created workflow
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.CreateWorkflowResponse> createWorkflowResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateWorkflowResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.CreateWorkflowResponse> createWorkflowResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createWorkflowResponse, "createWorkflowResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createWorkflowResponse = createWorkflowResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateWorkflowResponse(
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
     * Created workflow
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.CreateWorkflowResponse> createWorkflowResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.CreateWorkflowResponse>) createWorkflowResponse;
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
    public CreateWorkflowResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Created workflow
     */
    public CreateWorkflowResponse withCreateWorkflowResponse(com.formance.formance_sdk.models.shared.CreateWorkflowResponse createWorkflowResponse) {
        Utils.checkNotNull(createWorkflowResponse, "createWorkflowResponse");
        this.createWorkflowResponse = Optional.ofNullable(createWorkflowResponse);
        return this;
    }

    /**
     * Created workflow
     */
    public CreateWorkflowResponse withCreateWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.CreateWorkflowResponse> createWorkflowResponse) {
        Utils.checkNotNull(createWorkflowResponse, "createWorkflowResponse");
        this.createWorkflowResponse = createWorkflowResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateWorkflowResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateWorkflowResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateWorkflowResponse other = (CreateWorkflowResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createWorkflowResponse, other.createWorkflowResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createWorkflowResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateWorkflowResponse.class,
                "contentType", contentType,
                "createWorkflowResponse", createWorkflowResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.CreateWorkflowResponse> createWorkflowResponse = Optional.empty();
 
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
         * Created workflow
         */
        public Builder createWorkflowResponse(com.formance.formance_sdk.models.shared.CreateWorkflowResponse createWorkflowResponse) {
            Utils.checkNotNull(createWorkflowResponse, "createWorkflowResponse");
            this.createWorkflowResponse = Optional.ofNullable(createWorkflowResponse);
            return this;
        }

        /**
         * Created workflow
         */
        public Builder createWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.CreateWorkflowResponse> createWorkflowResponse) {
            Utils.checkNotNull(createWorkflowResponse, "createWorkflowResponse");
            this.createWorkflowResponse = createWorkflowResponse;
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
        
        public CreateWorkflowResponse build() {
            return new CreateWorkflowResponse(
                contentType,
                createWorkflowResponse,
                statusCode,
                rawResponse);
        }
    }
}

