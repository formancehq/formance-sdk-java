/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class V2GetWorkflowRequest {

    /**
     * The flow id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=flowId")
    private String flowId;

    public V2GetWorkflowRequest(
            String flowId) {
        Utils.checkNotNull(flowId, "flowId");
        this.flowId = flowId;
    }

    /**
     * The flow id
     */
    public String flowId() {
        return flowId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The flow id
     */
    public V2GetWorkflowRequest withFlowId(String flowId) {
        Utils.checkNotNull(flowId, "flowId");
        this.flowId = flowId;
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
        V2GetWorkflowRequest other = (V2GetWorkflowRequest) o;
        return 
            java.util.Objects.deepEquals(this.flowId, other.flowId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            flowId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetWorkflowRequest.class,
                "flowId", flowId);
    }
    
    public final static class Builder {
 
        private String flowId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The flow id
         */
        public Builder flowId(String flowId) {
            Utils.checkNotNull(flowId, "flowId");
            this.flowId = flowId;
            return this;
        }
        
        public V2GetWorkflowRequest build() {
            return new V2GetWorkflowRequest(
                flowId);
        }
    }
}

