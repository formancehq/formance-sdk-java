/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;

public class TestConfigRequestBuilder {

    private TestConfigRequest request;
    private final SDKMethodInterfaces.MethodCallTestConfig sdk;

    public TestConfigRequestBuilder(SDKMethodInterfaces.MethodCallTestConfig sdk) {
        this.sdk = sdk;
    }

    public TestConfigRequestBuilder request(com.formance.formance_sdk.models.operations.TestConfigRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public TestConfigResponse call() throws Exception {

        return sdk.testConfig(
            request);
    }
}
