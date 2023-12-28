/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class V2GetLedgerRequest {
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public V2GetLedgerRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    public V2GetLedgerRequest(@JsonProperty("ledger") String ledger) {
        this.ledger = ledger;
  }
}
