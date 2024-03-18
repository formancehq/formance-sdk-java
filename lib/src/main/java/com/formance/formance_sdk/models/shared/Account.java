/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Account {
    @JsonProperty("address")
    public String address;

    public Account withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, java.lang.Object> metadata;

    public Account withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public Account withType(String type) {
        this.type = type;
        return this;
    }
    
    public Account(@JsonProperty("address") String address) {
        this.address = address;
  }
}
