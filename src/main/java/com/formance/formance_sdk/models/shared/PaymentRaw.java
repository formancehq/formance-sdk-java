/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class PaymentRaw {

    @JsonCreator
    public PaymentRaw() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }    

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaymentRaw.class);
    }
    
    public final static class Builder {
        
        private Builder() {
          // force use of static builder() method
        }
        
        public PaymentRaw build() {
            return new PaymentRaw(
                );
        }
    }
}
