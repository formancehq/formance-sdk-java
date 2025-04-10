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

public class V3CreatePoolResponse {

    /**
     * The ID of the created pool
     */
    @JsonProperty("data")
    private String data;

    @JsonCreator
    public V3CreatePoolResponse(
            @JsonProperty("data") String data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    /**
     * The ID of the created pool
     */
    @JsonIgnore
    public String data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The ID of the created pool
     */
    public V3CreatePoolResponse withData(String data) {
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
        V3CreatePoolResponse other = (V3CreatePoolResponse) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3CreatePoolResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private String data;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the created pool
         */
        public Builder data(String data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V3CreatePoolResponse build() {
            return new V3CreatePoolResponse(
                data);
        }
    }
}
