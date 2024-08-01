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

public class V2CreateTransactionRequest {

    /**
     * Use an idempotency key
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    private Optional<? extends String> idempotencyKey;

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction;

    /**
     * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dryRun")
    private Optional<? extends Boolean> dryRun;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public V2CreateTransactionRequest(
            Optional<? extends String> idempotencyKey,
            com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction,
            Optional<? extends Boolean> dryRun,
            String ledger) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(v2PostTransaction, "v2PostTransaction");
        Utils.checkNotNull(dryRun, "dryRun");
        Utils.checkNotNull(ledger, "ledger");
        this.idempotencyKey = idempotencyKey;
        this.v2PostTransaction = v2PostTransaction;
        this.dryRun = dryRun;
        this.ledger = ledger;
    }
    
    public V2CreateTransactionRequest(
            com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction,
            String ledger) {
        this(Optional.empty(), v2PostTransaction, Optional.empty(), ledger);
    }

    /**
     * Use an idempotency key
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> idempotencyKey() {
        return (Optional<String>) idempotencyKey;
    }

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    @JsonIgnore
    public com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction() {
        return v2PostTransaction;
    }

    /**
     * Set the dryRun mode. dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> dryRun() {
        return (Optional<Boolean>) dryRun;
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
    public V2CreateTransactionRequest withIdempotencyKey(Optional<? extends String> idempotencyKey) {
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
    public V2CreateTransactionRequest withV2PostTransaction(com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction) {
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
    public V2CreateTransactionRequest withDryRun(Optional<? extends Boolean> dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = dryRun;
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
            java.util.Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            java.util.Objects.deepEquals(this.v2PostTransaction, other.v2PostTransaction) &&
            java.util.Objects.deepEquals(this.dryRun, other.dryRun) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            idempotencyKey,
            v2PostTransaction,
            dryRun,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateTransactionRequest.class,
                "idempotencyKey", idempotencyKey,
                "v2PostTransaction", v2PostTransaction,
                "dryRun", dryRun,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> idempotencyKey = Optional.empty();
 
        private com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction;
 
        private Optional<? extends Boolean> dryRun = Optional.empty();
 
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
        public Builder idempotencyKey(Optional<? extends String> idempotencyKey) {
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
        public Builder v2PostTransaction(com.formance.formance_sdk.models.shared.V2PostTransaction v2PostTransaction) {
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
        public Builder dryRun(Optional<? extends Boolean> dryRun) {
            Utils.checkNotNull(dryRun, "dryRun");
            this.dryRun = dryRun;
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
                ledger);
        }
    }
}

