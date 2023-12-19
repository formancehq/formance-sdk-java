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


public class V2WorkflowInstanceHistory {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;

    public V2WorkflowInstanceHistory withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("input")
    public Object input;

    public V2WorkflowInstanceHistory withInput(Object input) {
        this.input = input;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public V2WorkflowInstanceHistory withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startedAt")
    public OffsetDateTime startedAt;

    public V2WorkflowInstanceHistory withStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    
    @JsonProperty("terminated")
    public Boolean terminated;

    public V2WorkflowInstanceHistory withTerminated(Boolean terminated) {
        this.terminated = terminated;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("terminatedAt")
    public OffsetDateTime terminatedAt;

    public V2WorkflowInstanceHistory withTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }
    
    public V2WorkflowInstanceHistory(@JsonProperty("input") Object input, @JsonProperty("name") String name, @JsonProperty("startedAt") OffsetDateTime startedAt, @JsonProperty("terminated") Boolean terminated) {
        this.input = input;
        this.name = name;
        this.startedAt = startedAt;
        this.terminated = terminated;
  }
}
