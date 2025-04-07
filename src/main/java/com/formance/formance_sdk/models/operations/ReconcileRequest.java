/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.ReconciliationRequest;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class ReconcileRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ReconciliationRequest reconciliationRequest;

    /**
     * The policy ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=policyID")
    private String policyID;

    @JsonCreator
    public ReconcileRequest(
            ReconciliationRequest reconciliationRequest,
            String policyID) {
        Utils.checkNotNull(reconciliationRequest, "reconciliationRequest");
        Utils.checkNotNull(policyID, "policyID");
        this.reconciliationRequest = reconciliationRequest;
        this.policyID = policyID;
    }

    @JsonIgnore
    public ReconciliationRequest reconciliationRequest() {
        return reconciliationRequest;
    }

    /**
     * The policy ID.
     */
    @JsonIgnore
    public String policyID() {
        return policyID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ReconcileRequest withReconciliationRequest(ReconciliationRequest reconciliationRequest) {
        Utils.checkNotNull(reconciliationRequest, "reconciliationRequest");
        this.reconciliationRequest = reconciliationRequest;
        return this;
    }

    /**
     * The policy ID.
     */
    public ReconcileRequest withPolicyID(String policyID) {
        Utils.checkNotNull(policyID, "policyID");
        this.policyID = policyID;
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
        ReconcileRequest other = (ReconcileRequest) o;
        return 
            Objects.deepEquals(this.reconciliationRequest, other.reconciliationRequest) &&
            Objects.deepEquals(this.policyID, other.policyID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            reconciliationRequest,
            policyID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconcileRequest.class,
                "reconciliationRequest", reconciliationRequest,
                "policyID", policyID);
    }
    
    public final static class Builder {
 
        private ReconciliationRequest reconciliationRequest;
 
        private String policyID;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder reconciliationRequest(ReconciliationRequest reconciliationRequest) {
            Utils.checkNotNull(reconciliationRequest, "reconciliationRequest");
            this.reconciliationRequest = reconciliationRequest;
            return this;
        }

        /**
         * The policy ID.
         */
        public Builder policyID(String policyID) {
            Utils.checkNotNull(policyID, "policyID");
            this.policyID = policyID;
            return this;
        }
        
        public ReconcileRequest build() {
            return new ReconcileRequest(
                reconciliationRequest,
                policyID);
        }
    }
}
