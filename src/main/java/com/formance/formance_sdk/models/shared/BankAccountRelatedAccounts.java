/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class BankAccountRelatedAccounts {

    @JsonProperty("accountID")
    private String accountID;

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("provider")
    private String provider;

    public BankAccountRelatedAccounts(
            @JsonProperty("accountID") String accountID,
            @JsonProperty("connectorID") String connectorID,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("provider") String provider) {
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(provider, "provider");
        this.accountID = accountID;
        this.connectorID = connectorID;
        this.createdAt = createdAt;
        this.id = id;
        this.provider = provider;
    }

    public String accountID() {
        return accountID;
    }

    public String connectorID() {
        return connectorID;
    }

    public OffsetDateTime createdAt() {
        return createdAt;
    }

    public String id() {
        return id;
    }

    public String provider() {
        return provider;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BankAccountRelatedAccounts withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public BankAccountRelatedAccounts withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    public BankAccountRelatedAccounts withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public BankAccountRelatedAccounts withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public BankAccountRelatedAccounts withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
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
        BankAccountRelatedAccounts other = (BankAccountRelatedAccounts) o;
        return 
            java.util.Objects.deepEquals(this.accountID, other.accountID) &&
            java.util.Objects.deepEquals(this.connectorID, other.connectorID) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.provider, other.provider);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountID,
            connectorID,
            createdAt,
            id,
            provider);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BankAccountRelatedAccounts.class,
                "accountID", accountID,
                "connectorID", connectorID,
                "createdAt", createdAt,
                "id", id,
                "provider", provider);
    }
    
    public final static class Builder {
 
        private String accountID;
 
        private String connectorID;
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private String provider;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
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

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }
        
        public BankAccountRelatedAccounts build() {
            return new BankAccountRelatedAccounts(
                accountID,
                connectorID,
                createdAt,
                id,
                provider);
        }
    }
}

