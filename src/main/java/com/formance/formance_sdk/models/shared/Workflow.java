/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class Workflow {

    @JsonProperty("config")
    private WorkflowConfig config;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public Workflow(
            @JsonProperty("config") WorkflowConfig config,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("updatedAt") OffsetDateTime updatedAt) {
        Utils.checkNotNull(config, "config");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.config = config;
        this.createdAt = createdAt;
        this.id = id;
        this.updatedAt = updatedAt;
    }

    @JsonIgnore
    public WorkflowConfig config() {
        return config;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Workflow withConfig(WorkflowConfig config) {
        Utils.checkNotNull(config, "config");
        this.config = config;
        return this;
    }

    public Workflow withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Workflow withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Workflow withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        Workflow other = (Workflow) o;
        return 
            Objects.deepEquals(this.config, other.config) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            config,
            createdAt,
            id,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Workflow.class,
                "config", config,
                "createdAt", createdAt,
                "id", id,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private WorkflowConfig config;
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder config(WorkflowConfig config) {
            Utils.checkNotNull(config, "config");
            this.config = config;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public Workflow build() {
            return new Workflow(
                config,
                createdAt,
                id,
                updatedAt);
        }
    }
}

