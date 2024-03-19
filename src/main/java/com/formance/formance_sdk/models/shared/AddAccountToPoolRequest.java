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


public class AddAccountToPoolRequest {

    @JsonProperty("accountID")
    private String accountID;

    public AddAccountToPoolRequest(
            @JsonProperty("accountID") String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
    }

    public String accountID() {
        return accountID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AddAccountToPoolRequest withAccountID(String accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
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
        AddAccountToPoolRequest other = (AddAccountToPoolRequest) o;
        return 
            java.util.Objects.deepEquals(this.accountID, other.accountID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accountID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddAccountToPoolRequest.class,
                "accountID", accountID);
    }
    
    public final static class Builder {
 
        private String accountID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accountID(String accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }
        
        public AddAccountToPoolRequest build() {
            return new AddAccountToPoolRequest(
                accountID);
        }
    }
}

