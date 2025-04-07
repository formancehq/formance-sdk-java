/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class V2GetLedgerInfoRequest {

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public V2GetLedgerInfoRequest(
            String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Name of the ledger.
     */
    public V2GetLedgerInfoRequest withLedger(String ledger) {
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
        V2GetLedgerInfoRequest other = (V2GetLedgerInfoRequest) o;
        return 
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetLedgerInfoRequest.class,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private String ledger;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public V2GetLedgerInfoRequest build() {
            return new V2GetLedgerInfoRequest(
                ledger);
        }
    }
}
