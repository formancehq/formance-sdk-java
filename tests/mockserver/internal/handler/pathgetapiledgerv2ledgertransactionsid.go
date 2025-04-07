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

func pathGetAPILedgerV2LedgerTransactionsID(dir *logging.HTTPFileDirectory, rt *tracking.RequestTracker) http.HandlerFunc {
	return func(w http.ResponseWriter, req *http.Request) {
		test := req.Header.Get("x-speakeasy-test-name")
		instanceID := req.Header.Get("x-speakeasy-test-instance-id")

		count := rt.GetRequestCount(test, instanceID)

		switch fmt.Sprintf("%s[%d]", test, count) {
		case "v2GetTransaction[0]":
			dir.HandlerFunc("v2GetTransaction", testV2GetTransactionV2GetTransaction0)(w, req)
		default:
			http.Error(w, fmt.Sprintf("Unknown test: %s[%d]", test, count), http.StatusBadRequest)
		}
	}
}

func testV2GetTransactionV2GetTransaction0(w http.ResponseWriter, req *http.Request) {
	if err := assert.SecurityAuthorizationHeader(req, true, "Bearer"); err != nil {
		log.Printf("assertion error: %s\n", err)
		http.Error(w, err.Error(), http.StatusUnauthorized)
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
	respBody := &components.V2GetTransactionResponse{
		Data: components.V2Transaction{
			ID: big.NewInt(546228),
			Metadata: map[string]string{
				"admin": "true",
			},
			PostCommitEffectiveVolumes: map[string]map[string]components.V2Volume{
				"orders:1": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
				"orders:2": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
			},
			PostCommitVolumes: map[string]map[string]components.V2Volume{
				"orders:1": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
				"orders:2": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
			},
			Postings: []components.V2Posting{},
			PreCommitEffectiveVolumes: map[string]map[string]components.V2Volume{
				"orders:1": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
				"orders:2": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
			},
			PreCommitVolumes: map[string]map[string]components.V2Volume{
				"orders:1": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
				"orders:2": map[string]components.V2Volume{
					"USD": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
					"EUR": components.V2Volume{
						Balance: big.NewInt(80),
						Input:   big.NewInt(100),
						Output:  big.NewInt(20),
					},
				},
			},
			Reference: types.String("ref:001"),
			Reverted:  true,
			Timestamp: types.MustTimeFromString("2024-01-04T04:51:12.769Z"),
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
