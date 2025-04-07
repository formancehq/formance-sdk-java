// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"fmt"
)

type OrchestrationPaymentStatus string

const (
	OrchestrationPaymentStatusPending    OrchestrationPaymentStatus = "PENDING"
	OrchestrationPaymentStatusActive     OrchestrationPaymentStatus = "ACTIVE"
	OrchestrationPaymentStatusTerminated OrchestrationPaymentStatus = "TERMINATED"
	OrchestrationPaymentStatusFailed     OrchestrationPaymentStatus = "FAILED"
	OrchestrationPaymentStatusSucceeded  OrchestrationPaymentStatus = "SUCCEEDED"
	OrchestrationPaymentStatusCancelled  OrchestrationPaymentStatus = "CANCELLED"
)

func (e OrchestrationPaymentStatus) ToPointer() *OrchestrationPaymentStatus {
	return &e
}
func (e *OrchestrationPaymentStatus) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "PENDING":
		fallthrough
	case "ACTIVE":
		fallthrough
	case "TERMINATED":
		fallthrough
	case "FAILED":
		fallthrough
	case "SUCCEEDED":
		fallthrough
	case "CANCELLED":
		*e = OrchestrationPaymentStatus(v)
		return nil
	default:
		return fmt.Errorf("invalid value for OrchestrationPaymentStatus: %v", v)
	}
}
