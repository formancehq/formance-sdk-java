/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ActivityCreateTransaction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends OrchestrationPostTransaction> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledger")
    private Optional<? extends String> ledger;

    public ActivityCreateTransaction(
            @JsonProperty("data") Optional<? extends OrchestrationPostTransaction> data,
            @JsonProperty("ledger") Optional<? extends String> ledger) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(ledger, "ledger");
        this.data = data;
        this.ledger = ledger;
    }

    public Optional<? extends OrchestrationPostTransaction> data() {
        return data;
    }

    public Optional<? extends String> ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityCreateTransaction withData(OrchestrationPostTransaction data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public ActivityCreateTransaction withData(Optional<? extends OrchestrationPostTransaction> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public ActivityCreateTransaction withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = Optional.ofNullable(ledger);
        return this;
    }

    public ActivityCreateTransaction withLedger(Optional<? extends String> ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
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
        ActivityCreateTransaction other = (ActivityCreateTransaction) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityCreateTransaction.class,
                "data", data,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends OrchestrationPostTransaction> data = Optional.empty();
 
        private Optional<? extends String> ledger = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(OrchestrationPostTransaction data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends OrchestrationPostTransaction> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = Optional.ofNullable(ledger);
            return this;
        }

        public Builder ledger(Optional<? extends String> ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public ActivityCreateTransaction build() {
            return new ActivityCreateTransaction(
                data,
                ledger);
        }
    }
}

