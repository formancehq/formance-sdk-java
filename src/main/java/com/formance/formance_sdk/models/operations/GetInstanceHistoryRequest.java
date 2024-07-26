/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class GetInstanceHistoryRequest {

    /**
     * The instance id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=instanceID")
    private String instanceID;

    @JsonCreator
    public GetInstanceHistoryRequest(
            String instanceID) {
        Utils.checkNotNull(instanceID, "instanceID");
        this.instanceID = instanceID;
    }

    /**
     * The instance id
     */
    @JsonIgnore
    public String instanceID() {
        return instanceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The instance id
     */
    public GetInstanceHistoryRequest withInstanceID(String instanceID) {
        Utils.checkNotNull(instanceID, "instanceID");
        this.instanceID = instanceID;
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
        GetInstanceHistoryRequest other = (GetInstanceHistoryRequest) o;
        return 
            java.util.Objects.deepEquals(this.instanceID, other.instanceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            instanceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetInstanceHistoryRequest.class,
                "instanceID", instanceID);
    }
    
    public final static class Builder {
 
        private String instanceID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The instance id
         */
        public Builder instanceID(String instanceID) {
            Utils.checkNotNull(instanceID, "instanceID");
            this.instanceID = instanceID;
            return this;
        }
        
        public GetInstanceHistoryRequest build() {
            return new GetInstanceHistoryRequest(
                instanceID);
        }
    }
}

