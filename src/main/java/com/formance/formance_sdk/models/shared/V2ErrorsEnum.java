/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public enum V2ErrorsEnum {
    INTERNAL("INTERNAL"),
    INSUFFICIENT_FUND("INSUFFICIENT_FUND"),
    VALIDATION("VALIDATION"),
    CONFLICT("CONFLICT"),
    COMPILATION_FAILED("COMPILATION_FAILED"),
    METADATA_OVERRIDE("METADATA_OVERRIDE"),
    NOT_FOUND("NOT_FOUND"),
    REVERT_OCCURRING("REVERT_OCCURRING"),
    ALREADY_REVERT("ALREADY_REVERT"),
    NO_POSTINGS("NO_POSTINGS"),
    LEDGER_NOT_FOUND("LEDGER_NOT_FOUND");

    @JsonValue
    private final String value;

    private V2ErrorsEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
