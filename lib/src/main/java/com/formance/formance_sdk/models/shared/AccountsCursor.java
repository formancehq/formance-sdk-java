/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AccountsCursor {
    @JsonProperty("cursor")
    public Cursor cursor;

    public AccountsCursor withCursor(Cursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public AccountsCursor(@JsonProperty("cursor") Cursor cursor) {
        this.cursor = cursor;
  }
}
