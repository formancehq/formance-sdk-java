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
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V2WorkflowConfig {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonProperty("stages")
    private java.util.List<java.util.Map<String, java.lang.Object>> stages;

    @JsonCreator
    public V2WorkflowConfig(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("stages") java.util.List<java.util.Map<String, java.lang.Object>> stages) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(stages, "stages");
        this.name = name;
        this.stages = stages;
    }
    
    public V2WorkflowConfig(
            java.util.List<java.util.Map<String, java.lang.Object>> stages) {
        this(Optional.empty(), stages);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @JsonIgnore
    public java.util.List<java.util.Map<String, java.lang.Object>> stages() {
        return stages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2WorkflowConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public V2WorkflowConfig withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public V2WorkflowConfig withStages(java.util.List<java.util.Map<String, java.lang.Object>> stages) {
        Utils.checkNotNull(stages, "stages");
        this.stages = stages;
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
        V2WorkflowConfig other = (V2WorkflowConfig) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.stages, other.stages);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            stages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2WorkflowConfig.class,
                "name", name,
                "stages", stages);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private java.util.List<java.util.Map<String, java.lang.Object>> stages;  
        
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

        public Builder stages(java.util.List<java.util.Map<String, java.lang.Object>> stages) {
            Utils.checkNotNull(stages, "stages");
            this.stages = stages;
            return this;
        }
        
        public V2WorkflowConfig build() {
            return new V2WorkflowConfig(
                name,
                stages);
        }
    }
}

