/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum V2LogType {
    NEW_TRANSACTION("NEW_TRANSACTION"),
    SET_METADATA("SET_METADATA"),
    REVERTED_TRANSACTION("REVERTED_TRANSACTION"),
    DELETE_METADATA("DELETE_METADATA");

    @JsonValue
    private final String value;

    private V2LogType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<V2LogType> fromValue(String value) {
        for (V2LogType o: V2LogType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

