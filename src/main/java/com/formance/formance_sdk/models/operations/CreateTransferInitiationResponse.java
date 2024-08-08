/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.TransferInitiationResponse;
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


public class CreateTransferInitiationResponse implements Response {

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
    private Optional<? extends TransferInitiationResponse> transferInitiationResponse;

    @JsonCreator
    public CreateTransferInitiationResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends TransferInitiationResponse> transferInitiationResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(transferInitiationResponse, "transferInitiationResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.transferInitiationResponse = transferInitiationResponse;
    }
    
    public CreateTransferInitiationResponse(
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
    public Optional<TransferInitiationResponse> transferInitiationResponse() {
        return (Optional<TransferInitiationResponse>) transferInitiationResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateTransferInitiationResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateTransferInitiationResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateTransferInitiationResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public CreateTransferInitiationResponse withTransferInitiationResponse(TransferInitiationResponse transferInitiationResponse) {
        Utils.checkNotNull(transferInitiationResponse, "transferInitiationResponse");
        this.transferInitiationResponse = Optional.ofNullable(transferInitiationResponse);
        return this;
    }

    /**
     * OK
     */
    public CreateTransferInitiationResponse withTransferInitiationResponse(Optional<? extends TransferInitiationResponse> transferInitiationResponse) {
        Utils.checkNotNull(transferInitiationResponse, "transferInitiationResponse");
        this.transferInitiationResponse = transferInitiationResponse;
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
        CreateTransferInitiationResponse other = (CreateTransferInitiationResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.transferInitiationResponse, other.transferInitiationResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            transferInitiationResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransferInitiationResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "transferInitiationResponse", transferInitiationResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends TransferInitiationResponse> transferInitiationResponse = Optional.empty();  
        
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
        public Builder transferInitiationResponse(TransferInitiationResponse transferInitiationResponse) {
            Utils.checkNotNull(transferInitiationResponse, "transferInitiationResponse");
            this.transferInitiationResponse = Optional.ofNullable(transferInitiationResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder transferInitiationResponse(Optional<? extends TransferInitiationResponse> transferInitiationResponse) {
            Utils.checkNotNull(transferInitiationResponse, "transferInitiationResponse");
            this.transferInitiationResponse = transferInitiationResponse;
            return this;
        }
        
        public CreateTransferInitiationResponse build() {
            return new CreateTransferInitiationResponse(
                contentType,
                statusCode,
                rawResponse,
                transferInitiationResponse);
        }
    }
}

