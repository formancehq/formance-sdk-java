/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class LedgerInfo {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage")
    private Optional<? extends Storage> storage;

    public LedgerInfo(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("storage") Optional<? extends Storage> storage) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(storage, "storage");
        this.name = name;
        this.storage = storage;
    }

    public Optional<? extends String> name() {
        return name;
    }

    public Optional<? extends Storage> storage() {
        return storage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LedgerInfo withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public LedgerInfo withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public LedgerInfo withStorage(Storage storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = Optional.ofNullable(storage);
        return this;
    }

    public LedgerInfo withStorage(Optional<? extends Storage> storage) {
        Utils.checkNotNull(storage, "storage");
        this.storage = storage;
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
        LedgerInfo other = (LedgerInfo) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.storage, other.storage);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            storage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LedgerInfo.class,
                "name", name,
                "storage", storage);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends Storage> storage = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder storage(Storage storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = Optional.ofNullable(storage);
            return this;
        }

        public Builder storage(Optional<? extends Storage> storage) {
            Utils.checkNotNull(storage, "storage");
            this.storage = storage;
            return this;
        }
        
        public LedgerInfo build() {
            return new LedgerInfo(
                name,
                storage);
        }
    }
}

