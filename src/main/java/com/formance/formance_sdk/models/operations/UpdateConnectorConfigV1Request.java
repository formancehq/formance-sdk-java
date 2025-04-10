/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.models.shared.ConnectorConfig;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class UpdateConnectorConfigV1Request {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ConnectorConfig connectorConfig;

    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    private Connector connector;

    /**
     * The connector ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectorId")
    private String connectorId;

    @JsonCreator
    public UpdateConnectorConfigV1Request(
            ConnectorConfig connectorConfig,
            Connector connector,
            String connectorId) {
        Utils.checkNotNull(connectorConfig, "connectorConfig");
        Utils.checkNotNull(connector, "connector");
        Utils.checkNotNull(connectorId, "connectorId");
        this.connectorConfig = connectorConfig;
        this.connector = connector;
        this.connectorId = connectorId;
    }

    @JsonIgnore
    public ConnectorConfig connectorConfig() {
        return connectorConfig;
    }

    /**
     * The name of the connector.
     */
    @JsonIgnore
    public Connector connector() {
        return connector;
    }

    /**
     * The connector ID.
     */
    @JsonIgnore
    public String connectorId() {
        return connectorId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public UpdateConnectorConfigV1Request withConnectorConfig(ConnectorConfig connectorConfig) {
        Utils.checkNotNull(connectorConfig, "connectorConfig");
        this.connectorConfig = connectorConfig;
        return this;
    }

    /**
     * The name of the connector.
     */
    public UpdateConnectorConfigV1Request withConnector(Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
        return this;
    }

    /**
     * The connector ID.
     */
    public UpdateConnectorConfigV1Request withConnectorId(String connectorId) {
        Utils.checkNotNull(connectorId, "connectorId");
        this.connectorId = connectorId;
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
        UpdateConnectorConfigV1Request other = (UpdateConnectorConfigV1Request) o;
        return 
            Objects.deepEquals(this.connectorConfig, other.connectorConfig) &&
            Objects.deepEquals(this.connector, other.connector) &&
            Objects.deepEquals(this.connectorId, other.connectorId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectorConfig,
            connector,
            connectorId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateConnectorConfigV1Request.class,
                "connectorConfig", connectorConfig,
                "connector", connector,
                "connectorId", connectorId);
    }
    
    public final static class Builder {
 
        private ConnectorConfig connectorConfig;
 
        private Connector connector;
 
        private String connectorId;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectorConfig(ConnectorConfig connectorConfig) {
            Utils.checkNotNull(connectorConfig, "connectorConfig");
            this.connectorConfig = connectorConfig;
            return this;
        }

        /**
         * The name of the connector.
         */
        public Builder connector(Connector connector) {
            Utils.checkNotNull(connector, "connector");
            this.connector = connector;
            return this;
        }

        /**
         * The connector ID.
         */
        public Builder connectorId(String connectorId) {
            Utils.checkNotNull(connectorId, "connectorId");
            this.connectorId = connectorId;
            return this;
        }
        
        public UpdateConnectorConfigV1Request build() {
            return new UpdateConnectorConfigV1Request(
                connectorConfig,
                connector,
                connectorId);
        }
    }
}
