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

public class ListTriggersResponse {

    @JsonProperty("data")
    private java.util.List<Trigger> data;

    @JsonCreator
    public ListTriggersResponse(
            @JsonProperty("data") java.util.List<Trigger> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public java.util.List<Trigger> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListTriggersResponse withData(java.util.List<Trigger> data) {
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
        ListTriggersResponse other = (ListTriggersResponse) o;
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
        return Utils.toString(ListTriggersResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private java.util.List<Trigger> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<Trigger> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ListTriggersResponse build() {
            return new ListTriggersResponse(
                data);
        }
    }
}

