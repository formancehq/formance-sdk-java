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


public class ListLogsRequest {

    /**
     * Pagination cursor, will return the logs after a given ID. (in descending order).
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
     * The maximum number of results to return per page.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=startTime")
    private Optional<? extends OffsetDateTime> startTime;

    @JsonCreator
    public ListLogsRequest(
            Optional<? extends String> after,
            Optional<? extends String> cursor,
            Optional<? extends OffsetDateTime> endTime,
            String ledger,
            Optional<? extends Long> pageSize,
            Optional<? extends OffsetDateTime> startTime) {
        Utils.checkNotNull(after, "after");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(endTime, "endTime");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(startTime, "startTime");
        this.after = after;
        this.cursor = cursor;
        this.endTime = endTime;
        this.ledger = ledger;
        this.pageSize = pageSize;
        this.startTime = startTime;
    }
    
    public ListLogsRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty());
    }

    /**
     * Pagination cursor, will return the logs after a given ID. (in descending order).
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
     * The maximum number of results to return per page.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> pageSize() {
        return (Optional<Long>) pageSize;
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
     * Pagination cursor, will return the logs after a given ID. (in descending order).
     */
    public ListLogsRequest withAfter(String after) {
        Utils.checkNotNull(after, "after");
        this.after = Optional.ofNullable(after);
        return this;
    }

    /**
     * Pagination cursor, will return the logs after a given ID. (in descending order).
     */
    public ListLogsRequest withAfter(Optional<? extends String> after) {
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
    public ListLogsRequest withCursor(String cursor) {
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
    public ListLogsRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    public ListLogsRequest withEndTime(OffsetDateTime endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = Optional.ofNullable(endTime);
        return this;
    }

    /**
     * Filter transactions that occurred before this timestamp.
     * The format is RFC3339 and is exclusive (for example, "2023-01-02T15:04:01Z" excludes the first second of 4th minute).
     * 
     */
    public ListLogsRequest withEndTime(Optional<? extends OffsetDateTime> endTime) {
        Utils.checkNotNull(endTime, "endTime");
        this.endTime = endTime;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public ListLogsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListLogsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public ListLogsRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    public ListLogsRequest withStartTime(OffsetDateTime startTime) {
        Utils.checkNotNull(startTime, "startTime");
        this.startTime = Optional.ofNullable(startTime);
        return this;
    }

    /**
     * Filter transactions that occurred after this timestamp.
     * The format is RFC3339 and is inclusive (for example, "2023-01-02T15:04:01Z" includes the first second of 4th minute).
     * 
     */
    public ListLogsRequest withStartTime(Optional<? extends OffsetDateTime> startTime) {
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
        ListLogsRequest other = (ListLogsRequest) o;
        return 
            java.util.Objects.deepEquals(this.after, other.after) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.endTime, other.endTime) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.startTime, other.startTime);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            after,
            cursor,
            endTime,
            ledger,
            pageSize,
            startTime);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListLogsRequest.class,
                "after", after,
                "cursor", cursor,
                "endTime", endTime,
                "ledger", ledger,
                "pageSize", pageSize,
                "startTime", startTime);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> after = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends OffsetDateTime> endTime = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends OffsetDateTime> startTime = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Pagination cursor, will return the logs after a given ID. (in descending order).
         */
        public Builder after(String after) {
            Utils.checkNotNull(after, "after");
            this.after = Optional.ofNullable(after);
            return this;
        }

        /**
         * Pagination cursor, will return the logs after a given ID. (in descending order).
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
        
        public ListLogsRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            return new ListLogsRequest(
                after,
                cursor,
                endTime,
                ledger,
                pageSize,
                startTime);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "15",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

