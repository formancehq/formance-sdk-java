/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateBankAccountMetadataRequest {
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public UpdateBankAccountMetadataRequest withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public UpdateBankAccountMetadataRequest(@JsonProperty("metadata") java.util.Map<String, String> metadata) {
        this.metadata = metadata;
  }
}