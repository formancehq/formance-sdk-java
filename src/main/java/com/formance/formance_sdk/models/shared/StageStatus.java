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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class StageStatus {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonProperty("instanceID")
    private String instanceID;

    @JsonProperty("stage")
    private double stage;

    @JsonProperty("startedAt")
    private OffsetDateTime startedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminatedAt")
    private Optional<OffsetDateTime> terminatedAt;

    @JsonCreator
    public StageStatus(
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("instanceID") String instanceID,
            @JsonProperty("stage") double stage,
            @JsonProperty("startedAt") OffsetDateTime startedAt,
            @JsonProperty("terminatedAt") Optional<OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(instanceID, "instanceID");
        Utils.checkNotNull(stage, "stage");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.error = error;
        this.instanceID = instanceID;
        this.stage = stage;
        this.startedAt = startedAt;
        this.terminatedAt = terminatedAt;
    }
    
    public StageStatus(
            String instanceID,
            double stage,
            OffsetDateTime startedAt) {
        this(Optional.empty(), instanceID, stage, startedAt, Optional.empty());
    }

    @JsonIgnore
    public Optional<String> error() {
        return error;
    }

    @JsonIgnore
    public String instanceID() {
        return instanceID;
    }

    @JsonIgnore
    public double stage() {
        return stage;
    }

    @JsonIgnore
    public OffsetDateTime startedAt() {
        return startedAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> terminatedAt() {
        return terminatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public StageStatus withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public StageStatus withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public StageStatus withInstanceID(String instanceID) {
        Utils.checkNotNull(instanceID, "instanceID");
        this.instanceID = instanceID;
        return this;
    }

    public StageStatus withStage(double stage) {
        Utils.checkNotNull(stage, "stage");
        this.stage = stage;
        return this;
    }

    public StageStatus withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public StageStatus withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    public StageStatus withTerminatedAt(Optional<OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = terminatedAt;
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
        StageStatus other = (StageStatus) o;
        return 
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.instanceID, other.instanceID) &&
            Objects.deepEquals(this.stage, other.stage) &&
            Objects.deepEquals(this.startedAt, other.startedAt) &&
            Objects.deepEquals(this.terminatedAt, other.terminatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            error,
            instanceID,
            stage,
            startedAt,
            terminatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageStatus.class,
                "error", error,
                "instanceID", instanceID,
                "stage", stage,
                "startedAt", startedAt,
                "terminatedAt", terminatedAt);
    }
    
    public final static class Builder {
 
        private Optional<String> error = Optional.empty();
 
        private String instanceID;
 
        private Double stage;
 
        private OffsetDateTime startedAt;
 
        private Optional<OffsetDateTime> terminatedAt = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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

        public Builder instanceID(String instanceID) {
            Utils.checkNotNull(instanceID, "instanceID");
            this.instanceID = instanceID;
            return this;
        }

        public Builder stage(double stage) {
            Utils.checkNotNull(stage, "stage");
            this.stage = stage;
            return this;
        }

        public Builder startedAt(OffsetDateTime startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
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
        
        public StageStatus build() {
            return new StageStatus(
                error,
                instanceID,
                stage,
                startedAt,
                terminatedAt);
        }
    }
}
