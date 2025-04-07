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

public class V3AddAccountToPoolRequest {

    /**
     * The account ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountID")
    private String accountID;

    /**
     * The pool ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=poolID")
    private String poolID;

    @JsonCreator
    public V3AddAccountToPoolRequest(
            String accountID,
            String poolID) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(poolID, "poolID");
        this.accountID = accountID;
        this.poolID = poolID;
    }

    /**
     * The account ID
     */
    @JsonIgnore
    public String accountID() {
        return accountID;
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
     * The account ID
     */
    public V3AddAccountToPoolRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    /**
     * The pool ID
     */
    public V3AddAccountToPoolRequest withPoolID(String poolID) {
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
        V3AddAccountToPoolRequest other = (V3AddAccountToPoolRequest) o;
        return 
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.poolID, other.poolID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountID,
            poolID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3AddAccountToPoolRequest.class,
                "accountID", accountID,
                "poolID", poolID);
    }
    
    public final static class Builder {
 
        private String accountID;
 
        private String poolID;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account ID
         */
        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        /**
         * The pool ID
         */
        public Builder poolID(String poolID) {
            Utils.checkNotNull(poolID, "poolID");
            this.poolID = poolID;
            return this;
        }
        
        public V3AddAccountToPoolRequest build() {
            return new V3AddAccountToPoolRequest(
                accountID,
                poolID);
        }
    }
}
