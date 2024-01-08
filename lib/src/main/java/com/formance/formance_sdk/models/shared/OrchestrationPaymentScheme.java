/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrchestrationPaymentScheme {
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
    public final String value;

    private OrchestrationPaymentScheme(String value) {
        this.value = value;
    }
}
