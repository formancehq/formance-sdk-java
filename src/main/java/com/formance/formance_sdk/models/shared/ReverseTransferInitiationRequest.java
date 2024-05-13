/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ReverseTransferInitiationRequest {

    @JsonProperty("amount")
    private BigInteger amount;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("description")
    private String description;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("metadata")
    private Optional<? extends java.util.Map<String, String>> metadata;

    @JsonProperty("reference")
    private String reference;

    @JsonCreator
    public ReverseTransferInitiationRequest(
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("asset") String asset,
            @JsonProperty("description") String description,
            @JsonProperty("metadata") Optional<? extends java.util.Map<String, String>> metadata,
            @JsonProperty("reference") String reference) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(reference, "reference");
        this.amount = amount;
        this.asset = asset;
        this.description = description;
        this.metadata = metadata;
        this.reference = reference;
    }
    
    public ReverseTransferInitiationRequest(
            BigInteger amount,
            String asset,
            String description,
            String reference) {
        this(amount, asset, description, Optional.empty(), reference);
    }

    @JsonIgnore
    public BigInteger amount() {
        return amount;
    }

    @JsonIgnore
    public String asset() {
        return asset;
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, String>> metadata() {
        return (Optional<java.util.Map<String, String>>) metadata;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ReverseTransferInitiationRequest withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    public ReverseTransferInitiationRequest withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public ReverseTransferInitiationRequest withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public ReverseTransferInitiationRequest withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public ReverseTransferInitiationRequest withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public ReverseTransferInitiationRequest withMetadata(Optional<? extends java.util.Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public ReverseTransferInitiationRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
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
        ReverseTransferInitiationRequest other = (ReverseTransferInitiationRequest) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.reference, other.reference);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            asset,
            description,
            metadata,
            reference);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReverseTransferInitiationRequest.class,
                "amount", amount,
                "asset", asset,
                "description", description,
                "metadata", metadata,
                "reference", reference);
    }
    
    public final static class Builder {
 
        private BigInteger amount;
 
        private String asset;
 
        private String description;
 
        private Optional<? extends java.util.Map<String, String>> metadata = Optional.empty();
 
        private String reference;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(long amount) {
            this.amount = BigInteger.valueOf(amount);
            return this;
        }

        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
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

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }
        
        public ReverseTransferInitiationRequest build() {
            return new ReverseTransferInitiationRequest(
                amount,
                asset,
                description,
                metadata,
                reference);
        }
    }
}

