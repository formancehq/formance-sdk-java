/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Orchestration {

    private final SDKConfiguration sdkConfiguration;
    private final SDKOrchestrationV1 v1;
    private final SDKV2 v2;

    Orchestration(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new SDKOrchestrationV1(this.sdkConfiguration);
        this.v2 = new SDKV2(this.sdkConfiguration);
    }

    public final SDKOrchestrationV1 v1() {
        return v1;
    }

    public final SDKV2 v2() {
        return v2;
    }
}
