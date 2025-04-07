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

public class V3ListPaymentInitiationRelatedPaymentsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Map<String, Object>> requestBody;

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

    /**
     * The payment initiation ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentInitiationID")
    private String paymentInitiationID;

    @JsonCreator
    public V3ListPaymentInitiationRelatedPaymentsRequest(
            Optional<? extends Map<String, Object>> requestBody,
            Optional<String> cursor,
            Optional<Long> pageSize,
            String paymentInitiationID) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(paymentInitiationID, "paymentInitiationID");
        this.requestBody = requestBody;
        this.cursor = cursor;
        this.pageSize = pageSize;
        this.paymentInitiationID = paymentInitiationID;
    }
    
    public V3ListPaymentInitiationRelatedPaymentsRequest(
            String paymentInitiationID) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), paymentInitiationID);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> requestBody() {
        return (Optional<Map<String, Object>>) requestBody;
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

    /**
     * The payment initiation ID
     */
    @JsonIgnore
    public String paymentInitiationID() {
        return paymentInitiationID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3ListPaymentInitiationRelatedPaymentsRequest withRequestBody(Map<String, Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V3ListPaymentInitiationRelatedPaymentsRequest withRequestBody(Optional<? extends Map<String, Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     */
    public V3ListPaymentInitiationRelatedPaymentsRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * Parameter used in pagination requests. Set to the value of next for the next page of results. Set to the value of previous for the previous page of results. No other parameters can be set when this parameter is set.
     */
    public V3ListPaymentInitiationRelatedPaymentsRequest withCursor(Optional<String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The number of items to return
     */
    public V3ListPaymentInitiationRelatedPaymentsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * The number of items to return
     */
    public V3ListPaymentInitiationRelatedPaymentsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The payment initiation ID
     */
    public V3ListPaymentInitiationRelatedPaymentsRequest withPaymentInitiationID(String paymentInitiationID) {
        Utils.checkNotNull(paymentInitiationID, "paymentInitiationID");
        this.paymentInitiationID = paymentInitiationID;
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
        V3ListPaymentInitiationRelatedPaymentsRequest other = (V3ListPaymentInitiationRelatedPaymentsRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.cursor, other.cursor) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.paymentInitiationID, other.paymentInitiationID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            cursor,
            pageSize,
            paymentInitiationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ListPaymentInitiationRelatedPaymentsRequest.class,
                "requestBody", requestBody,
                "cursor", cursor,
                "pageSize", pageSize,
                "paymentInitiationID", paymentInitiationID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, Object>> requestBody = Optional.empty();
 
        private Optional<String> cursor = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        private String paymentInitiationID;
        
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

        /**
         * The payment initiation ID
         */
        public Builder paymentInitiationID(String paymentInitiationID) {
            Utils.checkNotNull(paymentInitiationID, "paymentInitiationID");
            this.paymentInitiationID = paymentInitiationID;
            return this;
        }
        
        public V3ListPaymentInitiationRelatedPaymentsRequest build() {
            return new V3ListPaymentInitiationRelatedPaymentsRequest(
                requestBody,
                cursor,
                pageSize,
                paymentInitiationID);
        }
    }
}
