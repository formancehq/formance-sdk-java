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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class AccountWithVolumesAndBalances {

    @JsonProperty("address")
    private String address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balances")
    private Optional<? extends Map<String, BigInteger>> balances;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Map<String, Object>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("volumes")
    private Optional<? extends Map<String, Volume>> volumes;

    @JsonCreator
    public AccountWithVolumesAndBalances(
            @JsonProperty("address") String address,
            @JsonProperty("balances") Optional<? extends Map<String, BigInteger>> balances,
            @JsonProperty("metadata") Optional<? extends Map<String, Object>> metadata,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("volumes") Optional<? extends Map<String, Volume>> volumes) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(balances, "balances");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(volumes, "volumes");
        this.address = address;
        this.balances = balances;
        this.metadata = metadata;
        this.type = type;
        this.volumes = volumes;
    }
    
    public AccountWithVolumesAndBalances(
            String address) {
        this(address, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String address() {
        return address;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, BigInteger>> balances() {
        return (Optional<Map<String, BigInteger>>) balances;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> metadata() {
        return (Optional<Map<String, Object>>) metadata;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Volume>> volumes() {
        return (Optional<Map<String, Volume>>) volumes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountWithVolumesAndBalances withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public AccountWithVolumesAndBalances withBalances(Map<String, BigInteger> balances) {
        Utils.checkNotNull(balances, "balances");
        this.balances = Optional.ofNullable(balances);
        return this;
    }

    public AccountWithVolumesAndBalances withBalances(Optional<? extends Map<String, BigInteger>> balances) {
        Utils.checkNotNull(balances, "balances");
        this.balances = balances;
        return this;
    }

    public AccountWithVolumesAndBalances withMetadata(Map<String, Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public AccountWithVolumesAndBalances withMetadata(Optional<? extends Map<String, Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public AccountWithVolumesAndBalances withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AccountWithVolumesAndBalances withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public AccountWithVolumesAndBalances withVolumes(Map<String, Volume> volumes) {
        Utils.checkNotNull(volumes, "volumes");
        this.volumes = Optional.ofNullable(volumes);
        return this;
    }

    public AccountWithVolumesAndBalances withVolumes(Optional<? extends Map<String, Volume>> volumes) {
        Utils.checkNotNull(volumes, "volumes");
        this.volumes = volumes;
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
        AccountWithVolumesAndBalances other = (AccountWithVolumesAndBalances) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.balances, other.balances) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.volumes, other.volumes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            balances,
            metadata,
            type,
            volumes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountWithVolumesAndBalances.class,
                "address", address,
                "balances", balances,
                "metadata", metadata,
                "type", type,
                "volumes", volumes);
    }
    
    public final static class Builder {
 
        private String address;
 
        private Optional<? extends Map<String, BigInteger>> balances = Optional.empty();
 
        private Optional<? extends Map<String, Object>> metadata = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<? extends Map<String, Volume>> volumes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder balances(Map<String, BigInteger> balances) {
            Utils.checkNotNull(balances, "balances");
            this.balances = Optional.ofNullable(balances);
            return this;
        }

        public Builder balances(Optional<? extends Map<String, BigInteger>> balances) {
            Utils.checkNotNull(balances, "balances");
            this.balances = balances;
            return this;
        }

        public Builder metadata(Map<String, Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends Map<String, Object>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder volumes(Map<String, Volume> volumes) {
            Utils.checkNotNull(volumes, "volumes");
            this.volumes = Optional.ofNullable(volumes);
            return this;
        }

        public Builder volumes(Optional<? extends Map<String, Volume>> volumes) {
            Utils.checkNotNull(volumes, "volumes");
            this.volumes = volumes;
            return this;
        }
        
        public AccountWithVolumesAndBalances build() {
            return new AccountWithVolumesAndBalances(
                address,
                balances,
                metadata,
                type,
                volumes);
        }
    }
}

