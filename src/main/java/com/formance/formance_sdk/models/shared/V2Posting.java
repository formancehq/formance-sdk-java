/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class V2Posting {

    @JsonProperty("amount")
    private BigInteger amount;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("source")
    private String source;

    @JsonCreator
    public V2Posting(
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("asset") String asset,
            @JsonProperty("destination") String destination,
            @JsonProperty("source") String source) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(source, "source");
        this.amount = amount;
        this.asset = asset;
        this.destination = destination;
        this.source = source;
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
    public String destination() {
        return destination;
    }

    @JsonIgnore
    public String source() {
        return source;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2Posting withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    public V2Posting withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public V2Posting withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public V2Posting withDestination(String destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    public V2Posting withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
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
        V2Posting other = (V2Posting) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.asset, other.asset) &&
            java.util.Objects.deepEquals(this.destination, other.destination) &&
            java.util.Objects.deepEquals(this.source, other.source);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            asset,
            destination,
            source);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Posting.class,
                "amount", amount,
                "asset", asset,
                "destination", destination,
                "source", source);
    }
    
    public final static class Builder {
 
        private BigInteger amount;
 
        private String asset;
 
        private String destination;
 
        private String source;  
        
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

        public Builder destination(String destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }
        
        public V2Posting build() {
            return new V2Posting(
                amount,
                asset,
                destination,
                source);
        }
    }
}

