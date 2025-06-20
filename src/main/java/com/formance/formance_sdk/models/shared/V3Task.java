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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class V3Task {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectorID")
    private Optional<String> connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdObjectID")
    private Optional<String> createdObjectID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private JsonNullable<String> error;

    @JsonProperty("id")
    private String id;

    @JsonProperty("status")
    private V3TaskStatusEnum status;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public V3Task(
            @JsonProperty("connectorID") Optional<String> connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("createdObjectID") Optional<String> createdObjectID,
            @JsonProperty("error") JsonNullable<String> error,
            @JsonProperty("id") String id,
            @JsonProperty("status") V3TaskStatusEnum status,
            @JsonProperty("updatedAt") OffsetDateTime updatedAt) {
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(createdObjectID, "createdObjectID");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.createdObjectID = createdObjectID;
        this.error = error;
        this.id = id;
        this.status = status;
        this.updatedAt = updatedAt;
    }
    
    public V3Task(
            OffsetDateTime createdAt,
            String id,
            V3TaskStatusEnum status,
            OffsetDateTime updatedAt) {
        this(Optional.empty(), createdAt, Optional.empty(), JsonNullable.undefined(), id, status, updatedAt);
    }

    @JsonIgnore
    public Optional<String> connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<String> createdObjectID() {
        return createdObjectID;
    }

    @JsonIgnore
    public JsonNullable<String> error() {
        return error;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public V3TaskStatusEnum status() {
        return status;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3Task withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = Optional.ofNullable(connectorID);
        return this;
    }

    public V3Task withConnectorID(Optional<String> connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public V3Task withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public V3Task withCreatedObjectID(String createdObjectID) {
        Utils.checkNotNull(createdObjectID, "createdObjectID");
        this.createdObjectID = Optional.ofNullable(createdObjectID);
        return this;
    }

    public V3Task withCreatedObjectID(Optional<String> createdObjectID) {
        Utils.checkNotNull(createdObjectID, "createdObjectID");
        this.createdObjectID = createdObjectID;
        return this;
    }

    public V3Task withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = JsonNullable.of(error);
        return this;
    }

    public V3Task withError(JsonNullable<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public V3Task withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V3Task withStatus(V3TaskStatusEnum status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public V3Task withUpdatedAt(OffsetDateTime updatedAt) {
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
        V3Task other = (V3Task) o;
        return 
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.createdObjectID, other.createdObjectID) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectorID,
            createdAt,
            createdObjectID,
            error,
            id,
            status,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3Task.class,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "createdObjectID", createdObjectID,
                "error", error,
                "id", id,
                "status", status,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<String> connectorID = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private Optional<String> createdObjectID = Optional.empty();
 
        private JsonNullable<String> error = JsonNullable.undefined();
 
        private String id;
 
        private V3TaskStatusEnum status;
 
        private OffsetDateTime updatedAt;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = Optional.ofNullable(connectorID);
            return this;
        }

        public Builder connectorID(Optional<String> connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdObjectID(String createdObjectID) {
            Utils.checkNotNull(createdObjectID, "createdObjectID");
            this.createdObjectID = Optional.ofNullable(createdObjectID);
            return this;
        }

        public Builder createdObjectID(Optional<String> createdObjectID) {
            Utils.checkNotNull(createdObjectID, "createdObjectID");
            this.createdObjectID = createdObjectID;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = JsonNullable.of(error);
            return this;
        }

        public Builder error(JsonNullable<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder status(V3TaskStatusEnum status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public V3Task build() {
            return new V3Task(
                connectorID,
                createdAt,
                createdObjectID,
                error,
                id,
                status,
                updatedAt);
        }
    }
}
