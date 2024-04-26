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


public class TaskMoneycorpDescriptor {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    private Optional<? extends String> accountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonCreator
    public TaskMoneycorpDescriptor(
            @JsonProperty("accountID") Optional<? extends String> accountID,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        this.accountID = accountID;
        this.key = key;
        this.name = name;
    }
    
    public TaskMoneycorpDescriptor() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends String> accountID() {
        return accountID;
    }

    @JsonIgnore
    public Optional<? extends String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<? extends String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaskMoneycorpDescriptor withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = Optional.ofNullable(accountID);
        return this;
    }

    public TaskMoneycorpDescriptor withAccountID(Optional<? extends String> accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public TaskMoneycorpDescriptor withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public TaskMoneycorpDescriptor withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public TaskMoneycorpDescriptor withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public TaskMoneycorpDescriptor withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        TaskMoneycorpDescriptor other = (TaskMoneycorpDescriptor) o;
        return 
            java.util.Objects.deepEquals(this.accountID, other.accountID) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountID,
            key,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskMoneycorpDescriptor.class,
                "accountID", accountID,
                "key", key,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> accountID = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = Optional.ofNullable(accountID);
            return this;
        }

        public Builder accountID(Optional<? extends String> accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<? extends String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
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
        
        public TaskMoneycorpDescriptor build() {
            return new TaskMoneycorpDescriptor(
                accountID,
                key,
                name);
        }
    }
}

