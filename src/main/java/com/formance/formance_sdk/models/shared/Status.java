/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum Status {
    REJECTED("REJECTED"),
    VALIDATED("VALIDATED");

    @JsonValue
    private final String value;

    private Status(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Status> fromValue(String value) {
        for (Status o: Status.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

