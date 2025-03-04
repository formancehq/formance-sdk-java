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
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OrchestrationListWalletsResponseCursor {

    @JsonProperty("data")
    private List<OrchestrationWallet> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasMore")
    private Optional<Boolean> hasMore;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<String> next;

    @JsonProperty("pageSize")
    private long pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<String> previous;

    @JsonCreator
    public OrchestrationListWalletsResponseCursor(
            @JsonProperty("data") List<OrchestrationWallet> data,
            @JsonProperty("hasMore") Optional<Boolean> hasMore,
            @JsonProperty("next") Optional<String> next,
            @JsonProperty("pageSize") long pageSize,
            @JsonProperty("previous") Optional<String> previous) {
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
    
    public OrchestrationListWalletsResponseCursor(
            List<OrchestrationWallet> data,
            long pageSize) {
        this(data, Optional.empty(), Optional.empty(), pageSize, Optional.empty());
    }

    @JsonIgnore
    public List<OrchestrationWallet> data() {
        return data;
    }

    @JsonIgnore
    public Optional<Boolean> hasMore() {
        return hasMore;
    }

    @JsonIgnore
    public Optional<String> next() {
        return next;
    }

    @JsonIgnore
    public long pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<String> previous() {
        return previous;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrchestrationListWalletsResponseCursor withData(List<OrchestrationWallet> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public OrchestrationListWalletsResponseCursor withHasMore(boolean hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = Optional.ofNullable(hasMore);
        return this;
    }

    public OrchestrationListWalletsResponseCursor withHasMore(Optional<Boolean> hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = hasMore;
        return this;
    }

    public OrchestrationListWalletsResponseCursor withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public OrchestrationListWalletsResponseCursor withNext(Optional<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public OrchestrationListWalletsResponseCursor withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public OrchestrationListWalletsResponseCursor withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public OrchestrationListWalletsResponseCursor withPrevious(Optional<String> previous) {
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
        OrchestrationListWalletsResponseCursor other = (OrchestrationListWalletsResponseCursor) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.hasMore, other.hasMore) &&
            Objects.deepEquals(this.next, other.next) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.previous, other.previous);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            hasMore,
            next,
            pageSize,
            previous);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrchestrationListWalletsResponseCursor.class,
                "data", data,
                "hasMore", hasMore,
                "next", next,
                "pageSize", pageSize,
                "previous", previous);
    }
    
    public final static class Builder {
 
        private List<OrchestrationWallet> data;
 
        private Optional<Boolean> hasMore = Optional.empty();
 
        private Optional<String> next = Optional.empty();
 
        private Long pageSize;
 
        private Optional<String> previous = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<OrchestrationWallet> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder hasMore(boolean hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = Optional.ofNullable(hasMore);
            return this;
        }

        public Builder hasMore(Optional<Boolean> hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = hasMore;
            return this;
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<String> next) {
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

        public Builder previous(Optional<String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }
        
        public OrchestrationListWalletsResponseCursor build() {
            return new OrchestrationListWalletsResponseCursor(
                data,
                hasMore,
                next,
                pageSize,
                previous);
        }
    }
}

