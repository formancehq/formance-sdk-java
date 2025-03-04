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

public class LedgerInfoResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends LedgerInfo> data;

    @JsonCreator
    public LedgerInfoResponse(
            @JsonProperty("data") Optional<? extends LedgerInfo> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }
    
    public LedgerInfoResponse() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LedgerInfo> data() {
        return (Optional<LedgerInfo>) data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LedgerInfoResponse withData(LedgerInfo data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public LedgerInfoResponse withData(Optional<? extends LedgerInfo> data) {
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
        LedgerInfoResponse other = (LedgerInfoResponse) o;
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
        return Utils.toString(LedgerInfoResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Optional<? extends LedgerInfo> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(LedgerInfo data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends LedgerInfo> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public LedgerInfoResponse build() {
            return new LedgerInfoResponse(
                data);
        }
    }
}

