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

public class V2CreateWorkflowResponse implements Response {

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
     * Created workflow
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse> v2CreateWorkflowResponse;

    @JsonCreator
    public V2CreateWorkflowResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse> v2CreateWorkflowResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2CreateWorkflowResponse, "v2CreateWorkflowResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2CreateWorkflowResponse = v2CreateWorkflowResponse;
    }
    
    public V2CreateWorkflowResponse(
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
     * Created workflow
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse> v2CreateWorkflowResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse>) v2CreateWorkflowResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V2CreateWorkflowResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2CreateWorkflowResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2CreateWorkflowResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Created workflow
     */
    public V2CreateWorkflowResponse withV2CreateWorkflowResponse(com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse v2CreateWorkflowResponse) {
        Utils.checkNotNull(v2CreateWorkflowResponse, "v2CreateWorkflowResponse");
        this.v2CreateWorkflowResponse = Optional.ofNullable(v2CreateWorkflowResponse);
        return this;
    }

    /**
     * Created workflow
     */
    public V2CreateWorkflowResponse withV2CreateWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse> v2CreateWorkflowResponse) {
        Utils.checkNotNull(v2CreateWorkflowResponse, "v2CreateWorkflowResponse");
        this.v2CreateWorkflowResponse = v2CreateWorkflowResponse;
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
        V2CreateWorkflowResponse other = (V2CreateWorkflowResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2CreateWorkflowResponse, other.v2CreateWorkflowResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2CreateWorkflowResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateWorkflowResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2CreateWorkflowResponse", v2CreateWorkflowResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse> v2CreateWorkflowResponse = Optional.empty();  
        
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
         * Created workflow
         */
        public Builder v2CreateWorkflowResponse(com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse v2CreateWorkflowResponse) {
            Utils.checkNotNull(v2CreateWorkflowResponse, "v2CreateWorkflowResponse");
            this.v2CreateWorkflowResponse = Optional.ofNullable(v2CreateWorkflowResponse);
            return this;
        }

        /**
         * Created workflow
         */
        public Builder v2CreateWorkflowResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2CreateWorkflowResponse> v2CreateWorkflowResponse) {
            Utils.checkNotNull(v2CreateWorkflowResponse, "v2CreateWorkflowResponse");
            this.v2CreateWorkflowResponse = v2CreateWorkflowResponse;
            return this;
        }
        
        public V2CreateWorkflowResponse build() {
            return new V2CreateWorkflowResponse(
                contentType,
                statusCode,
                rawResponse,
                v2CreateWorkflowResponse);
        }
    }
}

