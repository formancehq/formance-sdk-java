/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ListUsersResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends java.util.List<User>> data;

    @JsonCreator
    public ListUsersResponse(
            @JsonProperty("data") Optional<? extends java.util.List<User>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public ListUsersResponse() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<User>> data() {
        return (Optional<java.util.List<User>>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ListUsersResponse withData(java.util.List<User> data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public ListUsersResponse withData(Optional<? extends java.util.List<User>> data) {
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
        ListUsersResponse other = (ListUsersResponse) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUsersResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<User>> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<User> data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends java.util.List<User>> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public ListUsersResponse build() {
            return new ListUsersResponse(
                data);
        }
    }
}

