/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class V2BulkElementResultDeleteMetadataSchemas {

    @JsonProperty("responseType")
    private String responseType;

    @JsonCreator
    public V2BulkElementResultDeleteMetadataSchemas(
            @JsonProperty("responseType") String responseType) {
        Utils.checkNotNull(responseType, "responseType");
        this.responseType = responseType;
    }

    @JsonIgnore
    public String responseType() {
        return responseType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2BulkElementResultDeleteMetadataSchemas withResponseType(String responseType) {
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
        V2BulkElementResultDeleteMetadataSchemas other = (V2BulkElementResultDeleteMetadataSchemas) o;
        return 
            java.util.Objects.deepEquals(this.responseType, other.responseType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            responseType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2BulkElementResultDeleteMetadataSchemas.class,
                "responseType", responseType);
    }
    
    public final static class Builder {
 
        private String responseType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder responseType(String responseType) {
            Utils.checkNotNull(responseType, "responseType");
            this.responseType = responseType;
            return this;
        }
        
        public V2BulkElementResultDeleteMetadataSchemas build() {
            return new V2BulkElementResultDeleteMetadataSchemas(
                responseType);
        }
    }
}

