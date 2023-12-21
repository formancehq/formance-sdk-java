/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class ReadTriggerRequest {
    /**
     * The trigger id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=triggerID")
    public String triggerID;

    public ReadTriggerRequest withTriggerID(String triggerID) {
        this.triggerID = triggerID;
        return this;
    }
    
    public ReadTriggerRequest(@JsonProperty("triggerID") String triggerID) {
        this.triggerID = triggerID;
  }
}
