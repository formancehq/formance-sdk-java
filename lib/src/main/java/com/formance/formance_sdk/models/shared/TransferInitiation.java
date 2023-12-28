/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class TransferInitiation {
    @JsonProperty("amount")
    public Long amount;

    public TransferInitiation withAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonProperty("asset")
    public String asset;

    public TransferInitiation withAsset(String asset) {
        this.asset = asset;
        return this;
    }
    
    @JsonProperty("connectorID")
    public String connectorID;

    public TransferInitiation withConnectorID(String connectorID) {
        this.connectorID = connectorID;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public TransferInitiation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("description")
    public String description;

    public TransferInitiation withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("destinationAccountID")
    public String destinationAccountID;

    public TransferInitiation withDestinationAccountID(String destinationAccountID) {
        this.destinationAccountID = destinationAccountID;
        return this;
    }
    
    @JsonProperty("error")
    public String error;

    public TransferInitiation withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public TransferInitiation withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public TransferInitiation withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("reference")
    public String reference;

    public TransferInitiation withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relatedPayments")
    public TransferInitiationPayments[] relatedPayments;

    public TransferInitiation withRelatedPayments(TransferInitiationPayments[] relatedPayments) {
        this.relatedPayments = relatedPayments;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("scheduledAt")
    public OffsetDateTime scheduledAt;

    public TransferInitiation withScheduledAt(OffsetDateTime scheduledAt) {
        this.scheduledAt = scheduledAt;
        return this;
    }
    
    @JsonProperty("sourceAccountID")
    public String sourceAccountID;

    public TransferInitiation withSourceAccountID(String sourceAccountID) {
        this.sourceAccountID = sourceAccountID;
        return this;
    }
    
    @JsonProperty("status")
    public TransferInitiationStatus status;

    public TransferInitiation withStatus(TransferInitiationStatus status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public TransferInitiationType type;

    public TransferInitiation withType(TransferInitiationType type) {
        this.type = type;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;

    public TransferInitiation withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public TransferInitiation(@JsonProperty("amount") Long amount, @JsonProperty("asset") String asset, @JsonProperty("connectorID") String connectorID, @JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("description") String description, @JsonProperty("destinationAccountID") String destinationAccountID, @JsonProperty("error") String error, @JsonProperty("id") String id, @JsonProperty("reference") String reference, @JsonProperty("scheduledAt") OffsetDateTime scheduledAt, @JsonProperty("sourceAccountID") String sourceAccountID, @JsonProperty("status") TransferInitiationStatus status, @JsonProperty("type") TransferInitiationType type, @JsonProperty("updatedAt") OffsetDateTime updatedAt) {
        this.amount = amount;
        this.asset = asset;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.description = description;
        this.destinationAccountID = destinationAccountID;
        this.error = error;
        this.id = id;
        this.reference = reference;
        this.scheduledAt = scheduledAt;
        this.sourceAccountID = sourceAccountID;
        this.status = status;
        this.type = type;
        this.updatedAt = updatedAt;
  }
}
