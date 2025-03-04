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
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Reconciliation {

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("driftBalances")
    private Map<String, BigInteger> driftBalances;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<String> error;

    @JsonProperty("id")
    private String id;

    @JsonProperty("ledgerBalances")
    private Map<String, BigInteger> ledgerBalances;

    @JsonProperty("paymentsBalances")
    private Map<String, BigInteger> paymentsBalances;

    @JsonProperty("policyID")
    private String policyID;

    @JsonProperty("reconciledAtLedger")
    private OffsetDateTime reconciledAtLedger;

    @JsonProperty("reconciledAtPayments")
    private OffsetDateTime reconciledAtPayments;

    @JsonProperty("status")
    private String status;

    @JsonCreator
    public Reconciliation(
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("driftBalances") Map<String, BigInteger> driftBalances,
            @JsonProperty("error") Optional<String> error,
            @JsonProperty("id") String id,
            @JsonProperty("ledgerBalances") Map<String, BigInteger> ledgerBalances,
            @JsonProperty("paymentsBalances") Map<String, BigInteger> paymentsBalances,
            @JsonProperty("policyID") String policyID,
            @JsonProperty("reconciledAtLedger") OffsetDateTime reconciledAtLedger,
            @JsonProperty("reconciledAtPayments") OffsetDateTime reconciledAtPayments,
            @JsonProperty("status") String status) {
        Utils.checkNotNull(createdAt, "createdAt");
        driftBalances = Utils.emptyMapIfNull(driftBalances);
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(id, "id");
        ledgerBalances = Utils.emptyMapIfNull(ledgerBalances);
        paymentsBalances = Utils.emptyMapIfNull(paymentsBalances);
        Utils.checkNotNull(policyID, "policyID");
        Utils.checkNotNull(reconciledAtLedger, "reconciledAtLedger");
        Utils.checkNotNull(reconciledAtPayments, "reconciledAtPayments");
        Utils.checkNotNull(status, "status");
        this.createdAt = createdAt;
        this.driftBalances = driftBalances;
        this.error = error;
        this.id = id;
        this.ledgerBalances = ledgerBalances;
        this.paymentsBalances = paymentsBalances;
        this.policyID = policyID;
        this.reconciledAtLedger = reconciledAtLedger;
        this.reconciledAtPayments = reconciledAtPayments;
        this.status = status;
    }
    
    public Reconciliation(
            OffsetDateTime createdAt,
            Map<String, BigInteger> driftBalances,
            String id,
            Map<String, BigInteger> ledgerBalances,
            Map<String, BigInteger> paymentsBalances,
            String policyID,
            OffsetDateTime reconciledAtLedger,
            OffsetDateTime reconciledAtPayments,
            String status) {
        this(createdAt, driftBalances, Optional.empty(), id, ledgerBalances, paymentsBalances, policyID, reconciledAtLedger, reconciledAtPayments, status);
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Map<String, BigInteger> driftBalances() {
        return driftBalances;
    }

    @JsonIgnore
    public Optional<String> error() {
        return error;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public Map<String, BigInteger> ledgerBalances() {
        return ledgerBalances;
    }

    @JsonIgnore
    public Map<String, BigInteger> paymentsBalances() {
        return paymentsBalances;
    }

    @JsonIgnore
    public String policyID() {
        return policyID;
    }

    @JsonIgnore
    public OffsetDateTime reconciledAtLedger() {
        return reconciledAtLedger;
    }

    @JsonIgnore
    public OffsetDateTime reconciledAtPayments() {
        return reconciledAtPayments;
    }

    @JsonIgnore
    public String status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Reconciliation withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Reconciliation withDriftBalances(Map<String, BigInteger> driftBalances) {
        Utils.checkNotNull(driftBalances, "driftBalances");
        this.driftBalances = driftBalances;
        return this;
    }

    public Reconciliation withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public Reconciliation withError(Optional<String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public Reconciliation withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Reconciliation withLedgerBalances(Map<String, BigInteger> ledgerBalances) {
        Utils.checkNotNull(ledgerBalances, "ledgerBalances");
        this.ledgerBalances = ledgerBalances;
        return this;
    }

    public Reconciliation withPaymentsBalances(Map<String, BigInteger> paymentsBalances) {
        Utils.checkNotNull(paymentsBalances, "paymentsBalances");
        this.paymentsBalances = paymentsBalances;
        return this;
    }

    public Reconciliation withPolicyID(String policyID) {
        Utils.checkNotNull(policyID, "policyID");
        this.policyID = policyID;
        return this;
    }

    public Reconciliation withReconciledAtLedger(OffsetDateTime reconciledAtLedger) {
        Utils.checkNotNull(reconciledAtLedger, "reconciledAtLedger");
        this.reconciledAtLedger = reconciledAtLedger;
        return this;
    }

    public Reconciliation withReconciledAtPayments(OffsetDateTime reconciledAtPayments) {
        Utils.checkNotNull(reconciledAtPayments, "reconciledAtPayments");
        this.reconciledAtPayments = reconciledAtPayments;
        return this;
    }

    public Reconciliation withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        Reconciliation other = (Reconciliation) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.driftBalances, other.driftBalances) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.ledgerBalances, other.ledgerBalances) &&
            Objects.deepEquals(this.paymentsBalances, other.paymentsBalances) &&
            Objects.deepEquals(this.policyID, other.policyID) &&
            Objects.deepEquals(this.reconciledAtLedger, other.reconciledAtLedger) &&
            Objects.deepEquals(this.reconciledAtPayments, other.reconciledAtPayments) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            driftBalances,
            error,
            id,
            ledgerBalances,
            paymentsBalances,
            policyID,
            reconciledAtLedger,
            reconciledAtPayments,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Reconciliation.class,
                "createdAt", createdAt,
                "driftBalances", driftBalances,
                "error", error,
                "id", id,
                "ledgerBalances", ledgerBalances,
                "paymentsBalances", paymentsBalances,
                "policyID", policyID,
                "reconciledAtLedger", reconciledAtLedger,
                "reconciledAtPayments", reconciledAtPayments,
                "status", status);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private Map<String, BigInteger> driftBalances;
 
        private Optional<String> error = Optional.empty();
 
        private String id;
 
        private Map<String, BigInteger> ledgerBalances;
 
        private Map<String, BigInteger> paymentsBalances;
 
        private String policyID;
 
        private OffsetDateTime reconciledAtLedger;
 
        private OffsetDateTime reconciledAtPayments;
 
        private String status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder driftBalances(Map<String, BigInteger> driftBalances) {
            Utils.checkNotNull(driftBalances, "driftBalances");
            this.driftBalances = driftBalances;
            return this;
        }

        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder ledgerBalances(Map<String, BigInteger> ledgerBalances) {
            Utils.checkNotNull(ledgerBalances, "ledgerBalances");
            this.ledgerBalances = ledgerBalances;
            return this;
        }

        public Builder paymentsBalances(Map<String, BigInteger> paymentsBalances) {
            Utils.checkNotNull(paymentsBalances, "paymentsBalances");
            this.paymentsBalances = paymentsBalances;
            return this;
        }

        public Builder policyID(String policyID) {
            Utils.checkNotNull(policyID, "policyID");
            this.policyID = policyID;
            return this;
        }

        public Builder reconciledAtLedger(OffsetDateTime reconciledAtLedger) {
            Utils.checkNotNull(reconciledAtLedger, "reconciledAtLedger");
            this.reconciledAtLedger = reconciledAtLedger;
            return this;
        }

        public Builder reconciledAtPayments(OffsetDateTime reconciledAtPayments) {
            Utils.checkNotNull(reconciledAtPayments, "reconciledAtPayments");
            this.reconciledAtPayments = reconciledAtPayments;
            return this;
        }

        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public Reconciliation build() {
            return new Reconciliation(
                createdAt,
                driftBalances,
                error,
                id,
                ledgerBalances,
                paymentsBalances,
                policyID,
                reconciledAtLedger,
                reconciledAtPayments,
                status);
        }
    }
}

