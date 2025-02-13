/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk;
 

public class Webhooks {

    private final SDKConfiguration sdkConfiguration;
    private final SDKWebhooksV1 v1;

    Webhooks(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new SDKWebhooksV1(this.sdkConfiguration);
    }

    public final SDKWebhooksV1 v1() {
        return v1;
    }
}
