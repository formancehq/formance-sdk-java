/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class GetBalancesAggregatedRequest {

    /**
     * Filter balances involving given account, either as source or destination.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=address")
    private Optional<? extends String> address;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Use insertion date instead of effective date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=useInsertionDate")
    private Optional<? extends Boolean> useInsertionDate;

    @JsonCreator
    public GetBalancesAggregatedRequest(
            Optional<? extends String> address,
            String ledger,
            Optional<? extends Boolean> useInsertionDate) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(useInsertionDate, "useInsertionDate");
        this.address = address;
        this.ledger = ledger;
        this.useInsertionDate = useInsertionDate;
    }
    
    public GetBalancesAggregatedRequest(
            String ledger) {
        this(Optional.empty(), ledger, Optional.empty());
    }

    /**
     * Filter balances involving given account, either as source or destination.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> address() {
        return (Optional<String>) address;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Use insertion date instead of effective date
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> useInsertionDate() {
        return (Optional<Boolean>) useInsertionDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter balances involving given account, either as source or destination.
     */
    public GetBalancesAggregatedRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * Filter balances involving given account, either as source or destination.
     */
    public GetBalancesAggregatedRequest withAddress(Optional<? extends String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public GetBalancesAggregatedRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Use insertion date instead of effective date
     */
    public GetBalancesAggregatedRequest withUseInsertionDate(boolean useInsertionDate) {
        Utils.checkNotNull(useInsertionDate, "useInsertionDate");
        this.useInsertionDate = Optional.ofNullable(useInsertionDate);
        return this;
    }

    /**
     * Use insertion date instead of effective date
     */
    public GetBalancesAggregatedRequest withUseInsertionDate(Optional<? extends Boolean> useInsertionDate) {
        Utils.checkNotNull(useInsertionDate, "useInsertionDate");
        this.useInsertionDate = useInsertionDate;
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
        GetBalancesAggregatedRequest other = (GetBalancesAggregatedRequest) o;
        return 
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.useInsertionDate, other.useInsertionDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            address,
            ledger,
            useInsertionDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBalancesAggregatedRequest.class,
                "address", address,
                "ledger", ledger,
                "useInsertionDate", useInsertionDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> address = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Boolean> useInsertionDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter balances involving given account, either as source or destination.
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        /**
         * Filter balances involving given account, either as source or destination.
         */
        public Builder address(Optional<? extends String> address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Use insertion date instead of effective date
         */
        public Builder useInsertionDate(boolean useInsertionDate) {
            Utils.checkNotNull(useInsertionDate, "useInsertionDate");
            this.useInsertionDate = Optional.ofNullable(useInsertionDate);
            return this;
        }

        /**
         * Use insertion date instead of effective date
         */
        public Builder useInsertionDate(Optional<? extends Boolean> useInsertionDate) {
            Utils.checkNotNull(useInsertionDate, "useInsertionDate");
            this.useInsertionDate = useInsertionDate;
            return this;
        }
        
        public GetBalancesAggregatedRequest build() {
            return new GetBalancesAggregatedRequest(
                address,
                ledger,
                useInsertionDate);
        }
    }
}

