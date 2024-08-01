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

public class V2StageSendDestination {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends V2StageSendDestinationAccount> account;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment")
    private Optional<? extends V2StageSendDestinationPayment> payment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wallet")
    private Optional<? extends V2StageSendDestinationWallet> wallet;

    @JsonCreator
    public V2StageSendDestination(
            @JsonProperty("account") Optional<? extends V2StageSendDestinationAccount> account,
            @JsonProperty("payment") Optional<? extends V2StageSendDestinationPayment> payment,
            @JsonProperty("wallet") Optional<? extends V2StageSendDestinationWallet> wallet) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(payment, "payment");
        Utils.checkNotNull(wallet, "wallet");
        this.account = account;
        this.payment = payment;
        this.wallet = wallet;
    }
    
    public V2StageSendDestination() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2StageSendDestinationAccount> account() {
        return (Optional<V2StageSendDestinationAccount>) account;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2StageSendDestinationPayment> payment() {
        return (Optional<V2StageSendDestinationPayment>) payment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2StageSendDestinationWallet> wallet() {
        return (Optional<V2StageSendDestinationWallet>) wallet;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2StageSendDestination withAccount(V2StageSendDestinationAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    public V2StageSendDestination withAccount(Optional<? extends V2StageSendDestinationAccount> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    public V2StageSendDestination withPayment(V2StageSendDestinationPayment payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = Optional.ofNullable(payment);
        return this;
    }

    public V2StageSendDestination withPayment(Optional<? extends V2StageSendDestinationPayment> payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = payment;
        return this;
    }

    public V2StageSendDestination withWallet(V2StageSendDestinationWallet wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = Optional.ofNullable(wallet);
        return this;
    }

    public V2StageSendDestination withWallet(Optional<? extends V2StageSendDestinationWallet> wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = wallet;
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
        V2StageSendDestination other = (V2StageSendDestination) o;
        return 
            java.util.Objects.deepEquals(this.account, other.account) &&
            java.util.Objects.deepEquals(this.payment, other.payment) &&
            java.util.Objects.deepEquals(this.wallet, other.wallet);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            account,
            payment,
            wallet);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2StageSendDestination.class,
                "account", account,
                "payment", payment,
                "wallet", wallet);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2StageSendDestinationAccount> account = Optional.empty();
 
        private Optional<? extends V2StageSendDestinationPayment> payment = Optional.empty();
 
        private Optional<? extends V2StageSendDestinationWallet> wallet = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(V2StageSendDestinationAccount account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        public Builder account(Optional<? extends V2StageSendDestinationAccount> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        public Builder payment(V2StageSendDestinationPayment payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = Optional.ofNullable(payment);
            return this;
        }

        public Builder payment(Optional<? extends V2StageSendDestinationPayment> payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = payment;
            return this;
        }

        public Builder wallet(V2StageSendDestinationWallet wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = Optional.ofNullable(wallet);
            return this;
        }

        public Builder wallet(Optional<? extends V2StageSendDestinationWallet> wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = wallet;
            return this;
        }
        
        public V2StageSendDestination build() {
            return new V2StageSendDestination(
                account,
                payment,
                wallet);
        }
    }
}

