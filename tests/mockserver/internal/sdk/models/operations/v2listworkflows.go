// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type V2ListWorkflowsRequest struct {
	// Parameter used in pagination requests.
	// Set to the value of next for the next page of results.
	// Set to the value of previous for the previous page of results.
	// No other parameters can be set when this parameter is set.
	//
	Cursor *string `queryParam:"style=form,explode=true,name=cursor"`
	// The maximum number of results to return per page.
	//
	PageSize *int64 `queryParam:"style=form,explode=true,name=pageSize"`
}

func (o *V2ListWorkflowsRequest) GetCursor() *string {
	if o == nil {
		return nil
	}
	return o.Cursor
}

func (o *V2ListWorkflowsRequest) GetPageSize() *int64 {
	if o == nil {
		return nil
	}
	return o.PageSize
}

type V2ListWorkflowsResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// List of workflows
	V2ListWorkflowsResponse *components.V2ListWorkflowsResponse
}

func (o *V2ListWorkflowsResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *V2ListWorkflowsResponse) GetV2ListWorkflowsResponse() *components.V2ListWorkflowsResponse {
	if o == nil {
		return nil
	}
	return o.V2ListWorkflowsResponse
}
