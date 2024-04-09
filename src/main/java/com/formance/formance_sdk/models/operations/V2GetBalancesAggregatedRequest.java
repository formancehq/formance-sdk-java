/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class V2GetBalancesAggregatedRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<? extends OffsetDateTime> pit;

    /**
     * Use insertion date instead of effective date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=useInsertionDate")
    private Optional<? extends Boolean> useInsertionDate;

    public V2GetBalancesAggregatedRequest(
            Optional<? extends java.util.Map<String, java.lang.Object>> requestBody,
            String ledger,
            Optional<? extends OffsetDateTime> pit,
            Optional<? extends Boolean> useInsertionDate) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pit, "pit");
        Utils.checkNotNull(useInsertionDate, "useInsertionDate");
        this.requestBody = requestBody;
        this.ledger = ledger;
        this.pit = pit;
        this.useInsertionDate = useInsertionDate;
    }

    public Optional<? extends java.util.Map<String, java.lang.Object>> requestBody() {
        return requestBody;
    }

    /**
     * Name of the ledger.
     */
    public String ledger() {
        return ledger;
    }

    public Optional<? extends OffsetDateTime> pit() {
        return pit;
    }

    /**
     * Use insertion date instead of effective date
     */
    public Optional<? extends Boolean> useInsertionDate() {
        return useInsertionDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2GetBalancesAggregatedRequest withRequestBody(java.util.Map<String, java.lang.Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2GetBalancesAggregatedRequest withRequestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2GetBalancesAggregatedRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    public V2GetBalancesAggregatedRequest withPit(OffsetDateTime pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = Optional.ofNullable(pit);
        return this;
    }

    public V2GetBalancesAggregatedRequest withPit(Optional<? extends OffsetDateTime> pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = pit;
        return this;
    }

    /**
     * Use insertion date instead of effective date
     */
    public V2GetBalancesAggregatedRequest withUseInsertionDate(boolean useInsertionDate) {
        Utils.checkNotNull(useInsertionDate, "useInsertionDate");
        this.useInsertionDate = Optional.ofNullable(useInsertionDate);
        return this;
    }

    /**
     * Use insertion date instead of effective date
     */
    public V2GetBalancesAggregatedRequest withUseInsertionDate(Optional<? extends Boolean> useInsertionDate) {
        Utils.checkNotNull(useInsertionDate, "useInsertionDate");
        this.useInsertionDate = useInsertionDate;
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
        V2GetBalancesAggregatedRequest other = (V2GetBalancesAggregatedRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.pit, other.pit) &&
            java.util.Objects.deepEquals(this.useInsertionDate, other.useInsertionDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            ledger,
            pit,
            useInsertionDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetBalancesAggregatedRequest.class,
                "requestBody", requestBody,
                "ledger", ledger,
                "pit", pit,
                "useInsertionDate", useInsertionDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody = Optional.empty();
 
        private String ledger;
 
        private Optional<? extends OffsetDateTime> pit = Optional.empty();
 
        private Optional<? extends Boolean> useInsertionDate = Optional.empty();  
        
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
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
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

        /**
         * Use insertion date instead of effective date
         */
        public Builder useInsertionDate(boolean useInsertionDate) {
            Utils.checkNotNull(useInsertionDate, "useInsertionDate");
            this.useInsertionDate = Optional.ofNullable(useInsertionDate);
            return this;
        }

        /**
         * Use insertion date instead of effective date
         */
        public Builder useInsertionDate(Optional<? extends Boolean> useInsertionDate) {
            Utils.checkNotNull(useInsertionDate, "useInsertionDate");
            this.useInsertionDate = useInsertionDate;
            return this;
        }
        
        public V2GetBalancesAggregatedRequest build() {
            return new V2GetBalancesAggregatedRequest(
                requestBody,
                ledger,
                pit,
                useInsertionDate);
        }
    }
}

