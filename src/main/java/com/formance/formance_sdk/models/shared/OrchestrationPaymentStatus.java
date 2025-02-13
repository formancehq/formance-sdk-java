/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum OrchestrationPaymentStatus {
    PENDING("PENDING"),
    ACTIVE("ACTIVE"),
    TERMINATED("TERMINATED"),
    FAILED("FAILED"),
    SUCCEEDED("SUCCEEDED"),
    CANCELLED("CANCELLED");

    @JsonValue
    private final String value;

    private OrchestrationPaymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<OrchestrationPaymentStatus> fromValue(String value) {
        for (OrchestrationPaymentStatus o: OrchestrationPaymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
