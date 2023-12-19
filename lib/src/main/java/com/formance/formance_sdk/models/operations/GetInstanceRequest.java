/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class GetInstanceRequest {
    /**
     * The instance id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=instanceID")
    public String instanceID;

    public GetInstanceRequest withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    
    public GetInstanceRequest(@JsonProperty("instanceID") String instanceID) {
        this.instanceID = instanceID;
  }
}
