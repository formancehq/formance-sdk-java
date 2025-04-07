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

public class V2ListTriggersRequest {

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<String> cursor;

    /**
     * search by name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=name")
    private Optional<String> name;

    /**
     * The maximum number of results to return per page.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    @JsonCreator
    public V2ListTriggersRequest(
            Optional<String> cursor,
            Optional<String> name,
            Optional<Long> pageSize) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pageSize, "pageSize");
        this.cursor = cursor;
        this.name = name;
        this.pageSize = pageSize;
    }
    
    public V2ListTriggersRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    @JsonIgnore
    public Optional<String> cursor() {
        return cursor;
    }

    /**
     * search by name
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * The maximum number of results to return per page.
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    public V2ListTriggersRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests.
     * Set to the value of next for the next page of results.
     * Set to the value of previous for the previous page of results.
     * No other parameters can be set when this parameter is set.
     */
    public V2ListTriggersRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * search by name
     */
    public V2ListTriggersRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * search by name
     */
    public V2ListTriggersRequest withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The maximum number of results to return per page.
     */
    public V2ListTriggersRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The maximum number of results to return per page.
     */
    public V2ListTriggersRequest withPageSize(Optional<Long> pageSize) {
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
        V2ListTriggersRequest other = (V2ListTriggersRequest) o;
        return 
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pageSize, other.pageSize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cursor,
            name,
            pageSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ListTriggersRequest.class,
                "cursor", cursor,
                "name", name,
                "pageSize", pageSize);
    }
    
    public final static class Builder {
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Parameter used in pagination requests.
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
         * Parameter used in pagination requests.
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
         * search by name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * search by name
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
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
        
        public V2ListTriggersRequest build() {
            return new V2ListTriggersRequest(
                cursor,
                name,
                pageSize);
        }
    }
}
