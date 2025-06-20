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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LedgerInfoStorage {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("migrations")
    private Optional<? extends List<MigrationInfo>> migrations;

    @JsonCreator
    public LedgerInfoStorage(
            @JsonProperty("migrations") Optional<? extends List<MigrationInfo>> migrations) {
        Utils.checkNotNull(migrations, "migrations");
        this.migrations = migrations;
    }
    
    public LedgerInfoStorage() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MigrationInfo>> migrations() {
        return (Optional<List<MigrationInfo>>) migrations;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public LedgerInfoStorage withMigrations(List<MigrationInfo> migrations) {
        Utils.checkNotNull(migrations, "migrations");
        this.migrations = Optional.ofNullable(migrations);
        return this;
    }

    public LedgerInfoStorage withMigrations(Optional<? extends List<MigrationInfo>> migrations) {
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
        LedgerInfoStorage other = (LedgerInfoStorage) o;
        return 
            Objects.deepEquals(this.migrations, other.migrations);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            migrations);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LedgerInfoStorage.class,
                "migrations", migrations);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<MigrationInfo>> migrations = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder migrations(List<MigrationInfo> migrations) {
            Utils.checkNotNull(migrations, "migrations");
            this.migrations = Optional.ofNullable(migrations);
            return this;
        }

        public Builder migrations(Optional<? extends List<MigrationInfo>> migrations) {
            Utils.checkNotNull(migrations, "migrations");
            this.migrations = migrations;
            return this;
        }
        
        public LedgerInfoStorage build() {
            return new LedgerInfoStorage(
                migrations);
        }
    }
}
