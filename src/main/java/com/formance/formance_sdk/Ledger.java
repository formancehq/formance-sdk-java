/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Ledger {

    private final SDKConfiguration sdkConfiguration;
    private final LedgerV2 v2;
    private final LedgerV1 v1;

    Ledger(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v2 = new LedgerV2(this.sdkConfiguration);
        this.v1 = new LedgerV1(this.sdkConfiguration);
    }

    public final LedgerV2 v2() {
        return v2;
    }

    public final LedgerV1 v1() {
        return v1;
    }
}
