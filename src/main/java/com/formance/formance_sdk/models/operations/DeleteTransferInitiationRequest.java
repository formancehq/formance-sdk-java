/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class DeleteTransferInitiationRequest {

    /**
     * The transfer ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transferId")
    private String transferId;

    @JsonCreator
    public DeleteTransferInitiationRequest(
            String transferId) {
        Utils.checkNotNull(transferId, "transferId");
        this.transferId = transferId;
    }

    /**
     * The transfer ID.
     */
    @JsonIgnore
    public String transferId() {
        return transferId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The transfer ID.
     */
    public DeleteTransferInitiationRequest withTransferId(String transferId) {
        Utils.checkNotNull(transferId, "transferId");
        this.transferId = transferId;
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
        DeleteTransferInitiationRequest other = (DeleteTransferInitiationRequest) o;
        return 
            Objects.deepEquals(this.transferId, other.transferId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            transferId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteTransferInitiationRequest.class,
                "transferId", transferId);
    }
    
    public final static class Builder {
 
        private String transferId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The transfer ID.
         */
        public Builder transferId(String transferId) {
            Utils.checkNotNull(transferId, "transferId");
            this.transferId = transferId;
            return this;
        }
        
        public DeleteTransferInitiationRequest build() {
            return new DeleteTransferInitiationRequest(
                transferId);
        }
    }
}
