/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class V2AddMetadataToAccountRequest {
    /**
     * Use an idempotency key
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    public String idempotencyKey;

    public V2AddMetadataToAccountRequest withIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    
    /**
     * metadata
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, String> requestBody;

    public V2AddMetadataToAccountRequest withRequestBody(java.util.Map<String, String> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Exact address of the account. It must match the following regular expressions pattern:
     * ```
     * ^\w+(:\w+)*$
     * ```
     * 
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=address")
    public String address;

    public V2AddMetadataToAccountRequest withAddress(String address) {
        this.address = address;
        return this;
    }
    
    /**
     * Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dryRun")
    public Boolean dryRun;

    public V2AddMetadataToAccountRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public V2AddMetadataToAccountRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    public V2AddMetadataToAccountRequest(@JsonProperty("RequestBody") java.util.Map<String, String> requestBody, @JsonProperty("address") String address, @JsonProperty("ledger") String ledger) {
        this.requestBody = requestBody;
        this.address = address;
        this.ledger = ledger;
  }
}