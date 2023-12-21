/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Pool {
    @JsonProperty("accounts")
    public String[] accounts;

    public Pool withAccounts(String[] accounts) {
        this.accounts = accounts;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public Pool withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public Pool withName(String name) {
        this.name = name;
        return this;
    }
    
    public Pool(@JsonProperty("accounts") String[] accounts, @JsonProperty("id") String id, @JsonProperty("name") String name) {
        this.accounts = accounts;
        this.id = id;
        this.name = name;
  }
}
