/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class TaskDummyPayDescriptor {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fileName")
    private Optional<? extends String> fileName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonCreator
    public TaskDummyPayDescriptor(
            @JsonProperty("fileName") Optional<? extends String> fileName,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(fileName, "fileName");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        this.fileName = fileName;
        this.key = key;
        this.name = name;
    }
    
    public TaskDummyPayDescriptor() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> fileName() {
        return (Optional<String>) fileName;
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

    public final static Builder builder() {
        return new Builder();
    }

    public TaskDummyPayDescriptor withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = Optional.ofNullable(fileName);
        return this;
    }

    public TaskDummyPayDescriptor withFileName(Optional<? extends String> fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
        return this;
    }

    public TaskDummyPayDescriptor withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public TaskDummyPayDescriptor withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public TaskDummyPayDescriptor withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public TaskDummyPayDescriptor withName(Optional<? extends String> name) {
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
        TaskDummyPayDescriptor other = (TaskDummyPayDescriptor) o;
        return 
            java.util.Objects.deepEquals(this.fileName, other.fileName) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            fileName,
            key,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskDummyPayDescriptor.class,
                "fileName", fileName,
                "key", key,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> fileName = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = Optional.ofNullable(fileName);
            return this;
        }

        public Builder fileName(Optional<? extends String> fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
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
        
        public TaskDummyPayDescriptor build() {
            return new TaskDummyPayDescriptor(
                fileName,
                key,
                name);
        }
    }
}

