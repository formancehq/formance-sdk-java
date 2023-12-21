/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class DeletePoolRequest {
    /**
     * The pool ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=poolId")
    public String poolId;

    public DeletePoolRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }
    
    public DeletePoolRequest(@JsonProperty("poolId") String poolId) {
        this.poolId = poolId;
  }
}