/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class UpdateWalletRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends UpdateWalletRequestBody> requestBody;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    @JsonCreator
    public UpdateWalletRequest(
            Optional<? extends UpdateWalletRequestBody> requestBody,
            String id) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(id, "id");
        this.requestBody = requestBody;
        this.id = id;
    }
    
    public UpdateWalletRequest(
            String id) {
        this(Optional.empty(), id);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UpdateWalletRequestBody> requestBody() {
        return (Optional<UpdateWalletRequestBody>) requestBody;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateWalletRequest withRequestBody(UpdateWalletRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = Optional.ofNullable(requestBody);
        return this;
    }

    public UpdateWalletRequest withRequestBody(Optional<? extends UpdateWalletRequestBody> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public UpdateWalletRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        UpdateWalletRequest other = (UpdateWalletRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateWalletRequest.class,
                "requestBody", requestBody,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends UpdateWalletRequestBody> requestBody = Optional.empty();
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requestBody(UpdateWalletRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = Optional.ofNullable(requestBody);
            return this;
        }

        public Builder requestBody(Optional<? extends UpdateWalletRequestBody> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public UpdateWalletRequest build() {
            return new UpdateWalletRequest(
                requestBody,
                id);
        }
    }
}

