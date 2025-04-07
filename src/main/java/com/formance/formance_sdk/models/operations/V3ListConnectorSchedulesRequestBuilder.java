/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.formance.formance_sdk.utils.Utils;
import java.lang.Exception;

public class V3ListConnectorSchedulesRequestBuilder {

    private V3ListConnectorSchedulesRequest request;
    private final SDKMethodInterfaces.MethodCallV3ListConnectorSchedules sdk;

    public V3ListConnectorSchedulesRequestBuilder(SDKMethodInterfaces.MethodCallV3ListConnectorSchedules sdk) {
        this.sdk = sdk;
    }

    public V3ListConnectorSchedulesRequestBuilder request(V3ListConnectorSchedulesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public V3ListConnectorSchedulesResponse call() throws Exception {

        return sdk.listConnectorSchedules(
            request);
    }
}
