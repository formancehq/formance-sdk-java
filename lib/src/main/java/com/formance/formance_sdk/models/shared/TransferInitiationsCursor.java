/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TransferInitiationsCursor {
    @JsonProperty("cursor")
    public TransferInitiationsCursorCursor cursor;

    public TransferInitiationsCursor withCursor(TransferInitiationsCursorCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public TransferInitiationsCursor(@JsonProperty("cursor") TransferInitiationsCursorCursor cursor) {
        this.cursor = cursor;
  }
}