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


public class GetManyConfigsRequest {

    /**
     * Optional filter by endpoint URL
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=endpoint")
    private Optional<? extends String> endpoint;

    /**
     * Optional filter by Config ID
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=id")
    private Optional<? extends String> id;

    public GetManyConfigsRequest(
            Optional<? extends String> endpoint,
            Optional<? extends String> id) {
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(id, "id");
        this.endpoint = endpoint;
        this.id = id;
    }

    /**
     * Optional filter by endpoint URL
     */
    public Optional<? extends String> endpoint() {
        return endpoint;
    }

    /**
     * Optional filter by Config ID
     */
    public Optional<? extends String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional filter by endpoint URL
     */
    public GetManyConfigsRequest withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = Optional.ofNullable(endpoint);
        return this;
    }

    /**
     * Optional filter by endpoint URL
     */
    public GetManyConfigsRequest withEndpoint(Optional<? extends String> endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Optional filter by Config ID
     */
    public GetManyConfigsRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Optional filter by Config ID
     */
    public GetManyConfigsRequest withId(Optional<? extends String> id) {
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
        GetManyConfigsRequest other = (GetManyConfigsRequest) o;
        return 
            java.util.Objects.deepEquals(this.endpoint, other.endpoint) &&
            java.util.Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            endpoint,
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetManyConfigsRequest.class,
                "endpoint", endpoint,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> endpoint = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Optional filter by endpoint URL
         */
        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = Optional.ofNullable(endpoint);
            return this;
        }

        /**
         * Optional filter by endpoint URL
         */
        public Builder endpoint(Optional<? extends String> endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Optional filter by Config ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Optional filter by Config ID
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetManyConfigsRequest build() {
            return new GetManyConfigsRequest(
                endpoint,
                id);
        }
    }
}
