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


public class TransactionsCursorResponse {

    @JsonProperty("cursor")
    private TransactionsCursorResponseCursor cursor;

    public TransactionsCursorResponse(
            @JsonProperty("cursor") TransactionsCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    public TransactionsCursorResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TransactionsCursorResponse withCursor(TransactionsCursorResponseCursor cursor) {
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
        TransactionsCursorResponse other = (TransactionsCursorResponse) o;
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
        return Utils.toString(TransactionsCursorResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private TransactionsCursorResponseCursor cursor;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(TransactionsCursorResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public TransactionsCursorResponse build() {
            return new TransactionsCursorResponse(
                cursor);
        }
    }
}

