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
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2AddMetadataOnTransactionRequest {

    /**
     * Use an idempotency key
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    private Optional<String> idempotencyKey;

    /**
     * metadata
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Map<String, String>> requestBody;

    /**
     * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dryRun")
    private Optional<Boolean> dryRun;

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
    public V2AddMetadataOnTransactionRequest(
            Optional<String> idempotencyKey,
            Optional<? extends Map<String, String>> requestBody,
            Optional<Boolean> dryRun,
            BigInteger id,
            String ledger) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(dryRun, "dryRun");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        this.idempotencyKey = idempotencyKey;
        this.requestBody = requestBody;
        this.dryRun = dryRun;
        this.id = id;
        this.ledger = ledger;
    }
    
    public V2AddMetadataOnTransactionRequest(
            BigInteger id,
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), id, ledger);
    }

    /**
     * Use an idempotency key
     */
    @JsonIgnore
    public Optional<String> idempotencyKey() {
        return idempotencyKey;
    }

    /**
     * metadata
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> requestBody() {
        return (Optional<Map<String, String>>) requestBody;
    }

    /**
     * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @JsonIgnore
    public Optional<Boolean> dryRun() {
        return dryRun;
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
     * Use an idempotency key
     */
    public V2AddMetadataOnTransactionRequest withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = Optional.ofNullable(idempotencyKey);
        return this;
    }

    /**
     * Use an idempotency key
     */
    public V2AddMetadataOnTransactionRequest withIdempotencyKey(Optional<String> idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    /**
     * metadata
     */
    public V2AddMetadataOnTransactionRequest withRequestBody(Map<String, String> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    /**
     * metadata
     */
    public V2AddMetadataOnTransactionRequest withRequestBody(Optional<? extends Map<String, String>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public V2AddMetadataOnTransactionRequest withDryRun(boolean dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = Optional.ofNullable(dryRun);
        return this;
    }

    /**
     * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public V2AddMetadataOnTransactionRequest withDryRun(Optional<Boolean> dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = dryRun;
        return this;
    }

        /**
         * Transaction ID.
         */
    public V2AddMetadataOnTransactionRequest withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    /**
     * Transaction ID.
     */
    public V2AddMetadataOnTransactionRequest withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2AddMetadataOnTransactionRequest withLedger(String ledger) {
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
        V2AddMetadataOnTransactionRequest other = (V2AddMetadataOnTransactionRequest) o;
        return 
            Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.dryRun, other.dryRun) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            idempotencyKey,
            requestBody,
            dryRun,
            id,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2AddMetadataOnTransactionRequest.class,
                "idempotencyKey", idempotencyKey,
                "requestBody", requestBody,
                "dryRun", dryRun,
                "id", id,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<String> idempotencyKey = Optional.empty();
 
        private Optional<? extends Map<String, String>> requestBody = Optional.empty();
 
        private Optional<Boolean> dryRun = Optional.empty();
 
        private BigInteger id;
 
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
         * metadata
         */
        public Builder requestBody(Map<String, String> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        /**
         * metadata
         */
        public Builder requestBody(Optional<? extends Map<String, String>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder dryRun(boolean dryRun) {
            Utils.checkNotNull(dryRun, "dryRun");
            this.dryRun = Optional.ofNullable(dryRun);
            return this;
        }

        /**
         * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder dryRun(Optional<Boolean> dryRun) {
            Utils.checkNotNull(dryRun, "dryRun");
            this.dryRun = dryRun;
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
        
        public V2AddMetadataOnTransactionRequest build() {
            return new V2AddMetadataOnTransactionRequest(
                idempotencyKey,
                requestBody,
                dryRun,
                id,
                ledger);
        }
    }
}

