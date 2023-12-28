/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum V2ErrorsEnum {
    INTERNAL("INTERNAL"),
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    VALIDATION("VALIDATION"),
    CONFLICT("CONFLICT"),
    COMPILATION_FAILED("COMPILATION_FAILED"),
    METADATA_OVERRIDE("METADATA_OVERRIDE"),
    NOT_FOUND("NOT_FOUND"),
    REVERT_OCCURRING("REVERT_OCCURRING"),
    ALREADY_REVERT("ALREADY_REVERT"),
    NO_POSTINGS("NO_POSTINGS");

    @JsonValue
    public final String value;

    private V2ErrorsEnum(String value) {
        this.value = value;
    }
}
