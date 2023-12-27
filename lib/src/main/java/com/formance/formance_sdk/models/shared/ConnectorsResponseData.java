/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConnectorsResponseData {
    @JsonProperty("connectorID")
    public String connectorID;

    public ConnectorsResponseData withConnectorID(String connectorID) {
        this.connectorID = connectorID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    public Boolean enabled;

    public ConnectorsResponseData withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public ConnectorsResponseData withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("provider")
    public Connector provider;

    public ConnectorsResponseData withProvider(Connector provider) {
        this.provider = provider;
        return this;
    }
    
    public ConnectorsResponseData(@JsonProperty("connectorID") String connectorID, @JsonProperty("name") String name, @JsonProperty("provider") Connector provider) {
        this.connectorID = connectorID;
        this.name = name;
        this.provider = provider;
  }
}
