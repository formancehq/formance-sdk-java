/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk;

import com.formance.formance_sdk.models.operations.SDKMethodInterfaces.*; 

public class Auth {

    private final SDKConfiguration sdkConfiguration;
    private final V1 v1;

    Auth(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.v1 = new V1(this.sdkConfiguration);
    }

    public final V1 v1() {
        return v1;
    }
}
