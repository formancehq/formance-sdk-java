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
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2PostTransaction {

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postings")
    private Optional<? extends List<V2Posting>> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("script")
    private Optional<? extends V2PostTransactionScript> script;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<OffsetDateTime> timestamp;

    @JsonCreator
    public V2PostTransaction(
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("postings") Optional<? extends List<V2Posting>> postings,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("script") Optional<? extends V2PostTransactionScript> script,
            @JsonProperty("timestamp") Optional<OffsetDateTime> timestamp) {
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(postings, "postings");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(script, "script");
        Utils.checkNotNull(timestamp, "timestamp");
        this.metadata = metadata;
        this.postings = postings;
        this.reference = reference;
        this.script = script;
        this.timestamp = timestamp;
    }
    
    public V2PostTransaction(
            Map<String, String> metadata) {
        this(metadata, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Map<String, String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<V2Posting>> postings() {
        return (Optional<List<V2Posting>>) postings;
    }

    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2PostTransactionScript> script() {
        return (Optional<V2PostTransactionScript>) script;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2PostTransaction withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2PostTransaction withPostings(List<V2Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = Optional.ofNullable(postings);
        return this;
    }

    public V2PostTransaction withPostings(Optional<? extends List<V2Posting>> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public V2PostTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public V2PostTransaction withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public V2PostTransaction withScript(V2PostTransactionScript script) {
        Utils.checkNotNull(script, "script");
        this.script = Optional.ofNullable(script);
        return this;
    }

    public V2PostTransaction withScript(Optional<? extends V2PostTransactionScript> script) {
        Utils.checkNotNull(script, "script");
        this.script = script;
        return this;
    }

    public V2PostTransaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public V2PostTransaction withTimestamp(Optional<OffsetDateTime> timestamp) {
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
        V2PostTransaction other = (V2PostTransaction) o;
        return 
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.postings, other.postings) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.script, other.script) &&
            Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            metadata,
            postings,
            reference,
            script,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2PostTransaction.class,
                "metadata", metadata,
                "postings", postings,
                "reference", reference,
                "script", script,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private Map<String, String> metadata;
 
        private Optional<? extends List<V2Posting>> postings = Optional.empty();
 
        private Optional<String> reference = Optional.empty();
 
        private Optional<? extends V2PostTransactionScript> script = Optional.empty();
 
        private Optional<OffsetDateTime> timestamp = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postings(List<V2Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = Optional.ofNullable(postings);
            return this;
        }

        public Builder postings(Optional<? extends List<V2Posting>> postings) {
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

        public Builder script(V2PostTransactionScript script) {
            Utils.checkNotNull(script, "script");
            this.script = Optional.ofNullable(script);
            return this;
        }

        public Builder script(Optional<? extends V2PostTransactionScript> script) {
            Utils.checkNotNull(script, "script");
            this.script = script;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        public Builder timestamp(Optional<OffsetDateTime> timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public V2PostTransaction build() {
            return new V2PostTransaction(
                metadata,
                postings,
                reference,
                script,
                timestamp);
        }
    }
}
