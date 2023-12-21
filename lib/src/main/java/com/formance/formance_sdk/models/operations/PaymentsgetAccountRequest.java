/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class PaymentsgetAccountRequest {
    /**
     * The account ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=accountId")
    public String accountId;

    public PaymentsgetAccountRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    
    public PaymentsgetAccountRequest(@JsonProperty("accountId") String accountId) {
        this.accountId = accountId;
  }
}