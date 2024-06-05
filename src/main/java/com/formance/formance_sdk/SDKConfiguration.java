/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk;

import com.formance.formance_sdk.utils.Hook.SdkInitData;
import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.utils.RetryConfig;
import com.formance.formance_sdk.models.shared.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    public String language = "java";
    public String openapiDocVersion = "v2.0.0-rc.32";
    public String sdkVersion = "2.4.1";
    public String genVersion = "2.338.12";
    public String userAgent = "speakeasy-sdk/java 2.4.1 2.338.12 v2.0.0-rc.32 com.formance.formance_sdk";

    private com.formance.formance_sdk.utils.Hooks _hooks = new com.formance.formance_sdk.utils.Hooks();

    public com.formance.formance_sdk.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(com.formance.formance_sdk.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        com.formance.formance_sdk.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
