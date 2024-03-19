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
import java.util.Optional;


public class SendEventRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends SendEventRequestBody> requestBody;

    /**
     * The instance id
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=instanceID")
    private String instanceID;

    public SendEventRequest(
            Optional<? extends SendEventRequestBody> requestBody,
            String instanceID) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(instanceID, "instanceID");
        this.requestBody = requestBody;
        this.instanceID = instanceID;
    }

    public Optional<? extends SendEventRequestBody> requestBody() {
        return requestBody;
    }

    /**
     * The instance id
     */
    public String instanceID() {
        return instanceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SendEventRequest withRequestBody(SendEventRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public SendEventRequest withRequestBody(Optional<? extends SendEventRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * The instance id
     */
    public SendEventRequest withInstanceID(String instanceID) {
        Utils.checkNotNull(instanceID, "instanceID");
        this.instanceID = instanceID;
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
        SendEventRequest other = (SendEventRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.instanceID, other.instanceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            instanceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SendEventRequest.class,
                "requestBody", requestBody,
                "instanceID", instanceID);
    }
    
    public final static class Builder {
 
        private Optional<? extends SendEventRequestBody> requestBody = Optional.empty();
 
        private String instanceID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(SendEventRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends SendEventRequestBody> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * The instance id
         */
        public Builder instanceID(String instanceID) {
            Utils.checkNotNull(instanceID, "instanceID");
            this.instanceID = instanceID;
            return this;
        }
        
        public SendEventRequest build() {
            return new SendEventRequest(
                requestBody,
                instanceID);
        }
    }
}

