// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type CreateBalanceResponse struct {
	Data CreateBalanceRequest `json:"data"`
}

func (o *CreateBalanceResponse) GetData() CreateBalanceRequest {
	if o == nil {
		return CreateBalanceRequest{}
	}
	return o.Data
}
