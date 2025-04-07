// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

type V2ActivityAddAccountMetadata struct {
	ID       string            `json:"id"`
	Ledger   string            `json:"ledger"`
	Metadata map[string]string `json:"metadata"`
}

func (o *V2ActivityAddAccountMetadata) GetID() string {
	if o == nil {
		return ""
	}
	return o.ID
}

func (o *V2ActivityAddAccountMetadata) GetLedger() string {
	if o == nil {
		return ""
	}
	return o.Ledger
}

func (o *V2ActivityAddAccountMetadata) GetMetadata() map[string]string {
	if o == nil {
		return map[string]string{}
	}
	return o.Metadata
}
