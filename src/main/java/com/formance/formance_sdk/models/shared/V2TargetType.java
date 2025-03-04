/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    
    public static Optional<V2TargetType> fromValue(String value) {
        for (V2TargetType o: V2TargetType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
