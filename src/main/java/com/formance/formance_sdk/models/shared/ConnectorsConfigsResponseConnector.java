/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ConnectorsConfigsResponseConnector {

    @JsonProperty("key")
    private Key key;

    public ConnectorsConfigsResponseConnector(
            @JsonProperty("key") Key key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
    }

    public Key key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConnectorsConfigsResponseConnector withKey(Key key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        ConnectorsConfigsResponseConnector other = (ConnectorsConfigsResponseConnector) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConnectorsConfigsResponseConnector.class,
                "key", key);
    }
    
    public final static class Builder {
 
        private Key key;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(Key key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public ConnectorsConfigsResponseConnector build() {
            return new ConnectorsConfigsResponseConnector(
                key);
        }
    }
}

