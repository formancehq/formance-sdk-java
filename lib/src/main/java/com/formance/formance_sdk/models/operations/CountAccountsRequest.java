/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class CountAccountsRequest {
    /**
     * Filter accounts by address pattern (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=address")
    public String address;

    public CountAccountsRequest withAddress(String address) {
        this.address = address;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public CountAccountsRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    /**
     * Filter accounts by metadata key value pairs. The filter can be used like this metadata[key]=value1&amp;metadata[a.nested.key]=value2
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, Object> metadata;

    public CountAccountsRequest withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public CountAccountsRequest(@JsonProperty("ledger") String ledger) {
        this.ledger = ledger;
  }
}
