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

public class ConnectorsResponse {

    @JsonProperty("data")
    private java.util.List<ConnectorsResponseData> data;

    @JsonCreator
    public ConnectorsResponse(
            @JsonProperty("data") java.util.List<ConnectorsResponseData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public java.util.List<ConnectorsResponseData> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectorsResponse withData(java.util.List<ConnectorsResponseData> data) {
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
        ConnectorsResponse other = (ConnectorsResponse) o;
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
        return Utils.toString(ConnectorsResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private java.util.List<ConnectorsResponseData> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<ConnectorsResponseData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ConnectorsResponse build() {
            return new ConnectorsResponse(
                data);
        }
    }
}

