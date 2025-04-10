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

public class V2ActivityCreditWallet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends V2CreditWalletRequest> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public V2ActivityCreditWallet(
            @JsonProperty("data") Optional<? extends V2CreditWalletRequest> data,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(id, "id");
        this.data = data;
        this.id = id;
    }
    
    public V2ActivityCreditWallet() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2CreditWalletRequest> data() {
        return (Optional<V2CreditWalletRequest>) data;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2ActivityCreditWallet withData(V2CreditWalletRequest data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public V2ActivityCreditWallet withData(Optional<? extends V2CreditWalletRequest> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public V2ActivityCreditWallet withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public V2ActivityCreditWallet withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        V2ActivityCreditWallet other = (V2ActivityCreditWallet) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ActivityCreditWallet.class,
                "data", data,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2CreditWalletRequest> data = Optional.empty();
 
        private Optional<String> id = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V2CreditWalletRequest data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends V2CreditWalletRequest> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public V2ActivityCreditWallet build() {
            return new V2ActivityCreditWallet(
                data,
                id);
        }
    }
}
