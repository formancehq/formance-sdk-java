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


public class V3CreateBankAccountResponse implements Response {

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
     * Created
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse> v3CreateBankAccountResponse;

    @JsonCreator
    public V3CreateBankAccountResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse> v3CreateBankAccountResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(v3CreateBankAccountResponse, "v3CreateBankAccountResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.v3CreateBankAccountResponse = v3CreateBankAccountResponse;
    }
    
    public V3CreateBankAccountResponse(
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
     * Created
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse> v3CreateBankAccountResponse() {
        return (Optional<com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse>) v3CreateBankAccountResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public V3CreateBankAccountResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public V3CreateBankAccountResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public V3CreateBankAccountResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Created
     */
    public V3CreateBankAccountResponse withV3CreateBankAccountResponse(com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse v3CreateBankAccountResponse) {
        Utils.checkNotNull(v3CreateBankAccountResponse, "v3CreateBankAccountResponse");
        this.v3CreateBankAccountResponse = Optional.ofNullable(v3CreateBankAccountResponse);
        return this;
    }

    /**
     * Created
     */
    public V3CreateBankAccountResponse withV3CreateBankAccountResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse> v3CreateBankAccountResponse) {
        Utils.checkNotNull(v3CreateBankAccountResponse, "v3CreateBankAccountResponse");
        this.v3CreateBankAccountResponse = v3CreateBankAccountResponse;
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
        V3CreateBankAccountResponse other = (V3CreateBankAccountResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.v3CreateBankAccountResponse, other.v3CreateBankAccountResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            v3CreateBankAccountResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3CreateBankAccountResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "v3CreateBankAccountResponse", v3CreateBankAccountResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse> v3CreateBankAccountResponse = Optional.empty();  
        
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
         * Created
         */
        public Builder v3CreateBankAccountResponse(com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse v3CreateBankAccountResponse) {
            Utils.checkNotNull(v3CreateBankAccountResponse, "v3CreateBankAccountResponse");
            this.v3CreateBankAccountResponse = Optional.ofNullable(v3CreateBankAccountResponse);
            return this;
        }

        /**
         * Created
         */
        public Builder v3CreateBankAccountResponse(Optional<? extends com.formance.formance_sdk.models.shared.V3CreateBankAccountResponse> v3CreateBankAccountResponse) {
            Utils.checkNotNull(v3CreateBankAccountResponse, "v3CreateBankAccountResponse");
            this.v3CreateBankAccountResponse = v3CreateBankAccountResponse;
            return this;
        }
        
        public V3CreateBankAccountResponse build() {
            return new V3CreateBankAccountResponse(
                contentType,
                statusCode,
                rawResponse,
                v3CreateBankAccountResponse);
        }
    }
}

