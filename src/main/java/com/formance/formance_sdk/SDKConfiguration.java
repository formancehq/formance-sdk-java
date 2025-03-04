/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk;

import com.formance.formance_sdk.hooks.ClientCredentialsHook;
import com.formance.formance_sdk.hooks.SDKHooks;
import com.formance.formance_sdk.utils.HTTPClient;
import com.formance.formance_sdk.utils.Hook.SdkInitData;
import com.formance.formance_sdk.utils.Hooks;
import com.formance.formance_sdk.utils.RetryConfig;
import com.formance.formance_sdk.utils.Utils;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    
    public HTTPClient defaultClient;
    
    public String serverUrl;
    
    public String resolvedServerUrl() {
        return Utils.templateUrl(serverUrl, getServerVariableDefaults());
    }
    public int serverIdx = 0;
    @SuppressWarnings("serial")
    List<Map<String, String>> serverDefaults = new ArrayList<>(){ {
        add(new HashMap<>());
        add(new HashMap<>(){ {
            put("environment", "eu.sandbox");
            put("organization", "orgID-stackID");
        } });
    } };
    private static final String LANGUAGE = "java";
    public static final String OPENAPI_DOC_VERSION = "v3.0.0";
    public static final String SDK_VERSION = "5.0.1";
    public static final String GEN_VERSION = "2.539.0";
    private static final String BASE_PACKAGE = "com.formance.formance_sdk";
    public static final String USER_AGENT = 
            String.format("speakeasy-sdk/%s %s %s %s %s",
                LANGUAGE, SDK_VERSION, GEN_VERSION, OPENAPI_DOC_VERSION, BASE_PACKAGE);

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        {
            ClientCredentialsHook h = new ClientCredentialsHook();
            hooks.registerSdkInit(h);
            hooks.registerBeforeRequest(h);
            hooks.registerAfterError(h);
        }
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(resolvedServerUrl(), defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
     public Map<String, String> getServerVariableDefaults() {
         return serverDefaults.get(this.serverIdx);
     }
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
