// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"mockserver/internal/sdk/models/components"
)

type CreditWalletRequest struct {
	CreditWalletRequest *components.CreditWalletRequest `request:"mediaType=application/json"`
	// Use an idempotency key
	IdempotencyKey *string `header:"style=simple,explode=false,name=Idempotency-Key"`
	ID             string  `pathParam:"style=simple,explode=false,name=id"`
}

func (o *CreditWalletRequest) GetCreditWalletRequest() *components.CreditWalletRequest {
	if o == nil {
		return nil
	}
	return o.CreditWalletRequest
}

func (o *CreditWalletRequest) GetIdempotencyKey() *string {
	if o == nil {
		return nil
	}
	return o.IdempotencyKey
}

func (o *CreditWalletRequest) GetID() string {
	if o == nil {
		return ""
	}
	return o.ID
}

type CreditWalletResponse struct {
	HTTPMeta components.HTTPMetadata `json:"-"`
}

func (o *CreditWalletResponse) GetHTTPMeta() components.HTTPMetadata {
	if o == nil {
		return components.HTTPMetadata{}
	}
	return o.HTTPMeta
}
