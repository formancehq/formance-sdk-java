/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class V3ReversePaymentInitiationRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest> v3ReversePaymentInitiationRequest;

    /**
     * The payment initiation ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentInitiationID")
    private String paymentInitiationID;

    @JsonCreator
    public V3ReversePaymentInitiationRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest> v3ReversePaymentInitiationRequest,
            String paymentInitiationID) {
        Utils.checkNotNull(v3ReversePaymentInitiationRequest, "v3ReversePaymentInitiationRequest");
        Utils.checkNotNull(paymentInitiationID, "paymentInitiationID");
        this.v3ReversePaymentInitiationRequest = v3ReversePaymentInitiationRequest;
        this.paymentInitiationID = paymentInitiationID;
    }
    
    public V3ReversePaymentInitiationRequest(
            String paymentInitiationID) {
        this(Optional.empty(), paymentInitiationID);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest> v3ReversePaymentInitiationRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest>) v3ReversePaymentInitiationRequest;
    }

    /**
     * The payment initiation ID
     */
    @JsonIgnore
    public String paymentInitiationID() {
        return paymentInitiationID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3ReversePaymentInitiationRequest withV3ReversePaymentInitiationRequest(com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest v3ReversePaymentInitiationRequest) {
        Utils.checkNotNull(v3ReversePaymentInitiationRequest, "v3ReversePaymentInitiationRequest");
        this.v3ReversePaymentInitiationRequest = Optional.ofNullable(v3ReversePaymentInitiationRequest);
        return this;
    }

    public V3ReversePaymentInitiationRequest withV3ReversePaymentInitiationRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest> v3ReversePaymentInitiationRequest) {
        Utils.checkNotNull(v3ReversePaymentInitiationRequest, "v3ReversePaymentInitiationRequest");
        this.v3ReversePaymentInitiationRequest = v3ReversePaymentInitiationRequest;
        return this;
    }

    /**
     * The payment initiation ID
     */
    public V3ReversePaymentInitiationRequest withPaymentInitiationID(String paymentInitiationID) {
        Utils.checkNotNull(paymentInitiationID, "paymentInitiationID");
        this.paymentInitiationID = paymentInitiationID;
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
        V3ReversePaymentInitiationRequest other = (V3ReversePaymentInitiationRequest) o;
        return 
            Objects.deepEquals(this.v3ReversePaymentInitiationRequest, other.v3ReversePaymentInitiationRequest) &&
            Objects.deepEquals(this.paymentInitiationID, other.paymentInitiationID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            v3ReversePaymentInitiationRequest,
            paymentInitiationID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3ReversePaymentInitiationRequest.class,
                "v3ReversePaymentInitiationRequest", v3ReversePaymentInitiationRequest,
                "paymentInitiationID", paymentInitiationID);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest> v3ReversePaymentInitiationRequest = Optional.empty();
 
        private String paymentInitiationID;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder v3ReversePaymentInitiationRequest(com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest v3ReversePaymentInitiationRequest) {
            Utils.checkNotNull(v3ReversePaymentInitiationRequest, "v3ReversePaymentInitiationRequest");
            this.v3ReversePaymentInitiationRequest = Optional.ofNullable(v3ReversePaymentInitiationRequest);
            return this;
        }

        public Builder v3ReversePaymentInitiationRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3ReversePaymentInitiationRequest> v3ReversePaymentInitiationRequest) {
            Utils.checkNotNull(v3ReversePaymentInitiationRequest, "v3ReversePaymentInitiationRequest");
            this.v3ReversePaymentInitiationRequest = v3ReversePaymentInitiationRequest;
            return this;
        }

        /**
         * The payment initiation ID
         */
        public Builder paymentInitiationID(String paymentInitiationID) {
            Utils.checkNotNull(paymentInitiationID, "paymentInitiationID");
            this.paymentInitiationID = paymentInitiationID;
            return this;
        }
        
        public V3ReversePaymentInitiationRequest build() {
            return new V3ReversePaymentInitiationRequest(
                v3ReversePaymentInitiationRequest,
                paymentInitiationID);
        }
    }
}
