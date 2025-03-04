/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum PaymentStatus {
    PENDING("PENDING"),
    SUCCEEDED("SUCCEEDED"),
    CANCELLED("CANCELLED"),
    FAILED("FAILED"),
    EXPIRED("EXPIRED"),
    REFUNDED("REFUNDED"),
    REFUNDED_FAILURE("REFUNDED_FAILURE"),
    DISPUTE("DISPUTE"),
    DISPUTE_WON("DISPUTE_WON"),
    DISPUTE_LOST("DISPUTE_LOST"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private PaymentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentStatus> fromValue(String value) {
        for (PaymentStatus o: PaymentStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
