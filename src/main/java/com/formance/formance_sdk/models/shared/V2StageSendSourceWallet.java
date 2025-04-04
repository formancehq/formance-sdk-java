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
import java.util.Objects;
import java.util.Optional;

public class V2StageSendSourceWallet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<String> balance;

    @JsonProperty("id")
    private String id;

    @JsonCreator
    public V2StageSendSourceWallet(
            @JsonProperty("balance") Optional<String> balance,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(id, "id");
        this.balance = balance;
        this.id = id;
    }
    
    public V2StageSendSourceWallet(
            String id) {
        this(Optional.empty(), id);
    }

    @JsonIgnore
    public Optional<String> balance() {
        return balance;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2StageSendSourceWallet withBalance(String balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    public V2StageSendSourceWallet withBalance(Optional<String> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    public V2StageSendSourceWallet withId(String id) {
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
        V2StageSendSourceWallet other = (V2StageSendSourceWallet) o;
        return 
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            balance,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2StageSendSourceWallet.class,
                "balance", balance,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<String> balance = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balance(String balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        public Builder balance(Optional<String> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public V2StageSendSourceWallet build() {
            return new V2StageSendSourceWallet(
                balance,
                id);
        }
    }
}

