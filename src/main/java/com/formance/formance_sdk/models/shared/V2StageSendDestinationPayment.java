/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class V2StageSendDestinationPayment {

    @JsonProperty("psp")
    private String psp;

    @JsonCreator
    public V2StageSendDestinationPayment(
            @JsonProperty("psp") String psp) {
        Utils.checkNotNull(psp, "psp");
        this.psp = psp;
    }

    @JsonIgnore
    public String psp() {
        return psp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2StageSendDestinationPayment withPsp(String psp) {
        Utils.checkNotNull(psp, "psp");
        this.psp = psp;
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
        V2StageSendDestinationPayment other = (V2StageSendDestinationPayment) o;
        return 
            java.util.Objects.deepEquals(this.psp, other.psp);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            psp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2StageSendDestinationPayment.class,
                "psp", psp);
    }
    
    public final static class Builder {
 
        private String psp;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder psp(String psp) {
            Utils.checkNotNull(psp, "psp");
            this.psp = psp;
            return this;
        }
        
        public V2StageSendDestinationPayment build() {
            return new V2StageSendDestinationPayment(
                psp);
        }
    }
}

