/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;

public class Policy {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("ledgerName")
    private String ledgerName;

    @JsonProperty("ledgerQuery")
    private Map<String, Object> ledgerQuery;

    @JsonProperty("name")
    private String name;

    @JsonProperty("paymentsPoolID")
    private String paymentsPoolID;

    @JsonCreator
    public Policy(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("ledgerName") String ledgerName,
            @JsonProperty("ledgerQuery") Map<String, Object> ledgerQuery,
            @JsonProperty("name") String name,
            @JsonProperty("paymentsPoolID") String paymentsPoolID) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledgerName, "ledgerName");
        ledgerQuery = Utils.emptyMapIfNull(ledgerQuery);
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(paymentsPoolID, "paymentsPoolID");
        this.createdAt = createdAt;
        this.id = id;
        this.ledgerName = ledgerName;
        this.ledgerQuery = ledgerQuery;
        this.name = name;
        this.paymentsPoolID = paymentsPoolID;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String ledgerName() {
        return ledgerName;
    }

    @JsonIgnore
    public Map<String, Object> ledgerQuery() {
        return ledgerQuery;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String paymentsPoolID() {
        return paymentsPoolID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Policy withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Policy withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Policy withLedgerName(String ledgerName) {
        Utils.checkNotNull(ledgerName, "ledgerName");
        this.ledgerName = ledgerName;
        return this;
    }

    public Policy withLedgerQuery(Map<String, Object> ledgerQuery) {
        Utils.checkNotNull(ledgerQuery, "ledgerQuery");
        this.ledgerQuery = ledgerQuery;
        return this;
    }

    public Policy withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Policy withPaymentsPoolID(String paymentsPoolID) {
        Utils.checkNotNull(paymentsPoolID, "paymentsPoolID");
        this.paymentsPoolID = paymentsPoolID;
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
        Policy other = (Policy) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.ledgerName, other.ledgerName) &&
            Objects.deepEquals(this.ledgerQuery, other.ledgerQuery) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.paymentsPoolID, other.paymentsPoolID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            id,
            ledgerName,
            ledgerQuery,
            name,
            paymentsPoolID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Policy.class,
                "createdAt", createdAt,
                "id", id,
                "ledgerName", ledgerName,
                "ledgerQuery", ledgerQuery,
                "name", name,
                "paymentsPoolID", paymentsPoolID);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private String ledgerName;
 
        private Map<String, Object> ledgerQuery;
 
        private String name;
 
        private String paymentsPoolID;
        
        private Builder() {
          // force use of static builder() method
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

        public Builder ledgerName(String ledgerName) {
            Utils.checkNotNull(ledgerName, "ledgerName");
            this.ledgerName = ledgerName;
            return this;
        }

        public Builder ledgerQuery(Map<String, Object> ledgerQuery) {
            Utils.checkNotNull(ledgerQuery, "ledgerQuery");
            this.ledgerQuery = ledgerQuery;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder paymentsPoolID(String paymentsPoolID) {
            Utils.checkNotNull(paymentsPoolID, "paymentsPoolID");
            this.paymentsPoolID = paymentsPoolID;
            return this;
        }
        
        public Policy build() {
            return new Policy(
                createdAt,
                id,
                ledgerName,
                ledgerQuery,
                name,
                paymentsPoolID);
        }
    }
}
