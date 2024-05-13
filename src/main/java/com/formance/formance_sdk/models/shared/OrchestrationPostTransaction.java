/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class OrchestrationPostTransaction {

    @JsonProperty("metadata")
    private java.util.Map<String, String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postings")
    private Optional<? extends java.util.List<Posting>> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("script")
    private Optional<? extends OrchestrationPostTransactionScript> script;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<? extends OffsetDateTime> timestamp;

    @JsonCreator
    public OrchestrationPostTransaction(
            @JsonProperty("metadata") java.util.Map<String, String> metadata,
            @JsonProperty("postings") Optional<? extends java.util.List<Posting>> postings,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("script") Optional<? extends OrchestrationPostTransactionScript> script,
            @JsonProperty("timestamp") Optional<? extends OffsetDateTime> timestamp) {
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
    
    public OrchestrationPostTransaction(
            java.util.Map<String, String> metadata) {
        this(metadata, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public java.util.Map<String, String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Posting>> postings() {
        return (Optional<java.util.List<Posting>>) postings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> reference() {
        return (Optional<String>) reference;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OrchestrationPostTransactionScript> script() {
        return (Optional<OrchestrationPostTransactionScript>) script;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> timestamp() {
        return (Optional<OffsetDateTime>) timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public OrchestrationPostTransaction withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public OrchestrationPostTransaction withPostings(java.util.List<Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = Optional.ofNullable(postings);
        return this;
    }

    public OrchestrationPostTransaction withPostings(Optional<? extends java.util.List<Posting>> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public OrchestrationPostTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public OrchestrationPostTransaction withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public OrchestrationPostTransaction withScript(OrchestrationPostTransactionScript script) {
        Utils.checkNotNull(script, "script");
        this.script = Optional.ofNullable(script);
        return this;
    }

    public OrchestrationPostTransaction withScript(Optional<? extends OrchestrationPostTransactionScript> script) {
        Utils.checkNotNull(script, "script");
        this.script = script;
        return this;
    }

    public OrchestrationPostTransaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public OrchestrationPostTransaction withTimestamp(Optional<? extends OffsetDateTime> timestamp) {
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
        OrchestrationPostTransaction other = (OrchestrationPostTransaction) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.postings, other.postings) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.script, other.script) &&
            java.util.Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            postings,
            reference,
            script,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrchestrationPostTransaction.class,
                "metadata", metadata,
                "postings", postings,
                "reference", reference,
                "script", script,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, String> metadata;
 
        private Optional<? extends java.util.List<Posting>> postings = Optional.empty();
 
        private Optional<? extends String> reference = Optional.empty();
 
        private Optional<? extends OrchestrationPostTransactionScript> script = Optional.empty();
 
        private Optional<? extends OffsetDateTime> timestamp = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postings(java.util.List<Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = Optional.ofNullable(postings);
            return this;
        }

        public Builder postings(Optional<? extends java.util.List<Posting>> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = postings;
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

        public Builder script(OrchestrationPostTransactionScript script) {
            Utils.checkNotNull(script, "script");
            this.script = Optional.ofNullable(script);
            return this;
        }

        public Builder script(Optional<? extends OrchestrationPostTransactionScript> script) {
            Utils.checkNotNull(script, "script");
            this.script = script;
            return this;
        }

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = Optional.ofNullable(timestamp);
            return this;
        }

        public Builder timestamp(Optional<? extends OffsetDateTime> timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public OrchestrationPostTransaction build() {
            return new OrchestrationPostTransaction(
                metadata,
                postings,
                reference,
                script,
                timestamp);
        }
    }
}

