/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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

public class CreateSecretRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretRequest> createSecretRequest;

    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    private String clientId;

    @JsonCreator
    public CreateSecretRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretRequest> createSecretRequest,
            String clientId) {
        Utils.checkNotNull(createSecretRequest, "createSecretRequest");
        Utils.checkNotNull(clientId, "clientId");
        this.createSecretRequest = createSecretRequest;
        this.clientId = clientId;
    }
    
    public CreateSecretRequest(
            String clientId) {
        this(Optional.empty(), clientId);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.CreateSecretRequest> createSecretRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.CreateSecretRequest>) createSecretRequest;
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

    public CreateSecretRequest withCreateSecretRequest(com.formance.formance_sdk.models.shared.CreateSecretRequest createSecretRequest) {
        Utils.checkNotNull(createSecretRequest, "createSecretRequest");
        this.createSecretRequest = Optional.ofNullable(createSecretRequest);
        return this;
    }

    public CreateSecretRequest withCreateSecretRequest(Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretRequest> createSecretRequest) {
        Utils.checkNotNull(createSecretRequest, "createSecretRequest");
        this.createSecretRequest = createSecretRequest;
        return this;
    }

    /**
     * Client ID
     */
    public CreateSecretRequest withClientId(String clientId) {
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
        CreateSecretRequest other = (CreateSecretRequest) o;
        return 
            java.util.Objects.deepEquals(this.createSecretRequest, other.createSecretRequest) &&
            java.util.Objects.deepEquals(this.clientId, other.clientId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createSecretRequest,
            clientId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSecretRequest.class,
                "createSecretRequest", createSecretRequest,
                "clientId", clientId);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretRequest> createSecretRequest = Optional.empty();
 
        private String clientId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createSecretRequest(com.formance.formance_sdk.models.shared.CreateSecretRequest createSecretRequest) {
            Utils.checkNotNull(createSecretRequest, "createSecretRequest");
            this.createSecretRequest = Optional.ofNullable(createSecretRequest);
            return this;
        }

        public Builder createSecretRequest(Optional<? extends com.formance.formance_sdk.models.shared.CreateSecretRequest> createSecretRequest) {
            Utils.checkNotNull(createSecretRequest, "createSecretRequest");
            this.createSecretRequest = createSecretRequest;
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
        
        public CreateSecretRequest build() {
            return new CreateSecretRequest(
                createSecretRequest,
                clientId);
        }
    }
}

