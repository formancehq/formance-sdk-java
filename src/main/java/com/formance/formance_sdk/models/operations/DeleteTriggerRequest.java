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

public class DeleteTriggerRequest {

    /**
     * The trigger id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=triggerID")
    private String triggerID;

    @JsonCreator
    public DeleteTriggerRequest(
            String triggerID) {
        Utils.checkNotNull(triggerID, "triggerID");
        this.triggerID = triggerID;
    }

    /**
     * The trigger id
     */
    @JsonIgnore
    public String triggerID() {
        return triggerID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The trigger id
     */
    public DeleteTriggerRequest withTriggerID(String triggerID) {
        Utils.checkNotNull(triggerID, "triggerID");
        this.triggerID = triggerID;
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
        DeleteTriggerRequest other = (DeleteTriggerRequest) o;
        return 
            java.util.Objects.deepEquals(this.triggerID, other.triggerID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            triggerID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteTriggerRequest.class,
                "triggerID", triggerID);
    }
    
    public final static class Builder {
 
        private String triggerID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The trigger id
         */
        public Builder triggerID(String triggerID) {
            Utils.checkNotNull(triggerID, "triggerID");
            this.triggerID = triggerID;
            return this;
        }
        
        public DeleteTriggerRequest build() {
            return new DeleteTriggerRequest(
                triggerID);
        }
    }
}

