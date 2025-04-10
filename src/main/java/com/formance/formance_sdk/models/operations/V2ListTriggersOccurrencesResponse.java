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

public class V2ListTriggersOccurrencesResponse implements Response {

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
     * List of triggers occurrences
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse> v2ListTriggersOccurrencesResponse;

    @JsonCreator
    public V2ListTriggersOccurrencesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse> v2ListTriggersOccurrencesResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v2ListTriggersOccurrencesResponse, "v2ListTriggersOccurrencesResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v2ListTriggersOccurrencesResponse = v2ListTriggersOccurrencesResponse;
    }
    
    public V2ListTriggersOccurrencesResponse(
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
     * List of triggers occurrences
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse> v2ListTriggersOccurrencesResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse>) v2ListTriggersOccurrencesResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V2ListTriggersOccurrencesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V2ListTriggersOccurrencesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V2ListTriggersOccurrencesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * List of triggers occurrences
     */
    public V2ListTriggersOccurrencesResponse withV2ListTriggersOccurrencesResponse(com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse v2ListTriggersOccurrencesResponse) {
        Utils.checkNotNull(v2ListTriggersOccurrencesResponse, "v2ListTriggersOccurrencesResponse");
        this.v2ListTriggersOccurrencesResponse = Optional.ofNullable(v2ListTriggersOccurrencesResponse);
        return this;
    }

    /**
     * List of triggers occurrences
     */
    public V2ListTriggersOccurrencesResponse withV2ListTriggersOccurrencesResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse> v2ListTriggersOccurrencesResponse) {
        Utils.checkNotNull(v2ListTriggersOccurrencesResponse, "v2ListTriggersOccurrencesResponse");
        this.v2ListTriggersOccurrencesResponse = v2ListTriggersOccurrencesResponse;
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
        V2ListTriggersOccurrencesResponse other = (V2ListTriggersOccurrencesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v2ListTriggersOccurrencesResponse, other.v2ListTriggersOccurrencesResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v2ListTriggersOccurrencesResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListTriggersOccurrencesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v2ListTriggersOccurrencesResponse", v2ListTriggersOccurrencesResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse> v2ListTriggersOccurrencesResponse = Optional.empty();
        
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
         * List of triggers occurrences
         */
        public Builder v2ListTriggersOccurrencesResponse(com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse v2ListTriggersOccurrencesResponse) {
            Utils.checkNotNull(v2ListTriggersOccurrencesResponse, "v2ListTriggersOccurrencesResponse");
            this.v2ListTriggersOccurrencesResponse = Optional.ofNullable(v2ListTriggersOccurrencesResponse);
            return this;
        }

        /**
         * List of triggers occurrences
         */
        public Builder v2ListTriggersOccurrencesResponse(Optional<? extends com.formance.formance_sdk.models.shared.V2ListTriggersOccurrencesResponse> v2ListTriggersOccurrencesResponse) {
            Utils.checkNotNull(v2ListTriggersOccurrencesResponse, "v2ListTriggersOccurrencesResponse");
            this.v2ListTriggersOccurrencesResponse = v2ListTriggersOccurrencesResponse;
            return this;
        }
        
        public V2ListTriggersOccurrencesResponse build() {
            return new V2ListTriggersOccurrencesResponse(
                contentType,
                statusCode,
                rawResponse,
                v2ListTriggersOccurrencesResponse);
        }
    }
}
