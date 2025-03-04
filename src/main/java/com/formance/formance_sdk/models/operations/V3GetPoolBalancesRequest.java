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
import java.util.Optional;

public class V3GetPoolBalancesRequest {

    /**
     * The time to filter by
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=at")
    private Optional<OffsetDateTime> at;

    /**
     * The pool ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=poolID")
    private String poolID;

    @JsonCreator
    public V3GetPoolBalancesRequest(
            Optional<OffsetDateTime> at,
            String poolID) {
        Utils.checkNotNull(at, "at");
        Utils.checkNotNull(poolID, "poolID");
        this.at = at;
        this.poolID = poolID;
    }
    
    public V3GetPoolBalancesRequest(
            String poolID) {
        this(Optional.empty(), poolID);
    }

    /**
     * The time to filter by
     */
    @JsonIgnore
    public Optional<OffsetDateTime> at() {
        return at;
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
     * The time to filter by
     */
    public V3GetPoolBalancesRequest withAt(OffsetDateTime at) {
        Utils.checkNotNull(at, "at");
        this.at = Optional.ofNullable(at);
        return this;
    }

    /**
     * The time to filter by
     */
    public V3GetPoolBalancesRequest withAt(Optional<OffsetDateTime> at) {
        Utils.checkNotNull(at, "at");
        this.at = at;
        return this;
    }

    /**
     * The pool ID
     */
    public V3GetPoolBalancesRequest withPoolID(String poolID) {
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
        V3GetPoolBalancesRequest other = (V3GetPoolBalancesRequest) o;
        return 
            Objects.deepEquals(this.at, other.at) &&
            Objects.deepEquals(this.poolID, other.poolID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            at,
            poolID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3GetPoolBalancesRequest.class,
                "at", at,
                "poolID", poolID);
    }
    
    public final static class Builder {
 
        private Optional<OffsetDateTime> at = Optional.empty();
 
        private String poolID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The time to filter by
         */
        public Builder at(OffsetDateTime at) {
            Utils.checkNotNull(at, "at");
            this.at = Optional.ofNullable(at);
            return this;
        }

        /**
         * The time to filter by
         */
        public Builder at(Optional<OffsetDateTime> at) {
            Utils.checkNotNull(at, "at");
            this.at = at;
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
        
        public V3GetPoolBalancesRequest build() {
            return new V3GetPoolBalancesRequest(
                at,
                poolID);
        }
    }
}

