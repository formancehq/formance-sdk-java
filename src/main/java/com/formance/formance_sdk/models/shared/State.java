/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum State {
    TO_DO("TO DO"),
    DONE("DONE");

    @JsonValue
    private final String value;

    private State(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<State> fromValue(String value) {
        for (State o: State.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

