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

public class V3UpdatePaymentMetadataRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest> v3UpdatePaymentMetadataRequest;

    /**
     * The payment ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentID")
    private String paymentID;

    @JsonCreator
    public V3UpdatePaymentMetadataRequest(
            Optional<? extends com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest> v3UpdatePaymentMetadataRequest,
            String paymentID) {
        Utils.checkNotNull(v3UpdatePaymentMetadataRequest, "v3UpdatePaymentMetadataRequest");
        Utils.checkNotNull(paymentID, "paymentID");
        this.v3UpdatePaymentMetadataRequest = v3UpdatePaymentMetadataRequest;
        this.paymentID = paymentID;
    }
    
    public V3UpdatePaymentMetadataRequest(
            String paymentID) {
        this(Optional.empty(), paymentID);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest> v3UpdatePaymentMetadataRequest() {
        return (Optional<com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest>) v3UpdatePaymentMetadataRequest;
    }

    /**
     * The payment ID
     */
    @JsonIgnore
    public String paymentID() {
        return paymentID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3UpdatePaymentMetadataRequest withV3UpdatePaymentMetadataRequest(com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest v3UpdatePaymentMetadataRequest) {
        Utils.checkNotNull(v3UpdatePaymentMetadataRequest, "v3UpdatePaymentMetadataRequest");
        this.v3UpdatePaymentMetadataRequest = Optional.ofNullable(v3UpdatePaymentMetadataRequest);
        return this;
    }

    public V3UpdatePaymentMetadataRequest withV3UpdatePaymentMetadataRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest> v3UpdatePaymentMetadataRequest) {
        Utils.checkNotNull(v3UpdatePaymentMetadataRequest, "v3UpdatePaymentMetadataRequest");
        this.v3UpdatePaymentMetadataRequest = v3UpdatePaymentMetadataRequest;
        return this;
    }

    /**
     * The payment ID
     */
    public V3UpdatePaymentMetadataRequest withPaymentID(String paymentID) {
        Utils.checkNotNull(paymentID, "paymentID");
        this.paymentID = paymentID;
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
        V3UpdatePaymentMetadataRequest other = (V3UpdatePaymentMetadataRequest) o;
        return 
            Objects.deepEquals(this.v3UpdatePaymentMetadataRequest, other.v3UpdatePaymentMetadataRequest) &&
            Objects.deepEquals(this.paymentID, other.paymentID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            v3UpdatePaymentMetadataRequest,
            paymentID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3UpdatePaymentMetadataRequest.class,
                "v3UpdatePaymentMetadataRequest", v3UpdatePaymentMetadataRequest,
                "paymentID", paymentID);
    }
    
    public final static class Builder {
 
        private Optional<? extends com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest> v3UpdatePaymentMetadataRequest = Optional.empty();
 
        private String paymentID;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder v3UpdatePaymentMetadataRequest(com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest v3UpdatePaymentMetadataRequest) {
            Utils.checkNotNull(v3UpdatePaymentMetadataRequest, "v3UpdatePaymentMetadataRequest");
            this.v3UpdatePaymentMetadataRequest = Optional.ofNullable(v3UpdatePaymentMetadataRequest);
            return this;
        }

        public Builder v3UpdatePaymentMetadataRequest(Optional<? extends com.formance.formance_sdk.models.shared.V3UpdatePaymentMetadataRequest> v3UpdatePaymentMetadataRequest) {
            Utils.checkNotNull(v3UpdatePaymentMetadataRequest, "v3UpdatePaymentMetadataRequest");
            this.v3UpdatePaymentMetadataRequest = v3UpdatePaymentMetadataRequest;
            return this;
        }

        /**
         * The payment ID
         */
        public Builder paymentID(String paymentID) {
            Utils.checkNotNull(paymentID, "paymentID");
            this.paymentID = paymentID;
            return this;
        }
        
        public V3UpdatePaymentMetadataRequest build() {
            return new V3UpdatePaymentMetadataRequest(
                v3UpdatePaymentMetadataRequest,
                paymentID);
        }
    }
}
