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

public class GetConnectorTaskRequest {

    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    private Connector connector;

    /**
     * The task ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taskId")
    private String taskId;

    @JsonCreator
    public GetConnectorTaskRequest(
            Connector connector,
            String taskId) {
        Utils.checkNotNull(connector, "connector");
        Utils.checkNotNull(taskId, "taskId");
        this.connector = connector;
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
    public GetConnectorTaskRequest withConnector(Connector connector) {
        Utils.checkNotNull(connector, "connector");
        this.connector = connector;
        return this;
    }

    /**
     * The task ID.
     */
    public GetConnectorTaskRequest withTaskId(String taskId) {
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
        GetConnectorTaskRequest other = (GetConnectorTaskRequest) o;
        return 
            Objects.deepEquals(this.connector, other.connector) &&
            Objects.deepEquals(this.taskId, other.taskId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connector,
            taskId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConnectorTaskRequest.class,
                "connector", connector,
                "taskId", taskId);
    }
    
    public final static class Builder {
 
        private Connector connector;
 
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
         * The task ID.
         */
        public Builder taskId(String taskId) {
            Utils.checkNotNull(taskId, "taskId");
            this.taskId = taskId;
            return this;
        }
        
        public GetConnectorTaskRequest build() {
            return new GetConnectorTaskRequest(
                connector,
                taskId);
        }
    }
}
