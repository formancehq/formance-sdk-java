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


public class TaskCurrencyCloudDescriptor {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonCreator
    public TaskCurrencyCloudDescriptor(
            @JsonProperty("name") Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }
    
    public TaskCurrencyCloudDescriptor() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaskCurrencyCloudDescriptor withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public TaskCurrencyCloudDescriptor withName(Optional<? extends String> name) {
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
        TaskCurrencyCloudDescriptor other = (TaskCurrencyCloudDescriptor) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskCurrencyCloudDescriptor.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();  
        
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
        
        public TaskCurrencyCloudDescriptor build() {
            return new TaskCurrencyCloudDescriptor(
                name);
        }
    }
}

