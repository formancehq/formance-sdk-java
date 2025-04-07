/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class V3InstallConnectorRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.V3InstallConnectorRequest> v3InstallConnectorRequest;

    /**
     * The connector to filter by
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    private String connector;

    @JsonCreator
    public V3InstallConnectorRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.V3InstallConnectorRequest> v3InstallConnectorRequest,
            String connector) {
        Utils.checkNotNull(v3InstallConnectorRequest, "v3InstallConnectorRequest");
        Utils.checkNotNull(connector, "connector");
        this.v3InstallConnectorRequest = v3InstallConnectorRequest;
        this.connector = connector;
    }
    
    public V3InstallConnectorRequest(
            String connector) {
        this(Optional.empty(), connector);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V3InstallConnectorRequest> v3InstallConnectorRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.V3InstallConnectorRequest>) v3InstallConnectorRequest;
    }

    /**
     * The connector to filter by
     */
    @JsonIgnore
    public String connector() {
        return connector;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3InstallConnectorRequest withV3InstallConnectorRequest(com.formance.formance_sdk.models.shared.V3InstallConnectorRequest v3InstallConnectorRequest) {
        Utils.checkNotNull(v3InstallConnectorRequest, "v3InstallConnectorRequest");
        this.v3InstallConnectorRequest = Optional.ofNullable(v3InstallConnectorRequest);
        return this;
    }

    public V3InstallConnectorRequest withV3InstallConnectorRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3InstallConnectorRequest> v3InstallConnectorRequest) {
        Utils.checkNotNull(v3InstallConnectorRequest, "v3InstallConnectorRequest");
        this.v3InstallConnectorRequest = v3InstallConnectorRequest;
        return this;
    }

    /**
     * The connector to filter by
     */
    public V3InstallConnectorRequest withConnector(String connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
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
        V3InstallConnectorRequest other = (V3InstallConnectorRequest) o;
        return 
            Objects.deepEquals(this.v3InstallConnectorRequest, other.v3InstallConnectorRequest) &&
            Objects.deepEquals(this.connector, other.connector);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            v3InstallConnectorRequest,
            connector);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3InstallConnectorRequest.class,
                "v3InstallConnectorRequest", v3InstallConnectorRequest,
                "connector", connector);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3InstallConnectorRequest> v3InstallConnectorRequest = Optional.empty();
 
        private String connector;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder v3InstallConnectorRequest(com.formance.formance_sdk.models.shared.V3InstallConnectorRequest v3InstallConnectorRequest) {
            Utils.checkNotNull(v3InstallConnectorRequest, "v3InstallConnectorRequest");
            this.v3InstallConnectorRequest = Optional.ofNullable(v3InstallConnectorRequest);
            return this;
        }

        public Builder v3InstallConnectorRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3InstallConnectorRequest> v3InstallConnectorRequest) {
            Utils.checkNotNull(v3InstallConnectorRequest, "v3InstallConnectorRequest");
            this.v3InstallConnectorRequest = v3InstallConnectorRequest;
            return this;
        }

        /**
         * The connector to filter by
         */
        public Builder connector(String connector) {
            Utils.checkNotNull(connector, "connector");
            this.connector = connector;
            return this;
        }
        
        public V3InstallConnectorRequest build() {
            return new V3InstallConnectorRequest(
                v3InstallConnectorRequest,
                connector);
        }
    }
}
