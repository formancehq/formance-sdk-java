// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package components

import (
	"encoding/json"
	"errors"
	"fmt"
	"mockserver/internal/sdk/utils"
)

type V2BulkElementType string

const (
	V2BulkElementTypeAddMetadata       V2BulkElementType = "ADD_METADATA"
	V2BulkElementTypeCreateTransaction V2BulkElementType = "CREATE_TRANSACTION"
	V2BulkElementTypeDeleteMetadata    V2BulkElementType = "DELETE_METADATA"
	V2BulkElementTypeRevertTransaction V2BulkElementType = "REVERT_TRANSACTION"
)

type V2BulkElement struct {
	V2BulkElementCreateTransaction *V2BulkElementCreateTransaction
	V2BulkElementAddMetadata       *V2BulkElementAddMetadata
	V2BulkElementRevertTransaction *V2BulkElementRevertTransaction
	V2BulkElementDeleteMetadata    *V2BulkElementDeleteMetadata

	Type V2BulkElementType
}

func CreateV2BulkElementAddMetadata(addMetadata V2BulkElementAddMetadata) V2BulkElement {
	typ := V2BulkElementTypeAddMetadata

	typStr := string(typ)
	addMetadata.Action = typStr

	return V2BulkElement{
		V2BulkElementAddMetadata: &addMetadata,
		Type:                     typ,
	}
}

func CreateV2BulkElementCreateTransaction(createTransaction V2BulkElementCreateTransaction) V2BulkElement {
	typ := V2BulkElementTypeCreateTransaction

	typStr := string(typ)
	createTransaction.Action = typStr

	return V2BulkElement{
		V2BulkElementCreateTransaction: &createTransaction,
		Type:                           typ,
	}
}

func CreateV2BulkElementDeleteMetadata(deleteMetadata V2BulkElementDeleteMetadata) V2BulkElement {
	typ := V2BulkElementTypeDeleteMetadata

	typStr := string(typ)
	deleteMetadata.Action = typStr

	return V2BulkElement{
		V2BulkElementDeleteMetadata: &deleteMetadata,
		Type:                        typ,
	}
}

func CreateV2BulkElementRevertTransaction(revertTransaction V2BulkElementRevertTransaction) V2BulkElement {
	typ := V2BulkElementTypeRevertTransaction

	typStr := string(typ)
	revertTransaction.Action = typStr

	return V2BulkElement{
		V2BulkElementRevertTransaction: &revertTransaction,
		Type:                           typ,
	}
}

func (u *V2BulkElement) UnmarshalJSON(data []byte) error {

	type discriminator struct {
		Action string `json:"action"`
	}

	dis := new(discriminator)
	if err := json.Unmarshal(data, &dis); err != nil {
		return fmt.Errorf("could not unmarshal discriminator: %w", err)
	}

	switch dis.Action {
	case "ADD_METADATA":
		v2BulkElementAddMetadata := new(V2BulkElementAddMetadata)
		if err := utils.UnmarshalJSON(data, &v2BulkElementAddMetadata, "", true, false); err != nil {
			return fmt.Errorf("could not unmarshal `%s` into expected (Action == ADD_METADATA) type V2BulkElementAddMetadata within V2BulkElement: %w", string(data), err)
		}

		u.V2BulkElementAddMetadata = v2BulkElementAddMetadata
		u.Type = V2BulkElementTypeAddMetadata
		return nil
	case "CREATE_TRANSACTION":
		v2BulkElementCreateTransaction := new(V2BulkElementCreateTransaction)
		if err := utils.UnmarshalJSON(data, &v2BulkElementCreateTransaction, "", true, false); err != nil {
			return fmt.Errorf("could not unmarshal `%s` into expected (Action == CREATE_TRANSACTION) type V2BulkElementCreateTransaction within V2BulkElement: %w", string(data), err)
		}

		u.V2BulkElementCreateTransaction = v2BulkElementCreateTransaction
		u.Type = V2BulkElementTypeCreateTransaction
		return nil
	case "DELETE_METADATA":
		v2BulkElementDeleteMetadata := new(V2BulkElementDeleteMetadata)
		if err := utils.UnmarshalJSON(data, &v2BulkElementDeleteMetadata, "", true, false); err != nil {
			return fmt.Errorf("could not unmarshal `%s` into expected (Action == DELETE_METADATA) type V2BulkElementDeleteMetadata within V2BulkElement: %w", string(data), err)
		}

		u.V2BulkElementDeleteMetadata = v2BulkElementDeleteMetadata
		u.Type = V2BulkElementTypeDeleteMetadata
		return nil
	case "REVERT_TRANSACTION":
		v2BulkElementRevertTransaction := new(V2BulkElementRevertTransaction)
		if err := utils.UnmarshalJSON(data, &v2BulkElementRevertTransaction, "", true, false); err != nil {
			return fmt.Errorf("could not unmarshal `%s` into expected (Action == REVERT_TRANSACTION) type V2BulkElementRevertTransaction within V2BulkElement: %w", string(data), err)
		}

		u.V2BulkElementRevertTransaction = v2BulkElementRevertTransaction
		u.Type = V2BulkElementTypeRevertTransaction
		return nil
	}

	return fmt.Errorf("could not unmarshal `%s` into any supported union types for V2BulkElement", string(data))
}

func (u V2BulkElement) MarshalJSON() ([]byte, error) {
	if u.V2BulkElementCreateTransaction != nil {
		return utils.MarshalJSON(u.V2BulkElementCreateTransaction, "", true)
	}

	if u.V2BulkElementAddMetadata != nil {
		return utils.MarshalJSON(u.V2BulkElementAddMetadata, "", true)
	}

	if u.V2BulkElementRevertTransaction != nil {
		return utils.MarshalJSON(u.V2BulkElementRevertTransaction, "", true)
	}

	if u.V2BulkElementDeleteMetadata != nil {
		return utils.MarshalJSON(u.V2BulkElementDeleteMetadata, "", true)
	}

	return nil, errors.New("could not marshal union type V2BulkElement: all fields are null")
}
