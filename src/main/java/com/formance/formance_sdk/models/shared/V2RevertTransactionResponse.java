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


public class V2RevertTransactionResponse {

    @JsonProperty("data")
    private V2Transaction data;

    @JsonCreator
    public V2RevertTransactionResponse(
            @JsonProperty("data") V2Transaction data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public V2Transaction data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2RevertTransactionResponse withData(V2Transaction data) {
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
        V2RevertTransactionResponse other = (V2RevertTransactionResponse) o;
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
        return Utils.toString(V2RevertTransactionResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private V2Transaction data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2Transaction data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V2RevertTransactionResponse build() {
            return new V2RevertTransactionResponse(
                data);
        }
    }
}

