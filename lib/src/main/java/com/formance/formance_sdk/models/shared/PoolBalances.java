/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PoolBalances {
    @JsonProperty("balances")
    public PoolBalance[] balances;

    public PoolBalances withBalances(PoolBalance[] balances) {
        this.balances = balances;
        return this;
    }
    
    public PoolBalances(@JsonProperty("balances") PoolBalance[] balances) {
        this.balances = balances;
  }
}
