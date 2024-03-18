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


public class V2GetWorkflowResponse implements com.formance.formance_sdk.utils.Response {

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
     * General error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error;

    /**
     * The workflow
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2GetWorkflowResponse> v2GetWorkflowResponse;

    public V2GetWorkflowResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error,
            Optional<? extends com.formance.formance_sdk.models.shared.V2GetWorkflowResponse> v2GetWorkflowResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2Error, "v2Error");
        Utils.checkNotNull(v2GetWorkflowResponse, "v2GetWorkflowResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2Error = v2Error;
        this.v2GetWorkflowResponse = v2GetWorkflowResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
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

    /**
     * General error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error() {
        return v2Error;
    }

    /**
     * The workflow
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.V2GetWorkflowResponse> v2GetWorkflowResponse() {
        return v2GetWorkflowResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2GetWorkflowResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2GetWorkflowResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2GetWorkflowResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * General error
     */
    public V2GetWorkflowResponse withV2Error(com.formance.formance_sdk.models.errors.V2Error v2Error) {
        Utils.checkNotNull(v2Error, "v2Error");
        this.v2Error = Optional.ofNullable(v2Error);
        return this;
    }

    /**
     * General error
     */
    public V2GetWorkflowResponse withV2Error(Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error) {
        Utils.checkNotNull(v2Error, "v2Error");
        this.v2Error = v2Error;
        return this;
    }

    /**
     * The workflow
     */
    public V2GetWorkflowResponse withV2GetWorkflowResponse(com.formance.formance_sdk.models.shared.V2GetWorkflowResponse v2GetWorkflowResponse) {
        Utils.checkNotNull(v2GetWorkflowResponse, "v2GetWorkflowResponse");
        this.v2GetWorkflowResponse = Optional.ofNullable(v2GetWorkflowResponse);
        return this;
    }

    /**
     * The workflow
     */
    public V2GetWorkflowResponse withV2GetWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2GetWorkflowResponse> v2GetWorkflowResponse) {
        Utils.checkNotNull(v2GetWorkflowResponse, "v2GetWorkflowResponse");
        this.v2GetWorkflowResponse = v2GetWorkflowResponse;
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
        V2GetWorkflowResponse other = (V2GetWorkflowResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.v2Error, other.v2Error) &&
            java.util.Objects.deepEquals(this.v2GetWorkflowResponse, other.v2GetWorkflowResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2Error,
            v2GetWorkflowResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetWorkflowResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2Error", v2Error,
                "v2GetWorkflowResponse", v2GetWorkflowResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error = Optional.empty();
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2GetWorkflowResponse> v2GetWorkflowResponse = Optional.empty();  
        
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
         * General error
         */
        public Builder v2Error(com.formance.formance_sdk.models.errors.V2Error v2Error) {
            Utils.checkNotNull(v2Error, "v2Error");
            this.v2Error = Optional.ofNullable(v2Error);
            return this;
        }

        /**
         * General error
         */
        public Builder v2Error(Optional<? extends com.formance.formance_sdk.models.errors.V2Error> v2Error) {
            Utils.checkNotNull(v2Error, "v2Error");
            this.v2Error = v2Error;
            return this;
        }

        /**
         * The workflow
         */
        public Builder v2GetWorkflowResponse(com.formance.formance_sdk.models.shared.V2GetWorkflowResponse v2GetWorkflowResponse) {
            Utils.checkNotNull(v2GetWorkflowResponse, "v2GetWorkflowResponse");
            this.v2GetWorkflowResponse = Optional.ofNullable(v2GetWorkflowResponse);
            return this;
        }

        /**
         * The workflow
         */
        public Builder v2GetWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2GetWorkflowResponse> v2GetWorkflowResponse) {
            Utils.checkNotNull(v2GetWorkflowResponse, "v2GetWorkflowResponse");
            this.v2GetWorkflowResponse = v2GetWorkflowResponse;
            return this;
        }
        
        public V2GetWorkflowResponse build() {
            return new V2GetWorkflowResponse(
                contentType,
                statusCode,
                rawResponse,
                v2Error,
                v2GetWorkflowResponse);
        }
    }
}

