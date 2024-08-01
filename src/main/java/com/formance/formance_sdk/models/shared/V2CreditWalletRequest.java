/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class V2CreditWalletRequest {

    @JsonProperty("amount")
    private V2Monetary amount;

    /**
     * The balance to credit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends String> balance;

    /**
     * Metadata associated with the wallet.
     */
    @JsonProperty("metadata")
    private java.util.Map<String, String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonProperty("sources")
    private java.util.List<V2Subject> sources;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<? extends OffsetDateTime> timestamp;

    @JsonCreator
    public V2CreditWalletRequest(
            @JsonProperty("amount") V2Monetary amount,
            @JsonProperty("balance") Optional<? extends String> balance,
            @JsonProperty("metadata") java.util.Map<String, String> metadata,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("sources") java.util.List<V2Subject> sources,
            @JsonProperty("timestamp") Optional<? extends OffsetDateTime> timestamp) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(balance, "balance");
        metadata = Utils.emptyMapIfNull(metadata);
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
    
    public V2CreditWalletRequest(
            V2Monetary amount,
            java.util.Map<String, String> metadata,
            java.util.List<V2Subject> sources) {
        this(amount, Optional.empty(), metadata, Optional.empty(), sources, Optional.empty());
    }

    @JsonIgnore
    public V2Monetary amount() {
        return amount;
    }

    /**
     * The balance to credit
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> balance() {
        return (Optional<String>) balance;
    }

    /**
     * Metadata associated with the wallet.
     */
    @JsonIgnore
    public java.util.Map<String, String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> reference() {
        return (Optional<String>) reference;
    }

    @JsonIgnore
    public java.util.List<V2Subject> sources() {
        return sources;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> timestamp() {
        return (Optional<OffsetDateTime>) timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CreditWalletRequest withAmount(V2Monetary amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The balance to credit
     */
    public V2CreditWalletRequest withBalance(String balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    /**
     * The balance to credit
     */
    public V2CreditWalletRequest withBalance(Optional<? extends String> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    /**
     * Metadata associated with the wallet.
     */
    public V2CreditWalletRequest withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2CreditWalletRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public V2CreditWalletRequest withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public V2CreditWalletRequest withSources(java.util.List<V2Subject> sources) {
        Utils.checkNotNull(sources, "sources");
        this.sources = sources;
        return this;
    }

    public V2CreditWalletRequest withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public V2CreditWalletRequest withTimestamp(Optional<? extends OffsetDateTime> timestamp) {
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
        V2CreditWalletRequest other = (V2CreditWalletRequest) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.balance, other.balance) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.sources, other.sources) &&
            java.util.Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            balance,
            metadata,
            reference,
            sources,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreditWalletRequest.class,
                "amount", amount,
                "balance", balance,
                "metadata", metadata,
                "reference", reference,
                "sources", sources,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private V2Monetary amount;
 
        private Optional<? extends String> balance = Optional.empty();
 
        private java.util.Map<String, String> metadata;
 
        private Optional<? extends String> reference = Optional.empty();
 
        private java.util.List<V2Subject> sources;
 
        private Optional<? extends OffsetDateTime> timestamp = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(V2Monetary amount) {
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
        public Builder balance(Optional<? extends String> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        /**
         * Metadata associated with the wallet.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder sources(java.util.List<V2Subject> sources) {
            Utils.checkNotNull(sources, "sources");
            this.sources = sources;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        public Builder timestamp(Optional<? extends OffsetDateTime> timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public V2CreditWalletRequest build() {
            return new V2CreditWalletRequest(
                amount,
                balance,
                metadata,
                reference,
                sources,
                timestamp);
        }
    }
}

