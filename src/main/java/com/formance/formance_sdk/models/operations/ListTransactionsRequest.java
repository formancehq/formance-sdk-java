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
import java.time.OffsetDateTime;
import java.util.Optional;


public class ListTransactionsRequest {

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=account")
    private Optional<? extends String> account;

    /**
     * Pagination cursor, will return transactions after given txid (in descending order).
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
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=destination")
    private Optional<? extends String> destination;

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endTime")
    private Optional<? extends OffsetDateTime> endTime;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    private Optional<? extends java.util.Map<String, java.lang.Object>> metadata;

    /**
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * Find transactions by reference field.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reference")
    private Optional<? extends String> reference;

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    private Optional<? extends String> source;

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    private Optional<? extends OffsetDateTime> startTime;

    @JsonCreator
    public ListTransactionsRequest(
            Optional<? extends String> account,
            Optional<? extends String> after,
            Optional<? extends String> cursor,
            Optional<? extends String> destination,
            Optional<? extends OffsetDateTime> endTime,
            String ledger,
            Optional<? extends java.util.Map<String, java.lang.Object>> metadata,
            Optional<? extends Long> pageSize,
            Optional<? extends String> reference,
            Optional<? extends String> source,
            Optional<? extends OffsetDateTime> startTime) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(after, "after");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(endTime, "endTime");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(startTime, "startTime");
        this.account = account;
        this.after = after;
        this.cursor = cursor;
        this.destination = destination;
        this.endTime = endTime;
        this.ledger = ledger;
        this.metadata = metadata;
        this.pageSize = pageSize;
        this.reference = reference;
        this.source = source;
        this.startTime = startTime;
    }
    
    public ListTransactionsRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> account() {
        return (Optional<String>) account;
    }

    /**
     * Pagination cursor, will return transactions after given txid (in descending order).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> after() {
        return (Optional<String>) after;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 1000.
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
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> destination() {
        return (Optional<String>) destination;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> endTime() {
        return (Optional<OffsetDateTime>) endTime;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.lang.Object>> metadata() {
        return (Optional<java.util.Map<String, java.lang.Object>>) metadata;
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
     * Find transactions by reference field.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> reference() {
        return (Optional<String>) reference;
    }

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> source() {
        return (Optional<String>) source;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startTime() {
        return (Optional<OffsetDateTime>) startTime;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    public ListTransactionsRequest withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    /**
     * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
     */
    public ListTransactionsRequest withAccount(Optional<? extends String> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * Pagination cursor, will return transactions after given txid (in descending order).
     */
    public ListTransactionsRequest withAfter(String after) {
        Utils.checkNotNull(after, "after");
        this.after = Optional.ofNullable(after);
        return this;
    }

    /**
     * Pagination cursor, will return transactions after given txid (in descending order).
     */
    public ListTransactionsRequest withAfter(Optional<? extends String> after) {
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
    public ListTransactionsRequest withCursor(String cursor) {
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
    public ListTransactionsRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    public ListTransactionsRequest withDestination(String destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }

    /**
     * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
     */
    public ListTransactionsRequest withDestination(Optional<? extends String> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    public ListTransactionsRequest withEndTime(OffsetDateTime endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = Optional.ofNullable(endTime);
        return this;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    public ListTransactionsRequest withEndTime(Optional<? extends OffsetDateTime> endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = endTime;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public ListTransactionsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    public ListTransactionsRequest withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
     */
    public ListTransactionsRequest withMetadata(Optional<? extends java.util.Map<String, java.lang.Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListTransactionsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListTransactionsRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Find transactions by reference field.
     */
    public ListTransactionsRequest withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    /**
     * Find transactions by reference field.
     */
    public ListTransactionsRequest withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    public ListTransactionsRequest withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
     */
    public ListTransactionsRequest withSource(Optional<? extends String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    public ListTransactionsRequest withStartTime(OffsetDateTime startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    public ListTransactionsRequest withStartTime(Optional<? extends OffsetDateTime> startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = startTime;
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
        ListTransactionsRequest other = (ListTransactionsRequest) o;
        return 
            java.util.Objects.deepEquals(this.account, other.account) &&
            java.util.Objects.deepEquals(this.after, other.after) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.destination, other.destination) &&
            java.util.Objects.deepEquals(this.endTime, other.endTime) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.source, other.source) &&
            java.util.Objects.deepEquals(this.startTime, other.startTime);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            account,
            after,
            cursor,
            destination,
            endTime,
            ledger,
            metadata,
            pageSize,
            reference,
            source,
            startTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTransactionsRequest.class,
                "account", account,
                "after", after,
                "cursor", cursor,
                "destination", destination,
                "endTime", endTime,
                "ledger", ledger,
                "metadata", metadata,
                "pageSize", pageSize,
                "reference", reference,
                "source", source,
                "startTime", startTime);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> account = Optional.empty();
 
        private Optional<? extends String> after = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends String> destination = Optional.empty();
 
        private Optional<? extends OffsetDateTime> endTime = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> metadata = Optional.empty();
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends String> reference = Optional.empty();
 
        private Optional<? extends String> source = Optional.empty();
 
        private Optional<? extends OffsetDateTime> startTime = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
         */
        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        /**
         * Filter transactions with postings involving given account, either as source or destination (regular expression placed between ^ and $).
         */
        public Builder account(Optional<? extends String> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        /**
         * Pagination cursor, will return transactions after given txid (in descending order).
         */
        public Builder after(String after) {
            Utils.checkNotNull(after, "after");
            this.after = Optional.ofNullable(after);
            return this;
        }

        /**
         * Pagination cursor, will return transactions after given txid (in descending order).
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
         * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
         */
        public Builder destination(String destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        /**
         * Filter transactions with postings involving given account at destination (regular expression placed between ^ and $).
         */
        public Builder destination(Optional<? extends String> destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        /**
         * Filter transactions that occurred before this timestamp.
         * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
         * 
         */
        public Builder endTime(OffsetDateTime endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = Optional.ofNullable(endTime);
            return this;
        }

        /**
         * Filter transactions that occurred before this timestamp.
         * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
         * 
         */
        public Builder endTime(Optional<? extends OffsetDateTime> endTime) {
            Utils.checkNotNull(endTime, "endTime");
            this.endTime = endTime;
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
         * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
         */
        public Builder metadata(java.util.Map<String, java.lang.Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Filter transactions by metadata key value pairs. Nested objects can be used as seen in the example below.
         */
        public Builder metadata(Optional<? extends java.util.Map<String, java.lang.Object>> metadata) {
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
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Find transactions by reference field.
         */
        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        /**
         * Find transactions by reference field.
         */
        public Builder reference(Optional<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        /**
         * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        /**
         * Filter transactions with postings involving given account at source (regular expression placed between ^ and $).
         */
        public Builder source(Optional<? extends String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * Filter transactions that occurred after this timestamp.
         * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
         * 
         */
        public Builder startTime(OffsetDateTime startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = Optional.ofNullable(startTime);
            return this;
        }

        /**
         * Filter transactions that occurred after this timestamp.
         * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
         * 
         */
        public Builder startTime(Optional<? extends OffsetDateTime> startTime) {
            Utils.checkNotNull(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }
        
        public ListTransactionsRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new ListTransactionsRequest(
                account,
                after,
                cursor,
                destination,
                endTime,
                ledger,
                metadata,
                pageSize,
                reference,
                source,
                startTime);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

