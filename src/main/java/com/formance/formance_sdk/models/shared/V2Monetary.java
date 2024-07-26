/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class V2Monetary {

    /**
     * The amount of the monetary value.
     */
    @JsonProperty("amount")
    private BigInteger amount;

    /**
     * The asset of the monetary value.
     */
    @JsonProperty("asset")
    private String asset;

    @JsonCreator
    public V2Monetary(
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("asset") String asset) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        this.amount = amount;
        this.asset = asset;
    }

    /**
     * The amount of the monetary value.
     */
    @JsonIgnore
    public BigInteger amount() {
        return amount;
    }

    /**
     * The asset of the monetary value.
     */
    @JsonIgnore
    public String asset() {
        return asset;
    }

    public final static Builder builder() {
        return new Builder();
    }

        /**
         * The amount of the monetary value.
         */
    public V2Monetary withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    /**
     * The amount of the monetary value.
     */
    public V2Monetary withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The asset of the monetary value.
     */
    public V2Monetary withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
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
        V2Monetary other = (V2Monetary) o;
        return 
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.asset, other.asset);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            amount,
            asset);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Monetary.class,
                "amount", amount,
                "asset", asset);
    }
    
    public final static class Builder {
 
        private BigInteger amount;
 
        private String asset;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The amount of the monetary value.
         */
        public Builder amount(long amount) {
            this.amount = BigInteger.valueOf(amount);
            return this;
        }

        /**
         * The amount of the monetary value.
         */
        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * The asset of the monetary value.
         */
        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }
        
        public V2Monetary build() {
            return new V2Monetary(
                amount,
                asset);
        }
    }
}

