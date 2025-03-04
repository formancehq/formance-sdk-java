/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.Connector;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class UninstallConnectorV1Request {

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
    public UninstallConnectorV1Request(
            Connector connector,
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

    /**
     * The name of the connector.
     */
    public UninstallConnectorV1Request withConnector(Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
        return this;
    }

    /**
     * The connector ID.
     */
    public UninstallConnectorV1Request withConnectorId(String connectorId) {
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
        UninstallConnectorV1Request other = (UninstallConnectorV1Request) o;
        return 
            Objects.deepEquals(this.connector, other.connector) &&
            Objects.deepEquals(this.connectorId, other.connectorId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connector,
            connectorId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UninstallConnectorV1Request.class,
                "connector", connector,
                "connectorId", connectorId);
    }
    
    public final static class Builder {
 
        private Connector connector;
 
        private String connectorId;  
        
        private Builder() {
          // force use of static builder() method
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
        
        public UninstallConnectorV1Request build() {
            return new UninstallConnectorV1Request(
                connector,
                connectorId);
        }
    }
}

