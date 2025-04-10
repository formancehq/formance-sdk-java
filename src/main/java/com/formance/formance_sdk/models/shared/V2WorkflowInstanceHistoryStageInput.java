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

public class V2WorkflowInstanceHistoryStageInput {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("AddAccountMetadata")
    private Optional<? extends V2ActivityAddAccountMetadata> addAccountMetadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ConfirmHold")
    private Optional<? extends V2ActivityConfirmHold> confirmHold;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CreateTransaction")
    private Optional<? extends V2ActivityCreateTransaction> createTransaction;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CreditWallet")
    private Optional<? extends V2ActivityCreditWallet> creditWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DebitWallet")
    private Optional<? extends V2ActivityDebitWallet> debitWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetAccount")
    private Optional<? extends V2ActivityGetAccount> getAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetPayment")
    private Optional<? extends V2ActivityGetPayment> getPayment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetWallet")
    private Optional<? extends V2ActivityGetWallet> getWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ListWallets")
    private Optional<? extends V2ActivityListWallets> listWallets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("StripeTransfer")
    private Optional<? extends V2ActivityStripeTransfer> stripeTransfer;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("VoidHold")
    private Optional<? extends V2ActivityVoidHold> voidHold;

    @JsonCreator
    public V2WorkflowInstanceHistoryStageInput(
            @JsonProperty("AddAccountMetadata") Optional<? extends V2ActivityAddAccountMetadata> addAccountMetadata,
            @JsonProperty("ConfirmHold") Optional<? extends V2ActivityConfirmHold> confirmHold,
            @JsonProperty("CreateTransaction") Optional<? extends V2ActivityCreateTransaction> createTransaction,
            @JsonProperty("CreditWallet") Optional<? extends V2ActivityCreditWallet> creditWallet,
            @JsonProperty("DebitWallet") Optional<? extends V2ActivityDebitWallet> debitWallet,
            @JsonProperty("GetAccount") Optional<? extends V2ActivityGetAccount> getAccount,
            @JsonProperty("GetPayment") Optional<? extends V2ActivityGetPayment> getPayment,
            @JsonProperty("GetWallet") Optional<? extends V2ActivityGetWallet> getWallet,
            @JsonProperty("ListWallets") Optional<? extends V2ActivityListWallets> listWallets,
            @JsonProperty("StripeTransfer") Optional<? extends V2ActivityStripeTransfer> stripeTransfer,
            @JsonProperty("VoidHold") Optional<? extends V2ActivityVoidHold> voidHold) {
        Utils.checkNotNull(addAccountMetadata, "addAccountMetadata");
        Utils.checkNotNull(confirmHold, "confirmHold");
        Utils.checkNotNull(createTransaction, "createTransaction");
        Utils.checkNotNull(creditWallet, "creditWallet");
        Utils.checkNotNull(debitWallet, "debitWallet");
        Utils.checkNotNull(getAccount, "getAccount");
        Utils.checkNotNull(getPayment, "getPayment");
        Utils.checkNotNull(getWallet, "getWallet");
        Utils.checkNotNull(listWallets, "listWallets");
        Utils.checkNotNull(stripeTransfer, "stripeTransfer");
        Utils.checkNotNull(voidHold, "voidHold");
        this.addAccountMetadata = addAccountMetadata;
        this.confirmHold = confirmHold;
        this.createTransaction = createTransaction;
        this.creditWallet = creditWallet;
        this.debitWallet = debitWallet;
        this.getAccount = getAccount;
        this.getPayment = getPayment;
        this.getWallet = getWallet;
        this.listWallets = listWallets;
        this.stripeTransfer = stripeTransfer;
        this.voidHold = voidHold;
    }
    
    public V2WorkflowInstanceHistoryStageInput() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityAddAccountMetadata> addAccountMetadata() {
        return (Optional<V2ActivityAddAccountMetadata>) addAccountMetadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityConfirmHold> confirmHold() {
        return (Optional<V2ActivityConfirmHold>) confirmHold;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityCreateTransaction> createTransaction() {
        return (Optional<V2ActivityCreateTransaction>) createTransaction;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityCreditWallet> creditWallet() {
        return (Optional<V2ActivityCreditWallet>) creditWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityDebitWallet> debitWallet() {
        return (Optional<V2ActivityDebitWallet>) debitWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityGetAccount> getAccount() {
        return (Optional<V2ActivityGetAccount>) getAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityGetPayment> getPayment() {
        return (Optional<V2ActivityGetPayment>) getPayment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityGetWallet> getWallet() {
        return (Optional<V2ActivityGetWallet>) getWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityListWallets> listWallets() {
        return (Optional<V2ActivityListWallets>) listWallets;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityStripeTransfer> stripeTransfer() {
        return (Optional<V2ActivityStripeTransfer>) stripeTransfer;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityVoidHold> voidHold() {
        return (Optional<V2ActivityVoidHold>) voidHold;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2WorkflowInstanceHistoryStageInput withAddAccountMetadata(V2ActivityAddAccountMetadata addAccountMetadata) {
        Utils.checkNotNull(addAccountMetadata, "addAccountMetadata");
        this.addAccountMetadata = Optional.ofNullable(addAccountMetadata);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withAddAccountMetadata(Optional<? extends V2ActivityAddAccountMetadata> addAccountMetadata) {
        Utils.checkNotNull(addAccountMetadata, "addAccountMetadata");
        this.addAccountMetadata = addAccountMetadata;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withConfirmHold(V2ActivityConfirmHold confirmHold) {
        Utils.checkNotNull(confirmHold, "confirmHold");
        this.confirmHold = Optional.ofNullable(confirmHold);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withConfirmHold(Optional<? extends V2ActivityConfirmHold> confirmHold) {
        Utils.checkNotNull(confirmHold, "confirmHold");
        this.confirmHold = confirmHold;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withCreateTransaction(V2ActivityCreateTransaction createTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        this.createTransaction = Optional.ofNullable(createTransaction);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withCreateTransaction(Optional<? extends V2ActivityCreateTransaction> createTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        this.createTransaction = createTransaction;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withCreditWallet(V2ActivityCreditWallet creditWallet) {
        Utils.checkNotNull(creditWallet, "creditWallet");
        this.creditWallet = Optional.ofNullable(creditWallet);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withCreditWallet(Optional<? extends V2ActivityCreditWallet> creditWallet) {
        Utils.checkNotNull(creditWallet, "creditWallet");
        this.creditWallet = creditWallet;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withDebitWallet(V2ActivityDebitWallet debitWallet) {
        Utils.checkNotNull(debitWallet, "debitWallet");
        this.debitWallet = Optional.ofNullable(debitWallet);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withDebitWallet(Optional<? extends V2ActivityDebitWallet> debitWallet) {
        Utils.checkNotNull(debitWallet, "debitWallet");
        this.debitWallet = debitWallet;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withGetAccount(V2ActivityGetAccount getAccount) {
        Utils.checkNotNull(getAccount, "getAccount");
        this.getAccount = Optional.ofNullable(getAccount);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withGetAccount(Optional<? extends V2ActivityGetAccount> getAccount) {
        Utils.checkNotNull(getAccount, "getAccount");
        this.getAccount = getAccount;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withGetPayment(V2ActivityGetPayment getPayment) {
        Utils.checkNotNull(getPayment, "getPayment");
        this.getPayment = Optional.ofNullable(getPayment);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withGetPayment(Optional<? extends V2ActivityGetPayment> getPayment) {
        Utils.checkNotNull(getPayment, "getPayment");
        this.getPayment = getPayment;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withGetWallet(V2ActivityGetWallet getWallet) {
        Utils.checkNotNull(getWallet, "getWallet");
        this.getWallet = Optional.ofNullable(getWallet);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withGetWallet(Optional<? extends V2ActivityGetWallet> getWallet) {
        Utils.checkNotNull(getWallet, "getWallet");
        this.getWallet = getWallet;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withListWallets(V2ActivityListWallets listWallets) {
        Utils.checkNotNull(listWallets, "listWallets");
        this.listWallets = Optional.ofNullable(listWallets);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withListWallets(Optional<? extends V2ActivityListWallets> listWallets) {
        Utils.checkNotNull(listWallets, "listWallets");
        this.listWallets = listWallets;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withStripeTransfer(V2ActivityStripeTransfer stripeTransfer) {
        Utils.checkNotNull(stripeTransfer, "stripeTransfer");
        this.stripeTransfer = Optional.ofNullable(stripeTransfer);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withStripeTransfer(Optional<? extends V2ActivityStripeTransfer> stripeTransfer) {
        Utils.checkNotNull(stripeTransfer, "stripeTransfer");
        this.stripeTransfer = stripeTransfer;
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withVoidHold(V2ActivityVoidHold voidHold) {
        Utils.checkNotNull(voidHold, "voidHold");
        this.voidHold = Optional.ofNullable(voidHold);
        return this;
    }

    public V2WorkflowInstanceHistoryStageInput withVoidHold(Optional<? extends V2ActivityVoidHold> voidHold) {
        Utils.checkNotNull(voidHold, "voidHold");
        this.voidHold = voidHold;
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
        V2WorkflowInstanceHistoryStageInput other = (V2WorkflowInstanceHistoryStageInput) o;
        return 
            Objects.deepEquals(this.addAccountMetadata, other.addAccountMetadata) &&
            Objects.deepEquals(this.confirmHold, other.confirmHold) &&
            Objects.deepEquals(this.createTransaction, other.createTransaction) &&
            Objects.deepEquals(this.creditWallet, other.creditWallet) &&
            Objects.deepEquals(this.debitWallet, other.debitWallet) &&
            Objects.deepEquals(this.getAccount, other.getAccount) &&
            Objects.deepEquals(this.getPayment, other.getPayment) &&
            Objects.deepEquals(this.getWallet, other.getWallet) &&
            Objects.deepEquals(this.listWallets, other.listWallets) &&
            Objects.deepEquals(this.stripeTransfer, other.stripeTransfer) &&
            Objects.deepEquals(this.voidHold, other.voidHold);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addAccountMetadata,
            confirmHold,
            createTransaction,
            creditWallet,
            debitWallet,
            getAccount,
            getPayment,
            getWallet,
            listWallets,
            stripeTransfer,
            voidHold);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2WorkflowInstanceHistoryStageInput.class,
                "addAccountMetadata", addAccountMetadata,
                "confirmHold", confirmHold,
                "createTransaction", createTransaction,
                "creditWallet", creditWallet,
                "debitWallet", debitWallet,
                "getAccount", getAccount,
                "getPayment", getPayment,
                "getWallet", getWallet,
                "listWallets", listWallets,
                "stripeTransfer", stripeTransfer,
                "voidHold", voidHold);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2ActivityAddAccountMetadata> addAccountMetadata = Optional.empty();
 
        private Optional<? extends V2ActivityConfirmHold> confirmHold = Optional.empty();
 
        private Optional<? extends V2ActivityCreateTransaction> createTransaction = Optional.empty();
 
        private Optional<? extends V2ActivityCreditWallet> creditWallet = Optional.empty();
 
        private Optional<? extends V2ActivityDebitWallet> debitWallet = Optional.empty();
 
        private Optional<? extends V2ActivityGetAccount> getAccount = Optional.empty();
 
        private Optional<? extends V2ActivityGetPayment> getPayment = Optional.empty();
 
        private Optional<? extends V2ActivityGetWallet> getWallet = Optional.empty();
 
        private Optional<? extends V2ActivityListWallets> listWallets = Optional.empty();
 
        private Optional<? extends V2ActivityStripeTransfer> stripeTransfer = Optional.empty();
 
        private Optional<? extends V2ActivityVoidHold> voidHold = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder addAccountMetadata(V2ActivityAddAccountMetadata addAccountMetadata) {
            Utils.checkNotNull(addAccountMetadata, "addAccountMetadata");
            this.addAccountMetadata = Optional.ofNullable(addAccountMetadata);
            return this;
        }

        public Builder addAccountMetadata(Optional<? extends V2ActivityAddAccountMetadata> addAccountMetadata) {
            Utils.checkNotNull(addAccountMetadata, "addAccountMetadata");
            this.addAccountMetadata = addAccountMetadata;
            return this;
        }

        public Builder confirmHold(V2ActivityConfirmHold confirmHold) {
            Utils.checkNotNull(confirmHold, "confirmHold");
            this.confirmHold = Optional.ofNullable(confirmHold);
            return this;
        }

        public Builder confirmHold(Optional<? extends V2ActivityConfirmHold> confirmHold) {
            Utils.checkNotNull(confirmHold, "confirmHold");
            this.confirmHold = confirmHold;
            return this;
        }

        public Builder createTransaction(V2ActivityCreateTransaction createTransaction) {
            Utils.checkNotNull(createTransaction, "createTransaction");
            this.createTransaction = Optional.ofNullable(createTransaction);
            return this;
        }

        public Builder createTransaction(Optional<? extends V2ActivityCreateTransaction> createTransaction) {
            Utils.checkNotNull(createTransaction, "createTransaction");
            this.createTransaction = createTransaction;
            return this;
        }

        public Builder creditWallet(V2ActivityCreditWallet creditWallet) {
            Utils.checkNotNull(creditWallet, "creditWallet");
            this.creditWallet = Optional.ofNullable(creditWallet);
            return this;
        }

        public Builder creditWallet(Optional<? extends V2ActivityCreditWallet> creditWallet) {
            Utils.checkNotNull(creditWallet, "creditWallet");
            this.creditWallet = creditWallet;
            return this;
        }

        public Builder debitWallet(V2ActivityDebitWallet debitWallet) {
            Utils.checkNotNull(debitWallet, "debitWallet");
            this.debitWallet = Optional.ofNullable(debitWallet);
            return this;
        }

        public Builder debitWallet(Optional<? extends V2ActivityDebitWallet> debitWallet) {
            Utils.checkNotNull(debitWallet, "debitWallet");
            this.debitWallet = debitWallet;
            return this;
        }

        public Builder getAccount(V2ActivityGetAccount getAccount) {
            Utils.checkNotNull(getAccount, "getAccount");
            this.getAccount = Optional.ofNullable(getAccount);
            return this;
        }

        public Builder getAccount(Optional<? extends V2ActivityGetAccount> getAccount) {
            Utils.checkNotNull(getAccount, "getAccount");
            this.getAccount = getAccount;
            return this;
        }

        public Builder getPayment(V2ActivityGetPayment getPayment) {
            Utils.checkNotNull(getPayment, "getPayment");
            this.getPayment = Optional.ofNullable(getPayment);
            return this;
        }

        public Builder getPayment(Optional<? extends V2ActivityGetPayment> getPayment) {
            Utils.checkNotNull(getPayment, "getPayment");
            this.getPayment = getPayment;
            return this;
        }

        public Builder getWallet(V2ActivityGetWallet getWallet) {
            Utils.checkNotNull(getWallet, "getWallet");
            this.getWallet = Optional.ofNullable(getWallet);
            return this;
        }

        public Builder getWallet(Optional<? extends V2ActivityGetWallet> getWallet) {
            Utils.checkNotNull(getWallet, "getWallet");
            this.getWallet = getWallet;
            return this;
        }

        public Builder listWallets(V2ActivityListWallets listWallets) {
            Utils.checkNotNull(listWallets, "listWallets");
            this.listWallets = Optional.ofNullable(listWallets);
            return this;
        }

        public Builder listWallets(Optional<? extends V2ActivityListWallets> listWallets) {
            Utils.checkNotNull(listWallets, "listWallets");
            this.listWallets = listWallets;
            return this;
        }

        public Builder stripeTransfer(V2ActivityStripeTransfer stripeTransfer) {
            Utils.checkNotNull(stripeTransfer, "stripeTransfer");
            this.stripeTransfer = Optional.ofNullable(stripeTransfer);
            return this;
        }

        public Builder stripeTransfer(Optional<? extends V2ActivityStripeTransfer> stripeTransfer) {
            Utils.checkNotNull(stripeTransfer, "stripeTransfer");
            this.stripeTransfer = stripeTransfer;
            return this;
        }

        public Builder voidHold(V2ActivityVoidHold voidHold) {
            Utils.checkNotNull(voidHold, "voidHold");
            this.voidHold = Optional.ofNullable(voidHold);
            return this;
        }

        public Builder voidHold(Optional<? extends V2ActivityVoidHold> voidHold) {
            Utils.checkNotNull(voidHold, "voidHold");
            this.voidHold = voidHold;
            return this;
        }
        
        public V2WorkflowInstanceHistoryStageInput build() {
            return new V2WorkflowInstanceHistoryStageInput(
                addAccountMetadata,
                confirmHold,
                createTransaction,
                creditWallet,
                debitWallet,
                getAccount,
                getPayment,
                getWallet,
                listWallets,
                stripeTransfer,
                voidHold);
        }
    }
}
