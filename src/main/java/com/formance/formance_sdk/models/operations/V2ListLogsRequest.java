/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2ListLogsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Map<String, Object> requestBody;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * The maximum number of results to return per page.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<OffsetDateTime> pit;

    @JsonCreator
    public V2ListLogsRequest(
            Map<String, Object> requestBody,
            Optional<String> cursor,
            String ledger,
            Optional<Long> pageSize,
            Optional<OffsetDateTime> pit) {
        requestBody = Utils.emptyMapIfNull(requestBody);
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(pit, "pit");
        this.requestBody = requestBody;
        this.cursor = cursor;
        this.ledger = ledger;
        this.pageSize = pageSize;
        this.pit = pit;
    }
    
    public V2ListLogsRequest(
            Map<String, Object> requestBody,
            String ledger) {
        this(requestBody, Optional.empty(), ledger, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Map<String, Object> requestBody() {
        return requestBody;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
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
     * The maximum number of results to return per page.
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> pit() {
        return pit;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2ListLogsRequest withRequestBody(Map<String, Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    public V2ListLogsRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    public V2ListLogsRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2ListLogsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     */
    public V2ListLogsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     */
    public V2ListLogsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V2ListLogsRequest withPit(OffsetDateTime pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = Optional.ofNullable(pit);
        return this;
    }

    public V2ListLogsRequest withPit(Optional<OffsetDateTime> pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = pit;
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
        V2ListLogsRequest other = (V2ListLogsRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.pit, other.pit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            cursor,
            ledger,
            pageSize,
            pit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListLogsRequest.class,
                "requestBody", requestBody,
                "cursor", cursor,
                "ledger", ledger,
                "pageSize", pageSize,
                "pit", pit);
    }
    
    public final static class Builder {
 
        private Map<String, Object> requestBody;
 
        private Optional<String> cursor = Optional.empty();
 
        private String ledger;
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<OffsetDateTime> pit = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(Map<String, Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Parameter used in pagination requests. Maximum page size is set to 15.
         * Set to the value of next for the next page of results.
         * Set to the value of previous for the previous page of results.
         * No other parameters can be set when this parameter is set.
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
         * The maximum number of results to return per page.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The maximum number of results to return per page.
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder pit(OffsetDateTime pit) {
            Utils.checkNotNull(pit, "pit");
            this.pit = Optional.ofNullable(pit);
            return this;
        }

        public Builder pit(Optional<OffsetDateTime> pit) {
            Utils.checkNotNull(pit, "pit");
            this.pit = pit;
            return this;
        }
        
        public V2ListLogsRequest build() {
            return new V2ListLogsRequest(
                requestBody,
                cursor,
                ledger,
                pageSize,
                pit);
        }
    }
}
