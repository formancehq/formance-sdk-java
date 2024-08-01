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

public class ReadConnectorConfigV1Request {

    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    private com.formance.formance_sdk.models.shared.Connector connector;

    /**
     * The connector ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connectorId")
    private String connectorId;

    @JsonCreator
    public ReadConnectorConfigV1Request(
            com.formance.formance_sdk.models.shared.Connector connector,
            String connectorId) {
        Utils.checkNotNull(connector, "connector");
        Utils.checkNotNull(connectorId, "connectorId");
        this.connector = connector;
        this.connectorId = connectorId;
    }

    /**
     * The name of the connector.
     */
    @JsonIgnore
    public com.formance.formance_sdk.models.shared.Connector connector() {
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

    /**
     * The name of the connector.
     */
    public ReadConnectorConfigV1Request withConnector(com.formance.formance_sdk.models.shared.Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
        return this;
    }

    /**
     * The connector ID.
     */
    public ReadConnectorConfigV1Request withConnectorId(String connectorId) {
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
        ReadConnectorConfigV1Request other = (ReadConnectorConfigV1Request) o;
        return 
            java.util.Objects.deepEquals(this.connector, other.connector) &&
            java.util.Objects.deepEquals(this.connectorId, other.connectorId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            connector,
            connectorId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadConnectorConfigV1Request.class,
                "connector", connector,
                "connectorId", connectorId);
    }
    
    public final static class Builder {
 
        private com.formance.formance_sdk.models.shared.Connector connector;
 
        private String connectorId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the connector.
         */
        public Builder connector(com.formance.formance_sdk.models.shared.Connector connector) {
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
        
        public ReadConnectorConfigV1Request build() {
            return new ReadConnectorConfigV1Request(
                connector,
                connectorId);
        }
    }
}

