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


public class DeletePolicyRequest {

    /**
     * The policy ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=policyID")
    private String policyID;

    @JsonCreator
    public DeletePolicyRequest(
            String policyID) {
        Utils.checkNotNull(policyID, "policyID");
        this.policyID = policyID;
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

    /**
     * The policy ID.
     */
    public DeletePolicyRequest withPolicyID(String policyID) {
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
        DeletePolicyRequest other = (DeletePolicyRequest) o;
        return 
            Objects.deepEquals(this.policyID, other.policyID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            policyID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeletePolicyRequest.class,
                "policyID", policyID);
    }
    
    public final static class Builder {
 
        private String policyID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The policy ID.
         */
        public Builder policyID(String policyID) {
            Utils.checkNotNull(policyID, "policyID");
            this.policyID = policyID;
            return this;
        }
        
        public DeletePolicyRequest build() {
            return new DeletePolicyRequest(
                policyID);
        }
    }
}

