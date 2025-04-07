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

public class ActivityDebitWallet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends DebitWalletRequest> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public ActivityDebitWallet(
            @JsonProperty("data") Optional<? extends DebitWalletRequest> data,
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(id, "id");
        this.data = data;
        this.id = id;
    }
    
    public ActivityDebitWallet() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DebitWalletRequest> data() {
        return (Optional<DebitWalletRequest>) data;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public ActivityDebitWallet withData(DebitWalletRequest data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public ActivityDebitWallet withData(Optional<? extends DebitWalletRequest> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public ActivityDebitWallet withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ActivityDebitWallet withId(Optional<String> id) {
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
        ActivityDebitWallet other = (ActivityDebitWallet) o;
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
        return Utils.toString(ActivityDebitWallet.class,
                "data", data,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends DebitWalletRequest> data = Optional.empty();
 
        private Optional<String> id = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(DebitWalletRequest data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends DebitWalletRequest> data) {
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
        
        public ActivityDebitWallet build() {
            return new ActivityDebitWallet(
                data,
                id);
        }
    }
}
