/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWorkflowInstanceHistoryResponse - The workflow instance history
 */
public class GetWorkflowInstanceHistoryResponse {
    @JsonProperty("data")
    public WorkflowInstanceHistory[] data;

    public GetWorkflowInstanceHistoryResponse withData(WorkflowInstanceHistory[] data) {
        this.data = data;
        return this;
    }
    
    public GetWorkflowInstanceHistoryResponse(@JsonProperty("data") WorkflowInstanceHistory[] data) {
        this.data = data;
  }
}
