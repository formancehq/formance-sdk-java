/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RunWorkflowResponse {
    @JsonProperty("data")
    public WorkflowInstance data;

    public RunWorkflowResponse withData(WorkflowInstance data) {
        this.data = data;
        return this;
    }
    
    public RunWorkflowResponse(@JsonProperty("data") WorkflowInstance data) {
        this.data = data;
  }
}
