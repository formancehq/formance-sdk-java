/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class InstallConnectorRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Object requestBody;

    public InstallConnectorRequest withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    public com.formance.formance_sdk.models.shared.Connector connector;

    public InstallConnectorRequest withConnector(com.formance.formance_sdk.models.shared.Connector connector) {
        this.connector = connector;
        return this;
    }
    
    public InstallConnectorRequest(@JsonProperty("RequestBody") Object requestBody, @JsonProperty("connector") com.formance.formance_sdk.models.shared.Connector connector) {
        this.requestBody = requestBody;
        this.connector = connector;
  }
}
