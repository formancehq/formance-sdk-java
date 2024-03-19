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
import java.util.Optional;


public class V2RevertTransactionRequest {

    /**
     * Force revert
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=force")
    private Optional<? extends Boolean> force;

    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private BigInteger id;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    public V2RevertTransactionRequest(
            Optional<? extends Boolean> force,
            BigInteger id,
            String ledger) {
        Utils.checkNotNull(force, "force");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        this.force = force;
        this.id = id;
        this.ledger = ledger;
    }

    /**
     * Force revert
     */
    public Optional<? extends Boolean> force() {
        return force;
    }

    /**
     * Transaction ID.
     */
    public BigInteger id() {
        return id;
    }

    /**
     * Name of the ledger.
     */
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Force revert
     */
    public V2RevertTransactionRequest withForce(boolean force) {
        Utils.checkNotNull(force, "force");
        this.force = Optional.ofNullable(force);
        return this;
    }

    /**
     * Force revert
     */
    public V2RevertTransactionRequest withForce(Optional<? extends Boolean> force) {
        Utils.checkNotNull(force, "force");
        this.force = force;
        return this;
    }

        /**
         * Transaction ID.
         */
    public V2RevertTransactionRequest withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    /**
     * Transaction ID.
     */
    public V2RevertTransactionRequest withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2RevertTransactionRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
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
        V2RevertTransactionRequest other = (V2RevertTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.force, other.force) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            force,
            id,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2RevertTransactionRequest.class,
                "force", force,
                "id", id,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> force = Optional.empty();
 
        private BigInteger id;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Force revert
         */
        public Builder force(boolean force) {
            Utils.checkNotNull(force, "force");
            this.force = Optional.ofNullable(force);
            return this;
        }

        /**
         * Force revert
         */
        public Builder force(Optional<? extends Boolean> force) {
            Utils.checkNotNull(force, "force");
            this.force = force;
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder id(long id) {
            this.id = BigInteger.valueOf(id);
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder id(BigInteger id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public V2RevertTransactionRequest build() {
            return new V2RevertTransactionRequest(
                force,
                id,
                ledger);
        }
    }
}
