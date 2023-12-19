/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2WorkflowConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public V2WorkflowConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("stages")
    public java.util.Map<String, Object>[] stages;

    public V2WorkflowConfig withStages(java.util.Map<String, Object>[] stages) {
        this.stages = stages;
        return this;
    }
    
    public V2WorkflowConfig(@JsonProperty("stages") java.util.Map<String, Object>[] stages) {
        this.stages = stages;
  }
}
