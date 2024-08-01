/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class V2ExpandedTransaction {

    @JsonProperty("id")
    private BigInteger id;

    @JsonProperty("metadata")
    private java.util.Map<String, String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postCommitVolumes")
    private Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> postCommitVolumes;

    @JsonProperty("postings")
    private java.util.List<V2Posting> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preCommitVolumes")
    private Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> preCommitVolumes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonProperty("reverted")
    private boolean reverted;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonCreator
    public V2ExpandedTransaction(
            @JsonProperty("id") BigInteger id,
            @JsonProperty("metadata") java.util.Map<String, String> metadata,
            @JsonProperty("postCommitVolumes") Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> postCommitVolumes,
            @JsonProperty("postings") java.util.List<V2Posting> postings,
            @JsonProperty("preCommitVolumes") Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> preCommitVolumes,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("reverted") boolean reverted,
            @JsonProperty("timestamp") OffsetDateTime timestamp) {
        Utils.checkNotNull(id, "id");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        Utils.checkNotNull(postings, "postings");
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(reverted, "reverted");
        Utils.checkNotNull(timestamp, "timestamp");
        this.id = id;
        this.metadata = metadata;
        this.postCommitVolumes = postCommitVolumes;
        this.postings = postings;
        this.preCommitVolumes = preCommitVolumes;
        this.reference = reference;
        this.reverted = reverted;
        this.timestamp = timestamp;
    }
    
    public V2ExpandedTransaction(
            BigInteger id,
            java.util.Map<String, String> metadata,
            java.util.List<V2Posting> postings,
            boolean reverted,
            OffsetDateTime timestamp) {
        this(id, metadata, Optional.empty(), postings, Optional.empty(), Optional.empty(), reverted, timestamp);
    }

    @JsonIgnore
    public BigInteger id() {
        return id;
    }

    @JsonIgnore
    public java.util.Map<String, String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.util.Map<String, V2Volume>>> postCommitVolumes() {
        return (Optional<java.util.Map<String, java.util.Map<String, V2Volume>>>) postCommitVolumes;
    }

    @JsonIgnore
    public java.util.List<V2Posting> postings() {
        return postings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.util.Map<String, V2Volume>>> preCommitVolumes() {
        return (Optional<java.util.Map<String, java.util.Map<String, V2Volume>>>) preCommitVolumes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> reference() {
        return (Optional<String>) reference;
    }

    @JsonIgnore
    public boolean reverted() {
        return reverted;
    }

    @JsonIgnore
    public OffsetDateTime timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2ExpandedTransaction withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    public V2ExpandedTransaction withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2ExpandedTransaction withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2ExpandedTransaction withPostCommitVolumes(java.util.Map<String, java.util.Map<String, V2Volume>> postCommitVolumes) {
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        this.postCommitVolumes = Optional.ofNullable(postCommitVolumes);
        return this;
    }

    public V2ExpandedTransaction withPostCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> postCommitVolumes) {
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        this.postCommitVolumes = postCommitVolumes;
        return this;
    }

    public V2ExpandedTransaction withPostings(java.util.List<V2Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public V2ExpandedTransaction withPreCommitVolumes(java.util.Map<String, java.util.Map<String, V2Volume>> preCommitVolumes) {
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        this.preCommitVolumes = Optional.ofNullable(preCommitVolumes);
        return this;
    }

    public V2ExpandedTransaction withPreCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> preCommitVolumes) {
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        this.preCommitVolumes = preCommitVolumes;
        return this;
    }

    public V2ExpandedTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public V2ExpandedTransaction withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public V2ExpandedTransaction withReverted(boolean reverted) {
        Utils.checkNotNull(reverted, "reverted");
        this.reverted = reverted;
        return this;
    }

    public V2ExpandedTransaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = timestamp;
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
        V2ExpandedTransaction other = (V2ExpandedTransaction) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.postCommitVolumes, other.postCommitVolumes) &&
            java.util.Objects.deepEquals(this.postings, other.postings) &&
            java.util.Objects.deepEquals(this.preCommitVolumes, other.preCommitVolumes) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.reverted, other.reverted) &&
            java.util.Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            metadata,
            postCommitVolumes,
            postings,
            preCommitVolumes,
            reference,
            reverted,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ExpandedTransaction.class,
                "id", id,
                "metadata", metadata,
                "postCommitVolumes", postCommitVolumes,
                "postings", postings,
                "preCommitVolumes", preCommitVolumes,
                "reference", reference,
                "reverted", reverted,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private BigInteger id;
 
        private java.util.Map<String, String> metadata;
 
        private Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> postCommitVolumes = Optional.empty();
 
        private java.util.List<V2Posting> postings;
 
        private Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> preCommitVolumes = Optional.empty();
 
        private Optional<? extends String> reference = Optional.empty();
 
        private Boolean reverted;
 
        private OffsetDateTime timestamp;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            this.id = BigInteger.valueOf(id);
            return this;
        }

        public Builder id(BigInteger id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postCommitVolumes(java.util.Map<String, java.util.Map<String, V2Volume>> postCommitVolumes) {
            Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
            this.postCommitVolumes = Optional.ofNullable(postCommitVolumes);
            return this;
        }

        public Builder postCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> postCommitVolumes) {
            Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
            this.postCommitVolumes = postCommitVolumes;
            return this;
        }

        public Builder postings(java.util.List<V2Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = postings;
            return this;
        }

        public Builder preCommitVolumes(java.util.Map<String, java.util.Map<String, V2Volume>> preCommitVolumes) {
            Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
            this.preCommitVolumes = Optional.ofNullable(preCommitVolumes);
            return this;
        }

        public Builder preCommitVolumes(Optional<? extends java.util.Map<String, java.util.Map<String, V2Volume>>> preCommitVolumes) {
            Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
            this.preCommitVolumes = preCommitVolumes;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder reverted(boolean reverted) {
            Utils.checkNotNull(reverted, "reverted");
            this.reverted = reverted;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public V2ExpandedTransaction build() {
            return new V2ExpandedTransaction(
                id,
                metadata,
                postCommitVolumes,
                postings,
                preCommitVolumes,
                reference,
                reverted,
                timestamp);
        }
    }
}

