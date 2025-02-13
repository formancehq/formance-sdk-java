/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V3AccountsCursorResponse;
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


public class V3ListAccountsResponse implements Response {

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
     * OK
     */
    private Optional<? extends V3AccountsCursorResponse> v3AccountsCursorResponse;

    @JsonCreator
    public V3ListAccountsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V3AccountsCursorResponse> v3AccountsCursorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3AccountsCursorResponse, "v3AccountsCursorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3AccountsCursorResponse = v3AccountsCursorResponse;
    }
    
    public V3ListAccountsResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V3AccountsCursorResponse> v3AccountsCursorResponse() {
        return (Optional<V3AccountsCursorResponse>) v3AccountsCursorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3ListAccountsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3ListAccountsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3ListAccountsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V3ListAccountsResponse withV3AccountsCursorResponse(V3AccountsCursorResponse v3AccountsCursorResponse) {
        Utils.checkNotNull(v3AccountsCursorResponse, "v3AccountsCursorResponse");
        this.v3AccountsCursorResponse = Optional.ofNullable(v3AccountsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public V3ListAccountsResponse withV3AccountsCursorResponse(Optional<? extends V3AccountsCursorResponse> v3AccountsCursorResponse) {
        Utils.checkNotNull(v3AccountsCursorResponse, "v3AccountsCursorResponse");
        this.v3AccountsCursorResponse = v3AccountsCursorResponse;
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
        V3ListAccountsResponse other = (V3ListAccountsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3AccountsCursorResponse, other.v3AccountsCursorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3AccountsCursorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListAccountsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3AccountsCursorResponse", v3AccountsCursorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V3AccountsCursorResponse> v3AccountsCursorResponse = Optional.empty();  
        
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
         * OK
         */
        public Builder v3AccountsCursorResponse(V3AccountsCursorResponse v3AccountsCursorResponse) {
            Utils.checkNotNull(v3AccountsCursorResponse, "v3AccountsCursorResponse");
            this.v3AccountsCursorResponse = Optional.ofNullable(v3AccountsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v3AccountsCursorResponse(Optional<? extends V3AccountsCursorResponse> v3AccountsCursorResponse) {
            Utils.checkNotNull(v3AccountsCursorResponse, "v3AccountsCursorResponse");
            this.v3AccountsCursorResponse = v3AccountsCursorResponse;
            return this;
        }
        
        public V3ListAccountsResponse build() {
            return new V3ListAccountsResponse(
                contentType,
                statusCode,
                rawResponse,
                v3AccountsCursorResponse);
        }
    }
}

