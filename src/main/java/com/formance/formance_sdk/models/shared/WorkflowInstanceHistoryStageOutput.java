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

public class WorkflowInstanceHistoryStageOutput {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CreateTransaction")
    private Optional<? extends ActivityCreateTransactionOutput> createTransaction;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DebitWallet")
    private Optional<? extends ActivityDebitWalletOutput> debitWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetAccount")
    private Optional<? extends ActivityGetAccountOutput> getAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetPayment")
    private Optional<? extends ActivityGetPaymentOutput> getPayment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetWallet")
    private Optional<? extends ActivityGetWalletOutput> getWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ListWallets")
    private Optional<? extends OrchestrationListWalletsResponse> listWallets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("RevertTransaction")
    private Optional<? extends ActivityCreateTransactionOutput> revertTransaction;

    @JsonCreator
    public WorkflowInstanceHistoryStageOutput(
            @JsonProperty("CreateTransaction") Optional<? extends ActivityCreateTransactionOutput> createTransaction,
            @JsonProperty("DebitWallet") Optional<? extends ActivityDebitWalletOutput> debitWallet,
            @JsonProperty("GetAccount") Optional<? extends ActivityGetAccountOutput> getAccount,
            @JsonProperty("GetPayment") Optional<? extends ActivityGetPaymentOutput> getPayment,
            @JsonProperty("GetWallet") Optional<? extends ActivityGetWalletOutput> getWallet,
            @JsonProperty("ListWallets") Optional<? extends OrchestrationListWalletsResponse> listWallets,
            @JsonProperty("RevertTransaction") Optional<? extends ActivityCreateTransactionOutput> revertTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        Utils.checkNotNull(debitWallet, "debitWallet");
        Utils.checkNotNull(getAccount, "getAccount");
        Utils.checkNotNull(getPayment, "getPayment");
        Utils.checkNotNull(getWallet, "getWallet");
        Utils.checkNotNull(listWallets, "listWallets");
        Utils.checkNotNull(revertTransaction, "revertTransaction");
        this.createTransaction = createTransaction;
        this.debitWallet = debitWallet;
        this.getAccount = getAccount;
        this.getPayment = getPayment;
        this.getWallet = getWallet;
        this.listWallets = listWallets;
        this.revertTransaction = revertTransaction;
    }
    
    public WorkflowInstanceHistoryStageOutput() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityCreateTransactionOutput> createTransaction() {
        return (Optional<ActivityCreateTransactionOutput>) createTransaction;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityDebitWalletOutput> debitWallet() {
        return (Optional<ActivityDebitWalletOutput>) debitWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityGetAccountOutput> getAccount() {
        return (Optional<ActivityGetAccountOutput>) getAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityGetPaymentOutput> getPayment() {
        return (Optional<ActivityGetPaymentOutput>) getPayment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityGetWalletOutput> getWallet() {
        return (Optional<ActivityGetWalletOutput>) getWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrchestrationListWalletsResponse> listWallets() {
        return (Optional<OrchestrationListWalletsResponse>) listWallets;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActivityCreateTransactionOutput> revertTransaction() {
        return (Optional<ActivityCreateTransactionOutput>) revertTransaction;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public WorkflowInstanceHistoryStageOutput withCreateTransaction(ActivityCreateTransactionOutput createTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        this.createTransaction = Optional.ofNullable(createTransaction);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withCreateTransaction(Optional<? extends ActivityCreateTransactionOutput> createTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        this.createTransaction = createTransaction;
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withDebitWallet(ActivityDebitWalletOutput debitWallet) {
        Utils.checkNotNull(debitWallet, "debitWallet");
        this.debitWallet = Optional.ofNullable(debitWallet);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withDebitWallet(Optional<? extends ActivityDebitWalletOutput> debitWallet) {
        Utils.checkNotNull(debitWallet, "debitWallet");
        this.debitWallet = debitWallet;
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withGetAccount(ActivityGetAccountOutput getAccount) {
        Utils.checkNotNull(getAccount, "getAccount");
        this.getAccount = Optional.ofNullable(getAccount);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withGetAccount(Optional<? extends ActivityGetAccountOutput> getAccount) {
        Utils.checkNotNull(getAccount, "getAccount");
        this.getAccount = getAccount;
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withGetPayment(ActivityGetPaymentOutput getPayment) {
        Utils.checkNotNull(getPayment, "getPayment");
        this.getPayment = Optional.ofNullable(getPayment);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withGetPayment(Optional<? extends ActivityGetPaymentOutput> getPayment) {
        Utils.checkNotNull(getPayment, "getPayment");
        this.getPayment = getPayment;
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withGetWallet(ActivityGetWalletOutput getWallet) {
        Utils.checkNotNull(getWallet, "getWallet");
        this.getWallet = Optional.ofNullable(getWallet);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withGetWallet(Optional<? extends ActivityGetWalletOutput> getWallet) {
        Utils.checkNotNull(getWallet, "getWallet");
        this.getWallet = getWallet;
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withListWallets(OrchestrationListWalletsResponse listWallets) {
        Utils.checkNotNull(listWallets, "listWallets");
        this.listWallets = Optional.ofNullable(listWallets);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withListWallets(Optional<? extends OrchestrationListWalletsResponse> listWallets) {
        Utils.checkNotNull(listWallets, "listWallets");
        this.listWallets = listWallets;
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withRevertTransaction(ActivityCreateTransactionOutput revertTransaction) {
        Utils.checkNotNull(revertTransaction, "revertTransaction");
        this.revertTransaction = Optional.ofNullable(revertTransaction);
        return this;
    }

    public WorkflowInstanceHistoryStageOutput withRevertTransaction(Optional<? extends ActivityCreateTransactionOutput> revertTransaction) {
        Utils.checkNotNull(revertTransaction, "revertTransaction");
        this.revertTransaction = revertTransaction;
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
        WorkflowInstanceHistoryStageOutput other = (WorkflowInstanceHistoryStageOutput) o;
        return 
            Objects.deepEquals(this.createTransaction, other.createTransaction) &&
            Objects.deepEquals(this.debitWallet, other.debitWallet) &&
            Objects.deepEquals(this.getAccount, other.getAccount) &&
            Objects.deepEquals(this.getPayment, other.getPayment) &&
            Objects.deepEquals(this.getWallet, other.getWallet) &&
            Objects.deepEquals(this.listWallets, other.listWallets) &&
            Objects.deepEquals(this.revertTransaction, other.revertTransaction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createTransaction,
            debitWallet,
            getAccount,
            getPayment,
            getWallet,
            listWallets,
            revertTransaction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WorkflowInstanceHistoryStageOutput.class,
                "createTransaction", createTransaction,
                "debitWallet", debitWallet,
                "getAccount", getAccount,
                "getPayment", getPayment,
                "getWallet", getWallet,
                "listWallets", listWallets,
                "revertTransaction", revertTransaction);
    }
    
    public final static class Builder {
 
        private Optional<? extends ActivityCreateTransactionOutput> createTransaction = Optional.empty();
 
        private Optional<? extends ActivityDebitWalletOutput> debitWallet = Optional.empty();
 
        private Optional<? extends ActivityGetAccountOutput> getAccount = Optional.empty();
 
        private Optional<? extends ActivityGetPaymentOutput> getPayment = Optional.empty();
 
        private Optional<? extends ActivityGetWalletOutput> getWallet = Optional.empty();
 
        private Optional<? extends OrchestrationListWalletsResponse> listWallets = Optional.empty();
 
        private Optional<? extends ActivityCreateTransactionOutput> revertTransaction = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createTransaction(ActivityCreateTransactionOutput createTransaction) {
            Utils.checkNotNull(createTransaction, "createTransaction");
            this.createTransaction = Optional.ofNullable(createTransaction);
            return this;
        }

        public Builder createTransaction(Optional<? extends ActivityCreateTransactionOutput> createTransaction) {
            Utils.checkNotNull(createTransaction, "createTransaction");
            this.createTransaction = createTransaction;
            return this;
        }

        public Builder debitWallet(ActivityDebitWalletOutput debitWallet) {
            Utils.checkNotNull(debitWallet, "debitWallet");
            this.debitWallet = Optional.ofNullable(debitWallet);
            return this;
        }

        public Builder debitWallet(Optional<? extends ActivityDebitWalletOutput> debitWallet) {
            Utils.checkNotNull(debitWallet, "debitWallet");
            this.debitWallet = debitWallet;
            return this;
        }

        public Builder getAccount(ActivityGetAccountOutput getAccount) {
            Utils.checkNotNull(getAccount, "getAccount");
            this.getAccount = Optional.ofNullable(getAccount);
            return this;
        }

        public Builder getAccount(Optional<? extends ActivityGetAccountOutput> getAccount) {
            Utils.checkNotNull(getAccount, "getAccount");
            this.getAccount = getAccount;
            return this;
        }

        public Builder getPayment(ActivityGetPaymentOutput getPayment) {
            Utils.checkNotNull(getPayment, "getPayment");
            this.getPayment = Optional.ofNullable(getPayment);
            return this;
        }

        public Builder getPayment(Optional<? extends ActivityGetPaymentOutput> getPayment) {
            Utils.checkNotNull(getPayment, "getPayment");
            this.getPayment = getPayment;
            return this;
        }

        public Builder getWallet(ActivityGetWalletOutput getWallet) {
            Utils.checkNotNull(getWallet, "getWallet");
            this.getWallet = Optional.ofNullable(getWallet);
            return this;
        }

        public Builder getWallet(Optional<? extends ActivityGetWalletOutput> getWallet) {
            Utils.checkNotNull(getWallet, "getWallet");
            this.getWallet = getWallet;
            return this;
        }

        public Builder listWallets(OrchestrationListWalletsResponse listWallets) {
            Utils.checkNotNull(listWallets, "listWallets");
            this.listWallets = Optional.ofNullable(listWallets);
            return this;
        }

        public Builder listWallets(Optional<? extends OrchestrationListWalletsResponse> listWallets) {
            Utils.checkNotNull(listWallets, "listWallets");
            this.listWallets = listWallets;
            return this;
        }

        public Builder revertTransaction(ActivityCreateTransactionOutput revertTransaction) {
            Utils.checkNotNull(revertTransaction, "revertTransaction");
            this.revertTransaction = Optional.ofNullable(revertTransaction);
            return this;
        }

        public Builder revertTransaction(Optional<? extends ActivityCreateTransactionOutput> revertTransaction) {
            Utils.checkNotNull(revertTransaction, "revertTransaction");
            this.revertTransaction = revertTransaction;
            return this;
        }
        
        public WorkflowInstanceHistoryStageOutput build() {
            return new WorkflowInstanceHistoryStageOutput(
                createTransaction,
                debitWallet,
                getAccount,
                getPayment,
                getWallet,
                listWallets,
                revertTransaction);
        }
    }
}
