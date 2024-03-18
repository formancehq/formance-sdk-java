/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2DebitWalletRequest {
    @JsonProperty("amount")
    public V2Monetary amount;

    public V2DebitWalletRequest withAmount(V2Monetary amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balances")
    public String[] balances;

    public V2DebitWalletRequest withBalances(String[] balances) {
        this.balances = balances;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public V2DebitWalletRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    public java.lang.Object destination;

    public V2DebitWalletRequest withDestination(java.lang.Object destination) {
        this.destination = destination;
        return this;
    }
    
    /**
     * Metadata associated with the wallet.
     */
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public V2DebitWalletRequest withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Set to true to create a pending hold. If false, the wallet will be debited immediately.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pending")
    public Boolean pending;

    public V2DebitWalletRequest withPending(Boolean pending) {
        this.pending = pending;
        return this;
    }
    
    public V2DebitWalletRequest(@JsonProperty("amount") V2Monetary amount, @JsonProperty("metadata") java.util.Map<String, String> metadata) {
        this.amount = amount;
        this.metadata = metadata;
  }
}
