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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class V3ForwardBankAccountRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest> v3ForwardBankAccountRequest;

    /**
     * The bank account ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bankAccountID")
    private String bankAccountID;

    @JsonCreator
    public V3ForwardBankAccountRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest> v3ForwardBankAccountRequest,
            String bankAccountID) {
        Utils.checkNotNull(v3ForwardBankAccountRequest, "v3ForwardBankAccountRequest");
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.v3ForwardBankAccountRequest = v3ForwardBankAccountRequest;
        this.bankAccountID = bankAccountID;
    }
    
    public V3ForwardBankAccountRequest(
            String bankAccountID) {
        this(Optional.empty(), bankAccountID);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest> v3ForwardBankAccountRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest>) v3ForwardBankAccountRequest;
    }

    /**
     * The bank account ID
     */
    @JsonIgnore
    public String bankAccountID() {
        return bankAccountID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3ForwardBankAccountRequest withV3ForwardBankAccountRequest(com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest v3ForwardBankAccountRequest) {
        Utils.checkNotNull(v3ForwardBankAccountRequest, "v3ForwardBankAccountRequest");
        this.v3ForwardBankAccountRequest = Optional.ofNullable(v3ForwardBankAccountRequest);
        return this;
    }

    public V3ForwardBankAccountRequest withV3ForwardBankAccountRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest> v3ForwardBankAccountRequest) {
        Utils.checkNotNull(v3ForwardBankAccountRequest, "v3ForwardBankAccountRequest");
        this.v3ForwardBankAccountRequest = v3ForwardBankAccountRequest;
        return this;
    }

    /**
     * The bank account ID
     */
    public V3ForwardBankAccountRequest withBankAccountID(String bankAccountID) {
        Utils.checkNotNull(bankAccountID, "bankAccountID");
        this.bankAccountID = bankAccountID;
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
        V3ForwardBankAccountRequest other = (V3ForwardBankAccountRequest) o;
        return 
            Objects.deepEquals(this.v3ForwardBankAccountRequest, other.v3ForwardBankAccountRequest) &&
            Objects.deepEquals(this.bankAccountID, other.bankAccountID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            v3ForwardBankAccountRequest,
            bankAccountID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ForwardBankAccountRequest.class,
                "v3ForwardBankAccountRequest", v3ForwardBankAccountRequest,
                "bankAccountID", bankAccountID);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest> v3ForwardBankAccountRequest = Optional.empty();
 
        private String bankAccountID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder v3ForwardBankAccountRequest(com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest v3ForwardBankAccountRequest) {
            Utils.checkNotNull(v3ForwardBankAccountRequest, "v3ForwardBankAccountRequest");
            this.v3ForwardBankAccountRequest = Optional.ofNullable(v3ForwardBankAccountRequest);
            return this;
        }

        public Builder v3ForwardBankAccountRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3ForwardBankAccountRequest> v3ForwardBankAccountRequest) {
            Utils.checkNotNull(v3ForwardBankAccountRequest, "v3ForwardBankAccountRequest");
            this.v3ForwardBankAccountRequest = v3ForwardBankAccountRequest;
            return this;
        }

        /**
         * The bank account ID
         */
        public Builder bankAccountID(String bankAccountID) {
            Utils.checkNotNull(bankAccountID, "bankAccountID");
            this.bankAccountID = bankAccountID;
            return this;
        }
        
        public V3ForwardBankAccountRequest build() {
            return new V3ForwardBankAccountRequest(
                v3ForwardBankAccountRequest,
                bankAccountID);
        }
    }
}

