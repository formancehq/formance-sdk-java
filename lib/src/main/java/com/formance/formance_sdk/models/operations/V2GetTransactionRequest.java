/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class V2GetTransactionRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=expand")
    public String expand;

    public V2GetTransactionRequest withExpand(String expand) {
        this.expand = expand;
        return this;
    }
    
    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public Long id;

    public V2GetTransactionRequest withId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public V2GetTransactionRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    public OffsetDateTime pit;

    public V2GetTransactionRequest withPit(OffsetDateTime pit) {
        this.pit = pit;
        return this;
    }
    
    public V2GetTransactionRequest(@JsonProperty("id") Long id, @JsonProperty("ledger") String ledger) {
        this.id = id;
        this.ledger = ledger;
  }
}