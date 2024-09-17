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


public class CreateBalanceResponse {

    @JsonProperty("data")
    private Balance data;

    @JsonCreator
    public CreateBalanceResponse(
            @JsonProperty("data") Balance data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public Balance data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateBalanceResponse withData(Balance data) {
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
        CreateBalanceResponse other = (CreateBalanceResponse) o;
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
        return Utils.toString(CreateBalanceResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Balance data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Balance data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CreateBalanceResponse build() {
            return new CreateBalanceResponse(
                data);
        }
    }
}

