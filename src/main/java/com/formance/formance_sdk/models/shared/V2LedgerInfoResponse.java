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

public class V2LedgerInfoResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends V2LedgerInfo> data;

    @JsonCreator
    public V2LedgerInfoResponse(
            @JsonProperty("data") Optional<? extends V2LedgerInfo> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public V2LedgerInfoResponse() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2LedgerInfo> data() {
        return (Optional<V2LedgerInfo>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2LedgerInfoResponse withData(V2LedgerInfo data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public V2LedgerInfoResponse withData(Optional<? extends V2LedgerInfo> data) {
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
        V2LedgerInfoResponse other = (V2LedgerInfoResponse) o;
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
        return Utils.toString(V2LedgerInfoResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2LedgerInfo> data = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2LedgerInfo data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends V2LedgerInfo> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V2LedgerInfoResponse build() {
            return new V2LedgerInfoResponse(
                data);
        }
    }
}
