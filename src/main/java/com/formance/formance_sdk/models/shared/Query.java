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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Query {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("after")
    private Optional<? extends List<String>> after;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cursor")
    private Optional<String> cursor;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledgers")
    private Optional<? extends List<String>> ledgers;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<Long> pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy")
    private Optional<String> policy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw")
    private Optional<? extends QueryRaw> raw;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sort")
    private Optional<String> sort;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("target")
    private Optional<String> target;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terms")
    private Optional<? extends List<String>> terms;

    @JsonCreator
    public Query(
            @JsonProperty("after") Optional<? extends List<String>> after,
            @JsonProperty("cursor") Optional<String> cursor,
            @JsonProperty("ledgers") Optional<? extends List<String>> ledgers,
            @JsonProperty("pageSize") Optional<Long> pageSize,
            @JsonProperty("policy") Optional<String> policy,
            @JsonProperty("raw") Optional<? extends QueryRaw> raw,
            @JsonProperty("sort") Optional<String> sort,
            @JsonProperty("target") Optional<String> target,
            @JsonProperty("terms") Optional<? extends List<String>> terms) {
        Utils.checkNotNull(after, "after");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(ledgers, "ledgers");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(policy, "policy");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(target, "target");
        Utils.checkNotNull(terms, "terms");
        this.after = after;
        this.cursor = cursor;
        this.ledgers = ledgers;
        this.pageSize = pageSize;
        this.policy = policy;
        this.raw = raw;
        this.sort = sort;
        this.target = target;
        this.terms = terms;
    }
    
    public Query() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> after() {
        return (Optional<List<String>>) after;
    }

    @JsonIgnore
    public Optional<String> cursor() {
        return cursor;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> ledgers() {
        return (Optional<List<String>>) ledgers;
    }

    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<String> policy() {
        return policy;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<QueryRaw> raw() {
        return (Optional<QueryRaw>) raw;
    }

    @JsonIgnore
    public Optional<String> sort() {
        return sort;
    }

    @JsonIgnore
    public Optional<String> target() {
        return target;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> terms() {
        return (Optional<List<String>>) terms;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Query withAfter(List<String> after) {
        Utils.checkNotNull(after, "after");
        this.after = Optional.ofNullable(after);
        return this;
    }

    public Query withAfter(Optional<? extends List<String>> after) {
        Utils.checkNotNull(after, "after");
        this.after = after;
        return this;
    }

    public Query withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    public Query withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    public Query withLedgers(List<String> ledgers) {
        Utils.checkNotNull(ledgers, "ledgers");
        this.ledgers = Optional.ofNullable(ledgers);
        return this;
    }

    public Query withLedgers(Optional<? extends List<String>> ledgers) {
        Utils.checkNotNull(ledgers, "ledgers");
        this.ledgers = ledgers;
        return this;
    }

    public Query withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    public Query withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public Query withPolicy(String policy) {
        Utils.checkNotNull(policy, "policy");
        this.policy = Optional.ofNullable(policy);
        return this;
    }

    public Query withPolicy(Optional<String> policy) {
        Utils.checkNotNull(policy, "policy");
        this.policy = policy;
        return this;
    }

    public Query withRaw(QueryRaw raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    public Query withRaw(Optional<? extends QueryRaw> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    public Query withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    public Query withSort(Optional<String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    public Query withTarget(String target) {
        Utils.checkNotNull(target, "target");
        this.target = Optional.ofNullable(target);
        return this;
    }

    public Query withTarget(Optional<String> target) {
        Utils.checkNotNull(target, "target");
        this.target = target;
        return this;
    }

    public Query withTerms(List<String> terms) {
        Utils.checkNotNull(terms, "terms");
        this.terms = Optional.ofNullable(terms);
        return this;
    }

    public Query withTerms(Optional<? extends List<String>> terms) {
        Utils.checkNotNull(terms, "terms");
        this.terms = terms;
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
        Query other = (Query) o;
        return 
            Objects.deepEquals(this.after, other.after) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.ledgers, other.ledgers) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.policy, other.policy) &&
            Objects.deepEquals(this.raw, other.raw) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.target, other.target) &&
            Objects.deepEquals(this.terms, other.terms);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            after,
            cursor,
            ledgers,
            pageSize,
            policy,
            raw,
            sort,
            target,
            terms);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Query.class,
                "after", after,
                "cursor", cursor,
                "ledgers", ledgers,
                "pageSize", pageSize,
                "policy", policy,
                "raw", raw,
                "sort", sort,
                "target", target,
                "terms", terms);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<String>> after = Optional.empty();
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<? extends List<String>> ledgers = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<String> policy = Optional.empty();
 
        private Optional<? extends QueryRaw> raw = Optional.empty();
 
        private Optional<String> sort = Optional.empty();
 
        private Optional<String> target = Optional.empty();
 
        private Optional<? extends List<String>> terms = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder after(List<String> after) {
            Utils.checkNotNull(after, "after");
            this.after = Optional.ofNullable(after);
            return this;
        }

        public Builder after(Optional<? extends List<String>> after) {
            Utils.checkNotNull(after, "after");
            this.after = after;
            return this;
        }

        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        public Builder cursor(Optional<String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        public Builder ledgers(List<String> ledgers) {
            Utils.checkNotNull(ledgers, "ledgers");
            this.ledgers = Optional.ofNullable(ledgers);
            return this;
        }

        public Builder ledgers(Optional<? extends List<String>> ledgers) {
            Utils.checkNotNull(ledgers, "ledgers");
            this.ledgers = ledgers;
            return this;
        }

        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder policy(String policy) {
            Utils.checkNotNull(policy, "policy");
            this.policy = Optional.ofNullable(policy);
            return this;
        }

        public Builder policy(Optional<String> policy) {
            Utils.checkNotNull(policy, "policy");
            this.policy = policy;
            return this;
        }

        public Builder raw(QueryRaw raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        public Builder raw(Optional<? extends QueryRaw> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        public Builder sort(Optional<String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        public Builder target(String target) {
            Utils.checkNotNull(target, "target");
            this.target = Optional.ofNullable(target);
            return this;
        }

        public Builder target(Optional<String> target) {
            Utils.checkNotNull(target, "target");
            this.target = target;
            return this;
        }

        public Builder terms(List<String> terms) {
            Utils.checkNotNull(terms, "terms");
            this.terms = Optional.ofNullable(terms);
            return this;
        }

        public Builder terms(Optional<? extends List<String>> terms) {
            Utils.checkNotNull(terms, "terms");
            this.terms = terms;
            return this;
        }
        
        public Query build() {
            return new Query(
                after,
                cursor,
                ledgers,
                pageSize,
                policy,
                raw,
                sort,
                target,
                terms);
        }
    }
}

