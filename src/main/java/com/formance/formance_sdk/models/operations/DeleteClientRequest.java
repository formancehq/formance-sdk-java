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


public class DeleteClientRequest {

    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    private String clientId;

    public DeleteClientRequest(
            String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
    }

    /**
     * Client ID
     */
    public String clientId() {
        return clientId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Client ID
     */
    public DeleteClientRequest withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
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
        DeleteClientRequest other = (DeleteClientRequest) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteClientRequest.class,
                "clientId", clientId);
    }
    
    public final static class Builder {
 
        private String clientId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Client ID
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }
        
        public DeleteClientRequest build() {
            return new DeleteClientRequest(
                clientId);
        }
    }
}

