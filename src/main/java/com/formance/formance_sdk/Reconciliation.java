/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Reconciliation {

    private final SDKConfiguration sdkConfiguration;
    private final SDKReconciliationV1 v1;

    Reconciliation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new SDKReconciliationV1(this.sdkConfiguration);
    }

    public final SDKReconciliationV1 v1() {
        return v1;
    }
}
