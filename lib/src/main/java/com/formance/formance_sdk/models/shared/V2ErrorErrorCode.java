/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum V2ErrorErrorCode {
    VALIDATION("VALIDATION"),
    NOT_FOUND("NOT_FOUND"),
    INTERNAL("INTERNAL");

    @JsonValue
    public final String value;

    private V2ErrorErrorCode(String value) {
        this.value = value;
    }
}