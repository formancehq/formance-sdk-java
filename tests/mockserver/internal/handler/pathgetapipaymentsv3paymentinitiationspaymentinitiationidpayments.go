// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package handler

import (
	"fmt"
	"log"
	"math/big"
	"mockserver/internal/handler/assert"
	"mockserver/internal/logging"
	"mockserver/internal/sdk/models/components"
	"mockserver/internal/sdk/types"
	"mockserver/internal/sdk/utils"
	"mockserver/internal/tracking"
	"net/http"
)

func pathGetAPIPaymentsV3PaymentInitiationsPaymentInitiationIDPayments(dir *logging.HTTPFileDirectory, rt *tracking.RequestTracker) http.HandlerFunc {
	return func(w http.ResponseWriter, req *http.Request) {
		test := req.Header.Get("x-speakeasy-test-name")
		instanceID := req.Header.Get("x-speakeasy-test-instance-id")

		count := rt.GetRequestCount(test, instanceID)

		switch fmt.Sprintf("%s[%d]", test, count) {
		case "v3ListPaymentInitiationRelatedPayments[0]":
			dir.HandlerFunc("v3ListPaymentInitiationRelatedPayments", testV3ListPaymentInitiationRelatedPaymentsV3ListPaymentInitiationRelatedPayments0)(w, req)
		default:
			http.Error(w, fmt.Sprintf("Unknown test: %s[%d]", test, count), http.StatusBadRequest)
		}
	}
}

func testV3ListPaymentInitiationRelatedPaymentsV3ListPaymentInitiationRelatedPayments0(w http.ResponseWriter, req *http.Request) {
	if err := assert.SecurityAuthorizationHeader(req, true, "Bearer"); err != nil {
		log.Printf("assertion error: %s\n", err)
		http.Error(w, err.Error(), http.StatusUnauthorized)
		return
	}
	if err := assert.ContentType(req, "application/json", false); err != nil {
		log.Printf("assertion error: %s\n", err)
		http.Error(w, err.Error(), http.StatusBadRequest)
		return
	}
	if err := assert.AcceptHeader(req, []string{"application/json"}); err != nil {
		log.Printf("assertion error: %s\n", err)
		http.Error(w, err.Error(), http.StatusBadRequest)
		return
	}
	if err := assert.HeaderExists(req, "User-Agent"); err != nil {
		log.Printf("assertion error: %s\n", err)
		http.Error(w, err.Error(), http.StatusBadRequest)
		return
	}
	respBody := &components.V3PaymentInitiationRelatedPaymentsCursorResponse{
		Cursor: components.V3PaymentInitiationRelatedPaymentsCursorResponseCursor{
			Data: []components.V3Payment{
				components.V3Payment{
					Amount:        big.NewInt(576099),
					Asset:         "<value>",
					ConnectorID:   "<value>",
					CreatedAt:     types.MustTimeFromString("2024-11-01T18:01:53.016Z"),
					ID:            "<id>",
					InitialAmount: big.NewInt(927729),
					Provider:      "<value>",
					Reference:     "<value>",
					Scheme:        "<value>",
					Status:        components.V3PaymentStatusEnumCaptureFailed,
					Type:          components.V3PaymentTypeEnumPayout,
				},
			},
			HasMore:  false,
			Next:     types.String(""),
			PageSize: 15,
			Previous: types.String("YXVsdCBhbmQgYSBtYXhpbXVtIG1heF9yZXN1bHRzLol="),
		},
	}
	respBodyBytes, err := utils.MarshalJSON(respBody, "", true)

	if err != nil {
		http.Error(
			w,
			"Unable to encode response body as JSON: "+err.Error(),
			http.StatusInternalServerError,
		)
		return
	}
	w.Header().Set("Content-Type", "application/json")
	w.WriteHeader(http.StatusOK)
	_, _ = w.Write(respBodyBytes)
}
