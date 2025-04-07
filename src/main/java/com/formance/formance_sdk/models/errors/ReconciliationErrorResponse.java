/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * ReconciliationErrorResponse
 * 
 * <p>Error response
 */
@SuppressWarnings("serial")
public class ReconciliationErrorResponse extends RuntimeException {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    private Optional<String> details;

    @JsonProperty("errorCode")
    private String errorCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonCreator
    public ReconciliationErrorResponse(
            @JsonProperty("details") Optional<String> details,
            @JsonProperty("errorCode") String errorCode,
            @JsonProperty("errorMessage") String errorMessage) {
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(errorCode, "errorCode");
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.details = details;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    
    public ReconciliationErrorResponse(
            String errorCode,
            String errorMessage) {
        this(Optional.empty(), errorCode, errorMessage);
    }

    @JsonIgnore
    public Optional<String> details() {
        return details;
    }

    @JsonIgnore
    public String errorCode() {
        return errorCode;
    }

    @JsonIgnore
    public String errorMessage() {
        return errorMessage;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ReconciliationErrorResponse withDetails(String details) {
        Utils.checkNotNull(details, "details");
        this.details = Optional.ofNullable(details);
        return this;
    }

    public ReconciliationErrorResponse withDetails(Optional<String> details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    public ReconciliationErrorResponse withErrorCode(String errorCode) {
        Utils.checkNotNull(errorCode, "errorCode");
        this.errorCode = errorCode;
        return this;
    }

    public ReconciliationErrorResponse withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
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
        ReconciliationErrorResponse other = (ReconciliationErrorResponse) o;
        return 
            Objects.deepEquals(this.details, other.details) &&
            Objects.deepEquals(this.errorCode, other.errorCode) &&
            Objects.deepEquals(this.errorMessage, other.errorMessage);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            details,
            errorCode,
            errorMessage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconciliationErrorResponse.class,
                "details", details,
                "errorCode", errorCode,
                "errorMessage", errorMessage);
    }
    
    public final static class Builder {
 
        private Optional<String> details = Optional.empty();
 
        private String errorCode;
 
        private String errorMessage;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder details(String details) {
            Utils.checkNotNull(details, "details");
            this.details = Optional.ofNullable(details);
            return this;
        }

        public Builder details(Optional<String> details) {
            Utils.checkNotNull(details, "details");
            this.details = details;
            return this;
        }

        public Builder errorCode(String errorCode) {
            Utils.checkNotNull(errorCode, "errorCode");
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }
        
        public ReconciliationErrorResponse build() {
            return new ReconciliationErrorResponse(
                details,
                errorCode,
                errorMessage);
        }
    }
}

