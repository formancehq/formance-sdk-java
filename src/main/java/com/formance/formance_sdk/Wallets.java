/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Wallets {

    private final SDKConfiguration sdkConfiguration;
    private final WalletsV1 v1;

    Wallets(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new WalletsV1(this.sdkConfiguration);
    }

    public final WalletsV1 v1() {
        return v1;
    }
}
