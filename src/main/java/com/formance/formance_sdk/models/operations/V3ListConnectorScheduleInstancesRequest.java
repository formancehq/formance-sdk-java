/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class V3ListConnectorScheduleInstancesRequest {

    /**
     * The connector ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectorID")
    private String connectorID;

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    /**
     * The number of items to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    /**
     * The schedule ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scheduleID")
    private String scheduleID;

    @JsonCreator
    public V3ListConnectorScheduleInstancesRequest(
            String connectorID,
            Optional<String> cursor,
            Optional<Long> pageSize,
            String scheduleID) {
        Utils.checkNotNull(connectorID, "connectorID");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.connectorID = connectorID;
        this.cursor = cursor;
        this.pageSize = pageSize;
        this.scheduleID = scheduleID;
    }
    
    public V3ListConnectorScheduleInstancesRequest(
            String connectorID,
            String scheduleID) {
        this(connectorID, Optional.empty(), Optional.empty(), scheduleID);
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
     * 
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

    /**
     * The schedule ID
     */
    @JsonIgnore
    public String scheduleID() {
        return scheduleID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The connector ID
     */
    public V3ListConnectorScheduleInstancesRequest withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
        return this;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     * 
     */
    public V3ListConnectorScheduleInstancesRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     * 
     */
    public V3ListConnectorScheduleInstancesRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The number of items to return
     */
    public V3ListConnectorScheduleInstancesRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The number of items to return
     */
    public V3ListConnectorScheduleInstancesRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The schedule ID
     */
    public V3ListConnectorScheduleInstancesRequest withScheduleID(String scheduleID) {
        Utils.checkNotNull(scheduleID, "scheduleID");
        this.scheduleID = scheduleID;
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
        V3ListConnectorScheduleInstancesRequest other = (V3ListConnectorScheduleInstancesRequest) o;
        return 
            Objects.deepEquals(this.connectorID, other.connectorID) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.scheduleID, other.scheduleID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectorID,
            cursor,
            pageSize,
            scheduleID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListConnectorScheduleInstancesRequest.class,
                "connectorID", connectorID,
                "cursor", cursor,
                "pageSize", pageSize,
                "scheduleID", scheduleID);
    }
    
    public final static class Builder {
 
        private String connectorID;
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        private String scheduleID;  
        
        private Builder() {
          // force use of static builder() method
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
         * 
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
         * 
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

        /**
         * The schedule ID
         */
        public Builder scheduleID(String scheduleID) {
            Utils.checkNotNull(scheduleID, "scheduleID");
            this.scheduleID = scheduleID;
            return this;
        }
        
        public V3ListConnectorScheduleInstancesRequest build() {
            return new V3ListConnectorScheduleInstancesRequest(
                connectorID,
                cursor,
                pageSize,
                scheduleID);
        }
    }
}

