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

public class V3GetPoolRequest {

    /**
     * The pool ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=poolID")
    private String poolID;

    @JsonCreator
    public V3GetPoolRequest(
            String poolID) {
        Utils.checkNotNull(poolID, "poolID");
        this.poolID = poolID;
    }

    /**
     * The pool ID
     */
    @JsonIgnore
    public String poolID() {
        return poolID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The pool ID
     */
    public V3GetPoolRequest withPoolID(String poolID) {
        Utils.checkNotNull(poolID, "poolID");
        this.poolID = poolID;
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
        V3GetPoolRequest other = (V3GetPoolRequest) o;
        return 
            Objects.deepEquals(this.poolID, other.poolID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            poolID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3GetPoolRequest.class,
                "poolID", poolID);
    }
    
    public final static class Builder {
 
        private String poolID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The pool ID
         */
        public Builder poolID(String poolID) {
            Utils.checkNotNull(poolID, "poolID");
            this.poolID = poolID;
            return this;
        }
        
        public V3GetPoolRequest build() {
            return new V3GetPoolRequest(
                poolID);
        }
    }
}

