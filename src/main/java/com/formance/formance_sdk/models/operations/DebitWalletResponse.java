/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.ActivityDebitWalletOutput;
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

public class DebitWalletResponse implements Response {

    /**
     * Wallet successfully debited as a pending hold
     */
    private Optional<? extends ActivityDebitWalletOutput> activityDebitWalletOutput;

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

    @JsonCreator
    public DebitWalletResponse(
            Optional<? extends ActivityDebitWalletOutput> activityDebitWalletOutput,
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(activityDebitWalletOutput, "activityDebitWalletOutput");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.activityDebitWalletOutput = activityDebitWalletOutput;
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public DebitWalletResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, statusCode, rawResponse);
    }

    /**
     * Wallet successfully debited as a pending hold
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityDebitWalletOutput> activityDebitWalletOutput() {
        return (Optional<ActivityDebitWalletOutput>) activityDebitWalletOutput;
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

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Wallet successfully debited as a pending hold
     */
    public DebitWalletResponse withActivityDebitWalletOutput(ActivityDebitWalletOutput activityDebitWalletOutput) {
        Utils.checkNotNull(activityDebitWalletOutput, "activityDebitWalletOutput");
        this.activityDebitWalletOutput = Optional.ofNullable(activityDebitWalletOutput);
        return this;
    }

    /**
     * Wallet successfully debited as a pending hold
     */
    public DebitWalletResponse withActivityDebitWalletOutput(Optional<? extends ActivityDebitWalletOutput> activityDebitWalletOutput) {
        Utils.checkNotNull(activityDebitWalletOutput, "activityDebitWalletOutput");
        this.activityDebitWalletOutput = activityDebitWalletOutput;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public DebitWalletResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public DebitWalletResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public DebitWalletResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        DebitWalletResponse other = (DebitWalletResponse) o;
        return 
            Objects.deepEquals(this.activityDebitWalletOutput, other.activityDebitWalletOutput) &&
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            activityDebitWalletOutput,
            contentType,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DebitWalletResponse.class,
                "activityDebitWalletOutput", activityDebitWalletOutput,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends ActivityDebitWalletOutput> activityDebitWalletOutput = Optional.empty();
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Wallet successfully debited as a pending hold
         */
        public Builder activityDebitWalletOutput(ActivityDebitWalletOutput activityDebitWalletOutput) {
            Utils.checkNotNull(activityDebitWalletOutput, "activityDebitWalletOutput");
            this.activityDebitWalletOutput = Optional.ofNullable(activityDebitWalletOutput);
            return this;
        }

        /**
         * Wallet successfully debited as a pending hold
         */
        public Builder activityDebitWalletOutput(Optional<? extends ActivityDebitWalletOutput> activityDebitWalletOutput) {
            Utils.checkNotNull(activityDebitWalletOutput, "activityDebitWalletOutput");
            this.activityDebitWalletOutput = activityDebitWalletOutput;
            return this;
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
        
        public DebitWalletResponse build() {
            return new DebitWalletResponse(
                activityDebitWalletOutput,
                contentType,
                statusCode,
                rawResponse);
        }
    }
}
