// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type V2SendEventRequestBody struct {
	Name string `json:"name"`
}

func (o *V2SendEventRequestBody) GetName() string {
	if o == nil {
		return ""
	}
	return o.Name
}

type V2SendEventRequest struct {
	RequestBody *V2SendEventRequestBody `request:"mediaType=application/json"`
	// The instance id
	InstanceID string `pathParam:"style=simple,explode=false,name=instanceID"`
}

func (o *V2SendEventRequest) GetRequestBody() *V2SendEventRequestBody {
	if o == nil {
		return nil
	}
	return o.RequestBody
}

func (o *V2SendEventRequest) GetInstanceID() string {
	if o == nil {
		return ""
	}
	return o.InstanceID
}

type V2SendEventResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
}

func (o *V2SendEventResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}
