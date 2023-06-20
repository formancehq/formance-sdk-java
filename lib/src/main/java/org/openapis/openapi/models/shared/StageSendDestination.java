/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StageSendDestination {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    public StageSendDestinationAccount account;

    public StageSendDestination withAccount(StageSendDestinationAccount account) {
        this.account = account;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment")
    public StageSendDestinationPayment payment;

    public StageSendDestination withPayment(StageSendDestinationPayment payment) {
        this.payment = payment;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wallet")
    public StageSendDestinationWallet wallet;

    public StageSendDestination withWallet(StageSendDestinationWallet wallet) {
        this.wallet = wallet;
        return this;
    }
    
    public StageSendDestination(){}
}
