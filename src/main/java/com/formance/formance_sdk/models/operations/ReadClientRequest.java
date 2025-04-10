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

public class ReadClientRequest {

    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    private String clientId;

    @JsonCreator
    public ReadClientRequest(
            String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
    }

    /**
     * Client ID
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Client ID
     */
    public ReadClientRequest withClientId(String clientId) {
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
        ReadClientRequest other = (ReadClientRequest) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReadClientRequest.class,
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
        
        public ReadClientRequest build() {
            return new ReadClientRequest(
                clientId);
        }
    }
}
