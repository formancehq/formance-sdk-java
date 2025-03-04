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

public class GetBalanceResponse {

    @JsonProperty("data")
    private BalanceWithAssets data;

    @JsonCreator
    public GetBalanceResponse(
            @JsonProperty("data") BalanceWithAssets data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public BalanceWithAssets data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetBalanceResponse withData(BalanceWithAssets data) {
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
        GetBalanceResponse other = (GetBalanceResponse) o;
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
        return Utils.toString(GetBalanceResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private BalanceWithAssets data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(BalanceWithAssets data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetBalanceResponse build() {
            return new GetBalanceResponse(
                data);
        }
    }
}

