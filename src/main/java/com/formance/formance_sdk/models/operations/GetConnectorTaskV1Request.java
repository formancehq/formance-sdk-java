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

public class GetConnectorTaskV1Request {

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

    /**
     * The task ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taskId")
    private String taskId;

    @JsonCreator
    public GetConnectorTaskV1Request(
            Connector connector,
            String connectorId,
            String taskId) {
        Utils.checkNotNull(connector, "connector");
        Utils.checkNotNull(connectorId, "connectorId");
        Utils.checkNotNull(taskId, "taskId");
        this.connector = connector;
        this.connectorId = connectorId;
        this.taskId = taskId;
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

    /**
     * The task ID.
     */
    @JsonIgnore
    public String taskId() {
        return taskId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The name of the connector.
     */
    public GetConnectorTaskV1Request withConnector(Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
        return this;
    }

    /**
     * The connector ID.
     */
    public GetConnectorTaskV1Request withConnectorId(String connectorId) {
        Utils.checkNotNull(connectorId, "connectorId");
        this.connectorId = connectorId;
        return this;
    }

    /**
     * The task ID.
     */
    public GetConnectorTaskV1Request withTaskId(String taskId) {
        Utils.checkNotNull(taskId, "taskId");
        this.taskId = taskId;
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
        GetConnectorTaskV1Request other = (GetConnectorTaskV1Request) o;
        return 
            Objects.deepEquals(this.connector, other.connector) &&
            Objects.deepEquals(this.connectorId, other.connectorId) &&
            Objects.deepEquals(this.taskId, other.taskId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connector,
            connectorId,
            taskId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConnectorTaskV1Request.class,
                "connector", connector,
                "connectorId", connectorId,
                "taskId", taskId);
    }
    
    public final static class Builder {
 
        private Connector connector;
 
        private String connectorId;
 
        private String taskId;
        
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

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            Utils.checkNotNull(taskId, "taskId");
            this.taskId = taskId;
            return this;
        }
        
        public GetConnectorTaskV1Request build() {
            return new GetConnectorTaskV1Request(
                connector,
                connectorId,
                taskId);
        }
    }
}
