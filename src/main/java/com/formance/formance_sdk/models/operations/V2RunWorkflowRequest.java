/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class V2RunWorkflowRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends java.util.Map<String, String>> requestBody;

    /**
     * Wait end of the workflow before return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=wait")
    private Optional<? extends Boolean> waitForExecution;

    /**
     * The flow id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowID")
    private String workflowID;

    @JsonCreator
    public V2RunWorkflowRequest(
            Optional<? extends java.util.Map<String, String>> requestBody,
            Optional<? extends Boolean> waitForExecution,
            String workflowID) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(waitForExecution, "waitForExecution");
        Utils.checkNotNull(workflowID, "workflowID");
        this.requestBody = requestBody;
        this.waitForExecution = waitForExecution;
        this.workflowID = workflowID;
    }
    
    public V2RunWorkflowRequest(
            String workflowID) {
        this(Optional.empty(), Optional.empty(), workflowID);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, String>> requestBody() {
        return (Optional<java.util.Map<String, String>>) requestBody;
    }

    /**
     * Wait end of the workflow before return
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> waitForExecution() {
        return (Optional<Boolean>) waitForExecution;
    }

    /**
     * The flow id
     */
    @JsonIgnore
    public String workflowID() {
        return workflowID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2RunWorkflowRequest withRequestBody(java.util.Map<String, String> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public V2RunWorkflowRequest withRequestBody(Optional<? extends java.util.Map<String, String>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Wait end of the workflow before return
     */
    public V2RunWorkflowRequest withWaitForExecution(boolean waitForExecution) {
        Utils.checkNotNull(waitForExecution, "waitForExecution");
        this.waitForExecution = Optional.ofNullable(waitForExecution);
        return this;
    }

    /**
     * Wait end of the workflow before return
     */
    public V2RunWorkflowRequest withWaitForExecution(Optional<? extends Boolean> waitForExecution) {
        Utils.checkNotNull(waitForExecution, "waitForExecution");
        this.waitForExecution = waitForExecution;
        return this;
    }

    /**
     * The flow id
     */
    public V2RunWorkflowRequest withWorkflowID(String workflowID) {
        Utils.checkNotNull(workflowID, "workflowID");
        this.workflowID = workflowID;
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
        V2RunWorkflowRequest other = (V2RunWorkflowRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.waitForExecution, other.waitForExecution) &&
            java.util.Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            waitForExecution,
            workflowID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2RunWorkflowRequest.class,
                "requestBody", requestBody,
                "waitForExecution", waitForExecution,
                "workflowID", workflowID);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, String>> requestBody = Optional.empty();
 
        private Optional<? extends Boolean> waitForExecution = Optional.empty();
 
        private String workflowID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(java.util.Map<String, String> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends java.util.Map<String, String>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Wait end of the workflow before return
         */
        public Builder waitForExecution(boolean waitForExecution) {
            Utils.checkNotNull(waitForExecution, "waitForExecution");
            this.waitForExecution = Optional.ofNullable(waitForExecution);
            return this;
        }

        /**
         * Wait end of the workflow before return
         */
        public Builder waitForExecution(Optional<? extends Boolean> waitForExecution) {
            Utils.checkNotNull(waitForExecution, "waitForExecution");
            this.waitForExecution = waitForExecution;
            return this;
        }

        /**
         * The flow id
         */
        public Builder workflowID(String workflowID) {
            Utils.checkNotNull(workflowID, "workflowID");
            this.workflowID = workflowID;
            return this;
        }
        
        public V2RunWorkflowRequest build() {
            return new V2RunWorkflowRequest(
                requestBody,
                waitForExecution,
                workflowID);
        }
    }
}

