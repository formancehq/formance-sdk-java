// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type DeleteTransferInitiationRequest struct {
	// The transfer ID.
	TransferID string `pathParam:"style=simple,explode=false,name=transferId"`
}

func (o *DeleteTransferInitiationRequest) GetTransferID() string {
	if o == nil {
		return ""
	}
	return o.TransferID
}

type DeleteTransferInitiationResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
}

func (o *DeleteTransferInitiationResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}
