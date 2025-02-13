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
import java.util.Objects;


public class V2BulkElementResultCreateTransactionSchemas implements V2BulkElementResult {

    @JsonProperty("data")
    private V2Transaction data;

    @JsonProperty("logID")
    private long logID;

    @JsonProperty("responseType")
    private String responseType;

    @JsonCreator
    public V2BulkElementResultCreateTransactionSchemas(
            @JsonProperty("data") V2Transaction data,
            @JsonProperty("logID") long logID,
            @JsonProperty("responseType") String responseType) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(logID, "logID");
        Utils.checkNotNull(responseType, "responseType");
        this.data = data;
        this.logID = logID;
        this.responseType = responseType;
    }

    @JsonIgnore
    public V2Transaction data() {
        return data;
    }

    @JsonIgnore
    public long logID() {
        return logID;
    }

    @JsonIgnore
    @Override
    public String responseType() {
        return Utils.discriminatorToString(responseType);
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2BulkElementResultCreateTransactionSchemas withData(V2Transaction data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public V2BulkElementResultCreateTransactionSchemas withLogID(long logID) {
        Utils.checkNotNull(logID, "logID");
        this.logID = logID;
        return this;
    }

    public V2BulkElementResultCreateTransactionSchemas withResponseType(String responseType) {
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
        V2BulkElementResultCreateTransactionSchemas other = (V2BulkElementResultCreateTransactionSchemas) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.logID, other.logID) &&
            Objects.deepEquals(this.responseType, other.responseType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            logID,
            responseType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2BulkElementResultCreateTransactionSchemas.class,
                "data", data,
                "logID", logID,
                "responseType", responseType);
    }
    
    public final static class Builder {
 
        private V2Transaction data;
 
        private Long logID;
 
        private String responseType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2Transaction data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder logID(long logID) {
            Utils.checkNotNull(logID, "logID");
            this.logID = logID;
            return this;
        }

        public Builder responseType(String responseType) {
            Utils.checkNotNull(responseType, "responseType");
            this.responseType = responseType;
            return this;
        }
        
        public V2BulkElementResultCreateTransactionSchemas build() {
            return new V2BulkElementResultCreateTransactionSchemas(
                data,
                logID,
                responseType);
        }
    }
}

