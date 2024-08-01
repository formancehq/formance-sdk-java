/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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
import java.util.Optional;

public class ConfirmHoldRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.ConfirmHoldRequest> confirmHoldRequest;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=hold_id")
    private String holdId;

    @JsonCreator
    public ConfirmHoldRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.ConfirmHoldRequest> confirmHoldRequest,
            String holdId) {
        Utils.checkNotNull(confirmHoldRequest, "confirmHoldRequest");
        Utils.checkNotNull(holdId, "holdId");
        this.confirmHoldRequest = confirmHoldRequest;
        this.holdId = holdId;
    }
    
    public ConfirmHoldRequest(
            String holdId) {
        this(Optional.empty(), holdId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.ConfirmHoldRequest> confirmHoldRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.ConfirmHoldRequest>) confirmHoldRequest;
    }

    @JsonIgnore
    public String holdId() {
        return holdId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConfirmHoldRequest withConfirmHoldRequest(com.formance.formance_sdk.models.shared.ConfirmHoldRequest confirmHoldRequest) {
        Utils.checkNotNull(confirmHoldRequest, "confirmHoldRequest");
        this.confirmHoldRequest = Optional.ofNullable(confirmHoldRequest);
        return this;
    }

    public ConfirmHoldRequest withConfirmHoldRequest(Optional<? extends com.formance.formance_sdk.models.shared.ConfirmHoldRequest> confirmHoldRequest) {
        Utils.checkNotNull(confirmHoldRequest, "confirmHoldRequest");
        this.confirmHoldRequest = confirmHoldRequest;
        return this;
    }

    public ConfirmHoldRequest withHoldId(String holdId) {
        Utils.checkNotNull(holdId, "holdId");
        this.holdId = holdId;
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
        ConfirmHoldRequest other = (ConfirmHoldRequest) o;
        return 
            java.util.Objects.deepEquals(this.confirmHoldRequest, other.confirmHoldRequest) &&
            java.util.Objects.deepEquals(this.holdId, other.holdId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            confirmHoldRequest,
            holdId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfirmHoldRequest.class,
                "confirmHoldRequest", confirmHoldRequest,
                "holdId", holdId);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.ConfirmHoldRequest> confirmHoldRequest = Optional.empty();
 
        private String holdId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder confirmHoldRequest(com.formance.formance_sdk.models.shared.ConfirmHoldRequest confirmHoldRequest) {
            Utils.checkNotNull(confirmHoldRequest, "confirmHoldRequest");
            this.confirmHoldRequest = Optional.ofNullable(confirmHoldRequest);
            return this;
        }

        public Builder confirmHoldRequest(Optional<? extends com.formance.formance_sdk.models.shared.ConfirmHoldRequest> confirmHoldRequest) {
            Utils.checkNotNull(confirmHoldRequest, "confirmHoldRequest");
            this.confirmHoldRequest = confirmHoldRequest;
            return this;
        }

        public Builder holdId(String holdId) {
            Utils.checkNotNull(holdId, "holdId");
            this.holdId = holdId;
            return this;
        }
        
        public ConfirmHoldRequest build() {
            return new ConfirmHoldRequest(
                confirmHoldRequest,
                holdId);
        }
    }
}

