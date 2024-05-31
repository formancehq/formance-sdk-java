/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class WorkflowInstanceHistory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    @JsonProperty("input")
    private Stage input;

    @JsonProperty("name")
    private String name;

    @JsonProperty("startedAt")
    private OffsetDateTime startedAt;

    @JsonProperty("terminated")
    private boolean terminated;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terminatedAt")
    private Optional<? extends OffsetDateTime> terminatedAt;

    @JsonCreator
    public WorkflowInstanceHistory(
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("input") Stage input,
            @JsonProperty("name") String name,
            @JsonProperty("startedAt") OffsetDateTime startedAt,
            @JsonProperty("terminated") boolean terminated,
            @JsonProperty("terminatedAt") Optional<? extends OffsetDateTime> terminatedAt) {
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(startedAt, "startedAt");
        Utils.checkNotNull(terminated, "terminated");
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.error = error;
        this.input = input;
        this.name = name;
        this.startedAt = startedAt;
        this.terminated = terminated;
        this.terminatedAt = terminatedAt;
    }
    
    public WorkflowInstanceHistory(
            Stage input,
            String name,
            OffsetDateTime startedAt,
            boolean terminated) {
        this(Optional.empty(), input, name, startedAt, terminated, Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> error() {
        return (Optional<String>) error;
    }

    @JsonIgnore
    public Stage input() {
        return input;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public OffsetDateTime startedAt() {
        return startedAt;
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

    public final static Builder builder() {
        return new Builder();
    }

    public WorkflowInstanceHistory withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public WorkflowInstanceHistory withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public WorkflowInstanceHistory withInput(Stage input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    public WorkflowInstanceHistory withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public WorkflowInstanceHistory withStartedAt(OffsetDateTime startedAt) {
        Utils.checkNotNull(startedAt, "startedAt");
        this.startedAt = startedAt;
        return this;
    }

    public WorkflowInstanceHistory withTerminated(boolean terminated) {
        Utils.checkNotNull(terminated, "terminated");
        this.terminated = terminated;
        return this;
    }

    public WorkflowInstanceHistory withTerminatedAt(OffsetDateTime terminatedAt) {
        Utils.checkNotNull(terminatedAt, "terminatedAt");
        this.terminatedAt = Optional.ofNullable(terminatedAt);
        return this;
    }

    public WorkflowInstanceHistory withTerminatedAt(Optional<? extends OffsetDateTime> terminatedAt) {
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
        WorkflowInstanceHistory other = (WorkflowInstanceHistory) o;
        return 
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.input, other.input) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.startedAt, other.startedAt) &&
            java.util.Objects.deepEquals(this.terminated, other.terminated) &&
            java.util.Objects.deepEquals(this.terminatedAt, other.terminatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            error,
            input,
            name,
            startedAt,
            terminated,
            terminatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowInstanceHistory.class,
                "error", error,
                "input", input,
                "name", name,
                "startedAt", startedAt,
                "terminated", terminated,
                "terminatedAt", terminatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> error = Optional.empty();
 
        private Stage input;
 
        private String name;
 
        private OffsetDateTime startedAt;
 
        private Boolean terminated;
 
        private Optional<? extends OffsetDateTime> terminatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder input(Stage input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder startedAt(OffsetDateTime startedAt) {
            Utils.checkNotNull(startedAt, "startedAt");
            this.startedAt = startedAt;
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
        
        public WorkflowInstanceHistory build() {
            return new WorkflowInstanceHistory(
                error,
                input,
                name,
                startedAt,
                terminated,
                terminatedAt);
        }
    }
}

