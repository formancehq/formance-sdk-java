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


public class PoliciesCursorResponse {

    @JsonProperty("cursor")
    private PoliciesCursorResponseCursor cursor;

    public PoliciesCursorResponse(
            @JsonProperty("cursor") PoliciesCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    public PoliciesCursorResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PoliciesCursorResponse withCursor(PoliciesCursorResponseCursor cursor) {
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
        PoliciesCursorResponse other = (PoliciesCursorResponse) o;
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
        return Utils.toString(PoliciesCursorResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private PoliciesCursorResponseCursor cursor;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(PoliciesCursorResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public PoliciesCursorResponse build() {
            return new PoliciesCursorResponse(
                cursor);
        }
    }
}

