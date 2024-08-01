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

public enum V2Connector {
    STRIPE("STRIPE"),
    DUMMY_PAY("DUMMY-PAY"),
    WISE("WISE"),
    MODULR("MODULR"),
    CURRENCY_CLOUD("CURRENCY-CLOUD"),
    BANKING_CIRCLE("BANKING-CIRCLE"),
    MANGOPAY("MANGOPAY"),
    MONEYCORP("MONEYCORP");

    @JsonValue
    private final String value;

    private V2Connector(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
