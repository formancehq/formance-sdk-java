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

public class WorkflowInstance {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    @JsonProperty("id")
    private String id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends java.util.List<StageStatus>> status;

    @JsonProperty("terminated")
    private boolean terminated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminatedAt")
    private Optional<? extends OffsetDateTime> terminatedAt;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonProperty("workflowID")
    private String workflowID;

    @JsonCreator
    public WorkflowInstance(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("id") String id,
            @JsonProperty("status") Optional<? extends java.util.List<StageStatus>> status,
            @JsonProperty("terminated") boolean terminated,
            @JsonProperty("terminatedAt") Optional<? extends OffsetDateTime> terminatedAt,
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
    
    public WorkflowInstance(
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

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> error() {
        return (Optional<String>) error;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<StageStatus>> status() {
        return (Optional<java.util.List<StageStatus>>) status;
    }

    @JsonIgnore
    public boolean terminated() {
        return terminated;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> terminatedAt() {
        return (Optional<OffsetDateTime>) terminatedAt;
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

    public WorkflowInstance withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public WorkflowInstance withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public WorkflowInstance withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public WorkflowInstance withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public WorkflowInstance withStatus(java.util.List<StageStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public WorkflowInstance withStatus(Optional<? extends java.util.List<StageStatus>> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public WorkflowInstance withTerminated(boolean terminated) {
        Utils.checkNotNull(terminated, "terminated");
        this.terminated = terminated;
        return this;
    }

    public WorkflowInstance withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    public WorkflowInstance withTerminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
        return this;
    }

    public WorkflowInstance withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public WorkflowInstance withWorkflowID(String workflowID) {
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
        WorkflowInstance other = (WorkflowInstance) o;
        return 
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.terminated, other.terminated) &&
            java.util.Objects.deepEquals(this.terminatedAt, other.terminatedAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            java.util.Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
        return Utils.toString(WorkflowInstance.class,
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
 
        private Optional<? extends String> error = Optional.empty();
 
        private String id;
 
        private Optional<? extends java.util.List<StageStatus>> status = Optional.empty();
 
        private Boolean terminated;
 
        private Optional<? extends OffsetDateTime> terminatedAt = Optional.empty();
 
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

        public Builder status(java.util.List<StageStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends java.util.List<StageStatus>> status) {
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

        public Builder terminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
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
        
        public WorkflowInstance build() {
            return new WorkflowInstance(
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

