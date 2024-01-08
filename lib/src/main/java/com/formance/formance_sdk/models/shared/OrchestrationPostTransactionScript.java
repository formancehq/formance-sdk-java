/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrchestrationPostTransactionScript {
    @JsonProperty("plain")
    public String plain;

    public OrchestrationPostTransactionScript withPlain(String plain) {
        this.plain = plain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    public java.util.Map<String, Object> vars;

    public OrchestrationPostTransactionScript withVars(java.util.Map<String, Object> vars) {
        this.vars = vars;
        return this;
    }
    
    public OrchestrationPostTransactionScript(@JsonProperty("plain") String plain) {
        this.plain = plain;
  }
}
