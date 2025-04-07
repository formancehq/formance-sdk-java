// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type WalletSubject struct {
	Balance    *string `json:"balance,omitempty"`
	Identifier string  `json:"identifier"`
	Type       string  `json:"type"`
}

func (o *WalletSubject) GetBalance() *string {
	if o == nil {
		return nil
	}
	return o.Balance
}

func (o *WalletSubject) GetIdentifier() string {
	if o == nil {
		return ""
	}
	return o.Identifier
}

func (o *WalletSubject) GetType() string {
	if o == nil {
		return ""
	}
	return o.Type
}
