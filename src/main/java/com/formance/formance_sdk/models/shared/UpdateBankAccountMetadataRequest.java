/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class UpdateBankAccountMetadataRequest {

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("metadata")
    private Optional<? extends java.util.Map<String, String>> metadata;

    public UpdateBankAccountMetadataRequest(
            @JsonProperty("metadata") Optional<? extends java.util.Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
    }

    public Optional<? extends java.util.Map<String, String>> metadata() {
        return metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public UpdateBankAccountMetadataRequest withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public UpdateBankAccountMetadataRequest withMetadata(Optional<? extends java.util.Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        UpdateBankAccountMetadataRequest other = (UpdateBankAccountMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateBankAccountMetadataRequest.class,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, String>> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public UpdateBankAccountMetadataRequest build() {
            return new UpdateBankAccountMetadataRequest(
                metadata);
        }
    }
}

