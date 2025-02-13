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


public class V3PaymentInitiationsCursorResponse {

    @JsonProperty("cursor")
    private V3PaymentInitiationsCursorResponseCursor cursor;

    @JsonCreator
    public V3PaymentInitiationsCursorResponse(
            @JsonProperty("cursor") V3PaymentInitiationsCursorResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public V3PaymentInitiationsCursorResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3PaymentInitiationsCursorResponse withCursor(V3PaymentInitiationsCursorResponseCursor cursor) {
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
        V3PaymentInitiationsCursorResponse other = (V3PaymentInitiationsCursorResponse) o;
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
        return Utils.toString(V3PaymentInitiationsCursorResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private V3PaymentInitiationsCursorResponseCursor cursor;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(V3PaymentInitiationsCursorResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public V3PaymentInitiationsCursorResponse build() {
            return new V3PaymentInitiationsCursorResponse(
                cursor);
        }
    }
}

