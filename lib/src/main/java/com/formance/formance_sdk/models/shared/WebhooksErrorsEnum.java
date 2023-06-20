/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WebhooksErrorsEnum {
    INTERNAL("INTERNAL"),
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    VALIDATION("VALIDATION"),
    CONFLICT("CONFLICT"),
    NO_SCRIPT("NO_SCRIPT"),
    COMPILATION_FAILED("COMPILATION_FAILED"),
    METADATA_OVERRIDE("METADATA_OVERRIDE"),
    NOT_FOUND("NOT_FOUND"),
    CONTEXT_CANCELLED("CONTEXT_CANCELLED"),
    STORE("STORE");

    @JsonValue
    public final String value;

    private WebhooksErrorsEnum(String value) {
        this.value = value;
    }
}
