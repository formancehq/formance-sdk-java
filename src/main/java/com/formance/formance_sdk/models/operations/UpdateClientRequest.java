/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class UpdateClientRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientRequest> updateClientRequest;

    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    private String clientId;

    @JsonCreator
    public UpdateClientRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientRequest> updateClientRequest,
            String clientId) {
        Utils.checkNotNull(updateClientRequest, "updateClientRequest");
        Utils.checkNotNull(clientId, "clientId");
        this.updateClientRequest = updateClientRequest;
        this.clientId = clientId;
    }
    
    public UpdateClientRequest(
            String clientId) {
        this(Optional.empty(), clientId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.UpdateClientRequest> updateClientRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.UpdateClientRequest>) updateClientRequest;
    }

    /**
     * Client ID
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateClientRequest withUpdateClientRequest(com.formance.formance_sdk.models.shared.UpdateClientRequest updateClientRequest) {
        Utils.checkNotNull(updateClientRequest, "updateClientRequest");
        this.updateClientRequest = Optional.ofNullable(updateClientRequest);
        return this;
    }

    public UpdateClientRequest withUpdateClientRequest(Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientRequest> updateClientRequest) {
        Utils.checkNotNull(updateClientRequest, "updateClientRequest");
        this.updateClientRequest = updateClientRequest;
        return this;
    }

    /**
     * Client ID
     */
    public UpdateClientRequest withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateClientRequest other = (UpdateClientRequest) o;
        return 
            java.util.Objects.deepEquals(this.updateClientRequest, other.updateClientRequest) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            updateClientRequest,
            clientId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateClientRequest.class,
                "updateClientRequest", updateClientRequest,
                "clientId", clientId);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientRequest> updateClientRequest = Optional.empty();
 
        private String clientId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder updateClientRequest(com.formance.formance_sdk.models.shared.UpdateClientRequest updateClientRequest) {
            Utils.checkNotNull(updateClientRequest, "updateClientRequest");
            this.updateClientRequest = Optional.ofNullable(updateClientRequest);
            return this;
        }

        public Builder updateClientRequest(Optional<? extends com.formance.formance_sdk.models.shared.UpdateClientRequest> updateClientRequest) {
            Utils.checkNotNull(updateClientRequest, "updateClientRequest");
            this.updateClientRequest = updateClientRequest;
            return this;
        }

        /**
         * Client ID
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }
        
        public UpdateClientRequest build() {
            return new UpdateClientRequest(
                updateClientRequest,
                clientId);
        }
    }
}

