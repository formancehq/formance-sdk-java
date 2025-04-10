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

public class CreateSecretResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Created secret
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretResponse> createSecretResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public CreateSecretResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretResponse> createSecretResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createSecretResponse, "createSecretResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createSecretResponse = createSecretResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public CreateSecretResponse(
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
     * Created secret
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.CreateSecretResponse> createSecretResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.CreateSecretResponse>) createSecretResponse;
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
    public CreateSecretResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Created secret
     */
    public CreateSecretResponse withCreateSecretResponse(com.formance.formance_sdk.models.shared.CreateSecretResponse createSecretResponse) {
        Utils.checkNotNull(createSecretResponse, "createSecretResponse");
        this.createSecretResponse = Optional.ofNullable(createSecretResponse);
        return this;
    }

    /**
     * Created secret
     */
    public CreateSecretResponse withCreateSecretResponse(Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretResponse> createSecretResponse) {
        Utils.checkNotNull(createSecretResponse, "createSecretResponse");
        this.createSecretResponse = createSecretResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateSecretResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateSecretResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        CreateSecretResponse other = (CreateSecretResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.createSecretResponse, other.createSecretResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            createSecretResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSecretResponse.class,
                "contentType", contentType,
                "createSecretResponse", createSecretResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretResponse> createSecretResponse = Optional.empty();
 
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
         * Created secret
         */
        public Builder createSecretResponse(com.formance.formance_sdk.models.shared.CreateSecretResponse createSecretResponse) {
            Utils.checkNotNull(createSecretResponse, "createSecretResponse");
            this.createSecretResponse = Optional.ofNullable(createSecretResponse);
            return this;
        }

        /**
         * Created secret
         */
        public Builder createSecretResponse(Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretResponse> createSecretResponse) {
            Utils.checkNotNull(createSecretResponse, "createSecretResponse");
            this.createSecretResponse = createSecretResponse;
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
        
        public CreateSecretResponse build() {
            return new CreateSecretResponse(
                contentType,
                createSecretResponse,
                statusCode,
                rawResponse);
        }
    }
}
