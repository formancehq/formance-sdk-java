/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class AccountRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountName")
    private Optional<? extends String> accountName;

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultAsset")
    private Optional<? extends String> defaultAsset;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends java.util.Map<String, String>> metadata;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("type")
    private AccountType type;

    @JsonCreator
    public AccountRequest(
            @JsonProperty("accountName") Optional<? extends String> accountName,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("defaultAsset") Optional<? extends String> defaultAsset,
            @JsonProperty("metadata") JsonNullable<? extends java.util.Map<String, String>> metadata,
            @JsonProperty("reference") String reference,
            @JsonProperty("type") AccountType type) {
        Utils.checkNotNull(accountName, "accountName");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(defaultAsset, "defaultAsset");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(type, "type");
        this.accountName = accountName;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.defaultAsset = defaultAsset;
        this.metadata = metadata;
        this.reference = reference;
        this.type = type;
    }
    
    public AccountRequest(
            String connectorID,
            OffsetDateTime createdAt,
            String reference,
            AccountType type) {
        this(Optional.empty(), connectorID, createdAt, Optional.empty(), JsonNullable.undefined(), reference, type);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> accountName() {
        return (Optional<String>) accountName;
    }

    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> defaultAsset() {
        return (Optional<String>) defaultAsset;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<java.util.Map<String, String>> metadata() {
        return (JsonNullable<java.util.Map<String, String>>) metadata;
    }

    @JsonIgnore
    public String reference() {
        return reference;
    }

    @JsonIgnore
    public AccountType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AccountRequest withAccountName(String accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = Optional.ofNullable(accountName);
        return this;
    }

    public AccountRequest withAccountName(Optional<? extends String> accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
        return this;
    }

    public AccountRequest withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public AccountRequest withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public AccountRequest withDefaultAsset(String defaultAsset) {
        Utils.checkNotNull(defaultAsset, "defaultAsset");
        this.defaultAsset = Optional.ofNullable(defaultAsset);
        return this;
    }

    public AccountRequest withDefaultAsset(Optional<? extends String> defaultAsset) {
        Utils.checkNotNull(defaultAsset, "defaultAsset");
        this.defaultAsset = defaultAsset;
        return this;
    }

    public AccountRequest withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public AccountRequest withMetadata(JsonNullable<? extends java.util.Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public AccountRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public AccountRequest withType(AccountType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        AccountRequest other = (AccountRequest) o;
        return 
            java.util.Objects.deepEquals(this.accountName, other.accountName) &&
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.defaultAsset, other.defaultAsset) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountName,
            connectorID,
            createdAt,
            defaultAsset,
            metadata,
            reference,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AccountRequest.class,
                "accountName", accountName,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "defaultAsset", defaultAsset,
                "metadata", metadata,
                "reference", reference,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> accountName = Optional.empty();
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private Optional<? extends String> defaultAsset = Optional.empty();
 
        private JsonNullable<? extends java.util.Map<String, String>> metadata = JsonNullable.undefined();
 
        private String reference;
 
        private AccountType type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountName(String accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = Optional.ofNullable(accountName);
            return this;
        }

        public Builder accountName(Optional<? extends String> accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = accountName;
            return this;
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder defaultAsset(String defaultAsset) {
            Utils.checkNotNull(defaultAsset, "defaultAsset");
            this.defaultAsset = Optional.ofNullable(defaultAsset);
            return this;
        }

        public Builder defaultAsset(Optional<? extends String> defaultAsset) {
            Utils.checkNotNull(defaultAsset, "defaultAsset");
            this.defaultAsset = defaultAsset;
            return this;
        }

        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends java.util.Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder type(AccountType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AccountRequest build() {
            return new AccountRequest(
                accountName,
                connectorID,
                createdAt,
                defaultAsset,
                metadata,
                reference,
                type);
        }
    }
}

