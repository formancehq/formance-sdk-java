/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.errors;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum ErrorCode {
    VALIDATION("VALIDATION"),
    NOT_FOUND("NOT_FOUND"),
    INTERNAL("INTERNAL");

    @JsonValue
    private final String value;

    private ErrorCode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ErrorCode> fromValue(String value) {
        for (ErrorCode o: ErrorCode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
