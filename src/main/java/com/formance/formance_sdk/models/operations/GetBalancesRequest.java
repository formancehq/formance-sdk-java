/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class GetBalancesRequest {

    /**
     * Filter balances involving given account, either as source or destination.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=address")
    private Optional<? extends String> address;

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    private Optional<? extends String> after;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    @JsonCreator
    public GetBalancesRequest(
            Optional<? extends String> address,
            Optional<? extends String> after,
            Optional<? extends String> cursor,
            String ledger,
            Optional<? extends Long> pageSize) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(after, "after");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pageSize, "pageSize");
        this.address = address;
        this.after = after;
        this.cursor = cursor;
        this.ledger = ledger;
        this.pageSize = pageSize;
    }
    
    public GetBalancesRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty());
    }

    /**
     * Filter balances involving given account, either as source or destination.
     */
    @JsonIgnore
    public Optional<? extends String> address() {
        return address;
    }

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    @JsonIgnore
    public Optional<? extends String> after() {
        return after;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @JsonIgnore
    public Optional<? extends String> cursor() {
        return cursor;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    @JsonIgnore
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter balances involving given account, either as source or destination.
     */
    public GetBalancesRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * Filter balances involving given account, either as source or destination.
     */
    public GetBalancesRequest withAddress(Optional<? extends String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    public GetBalancesRequest withAfter(String after) {
        Utils.checkNotNull(after, "after");
        this.after = Optional.ofNullable(after);
        return this;
    }

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    public GetBalancesRequest withAfter(Optional<? extends String> after) {
        Utils.checkNotNull(after, "after");
        this.after = after;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public GetBalancesRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public GetBalancesRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public GetBalancesRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public GetBalancesRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public GetBalancesRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
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
        GetBalancesRequest other = (GetBalancesRequest) o;
        return 
            java.util.Objects.deepEquals(this.address, other.address) &&
            java.util.Objects.deepEquals(this.after, other.after) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            address,
            after,
            cursor,
            ledger,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBalancesRequest.class,
                "address", address,
                "after", after,
                "cursor", cursor,
                "ledger", ledger,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> address = Optional.empty();
 
        private Optional<? extends String> after = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Long> pageSize;  
        
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
         * Pagination cursor, will return accounts after given address, in descending order.
         */
        public Builder after(String after) {
            Utils.checkNotNull(after, "after");
            this.after = Optional.ofNullable(after);
            return this;
        }

        /**
         * Pagination cursor, will return accounts after given address, in descending order.
         */
        public Builder after(Optional<? extends String> after) {
            Utils.checkNotNull(after, "after");
            this.after = after;
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 1000.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 1000.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * 
         */
        public Builder cursor(Optional<? extends String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
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
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The maximum number of results to return per page.
         * 
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }
        
        public GetBalancesRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new GetBalancesRequest(
                address,
                after,
                cursor,
                ledger,
                pageSize);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

