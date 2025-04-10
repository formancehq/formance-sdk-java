/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;

public class RevertTransactionRequest {

    /**
     * Allow to disable balances checks
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=disableChecks")
    private Optional<Boolean> disableChecks;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=txid")
    private BigInteger txid;

    @JsonCreator
    public RevertTransactionRequest(
            Optional<Boolean> disableChecks,
            String ledger,
            BigInteger txid) {
        Utils.checkNotNull(disableChecks, "disableChecks");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(txid, "txid");
        this.disableChecks = disableChecks;
        this.ledger = ledger;
        this.txid = txid;
    }
    
    public RevertTransactionRequest(
            String ledger,
            BigInteger txid) {
        this(Optional.empty(), ledger, txid);
    }

    /**
     * Allow to disable balances checks
     */
    @JsonIgnore
    public Optional<Boolean> disableChecks() {
        return disableChecks;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Transaction ID.
     */
    @JsonIgnore
    public BigInteger txid() {
        return txid;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Allow to disable balances checks
     */
    public RevertTransactionRequest withDisableChecks(boolean disableChecks) {
        Utils.checkNotNull(disableChecks, "disableChecks");
        this.disableChecks = Optional.ofNullable(disableChecks);
        return this;
    }

    /**
     * Allow to disable balances checks
     */
    public RevertTransactionRequest withDisableChecks(Optional<Boolean> disableChecks) {
        Utils.checkNotNull(disableChecks, "disableChecks");
        this.disableChecks = disableChecks;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public RevertTransactionRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

        /**
         * Transaction ID.
         */
    public RevertTransactionRequest withTxid(long txid) {
        this.txid = BigInteger.valueOf(txid);
        return this;
    }

    /**
     * Transaction ID.
     */
    public RevertTransactionRequest withTxid(BigInteger txid) {
        Utils.checkNotNull(txid, "txid");
        this.txid = txid;
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
        RevertTransactionRequest other = (RevertTransactionRequest) o;
        return 
            Objects.deepEquals(this.disableChecks, other.disableChecks) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.txid, other.txid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            disableChecks,
            ledger,
            txid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RevertTransactionRequest.class,
                "disableChecks", disableChecks,
                "ledger", ledger,
                "txid", txid);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> disableChecks = Optional.empty();
 
        private String ledger;
 
        private BigInteger txid;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Allow to disable balances checks
         */
        public Builder disableChecks(boolean disableChecks) {
            Utils.checkNotNull(disableChecks, "disableChecks");
            this.disableChecks = Optional.ofNullable(disableChecks);
            return this;
        }

        /**
         * Allow to disable balances checks
         */
        public Builder disableChecks(Optional<Boolean> disableChecks) {
            Utils.checkNotNull(disableChecks, "disableChecks");
            this.disableChecks = disableChecks;
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

        /**
         * Transaction ID.
         */
        public Builder txid(long txid) {
            this.txid = BigInteger.valueOf(txid);
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder txid(BigInteger txid) {
            Utils.checkNotNull(txid, "txid");
            this.txid = txid;
            return this;
        }
        
        public RevertTransactionRequest build() {
            return new RevertTransactionRequest(
                disableChecks,
                ledger,
                txid);
        }
    }
}
