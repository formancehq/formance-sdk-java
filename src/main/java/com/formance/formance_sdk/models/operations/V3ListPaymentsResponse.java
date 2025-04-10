/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V3PaymentsCursorResponse;
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

public class V3ListPaymentsResponse implements Response {

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
    private Optional<? extends V3PaymentsCursorResponse> v3PaymentsCursorResponse;

    @JsonCreator
    public V3ListPaymentsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends V3PaymentsCursorResponse> v3PaymentsCursorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3PaymentsCursorResponse, "v3PaymentsCursorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3PaymentsCursorResponse = v3PaymentsCursorResponse;
    }
    
    public V3ListPaymentsResponse(
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
    public Optional<V3PaymentsCursorResponse> v3PaymentsCursorResponse() {
        return (Optional<V3PaymentsCursorResponse>) v3PaymentsCursorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public V3ListPaymentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3ListPaymentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3ListPaymentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public V3ListPaymentsResponse withV3PaymentsCursorResponse(V3PaymentsCursorResponse v3PaymentsCursorResponse) {
        Utils.checkNotNull(v3PaymentsCursorResponse, "v3PaymentsCursorResponse");
        this.v3PaymentsCursorResponse = Optional.ofNullable(v3PaymentsCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public V3ListPaymentsResponse withV3PaymentsCursorResponse(Optional<? extends V3PaymentsCursorResponse> v3PaymentsCursorResponse) {
        Utils.checkNotNull(v3PaymentsCursorResponse, "v3PaymentsCursorResponse");
        this.v3PaymentsCursorResponse = v3PaymentsCursorResponse;
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
        V3ListPaymentsResponse other = (V3ListPaymentsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3PaymentsCursorResponse, other.v3PaymentsCursorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3PaymentsCursorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListPaymentsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3PaymentsCursorResponse", v3PaymentsCursorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends V3PaymentsCursorResponse> v3PaymentsCursorResponse = Optional.empty();
        
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
        public Builder v3PaymentsCursorResponse(V3PaymentsCursorResponse v3PaymentsCursorResponse) {
            Utils.checkNotNull(v3PaymentsCursorResponse, "v3PaymentsCursorResponse");
            this.v3PaymentsCursorResponse = Optional.ofNullable(v3PaymentsCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder v3PaymentsCursorResponse(Optional<? extends V3PaymentsCursorResponse> v3PaymentsCursorResponse) {
            Utils.checkNotNull(v3PaymentsCursorResponse, "v3PaymentsCursorResponse");
            this.v3PaymentsCursorResponse = v3PaymentsCursorResponse;
            return this;
        }
        
        public V3ListPaymentsResponse build() {
            return new V3ListPaymentsResponse(
                contentType,
                statusCode,
                rawResponse,
                v3PaymentsCursorResponse);
        }
    }
}
