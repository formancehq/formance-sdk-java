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


public class OrchestrationV2PostTransaction {

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
    private Optional<? extends OrchestrationV2PostTransactionScript> script;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<OffsetDateTime> timestamp;

    @JsonCreator
    public OrchestrationV2PostTransaction(
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("postings") Optional<? extends List<V2Posting>> postings,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("script") Optional<? extends OrchestrationV2PostTransactionScript> script,
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
    
    public OrchestrationV2PostTransaction(
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
    public Optional<OrchestrationV2PostTransactionScript> script() {
        return (Optional<OrchestrationV2PostTransactionScript>) script;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrchestrationV2PostTransaction withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public OrchestrationV2PostTransaction withPostings(List<V2Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = Optional.ofNullable(postings);
        return this;
    }

    public OrchestrationV2PostTransaction withPostings(Optional<? extends List<V2Posting>> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public OrchestrationV2PostTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public OrchestrationV2PostTransaction withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public OrchestrationV2PostTransaction withScript(OrchestrationV2PostTransactionScript script) {
        Utils.checkNotNull(script, "script");
        this.script = Optional.ofNullable(script);
        return this;
    }

    public OrchestrationV2PostTransaction withScript(Optional<? extends OrchestrationV2PostTransactionScript> script) {
        Utils.checkNotNull(script, "script");
        this.script = script;
        return this;
    }

    public OrchestrationV2PostTransaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public OrchestrationV2PostTransaction withTimestamp(Optional<OffsetDateTime> timestamp) {
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
        OrchestrationV2PostTransaction other = (OrchestrationV2PostTransaction) o;
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
        return Utils.toString(OrchestrationV2PostTransaction.class,
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
 
        private Optional<? extends OrchestrationV2PostTransactionScript> script = Optional.empty();
 
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

        public Builder script(OrchestrationV2PostTransactionScript script) {
            Utils.checkNotNull(script, "script");
            this.script = Optional.ofNullable(script);
            return this;
        }

        public Builder script(Optional<? extends OrchestrationV2PostTransactionScript> script) {
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
        
        public OrchestrationV2PostTransaction build() {
            return new OrchestrationV2PostTransaction(
                metadata,
                postings,
                reference,
                script,
                timestamp);
        }
    }
}

