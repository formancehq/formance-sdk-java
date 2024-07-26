/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class BankAccountResponse {

    @JsonProperty("data")
    private BankAccount data;

    @JsonCreator
    public BankAccountResponse(
            @JsonProperty("data") BankAccount data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public BankAccount data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BankAccountResponse withData(BankAccount data) {
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
        BankAccountResponse other = (BankAccountResponse) o;
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
        return Utils.toString(BankAccountResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private BankAccount data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(BankAccount data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public BankAccountResponse build() {
            return new BankAccountResponse(
                data);
        }
    }
}

