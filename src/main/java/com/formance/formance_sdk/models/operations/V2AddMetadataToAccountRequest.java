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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2AddMetadataToAccountRequest {

    /**
     * Use an idempotency key
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    private Optional<String> idempotencyKey;

    /**
     * metadata
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Map<String, String> requestBody;

    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=address")
    private String address;

    /**
     * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dryRun")
    private Optional<Boolean> dryRun;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public V2AddMetadataToAccountRequest(
            Optional<String> idempotencyKey,
            Map<String, String> requestBody,
            String address,
            Optional<Boolean> dryRun,
            String ledger) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        requestBody = Utils.emptyMapIfNull(requestBody);
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(dryRun, "dryRun");
        Utils.checkNotNull(ledger, "ledger");
        this.idempotencyKey = idempotencyKey;
        this.requestBody = requestBody;
        this.address = address;
        this.dryRun = dryRun;
        this.ledger = ledger;
    }
    
    public V2AddMetadataToAccountRequest(
            Map<String, String> requestBody,
            String address,
            String ledger) {
        this(Optional.empty(), requestBody, address, Optional.empty(), ledger);
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
    @JsonIgnore
    public Map<String, String> requestBody() {
        return requestBody;
    }

    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    @JsonIgnore
    public String address() {
        return address;
    }

    /**
     * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @JsonIgnore
    public Optional<Boolean> dryRun() {
        return dryRun;
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
    public V2AddMetadataToAccountRequest withIdempotencyKey(String idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = Optional.ofNullable(idempotencyKey);
        return this;
    }

    /**
     * Use an idempotency key
     */
    public V2AddMetadataToAccountRequest withIdempotencyKey(Optional<String> idempotencyKey) {
        Utils.checkNotNull(idempotencyKey, "idempotencyKey");
        this.idempotencyKey = idempotencyKey;
        return this;
    }

    /**
     * metadata
     */
    public V2AddMetadataToAccountRequest withRequestBody(Map<String, String> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    public V2AddMetadataToAccountRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public V2AddMetadataToAccountRequest withDryRun(boolean dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = Optional.ofNullable(dryRun);
        return this;
    }

    /**
     * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public V2AddMetadataToAccountRequest withDryRun(Optional<Boolean> dryRun) {
        Utils.checkNotNull(dryRun, "dryRun");
        this.dryRun = dryRun;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2AddMetadataToAccountRequest withLedger(String ledger) {
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
        V2AddMetadataToAccountRequest other = (V2AddMetadataToAccountRequest) o;
        return 
            Objects.deepEquals(this.idempotencyKey, other.idempotencyKey) &&
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.dryRun, other.dryRun) &&
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            idempotencyKey,
            requestBody,
            address,
            dryRun,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2AddMetadataToAccountRequest.class,
                "idempotencyKey", idempotencyKey,
                "requestBody", requestBody,
                "address", address,
                "dryRun", dryRun,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<String> idempotencyKey = Optional.empty();
 
        private Map<String, String> requestBody;
 
        private String address;
 
        private Optional<Boolean> dryRun = Optional.empty();
 
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
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Exact address of the account. It must match the following regular expressions pattern:
         * ```
         * ^\w+(:\w+)*$
         * ```
         * 
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder dryRun(boolean dryRun) {
            Utils.checkNotNull(dryRun, "dryRun");
            this.dryRun = Optional.ofNullable(dryRun);
            return this;
        }

        /**
         * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder dryRun(Optional<Boolean> dryRun) {
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
        
        public V2AddMetadataToAccountRequest build() {
            return new V2AddMetadataToAccountRequest(
                idempotencyKey,
                requestBody,
                address,
                dryRun,
                ledger);
        }
    }
}

