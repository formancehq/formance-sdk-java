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


public class TransferInitiationPayments {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public TransferInitiationPayments withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("error")
    public String error;

    public TransferInitiationPayments withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("paymentID")
    public String paymentID;

    public TransferInitiationPayments withPaymentID(String paymentID) {
        this.paymentID = paymentID;
        return this;
    }
    
    @JsonProperty("status")
    public PaymentStatus status;

    public TransferInitiationPayments withStatus(PaymentStatus status) {
        this.status = status;
        return this;
    }
    
    public TransferInitiationPayments(@JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("error") String error, @JsonProperty("paymentID") String paymentID, @JsonProperty("status") PaymentStatus status) {
        this.createdAt = createdAt;
        this.error = error;
        this.paymentID = paymentID;
        this.status = status;
  }
}
