// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type V3GetConnectorConfigRequest struct {
	// The connector ID
	ConnectorID string `pathParam:"style=simple,explode=false,name=connectorID"`
}

func (o *V3GetConnectorConfigRequest) GetConnectorID() string {
	if o == nil {
		return ""
	}
	return o.ConnectorID
}

type V3GetConnectorConfigResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// OK
	V3GetConnectorConfigResponse *components.V3GetConnectorConfigResponse
}

func (o *V3GetConnectorConfigResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *V3GetConnectorConfigResponse) GetV3GetConnectorConfigResponse() *components.V3GetConnectorConfigResponse {
	if o == nil {
		return nil
	}
	return o.V3GetConnectorConfigResponse
}
