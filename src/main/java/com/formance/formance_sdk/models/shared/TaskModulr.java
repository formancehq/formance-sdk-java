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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class TaskModulr {

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("descriptor")
    private TaskModulrDescriptor descriptor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    @JsonProperty("id")
    private String id;

    @JsonProperty("state")
    private TaskModulrState state;

    @JsonProperty("status")
    private PaymentStatus status;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public TaskModulr(
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("descriptor") TaskModulrDescriptor descriptor,
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("id") String id,
            @JsonProperty("state") TaskModulrState state,
            @JsonProperty("status") PaymentStatus status,
            @JsonProperty("updatedAt") OffsetDateTime updatedAt) {
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(descriptor, "descriptor");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.descriptor = descriptor;
        this.error = error;
        this.id = id;
        this.state = state;
        this.status = status;
        this.updatedAt = updatedAt;
    }
    
    public TaskModulr(
            String connectorID,
            OffsetDateTime createdAt,
            TaskModulrDescriptor descriptor,
            String id,
            TaskModulrState state,
            PaymentStatus status,
            OffsetDateTime updatedAt) {
        this(connectorID, createdAt, descriptor, Optional.empty(), id, state, status, updatedAt);
    }

    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public TaskModulrDescriptor descriptor() {
        return descriptor;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> error() {
        return (Optional<String>) error;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public TaskModulrState state() {
        return state;
    }

    @JsonIgnore
    public PaymentStatus status() {
        return status;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TaskModulr withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public TaskModulr withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TaskModulr withDescriptor(TaskModulrDescriptor descriptor) {
        Utils.checkNotNull(descriptor, "descriptor");
        this.descriptor = descriptor;
        return this;
    }

    public TaskModulr withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public TaskModulr withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TaskModulr withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TaskModulr withState(TaskModulrState state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public TaskModulr withStatus(PaymentStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public TaskModulr withUpdatedAt(OffsetDateTime updatedAt) {
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
        TaskModulr other = (TaskModulr) o;
        return 
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.descriptor, other.descriptor) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.state, other.state) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectorID,
            createdAt,
            descriptor,
            error,
            id,
            state,
            status,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaskModulr.class,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "descriptor", descriptor,
                "error", error,
                "id", id,
                "state", state,
                "status", status,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private TaskModulrDescriptor descriptor;
 
        private Optional<? extends String> error = Optional.empty();
 
        private String id;
 
        private TaskModulrState state;
 
        private PaymentStatus status;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder descriptor(TaskModulrDescriptor descriptor) {
            Utils.checkNotNull(descriptor, "descriptor");
            this.descriptor = descriptor;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<? extends String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder state(TaskModulrState state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder status(PaymentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public TaskModulr build() {
            return new TaskModulr(
                connectorID,
                createdAt,
                descriptor,
                error,
                id,
                state,
                status,
                updatedAt);
        }
    }
}

