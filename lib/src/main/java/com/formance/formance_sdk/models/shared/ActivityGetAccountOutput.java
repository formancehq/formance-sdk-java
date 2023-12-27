/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivityGetAccountOutput {
    @JsonProperty("data")
    public OrchestrationAccount data;

    public ActivityGetAccountOutput withData(OrchestrationAccount data) {
        this.data = data;
        return this;
    }
    
    public ActivityGetAccountOutput(@JsonProperty("data") OrchestrationAccount data) {
        this.data = data;
  }
}
