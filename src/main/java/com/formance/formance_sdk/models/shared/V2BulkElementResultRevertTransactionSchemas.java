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


public class V2BulkElementResultRevertTransactionSchemas {

    @JsonProperty("data")
    private V2Transaction data;

    @JsonProperty("responseType")
    private String responseType;

    public V2BulkElementResultRevertTransactionSchemas(
            @JsonProperty("data") V2Transaction data,
            @JsonProperty("responseType") String responseType) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(responseType, "responseType");
        this.data = data;
        this.responseType = responseType;
    }

    public V2Transaction data() {
        return data;
    }

    public String responseType() {
        return responseType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2BulkElementResultRevertTransactionSchemas withData(V2Transaction data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public V2BulkElementResultRevertTransactionSchemas withResponseType(String responseType) {
        Utils.checkNotNull(responseType, "responseType");
        this.responseType = responseType;
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
        V2BulkElementResultRevertTransactionSchemas other = (V2BulkElementResultRevertTransactionSchemas) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.responseType, other.responseType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            responseType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2BulkElementResultRevertTransactionSchemas.class,
                "data", data,
                "responseType", responseType);
    }
    
    public final static class Builder {
 
        private V2Transaction data;
 
        private String responseType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2Transaction data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder responseType(String responseType) {
            Utils.checkNotNull(responseType, "responseType");
            this.responseType = responseType;
            return this;
        }
        
        public V2BulkElementResultRevertTransactionSchemas build() {
            return new V2BulkElementResultRevertTransactionSchemas(
                data,
                responseType);
        }
    }
}
