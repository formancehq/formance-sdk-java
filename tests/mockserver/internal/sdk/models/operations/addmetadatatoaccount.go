// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type AddMetadataToAccountRequest struct {
	// metadata
	RequestBody map[string]any `request:"mediaType=application/json"`
	// Exact address of the account. It must match the following regular expressions pattern:
	// ```
	// ^\w+(:\w+)*$
	// ```
	//
	Address string `pathParam:"style=simple,explode=false,name=address"`
	// Name of the ledger.
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
}

func (o *AddMetadataToAccountRequest) GetRequestBody() map[string]any {
	if o == nil {
		return nil
	}
	return o.RequestBody
}

func (o *AddMetadataToAccountRequest) GetAddress() string {
	if o == nil {
		return ""
	}
	return o.Address
}

func (o *AddMetadataToAccountRequest) GetLedger() string {
	if o == nil {
		return ""
	}
	return o.Ledger
}

type AddMetadataToAccountResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
}

func (o *AddMetadataToAccountResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}
