/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class V2GetWorkflowResponse {
    @JsonProperty("data")
    public V2Workflow data;

    public V2GetWorkflowResponse withData(V2Workflow data) {
        this.data = data;
        return this;
    }
    
    public V2GetWorkflowResponse(@JsonProperty("data") V2Workflow data) {
        this.data = data;
  }
}
