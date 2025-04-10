/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class CreditWalletRequest {

    @JsonProperty("amount")
    private Monetary amount;

    /**
     * The balance to credit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<String> balance;

    /**
     * Metadata associated with the wallet.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, String>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sources")
    private JsonNullable<? extends List<Subject>> sources;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<OffsetDateTime> timestamp;

    @JsonCreator
    public CreditWalletRequest(
            @JsonProperty("amount") Monetary amount,
            @JsonProperty("balance") Optional<String> balance,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, String>> metadata,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("sources") JsonNullable<? extends List<Subject>> sources,
            @JsonProperty("timestamp") Optional<OffsetDateTime> timestamp) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(sources, "sources");
        Utils.checkNotNull(timestamp, "timestamp");
        this.amount = amount;
        this.balance = balance;
        this.metadata = metadata;
        this.reference = reference;
        this.sources = sources;
        this.timestamp = timestamp;
    }
    
    public CreditWalletRequest(
            Monetary amount) {
        this(amount, Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    @JsonIgnore
    public Monetary amount() {
        return amount;
    }

    /**
     * The balance to credit
     */
    @JsonIgnore
    public Optional<String> balance() {
        return balance;
    }

    /**
     * Metadata associated with the wallet.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> metadata() {
        return (JsonNullable<Map<String, String>>) metadata;
    }

    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<Subject>> sources() {
        return (JsonNullable<List<Subject>>) sources;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public CreditWalletRequest withAmount(Monetary amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The balance to credit
     */
    public CreditWalletRequest withBalance(String balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    /**
     * The balance to credit
     */
    public CreditWalletRequest withBalance(Optional<String> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    /**
     * Metadata associated with the wallet.
     */
    public CreditWalletRequest withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    /**
     * Metadata associated with the wallet.
     */
    public CreditWalletRequest withMetadata(JsonNullable<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public CreditWalletRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public CreditWalletRequest withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public CreditWalletRequest withSources(List<Subject> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = JsonNullable.of(sources);
        return this;
    }

    public CreditWalletRequest withSources(JsonNullable<? extends List<Subject>> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = sources;
        return this;
    }

    public CreditWalletRequest withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public CreditWalletRequest withTimestamp(Optional<OffsetDateTime> timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
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
        CreditWalletRequest other = (CreditWalletRequest) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.sources, other.sources) &&
            Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            balance,
            metadata,
            reference,
            sources,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreditWalletRequest.class,
                "amount", amount,
                "balance", balance,
                "metadata", metadata,
                "reference", reference,
                "sources", sources,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private Monetary amount;
 
        private Optional<String> balance = Optional.empty();
 
        private JsonNullable<? extends Map<String, String>> metadata = JsonNullable.undefined();
 
        private Optional<String> reference = Optional.empty();
 
        private JsonNullable<? extends List<Subject>> sources = JsonNullable.undefined();
 
        private Optional<OffsetDateTime> timestamp = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(Monetary amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * The balance to credit
         */
        public Builder balance(String balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        /**
         * The balance to credit
         */
        public Builder balance(Optional<String> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        /**
         * Metadata associated with the wallet.
         */
        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        /**
         * Metadata associated with the wallet.
         */
        public Builder metadata(JsonNullable<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder sources(List<Subject> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = JsonNullable.of(sources);
            return this;
        }

        public Builder sources(JsonNullable<? extends List<Subject>> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = sources;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        public Builder timestamp(Optional<OffsetDateTime> timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public CreditWalletRequest build() {
            return new CreditWalletRequest(
                amount,
                balance,
                metadata,
                reference,
                sources,
                timestamp);
        }
    }
}
