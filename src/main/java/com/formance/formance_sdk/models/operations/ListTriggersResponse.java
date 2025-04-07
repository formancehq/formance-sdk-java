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

public class ListTriggersResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * List of triggers
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersResponse> listTriggersResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListTriggersResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersResponse> listTriggersResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(listTriggersResponse, "listTriggersResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.listTriggersResponse = listTriggersResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListTriggersResponse(
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
     * List of triggers
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ListTriggersResponse> listTriggersResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ListTriggersResponse>) listTriggersResponse;
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
    public ListTriggersResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * List of triggers
     */
    public ListTriggersResponse withListTriggersResponse(com.formance.formance_sdk.models.shared.ListTriggersResponse listTriggersResponse) {
        Utils.checkNotNull(listTriggersResponse, "listTriggersResponse");
        this.listTriggersResponse = Optional.ofNullable(listTriggersResponse);
        return this;
    }

    /**
     * List of triggers
     */
    public ListTriggersResponse withListTriggersResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersResponse> listTriggersResponse) {
        Utils.checkNotNull(listTriggersResponse, "listTriggersResponse");
        this.listTriggersResponse = listTriggersResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListTriggersResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListTriggersResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListTriggersResponse other = (ListTriggersResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.listTriggersResponse, other.listTriggersResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            listTriggersResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTriggersResponse.class,
                "contentType", contentType,
                "listTriggersResponse", listTriggersResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersResponse> listTriggersResponse = Optional.empty();
 
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
         * List of triggers
         */
        public Builder listTriggersResponse(com.formance.formance_sdk.models.shared.ListTriggersResponse listTriggersResponse) {
            Utils.checkNotNull(listTriggersResponse, "listTriggersResponse");
            this.listTriggersResponse = Optional.ofNullable(listTriggersResponse);
            return this;
        }

        /**
         * List of triggers
         */
        public Builder listTriggersResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListTriggersResponse> listTriggersResponse) {
            Utils.checkNotNull(listTriggersResponse, "listTriggersResponse");
            this.listTriggersResponse = listTriggersResponse;
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
        
        public ListTriggersResponse build() {
            return new ListTriggersResponse(
                contentType,
                listTriggersResponse,
                statusCode,
                rawResponse);
        }
    }
}
