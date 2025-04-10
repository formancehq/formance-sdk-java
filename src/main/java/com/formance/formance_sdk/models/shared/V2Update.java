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

public class V2Update {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends V2UpdateAccount> account;

    @JsonCreator
    public V2Update(
            @JsonProperty("account") Optional<? extends V2UpdateAccount> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
    }
    
    public V2Update() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2UpdateAccount> account() {
        return (Optional<V2UpdateAccount>) account;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2Update withAccount(V2UpdateAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    public V2Update withAccount(Optional<? extends V2UpdateAccount> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
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
        V2Update other = (V2Update) o;
        return 
            Objects.deepEquals(this.account, other.account);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            account);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Update.class,
                "account", account);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2UpdateAccount> account = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(V2UpdateAccount account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        public Builder account(Optional<? extends V2UpdateAccount> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }
        
        public V2Update build() {
            return new V2Update(
                account);
        }
    }
}
