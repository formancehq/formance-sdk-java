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

public class V2WorkflowInstanceHistoryStageOutput {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CreateTransaction")
    private Optional<? extends V2ActivityCreateTransactionOutput> createTransaction;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DebitWallet")
    private Optional<? extends V2ActivityDebitWalletOutput> debitWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetAccount")
    private Optional<? extends V2ActivityGetAccountOutput> getAccount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetPayment")
    private Optional<? extends V2ActivityGetPaymentOutput> getPayment;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetWallet")
    private Optional<? extends V2ActivityGetWalletOutput> getWallet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ListWallets")
    private Optional<? extends V2ListWalletsResponse> listWallets;

    @JsonCreator
    public V2WorkflowInstanceHistoryStageOutput(
            @JsonProperty("CreateTransaction") Optional<? extends V2ActivityCreateTransactionOutput> createTransaction,
            @JsonProperty("DebitWallet") Optional<? extends V2ActivityDebitWalletOutput> debitWallet,
            @JsonProperty("GetAccount") Optional<? extends V2ActivityGetAccountOutput> getAccount,
            @JsonProperty("GetPayment") Optional<? extends V2ActivityGetPaymentOutput> getPayment,
            @JsonProperty("GetWallet") Optional<? extends V2ActivityGetWalletOutput> getWallet,
            @JsonProperty("ListWallets") Optional<? extends V2ListWalletsResponse> listWallets) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        Utils.checkNotNull(debitWallet, "debitWallet");
        Utils.checkNotNull(getAccount, "getAccount");
        Utils.checkNotNull(getPayment, "getPayment");
        Utils.checkNotNull(getWallet, "getWallet");
        Utils.checkNotNull(listWallets, "listWallets");
        this.createTransaction = createTransaction;
        this.debitWallet = debitWallet;
        this.getAccount = getAccount;
        this.getPayment = getPayment;
        this.getWallet = getWallet;
        this.listWallets = listWallets;
    }
    
    public V2WorkflowInstanceHistoryStageOutput() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityCreateTransactionOutput> createTransaction() {
        return (Optional<V2ActivityCreateTransactionOutput>) createTransaction;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityDebitWalletOutput> debitWallet() {
        return (Optional<V2ActivityDebitWalletOutput>) debitWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityGetAccountOutput> getAccount() {
        return (Optional<V2ActivityGetAccountOutput>) getAccount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityGetPaymentOutput> getPayment() {
        return (Optional<V2ActivityGetPaymentOutput>) getPayment;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ActivityGetWalletOutput> getWallet() {
        return (Optional<V2ActivityGetWalletOutput>) getWallet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2ListWalletsResponse> listWallets() {
        return (Optional<V2ListWalletsResponse>) listWallets;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2WorkflowInstanceHistoryStageOutput withCreateTransaction(V2ActivityCreateTransactionOutput createTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        this.createTransaction = Optional.ofNullable(createTransaction);
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withCreateTransaction(Optional<? extends V2ActivityCreateTransactionOutput> createTransaction) {
        Utils.checkNotNull(createTransaction, "createTransaction");
        this.createTransaction = createTransaction;
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withDebitWallet(V2ActivityDebitWalletOutput debitWallet) {
        Utils.checkNotNull(debitWallet, "debitWallet");
        this.debitWallet = Optional.ofNullable(debitWallet);
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withDebitWallet(Optional<? extends V2ActivityDebitWalletOutput> debitWallet) {
        Utils.checkNotNull(debitWallet, "debitWallet");
        this.debitWallet = debitWallet;
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withGetAccount(V2ActivityGetAccountOutput getAccount) {
        Utils.checkNotNull(getAccount, "getAccount");
        this.getAccount = Optional.ofNullable(getAccount);
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withGetAccount(Optional<? extends V2ActivityGetAccountOutput> getAccount) {
        Utils.checkNotNull(getAccount, "getAccount");
        this.getAccount = getAccount;
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withGetPayment(V2ActivityGetPaymentOutput getPayment) {
        Utils.checkNotNull(getPayment, "getPayment");
        this.getPayment = Optional.ofNullable(getPayment);
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withGetPayment(Optional<? extends V2ActivityGetPaymentOutput> getPayment) {
        Utils.checkNotNull(getPayment, "getPayment");
        this.getPayment = getPayment;
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withGetWallet(V2ActivityGetWalletOutput getWallet) {
        Utils.checkNotNull(getWallet, "getWallet");
        this.getWallet = Optional.ofNullable(getWallet);
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withGetWallet(Optional<? extends V2ActivityGetWalletOutput> getWallet) {
        Utils.checkNotNull(getWallet, "getWallet");
        this.getWallet = getWallet;
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withListWallets(V2ListWalletsResponse listWallets) {
        Utils.checkNotNull(listWallets, "listWallets");
        this.listWallets = Optional.ofNullable(listWallets);
        return this;
    }

    public V2WorkflowInstanceHistoryStageOutput withListWallets(Optional<? extends V2ListWalletsResponse> listWallets) {
        Utils.checkNotNull(listWallets, "listWallets");
        this.listWallets = listWallets;
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
        V2WorkflowInstanceHistoryStageOutput other = (V2WorkflowInstanceHistoryStageOutput) o;
        return 
            Objects.deepEquals(this.createTransaction, other.createTransaction) &&
            Objects.deepEquals(this.debitWallet, other.debitWallet) &&
            Objects.deepEquals(this.getAccount, other.getAccount) &&
            Objects.deepEquals(this.getPayment, other.getPayment) &&
            Objects.deepEquals(this.getWallet, other.getWallet) &&
            Objects.deepEquals(this.listWallets, other.listWallets);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createTransaction,
            debitWallet,
            getAccount,
            getPayment,
            getWallet,
            listWallets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2WorkflowInstanceHistoryStageOutput.class,
                "createTransaction", createTransaction,
                "debitWallet", debitWallet,
                "getAccount", getAccount,
                "getPayment", getPayment,
                "getWallet", getWallet,
                "listWallets", listWallets);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2ActivityCreateTransactionOutput> createTransaction = Optional.empty();
 
        private Optional<? extends V2ActivityDebitWalletOutput> debitWallet = Optional.empty();
 
        private Optional<? extends V2ActivityGetAccountOutput> getAccount = Optional.empty();
 
        private Optional<? extends V2ActivityGetPaymentOutput> getPayment = Optional.empty();
 
        private Optional<? extends V2ActivityGetWalletOutput> getWallet = Optional.empty();
 
        private Optional<? extends V2ListWalletsResponse> listWallets = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createTransaction(V2ActivityCreateTransactionOutput createTransaction) {
            Utils.checkNotNull(createTransaction, "createTransaction");
            this.createTransaction = Optional.ofNullable(createTransaction);
            return this;
        }

        public Builder createTransaction(Optional<? extends V2ActivityCreateTransactionOutput> createTransaction) {
            Utils.checkNotNull(createTransaction, "createTransaction");
            this.createTransaction = createTransaction;
            return this;
        }

        public Builder debitWallet(V2ActivityDebitWalletOutput debitWallet) {
            Utils.checkNotNull(debitWallet, "debitWallet");
            this.debitWallet = Optional.ofNullable(debitWallet);
            return this;
        }

        public Builder debitWallet(Optional<? extends V2ActivityDebitWalletOutput> debitWallet) {
            Utils.checkNotNull(debitWallet, "debitWallet");
            this.debitWallet = debitWallet;
            return this;
        }

        public Builder getAccount(V2ActivityGetAccountOutput getAccount) {
            Utils.checkNotNull(getAccount, "getAccount");
            this.getAccount = Optional.ofNullable(getAccount);
            return this;
        }

        public Builder getAccount(Optional<? extends V2ActivityGetAccountOutput> getAccount) {
            Utils.checkNotNull(getAccount, "getAccount");
            this.getAccount = getAccount;
            return this;
        }

        public Builder getPayment(V2ActivityGetPaymentOutput getPayment) {
            Utils.checkNotNull(getPayment, "getPayment");
            this.getPayment = Optional.ofNullable(getPayment);
            return this;
        }

        public Builder getPayment(Optional<? extends V2ActivityGetPaymentOutput> getPayment) {
            Utils.checkNotNull(getPayment, "getPayment");
            this.getPayment = getPayment;
            return this;
        }

        public Builder getWallet(V2ActivityGetWalletOutput getWallet) {
            Utils.checkNotNull(getWallet, "getWallet");
            this.getWallet = Optional.ofNullable(getWallet);
            return this;
        }

        public Builder getWallet(Optional<? extends V2ActivityGetWalletOutput> getWallet) {
            Utils.checkNotNull(getWallet, "getWallet");
            this.getWallet = getWallet;
            return this;
        }

        public Builder listWallets(V2ListWalletsResponse listWallets) {
            Utils.checkNotNull(listWallets, "listWallets");
            this.listWallets = Optional.ofNullable(listWallets);
            return this;
        }

        public Builder listWallets(Optional<? extends V2ListWalletsResponse> listWallets) {
            Utils.checkNotNull(listWallets, "listWallets");
            this.listWallets = listWallets;
            return this;
        }
        
        public V2WorkflowInstanceHistoryStageOutput build() {
            return new V2WorkflowInstanceHistoryStageOutput(
                createTransaction,
                debitWallet,
                getAccount,
                getPayment,
                getWallet,
                listWallets);
        }
    }
}

