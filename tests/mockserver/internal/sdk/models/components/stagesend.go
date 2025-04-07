// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"mockserver/internal/sdk/utils"
	"time"
)

type StageSend struct {
	Amount      *Monetary             `json:"amount,omitempty"`
	Destination *StageSendDestination `json:"destination,omitempty"`
	Metadata    map[string]string     `json:"metadata,omitempty"`
	Source      *StageSendSource      `json:"source,omitempty"`
	Timestamp   *time.Time            `json:"timestamp,omitempty"`
}

func (s StageSend) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(s, "", false)
}

func (s *StageSend) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &s, "", false, true); err != nil {
		return err
	}
	return nil
}

func (o *StageSend) GetAmount() *Monetary {
	if o == nil {
		return nil
	}
	return o.Amount
}

func (o *StageSend) GetDestination() *StageSendDestination {
	if o == nil {
		return nil
	}
	return o.Destination
}

func (o *StageSend) GetMetadata() map[string]string {
	if o == nil {
		return nil
	}
	return o.Metadata
}

func (o *StageSend) GetSource() *StageSendSource {
	if o == nil {
		return nil
	}
	return o.Source
}

func (o *StageSend) GetTimestamp() *time.Time {
	if o == nil {
		return nil
	}
	return o.Timestamp
}
