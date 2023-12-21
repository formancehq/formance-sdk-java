/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetHoldsResponse {
    @JsonProperty("cursor")
    public GetHoldsResponseCursor cursor;

    public GetHoldsResponse withCursor(GetHoldsResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public GetHoldsResponse(@JsonProperty("cursor") GetHoldsResponseCursor cursor) {
        this.cursor = cursor;
  }
}
