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

public class V2ListRunsResponse {

    @JsonProperty("cursor")
    private V2ListRunsResponseCursor cursor;

    @JsonCreator
    public V2ListRunsResponse(
            @JsonProperty("cursor") V2ListRunsResponseCursor cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
    }

    @JsonIgnore
    public V2ListRunsResponseCursor cursor() {
        return cursor;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2ListRunsResponse withCursor(V2ListRunsResponseCursor cursor) {
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
        V2ListRunsResponse other = (V2ListRunsResponse) o;
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
        return Utils.toString(V2ListRunsResponse.class,
                "cursor", cursor);
    }
    
    public final static class Builder {
 
        private V2ListRunsResponseCursor cursor;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cursor(V2ListRunsResponseCursor cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }
        
        public V2ListRunsResponse build() {
            return new V2ListRunsResponse(
                cursor);
        }
    }
}
