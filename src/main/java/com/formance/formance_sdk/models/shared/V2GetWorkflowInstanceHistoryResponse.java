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

public class V2GetWorkflowInstanceHistoryResponse {

    @JsonProperty("data")
    private List<V2WorkflowInstanceHistory> data;

    @JsonCreator
    public V2GetWorkflowInstanceHistoryResponse(
            @JsonProperty("data") List<V2WorkflowInstanceHistory> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<V2WorkflowInstanceHistory> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2GetWorkflowInstanceHistoryResponse withData(List<V2WorkflowInstanceHistory> data) {
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
        V2GetWorkflowInstanceHistoryResponse other = (V2GetWorkflowInstanceHistoryResponse) o;
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
        return Utils.toString(V2GetWorkflowInstanceHistoryResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<V2WorkflowInstanceHistory> data;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<V2WorkflowInstanceHistory> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V2GetWorkflowInstanceHistoryResponse build() {
            return new V2GetWorkflowInstanceHistoryResponse(
                data);
        }
    }
}
