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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class V3PaymentAdjustment {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends BigInteger> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("asset")
    private Optional<String> asset;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, String>> metadata;

    @JsonProperty("raw")
    private V3PaymentAdjustmentRaw raw;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("status")
    private V3PaymentStatusEnum status;

    @JsonCreator
    public V3PaymentAdjustment(
            @JsonProperty("amount") Optional<? extends BigInteger> amount,
            @JsonProperty("asset") Optional<String> asset,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, String>> metadata,
            @JsonProperty("raw") V3PaymentAdjustmentRaw raw,
            @JsonProperty("reference") String reference,
            @JsonProperty("status") V3PaymentStatusEnum status) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(status, "status");
        this.amount = amount;
        this.asset = asset;
        this.createdAt = createdAt;
        this.id = id;
        this.metadata = metadata;
        this.raw = raw;
        this.reference = reference;
        this.status = status;
    }
    
    public V3PaymentAdjustment(
            OffsetDateTime createdAt,
            String id,
            V3PaymentAdjustmentRaw raw,
            String reference,
            V3PaymentStatusEnum status) {
        this(Optional.empty(), Optional.empty(), createdAt, id, JsonNullable.undefined(), raw, reference, status);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigInteger> amount() {
        return (Optional<BigInteger>) amount;
    }

    @JsonIgnore
    public Optional<String> asset() {
        return asset;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> metadata() {
        return (JsonNullable<Map<String, String>>) metadata;
    }

    @JsonIgnore
    public V3PaymentAdjustmentRaw raw() {
        return raw;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    @JsonIgnore
    public V3PaymentStatusEnum status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3PaymentAdjustment withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public V3PaymentAdjustment withAmount(long amount) {
        this.amount = Optional.of(BigInteger.valueOf(amount));
        return this;
    }

    public V3PaymentAdjustment withAmount(Optional<? extends BigInteger> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public V3PaymentAdjustment withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = Optional.ofNullable(asset);
        return this;
    }

    public V3PaymentAdjustment withAsset(Optional<String> asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public V3PaymentAdjustment withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public V3PaymentAdjustment withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V3PaymentAdjustment withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public V3PaymentAdjustment withMetadata(JsonNullable<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V3PaymentAdjustment withRaw(V3PaymentAdjustmentRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public V3PaymentAdjustment withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public V3PaymentAdjustment withStatus(V3PaymentStatusEnum status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        V3PaymentAdjustment other = (V3PaymentAdjustment) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.asset, other.asset) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            asset,
            createdAt,
            id,
            metadata,
            raw,
            reference,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3PaymentAdjustment.class,
                "amount", amount,
                "asset", asset,
                "createdAt", createdAt,
                "id", id,
                "metadata", metadata,
                "raw", raw,
                "reference", reference,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<? extends BigInteger> amount = Optional.empty();
 
        private Optional<String> asset = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private JsonNullable<? extends Map<String, String>> metadata = JsonNullable.undefined();
 
        private V3PaymentAdjustmentRaw raw;
 
        private String reference;
 
        private V3PaymentStatusEnum status;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(long amount) {
            this.amount = Optional.of(BigInteger.valueOf(amount));
            return this;
        }

        public Builder amount(Optional<? extends BigInteger> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = Optional.ofNullable(asset);
            return this;
        }

        public Builder asset(Optional<String> asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder raw(V3PaymentAdjustmentRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder status(V3PaymentStatusEnum status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public V3PaymentAdjustment build() {
            return new V3PaymentAdjustment(
                amount,
                asset,
                createdAt,
                id,
                metadata,
                raw,
                reference,
                status);
        }
    }
}
