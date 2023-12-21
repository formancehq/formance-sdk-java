/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class V2WorkflowInstanceHistoryStageOutput {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("CreateTransaction")
    public V2ActivityCreateTransactionOutput createTransaction;

    public V2WorkflowInstanceHistoryStageOutput withCreateTransaction(V2ActivityCreateTransactionOutput createTransaction) {
        this.createTransaction = createTransaction;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("DebitWallet")
    public V2ActivityDebitWalletOutput debitWallet;

    public V2WorkflowInstanceHistoryStageOutput withDebitWallet(V2ActivityDebitWalletOutput debitWallet) {
        this.debitWallet = debitWallet;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetAccount")
    public V2ActivityGetAccountOutput getAccount;

    public V2WorkflowInstanceHistoryStageOutput withGetAccount(V2ActivityGetAccountOutput getAccount) {
        this.getAccount = getAccount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetPayment")
    public V2ActivityGetPaymentOutput getPayment;

    public V2WorkflowInstanceHistoryStageOutput withGetPayment(V2ActivityGetPaymentOutput getPayment) {
        this.getPayment = getPayment;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("GetWallet")
    public V2ActivityGetWalletOutput getWallet;

    public V2WorkflowInstanceHistoryStageOutput withGetWallet(V2ActivityGetWalletOutput getWallet) {
        this.getWallet = getWallet;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ListWallets")
    public V2ListWalletsResponse listWallets;

    public V2WorkflowInstanceHistoryStageOutput withListWallets(V2ListWalletsResponse listWallets) {
        this.listWallets = listWallets;
        return this;
    }
    
    public V2WorkflowInstanceHistoryStageOutput(){}
}
