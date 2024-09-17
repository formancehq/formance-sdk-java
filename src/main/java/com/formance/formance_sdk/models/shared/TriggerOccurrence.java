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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class TriggerOccurrence {

    @JsonProperty("date")
    private OffsetDateTime date;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonProperty("event")
    private Map<String, Object> event;

    @JsonProperty("triggerID")
    private String triggerID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowInstance")
    private Optional<? extends WorkflowInstance> workflowInstance;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("workflowInstanceID")
    private Optional<String> workflowInstanceID;

    @JsonCreator
    public TriggerOccurrence(
            @JsonProperty("date") OffsetDateTime date,
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("event") Map<String, Object> event,
            @JsonProperty("triggerID") String triggerID,
            @JsonProperty("workflowInstance") Optional<? extends WorkflowInstance> workflowInstance,
            @JsonProperty("workflowInstanceID") Optional<String> workflowInstanceID) {
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(error, "error");
        event = Utils.emptyMapIfNull(event);
        Utils.checkNotNull(triggerID, "triggerID");
        Utils.checkNotNull(workflowInstance, "workflowInstance");
        Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
        this.date = date;
        this.error = error;
        this.event = event;
        this.triggerID = triggerID;
        this.workflowInstance = workflowInstance;
        this.workflowInstanceID = workflowInstanceID;
    }
    
    public TriggerOccurrence(
            OffsetDateTime date,
            Map<String, Object> event,
            String triggerID) {
        this(date, Optional.empty(), event, triggerID, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public OffsetDateTime date() {
        return date;
    }

    @JsonIgnore
    public Optional<String> error() {
        return error;
    }

    @JsonIgnore
    public Map<String, Object> event() {
        return event;
    }

    @JsonIgnore
    public String triggerID() {
        return triggerID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WorkflowInstance> workflowInstance() {
        return (Optional<WorkflowInstance>) workflowInstance;
    }

    @JsonIgnore
    public Optional<String> workflowInstanceID() {
        return workflowInstanceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TriggerOccurrence withDate(OffsetDateTime date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public TriggerOccurrence withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public TriggerOccurrence withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TriggerOccurrence withEvent(Map<String, Object> event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    public TriggerOccurrence withTriggerID(String triggerID) {
        Utils.checkNotNull(triggerID, "triggerID");
        this.triggerID = triggerID;
        return this;
    }

    public TriggerOccurrence withWorkflowInstance(WorkflowInstance workflowInstance) {
        Utils.checkNotNull(workflowInstance, "workflowInstance");
        this.workflowInstance = Optional.ofNullable(workflowInstance);
        return this;
    }

    public TriggerOccurrence withWorkflowInstance(Optional<? extends WorkflowInstance> workflowInstance) {
        Utils.checkNotNull(workflowInstance, "workflowInstance");
        this.workflowInstance = workflowInstance;
        return this;
    }

    public TriggerOccurrence withWorkflowInstanceID(String workflowInstanceID) {
        Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
        this.workflowInstanceID = Optional.ofNullable(workflowInstanceID);
        return this;
    }

    public TriggerOccurrence withWorkflowInstanceID(Optional<String> workflowInstanceID) {
        Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
        this.workflowInstanceID = workflowInstanceID;
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
        TriggerOccurrence other = (TriggerOccurrence) o;
        return 
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.event, other.event) &&
            Objects.deepEquals(this.triggerID, other.triggerID) &&
            Objects.deepEquals(this.workflowInstance, other.workflowInstance) &&
            Objects.deepEquals(this.workflowInstanceID, other.workflowInstanceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            date,
            error,
            event,
            triggerID,
            workflowInstance,
            workflowInstanceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TriggerOccurrence.class,
                "date", date,
                "error", error,
                "event", event,
                "triggerID", triggerID,
                "workflowInstance", workflowInstance,
                "workflowInstanceID", workflowInstanceID);
    }
    
    public final static class Builder {
 
        private OffsetDateTime date;
 
        private Optional<String> error = Optional.empty();
 
        private Map<String, Object> event;
 
        private String triggerID;
 
        private Optional<? extends WorkflowInstance> workflowInstance = Optional.empty();
 
        private Optional<String> workflowInstanceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder date(OffsetDateTime date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
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

        public Builder event(Map<String, Object> event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }

        public Builder triggerID(String triggerID) {
            Utils.checkNotNull(triggerID, "triggerID");
            this.triggerID = triggerID;
            return this;
        }

        public Builder workflowInstance(WorkflowInstance workflowInstance) {
            Utils.checkNotNull(workflowInstance, "workflowInstance");
            this.workflowInstance = Optional.ofNullable(workflowInstance);
            return this;
        }

        public Builder workflowInstance(Optional<? extends WorkflowInstance> workflowInstance) {
            Utils.checkNotNull(workflowInstance, "workflowInstance");
            this.workflowInstance = workflowInstance;
            return this;
        }

        public Builder workflowInstanceID(String workflowInstanceID) {
            Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
            this.workflowInstanceID = Optional.ofNullable(workflowInstanceID);
            return this;
        }

        public Builder workflowInstanceID(Optional<String> workflowInstanceID) {
            Utils.checkNotNull(workflowInstanceID, "workflowInstanceID");
            this.workflowInstanceID = workflowInstanceID;
            return this;
        }
        
        public TriggerOccurrence build() {
            return new TriggerOccurrence(
                date,
                error,
                event,
                triggerID,
                workflowInstance,
                workflowInstanceID);
        }
    }
}

