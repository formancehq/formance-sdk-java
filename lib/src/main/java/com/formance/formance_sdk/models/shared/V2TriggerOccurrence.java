/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class V2TriggerOccurrence {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date")
    public OffsetDateTime date;

    public V2TriggerOccurrence withDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }
    
    @JsonProperty("event")
    public java.util.Map<String, Object> event;

    public V2TriggerOccurrence withEvent(java.util.Map<String, Object> event) {
        this.event = event;
        return this;
    }
    
    @JsonProperty("triggerID")
    public String triggerID;

    public V2TriggerOccurrence withTriggerID(String triggerID) {
        this.triggerID = triggerID;
        return this;
    }
    
    @JsonProperty("workflowInstance")
    public V2WorkflowInstance workflowInstance;

    public V2TriggerOccurrence withWorkflowInstance(V2WorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
        return this;
    }
    
    @JsonProperty("workflowInstanceID")
    public String workflowInstanceID;

    public V2TriggerOccurrence withWorkflowInstanceID(String workflowInstanceID) {
        this.workflowInstanceID = workflowInstanceID;
        return this;
    }
    
    public V2TriggerOccurrence(@JsonProperty("date") OffsetDateTime date, @JsonProperty("event") java.util.Map<String, Object> event, @JsonProperty("triggerID") String triggerID, @JsonProperty("workflowInstance") V2WorkflowInstance workflowInstance, @JsonProperty("workflowInstanceID") String workflowInstanceID) {
        this.date = date;
        this.event = event;
        this.triggerID = triggerID;
        this.workflowInstance = workflowInstance;
        this.workflowInstanceID = workflowInstanceID;
  }
}
