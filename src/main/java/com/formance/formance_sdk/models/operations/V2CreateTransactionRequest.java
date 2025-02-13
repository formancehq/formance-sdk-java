/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.V2PostTransaction;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class V2CreateTransactionRequest {

    /**
     * Use an idempotency key
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    private Optional<String> idempotencyKey;

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private V2PostTransaction v2PostTransaction;

    /**
     * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dryRun")
    private Optional<Boolean> dryRun;

    /**
     * Disable balance checks when passing postings
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=force")
    private Optional<Boolean> force;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public V2CreateTransactionRequest(
            Optional<String> idempotencyKey,
            V2PostTransaction v2PostTransaction,
            Optional<Boolean> dryRun,
            Optional<Boolean> force,
            String ledger) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(v2PostTransaction, "v2PostTransaction");
        Utils.checkNotNull(dryRun, "dryRun");
        Utils.checkNotNull(force, "force");
        Utils.checkNotNull(ledger, "ledger");
        this.idempotencyKey = idempotencyKey;
        this.v2PostTransaction = v2PostTransaction;
        this.dryRun = dryRun;
        this.force = force;
        this.ledger = ledger;
    }
    
    public V2CreateTransactionRequest(
            V2PostTransaction v2PostTransaction,
            String ledger) {
        this(Optional.empty(), v2PostTransaction, Optional.empty(), Optional.empty(), ledger);
    }

    /**
     * Use an idempotency key
     */
    @JsonIgnore
    public Optional<String> idempotencyKey() {
        return idempotencyKey;
    }

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    @JsonIgnore
    public V2PostTransaction v2PostTransaction() {
        return v2PostTransaction;
    }

    /**
     * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @JsonIgnore
    public Optional<Boolean> dryRun() {
        return dryRun;
    }

    /**
     * Disable balance checks when passing postings
     */
    @JsonIgnore
    public Optional<Boolean> force() {
        return force;
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
     * Use an idempotency key
     */
    public V2CreateTransactionRequest withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = Optional.ofNullable(idempotencyKey);
        return this;
    }

    /**
     * Use an idempotency key
     */
    public V2CreateTransactionRequest withIdempotencyKey(Optional<String> idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    public V2CreateTransactionRequest withV2PostTransaction(V2PostTransaction v2PostTransaction) {
        Utils.checkNotNull(v2PostTransaction, "v2PostTransaction");
        this.v2PostTransaction = v2PostTransaction;
        return this;
    }

    /**
     * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public V2CreateTransactionRequest withDryRun(boolean dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = Optional.ofNullable(dryRun);
        return this;
    }

    /**
     * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public V2CreateTransactionRequest withDryRun(Optional<Boolean> dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = dryRun;
        return this;
    }

    /**
     * Disable balance checks when passing postings
     */
    public V2CreateTransactionRequest withForce(boolean force) {
        Utils.checkNotNull(force, "force");
        this.force = Optional.ofNullable(force);
        return this;
    }

    /**
     * Disable balance checks when passing postings
     */
    public V2CreateTransactionRequest withForce(Optional<Boolean> force) {
        Utils.checkNotNull(force, "force");
        this.force = force;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2CreateTransactionRequest withLedger(String ledger) {
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
        V2CreateTransactionRequest other = (V2CreateTransactionRequest) o;
        return 
            Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            Objects.deepEquals(this.v2PostTransaction, other.v2PostTransaction) &&
            Objects.deepEquals(this.dryRun, other.dryRun) &&
            Objects.deepEquals(this.force, other.force) &&
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            idempotencyKey,
            v2PostTransaction,
            dryRun,
            force,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateTransactionRequest.class,
                "idempotencyKey", idempotencyKey,
                "v2PostTransaction", v2PostTransaction,
                "dryRun", dryRun,
                "force", force,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<String> idempotencyKey = Optional.empty();
 
        private V2PostTransaction v2PostTransaction;
 
        private Optional<Boolean> dryRun = Optional.empty();
 
        private Optional<Boolean> force = Optional.empty();
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Use an idempotency key
         */
        public Builder idempotencyKey(String idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = Optional.ofNullable(idempotencyKey);
            return this;
        }

        /**
         * Use an idempotency key
         */
        public Builder idempotencyKey(Optional<String> idempotencyKey) {
            Utils.checkNotNull(idempotencyKey, "idempotencyKey");
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * The request body must contain at least one of the following objects:
         *   - `postings`: suitable for simple transactions
         *   - `script`: enabling more complex transactions with Numscript
         * 
         */
        public Builder v2PostTransaction(V2PostTransaction v2PostTransaction) {
            Utils.checkNotNull(v2PostTransaction, "v2PostTransaction");
            this.v2PostTransaction = v2PostTransaction;
            return this;
        }

        /**
         * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder dryRun(boolean dryRun) {
            Utils.checkNotNull(dryRun, "dryRun");
            this.dryRun = Optional.ofNullable(dryRun);
            return this;
        }

        /**
         * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder dryRun(Optional<Boolean> dryRun) {
            Utils.checkNotNull(dryRun, "dryRun");
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Disable balance checks when passing postings
         */
        public Builder force(boolean force) {
            Utils.checkNotNull(force, "force");
            this.force = Optional.ofNullable(force);
            return this;
        }

        /**
         * Disable balance checks when passing postings
         */
        public Builder force(Optional<Boolean> force) {
            Utils.checkNotNull(force, "force");
            this.force = force;
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
        
        public V2CreateTransactionRequest build() {
            return new V2CreateTransactionRequest(
                idempotencyKey,
                v2PostTransaction,
                dryRun,
                force,
                ledger);
        }
    }
}

