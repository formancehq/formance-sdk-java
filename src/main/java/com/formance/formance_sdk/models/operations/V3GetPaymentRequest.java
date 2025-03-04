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

public class V3GetPaymentRequest {

    /**
     * The payment ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentID")
    private String paymentID;

    @JsonCreator
    public V3GetPaymentRequest(
            String paymentID) {
        Utils.checkNotNull(paymentID, "paymentID");
        this.paymentID = paymentID;
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

    /**
     * The payment ID
     */
    public V3GetPaymentRequest withPaymentID(String paymentID) {
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
        V3GetPaymentRequest other = (V3GetPaymentRequest) o;
        return 
            Objects.deepEquals(this.paymentID, other.paymentID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            paymentID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3GetPaymentRequest.class,
                "paymentID", paymentID);
    }
    
    public final static class Builder {
 
        private String paymentID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The payment ID
         */
        public Builder paymentID(String paymentID) {
            Utils.checkNotNull(paymentID, "paymentID");
            this.paymentID = paymentID;
            return this;
        }
        
        public V3GetPaymentRequest build() {
            return new V3GetPaymentRequest(
                paymentID);
        }
    }
}

