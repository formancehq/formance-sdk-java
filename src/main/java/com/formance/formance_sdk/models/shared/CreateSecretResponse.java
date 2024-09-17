/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class CreateSecretResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends Secret> data;

    @JsonCreator
    public CreateSecretResponse(
            @JsonProperty("data") Optional<? extends Secret> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public CreateSecretResponse() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Secret> data() {
        return (Optional<Secret>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateSecretResponse withData(Secret data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public CreateSecretResponse withData(Optional<? extends Secret> data) {
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
        CreateSecretResponse other = (CreateSecretResponse) o;
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
        return Utils.toString(CreateSecretResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends Secret> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Secret data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends Secret> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public CreateSecretResponse build() {
            return new CreateSecretResponse(
                data);
        }
    }
}

