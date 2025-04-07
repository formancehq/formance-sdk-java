// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"mockserver/internal/sdk/utils"
	"time"
)

type Descriptor struct {
	Key  *string `json:"key,omitempty"`
	Name *string `json:"name,omitempty"`
}

func (o *Descriptor) GetKey() *string {
	if o == nil {
		return nil
	}
	return o.Key
}

func (o *Descriptor) GetName() *string {
	if o == nil {
		return nil
	}
	return o.Name
}

type TaskBankingCircleState struct {
}

type TaskBankingCircle struct {
	ConnectorID string                  `json:"connectorID"`
	CreatedAt   time.Time               `json:"createdAt"`
	Descriptor  Descriptor              `json:"descriptor"`
	Error       *string                 `json:"error,omitempty"`
	ID          string                  `json:"id"`
	State       *TaskBankingCircleState `json:"state,omitempty"`
	Status      TaskStatus              `json:"status"`
	UpdatedAt   time.Time               `json:"updatedAt"`
}

func (t TaskBankingCircle) MarshalJSON() ([]byte, error) {
	return utils.MarshalJSON(t, "", false)
}

func (t *TaskBankingCircle) UnmarshalJSON(data []byte) error {
	if err := utils.UnmarshalJSON(data, &t, "", false, true); err != nil {
		return err
	}
	return nil
}

func (o *TaskBankingCircle) GetConnectorID() string {
	if o == nil {
		return ""
	}
	return o.ConnectorID
}

func (o *TaskBankingCircle) GetCreatedAt() time.Time {
	if o == nil {
		return time.Time{}
	}
	return o.CreatedAt
}

func (o *TaskBankingCircle) GetDescriptor() Descriptor {
	if o == nil {
		return Descriptor{}
	}
	return o.Descriptor
}

func (o *TaskBankingCircle) GetError() *string {
	if o == nil {
		return nil
	}
	return o.Error
}

func (o *TaskBankingCircle) GetID() string {
	if o == nil {
		return ""
	}
	return o.ID
}

func (o *TaskBankingCircle) GetState() *TaskBankingCircleState {
	if o == nil {
		return nil
	}
	return o.State
}

func (o *TaskBankingCircle) GetStatus() TaskStatus {
	if o == nil {
		return TaskStatus("")
	}
	return o.Status
}

func (o *TaskBankingCircle) GetUpdatedAt() time.Time {
	if o == nil {
		return time.Time{}
	}
	return o.UpdatedAt
}
