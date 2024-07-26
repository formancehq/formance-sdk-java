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

public class Data {

    @JsonProperty("connectorID")
    private String connectorID;

    @JsonCreator
    public Data(
            @JsonProperty("connectorID") String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
    }

    @JsonIgnore
    public String connectorID() {
        return connectorID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Data withConnectorID(String connectorID) {
        Utils.checkNotNull(connectorID, "connectorID");
        this.connectorID = connectorID;
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
        Data other = (Data) o;
        return 
            java.util.Objects.deepEquals(this.connectorID, other.connectorID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connectorID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Data.class,
                "connectorID", connectorID);
    }
    
    public final static class Builder {
 
        private String connectorID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectorID(String connectorID) {
            Utils.checkNotNull(connectorID, "connectorID");
            this.connectorID = connectorID;
            return this;
        }
        
        public Data build() {
            return new Data(
                connectorID);
        }
    }
}

