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


public class TaskMangoPayDescriptor {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userID")
    private Optional<? extends String> userID;

    @JsonCreator
    public TaskMangoPayDescriptor(
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("userID") Optional<? extends String> userID) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(userID, "userID");
        this.key = key;
        this.name = name;
        this.userID = userID;
    }
    
    public TaskMangoPayDescriptor() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> key() {
        return (Optional<String>) key;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> userID() {
        return (Optional<String>) userID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaskMangoPayDescriptor withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public TaskMangoPayDescriptor withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public TaskMangoPayDescriptor withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public TaskMangoPayDescriptor withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public TaskMangoPayDescriptor withUserID(String userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = Optional.ofNullable(userID);
        return this;
    }

    public TaskMangoPayDescriptor withUserID(Optional<? extends String> userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = userID;
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
        TaskMangoPayDescriptor other = (TaskMangoPayDescriptor) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.userID, other.userID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key,
            name,
            userID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskMangoPayDescriptor.class,
                "key", key,
                "name", name,
                "userID", userID);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> userID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder userID(String userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = Optional.ofNullable(userID);
            return this;
        }

        public Builder userID(Optional<? extends String> userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = userID;
            return this;
        }
        
        public TaskMangoPayDescriptor build() {
            return new TaskMangoPayDescriptor(
                key,
                name,
                userID);
        }
    }
}

