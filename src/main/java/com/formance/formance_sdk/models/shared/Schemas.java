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

public class Schemas implements V2BulkElementResult {

    @JsonProperty("logID")
    private long logID;

    @JsonProperty("responseType")
    private String responseType;

    @JsonCreator
    public Schemas(
            @JsonProperty("logID") long logID,
            @JsonProperty("responseType") String responseType) {
        Utils.checkNotNull(logID, "logID");
        Utils.checkNotNull(responseType, "responseType");
        this.logID = logID;
        this.responseType = responseType;
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

    public Schemas withLogID(long logID) {
        Utils.checkNotNull(logID, "logID");
        this.logID = logID;
        return this;
    }

    public Schemas withResponseType(String responseType) {
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
        Schemas other = (Schemas) o;
        return 
            Objects.deepEquals(this.logID, other.logID) &&
            Objects.deepEquals(this.responseType, other.responseType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            logID,
            responseType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Schemas.class,
                "logID", logID,
                "responseType", responseType);
    }
    
    public final static class Builder {
 
        private Long logID;
 
        private String responseType;  
        
        private Builder() {
          // force use of static builder() method
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
        
        public Schemas build() {
            return new Schemas(
                logID,
                responseType);
        }
    }
}

