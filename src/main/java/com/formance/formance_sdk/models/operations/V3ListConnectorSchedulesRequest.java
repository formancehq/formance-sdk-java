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
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V3ListConnectorSchedulesRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Map<String, Object>> requestBody;

    /**
     * The connector ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectorID")
    private String connectorID;

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    /**
     * The number of items to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    @JsonCreator
    public V3ListConnectorSchedulesRequest(
            Optional<? extends Map<String, Object>> requestBody,
            String connectorID,
            Optional<String> cursor,
            Optional<Long> pageSize) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        this.requestBody = requestBody;
        this.connectorID = connectorID;
        this.cursor = cursor;
        this.pageSize = pageSize;
    }
    
    public V3ListConnectorSchedulesRequest(
            String connectorID) {
        this(Optional.empty(), connectorID, Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> requestBody() {
        return (Optional<Map<String, Object>>) requestBody;
    }

    /**
     * The connector ID
     */
    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     */
    @JsonIgnore
    public Optional<String> cursor() {
        return cursor;
    }

    /**
     * The number of items to return
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3ListConnectorSchedulesRequest withRequestBody(Map<String, Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V3ListConnectorSchedulesRequest withRequestBody(Optional<? extends Map<String, Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * The connector ID
     */
    public V3ListConnectorSchedulesRequest withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     */
    public V3ListConnectorSchedulesRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     */
    public V3ListConnectorSchedulesRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The number of items to return
     */
    public V3ListConnectorSchedulesRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The number of items to return
     */
    public V3ListConnectorSchedulesRequest withPageSize(Optional<Long> pageSize) {
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
        V3ListConnectorSchedulesRequest other = (V3ListConnectorSchedulesRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            connectorID,
            cursor,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListConnectorSchedulesRequest.class,
                "requestBody", requestBody,
                "connectorID", connectorID,
                "cursor", cursor,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, Object>> requestBody = Optional.empty();
 
        private String connectorID;
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(Map<String, Object> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends Map<String, Object>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * The connector ID
         */
        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }

        /**
         * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
         */
        public Builder cursor(Optional<String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        /**
         * The number of items to return
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * The number of items to return
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }
        
        public V3ListConnectorSchedulesRequest build() {
            return new V3ListConnectorSchedulesRequest(
                requestBody,
                connectorID,
                cursor,
                pageSize);
        }
    }
}
