/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class TransferInitiationRequest {

    @JsonProperty("amount")
    private BigInteger amount;

    @JsonProperty("asset")
    private String asset;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("connectorID")
    private Optional<String> connectorID;

    @JsonProperty("description")
    private String description;

    @JsonProperty("destinationAccountID")
    private String destinationAccountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends Map<String, String>> metadata;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("scheduledAt")
    private OffsetDateTime scheduledAt;

    @JsonProperty("sourceAccountID")
    private String sourceAccountID;

    @JsonProperty("type")
    private TransferInitiationRequestType type;

    @JsonProperty("validated")
    private boolean validated;

    @JsonCreator
    public TransferInitiationRequest(
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("asset") String asset,
            @JsonProperty("connectorID") Optional<String> connectorID,
            @JsonProperty("description") String description,
            @JsonProperty("destinationAccountID") String destinationAccountID,
            @JsonProperty("metadata") JsonNullable<? extends Map<String, String>> metadata,
            @JsonProperty("reference") String reference,
            @JsonProperty("scheduledAt") OffsetDateTime scheduledAt,
            @JsonProperty("sourceAccountID") String sourceAccountID,
            @JsonProperty("type") TransferInitiationRequestType type,
            @JsonProperty("validated") boolean validated) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(asset, "asset");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(validated, "validated");
        this.amount = amount;
        this.asset = asset;
        this.connectorID = connectorID;
        this.description = description;
        this.destinationAccountID = destinationAccountID;
        this.metadata = metadata;
        this.reference = reference;
        this.scheduledAt = scheduledAt;
        this.sourceAccountID = sourceAccountID;
        this.type = type;
        this.validated = validated;
    }
    
    public TransferInitiationRequest(
            BigInteger amount,
            String asset,
            String description,
            String destinationAccountID,
            String reference,
            OffsetDateTime scheduledAt,
            String sourceAccountID,
            TransferInitiationRequestType type,
            boolean validated) {
        this(amount, asset, Optional.empty(), description, destinationAccountID, JsonNullable.undefined(), reference, scheduledAt, sourceAccountID, type, validated);
    }

    @JsonIgnore
    public BigInteger amount() {
        return amount;
    }

    @JsonIgnore
    public String asset() {
        return asset;
    }

    @JsonIgnore
    public Optional<String> connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @JsonIgnore
    public String destinationAccountID() {
        return destinationAccountID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Map<String, String>> metadata() {
        return (JsonNullable<Map<String, String>>) metadata;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    @JsonIgnore
    public OffsetDateTime scheduledAt() {
        return scheduledAt;
    }

    @JsonIgnore
    public String sourceAccountID() {
        return sourceAccountID;
    }

    @JsonIgnore
    public TransferInitiationRequestType type() {
        return type;
    }

    @JsonIgnore
    public boolean validated() {
        return validated;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public TransferInitiationRequest withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    public TransferInitiationRequest withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public TransferInitiationRequest withAsset(String asset) {
        Utils.checkNotNull(asset, "asset");
        this.asset = asset;
        return this;
    }

    public TransferInitiationRequest withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = Optional.ofNullable(connectorID);
        return this;
    }

    public TransferInitiationRequest withConnectorID(Optional<String> connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public TransferInitiationRequest withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public TransferInitiationRequest withDestinationAccountID(String destinationAccountID) {
        Utils.checkNotNull(destinationAccountID, "destinationAccountID");
        this.destinationAccountID = destinationAccountID;
        return this;
    }

    public TransferInitiationRequest withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public TransferInitiationRequest withMetadata(JsonNullable<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public TransferInitiationRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public TransferInitiationRequest withScheduledAt(OffsetDateTime scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    public TransferInitiationRequest withSourceAccountID(String sourceAccountID) {
        Utils.checkNotNull(sourceAccountID, "sourceAccountID");
        this.sourceAccountID = sourceAccountID;
        return this;
    }

    public TransferInitiationRequest withType(TransferInitiationRequestType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public TransferInitiationRequest withValidated(boolean validated) {
        Utils.checkNotNull(validated, "validated");
        this.validated = validated;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransferInitiationRequest other = (TransferInitiationRequest) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.asset, other.asset) &&
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.destinationAccountID, other.destinationAccountID) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.scheduledAt, other.scheduledAt) &&
            Objects.deepEquals(this.sourceAccountID, other.sourceAccountID) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.validated, other.validated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            asset,
            connectorID,
            description,
            destinationAccountID,
            metadata,
            reference,
            scheduledAt,
            sourceAccountID,
            type,
            validated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransferInitiationRequest.class,
                "amount", amount,
                "asset", asset,
                "connectorID", connectorID,
                "description", description,
                "destinationAccountID", destinationAccountID,
                "metadata", metadata,
                "reference", reference,
                "scheduledAt", scheduledAt,
                "sourceAccountID", sourceAccountID,
                "type", type,
                "validated", validated);
    }
    
    public final static class Builder {
 
        private BigInteger amount;
 
        private String asset;
 
        private Optional<String> connectorID = Optional.empty();
 
        private String description;
 
        private String destinationAccountID;
 
        private JsonNullable<? extends Map<String, String>> metadata = JsonNullable.undefined();
 
        private String reference;
 
        private OffsetDateTime scheduledAt;
 
        private String sourceAccountID;
 
        private TransferInitiationRequestType type;
 
        private Boolean validated;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(long amount) {
            this.amount = BigInteger.valueOf(amount);
            return this;
        }

        public Builder amount(BigInteger amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            Utils.checkNotNull(asset, "asset");
            this.asset = asset;
            return this;
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = Optional.ofNullable(connectorID);
            return this;
        }

        public Builder connectorID(Optional<String> connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder destinationAccountID(String destinationAccountID) {
            Utils.checkNotNull(destinationAccountID, "destinationAccountID");
            this.destinationAccountID = destinationAccountID;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder scheduledAt(OffsetDateTime scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = scheduledAt;
            return this;
        }

        public Builder sourceAccountID(String sourceAccountID) {
            Utils.checkNotNull(sourceAccountID, "sourceAccountID");
            this.sourceAccountID = sourceAccountID;
            return this;
        }

        public Builder type(TransferInitiationRequestType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder validated(boolean validated) {
            Utils.checkNotNull(validated, "validated");
            this.validated = validated;
            return this;
        }
        
        public TransferInitiationRequest build() {
            return new TransferInitiationRequest(
                amount,
                asset,
                connectorID,
                description,
                destinationAccountID,
                metadata,
                reference,
                scheduledAt,
                sourceAccountID,
                type,
                validated);
        }
    }
}
