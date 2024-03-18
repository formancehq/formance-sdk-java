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
import java.util.Optional;


public class V2CreateLedgerRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.V2CreateLedgerRequest> v2CreateLedgerRequest;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    public V2CreateLedgerRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.V2CreateLedgerRequest> v2CreateLedgerRequest,
            String ledger) {
        Utils.checkNotNull(v2CreateLedgerRequest, "v2CreateLedgerRequest");
        Utils.checkNotNull(ledger, "ledger");
        this.v2CreateLedgerRequest = v2CreateLedgerRequest;
        this.ledger = ledger;
    }

    public Optional<? extends com.formance.formance_sdk.models.shared.V2CreateLedgerRequest> v2CreateLedgerRequest() {
        return v2CreateLedgerRequest;
    }

    /**
     * Name of the ledger.
     */
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CreateLedgerRequest withV2CreateLedgerRequest(com.formance.formance_sdk.models.shared.V2CreateLedgerRequest v2CreateLedgerRequest) {
        Utils.checkNotNull(v2CreateLedgerRequest, "v2CreateLedgerRequest");
        this.v2CreateLedgerRequest = Optional.ofNullable(v2CreateLedgerRequest);
        return this;
    }

    public V2CreateLedgerRequest withV2CreateLedgerRequest(Optional<? extends com.formance.formance_sdk.models.shared.V2CreateLedgerRequest> v2CreateLedgerRequest) {
        Utils.checkNotNull(v2CreateLedgerRequest, "v2CreateLedgerRequest");
        this.v2CreateLedgerRequest = v2CreateLedgerRequest;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2CreateLedgerRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
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
        V2CreateLedgerRequest other = (V2CreateLedgerRequest) o;
        return 
            java.util.Objects.deepEquals(this.v2CreateLedgerRequest, other.v2CreateLedgerRequest) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            v2CreateLedgerRequest,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateLedgerRequest.class,
                "v2CreateLedgerRequest", v2CreateLedgerRequest,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V2CreateLedgerRequest> v2CreateLedgerRequest = Optional.empty();
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder v2CreateLedgerRequest(com.formance.formance_sdk.models.shared.V2CreateLedgerRequest v2CreateLedgerRequest) {
            Utils.checkNotNull(v2CreateLedgerRequest, "v2CreateLedgerRequest");
            this.v2CreateLedgerRequest = Optional.ofNullable(v2CreateLedgerRequest);
            return this;
        }

        public Builder v2CreateLedgerRequest(Optional<? extends com.formance.formance_sdk.models.shared.V2CreateLedgerRequest> v2CreateLedgerRequest) {
            Utils.checkNotNull(v2CreateLedgerRequest, "v2CreateLedgerRequest");
            this.v2CreateLedgerRequest = v2CreateLedgerRequest;
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
        
        public V2CreateLedgerRequest build() {
            return new V2CreateLedgerRequest(
                v2CreateLedgerRequest,
                ledger);
        }
    }
}

