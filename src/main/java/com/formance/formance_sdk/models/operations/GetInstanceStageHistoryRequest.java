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


public class GetInstanceStageHistoryRequest {

    /**
     * The instance id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=instanceID")
    private String instanceID;

    /**
     * The stage number
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=number")
    private long number;

    public GetInstanceStageHistoryRequest(
            String instanceID,
            long number) {
        Utils.checkNotNull(instanceID, "instanceID");
        Utils.checkNotNull(number, "number");
        this.instanceID = instanceID;
        this.number = number;
    }

    /**
     * The instance id
     */
    public String instanceID() {
        return instanceID;
    }

    /**
     * The stage number
     */
    public long number() {
        return number;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The instance id
     */
    public GetInstanceStageHistoryRequest withInstanceID(String instanceID) {
        Utils.checkNotNull(instanceID, "instanceID");
        this.instanceID = instanceID;
        return this;
    }

    /**
     * The stage number
     */
    public GetInstanceStageHistoryRequest withNumber(long number) {
        Utils.checkNotNull(number, "number");
        this.number = number;
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
        GetInstanceStageHistoryRequest other = (GetInstanceStageHistoryRequest) o;
        return 
            java.util.Objects.deepEquals(this.instanceID, other.instanceID) &&
            java.util.Objects.deepEquals(this.number, other.number);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            instanceID,
            number);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetInstanceStageHistoryRequest.class,
                "instanceID", instanceID,
                "number", number);
    }
    
    public final static class Builder {
 
        private String instanceID;
 
        private Long number;  
        
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

        /**
         * The stage number
         */
        public Builder number(long number) {
            Utils.checkNotNull(number, "number");
            this.number = number;
            return this;
        }
        
        public GetInstanceStageHistoryRequest build() {
            return new GetInstanceStageHistoryRequest(
                instanceID,
                number);
        }
    }
}

