// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type GetConnectorTaskRequest struct {
	// The name of the connector.
	Connector components.Connector `pathParam:"style=simple,explode=false,name=connector"`
	// The task ID.
	TaskID string `pathParam:"style=simple,explode=false,name=taskId"`
}

func (o *GetConnectorTaskRequest) GetConnector() components.Connector {
	if o == nil {
		return components.Connector("")
	}
	return o.Connector
}

func (o *GetConnectorTaskRequest) GetTaskID() string {
	if o == nil {
		return ""
	}
	return o.TaskID
}

type GetConnectorTaskResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// OK
	TaskResponse *components.TaskResponse
}

func (o *GetConnectorTaskResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *GetConnectorTaskResponse) GetTaskResponse() *components.TaskResponse {
	if o == nil {
		return nil
	}
	return o.TaskResponse
}
