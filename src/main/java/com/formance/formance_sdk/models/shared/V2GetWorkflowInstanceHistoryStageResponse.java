/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class V2GetWorkflowInstanceHistoryStageResponse {

    @JsonProperty("data")
    private List<V2WorkflowInstanceHistoryStage> data;

    @JsonCreator
    public V2GetWorkflowInstanceHistoryStageResponse(
            @JsonProperty("data") List<V2WorkflowInstanceHistoryStage> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<V2WorkflowInstanceHistoryStage> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2GetWorkflowInstanceHistoryStageResponse withData(List<V2WorkflowInstanceHistoryStage> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        V2GetWorkflowInstanceHistoryStageResponse other = (V2GetWorkflowInstanceHistoryStageResponse) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2GetWorkflowInstanceHistoryStageResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<V2WorkflowInstanceHistoryStage> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<V2WorkflowInstanceHistoryStage> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V2GetWorkflowInstanceHistoryStageResponse build() {
            return new V2GetWorkflowInstanceHistoryStageResponse(
                data);
        }
    }
}

