/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

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
}
