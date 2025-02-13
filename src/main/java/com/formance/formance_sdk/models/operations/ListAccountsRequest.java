/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Deprecated;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class ListAccountsRequest {

    /**
     * Filter accounts by address pattern (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=address")
    private Optional<String> address;

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after")
    private Optional<String> after;

    /**
     * Filter accounts by their balance (default operator is gte)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=balance")
    private Optional<Long> balance;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    private Optional<? extends Map<String, Object>> metadata;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * Deprecated, please use `cursor` instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pagination_token")
    @Deprecated
    private Optional<String> paginationToken;

    @JsonCreator
    public ListAccountsRequest(
            Optional<String> address,
            Optional<String> after,
            Optional<Long> balance,
            Optional<String> cursor,
            String ledger,
            Optional<? extends Map<String, Object>> metadata,
            Optional<Long> pageSize,
            Optional<String> paginationToken) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(after, "after");
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(paginationToken, "paginationToken");
        this.address = address;
        this.after = after;
        this.balance = balance;
        this.cursor = cursor;
        this.ledger = ledger;
        this.metadata = metadata;
        this.pageSize = pageSize;
        this.paginationToken = paginationToken;
    }
    
    public ListAccountsRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter accounts by address pattern (regular expression placed between ^ and $).
     */
    @JsonIgnore
    public Optional<String> address() {
        return address;
    }

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    @JsonIgnore
    public Optional<String> after() {
        return after;
    }

    /**
     * Filter accounts by their balance (default operator is gte)
     */
    @JsonIgnore
    public Optional<Long> balance() {
        return balance;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @JsonIgnore
    public Optional<String> cursor() {
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
     * Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> metadata() {
        return (Optional<Map<String, Object>>) metadata;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * Deprecated, please use `cursor` instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    @JsonIgnore
    public Optional<String> paginationToken() {
        return paginationToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter accounts by address pattern (regular expression placed between ^ and $).
     */
    public ListAccountsRequest withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = Optional.ofNullable(address);
        return this;
    }

    /**
     * Filter accounts by address pattern (regular expression placed between ^ and $).
     */
    public ListAccountsRequest withAddress(Optional<String> address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    public ListAccountsRequest withAfter(String after) {
        Utils.checkNotNull(after, "after");
        this.after = Optional.ofNullable(after);
        return this;
    }

    /**
     * Pagination cursor, will return accounts after given address, in descending order.
     */
    public ListAccountsRequest withAfter(Optional<String> after) {
        Utils.checkNotNull(after, "after");
        this.after = after;
        return this;
    }

    /**
     * Filter accounts by their balance (default operator is gte)
     */
    public ListAccountsRequest withBalance(long balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    /**
     * Filter accounts by their balance (default operator is gte)
     */
    public ListAccountsRequest withBalance(Optional<Long> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public ListAccountsRequest withCursor(String cursor) {
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
    public ListAccountsRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public ListAccountsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    public ListAccountsRequest withMetadata(Map<String, Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    public ListAccountsRequest withMetadata(Optional<? extends Map<String, Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListAccountsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListAccountsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * Deprecated, please use `cursor` instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListAccountsRequest withPaginationToken(String paginationToken) {
        Utils.checkNotNull(paginationToken, "paginationToken");
        this.paginationToken = Optional.ofNullable(paginationToken);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * Deprecated, please use `cursor` instead.
     * 
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @Deprecated
    public ListAccountsRequest withPaginationToken(Optional<String> paginationToken) {
        Utils.checkNotNull(paginationToken, "paginationToken");
        this.paginationToken = paginationToken;
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
        ListAccountsRequest other = (ListAccountsRequest) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.after, other.after) &&
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.paginationToken, other.paginationToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            after,
            balance,
            cursor,
            ledger,
            metadata,
            pageSize,
            paginationToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAccountsRequest.class,
                "address", address,
                "after", after,
                "balance", balance,
                "cursor", cursor,
                "ledger", ledger,
                "metadata", metadata,
                "pageSize", pageSize,
                "paginationToken", paginationToken);
    }
    
    public final static class Builder {
 
        private Optional<String> address = Optional.empty();
 
        private Optional<String> after = Optional.empty();
 
        private Optional<Long> balance = Optional.empty();
 
        private Optional<String> cursor = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Map<String, Object>> metadata = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        @Deprecated
        private Optional<String> paginationToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter accounts by address pattern (regular expression placed between ^ and $).
         */
        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = Optional.ofNullable(address);
            return this;
        }

        /**
         * Filter accounts by address pattern (regular expression placed between ^ and $).
         */
        public Builder address(Optional<String> address) {
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
        public Builder after(Optional<String> after) {
            Utils.checkNotNull(after, "after");
            this.after = after;
            return this;
        }

        /**
         * Filter accounts by their balance (default operator is gte)
         */
        public Builder balance(long balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        /**
         * Filter accounts by their balance (default operator is gte)
         */
        public Builder balance(Optional<Long> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
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
        public Builder cursor(Optional<String> cursor) {
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
         * Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
         */
        public Builder metadata(Map<String, Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
         */
        public Builder metadata(Optional<? extends Map<String, Object>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
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
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 1000.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * Deprecated, please use `cursor` instead.
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder paginationToken(String paginationToken) {
            Utils.checkNotNull(paginationToken, "paginationToken");
            this.paginationToken = Optional.ofNullable(paginationToken);
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 1000.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
         * Deprecated, please use `cursor` instead.
         * 
         * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
         */
        @Deprecated
        public Builder paginationToken(Optional<String> paginationToken) {
            Utils.checkNotNull(paginationToken, "paginationToken");
            this.paginationToken = paginationToken;
            return this;
        }
        
        public ListAccountsRequest build() {
            return new ListAccountsRequest(
                address,
                after,
                balance,
                cursor,
                ledger,
                metadata,
                pageSize,
                paginationToken);
        }
    }
}

