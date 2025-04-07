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

public class GetWorkflowInstanceHistoryResponse {

    @JsonProperty("data")
    private List<WorkflowInstanceHistory> data;

    @JsonCreator
    public GetWorkflowInstanceHistoryResponse(
            @JsonProperty("data") List<WorkflowInstanceHistory> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<WorkflowInstanceHistory> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetWorkflowInstanceHistoryResponse withData(List<WorkflowInstanceHistory> data) {
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
        GetWorkflowInstanceHistoryResponse other = (GetWorkflowInstanceHistoryResponse) o;
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
        return Utils.toString(GetWorkflowInstanceHistoryResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<WorkflowInstanceHistory> data;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<WorkflowInstanceHistory> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetWorkflowInstanceHistoryResponse build() {
            return new GetWorkflowInstanceHistoryResponse(
                data);
        }
    }
}
