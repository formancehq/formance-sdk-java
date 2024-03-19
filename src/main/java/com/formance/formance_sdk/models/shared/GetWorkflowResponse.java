/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class GetWorkflowResponse {

    @JsonProperty("data")
    private Workflow data;

    public GetWorkflowResponse(
            @JsonProperty("data") Workflow data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    public Workflow data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetWorkflowResponse withData(Workflow data) {
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
        GetWorkflowResponse other = (GetWorkflowResponse) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkflowResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private Workflow data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Workflow data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public GetWorkflowResponse build() {
            return new GetWorkflowResponse(
                data);
        }
    }
}

