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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class V2WorkflowInstance {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends List<V2StageStatus>> status;

    @JsonProperty("terminated")
    private boolean terminated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminatedAt")
    private Optional<OffsetDateTime> terminatedAt;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonProperty("workflowID")
    private String workflowID;

    @JsonCreator
    public V2WorkflowInstance(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("id") String id,
            @JsonProperty("status") Optional<? extends List<V2StageStatus>> status,
            @JsonProperty("terminated") boolean terminated,
            @JsonProperty("terminatedAt") Optional<OffsetDateTime> terminatedAt,
            @JsonProperty("updatedAt") OffsetDateTime updatedAt,
            @JsonProperty("workflowID") String workflowID) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(terminated, "terminated");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(workflowID, "workflowID");
        this.createdAt = createdAt;
        this.error = error;
        this.id = id;
        this.status = status;
        this.terminated = terminated;
        this.terminatedAt = terminatedAt;
        this.updatedAt = updatedAt;
        this.workflowID = workflowID;
    }
    
    public V2WorkflowInstance(
            OffsetDateTime createdAt,
            String id,
            boolean terminated,
            OffsetDateTime updatedAt,
            String workflowID) {
        this(createdAt, Optional.empty(), id, Optional.empty(), terminated, Optional.empty(), updatedAt, workflowID);
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
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
    public Optional<List<V2StageStatus>> status() {
        return (Optional<List<V2StageStatus>>) status;
    }

    @JsonIgnore
    public boolean terminated() {
        return terminated;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> terminatedAt() {
        return terminatedAt;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public String workflowID() {
        return workflowID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2WorkflowInstance withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public V2WorkflowInstance withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public V2WorkflowInstance withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public V2WorkflowInstance withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2WorkflowInstance withStatus(List<V2StageStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public V2WorkflowInstance withStatus(Optional<? extends List<V2StageStatus>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public V2WorkflowInstance withTerminated(boolean terminated) {
        Utils.checkNotNull(terminated, "terminated");
        this.terminated = terminated;
        return this;
    }

    public V2WorkflowInstance withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    public V2WorkflowInstance withTerminatedAt(Optional<OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
        return this;
    }

    public V2WorkflowInstance withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public V2WorkflowInstance withWorkflowID(String workflowID) {
        Utils.checkNotNull(workflowID, "workflowID");
        this.workflowID = workflowID;
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
        V2WorkflowInstance other = (V2WorkflowInstance) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.terminated, other.terminated) &&
            Objects.deepEquals(this.terminatedAt, other.terminatedAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            error,
            id,
            status,
            terminated,
            terminatedAt,
            updatedAt,
            workflowID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2WorkflowInstance.class,
                "createdAt", createdAt,
                "error", error,
                "id", id,
                "status", status,
                "terminated", terminated,
                "terminatedAt", terminatedAt,
                "updatedAt", updatedAt,
                "workflowID", workflowID);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private Optional<String> error = Optional.empty();
 
        private String id;
 
        private Optional<? extends List<V2StageStatus>> status = Optional.empty();
 
        private Boolean terminated;
 
        private Optional<OffsetDateTime> terminatedAt = Optional.empty();
 
        private OffsetDateTime updatedAt;
 
        private String workflowID;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
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

        public Builder status(List<V2StageStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends List<V2StageStatus>> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder terminated(boolean terminated) {
            Utils.checkNotNull(terminated, "terminated");
            this.terminated = terminated;
            return this;
        }

        public Builder terminatedAt(OffsetDateTime terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = Optional.ofNullable(terminatedAt);
            return this;
        }

        public Builder terminatedAt(Optional<OffsetDateTime> terminatedAt) {
            Utils.checkNotNull(terminatedAt, "terminatedAt");
            this.terminatedAt = terminatedAt;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder workflowID(String workflowID) {
            Utils.checkNotNull(workflowID, "workflowID");
            this.workflowID = workflowID;
            return this;
        }
        
        public V2WorkflowInstance build() {
            return new V2WorkflowInstance(
                createdAt,
                error,
                id,
                status,
                terminated,
                terminatedAt,
                updatedAt,
                workflowID);
        }
    }
}
