/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


public class BalancesCursorCursor {

    @JsonProperty("data")
    private java.util.List<AccountBalance> data;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<? extends String> next;

    @JsonProperty("pageSize")
    private long pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<? extends String> previous;

    @JsonCreator
    public BalancesCursorCursor(
            @JsonProperty("data") java.util.List<AccountBalance> data,
            @JsonProperty("hasMore") boolean hasMore,
            @JsonProperty("next") Optional<? extends String> next,
            @JsonProperty("pageSize") long pageSize,
            @JsonProperty("previous") Optional<? extends String> previous) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(hasMore, "hasMore");
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(previous, "previous");
        this.data = data;
        this.hasMore = hasMore;
        this.next = next;
        this.pageSize = pageSize;
        this.previous = previous;
    }
    
    public BalancesCursorCursor(
            java.util.List<AccountBalance> data,
            boolean hasMore,
            long pageSize) {
        this(data, hasMore, Optional.empty(), pageSize, Optional.empty());
    }

    @JsonIgnore
    public java.util.List<AccountBalance> data() {
        return data;
    }

    @JsonIgnore
    public boolean hasMore() {
        return hasMore;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> next() {
        return (Optional<String>) next;
    }

    @JsonIgnore
    public long pageSize() {
        return pageSize;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> previous() {
        return (Optional<String>) previous;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BalancesCursorCursor withData(java.util.List<AccountBalance> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public BalancesCursorCursor withHasMore(boolean hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = hasMore;
        return this;
    }

    public BalancesCursorCursor withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public BalancesCursorCursor withNext(Optional<? extends String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public BalancesCursorCursor withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public BalancesCursorCursor withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public BalancesCursorCursor withPrevious(Optional<? extends String> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
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
        BalancesCursorCursor other = (BalancesCursorCursor) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.hasMore, other.hasMore) &&
            java.util.Objects.deepEquals(this.next, other.next) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.previous, other.previous);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            hasMore,
            next,
            pageSize,
            previous);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BalancesCursorCursor.class,
                "data", data,
                "hasMore", hasMore,
                "next", next,
                "pageSize", pageSize,
                "previous", previous);
    }
    
    public final static class Builder {
 
        private java.util.List<AccountBalance> data;
 
        private Boolean hasMore;
 
        private Optional<? extends String> next = Optional.empty();
 
        private Long pageSize;
 
        private Optional<? extends String> previous = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<AccountBalance> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder hasMore(boolean hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = hasMore;
            return this;
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<? extends String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder previous(String previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = Optional.ofNullable(previous);
            return this;
        }

        public Builder previous(Optional<? extends String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }
        
        public BalancesCursorCursor build() {
            return new BalancesCursorCursor(
                data,
                hasMore,
                next,
                pageSize,
                previous);
        }
    }
}

