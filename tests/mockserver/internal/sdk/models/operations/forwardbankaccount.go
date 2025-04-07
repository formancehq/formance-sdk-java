// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type ForwardBankAccountRequest struct {
	ForwardBankAccountRequest components.ForwardBankAccountRequest `request:"mediaType=application/json"`
	// The bank account ID.
	BankAccountID string `pathParam:"style=simple,explode=false,name=bankAccountId"`
}

func (o *ForwardBankAccountRequest) GetForwardBankAccountRequest() components.ForwardBankAccountRequest {
	if o == nil {
		return components.ForwardBankAccountRequest{}
	}
	return o.ForwardBankAccountRequest
}

func (o *ForwardBankAccountRequest) GetBankAccountID() string {
	if o == nil {
		return ""
	}
	return o.BankAccountID
}

type ForwardBankAccountResponse struct {
	// OK
	BankAccountResponse *components.BankAccountResponse
	HTTPMeta            components.HTTPMetadata `json:"-"`
}

func (o *ForwardBankAccountResponse) GetBankAccountResponse() *components.BankAccountResponse {
	if o == nil {
		return nil
	}
	return o.BankAccountResponse
}

func (o *ForwardBankAccountResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}
