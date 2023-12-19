/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Contract {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    public String account;

    public Contract withAccount(String account) {
        this.account = account;
        return this;
    }
    
    @JsonProperty("expr")
    public ContractExpr expr;

    public Contract withExpr(ContractExpr expr) {
        this.expr = expr;
        return this;
    }
    
    public Contract(@JsonProperty("expr") ContractExpr expr) {
        this.expr = expr;
  }
}
