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

public class CreateBalanceRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiresAt")
    private Optional<? extends OffsetDateTime> expiresAt;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("priority")
    private Optional<? extends BigInteger> priority;

    @JsonCreator
    public CreateBalanceRequest(
            @JsonProperty("expiresAt") Optional<? extends OffsetDateTime> expiresAt,
            @JsonProperty("name") String name,
            @JsonProperty("priority") Optional<? extends BigInteger> priority) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(priority, "priority");
        this.expiresAt = expiresAt;
        this.name = name;
        this.priority = priority;
    }
    
    public CreateBalanceRequest(
            String name) {
        this(Optional.empty(), name, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> expiresAt() {
        return (Optional<OffsetDateTime>) expiresAt;
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

    public CreateBalanceRequest withExpiresAt(OffsetDateTime expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = Optional.ofNullable(expiresAt);
        return this;
    }

    public CreateBalanceRequest withExpiresAt(Optional<? extends OffsetDateTime> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
        return this;
    }

    public CreateBalanceRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CreateBalanceRequest withPriority(BigInteger priority) {
        Utils.checkNotNull(priority, "priority");
        this.priority = Optional.ofNullable(priority);
        return this;
    }

    public CreateBalanceRequest withPriority(long priority) {
        this.priority = Optional.of(BigInteger.valueOf(priority));
        return this;
    }

    public CreateBalanceRequest withPriority(Optional<? extends BigInteger> priority) {
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
        CreateBalanceRequest other = (CreateBalanceRequest) o;
        return 
            java.util.Objects.deepEquals(this.expiresAt, other.expiresAt) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.priority, other.priority);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            expiresAt,
            name,
            priority);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateBalanceRequest.class,
                "expiresAt", expiresAt,
                "name", name,
                "priority", priority);
    }
    
    public final static class Builder {
 
        private Optional<? extends OffsetDateTime> expiresAt = Optional.empty();
 
        private String name;
 
        private Optional<? extends BigInteger> priority = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        public Builder expiresAt(Optional<? extends OffsetDateTime> expiresAt) {
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
        
        public CreateBalanceRequest build() {
            return new CreateBalanceRequest(
                expiresAt,
                name,
                priority);
        }
    }
}

