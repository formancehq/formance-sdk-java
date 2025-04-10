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

public class GetReconciliationRequest {

    /**
     * The reconciliation ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=reconciliationID")
    private String reconciliationID;

    @JsonCreator
    public GetReconciliationRequest(
            String reconciliationID) {
        Utils.checkNotNull(reconciliationID, "reconciliationID");
        this.reconciliationID = reconciliationID;
    }

    /**
     * The reconciliation ID.
     */
    @JsonIgnore
    public String reconciliationID() {
        return reconciliationID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The reconciliation ID.
     */
    public GetReconciliationRequest withReconciliationID(String reconciliationID) {
        Utils.checkNotNull(reconciliationID, "reconciliationID");
        this.reconciliationID = reconciliationID;
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
        GetReconciliationRequest other = (GetReconciliationRequest) o;
        return 
            Objects.deepEquals(this.reconciliationID, other.reconciliationID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            reconciliationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetReconciliationRequest.class,
                "reconciliationID", reconciliationID);
    }
    
    public final static class Builder {
 
        private String reconciliationID;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The reconciliation ID.
         */
        public Builder reconciliationID(String reconciliationID) {
            Utils.checkNotNull(reconciliationID, "reconciliationID");
            this.reconciliationID = reconciliationID;
            return this;
        }
        
        public GetReconciliationRequest build() {
            return new GetReconciliationRequest(
                reconciliationID);
        }
    }
}
