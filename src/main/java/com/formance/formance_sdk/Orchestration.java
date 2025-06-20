/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Orchestration {

    private final SDKConfiguration sdkConfiguration;
    private final OrchestrationV1 v1;
    private final OrchestrationV2 v2;

    Orchestration(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new OrchestrationV1(this.sdkConfiguration);
        this.v2 = new OrchestrationV2(this.sdkConfiguration);
    }

    public final OrchestrationV1 v1() {
        return v1;
    }

    public final OrchestrationV2 v2() {
        return v2;
    }
}
