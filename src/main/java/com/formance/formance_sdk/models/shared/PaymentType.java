/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum PaymentType {
    PAY_IN("PAY-IN"),
    PAYOUT("PAYOUT"),
    TRANSFER("TRANSFER"),
    OTHER("OTHER");

    @JsonValue
    private final String value;

    private PaymentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PaymentType> fromValue(String value) {
        for (PaymentType o: PaymentType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
