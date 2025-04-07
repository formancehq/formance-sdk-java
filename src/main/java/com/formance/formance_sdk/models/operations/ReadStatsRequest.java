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

public class ReadStatsRequest {

    /**
     * name of the ledger
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public ReadStatsRequest(
            String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
    }

    /**
     * name of the ledger
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * name of the ledger
     */
    public ReadStatsRequest withLedger(String ledger) {
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
        ReadStatsRequest other = (ReadStatsRequest) o;
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
        return Utils.toString(ReadStatsRequest.class,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private String ledger;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * name of the ledger
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public ReadStatsRequest build() {
            return new ReadStatsRequest(
                ledger);
        }
    }
}
