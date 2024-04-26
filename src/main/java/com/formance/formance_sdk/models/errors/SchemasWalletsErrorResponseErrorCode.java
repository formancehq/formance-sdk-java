/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.errors;

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

public enum SchemasWalletsErrorResponseErrorCode {
    VALIDATION("VALIDATION"),
    INTERNAL_ERROR("INTERNAL_ERROR"),
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    HOLD_CLOSED("HOLD_CLOSED");

    @JsonValue
    private final String value;

    private SchemasWalletsErrorResponseErrorCode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
