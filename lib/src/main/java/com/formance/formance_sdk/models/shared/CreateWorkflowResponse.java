/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowResponse - Created workflow
 */

public class CreateWorkflowResponse {
    @JsonProperty("data")
    public Workflow data;

    public CreateWorkflowResponse withData(Workflow data) {
        this.data = data;
        return this;
    }
    
    public CreateWorkflowResponse(@JsonProperty("data") Workflow data) {
        this.data = data;
  }
}