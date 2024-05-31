/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class CreateWalletRequest {

    /**
     * Custom metadata to attach to this wallet.
     */
    @JsonProperty("metadata")
    private java.util.Map<String, String> metadata;

    @JsonProperty("name")
    private String name;

    @JsonCreator
    public CreateWalletRequest(
            @JsonProperty("metadata") java.util.Map<String, String> metadata,
            @JsonProperty("name") String name) {
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(name, "name");
        this.metadata = metadata;
        this.name = name;
    }

    /**
     * Custom metadata to attach to this wallet.
     */
    @JsonIgnore
    public java.util.Map<String, String> metadata() {
        return metadata;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Custom metadata to attach to this wallet.
     */
    public CreateWalletRequest withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public CreateWalletRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        CreateWalletRequest other = (CreateWalletRequest) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateWalletRequest.class,
                "metadata", metadata,
                "name", name);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, String> metadata;
 
        private String name;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Custom metadata to attach to this wallet.
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CreateWalletRequest build() {
            return new CreateWalletRequest(
                metadata,
                name);
        }
    }
}

