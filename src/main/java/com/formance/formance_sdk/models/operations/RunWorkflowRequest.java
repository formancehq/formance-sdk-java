/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class RunWorkflowRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends Map<String, String>> requestBody;

    /**
     * Wait end of the workflow before return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=wait")
    private Optional<Boolean> wait_;

    /**
     * The flow id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workflowID")
    private String workflowID;

    @JsonCreator
    public RunWorkflowRequest(
            Optional<? extends Map<String, String>> requestBody,
            Optional<Boolean> wait_,
            String workflowID) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(wait_, "wait_");
        Utils.checkNotNull(workflowID, "workflowID");
        this.requestBody = requestBody;
        this.wait_ = wait_;
        this.workflowID = workflowID;
    }
    
    public RunWorkflowRequest(
            String workflowID) {
        this(Optional.empty(), Optional.empty(), workflowID);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> requestBody() {
        return (Optional<Map<String, String>>) requestBody;
    }

    /**
     * Wait end of the workflow before return
     */
    @JsonIgnore
    public Optional<Boolean> wait_() {
        return wait_;
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

    public RunWorkflowRequest withRequestBody(Map<String, String> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public RunWorkflowRequest withRequestBody(Optional<? extends Map<String, String>> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Wait end of the workflow before return
     */
    public RunWorkflowRequest withWait(boolean wait_) {
        Utils.checkNotNull(wait_, "wait_");
        this.wait_ = Optional.ofNullable(wait_);
        return this;
    }

    /**
     * Wait end of the workflow before return
     */
    public RunWorkflowRequest withWait(Optional<Boolean> wait_) {
        Utils.checkNotNull(wait_, "wait_");
        this.wait_ = wait_;
        return this;
    }

    /**
     * The flow id
     */
    public RunWorkflowRequest withWorkflowID(String workflowID) {
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
        RunWorkflowRequest other = (RunWorkflowRequest) o;
        return 
            Objects.deepEquals(this.requestBody, other.requestBody) &&
            Objects.deepEquals(this.wait_, other.wait_) &&
            Objects.deepEquals(this.workflowID, other.workflowID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requestBody,
            wait_,
            workflowID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RunWorkflowRequest.class,
                "requestBody", requestBody,
                "wait_", wait_,
                "workflowID", workflowID);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, String>> requestBody = Optional.empty();
 
        private Optional<Boolean> wait_ = Optional.empty();
 
        private String workflowID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(Map<String, String> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends Map<String, String>> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Wait end of the workflow before return
         */
        public Builder wait_(boolean wait_) {
            Utils.checkNotNull(wait_, "wait_");
            this.wait_ = Optional.ofNullable(wait_);
            return this;
        }

        /**
         * Wait end of the workflow before return
         */
        public Builder wait_(Optional<Boolean> wait_) {
            Utils.checkNotNull(wait_, "wait_");
            this.wait_ = wait_;
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
        
        public RunWorkflowRequest build() {
            return new RunWorkflowRequest(
                requestBody,
                wait_,
                workflowID);
        }
    }
}

