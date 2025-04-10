/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class SendEventRequestBody {

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public SendEventRequestBody(
            @JsonProperty("name") String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SendEventRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        SendEventRequestBody other = (SendEventRequestBody) o;
        return 
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SendEventRequestBody.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private String name;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public SendEventRequestBody build() {
            return new SendEventRequestBody(
                name);
        }
    }
}
