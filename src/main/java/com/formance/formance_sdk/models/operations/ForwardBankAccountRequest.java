/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ForwardBankAccountRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.formance.formance_sdk.models.shared.ForwardBankAccountRequest forwardBankAccountRequest;

    /**
     * The bank account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountId")
    private String bankAccountId;

    @JsonCreator
    public ForwardBankAccountRequest(
            com.formance.formance_sdk.models.shared.ForwardBankAccountRequest forwardBankAccountRequest,
            String bankAccountId) {
        Utils.checkNotNull(forwardBankAccountRequest, "forwardBankAccountRequest");
        Utils.checkNotNull(bankAccountId, "bankAccountId");
        this.forwardBankAccountRequest = forwardBankAccountRequest;
        this.bankAccountId = bankAccountId;
    }

    @JsonIgnore
    public com.formance.formance_sdk.models.shared.ForwardBankAccountRequest forwardBankAccountRequest() {
        return forwardBankAccountRequest;
    }

    /**
     * The bank account ID.
     */
    @JsonIgnore
    public String bankAccountId() {
        return bankAccountId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ForwardBankAccountRequest withForwardBankAccountRequest(com.formance.formance_sdk.models.shared.ForwardBankAccountRequest forwardBankAccountRequest) {
        Utils.checkNotNull(forwardBankAccountRequest, "forwardBankAccountRequest");
        this.forwardBankAccountRequest = forwardBankAccountRequest;
        return this;
    }

    /**
     * The bank account ID.
     */
    public ForwardBankAccountRequest withBankAccountId(String bankAccountId) {
        Utils.checkNotNull(bankAccountId, "bankAccountId");
        this.bankAccountId = bankAccountId;
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
        ForwardBankAccountRequest other = (ForwardBankAccountRequest) o;
        return 
            java.util.Objects.deepEquals(this.forwardBankAccountRequest, other.forwardBankAccountRequest) &&
            java.util.Objects.deepEquals(this.bankAccountId, other.bankAccountId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            forwardBankAccountRequest,
            bankAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ForwardBankAccountRequest.class,
                "forwardBankAccountRequest", forwardBankAccountRequest,
                "bankAccountId", bankAccountId);
    }
    
    public final static class Builder {
 
        private com.formance.formance_sdk.models.shared.ForwardBankAccountRequest forwardBankAccountRequest;
 
        private String bankAccountId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder forwardBankAccountRequest(com.formance.formance_sdk.models.shared.ForwardBankAccountRequest forwardBankAccountRequest) {
            Utils.checkNotNull(forwardBankAccountRequest, "forwardBankAccountRequest");
            this.forwardBankAccountRequest = forwardBankAccountRequest;
            return this;
        }

        /**
         * The bank account ID.
         */
        public Builder bankAccountId(String bankAccountId) {
            Utils.checkNotNull(bankAccountId, "bankAccountId");
            this.bankAccountId = bankAccountId;
            return this;
        }
        
        public ForwardBankAccountRequest build() {
            return new ForwardBankAccountRequest(
                forwardBankAccountRequest,
                bankAccountId);
        }
    }
}

