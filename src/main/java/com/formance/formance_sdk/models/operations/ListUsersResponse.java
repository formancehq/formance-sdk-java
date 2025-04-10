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

public class ListUsersResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * List of users
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ListUsersResponse> listUsersResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListUsersResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ListUsersResponse> listUsersResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(listUsersResponse, "listUsersResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.listUsersResponse = listUsersResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListUsersResponse(
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
     * List of users
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ListUsersResponse> listUsersResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.ListUsersResponse>) listUsersResponse;
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
    public ListUsersResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * List of users
     */
    public ListUsersResponse withListUsersResponse(com.formance.formance_sdk.models.shared.ListUsersResponse listUsersResponse) {
        Utils.checkNotNull(listUsersResponse, "listUsersResponse");
        this.listUsersResponse = Optional.ofNullable(listUsersResponse);
        return this;
    }

    /**
     * List of users
     */
    public ListUsersResponse withListUsersResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListUsersResponse> listUsersResponse) {
        Utils.checkNotNull(listUsersResponse, "listUsersResponse");
        this.listUsersResponse = listUsersResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListUsersResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListUsersResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListUsersResponse other = (ListUsersResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.listUsersResponse, other.listUsersResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            listUsersResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUsersResponse.class,
                "contentType", contentType,
                "listUsersResponse", listUsersResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ListUsersResponse> listUsersResponse = Optional.empty();
 
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
         * List of users
         */
        public Builder listUsersResponse(com.formance.formance_sdk.models.shared.ListUsersResponse listUsersResponse) {
            Utils.checkNotNull(listUsersResponse, "listUsersResponse");
            this.listUsersResponse = Optional.ofNullable(listUsersResponse);
            return this;
        }

        /**
         * List of users
         */
        public Builder listUsersResponse(Optional<? extends com.formance.formance_sdk.models.shared.ListUsersResponse> listUsersResponse) {
            Utils.checkNotNull(listUsersResponse, "listUsersResponse");
            this.listUsersResponse = listUsersResponse;
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
        
        public ListUsersResponse build() {
            return new ListUsersResponse(
                contentType,
                listUsersResponse,
                statusCode,
                rawResponse);
        }
    }
}
