/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class UpdateTransferInitiationStatusRequest {

    @JsonProperty("status")
    private Status status;

    @JsonCreator
    public UpdateTransferInitiationStatusRequest(
            @JsonProperty("status") Status status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    @JsonIgnore
    public Status status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UpdateTransferInitiationStatusRequest withStatus(Status status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        UpdateTransferInitiationStatusRequest other = (UpdateTransferInitiationStatusRequest) o;
        return 
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateTransferInitiationStatusRequest.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private Status status;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder status(Status status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public UpdateTransferInitiationStatusRequest build() {
            return new UpdateTransferInitiationStatusRequest(
                status);
        }
    }
}
