/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ActivityGetPaymentOutput {

    @JsonProperty("data")
    private OrchestrationPayment data;

    public ActivityGetPaymentOutput(
            @JsonProperty("data") OrchestrationPayment data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    public OrchestrationPayment data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityGetPaymentOutput withData(OrchestrationPayment data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        ActivityGetPaymentOutput other = (ActivityGetPaymentOutput) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ActivityGetPaymentOutput.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private OrchestrationPayment data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(OrchestrationPayment data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ActivityGetPaymentOutput build() {
            return new ActivityGetPaymentOutput(
                data);
        }
    }
}

