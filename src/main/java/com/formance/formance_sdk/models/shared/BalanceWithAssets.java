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

public class BalanceWithAssets {

    @JsonProperty("assets")
    private Map<String, BigInteger> assets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiresAt")
    private JsonNullable<OffsetDateTime> expiresAt;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("priority")
    private Optional<? extends BigInteger> priority;

    @JsonCreator
    public BalanceWithAssets(
            @JsonProperty("assets") Map<String, BigInteger> assets,
            @JsonProperty("expiresAt") JsonNullable<OffsetDateTime> expiresAt,
            @JsonProperty("name") String name,
            @JsonProperty("priority") Optional<? extends BigInteger> priority) {
        assets = Utils.emptyMapIfNull(assets);
        Utils.checkNotNull(expiresAt, "expiresAt");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(priority, "priority");
        this.assets = assets;
        this.expiresAt = expiresAt;
        this.name = name;
        this.priority = priority;
    }
    
    public BalanceWithAssets(
            Map<String, BigInteger> assets,
            String name) {
        this(assets, JsonNullable.undefined(), name, Optional.empty());
    }

    @JsonIgnore
    public Map<String, BigInteger> assets() {
        return assets;
    }

    @JsonIgnore
    public JsonNullable<OffsetDateTime> expiresAt() {
        return expiresAt;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigInteger> priority() {
        return (Optional<BigInteger>) priority;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BalanceWithAssets withAssets(Map<String, BigInteger> assets) {
        Utils.checkNotNull(assets, "assets");
        this.assets = assets;
        return this;
    }

    public BalanceWithAssets withExpiresAt(OffsetDateTime expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    public BalanceWithAssets withExpiresAt(JsonNullable<OffsetDateTime> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
        return this;
    }

    public BalanceWithAssets withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public BalanceWithAssets withPriority(BigInteger priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = Optional.ofNullable(priority);
        return this;
    }

    public BalanceWithAssets withPriority(long priority) {
        this.priority = Optional.of(BigInteger.valueOf(priority));
        return this;
    }

    public BalanceWithAssets withPriority(Optional<? extends BigInteger> priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = priority;
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
        BalanceWithAssets other = (BalanceWithAssets) o;
        return 
            Objects.deepEquals(this.assets, other.assets) &&
            Objects.deepEquals(this.expiresAt, other.expiresAt) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.priority, other.priority);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            assets,
            expiresAt,
            name,
            priority);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BalanceWithAssets.class,
                "assets", assets,
                "expiresAt", expiresAt,
                "name", name,
                "priority", priority);
    }
    
    public final static class Builder {
 
        private Map<String, BigInteger> assets;
 
        private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.undefined();
 
        private String name;
 
        private Optional<? extends BigInteger> priority = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder assets(Map<String, BigInteger> assets) {
            Utils.checkNotNull(assets, "assets");
            this.assets = assets;
            return this;
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = JsonNullable.of(expiresAt);
            return this;
        }

        public Builder expiresAt(JsonNullable<OffsetDateTime> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder priority(BigInteger priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = Optional.ofNullable(priority);
            return this;
        }

        public Builder priority(long priority) {
            this.priority = Optional.of(BigInteger.valueOf(priority));
            return this;
        }

        public Builder priority(Optional<? extends BigInteger> priority) {
            Utils.checkNotNull(priority, "priority");
            this.priority = priority;
            return this;
        }
        
        public BalanceWithAssets build() {
            return new BalanceWithAssets(
                assets,
                expiresAt,
                name,
                priority);
        }
    }
}

