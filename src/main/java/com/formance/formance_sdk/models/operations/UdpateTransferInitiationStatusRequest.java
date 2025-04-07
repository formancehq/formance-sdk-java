/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.UpdateTransferInitiationStatusRequest;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class UdpateTransferInitiationStatusRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private UpdateTransferInitiationStatusRequest updateTransferInitiationStatusRequest;

    /**
     * The transfer ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=transferId")
    private String transferId;

    @JsonCreator
    public UdpateTransferInitiationStatusRequest(
            UpdateTransferInitiationStatusRequest updateTransferInitiationStatusRequest,
            String transferId) {
        Utils.checkNotNull(updateTransferInitiationStatusRequest, "updateTransferInitiationStatusRequest");
        Utils.checkNotNull(transferId, "transferId");
        this.updateTransferInitiationStatusRequest = updateTransferInitiationStatusRequest;
        this.transferId = transferId;
    }

    @JsonIgnore
    public UpdateTransferInitiationStatusRequest updateTransferInitiationStatusRequest() {
        return updateTransferInitiationStatusRequest;
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

    public UdpateTransferInitiationStatusRequest withUpdateTransferInitiationStatusRequest(UpdateTransferInitiationStatusRequest updateTransferInitiationStatusRequest) {
        Utils.checkNotNull(updateTransferInitiationStatusRequest, "updateTransferInitiationStatusRequest");
        this.updateTransferInitiationStatusRequest = updateTransferInitiationStatusRequest;
        return this;
    }

    /**
     * The transfer ID.
     */
    public UdpateTransferInitiationStatusRequest withTransferId(String transferId) {
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
        UdpateTransferInitiationStatusRequest other = (UdpateTransferInitiationStatusRequest) o;
        return 
            Objects.deepEquals(this.updateTransferInitiationStatusRequest, other.updateTransferInitiationStatusRequest) &&
            Objects.deepEquals(this.transferId, other.transferId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            updateTransferInitiationStatusRequest,
            transferId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UdpateTransferInitiationStatusRequest.class,
                "updateTransferInitiationStatusRequest", updateTransferInitiationStatusRequest,
                "transferId", transferId);
    }
    
    public final static class Builder {
 
        private UpdateTransferInitiationStatusRequest updateTransferInitiationStatusRequest;
 
        private String transferId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateTransferInitiationStatusRequest(UpdateTransferInitiationStatusRequest updateTransferInitiationStatusRequest) {
            Utils.checkNotNull(updateTransferInitiationStatusRequest, "updateTransferInitiationStatusRequest");
            this.updateTransferInitiationStatusRequest = updateTransferInitiationStatusRequest;
            return this;
        }

        /**
         * The transfer ID.
         */
        public Builder transferId(String transferId) {
            Utils.checkNotNull(transferId, "transferId");
            this.transferId = transferId;
            return this;
        }
        
        public UdpateTransferInitiationStatusRequest build() {
            return new UdpateTransferInitiationStatusRequest(
                updateTransferInitiationStatusRequest,
                transferId);
        }
    }
}
