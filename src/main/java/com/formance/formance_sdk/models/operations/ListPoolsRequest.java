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


public class ListPoolsRequest {

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
     * Filters used to filter resources.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    private Optional<? extends String> query;

    /**
     * Fields used to sort payments (default is date:desc).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<? extends java.util.List<String>> sort;

    @JsonCreator
    public ListPoolsRequest(
            Optional<? extends String> cursor,
            Optional<? extends Long> pageSize,
            Optional<? extends String> query,
            Optional<? extends java.util.List<String>> sort) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(query, "query");
        Utils.checkNotNull(sort, "sort");
        this.cursor = cursor;
        this.pageSize = pageSize;
        this.query = query;
        this.sort = sort;
    }
    
    public ListPoolsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> cursor() {
        return (Optional<String>) cursor;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> pageSize() {
        return (Optional<Long>) pageSize;
    }

    /**
     * Filters used to filter resources.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> query() {
        return (Optional<String>) query;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> sort() {
        return (Optional<java.util.List<String>>) sort;
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
    public ListPoolsRequest withCursor(String cursor) {
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
    public ListPoolsRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListPoolsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListPoolsRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Filters used to filter resources.
     * 
     */
    public ListPoolsRequest withQuery(String query) {
        Utils.checkNotNull(query, "query");
        this.query = Optional.ofNullable(query);
        return this;
    }

    /**
     * Filters used to filter resources.
     * 
     */
    public ListPoolsRequest withQuery(Optional<? extends String> query) {
        Utils.checkNotNull(query, "query");
        this.query = query;
        return this;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public ListPoolsRequest withSort(java.util.List<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * Fields used to sort payments (default is date:desc).
     */
    public ListPoolsRequest withSort(Optional<? extends java.util.List<String>> sort) {
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
        ListPoolsRequest other = (ListPoolsRequest) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.query, other.query) &&
            java.util.Objects.deepEquals(this.sort, other.sort);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor,
            pageSize,
            query,
            sort);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListPoolsRequest.class,
                "cursor", cursor,
                "pageSize", pageSize,
                "query", query,
                "sort", sort);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends String> query = Optional.empty();
 
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
         * Filters used to filter resources.
         * 
         */
        public Builder query(String query) {
            Utils.checkNotNull(query, "query");
            this.query = Optional.ofNullable(query);
            return this;
        }

        /**
         * Filters used to filter resources.
         * 
         */
        public Builder query(Optional<? extends String> query) {
            Utils.checkNotNull(query, "query");
            this.query = query;
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
        
        public ListPoolsRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new ListPoolsRequest(
                cursor,
                pageSize,
                query,
                sort);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

