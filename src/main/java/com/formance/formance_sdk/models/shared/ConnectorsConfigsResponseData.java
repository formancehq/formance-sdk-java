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

public class ConnectorsConfigsResponseData {

    @JsonProperty("connector")
    private ConnectorsConfigsResponseConnector connector;

    @JsonCreator
    public ConnectorsConfigsResponseData(
            @JsonProperty("connector") ConnectorsConfigsResponseConnector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
    }

    @JsonIgnore
    public ConnectorsConfigsResponseConnector connector() {
        return connector;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectorsConfigsResponseData withConnector(ConnectorsConfigsResponseConnector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
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
        ConnectorsConfigsResponseData other = (ConnectorsConfigsResponseData) o;
        return 
            java.util.Objects.deepEquals(this.connector, other.connector);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connector);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorsConfigsResponseData.class,
                "connector", connector);
    }
    
    public final static class Builder {
 
        private ConnectorsConfigsResponseConnector connector;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connector(ConnectorsConfigsResponseConnector connector) {
            Utils.checkNotNull(connector, "connector");
            this.connector = connector;
            return this;
        }
        
        public ConnectorsConfigsResponseData build() {
            return new ConnectorsConfigsResponseData(
                connector);
        }
    }
}

