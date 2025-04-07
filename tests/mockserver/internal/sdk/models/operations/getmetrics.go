// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type GetMetricsResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// OK
	Object map[string]any
}

func (o *GetMetricsResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *GetMetricsResponse) GetObject() map[string]any {
	if o == nil {
		return nil
	}
	return o.Object
}
