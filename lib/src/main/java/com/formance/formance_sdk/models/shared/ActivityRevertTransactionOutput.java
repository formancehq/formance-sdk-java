/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivityRevertTransactionOutput {
    @JsonProperty("data")
    public OrchestrationTransaction data;

    public ActivityRevertTransactionOutput withData(OrchestrationTransaction data) {
        this.data = data;
        return this;
    }
    
    public ActivityRevertTransactionOutput(@JsonProperty("data") OrchestrationTransaction data) {
        this.data = data;
  }
}
