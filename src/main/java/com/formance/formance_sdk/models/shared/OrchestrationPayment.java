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
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OrchestrationPayment {

    @JsonProperty("adjustments")
    private List<OrchestrationPaymentAdjustment> adjustments;

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
    private Optional<? extends OrchestrationPaymentMetadata> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<? extends OrchestrationConnector> provider;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("raw")
    private Optional<? extends OrchestrationPaymentRaw> raw;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("scheme")
    private OrchestrationPaymentScheme scheme;

    @JsonProperty("sourceAccountID")
    private String sourceAccountID;

    @JsonProperty("status")
    private OrchestrationPaymentStatus status;

    @JsonProperty("type")
    private OrchestrationPaymentType type;

    @JsonCreator
    public OrchestrationPayment(
            @JsonProperty("adjustments") List<OrchestrationPaymentAdjustment> adjustments,
            @JsonProperty("asset") String asset,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("destinationAccountID") String destinationAccountID,
            @JsonProperty("id") String id,
            @JsonProperty("initialAmount") BigInteger initialAmount,
            @JsonProperty("metadata") Optional<? extends OrchestrationPaymentMetadata> metadata,
            @JsonProperty("provider") Optional<? extends OrchestrationConnector> provider,
            @JsonProperty("raw") Optional<? extends OrchestrationPaymentRaw> raw,
            @JsonProperty("reference") String reference,
            @JsonProperty("scheme") OrchestrationPaymentScheme scheme,
            @JsonProperty("sourceAccountID") String sourceAccountID,
            @JsonProperty("status") OrchestrationPaymentStatus status,
            @JsonProperty("type") OrchestrationPaymentType type) {
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
    
    public OrchestrationPayment(
            List<OrchestrationPaymentAdjustment> adjustments,
            String asset,
            String connectorID,
            OffsetDateTime createdAt,
            String destinationAccountID,
            String id,
            BigInteger initialAmount,
            String reference,
            OrchestrationPaymentScheme scheme,
            String sourceAccountID,
            OrchestrationPaymentStatus status,
            OrchestrationPaymentType type) {
        this(adjustments, asset, connectorID, createdAt, destinationAccountID, id, initialAmount, Optional.empty(), Optional.empty(), Optional.empty(), reference, scheme, sourceAccountID, status, type);
    }

    @JsonIgnore
    public List<OrchestrationPaymentAdjustment> adjustments() {
        return adjustments;
    }

    @JsonIgnore
    public String asset() {
        return asset;
    }

    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String destinationAccountID() {
        return destinationAccountID;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public BigInteger initialAmount() {
        return initialAmount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrchestrationPaymentMetadata> metadata() {
        return (Optional<OrchestrationPaymentMetadata>) metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrchestrationConnector> provider() {
        return (Optional<OrchestrationConnector>) provider;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrchestrationPaymentRaw> raw() {
        return (Optional<OrchestrationPaymentRaw>) raw;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    @JsonIgnore
    public OrchestrationPaymentScheme scheme() {
        return scheme;
    }

    @JsonIgnore
    public String sourceAccountID() {
        return sourceAccountID;
    }

    @JsonIgnore
    public OrchestrationPaymentStatus status() {
        return status;
    }

    @JsonIgnore
    public OrchestrationPaymentType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public OrchestrationPayment withAdjustments(List<OrchestrationPaymentAdjustment> adjustments) {
        Utils.checkNotNull(adjustments, "adjustments");
        this.adjustments = adjustments;
        return this;
    }

    public OrchestrationPayment withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public OrchestrationPayment withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public OrchestrationPayment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public OrchestrationPayment withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    public OrchestrationPayment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public OrchestrationPayment withInitialAmount(long initialAmount) {
        this.initialAmount = BigInteger.valueOf(initialAmount);
        return this;
    }

    public OrchestrationPayment withInitialAmount(BigInteger initialAmount) {
        Utils.checkNotNull(initialAmount, "initialAmount");
        this.initialAmount = initialAmount;
        return this;
    }

    public OrchestrationPayment withMetadata(OrchestrationPaymentMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public OrchestrationPayment withMetadata(Optional<? extends OrchestrationPaymentMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public OrchestrationPayment withProvider(OrchestrationConnector provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public OrchestrationPayment withProvider(Optional<? extends OrchestrationConnector> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public OrchestrationPayment withRaw(OrchestrationPaymentRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public OrchestrationPayment withRaw(Optional<? extends OrchestrationPaymentRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public OrchestrationPayment withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public OrchestrationPayment withScheme(OrchestrationPaymentScheme scheme) {
        Utils.checkNotNull(scheme, "scheme");
        this.scheme = scheme;
        return this;
    }

    public OrchestrationPayment withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public OrchestrationPayment withStatus(OrchestrationPaymentStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public OrchestrationPayment withType(OrchestrationPaymentType type) {
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
        OrchestrationPayment other = (OrchestrationPayment) o;
        return 
            Objects.deepEquals(this.adjustments, other.adjustments) &&
            Objects.deepEquals(this.asset, other.asset) &&
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.destinationAccountID, other.destinationAccountID) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.initialAmount, other.initialAmount) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.provider, other.provider) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.scheme, other.scheme) &&
            Objects.deepEquals(this.sourceAccountID, other.sourceAccountID) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(OrchestrationPayment.class,
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
 
        private List<OrchestrationPaymentAdjustment> adjustments;
 
        private String asset;
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private String destinationAccountID;
 
        private String id;
 
        private BigInteger initialAmount;
 
        private Optional<? extends OrchestrationPaymentMetadata> metadata = Optional.empty();
 
        private Optional<? extends OrchestrationConnector> provider = Optional.empty();
 
        private Optional<? extends OrchestrationPaymentRaw> raw = Optional.empty();
 
        private String reference;
 
        private OrchestrationPaymentScheme scheme;
 
        private String sourceAccountID;
 
        private OrchestrationPaymentStatus status;
 
        private OrchestrationPaymentType type;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder adjustments(List<OrchestrationPaymentAdjustment> adjustments) {
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

        public Builder metadata(OrchestrationPaymentMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends OrchestrationPaymentMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder provider(OrchestrationConnector provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        public Builder provider(Optional<? extends OrchestrationConnector> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        public Builder raw(OrchestrationPaymentRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends OrchestrationPaymentRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder scheme(OrchestrationPaymentScheme scheme) {
            Utils.checkNotNull(scheme, "scheme");
            this.scheme = scheme;
            return this;
        }

        public Builder sourceAccountID(String sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = sourceAccountID;
            return this;
        }

        public Builder status(OrchestrationPaymentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder type(OrchestrationPaymentType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public OrchestrationPayment build() {
            return new OrchestrationPayment(
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
