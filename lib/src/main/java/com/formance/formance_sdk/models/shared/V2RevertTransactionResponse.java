/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class V2RevertTransactionResponse {
    @JsonProperty("data")
    public OrchestrationV2Transaction data;

    public V2RevertTransactionResponse withData(OrchestrationV2Transaction data) {
        this.data = data;
        return this;
    }
    
    public V2RevertTransactionResponse(@JsonProperty("data") OrchestrationV2Transaction data) {
        this.data = data;
  }
}
