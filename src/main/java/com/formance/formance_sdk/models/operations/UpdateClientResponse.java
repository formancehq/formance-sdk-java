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

public class UpdateClientResponse implements Response {

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
     * Updated client
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientResponse> updateClientResponse;

    @JsonCreator
    public UpdateClientResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientResponse> updateClientResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateClientResponse, "updateClientResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateClientResponse = updateClientResponse;
    }
    
    public UpdateClientResponse(
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
     * Updated client
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.UpdateClientResponse> updateClientResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.UpdateClientResponse>) updateClientResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateClientResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateClientResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateClientResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Updated client
     */
    public UpdateClientResponse withUpdateClientResponse(com.formance.formance_sdk.models.shared.UpdateClientResponse updateClientResponse) {
        Utils.checkNotNull(updateClientResponse, "updateClientResponse");
        this.updateClientResponse = Optional.ofNullable(updateClientResponse);
        return this;
    }

    /**
     * Updated client
     */
    public UpdateClientResponse withUpdateClientResponse(Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientResponse> updateClientResponse) {
        Utils.checkNotNull(updateClientResponse, "updateClientResponse");
        this.updateClientResponse = updateClientResponse;
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
        UpdateClientResponse other = (UpdateClientResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.updateClientResponse, other.updateClientResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updateClientResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateClientResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateClientResponse", updateClientResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientResponse> updateClientResponse = Optional.empty();  
        
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
         * Updated client
         */
        public Builder updateClientResponse(com.formance.formance_sdk.models.shared.UpdateClientResponse updateClientResponse) {
            Utils.checkNotNull(updateClientResponse, "updateClientResponse");
            this.updateClientResponse = Optional.ofNullable(updateClientResponse);
            return this;
        }

        /**
         * Updated client
         */
        public Builder updateClientResponse(Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientResponse> updateClientResponse) {
            Utils.checkNotNull(updateClientResponse, "updateClientResponse");
            this.updateClientResponse = updateClientResponse;
            return this;
        }
        
        public UpdateClientResponse build() {
            return new UpdateClientResponse(
                contentType,
                statusCode,
                rawResponse,
                updateClientResponse);
        }
    }
}

