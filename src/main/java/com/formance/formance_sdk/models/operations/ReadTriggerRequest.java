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

public class ReadTriggerRequest {

    /**
     * The trigger id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=triggerID")
    private String triggerID;

    @JsonCreator
    public ReadTriggerRequest(
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
    public ReadTriggerRequest withTriggerID(String triggerID) {
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
        ReadTriggerRequest other = (ReadTriggerRequest) o;
        return 
            Objects.deepEquals(this.triggerID, other.triggerID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            triggerID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadTriggerRequest.class,
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
        
        public ReadTriggerRequest build() {
            return new ReadTriggerRequest(
                triggerID);
        }
    }
}
