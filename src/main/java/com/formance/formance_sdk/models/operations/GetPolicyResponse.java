/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.PolicyResponse;
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

public class GetPolicyResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends PolicyResponse> policyResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetPolicyResponse(
            String contentType,
            Optional<? extends PolicyResponse> policyResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(policyResponse, "policyResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.policyResponse = policyResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetPolicyResponse(
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
    public Optional<PolicyResponse> policyResponse() {
        return (Optional<PolicyResponse>) policyResponse;
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
    public GetPolicyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GetPolicyResponse withPolicyResponse(PolicyResponse policyResponse) {
        Utils.checkNotNull(policyResponse, "policyResponse");
        this.policyResponse = Optional.ofNullable(policyResponse);
        return this;
    }

    /**
     * OK
     */
    public GetPolicyResponse withPolicyResponse(Optional<? extends PolicyResponse> policyResponse) {
        Utils.checkNotNull(policyResponse, "policyResponse");
        this.policyResponse = policyResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetPolicyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetPolicyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetPolicyResponse other = (GetPolicyResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.policyResponse, other.policyResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            policyResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPolicyResponse.class,
                "contentType", contentType,
                "policyResponse", policyResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends PolicyResponse> policyResponse = Optional.empty();
 
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
        public Builder policyResponse(PolicyResponse policyResponse) {
            Utils.checkNotNull(policyResponse, "policyResponse");
            this.policyResponse = Optional.ofNullable(policyResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder policyResponse(Optional<? extends PolicyResponse> policyResponse) {
            Utils.checkNotNull(policyResponse, "policyResponse");
            this.policyResponse = policyResponse;
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
        
        public GetPolicyResponse build() {
            return new GetPolicyResponse(
                contentType,
                policyResponse,
                statusCode,
                rawResponse);
        }
    }
}

