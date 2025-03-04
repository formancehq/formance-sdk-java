/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.PoliciesCursorResponse;
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

public class ListPoliciesResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends PoliciesCursorResponse> policiesCursorResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public ListPoliciesResponse(
            String contentType,
            Optional<? extends PoliciesCursorResponse> policiesCursorResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(policiesCursorResponse, "policiesCursorResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.policiesCursorResponse = policiesCursorResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public ListPoliciesResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PoliciesCursorResponse> policiesCursorResponse() {
        return (Optional<PoliciesCursorResponse>) policiesCursorResponse;
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
    public ListPoliciesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public ListPoliciesResponse withPoliciesCursorResponse(PoliciesCursorResponse policiesCursorResponse) {
        Utils.checkNotNull(policiesCursorResponse, "policiesCursorResponse");
        this.policiesCursorResponse = Optional.ofNullable(policiesCursorResponse);
        return this;
    }

    /**
     * OK
     */
    public ListPoliciesResponse withPoliciesCursorResponse(Optional<? extends PoliciesCursorResponse> policiesCursorResponse) {
        Utils.checkNotNull(policiesCursorResponse, "policiesCursorResponse");
        this.policiesCursorResponse = policiesCursorResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListPoliciesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListPoliciesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ListPoliciesResponse other = (ListPoliciesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.policiesCursorResponse, other.policiesCursorResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            policiesCursorResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPoliciesResponse.class,
                "contentType", contentType,
                "policiesCursorResponse", policiesCursorResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends PoliciesCursorResponse> policiesCursorResponse = Optional.empty();
 
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
         * OK
         */
        public Builder policiesCursorResponse(PoliciesCursorResponse policiesCursorResponse) {
            Utils.checkNotNull(policiesCursorResponse, "policiesCursorResponse");
            this.policiesCursorResponse = Optional.ofNullable(policiesCursorResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder policiesCursorResponse(Optional<? extends PoliciesCursorResponse> policiesCursorResponse) {
            Utils.checkNotNull(policiesCursorResponse, "policiesCursorResponse");
            this.policiesCursorResponse = policiesCursorResponse;
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
        
        public ListPoliciesResponse build() {
            return new ListPoliciesResponse(
                contentType,
                policiesCursorResponse,
                statusCode,
                rawResponse);
        }
    }
}

