/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectorsConfigsResponseConnector {
    @JsonProperty("key")
    public Key key;

    public ConnectorsConfigsResponseConnector withKey(Key key) {
        this.key = key;
        return this;
    }
    
    public ConnectorsConfigsResponseConnector(@JsonProperty("key") Key key) {
        this.key = key;
  }
}