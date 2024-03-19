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


public class GetPaymentRequest {

    /**
     * The payment ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentId")
    private String paymentId;

    public GetPaymentRequest(
            String paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = paymentId;
    }

    /**
     * The payment ID.
     */
    public String paymentId() {
        return paymentId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The payment ID.
     */
    public GetPaymentRequest withPaymentId(String paymentId) {
        Utils.checkNotNull(paymentId, "paymentId");
        this.paymentId = paymentId;
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
        GetPaymentRequest other = (GetPaymentRequest) o;
        return 
            java.util.Objects.deepEquals(this.paymentId, other.paymentId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            paymentId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPaymentRequest.class,
                "paymentId", paymentId);
    }
    
    public final static class Builder {
 
        private String paymentId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The payment ID.
         */
        public Builder paymentId(String paymentId) {
            Utils.checkNotNull(paymentId, "paymentId");
            this.paymentId = paymentId;
            return this;
        }
        
        public GetPaymentRequest build() {
            return new GetPaymentRequest(
                paymentId);
        }
    }
}

