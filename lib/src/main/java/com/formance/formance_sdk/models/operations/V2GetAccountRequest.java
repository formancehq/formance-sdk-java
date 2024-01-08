/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class V2GetAccountRequest {
    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=address")
    public String address;

    public V2GetAccountRequest withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=expand")
    public String expand;

    public V2GetAccountRequest withExpand(String expand) {
        this.expand = expand;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public V2GetAccountRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    public OffsetDateTime pit;

    public V2GetAccountRequest withPit(OffsetDateTime pit) {
        this.pit = pit;
        return this;
    }
    
    public V2GetAccountRequest(@JsonProperty("address") String address, @JsonProperty("ledger") String ledger) {
        this.address = address;
        this.ledger = ledger;
  }
}
