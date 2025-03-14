/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2CountAccountsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Map<String, Object> requestBody;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pit")
    private Optional<OffsetDateTime> pit;

    @JsonCreator
    public V2CountAccountsRequest(
            Map<String, Object> requestBody,
            String ledger,
            Optional<OffsetDateTime> pit) {
        requestBody = Utils.emptyMapIfNull(requestBody);
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(pit, "pit");
        this.requestBody = requestBody;
        this.ledger = ledger;
        this.pit = pit;
    }
    
    public V2CountAccountsRequest(
            Map<String, Object> requestBody,
            String ledger) {
        this(requestBody, ledger, Optional.empty());
    }

    @JsonIgnore
    public Map<String, Object> requestBody() {
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
    public Optional<OffsetDateTime> pit() {
        return pit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CountAccountsRequest withRequestBody(Map<String, Object> requestBody) {
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

    public V2CountAccountsRequest withPit(Optional<OffsetDateTime> pit) {
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
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.pit, other.pit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Map<String, Object> requestBody;
 
        private String ledger;
 
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

        public Builder pit(Optional<OffsetDateTime> pit) {
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

