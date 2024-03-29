/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ReconcileResponse implements com.formance.formance_sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationResponse> reconciliationResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Error response
     */
    private Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse;

    public ReconcileResponse(
            String contentType,
            Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationResponse> reconciliationResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(reconciliationResponse, "reconciliationResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
        this.contentType = contentType;
        this.reconciliationResponse = reconciliationResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.reconciliationErrorResponse = reconciliationErrorResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationResponse> reconciliationResponse() {
        return reconciliationResponse;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Error response
     */
    public Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse() {
        return reconciliationErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ReconcileResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public ReconcileResponse withReconciliationResponse(com.formance.formance_sdk.models.shared.ReconciliationResponse reconciliationResponse) {
        Utils.checkNotNull(reconciliationResponse, "reconciliationResponse");
        this.reconciliationResponse = Optional.ofNullable(reconciliationResponse);
        return this;
    }

    /**
     * OK
     */
    public ReconcileResponse withReconciliationResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationResponse> reconciliationResponse) {
        Utils.checkNotNull(reconciliationResponse, "reconciliationResponse");
        this.reconciliationResponse = reconciliationResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ReconcileResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ReconcileResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Error response
     */
    public ReconcileResponse withReconciliationErrorResponse(com.formance.formance_sdk.models.shared.ReconciliationErrorResponse reconciliationErrorResponse) {
        Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
        this.reconciliationErrorResponse = Optional.ofNullable(reconciliationErrorResponse);
        return this;
    }

    /**
     * Error response
     */
    public ReconcileResponse withReconciliationErrorResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse) {
        Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
        this.reconciliationErrorResponse = reconciliationErrorResponse;
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
        ReconcileResponse other = (ReconcileResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.reconciliationResponse, other.reconciliationResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.reconciliationErrorResponse, other.reconciliationErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            reconciliationResponse,
            statusCode,
            rawResponse,
            reconciliationErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconcileResponse.class,
                "contentType", contentType,
                "reconciliationResponse", reconciliationResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "reconciliationErrorResponse", reconciliationErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationResponse> reconciliationResponse = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse = Optional.empty();  
        
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
        public Builder reconciliationResponse(com.formance.formance_sdk.models.shared.ReconciliationResponse reconciliationResponse) {
            Utils.checkNotNull(reconciliationResponse, "reconciliationResponse");
            this.reconciliationResponse = Optional.ofNullable(reconciliationResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder reconciliationResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationResponse> reconciliationResponse) {
            Utils.checkNotNull(reconciliationResponse, "reconciliationResponse");
            this.reconciliationResponse = reconciliationResponse;
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
         * Error response
         */
        public Builder reconciliationErrorResponse(com.formance.formance_sdk.models.shared.ReconciliationErrorResponse reconciliationErrorResponse) {
            Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
            this.reconciliationErrorResponse = Optional.ofNullable(reconciliationErrorResponse);
            return this;
        }

        /**
         * Error response
         */
        public Builder reconciliationErrorResponse(Optional<? extends com.formance.formance_sdk.models.shared.ReconciliationErrorResponse> reconciliationErrorResponse) {
            Utils.checkNotNull(reconciliationErrorResponse, "reconciliationErrorResponse");
            this.reconciliationErrorResponse = reconciliationErrorResponse;
            return this;
        }
        
        public ReconcileResponse build() {
            return new ReconcileResponse(
                contentType,
                reconciliationResponse,
                statusCode,
                rawResponse,
                reconciliationErrorResponse);
        }
    }
}

