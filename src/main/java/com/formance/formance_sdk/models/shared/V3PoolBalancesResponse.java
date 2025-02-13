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
import java.util.List;
import java.util.Objects;


public class V3PoolBalancesResponse {

    @JsonProperty("data")
    private List<V3PoolBalance> data;

    @JsonCreator
    public V3PoolBalancesResponse(
            @JsonProperty("data") List<V3PoolBalance> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<V3PoolBalance> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3PoolBalancesResponse withData(List<V3PoolBalance> data) {
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
        V3PoolBalancesResponse other = (V3PoolBalancesResponse) o;
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
        return Utils.toString(V3PoolBalancesResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<V3PoolBalance> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<V3PoolBalance> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V3PoolBalancesResponse build() {
            return new V3PoolBalancesResponse(
                data);
        }
    }
}

