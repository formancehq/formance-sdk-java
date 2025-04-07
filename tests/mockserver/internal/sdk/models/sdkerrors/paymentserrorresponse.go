// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package sdkerrors

import (
	"encoding/json"
	"mockserver/internal/sdk/models/components"
)

// PaymentsErrorResponse - Error
type PaymentsErrorResponse struct {
	ErrorCode    components.PaymentsErrorsEnum `json:"errorCode"`
	ErrorMessage string                        `json:"errorMessage"`
}

var _ error = &PaymentsErrorResponse{}

func (e *PaymentsErrorResponse) Error() string {
	data, _ := json.Marshal(e)
	return string(data)
}
