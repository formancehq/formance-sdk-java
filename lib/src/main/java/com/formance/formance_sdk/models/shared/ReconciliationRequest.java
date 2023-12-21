/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class ReconciliationRequest {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("reconciledAtLedger")
    public OffsetDateTime reconciledAtLedger;

    public ReconciliationRequest withReconciledAtLedger(OffsetDateTime reconciledAtLedger) {
        this.reconciledAtLedger = reconciledAtLedger;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("reconciledAtPayments")
    public OffsetDateTime reconciledAtPayments;

    public ReconciliationRequest withReconciledAtPayments(OffsetDateTime reconciledAtPayments) {
        this.reconciledAtPayments = reconciledAtPayments;
        return this;
    }
    
    public ReconciliationRequest(@JsonProperty("reconciledAtLedger") OffsetDateTime reconciledAtLedger, @JsonProperty("reconciledAtPayments") OffsetDateTime reconciledAtPayments) {
        this.reconciledAtLedger = reconciledAtLedger;
        this.reconciledAtPayments = reconciledAtPayments;
  }
}