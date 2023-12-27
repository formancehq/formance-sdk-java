/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2CreditWalletRequest {
    @JsonProperty("amount")
    public V2Monetary amount;

    public V2CreditWalletRequest withAmount(V2Monetary amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * The balance to credit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    public String balance;

    public V2CreditWalletRequest withBalance(String balance) {
        this.balance = balance;
        return this;
    }
    
    /**
     * Metadata associated with the wallet.
     */
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public V2CreditWalletRequest withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;

    public V2CreditWalletRequest withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonProperty("sources")
    public Object[] sources;

    public V2CreditWalletRequest withSources(Object[] sources) {
        this.sources = sources;
        return this;
    }
    
    public V2CreditWalletRequest(@JsonProperty("amount") V2Monetary amount, @JsonProperty("metadata") java.util.Map<String, String> metadata, @JsonProperty("sources") Object[] sources) {
        this.amount = amount;
        this.metadata = metadata;
        this.sources = sources;
  }
}
