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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class V2CreateWorkflowRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonProperty("stages")
    private List<Map<String, Object>> stages;

    @JsonCreator
    public V2CreateWorkflowRequest(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("stages") List<Map<String, Object>> stages) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(stages, "stages");
        this.name = name;
        this.stages = stages;
    }
    
    public V2CreateWorkflowRequest(
            List<Map<String, Object>> stages) {
        this(Optional.empty(), stages);
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public List<Map<String, Object>> stages() {
        return stages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CreateWorkflowRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public V2CreateWorkflowRequest withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public V2CreateWorkflowRequest withStages(List<Map<String, Object>> stages) {
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
        V2CreateWorkflowRequest other = (V2CreateWorkflowRequest) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.stages, other.stages);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            stages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateWorkflowRequest.class,
                "name", name,
                "stages", stages);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private List<Map<String, Object>> stages;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder stages(List<Map<String, Object>> stages) {
            Utils.checkNotNull(stages, "stages");
            this.stages = stages;
            return this;
        }
        
        public V2CreateWorkflowRequest build() {
            return new V2CreateWorkflowRequest(
                name,
                stages);
        }
    }
}

