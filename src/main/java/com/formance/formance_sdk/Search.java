/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk;
public class Search {

    private final SDKConfiguration sdkConfiguration;
    private final SDKSearchV1 v1;

    Search(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new SDKSearchV1(this.sdkConfiguration);
    }

    public final SDKSearchV1 v1() {
        return v1;
    }
}
