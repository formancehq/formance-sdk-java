// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type V3ForwardBankAccountRequest struct {
	V3ForwardBankAccountRequest *components.V3ForwardBankAccountRequest `request:"mediaType=application/json"`
	// The bank account ID
	BankAccountID string `pathParam:"style=simple,explode=false,name=bankAccountID"`
}

func (o *V3ForwardBankAccountRequest) GetV3ForwardBankAccountRequest() *components.V3ForwardBankAccountRequest {
	if o == nil {
		return nil
	}
	return o.V3ForwardBankAccountRequest
}

func (o *V3ForwardBankAccountRequest) GetBankAccountID() string {
	if o == nil {
		return ""
	}
	return o.BankAccountID
}

type V3ForwardBankAccountResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
	// Accepted
	V3ForwardBankAccountResponse *components.V3ForwardBankAccountResponse
}

func (o *V3ForwardBankAccountResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}

func (o *V3ForwardBankAccountResponse) GetV3ForwardBankAccountResponse() *components.V3ForwardBankAccountResponse {
	if o == nil {
		return nil
	}
	return o.V3ForwardBankAccountResponse
}
