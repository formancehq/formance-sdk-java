/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class OrchestrationPaymentAdjustment {

    @JsonProperty("absolute")
    private boolean absolute;

    @JsonProperty("amount")
    private BigInteger amount;

    @JsonProperty("date")
    private OffsetDateTime date;

    @JsonProperty("raw")
    private OrchestrationPaymentAdjustmentRaw raw;

    @JsonProperty("status")
    private OrchestrationPaymentStatus status;

    @JsonCreator
    public OrchestrationPaymentAdjustment(
            @JsonProperty("absolute") boolean absolute,
            @JsonProperty("amount") BigInteger amount,
            @JsonProperty("date") OffsetDateTime date,
            @JsonProperty("raw") OrchestrationPaymentAdjustmentRaw raw,
            @JsonProperty("status") OrchestrationPaymentStatus status) {
        Utils.checkNotNull(absolute, "absolute");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(status, "status");
        this.absolute = absolute;
        this.amount = amount;
        this.date = date;
        this.raw = raw;
        this.status = status;
    }

    @JsonIgnore
    public boolean absolute() {
        return absolute;
    }

    @JsonIgnore
    public BigInteger amount() {
        return amount;
    }

    @JsonIgnore
    public OffsetDateTime date() {
        return date;
    }

    @JsonIgnore
    public OrchestrationPaymentAdjustmentRaw raw() {
        return raw;
    }

    @JsonIgnore
    public OrchestrationPaymentStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrchestrationPaymentAdjustment withAbsolute(boolean absolute) {
        Utils.checkNotNull(absolute, "absolute");
        this.absolute = absolute;
        return this;
    }

    public OrchestrationPaymentAdjustment withAmount(long amount) {
        this.amount = BigInteger.valueOf(amount);
        return this;
    }

    public OrchestrationPaymentAdjustment withAmount(BigInteger amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public OrchestrationPaymentAdjustment withDate(OffsetDateTime date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public OrchestrationPaymentAdjustment withRaw(OrchestrationPaymentAdjustmentRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public OrchestrationPaymentAdjustment withStatus(OrchestrationPaymentStatus status) {
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
        OrchestrationPaymentAdjustment other = (OrchestrationPaymentAdjustment) o;
        return 
            java.util.Objects.deepEquals(this.absolute, other.absolute) &&
            java.util.Objects.deepEquals(this.amount, other.amount) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            absolute,
            amount,
            date,
            raw,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrchestrationPaymentAdjustment.class,
                "absolute", absolute,
                "amount", amount,
                "date", date,
                "raw", raw,
                "status", status);
    }
    
    public final static class Builder {
 
        private Boolean absolute;
 
        private BigInteger amount;
 
        private OffsetDateTime date;
 
        private OrchestrationPaymentAdjustmentRaw raw;
 
        private OrchestrationPaymentStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder absolute(boolean absolute) {
            Utils.checkNotNull(absolute, "absolute");
            this.absolute = absolute;
            return this;
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

        public Builder date(OffsetDateTime date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        public Builder raw(OrchestrationPaymentAdjustmentRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder status(OrchestrationPaymentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public OrchestrationPaymentAdjustment build() {
            return new OrchestrationPaymentAdjustment(
                absolute,
                amount,
                date,
                raw,
                status);
        }
    }
}

