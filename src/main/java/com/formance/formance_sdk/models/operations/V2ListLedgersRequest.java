/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class V2ListLedgersRequest {

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

    @JsonCreator
    public V2ListLedgersRequest(
            Optional<? extends String> cursor,
            Optional<? extends Long> pageSize) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        this.cursor = cursor;
        this.pageSize = pageSize;
    }
    
    public V2ListLedgersRequest() {
        this(Optional.empty(), Optional.empty());
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
    public V2ListLedgersRequest withCursor(String cursor) {
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
    public V2ListLedgersRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListLedgersRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListLedgersRequest withPageSize(Optional<? extends Long> pageSize) {
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
        V2ListLedgersRequest other = (V2ListLedgersRequest) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListLedgersRequest.class,
                "cursor", cursor,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends Long> pageSize = Optional.empty();  
        
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
        
        public V2ListLedgersRequest build() {
            return new V2ListLedgersRequest(
                cursor,
                pageSize);
        }
    }
}

