/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class ListTransferInitiationsResponse implements com.formance.formance_sdk.utils.Response {

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
    private Optional<? extends com.formance.formance_sdk.models.shared.TransferInitiationsCursor> transferInitiationsCursor;

    @JsonCreator
    public ListTransferInitiationsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.TransferInitiationsCursor> transferInitiationsCursor) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(transferInitiationsCursor, "transferInitiationsCursor");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.transferInitiationsCursor = transferInitiationsCursor;
    }
    
    public ListTransferInitiationsResponse(
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
    public Optional<com.formance.formance_sdk.models.shared.TransferInitiationsCursor> transferInitiationsCursor() {
        return (Optional<com.formance.formance_sdk.models.shared.TransferInitiationsCursor>) transferInitiationsCursor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListTransferInitiationsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListTransferInitiationsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListTransferInitiationsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public ListTransferInitiationsResponse withTransferInitiationsCursor(com.formance.formance_sdk.models.shared.TransferInitiationsCursor transferInitiationsCursor) {
        Utils.checkNotNull(transferInitiationsCursor, "transferInitiationsCursor");
        this.transferInitiationsCursor = Optional.ofNullable(transferInitiationsCursor);
        return this;
    }

    /**
     * OK
     */
    public ListTransferInitiationsResponse withTransferInitiationsCursor(Optional<? extends com.formance.formance_sdk.models.shared.TransferInitiationsCursor> transferInitiationsCursor) {
        Utils.checkNotNull(transferInitiationsCursor, "transferInitiationsCursor");
        this.transferInitiationsCursor = transferInitiationsCursor;
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
        ListTransferInitiationsResponse other = (ListTransferInitiationsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.transferInitiationsCursor, other.transferInitiationsCursor);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            transferInitiationsCursor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTransferInitiationsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "transferInitiationsCursor", transferInitiationsCursor);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.TransferInitiationsCursor> transferInitiationsCursor = Optional.empty();  
        
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
        public Builder transferInitiationsCursor(com.formance.formance_sdk.models.shared.TransferInitiationsCursor transferInitiationsCursor) {
            Utils.checkNotNull(transferInitiationsCursor, "transferInitiationsCursor");
            this.transferInitiationsCursor = Optional.ofNullable(transferInitiationsCursor);
            return this;
        }

        /**
         * OK
         */
        public Builder transferInitiationsCursor(Optional<? extends com.formance.formance_sdk.models.shared.TransferInitiationsCursor> transferInitiationsCursor) {
            Utils.checkNotNull(transferInitiationsCursor, "transferInitiationsCursor");
            this.transferInitiationsCursor = transferInitiationsCursor;
            return this;
        }
        
        public ListTransferInitiationsResponse build() {
            return new ListTransferInitiationsResponse(
                contentType,
                statusCode,
                rawResponse,
                transferInitiationsCursor);
        }
    }
}

