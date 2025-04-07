/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class ScriptResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    private Optional<String> details;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorCode")
    private Optional<? extends ErrorsEnum> errorCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    private Optional<String> errorMessage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction")
    private Optional<? extends Transaction> transaction;

    @JsonCreator
    public ScriptResponse(
            @JsonProperty("details") Optional<String> details,
            @JsonProperty("errorCode") Optional<? extends ErrorsEnum> errorCode,
            @JsonProperty("errorMessage") Optional<String> errorMessage,
            @JsonProperty("transaction") Optional<? extends Transaction> transaction) {
        Utils.checkNotNull(details, "details");
        Utils.checkNotNull(errorCode, "errorCode");
        Utils.checkNotNull(errorMessage, "errorMessage");
        Utils.checkNotNull(transaction, "transaction");
        this.details = details;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.transaction = transaction;
    }
    
    public ScriptResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> details() {
        return details;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ErrorsEnum> errorCode() {
        return (Optional<ErrorsEnum>) errorCode;
    }

    @JsonIgnore
    public Optional<String> errorMessage() {
        return errorMessage;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Transaction> transaction() {
        return (Optional<Transaction>) transaction;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ScriptResponse withDetails(String details) {
        Utils.checkNotNull(details, "details");
        this.details = Optional.ofNullable(details);
        return this;
    }

    public ScriptResponse withDetails(Optional<String> details) {
        Utils.checkNotNull(details, "details");
        this.details = details;
        return this;
    }

    public ScriptResponse withErrorCode(ErrorsEnum errorCode) {
        Utils.checkNotNull(errorCode, "errorCode");
        this.errorCode = Optional.ofNullable(errorCode);
        return this;
    }

    public ScriptResponse withErrorCode(Optional<? extends ErrorsEnum> errorCode) {
        Utils.checkNotNull(errorCode, "errorCode");
        this.errorCode = errorCode;
        return this;
    }

    public ScriptResponse withErrorMessage(String errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = Optional.ofNullable(errorMessage);
        return this;
    }

    public ScriptResponse withErrorMessage(Optional<String> errorMessage) {
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        return this;
    }

    public ScriptResponse withTransaction(Transaction transaction) {
        Utils.checkNotNull(transaction, "transaction");
        this.transaction = Optional.ofNullable(transaction);
        return this;
    }

    public ScriptResponse withTransaction(Optional<? extends Transaction> transaction) {
        Utils.checkNotNull(transaction, "transaction");
        this.transaction = transaction;
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
        ScriptResponse other = (ScriptResponse) o;
        return 
            Objects.deepEquals(this.details, other.details) &&
            Objects.deepEquals(this.errorCode, other.errorCode) &&
            Objects.deepEquals(this.errorMessage, other.errorMessage) &&
            Objects.deepEquals(this.transaction, other.transaction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            details,
            errorCode,
            errorMessage,
            transaction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ScriptResponse.class,
                "details", details,
                "errorCode", errorCode,
                "errorMessage", errorMessage,
                "transaction", transaction);
    }
    
    public final static class Builder {
 
        private Optional<String> details = Optional.empty();
 
        private Optional<? extends ErrorsEnum> errorCode = Optional.empty();
 
        private Optional<String> errorMessage = Optional.empty();
 
        private Optional<? extends Transaction> transaction = Optional.empty();
        
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

        public Builder errorCode(ErrorsEnum errorCode) {
            Utils.checkNotNull(errorCode, "errorCode");
            this.errorCode = Optional.ofNullable(errorCode);
            return this;
        }

        public Builder errorCode(Optional<? extends ErrorsEnum> errorCode) {
            Utils.checkNotNull(errorCode, "errorCode");
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = Optional.ofNullable(errorMessage);
            return this;
        }

        public Builder errorMessage(Optional<String> errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder transaction(Transaction transaction) {
            Utils.checkNotNull(transaction, "transaction");
            this.transaction = Optional.ofNullable(transaction);
            return this;
        }

        public Builder transaction(Optional<? extends Transaction> transaction) {
            Utils.checkNotNull(transaction, "transaction");
            this.transaction = transaction;
            return this;
        }
        
        public ScriptResponse build() {
            return new ScriptResponse(
                details,
                errorCode,
                errorMessage,
                transaction);
        }
    }
}
