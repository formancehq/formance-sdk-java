/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class V2ListTriggersOccurrencesResponse {
    @JsonProperty("cursor")
    public V2ListTriggersOccurrencesResponseCursor cursor;

    public V2ListTriggersOccurrencesResponse withCursor(V2ListTriggersOccurrencesResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public V2ListTriggersOccurrencesResponse(@JsonProperty("cursor") V2ListTriggersOccurrencesResponseCursor cursor) {
        this.cursor = cursor;
  }
}
