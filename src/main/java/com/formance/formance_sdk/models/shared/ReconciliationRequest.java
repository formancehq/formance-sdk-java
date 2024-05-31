/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class ReconciliationRequest {

    @JsonProperty("reconciledAtLedger")
    private OffsetDateTime reconciledAtLedger;

    @JsonProperty("reconciledAtPayments")
    private OffsetDateTime reconciledAtPayments;

    @JsonCreator
    public ReconciliationRequest(
            @JsonProperty("reconciledAtLedger") OffsetDateTime reconciledAtLedger,
            @JsonProperty("reconciledAtPayments") OffsetDateTime reconciledAtPayments) {
        Utils.checkNotNull(reconciledAtLedger, "reconciledAtLedger");
        Utils.checkNotNull(reconciledAtPayments, "reconciledAtPayments");
        this.reconciledAtLedger = reconciledAtLedger;
        this.reconciledAtPayments = reconciledAtPayments;
    }

    @JsonIgnore
    public OffsetDateTime reconciledAtLedger() {
        return reconciledAtLedger;
    }

    @JsonIgnore
    public OffsetDateTime reconciledAtPayments() {
        return reconciledAtPayments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ReconciliationRequest withReconciledAtLedger(OffsetDateTime reconciledAtLedger) {
        Utils.checkNotNull(reconciledAtLedger, "reconciledAtLedger");
        this.reconciledAtLedger = reconciledAtLedger;
        return this;
    }

    public ReconciliationRequest withReconciledAtPayments(OffsetDateTime reconciledAtPayments) {
        Utils.checkNotNull(reconciledAtPayments, "reconciledAtPayments");
        this.reconciledAtPayments = reconciledAtPayments;
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
        ReconciliationRequest other = (ReconciliationRequest) o;
        return 
            java.util.Objects.deepEquals(this.reconciledAtLedger, other.reconciledAtLedger) &&
            java.util.Objects.deepEquals(this.reconciledAtPayments, other.reconciledAtPayments);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            reconciledAtLedger,
            reconciledAtPayments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReconciliationRequest.class,
                "reconciledAtLedger", reconciledAtLedger,
                "reconciledAtPayments", reconciledAtPayments);
    }
    
    public final static class Builder {
 
        private OffsetDateTime reconciledAtLedger;
 
        private OffsetDateTime reconciledAtPayments;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder reconciledAtLedger(OffsetDateTime reconciledAtLedger) {
            Utils.checkNotNull(reconciledAtLedger, "reconciledAtLedger");
            this.reconciledAtLedger = reconciledAtLedger;
            return this;
        }

        public Builder reconciledAtPayments(OffsetDateTime reconciledAtPayments) {
            Utils.checkNotNull(reconciledAtPayments, "reconciledAtPayments");
            this.reconciledAtPayments = reconciledAtPayments;
            return this;
        }
        
        public ReconciliationRequest build() {
            return new ReconciliationRequest(
                reconciledAtLedger,
                reconciledAtPayments);
        }
    }
}

