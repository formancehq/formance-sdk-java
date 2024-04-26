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


public class V2LogsCursorResponse {

    @JsonProperty("cursor")
    private V2LogsCursorResponseCursor cursor;

    @JsonCreator
    public V2LogsCursorResponse(
            @JsonProperty("cursor") V2LogsCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public V2LogsCursorResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2LogsCursorResponse withCursor(V2LogsCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
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
        V2LogsCursorResponse other = (V2LogsCursorResponse) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2LogsCursorResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private V2LogsCursorResponseCursor cursor;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(V2LogsCursorResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public V2LogsCursorResponse build() {
            return new V2LogsCursorResponse(
                cursor);
        }
    }
}

