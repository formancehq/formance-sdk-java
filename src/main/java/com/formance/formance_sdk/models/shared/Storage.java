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


public class Storage {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("migrations")
    private Optional<? extends java.util.List<MigrationInfo>> migrations;

    public Storage(
            @JsonProperty("migrations") Optional<? extends java.util.List<MigrationInfo>> migrations) {
        Utils.checkNotNull(migrations, "migrations");
        this.migrations = migrations;
    }

    public Optional<? extends java.util.List<MigrationInfo>> migrations() {
        return migrations;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Storage withMigrations(java.util.List<MigrationInfo> migrations) {
        Utils.checkNotNull(migrations, "migrations");
        this.migrations = Optional.ofNullable(migrations);
        return this;
    }

    public Storage withMigrations(Optional<? extends java.util.List<MigrationInfo>> migrations) {
        Utils.checkNotNull(migrations, "migrations");
        this.migrations = migrations;
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
        Storage other = (Storage) o;
        return 
            java.util.Objects.deepEquals(this.migrations, other.migrations);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            migrations);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Storage.class,
                "migrations", migrations);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<MigrationInfo>> migrations = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder migrations(java.util.List<MigrationInfo> migrations) {
            Utils.checkNotNull(migrations, "migrations");
            this.migrations = Optional.ofNullable(migrations);
            return this;
        }

        public Builder migrations(Optional<? extends java.util.List<MigrationInfo>> migrations) {
            Utils.checkNotNull(migrations, "migrations");
            this.migrations = migrations;
            return this;
        }
        
        public Storage build() {
            return new Storage(
                migrations);
        }
    }
}

