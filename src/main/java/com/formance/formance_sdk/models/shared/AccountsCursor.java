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

/**
 * AccountsCursor
 * 
 * <p>OK
 */
public class AccountsCursor {

    @JsonProperty("cursor")
    private Cursor cursor;

    @JsonCreator
    public AccountsCursor(
            @JsonProperty("cursor") Cursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public Cursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public AccountsCursor withCursor(Cursor cursor) {
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
        AccountsCursor other = (AccountsCursor) o;
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
        return Utils.toString(AccountsCursor.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private Cursor cursor;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(Cursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public AccountsCursor build() {
            return new AccountsCursor(
                cursor);
        }
    }
}
