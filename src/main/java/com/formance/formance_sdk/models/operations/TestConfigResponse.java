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


public class TestConfigResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.AttemptResponse> attemptResponse;

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
     * Error
     */
    private Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse;

    public TestConfigResponse(
            Optional<? extends com.formance.formance_sdk.models.shared.AttemptResponse> attemptResponse,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse) {
        Utils.checkNotNull(attemptResponse, "attemptResponse");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
        this.attemptResponse = attemptResponse;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.webhooksErrorResponse = webhooksErrorResponse;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.AttemptResponse> attemptResponse() {
        return attemptResponse;
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
     * Error
     */
    public Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse() {
        return webhooksErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public TestConfigResponse withAttemptResponse(com.formance.formance_sdk.models.shared.AttemptResponse attemptResponse) {
        Utils.checkNotNull(attemptResponse, "attemptResponse");
        this.attemptResponse = Optional.ofNullable(attemptResponse);
        return this;
    }

    /**
     * OK
     */
    public TestConfigResponse withAttemptResponse(Optional<? extends com.formance.formance_sdk.models.shared.AttemptResponse> attemptResponse) {
        Utils.checkNotNull(attemptResponse, "attemptResponse");
        this.attemptResponse = attemptResponse;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public TestConfigResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public TestConfigResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public TestConfigResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error
     */
    public TestConfigResponse withWebhooksErrorResponse(com.formance.formance_sdk.models.errors.WebhooksErrorResponse webhooksErrorResponse) {
        Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
        this.webhooksErrorResponse = Optional.ofNullable(webhooksErrorResponse);
        return this;
    }

    /**
     * Error
     */
    public TestConfigResponse withWebhooksErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse) {
        Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
        this.webhooksErrorResponse = webhooksErrorResponse;
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
        TestConfigResponse other = (TestConfigResponse) o;
        return 
            java.util.Objects.deepEquals(this.attemptResponse, other.attemptResponse) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.webhooksErrorResponse, other.webhooksErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            attemptResponse,
            contentType,
            statusCode,
            rawResponse,
            webhooksErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TestConfigResponse.class,
                "attemptResponse", attemptResponse,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "webhooksErrorResponse", webhooksErrorResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.AttemptResponse> attemptResponse = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder attemptResponse(com.formance.formance_sdk.models.shared.AttemptResponse attemptResponse) {
            Utils.checkNotNull(attemptResponse, "attemptResponse");
            this.attemptResponse = Optional.ofNullable(attemptResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder attemptResponse(Optional<? extends com.formance.formance_sdk.models.shared.AttemptResponse> attemptResponse) {
            Utils.checkNotNull(attemptResponse, "attemptResponse");
            this.attemptResponse = attemptResponse;
            return this;
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
         * Error
         */
        public Builder webhooksErrorResponse(com.formance.formance_sdk.models.errors.WebhooksErrorResponse webhooksErrorResponse) {
            Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
            this.webhooksErrorResponse = Optional.ofNullable(webhooksErrorResponse);
            return this;
        }

        /**
         * Error
         */
        public Builder webhooksErrorResponse(Optional<? extends com.formance.formance_sdk.models.errors.WebhooksErrorResponse> webhooksErrorResponse) {
            Utils.checkNotNull(webhooksErrorResponse, "webhooksErrorResponse");
            this.webhooksErrorResponse = webhooksErrorResponse;
            return this;
        }
        
        public TestConfigResponse build() {
            return new TestConfigResponse(
                attemptResponse,
                contentType,
                statusCode,
                rawResponse,
                webhooksErrorResponse);
        }
    }
}

