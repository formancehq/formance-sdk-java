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

public class V2GetTransactionResponse {

    @JsonProperty("data")
    private V2ExpandedTransaction data;

    @JsonCreator
    public V2GetTransactionResponse(
            @JsonProperty("data") V2ExpandedTransaction data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public V2ExpandedTransaction data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2GetTransactionResponse withData(V2ExpandedTransaction data) {
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
        V2GetTransactionResponse other = (V2GetTransactionResponse) o;
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
        return Utils.toString(V2GetTransactionResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private V2ExpandedTransaction data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2ExpandedTransaction data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V2GetTransactionResponse build() {
            return new V2GetTransactionResponse(
                data);
        }
    }
}

