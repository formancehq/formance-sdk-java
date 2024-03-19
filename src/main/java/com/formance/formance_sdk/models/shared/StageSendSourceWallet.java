/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class StageSendSourceWallet {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends String> balance;

    @JsonProperty("id")
    private String id;

    public StageSendSourceWallet(
            @JsonProperty("balance") Optional<? extends String> balance,
            @JsonProperty("id") String id) {
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(id, "id");
        this.balance = balance;
        this.id = id;
    }

    public Optional<? extends String> balance() {
        return balance;
    }

    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StageSendSourceWallet withBalance(String balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    public StageSendSourceWallet withBalance(Optional<? extends String> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    public StageSendSourceWallet withId(String id) {
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
        StageSendSourceWallet other = (StageSendSourceWallet) o;
        return 
            java.util.Objects.deepEquals(this.balance, other.balance) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            balance,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageSendSourceWallet.class,
                "balance", balance,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> balance = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balance(String balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        public Builder balance(Optional<? extends String> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public StageSendSourceWallet build() {
            return new StageSendSourceWallet(
                balance,
                id);
        }
    }
}

