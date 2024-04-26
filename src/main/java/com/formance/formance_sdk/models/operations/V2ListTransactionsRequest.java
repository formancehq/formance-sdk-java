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
import java.time.OffsetDateTime;
import java.util.Optional;


public class V2ListTransactionsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody;

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends String> cursor;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=expand")
    private Optional<? extends String> expand;

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

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<? extends OffsetDateTime> pit;

    @JsonCreator
    public V2ListTransactionsRequest(
            Optional<? extends java.util.Map<String, java.lang.Object>> requestBody,
            Optional<? extends String> cursor,
            Optional<? extends String> expand,
            String ledger,
            Optional<? extends Long> pageSize,
            Optional<? extends OffsetDateTime> pit) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(expand, "expand");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(pit, "pit");
        this.requestBody = requestBody;
        this.cursor = cursor;
        this.expand = expand;
        this.ledger = ledger;
        this.pageSize = pageSize;
        this.pit = pit;
    }
    
    public V2ListTransactionsRequest(
            String ledger) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), ledger, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends java.util.Map<String, java.lang.Object>> requestBody() {
        return requestBody;
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

    @JsonIgnore
    public Optional<? extends String> expand() {
        return expand;
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
    @JsonIgnore
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> pit() {
        return pit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2ListTransactionsRequest withRequestBody(java.util.Map<String, java.lang.Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2ListTransactionsRequest withRequestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Parameter used in pagination requests. Maximum page size is set to 15.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     * 
     */
    public V2ListTransactionsRequest withCursor(String cursor) {
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
    public V2ListTransactionsRequest withCursor(Optional<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    public V2ListTransactionsRequest withExpand(String expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = Optional.ofNullable(expand);
        return this;
    }

    public V2ListTransactionsRequest withExpand(Optional<? extends String> expand) {
        Utils.checkNotNull(expand, "expand");
        this.expand = expand;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2ListTransactionsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListTransactionsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     * 
     */
    public V2ListTransactionsRequest withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V2ListTransactionsRequest withPit(OffsetDateTime pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = Optional.ofNullable(pit);
        return this;
    }

    public V2ListTransactionsRequest withPit(Optional<? extends OffsetDateTime> pit) {
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
        V2ListTransactionsRequest other = (V2ListTransactionsRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.expand, other.expand) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.pit, other.pit);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            cursor,
            expand,
            ledger,
            pageSize,
            pit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListTransactionsRequest.class,
                "requestBody", requestBody,
                "cursor", cursor,
                "expand", expand,
                "ledger", ledger,
                "pageSize", pageSize,
                "pit", pit);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody = Optional.empty();
 
        private Optional<? extends String> cursor = Optional.empty();
 
        private Optional<? extends String> expand = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends Long> pageSize = Optional.empty();
 
        private Optional<? extends OffsetDateTime> pit = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(java.util.Map<String, java.lang.Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
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

        public Builder expand(String expand) {
            Utils.checkNotNull(expand, "expand");
            this.expand = Optional.ofNullable(expand);
            return this;
        }

        public Builder expand(Optional<? extends String> expand) {
            Utils.checkNotNull(expand, "expand");
            this.expand = expand;
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

        public Builder pit(OffsetDateTime pit) {
            Utils.checkNotNull(pit, "pit");
            this.pit = Optional.ofNullable(pit);
            return this;
        }

        public Builder pit(Optional<? extends OffsetDateTime> pit) {
            Utils.checkNotNull(pit, "pit");
            this.pit = pit;
            return this;
        }
        
        public V2ListTransactionsRequest build() {
            return new V2ListTransactionsRequest(
                requestBody,
                cursor,
                expand,
                ledger,
                pageSize,
                pit);
        }
    }
}

