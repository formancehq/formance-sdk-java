// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type CreateWorkflowResponse struct {
	// Created workflow
	CreateWorkflowResponse *components.CreateWorkflowResponse
	HTTPMeta               components.HTTPMetadata `json:"-"`
}

func (o *CreateWorkflowResponse) GetCreateWorkflowResponse() *components.CreateWorkflowResponse {
	if o == nil {
		return nil
	}
	return o.CreateWorkflowResponse
}

func (o *CreateWorkflowResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}
