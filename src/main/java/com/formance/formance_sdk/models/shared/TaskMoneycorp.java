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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class TaskMoneycorp {

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("descriptor")
    private TaskMoneycorpDescriptor descriptor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private JsonNullable<? extends TaskMoneycorpState> state;

    @JsonProperty("status")
    private TaskStatus status;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public TaskMoneycorp(
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("descriptor") TaskMoneycorpDescriptor descriptor,
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("id") String id,
            @JsonProperty("state") JsonNullable<? extends TaskMoneycorpState> state,
            @JsonProperty("status") TaskStatus status,
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
    
    public TaskMoneycorp(
            String connectorID,
            OffsetDateTime createdAt,
            TaskMoneycorpDescriptor descriptor,
            String id,
            TaskStatus status,
            OffsetDateTime updatedAt) {
        this(connectorID, createdAt, descriptor, Optional.empty(), id, JsonNullable.undefined(), status, updatedAt);
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
    public TaskMoneycorpDescriptor descriptor() {
        return descriptor;
    }

    @JsonIgnore
    public Optional<String> error() {
        return error;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<TaskMoneycorpState> state() {
        return (JsonNullable<TaskMoneycorpState>) state;
    }

    @JsonIgnore
    public TaskStatus status() {
        return status;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public TaskMoneycorp withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public TaskMoneycorp withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public TaskMoneycorp withDescriptor(TaskMoneycorpDescriptor descriptor) {
        Utils.checkNotNull(descriptor, "descriptor");
        this.descriptor = descriptor;
        return this;
    }

    public TaskMoneycorp withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public TaskMoneycorp withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TaskMoneycorp withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public TaskMoneycorp withState(TaskMoneycorpState state) {
        Utils.checkNotNull(state, "state");
        this.state = JsonNullable.of(state);
        return this;
    }

    public TaskMoneycorp withState(JsonNullable<? extends TaskMoneycorpState> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public TaskMoneycorp withStatus(TaskStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public TaskMoneycorp withUpdatedAt(OffsetDateTime updatedAt) {
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
        TaskMoneycorp other = (TaskMoneycorp) o;
        return 
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.descriptor, other.descriptor) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(TaskMoneycorp.class,
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
 
        private TaskMoneycorpDescriptor descriptor;
 
        private Optional<String> error = Optional.empty();
 
        private String id;
 
        private JsonNullable<? extends TaskMoneycorpState> state = JsonNullable.undefined();
 
        private TaskStatus status;
 
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

        public Builder descriptor(TaskMoneycorpDescriptor descriptor) {
            Utils.checkNotNull(descriptor, "descriptor");
            this.descriptor = descriptor;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder state(TaskMoneycorpState state) {
            Utils.checkNotNull(state, "state");
            this.state = JsonNullable.of(state);
            return this;
        }

        public Builder state(JsonNullable<? extends TaskMoneycorpState> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder status(TaskStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public TaskMoneycorp build() {
            return new TaskMoneycorp(
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
