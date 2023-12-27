/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LedgerInfo {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public LedgerInfo withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("storage")
    public LedgerInfoStorage storage;

    public LedgerInfo withStorage(LedgerInfoStorage storage) {
        this.storage = storage;
        return this;
    }
    
    public LedgerInfo(){}
}
