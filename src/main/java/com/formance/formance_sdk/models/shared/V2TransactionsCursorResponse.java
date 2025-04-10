/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class V2TransactionsCursorResponse {

    @JsonProperty("cursor")
    private V2TransactionsCursorResponseCursor cursor;

    @JsonCreator
    public V2TransactionsCursorResponse(
            @JsonProperty("cursor") V2TransactionsCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public V2TransactionsCursorResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2TransactionsCursorResponse withCursor(V2TransactionsCursorResponseCursor cursor) {
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
        V2TransactionsCursorResponse other = (V2TransactionsCursorResponse) o;
        return 
            Objects.deepEquals(this.cursor, other.cursor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cursor);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2TransactionsCursorResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private V2TransactionsCursorResponseCursor cursor;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(V2TransactionsCursorResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public V2TransactionsCursorResponse build() {
            return new V2TransactionsCursorResponse(
                cursor);
        }
    }
}
