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


public class StageSendDestination {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends StageSendDestinationAccount> account;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment")
    private Optional<? extends StageSendDestinationPayment> payment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wallet")
    private Optional<? extends StageSendDestinationWallet> wallet;

    public StageSendDestination(
            @JsonProperty("account") Optional<? extends StageSendDestinationAccount> account,
            @JsonProperty("payment") Optional<? extends StageSendDestinationPayment> payment,
            @JsonProperty("wallet") Optional<? extends StageSendDestinationWallet> wallet) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(payment, "payment");
        Utils.checkNotNull(wallet, "wallet");
        this.account = account;
        this.payment = payment;
        this.wallet = wallet;
    }

    public Optional<? extends StageSendDestinationAccount> account() {
        return account;
    }

    public Optional<? extends StageSendDestinationPayment> payment() {
        return payment;
    }

    public Optional<? extends StageSendDestinationWallet> wallet() {
        return wallet;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StageSendDestination withAccount(StageSendDestinationAccount account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    public StageSendDestination withAccount(Optional<? extends StageSendDestinationAccount> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    public StageSendDestination withPayment(StageSendDestinationPayment payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = Optional.ofNullable(payment);
        return this;
    }

    public StageSendDestination withPayment(Optional<? extends StageSendDestinationPayment> payment) {
        Utils.checkNotNull(payment, "payment");
        this.payment = payment;
        return this;
    }

    public StageSendDestination withWallet(StageSendDestinationWallet wallet) {
        Utils.checkNotNull(wallet, "wallet");
        this.wallet = Optional.ofNullable(wallet);
        return this;
    }

    public StageSendDestination withWallet(Optional<? extends StageSendDestinationWallet> wallet) {
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
        StageSendDestination other = (StageSendDestination) o;
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
        return Utils.toString(StageSendDestination.class,
                "account", account,
                "payment", payment,
                "wallet", wallet);
    }
    
    public final static class Builder {
 
        private Optional<? extends StageSendDestinationAccount> account = Optional.empty();
 
        private Optional<? extends StageSendDestinationPayment> payment = Optional.empty();
 
        private Optional<? extends StageSendDestinationWallet> wallet = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(StageSendDestinationAccount account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        public Builder account(Optional<? extends StageSendDestinationAccount> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        public Builder payment(StageSendDestinationPayment payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = Optional.ofNullable(payment);
            return this;
        }

        public Builder payment(Optional<? extends StageSendDestinationPayment> payment) {
            Utils.checkNotNull(payment, "payment");
            this.payment = payment;
            return this;
        }

        public Builder wallet(StageSendDestinationWallet wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = Optional.ofNullable(wallet);
            return this;
        }

        public Builder wallet(Optional<? extends StageSendDestinationWallet> wallet) {
            Utils.checkNotNull(wallet, "wallet");
            this.wallet = wallet;
            return this;
        }
        
        public StageSendDestination build() {
            return new StageSendDestination(
                account,
                payment,
                wallet);
        }
    }
}

