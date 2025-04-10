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

public class V3PaymentsCursorResponse {

    @JsonProperty("cursor")
    private V3PaymentsCursorResponseCursor cursor;

    @JsonCreator
    public V3PaymentsCursorResponse(
            @JsonProperty("cursor") V3PaymentsCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public V3PaymentsCursorResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3PaymentsCursorResponse withCursor(V3PaymentsCursorResponseCursor cursor) {
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
        V3PaymentsCursorResponse other = (V3PaymentsCursorResponse) o;
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
        return Utils.toString(V3PaymentsCursorResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private V3PaymentsCursorResponseCursor cursor;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(V3PaymentsCursorResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public V3PaymentsCursorResponse build() {
            return new V3PaymentsCursorResponse(
                cursor);
        }
    }
}
