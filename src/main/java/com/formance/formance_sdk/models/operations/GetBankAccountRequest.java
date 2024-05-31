/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class GetBankAccountRequest {

    /**
     * The bank account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountId")
    private String bankAccountId;

    @JsonCreator
    public GetBankAccountRequest(
            String bankAccountId) {
        Utils.checkNotNull(bankAccountId, "bankAccountId");
        this.bankAccountId = bankAccountId;
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

    /**
     * The bank account ID.
     */
    public GetBankAccountRequest withBankAccountId(String bankAccountId) {
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
        GetBankAccountRequest other = (GetBankAccountRequest) o;
        return 
            java.util.Objects.deepEquals(this.bankAccountId, other.bankAccountId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            bankAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBankAccountRequest.class,
                "bankAccountId", bankAccountId);
    }
    
    public final static class Builder {
 
        private String bankAccountId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The bank account ID.
         */
        public Builder bankAccountId(String bankAccountId) {
            Utils.checkNotNull(bankAccountId, "bankAccountId");
            this.bankAccountId = bankAccountId;
            return this;
        }
        
        public GetBankAccountRequest build() {
            return new GetBankAccountRequest(
                bankAccountId);
        }
    }
}

