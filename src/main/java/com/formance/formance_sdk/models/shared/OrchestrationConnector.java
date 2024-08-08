/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum OrchestrationConnector {
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

    private OrchestrationConnector(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
