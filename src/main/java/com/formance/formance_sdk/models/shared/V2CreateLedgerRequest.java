/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class V2CreateLedgerRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bucket")
    private Optional<String> bucket;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("features")
    private Optional<? extends Map<String, String>> features;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Map<String, String>> metadata;

    @JsonCreator
    public V2CreateLedgerRequest(
            @JsonProperty("bucket") Optional<String> bucket,
            @JsonProperty("features") Optional<? extends Map<String, String>> features,
            @JsonProperty("metadata") Optional<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(bucket, "bucket");
        Utils.checkNotNull(features, "features");
        Utils.checkNotNull(metadata, "metadata");
        this.bucket = bucket;
        this.features = features;
        this.metadata = metadata;
    }
    
    public V2CreateLedgerRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> bucket() {
        return bucket;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> features() {
        return (Optional<Map<String, String>>) features;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> metadata() {
        return (Optional<Map<String, String>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2CreateLedgerRequest withBucket(String bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = Optional.ofNullable(bucket);
        return this;
    }

    public V2CreateLedgerRequest withBucket(Optional<String> bucket) {
        Utils.checkNotNull(bucket, "bucket");
        this.bucket = bucket;
        return this;
    }

    public V2CreateLedgerRequest withFeatures(Map<String, String> features) {
        Utils.checkNotNull(features, "features");
        this.features = Optional.ofNullable(features);
        return this;
    }

    public V2CreateLedgerRequest withFeatures(Optional<? extends Map<String, String>> features) {
        Utils.checkNotNull(features, "features");
        this.features = features;
        return this;
    }

    public V2CreateLedgerRequest withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public V2CreateLedgerRequest withMetadata(Optional<? extends Map<String, String>> metadata) {
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
        V2CreateLedgerRequest other = (V2CreateLedgerRequest) o;
        return 
            Objects.deepEquals(this.bucket, other.bucket) &&
            Objects.deepEquals(this.features, other.features) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bucket,
            features,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2CreateLedgerRequest.class,
                "bucket", bucket,
                "features", features,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<String> bucket = Optional.empty();
 
        private Optional<? extends Map<String, String>> features = Optional.empty();
 
        private Optional<? extends Map<String, String>> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bucket(String bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = Optional.ofNullable(bucket);
            return this;
        }

        public Builder bucket(Optional<String> bucket) {
            Utils.checkNotNull(bucket, "bucket");
            this.bucket = bucket;
            return this;
        }

        public Builder features(Map<String, String> features) {
            Utils.checkNotNull(features, "features");
            this.features = Optional.ofNullable(features);
            return this;
        }

        public Builder features(Optional<? extends Map<String, String>> features) {
            Utils.checkNotNull(features, "features");
            this.features = features;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends Map<String, String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public V2CreateLedgerRequest build() {
            return new V2CreateLedgerRequest(
                bucket,
                features,
                metadata);
        }
    }
}

