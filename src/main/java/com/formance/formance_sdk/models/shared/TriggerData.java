/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class TriggerData {

    @JsonProperty("event")
    private String event;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends String> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends java.util.Map<String, java.lang.Object>> vars;

    @JsonProperty("workflowID")
    private String workflowID;

    public TriggerData(
            @JsonProperty("event") String event,
            @JsonProperty("filter") Optional<? extends String> filter,
            @JsonProperty("vars") Optional<? extends java.util.Map<String, java.lang.Object>> vars,
            @JsonProperty("workflowID") String workflowID) {
        Utils.checkNotNull(event, "event");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(vars, "vars");
        Utils.checkNotNull(workflowID, "workflowID");
        this.event = event;
        this.filter = filter;
        this.vars = vars;
        this.workflowID = workflowID;
    }

    public String event() {
        return event;
    }

    public Optional<? extends String> filter() {
        return filter;
    }

    public Optional<? extends java.util.Map<String, java.lang.Object>> vars() {
        return vars;
    }

    public String workflowID() {
        return workflowID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TriggerData withEvent(String event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    public TriggerData withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public TriggerData withFilter(Optional<? extends String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public TriggerData withVars(java.util.Map<String, java.lang.Object> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public TriggerData withVars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = vars;
        return this;
    }

    public TriggerData withWorkflowID(String workflowID) {
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
        TriggerData other = (TriggerData) o;
        return 
            java.util.Objects.deepEquals(this.event, other.event) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.vars, other.vars) &&
            java.util.Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            event,
            filter,
            vars,
            workflowID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TriggerData.class,
                "event", event,
                "filter", filter,
                "vars", vars,
                "workflowID", workflowID);
    }
    
    public final static class Builder {
 
        private String event;
 
        private Optional<? extends String> filter = Optional.empty();
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> vars = Optional.empty();
 
        private String workflowID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder event(String event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<? extends String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder vars(java.util.Map<String, java.lang.Object> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = Optional.ofNullable(vars);
            return this;
        }

        public Builder vars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = vars;
            return this;
        }

        public Builder workflowID(String workflowID) {
            Utils.checkNotNull(workflowID, "workflowID");
            this.workflowID = workflowID;
            return this;
        }
        
        public TriggerData build() {
            return new TriggerData(
                event,
                filter,
                vars,
                workflowID);
        }
    }
}
