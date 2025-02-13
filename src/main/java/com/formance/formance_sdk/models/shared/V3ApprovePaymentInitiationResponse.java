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
import java.util.Objects;


public class V3ApprovePaymentInitiationResponse {

    @JsonProperty("data")
    private V3ApprovePaymentInitiationResponseData data;

    @JsonCreator
    public V3ApprovePaymentInitiationResponse(
            @JsonProperty("data") V3ApprovePaymentInitiationResponseData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public V3ApprovePaymentInitiationResponseData data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3ApprovePaymentInitiationResponse withData(V3ApprovePaymentInitiationResponseData data) {
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
        V3ApprovePaymentInitiationResponse other = (V3ApprovePaymentInitiationResponse) o;
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
        return Utils.toString(V3ApprovePaymentInitiationResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private V3ApprovePaymentInitiationResponseData data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(V3ApprovePaymentInitiationResponseData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public V3ApprovePaymentInitiationResponse build() {
            return new V3ApprovePaymentInitiationResponse(
                data);
        }
    }
}

