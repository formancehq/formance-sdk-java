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
import java.util.Objects;

public class V3GetPaymentServiceUserRequest {

    /**
     * The payment service user ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentServiceUserID")
    private String paymentServiceUserID;

    @JsonCreator
    public V3GetPaymentServiceUserRequest(
            String paymentServiceUserID) {
        Utils.checkNotNull(paymentServiceUserID, "paymentServiceUserID");
        this.paymentServiceUserID = paymentServiceUserID;
    }

    /**
     * The payment service user ID
     */
    @JsonIgnore
    public String paymentServiceUserID() {
        return paymentServiceUserID;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The payment service user ID
     */
    public V3GetPaymentServiceUserRequest withPaymentServiceUserID(String paymentServiceUserID) {
        Utils.checkNotNull(paymentServiceUserID, "paymentServiceUserID");
        this.paymentServiceUserID = paymentServiceUserID;
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
        V3GetPaymentServiceUserRequest other = (V3GetPaymentServiceUserRequest) o;
        return 
            Objects.deepEquals(this.paymentServiceUserID, other.paymentServiceUserID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentServiceUserID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3GetPaymentServiceUserRequest.class,
                "paymentServiceUserID", paymentServiceUserID);
    }
    
    public final static class Builder {
 
        private String paymentServiceUserID;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The payment service user ID
         */
        public Builder paymentServiceUserID(String paymentServiceUserID) {
            Utils.checkNotNull(paymentServiceUserID, "paymentServiceUserID");
            this.paymentServiceUserID = paymentServiceUserID;
            return this;
        }
        
        public V3GetPaymentServiceUserRequest build() {
            return new V3GetPaymentServiceUserRequest(
                paymentServiceUserID);
        }
    }
}
