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
import java.util.Optional;

public class V2RevertTransactionRequest {

    /**
     * Revert transaction at effective date of the original tx
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=atEffectiveDate")
    private Optional<? extends Boolean> atEffectiveDate;

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

    @JsonCreator
    public V2RevertTransactionRequest(
            Optional<? extends Boolean> atEffectiveDate,
            Optional<? extends Boolean> force,
            BigInteger id,
            String ledger) {
        Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
        Utils.checkNotNull(force, "force");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        this.atEffectiveDate = atEffectiveDate;
        this.force = force;
        this.id = id;
        this.ledger = ledger;
    }
    
    public V2RevertTransactionRequest(
            BigInteger id,
            String ledger) {
        this(Optional.empty(), Optional.empty(), id, ledger);
    }

    /**
     * Revert transaction at effective date of the original tx
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> atEffectiveDate() {
        return (Optional<Boolean>) atEffectiveDate;
    }

    /**
     * Force revert
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> force() {
        return (Optional<Boolean>) force;
    }

    /**
     * Transaction ID.
     */
    @JsonIgnore
    public BigInteger id() {
        return id;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Revert transaction at effective date of the original tx
     */
    public V2RevertTransactionRequest withAtEffectiveDate(boolean atEffectiveDate) {
        Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
        this.atEffectiveDate = Optional.ofNullable(atEffectiveDate);
        return this;
    }

    /**
     * Revert transaction at effective date of the original tx
     */
    public V2RevertTransactionRequest withAtEffectiveDate(Optional<? extends Boolean> atEffectiveDate) {
        Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
        this.atEffectiveDate = atEffectiveDate;
        return this;
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
            java.util.Objects.deepEquals(this.atEffectiveDate, other.atEffectiveDate) &&
            java.util.Objects.deepEquals(this.force, other.force) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            atEffectiveDate,
            force,
            id,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2RevertTransactionRequest.class,
                "atEffectiveDate", atEffectiveDate,
                "force", force,
                "id", id,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> atEffectiveDate = Optional.empty();
 
        private Optional<? extends Boolean> force = Optional.empty();
 
        private BigInteger id;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Revert transaction at effective date of the original tx
         */
        public Builder atEffectiveDate(boolean atEffectiveDate) {
            Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
            this.atEffectiveDate = Optional.ofNullable(atEffectiveDate);
            return this;
        }

        /**
         * Revert transaction at effective date of the original tx
         */
        public Builder atEffectiveDate(Optional<? extends Boolean> atEffectiveDate) {
            Utils.checkNotNull(atEffectiveDate, "atEffectiveDate");
            this.atEffectiveDate = atEffectiveDate;
            return this;
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
                atEffectiveDate,
                force,
                id,
                ledger);
        }
    }
}

