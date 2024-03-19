/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class V2ReadTriggerRequest {

    /**
     * The trigger id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=triggerID")
    private String triggerID;

    public V2ReadTriggerRequest(
            String triggerID) {
        Utils.checkNotNull(triggerID, "triggerID");
        this.triggerID = triggerID;
    }

    /**
     * The trigger id
     */
    public String triggerID() {
        return triggerID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The trigger id
     */
    public V2ReadTriggerRequest withTriggerID(String triggerID) {
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
        V2ReadTriggerRequest other = (V2ReadTriggerRequest) o;
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
        return Utils.toString(V2ReadTriggerRequest.class,
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
        
        public V2ReadTriggerRequest build() {
            return new V2ReadTriggerRequest(
                triggerID);
        }
    }
}
