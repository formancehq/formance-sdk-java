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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class V2Transaction {

    @JsonProperty("id")
    private BigInteger id;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonProperty("postings")
    private List<V2Posting> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;

    @JsonProperty("reverted")
    private boolean reverted;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonCreator
    public V2Transaction(
            @JsonProperty("id") BigInteger id,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("postings") List<V2Posting> postings,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("reverted") boolean reverted,
            @JsonProperty("timestamp") OffsetDateTime timestamp) {
        Utils.checkNotNull(id, "id");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(postings, "postings");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(reverted, "reverted");
        Utils.checkNotNull(timestamp, "timestamp");
        this.id = id;
        this.metadata = metadata;
        this.postings = postings;
        this.reference = reference;
        this.reverted = reverted;
        this.timestamp = timestamp;
    }
    
    public V2Transaction(
            BigInteger id,
            Map<String, String> metadata,
            List<V2Posting> postings,
            boolean reverted,
            OffsetDateTime timestamp) {
        this(id, metadata, postings, Optional.empty(), reverted, timestamp);
    }

    @JsonIgnore
    public BigInteger id() {
        return id;
    }

    @JsonIgnore
    public Map<String, String> metadata() {
        return metadata;
    }

    @JsonIgnore
    public List<V2Posting> postings() {
        return postings;
    }

    @JsonIgnore
    public Optional<String> reference() {
        return reference;
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

    public V2Transaction withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    public V2Transaction withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2Transaction withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2Transaction withPostings(List<V2Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public V2Transaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public V2Transaction withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public V2Transaction withReverted(boolean reverted) {
        Utils.checkNotNull(reverted, "reverted");
        this.reverted = reverted;
        return this;
    }

    public V2Transaction withTimestamp(OffsetDateTime timestamp) {
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
        V2Transaction other = (V2Transaction) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.postings, other.postings) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.reverted, other.reverted) &&
            Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            metadata,
            postings,
            reference,
            reverted,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Transaction.class,
                "id", id,
                "metadata", metadata,
                "postings", postings,
                "reference", reference,
                "reverted", reverted,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private BigInteger id;
 
        private Map<String, String> metadata;
 
        private List<V2Posting> postings;
 
        private Optional<String> reference = Optional.empty();
 
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

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postings(List<V2Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = postings;
            return this;
        }

        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        public Builder reference(Optional<String> reference) {
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
        
        public V2Transaction build() {
            return new V2Transaction(
                id,
                metadata,
                postings,
                reference,
                reverted,
                timestamp);
        }
    }
}

