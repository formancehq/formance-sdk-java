/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum Scheme {
    VISA("visa"),
    MASTERCARD("mastercard"),
    AMEX("amex"),
    DINERS("diners"),
    DISCOVER("discover"),
    JCB("jcb"),
    UNIONPAY("unionpay"),
    SEPA_DEBIT("sepa debit"),
    SEPA_CREDIT("sepa credit"),
    SEPA("sepa"),
    APPLE_PAY("apple pay"),
    GOOGLE_PAY("google pay"),
    A2A("a2a"),
    ACH_DEBIT("ach debit"),
    ACH("ach"),
    RTP("rtp"),
    UNKNOWN("unknown"),
    OTHER("other");

    @JsonValue
    private final String value;

    private Scheme(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
