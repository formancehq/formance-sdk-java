/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;

public class ConnectorsTransferRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.formance.formance_sdk.models.shared.TransferRequest transferRequest;

    public ConnectorsTransferRequest withTransferRequest(com.formance.formance_sdk.models.shared.TransferRequest transferRequest) {
        this.transferRequest = transferRequest;
        return this;
    }
    
    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    public com.formance.formance_sdk.models.shared.Connector connector;

    public ConnectorsTransferRequest withConnector(com.formance.formance_sdk.models.shared.Connector connector) {
        this.connector = connector;
        return this;
    }
    
    public ConnectorsTransferRequest(@JsonProperty("TransferRequest") com.formance.formance_sdk.models.shared.TransferRequest transferRequest, @JsonProperty("connector") com.formance.formance_sdk.models.shared.Connector connector) {
        this.transferRequest = transferRequest;
        this.connector = connector;
  }
}
