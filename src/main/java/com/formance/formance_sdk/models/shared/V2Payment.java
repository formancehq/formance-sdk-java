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


public class V2Payment {

    @JsonProperty("adjustments")
    private java.util.List<V2PaymentAdjustment> adjustments;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("destinationAccountID")
    private String destinationAccountID;

    @JsonProperty("id")
    private String id;

    @JsonProperty("initialAmount")
    private BigInteger initialAmount;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("metadata")
    private Optional<? extends V2PaymentMetadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<? extends V2Connector> provider;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("raw")
    private Optional<? extends V2PaymentRaw> raw;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("scheme")
    private Scheme scheme;

    @JsonProperty("sourceAccountID")
    private String sourceAccountID;

    @JsonProperty("status")
    private V2PaymentStatus status;

    @JsonProperty("type")
    private V2PaymentType type;

    public V2Payment(
            @JsonProperty("adjustments") java.util.List<V2PaymentAdjustment> adjustments,
            @JsonProperty("asset") String asset,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("destinationAccountID") String destinationAccountID,
            @JsonProperty("id") String id,
            @JsonProperty("initialAmount") BigInteger initialAmount,
            @JsonProperty("metadata") Optional<? extends V2PaymentMetadata> metadata,
            @JsonProperty("provider") Optional<? extends V2Connector> provider,
            @JsonProperty("raw") Optional<? extends V2PaymentRaw> raw,
            @JsonProperty("reference") String reference,
            @JsonProperty("scheme") Scheme scheme,
            @JsonProperty("sourceAccountID") String sourceAccountID,
            @JsonProperty("status") V2PaymentStatus status,
            @JsonProperty("type") V2PaymentType type) {
        Utils.checkNotNull(adjustments, "adjustments");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(initialAmount, "initialAmount");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(scheme, "scheme");
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(type, "type");
        this.adjustments = adjustments;
        this.asset = asset;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.destinationAccountID = destinationAccountID;
        this.id = id;
        this.initialAmount = initialAmount;
        this.metadata = metadata;
        this.provider = provider;
        this.raw = raw;
        this.reference = reference;
        this.scheme = scheme;
        this.sourceAccountID = sourceAccountID;
        this.status = status;
        this.type = type;
    }

    public java.util.List<V2PaymentAdjustment> adjustments() {
        return adjustments;
    }

    public String asset() {
        return asset;
    }

    public String connectorID() {
        return connectorID;
    }

    public OffsetDateTime createdAt() {
        return createdAt;
    }

    public String destinationAccountID() {
        return destinationAccountID;
    }

    public String id() {
        return id;
    }

    public BigInteger initialAmount() {
        return initialAmount;
    }

    public Optional<? extends V2PaymentMetadata> metadata() {
        return metadata;
    }

    public Optional<? extends V2Connector> provider() {
        return provider;
    }

    public Optional<? extends V2PaymentRaw> raw() {
        return raw;
    }

    public String reference() {
        return reference;
    }

    public Scheme scheme() {
        return scheme;
    }

    public String sourceAccountID() {
        return sourceAccountID;
    }

    public V2PaymentStatus status() {
        return status;
    }

    public V2PaymentType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2Payment withAdjustments(java.util.List<V2PaymentAdjustment> adjustments) {
        Utils.checkNotNull(adjustments, "adjustments");
        this.adjustments = adjustments;
        return this;
    }

    public V2Payment withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public V2Payment withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public V2Payment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public V2Payment withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    public V2Payment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2Payment withInitialAmount(long initialAmount) {
        this.initialAmount = BigInteger.valueOf(initialAmount);
        return this;
    }

    public V2Payment withInitialAmount(BigInteger initialAmount) {
        Utils.checkNotNull(initialAmount, "initialAmount");
        this.initialAmount = initialAmount;
        return this;
    }

    public V2Payment withMetadata(V2PaymentMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public V2Payment withMetadata(Optional<? extends V2PaymentMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2Payment withProvider(V2Connector provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public V2Payment withProvider(Optional<? extends V2Connector> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public V2Payment withRaw(V2PaymentRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public V2Payment withRaw(Optional<? extends V2PaymentRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public V2Payment withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public V2Payment withScheme(Scheme scheme) {
        Utils.checkNotNull(scheme, "scheme");
        this.scheme = scheme;
        return this;
    }

    public V2Payment withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public V2Payment withStatus(V2PaymentStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public V2Payment withType(V2PaymentType type) {
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
        V2Payment other = (V2Payment) o;
        return 
            java.util.Objects.deepEquals(this.adjustments, other.adjustments) &&
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.destinationAccountID, other.destinationAccountID) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.initialAmount, other.initialAmount) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.provider, other.provider) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.scheme, other.scheme) &&
            java.util.Objects.deepEquals(this.sourceAccountID, other.sourceAccountID) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            adjustments,
            asset,
            connectorID,
            createdAt,
            destinationAccountID,
            id,
            initialAmount,
            metadata,
            provider,
            raw,
            reference,
            scheme,
            sourceAccountID,
            status,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Payment.class,
                "adjustments", adjustments,
                "asset", asset,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "destinationAccountID", destinationAccountID,
                "id", id,
                "initialAmount", initialAmount,
                "metadata", metadata,
                "provider", provider,
                "raw", raw,
                "reference", reference,
                "scheme", scheme,
                "sourceAccountID", sourceAccountID,
                "status", status,
                "type", type);
    }
    
    public final static class Builder {
 
        private java.util.List<V2PaymentAdjustment> adjustments;
 
        private String asset;
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private String destinationAccountID;
 
        private String id;
 
        private BigInteger initialAmount;
 
        private Optional<? extends V2PaymentMetadata> metadata = Optional.empty();
 
        private Optional<? extends V2Connector> provider = Optional.empty();
 
        private Optional<? extends V2PaymentRaw> raw = Optional.empty();
 
        private String reference;
 
        private Scheme scheme;
 
        private String sourceAccountID;
 
        private V2PaymentStatus status;
 
        private V2PaymentType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder adjustments(java.util.List<V2PaymentAdjustment> adjustments) {
            Utils.checkNotNull(adjustments, "adjustments");
            this.adjustments = adjustments;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
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

        public Builder destinationAccountID(String destinationAccountID) {
            Utils.checkNotNull(destinationAccountID, "destinationAccountID");
            this.destinationAccountID = destinationAccountID;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder initialAmount(long initialAmount) {
            this.initialAmount = BigInteger.valueOf(initialAmount);
            return this;
        }

        public Builder initialAmount(BigInteger initialAmount) {
            Utils.checkNotNull(initialAmount, "initialAmount");
            this.initialAmount = initialAmount;
            return this;
        }

        public Builder metadata(V2PaymentMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends V2PaymentMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder provider(V2Connector provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        public Builder provider(Optional<? extends V2Connector> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        public Builder raw(V2PaymentRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends V2PaymentRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder scheme(Scheme scheme) {
            Utils.checkNotNull(scheme, "scheme");
            this.scheme = scheme;
            return this;
        }

        public Builder sourceAccountID(String sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = sourceAccountID;
            return this;
        }

        public Builder status(V2PaymentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder type(V2PaymentType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public V2Payment build() {
            return new V2Payment(
                adjustments,
                asset,
                connectorID,
                createdAt,
                destinationAccountID,
                id,
                initialAmount,
                metadata,
                provider,
                raw,
                reference,
                scheme,
                sourceAccountID,
                status,
                type);
        }
    }
}

