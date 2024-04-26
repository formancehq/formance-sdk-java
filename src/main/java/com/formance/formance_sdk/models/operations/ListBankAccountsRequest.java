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


public class ListBankAccountsRequest {

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * Fields used to sort payments (default is date:desc).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<? extends java.util.List<String>> sort;

    @JsonCreator
    public ListBankAccountsRequest(
            Optional<? extends String> cursor,
            Optional<? extends Long> pageSize,
            Optional<? extends java.util.List<String>> sort) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(sort, "sort");
        this.cursor = cursor;
        this.pageSize = pageSize;
        this.sort = sort;
    }
    
    public ListBankAccountsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
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
     * The maximum number of results to return per page.
     * 
     */
    @JsonIgnore
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    @JsonIgnore
    public Optional<? extends java.util.List<String>> sort() {
        return sort;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public ListBankAccountsRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public ListBankAccountsRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListBankAccountsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListBankAccountsRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public ListBankAccountsRequest withSort(java.util.List<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public ListBankAccountsRequest withSort(Optional<? extends java.util.List<String>> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
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
        ListBankAccountsRequest other = (ListBankAccountsRequest) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.sort, other.sort);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor,
            pageSize,
            sort);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListBankAccountsRequest.class,
                "cursor", cursor,
                "pageSize", pageSize,
                "sort", sort);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends java.util.List<String>> sort = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
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
         * Parameter used in pagination requests. Maximum page size is set to 15.
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

        /**
         * Fields used to sort payments (default is date:desc).
         */
        public Builder sort(java.util.List<String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * Fields used to sort payments (default is date:desc).
         */
        public Builder sort(Optional<? extends java.util.List<String>> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }
        
        public ListBankAccountsRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new ListBankAccountsRequest(
                cursor,
                pageSize,
                sort);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

