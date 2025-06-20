/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Payments {

    private final SDKConfiguration sdkConfiguration;
    private final PaymentsV1 v1;
    private final V3 v3;

    Payments(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new PaymentsV1(this.sdkConfiguration);
        this.v3 = new V3(this.sdkConfiguration);
    }

    public final PaymentsV1 v1() {
        return v1;
    }

    public final V3 v3() {
        return v3;
    }
}
