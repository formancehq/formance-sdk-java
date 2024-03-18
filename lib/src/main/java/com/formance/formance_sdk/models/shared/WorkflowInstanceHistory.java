/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class WorkflowInstanceHistory {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;

    public WorkflowInstanceHistory withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("input")
    public java.lang.Object input;

    public WorkflowInstanceHistory withInput(java.lang.Object input) {
        this.input = input;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public WorkflowInstanceHistory withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startedAt")
    public OffsetDateTime startedAt;

    public WorkflowInstanceHistory withStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    
    @JsonProperty("terminated")
    public Boolean terminated;

    public WorkflowInstanceHistory withTerminated(Boolean terminated) {
        this.terminated = terminated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("terminatedAt")
    public OffsetDateTime terminatedAt;

    public WorkflowInstanceHistory withTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }
    
    public WorkflowInstanceHistory(@JsonProperty("input") java.lang.Object input, @JsonProperty("name") String name, @JsonProperty("startedAt") OffsetDateTime startedAt, @JsonProperty("terminated") Boolean terminated) {
        this.input = input;
        this.name = name;
        this.startedAt = startedAt;
        this.terminated = terminated;
  }
}
