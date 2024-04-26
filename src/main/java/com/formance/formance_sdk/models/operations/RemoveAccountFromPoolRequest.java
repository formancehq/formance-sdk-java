/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class RemoveAccountFromPoolRequest {

    /**
     * The account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    private String accountId;

    /**
     * The pool ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=poolId")
    private String poolId;

    @JsonCreator
    public RemoveAccountFromPoolRequest(
            String accountId,
            String poolId) {
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(poolId, "poolId");
        this.accountId = accountId;
        this.poolId = poolId;
    }

    /**
     * The account ID.
     */
    @JsonIgnore
    public String accountId() {
        return accountId;
    }

    /**
     * The pool ID.
     */
    @JsonIgnore
    public String poolId() {
        return poolId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The account ID.
     */
    public RemoveAccountFromPoolRequest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The pool ID.
     */
    public RemoveAccountFromPoolRequest withPoolId(String poolId) {
        Utils.checkNotNull(poolId, "poolId");
        this.poolId = poolId;
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
        RemoveAccountFromPoolRequest other = (RemoveAccountFromPoolRequest) o;
        return 
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.poolId, other.poolId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountId,
            poolId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RemoveAccountFromPoolRequest.class,
                "accountId", accountId,
                "poolId", poolId);
    }
    
    public final static class Builder {
 
        private String accountId;
 
        private String poolId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The account ID.
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * The pool ID.
         */
        public Builder poolId(String poolId) {
            Utils.checkNotNull(poolId, "poolId");
            this.poolId = poolId;
            return this;
        }
        
        public RemoveAccountFromPoolRequest build() {
            return new RemoveAccountFromPoolRequest(
                accountId,
                poolId);
        }
    }
}

