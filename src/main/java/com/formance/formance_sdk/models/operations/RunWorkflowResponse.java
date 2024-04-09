/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class RunWorkflowResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * The workflow instance
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.RunWorkflowResponse> runWorkflowResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public RunWorkflowResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.RunWorkflowResponse> runWorkflowResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(runWorkflowResponse, "runWorkflowResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.runWorkflowResponse = runWorkflowResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * The workflow instance
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.RunWorkflowResponse> runWorkflowResponse() {
        return runWorkflowResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public RunWorkflowResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * The workflow instance
     */
    public RunWorkflowResponse withRunWorkflowResponse(com.formance.formance_sdk.models.shared.RunWorkflowResponse runWorkflowResponse) {
        Utils.checkNotNull(runWorkflowResponse, "runWorkflowResponse");
        this.runWorkflowResponse = Optional.ofNullable(runWorkflowResponse);
        return this;
    }

    /**
     * The workflow instance
     */
    public RunWorkflowResponse withRunWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.RunWorkflowResponse> runWorkflowResponse) {
        Utils.checkNotNull(runWorkflowResponse, "runWorkflowResponse");
        this.runWorkflowResponse = runWorkflowResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public RunWorkflowResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public RunWorkflowResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        RunWorkflowResponse other = (RunWorkflowResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.runWorkflowResponse, other.runWorkflowResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            runWorkflowResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunWorkflowResponse.class,
                "contentType", contentType,
                "runWorkflowResponse", runWorkflowResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.RunWorkflowResponse> runWorkflowResponse = Optional.empty();
 
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
         * The workflow instance
         */
        public Builder runWorkflowResponse(com.formance.formance_sdk.models.shared.RunWorkflowResponse runWorkflowResponse) {
            Utils.checkNotNull(runWorkflowResponse, "runWorkflowResponse");
            this.runWorkflowResponse = Optional.ofNullable(runWorkflowResponse);
            return this;
        }

        /**
         * The workflow instance
         */
        public Builder runWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.RunWorkflowResponse> runWorkflowResponse) {
            Utils.checkNotNull(runWorkflowResponse, "runWorkflowResponse");
            this.runWorkflowResponse = runWorkflowResponse;
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
        
        public RunWorkflowResponse build() {
            return new RunWorkflowResponse(
                contentType,
                runWorkflowResponse,
                statusCode,
                rawResponse);
        }
    }
}

