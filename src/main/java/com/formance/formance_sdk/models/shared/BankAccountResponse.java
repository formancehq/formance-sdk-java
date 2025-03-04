/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
/**
 * BankAccountResponse - OK
 */

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
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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

