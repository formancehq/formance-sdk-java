// Package custom helpers provides utilities to easy usage of Formance API.
// This file is NOT auto-generated and can be freely modified.
package com.formance.formance_sdk.utils.custom_helpers;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class PaymentsAccountId {
    /**
         * Creates an account ID string
         * @param connectorId The ID of the connector
         * @param reference   The identifier of the account from the connector's provider.
         * @return The identifier for Formance payments account.
         * @throws IllegalArgumentException if connectorId or reference is null/blank, or if connectorId is invalid.
         * 
    */
    public static String Build(String connectorId, String reference) {
        if (connectorId == null || connectorId.isBlank()) {
            throw new IllegalArgumentException("connectorId must not be null or blank");
        }
        if (reference == null || reference.isBlank()) {
            throw new IllegalArgumentException("reference must not be null or blank");
        }

        String connectorIdJson = new String(Base64.getDecoder().decode(connectorId), StandardCharsets.UTF_8);
        String json = String.format("{\"ConnectorID\":%s,\"Reference\":\"%s\"}", connectorIdJson, reference.replace("\\", "\\\\").replace("\"", "\\\""));

        try {
            return Base64.getEncoder().withoutPadding().encodeToString(json.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to build account ID. Please check if the connectorId is valid.", e);
        }
    }
}
