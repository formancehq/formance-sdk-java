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


public class OrchestrationPayment {
    @JsonProperty("adjustments")
    public OrchestrationPaymentAdjustment[] adjustments;

    public OrchestrationPayment withAdjustments(OrchestrationPaymentAdjustment[] adjustments) {
        this.adjustments = adjustments;
        return this;
    }
    
    @JsonProperty("asset")
    public String asset;

    public OrchestrationPayment withAsset(String asset) {
        this.asset = asset;
        return this;
    }
    
    @JsonProperty("connectorID")
    public String connectorID;

    public OrchestrationPayment withConnectorID(String connectorID) {
        this.connectorID = connectorID;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public OrchestrationPayment withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("destinationAccountID")
    public String destinationAccountID;

    public OrchestrationPayment withDestinationAccountID(String destinationAccountID) {
        this.destinationAccountID = destinationAccountID;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public OrchestrationPayment withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("initialAmount")
    public Long initialAmount;

    public OrchestrationPayment withInitialAmount(Long initialAmount) {
        this.initialAmount = initialAmount;
        return this;
    }
    
    @JsonProperty("metadata")
    public OrchestrationPaymentMetadata metadata;

    public OrchestrationPayment withMetadata(OrchestrationPaymentMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    public OrchestrationConnector provider;

    public OrchestrationPayment withProvider(OrchestrationConnector provider) {
        this.provider = provider;
        return this;
    }
    
    @JsonProperty("raw")
    public OrchestrationPaymentRaw raw;

    public OrchestrationPayment withRaw(OrchestrationPaymentRaw raw) {
        this.raw = raw;
        return this;
    }
    
    @JsonProperty("reference")
    public String reference;

    public OrchestrationPayment withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonProperty("scheme")
    public OrchestrationPaymentScheme scheme;

    public OrchestrationPayment withScheme(OrchestrationPaymentScheme scheme) {
        this.scheme = scheme;
        return this;
    }
    
    @JsonProperty("sourceAccountID")
    public String sourceAccountID;

    public OrchestrationPayment withSourceAccountID(String sourceAccountID) {
        this.sourceAccountID = sourceAccountID;
        return this;
    }
    
    @JsonProperty("status")
    public OrchestrationPaymentStatus status;

    public OrchestrationPayment withStatus(OrchestrationPaymentStatus status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public OrchestrationPaymentType type;

    public OrchestrationPayment withType(OrchestrationPaymentType type) {
        this.type = type;
        return this;
    }
    
    public OrchestrationPayment(@JsonProperty("adjustments") OrchestrationPaymentAdjustment[] adjustments, @JsonProperty("asset") String asset, @JsonProperty("connectorID") String connectorID, @JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("destinationAccountID") String destinationAccountID, @JsonProperty("id") String id, @JsonProperty("initialAmount") Long initialAmount, @JsonProperty("metadata") OrchestrationPaymentMetadata metadata, @JsonProperty("raw") OrchestrationPaymentRaw raw, @JsonProperty("reference") String reference, @JsonProperty("scheme") OrchestrationPaymentScheme scheme, @JsonProperty("sourceAccountID") String sourceAccountID, @JsonProperty("status") OrchestrationPaymentStatus status, @JsonProperty("type") OrchestrationPaymentType type) {
        this.adjustments = adjustments;
        this.asset = asset;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.destinationAccountID = destinationAccountID;
        this.id = id;
        this.initialAmount = initialAmount;
        this.metadata = metadata;
        this.raw = raw;
        this.reference = reference;
        this.scheme = scheme;
        this.sourceAccountID = sourceAccountID;
        this.status = status;
        this.type = type;
  }
}
