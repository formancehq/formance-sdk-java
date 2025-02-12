/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * V2Error - General error
 */
@SuppressWarnings("serial")
public class V2Error extends RuntimeException {

    @JsonProperty("errorCode")
    private SchemasErrorCode errorCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonCreator
    public V2Error(
            @JsonProperty("errorCode") SchemasErrorCode errorCode,
            @JsonProperty("errorMessage") String errorMessage) {
        Utils.checkNotNull(errorCode, "errorCode");
        Utils.checkNotNull(errorMessage, "errorMessage");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public SchemasErrorCode errorCode(){
        return errorCode;
    }

    public String errorMessage(){
        return errorMessage;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    public V2Error withErrorCode(SchemasErrorCode errorCode) {
        Utils.checkNotNull(errorCode, "errorCode");
        this.errorCode = errorCode;
        return this;
    }

    public V2Error withErrorMessage(String errorMessage) {
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
        V2Error other = (V2Error) o;
        return
            Objects.deepEquals(this.errorCode, other.errorCode) &&
            Objects.deepEquals(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errorCode,
            errorMessage);
    }

    @Override
    public String toString() {
        return Utils.toString(V2Error.class,
                "errorCode", errorCode,
                "errorMessage", errorMessage);
    }

    public final static class Builder {

        private SchemasErrorCode errorCode;

        private String errorMessage;

        private Builder() {
          // force use of static builder() method
        }

        public Builder errorCode(SchemasErrorCode errorCode) {
            Utils.checkNotNull(errorCode, "errorCode");
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            Utils.checkNotNull(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
            return this;
        }

        public V2Error build() {
            return new V2Error(
                errorCode,
                errorMessage);
        }
    }
}
