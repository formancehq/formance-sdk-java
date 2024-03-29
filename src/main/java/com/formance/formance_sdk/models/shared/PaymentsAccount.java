/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class PaymentsAccount {

    @JsonProperty("accountName")
    private String accountName;

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("defaultAsset")
    private String defaultAsset;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @JsonProperty("defaultCurrency")
    @Deprecated
    private String defaultCurrency;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("metadata")
    private Optional<? extends java.util.Map<String, String>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pools")
    private Optional<? extends java.util.List<String>> pools;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<? extends String> provider;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("raw")
    private Optional<? extends PaymentsAccountRaw> raw;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("type")
    private String type;

    public PaymentsAccount(
            @JsonProperty("accountName") String accountName,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("defaultAsset") String defaultAsset,
            @JsonProperty("defaultCurrency") String defaultCurrency,
            @JsonProperty("id") String id,
            @JsonProperty("metadata") Optional<? extends java.util.Map<String, String>> metadata,
            @JsonProperty("pools") Optional<? extends java.util.List<String>> pools,
            @JsonProperty("provider") Optional<? extends String> provider,
            @JsonProperty("raw") Optional<? extends PaymentsAccountRaw> raw,
            @JsonProperty("reference") String reference,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(accountName, "accountName");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(defaultAsset, "defaultAsset");
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(pools, "pools");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(type, "type");
        this.accountName = accountName;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.defaultAsset = defaultAsset;
        this.defaultCurrency = defaultCurrency;
        this.id = id;
        this.metadata = metadata;
        this.pools = pools;
        this.provider = provider;
        this.raw = raw;
        this.reference = reference;
        this.type = type;
    }

    public String accountName() {
        return accountName;
    }

    public String connectorID() {
        return connectorID;
    }

    public OffsetDateTime createdAt() {
        return createdAt;
    }

    public String defaultAsset() {
        return defaultAsset;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public String defaultCurrency() {
        return defaultCurrency;
    }

    public String id() {
        return id;
    }

    public Optional<? extends java.util.Map<String, String>> metadata() {
        return metadata;
    }

    public Optional<? extends java.util.List<String>> pools() {
        return pools;
    }

    public Optional<? extends String> provider() {
        return provider;
    }

    public Optional<? extends PaymentsAccountRaw> raw() {
        return raw;
    }

    public String reference() {
        return reference;
    }

    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaymentsAccount withAccountName(String accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
        return this;
    }

    public PaymentsAccount withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public PaymentsAccount withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public PaymentsAccount withDefaultAsset(String defaultAsset) {
        Utils.checkNotNull(defaultAsset, "defaultAsset");
        this.defaultAsset = defaultAsset;
        return this;
    }

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public PaymentsAccount withDefaultCurrency(String defaultCurrency) {
        Utils.checkNotNull(defaultCurrency, "defaultCurrency");
        this.defaultCurrency = defaultCurrency;
        return this;
    }

    public PaymentsAccount withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PaymentsAccount withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public PaymentsAccount withMetadata(Optional<? extends java.util.Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public PaymentsAccount withPools(java.util.List<String> pools) {
        Utils.checkNotNull(pools, "pools");
        this.pools = Optional.ofNullable(pools);
        return this;
    }

    public PaymentsAccount withPools(Optional<? extends java.util.List<String>> pools) {
        Utils.checkNotNull(pools, "pools");
        this.pools = pools;
        return this;
    }

    public PaymentsAccount withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public PaymentsAccount withProvider(Optional<? extends String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public PaymentsAccount withRaw(PaymentsAccountRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public PaymentsAccount withRaw(Optional<? extends PaymentsAccountRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public PaymentsAccount withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public PaymentsAccount withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        PaymentsAccount other = (PaymentsAccount) o;
        return 
            java.util.Objects.deepEquals(this.accountName, other.accountName) &&
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.defaultAsset, other.defaultAsset) &&
            java.util.Objects.deepEquals(this.defaultCurrency, other.defaultCurrency) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.pools, other.pools) &&
            java.util.Objects.deepEquals(this.provider, other.provider) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountName,
            connectorID,
            createdAt,
            defaultAsset,
            defaultCurrency,
            id,
            metadata,
            pools,
            provider,
            raw,
            reference,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentsAccount.class,
                "accountName", accountName,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "defaultAsset", defaultAsset,
                "defaultCurrency", defaultCurrency,
                "id", id,
                "metadata", metadata,
                "pools", pools,
                "provider", provider,
                "raw", raw,
                "reference", reference,
                "type", type);
    }
    
    public final static class Builder {
 
        private String accountName;
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private String defaultAsset;
 
        @Deprecated
        private String defaultCurrency;
 
        private String id;
 
        private Optional<? extends java.util.Map<String, String>> metadata = Optional.empty();
 
        private Optional<? extends java.util.List<String>> pools = Optional.empty();
 
        private Optional<? extends String> provider = Optional.empty();
 
        private Optional<? extends PaymentsAccountRaw> raw = Optional.empty();
 
        private String reference;
 
        private String type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountName(String accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = accountName;
            return this;
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder defaultAsset(String defaultAsset) {
            Utils.checkNotNull(defaultAsset, "defaultAsset");
            this.defaultAsset = defaultAsset;
            return this;
        }

        /**
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder defaultCurrency(String defaultCurrency) {
            Utils.checkNotNull(defaultCurrency, "defaultCurrency");
            this.defaultCurrency = defaultCurrency;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder pools(java.util.List<String> pools) {
            Utils.checkNotNull(pools, "pools");
            this.pools = Optional.ofNullable(pools);
            return this;
        }

        public Builder pools(Optional<? extends java.util.List<String>> pools) {
            Utils.checkNotNull(pools, "pools");
            this.pools = pools;
            return this;
        }

        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        public Builder provider(Optional<? extends String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        public Builder raw(PaymentsAccountRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends PaymentsAccountRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public PaymentsAccount build() {
            return new PaymentsAccount(
                accountName,
                connectorID,
                createdAt,
                defaultAsset,
                defaultCurrency,
                id,
                metadata,
                pools,
                provider,
                raw,
                reference,
                type);
        }
    }
}

