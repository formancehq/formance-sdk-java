/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetHoldResponse {
    @JsonProperty("data")
    public ExpandedDebitHold data;

    public GetHoldResponse withData(ExpandedDebitHold data) {
        this.data = data;
        return this;
    }
    
    public GetHoldResponse(@JsonProperty("data") ExpandedDebitHold data) {
        this.data = data;
  }
}
