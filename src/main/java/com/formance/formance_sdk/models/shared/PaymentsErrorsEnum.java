/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum PaymentsErrorsEnum {
    INTERNAL("INTERNAL"),
    VALIDATION("VALIDATION"),
    NOT_FOUND("NOT_FOUND");

    @JsonValue
    private final String value;

    private PaymentsErrorsEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
