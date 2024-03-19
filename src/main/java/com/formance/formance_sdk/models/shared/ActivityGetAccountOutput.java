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


public class ActivityGetAccountOutput {

    @JsonProperty("data")
    private OrchestrationAccount data;

    public ActivityGetAccountOutput(
            @JsonProperty("data") OrchestrationAccount data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    public OrchestrationAccount data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ActivityGetAccountOutput withData(OrchestrationAccount data) {
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
        ActivityGetAccountOutput other = (ActivityGetAccountOutput) o;
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
        return Utils.toString(ActivityGetAccountOutput.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private OrchestrationAccount data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(OrchestrationAccount data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ActivityGetAccountOutput build() {
            return new ActivityGetAccountOutput(
                data);
        }
    }
}

