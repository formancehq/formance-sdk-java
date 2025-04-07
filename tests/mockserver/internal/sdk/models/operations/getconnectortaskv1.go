// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type GetConnectorTaskV1Request struct {
	// The name of the connector.
	Connector components.Connector `pathParam:"style=simple,explode=false,name=connector"`
	// The connector ID.
	ConnectorID string `pathParam:"style=simple,explode=false,name=connectorId"`
	// The task ID.
	TaskID string `pathParam:"style=simple,explode=false,name=taskId"`
}

func (o *GetConnectorTaskV1Request) GetConnector() components.Connector {
	if o == nil {
		return components.Connector("")
	}
	return o.Connector
}

func (o *GetConnectorTaskV1Request) GetConnectorID() string {
	if o == nil {
		return ""
	}
	return o.ConnectorID
}

func (o *GetConnectorTaskV1Request) GetTaskID() string {
	if o == nil {
		return ""
	}
	return o.TaskID
}

type GetConnectorTaskV1Response struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// OK
	TaskResponse *components.TaskResponse
}

func (o *GetConnectorTaskV1Response) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *GetConnectorTaskV1Response) GetTaskResponse() *components.TaskResponse {
	if o == nil {
		return nil
	}
	return o.TaskResponse
}
