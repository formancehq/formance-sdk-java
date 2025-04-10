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
import java.time.OffsetDateTime;
import java.util.Objects;

public class GetPoolBalancesRequest {

    /**
     * Filter balances by date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=at")
    private OffsetDateTime at;

    /**
     * The pool ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=poolId")
    private String poolId;

    @JsonCreator
    public GetPoolBalancesRequest(
            OffsetDateTime at,
            String poolId) {
        Utils.checkNotNull(at, "at");
        Utils.checkNotNull(poolId, "poolId");
        this.at = at;
        this.poolId = poolId;
    }

    /**
     * Filter balances by date.
     */
    @JsonIgnore
    public OffsetDateTime at() {
        return at;
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
     * Filter balances by date.
     */
    public GetPoolBalancesRequest withAt(OffsetDateTime at) {
        Utils.checkNotNull(at, "at");
        this.at = at;
        return this;
    }

    /**
     * The pool ID.
     */
    public GetPoolBalancesRequest withPoolId(String poolId) {
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
        GetPoolBalancesRequest other = (GetPoolBalancesRequest) o;
        return 
            Objects.deepEquals(this.at, other.at) &&
            Objects.deepEquals(this.poolId, other.poolId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            at,
            poolId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPoolBalancesRequest.class,
                "at", at,
                "poolId", poolId);
    }
    
    public final static class Builder {
 
        private OffsetDateTime at;
 
        private String poolId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter balances by date.
         */
        public Builder at(OffsetDateTime at) {
            Utils.checkNotNull(at, "at");
            this.at = at;
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
        
        public GetPoolBalancesRequest build() {
            return new GetPoolBalancesRequest(
                at,
                poolId);
        }
    }
}
