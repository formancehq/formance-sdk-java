/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.openapitools.jackson.nullable.JsonNullable;


public class MappingResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private JsonNullable<? extends Mapping> data;

    @JsonCreator
    public MappingResponse(
            @JsonProperty("data") JsonNullable<? extends Mapping> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public MappingResponse() {
        this(JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<? extends Mapping> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public MappingResponse withData(Mapping data) {
        Utils.checkNotNull(data, "data");
        this.data = JsonNullable.of(data);
        return this;
    }

    public MappingResponse withData(JsonNullable<? extends Mapping> data) {
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
        MappingResponse other = (MappingResponse) o;
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
        return Utils.toString(MappingResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends Mapping> data = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Mapping data) {
            Utils.checkNotNull(data, "data");
            this.data = JsonNullable.of(data);
            return this;
        }

        public Builder data(JsonNullable<? extends Mapping> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public MappingResponse build() {
            return new MappingResponse(
                data);
        }
    }
}

