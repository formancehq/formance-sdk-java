/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum V2TargetType {
    TRANSACTION("TRANSACTION"),
    ACCOUNT("ACCOUNT");

    @JsonValue
    private final String value;

    private V2TargetType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
