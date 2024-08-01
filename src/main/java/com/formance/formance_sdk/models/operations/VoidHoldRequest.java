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

public class VoidHoldRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=hold_id")
    private String holdId;

    @JsonCreator
    public VoidHoldRequest(
            String holdId) {
        Utils.checkNotNull(holdId, "holdId");
        this.holdId = holdId;
    }

    @JsonIgnore
    public String holdId() {
        return holdId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public VoidHoldRequest withHoldId(String holdId) {
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
        VoidHoldRequest other = (VoidHoldRequest) o;
        return 
            java.util.Objects.deepEquals(this.holdId, other.holdId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            holdId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(VoidHoldRequest.class,
                "holdId", holdId);
    }
    
    public final static class Builder {
 
        private String holdId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder holdId(String holdId) {
            Utils.checkNotNull(holdId, "holdId");
            this.holdId = holdId;
            return this;
        }
        
        public VoidHoldRequest build() {
            return new VoidHoldRequest(
                holdId);
        }
    }
}

