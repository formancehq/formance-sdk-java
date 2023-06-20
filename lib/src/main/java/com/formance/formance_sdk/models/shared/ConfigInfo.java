/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigInfo {
    @JsonProperty("config")
    public Config config;

    public ConfigInfo withConfig(Config config) {
        this.config = config;
        return this;
    }
    
    @JsonProperty("server")
    public String server;

    public ConfigInfo withServer(String server) {
        this.server = server;
        return this;
    }
    
    @JsonProperty("version")
    public String version;

    public ConfigInfo withVersion(String version) {
        this.version = version;
        return this;
    }
    
    public ConfigInfo(@JsonProperty("config") Config config, @JsonProperty("server") String server, @JsonProperty("version") String version) {
        this.config = config;
        this.server = server;
        this.version = version;
  }
}
