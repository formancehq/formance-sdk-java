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

public class UpdateBankAccountMetadataRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest updateBankAccountMetadataRequest;

    /**
     * The bank account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountId")
    private String bankAccountId;

    @JsonCreator
    public UpdateBankAccountMetadataRequest(
            com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest updateBankAccountMetadataRequest,
            String bankAccountId) {
        Utils.checkNotNull(updateBankAccountMetadataRequest, "updateBankAccountMetadataRequest");
        Utils.checkNotNull(bankAccountId, "bankAccountId");
        this.updateBankAccountMetadataRequest = updateBankAccountMetadataRequest;
        this.bankAccountId = bankAccountId;
    }

    @JsonIgnore
    public com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest updateBankAccountMetadataRequest() {
        return updateBankAccountMetadataRequest;
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

    public UpdateBankAccountMetadataRequest withUpdateBankAccountMetadataRequest(com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest updateBankAccountMetadataRequest) {
        Utils.checkNotNull(updateBankAccountMetadataRequest, "updateBankAccountMetadataRequest");
        this.updateBankAccountMetadataRequest = updateBankAccountMetadataRequest;
        return this;
    }

    /**
     * The bank account ID.
     */
    public UpdateBankAccountMetadataRequest withBankAccountId(String bankAccountId) {
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
        UpdateBankAccountMetadataRequest other = (UpdateBankAccountMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.updateBankAccountMetadataRequest, other.updateBankAccountMetadataRequest) &&
            java.util.Objects.deepEquals(this.bankAccountId, other.bankAccountId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updateBankAccountMetadataRequest,
            bankAccountId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateBankAccountMetadataRequest.class,
                "updateBankAccountMetadataRequest", updateBankAccountMetadataRequest,
                "bankAccountId", bankAccountId);
    }
    
    public final static class Builder {
 
        private com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest updateBankAccountMetadataRequest;
 
        private String bankAccountId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateBankAccountMetadataRequest(com.formance.formance_sdk.models.shared.UpdateBankAccountMetadataRequest updateBankAccountMetadataRequest) {
            Utils.checkNotNull(updateBankAccountMetadataRequest, "updateBankAccountMetadataRequest");
            this.updateBankAccountMetadataRequest = updateBankAccountMetadataRequest;
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
        
        public UpdateBankAccountMetadataRequest build() {
            return new UpdateBankAccountMetadataRequest(
                updateBankAccountMetadataRequest,
                bankAccountId);
        }
    }
}

