/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

public class AggregateBalancesResponse {

    @JsonProperty("data")
    private Map<String, Long> data;

    @JsonCreator
    public AggregateBalancesResponse(
            @JsonProperty("data") Map<String, Long> data) {
        data = Utils.emptyMapIfNull(data);
        this.data = data;
    }

    @JsonIgnore
    public Map<String, Long> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AggregateBalancesResponse withData(Map<String, Long> data) {
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
        AggregateBalancesResponse other = (AggregateBalancesResponse) o;
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
        return Utils.toString(AggregateBalancesResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Map<String, Long> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Map<String, Long> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public AggregateBalancesResponse build() {
            return new AggregateBalancesResponse(
                data);
        }
    }
}

