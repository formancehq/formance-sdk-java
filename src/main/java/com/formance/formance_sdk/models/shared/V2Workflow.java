/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class V2Workflow {

    @JsonProperty("config")
    private V2WorkflowConfig config;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public V2Workflow(
            @JsonProperty("config") V2WorkflowConfig config,
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
    public V2WorkflowConfig config() {
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

    public V2Workflow withConfig(V2WorkflowConfig config) {
        Utils.checkNotNull(config, "config");
        this.config = config;
        return this;
    }

    public V2Workflow withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public V2Workflow withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2Workflow withUpdatedAt(OffsetDateTime updatedAt) {
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
        V2Workflow other = (V2Workflow) o;
        return 
            java.util.Objects.deepEquals(this.config, other.config) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            config,
            createdAt,
            id,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Workflow.class,
                "config", config,
                "createdAt", createdAt,
                "id", id,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private V2WorkflowConfig config;
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder config(V2WorkflowConfig config) {
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
        
        public V2Workflow build() {
            return new V2Workflow(
                config,
                createdAt,
                id,
                updatedAt);
        }
    }
}

