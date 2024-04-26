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


public class V2CountAccountsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<? extends OffsetDateTime> pit;

    @JsonCreator
    public V2CountAccountsRequest(
            Optional<? extends java.util.Map<String, java.lang.Object>> requestBody,
            String ledger,
            Optional<? extends OffsetDateTime> pit) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pit, "pit");
        this.requestBody = requestBody;
        this.ledger = ledger;
        this.pit = pit;
    }
    
    public V2CountAccountsRequest(
            String ledger) {
        this(Optional.empty(), ledger, Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends java.util.Map<String, java.lang.Object>> requestBody() {
        return requestBody;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    @JsonIgnore
    public Optional<? extends OffsetDateTime> pit() {
        return pit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CountAccountsRequest withRequestBody(java.util.Map<String, java.lang.Object> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2CountAccountsRequest withRequestBody(Optional<? extends java.util.Map<String, java.lang.Object>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2CountAccountsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    public V2CountAccountsRequest withPit(OffsetDateTime pit) {
        Utils.checkNotNull(pit, "pit");
        this.pit = Optional.ofNullable(pit);
        return this;
    }

    public V2CountAccountsRequest withPit(Optional<? extends OffsetDateTime> pit) {
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
        V2CountAccountsRequest other = (V2CountAccountsRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.pit, other.pit);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            ledger,
            pit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CountAccountsRequest.class,
                "requestBody", requestBody,
                "ledger", ledger,
                "pit", pit);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> requestBody = Optional.empty();
 
        private String ledger;
 
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
        
        public V2CountAccountsRequest build() {
            return new V2CountAccountsRequest(
                requestBody,
                ledger,
                pit);
        }
    }
}

