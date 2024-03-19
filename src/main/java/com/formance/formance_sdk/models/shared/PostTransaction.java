/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import org.openapitools.jackson.nullable.JsonNullable;


public class PostTransaction {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postings")
    private Optional<? extends java.util.List<Posting>> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("script")
    private Optional<? extends PostTransactionScript> script;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<? extends OffsetDateTime> timestamp;

    public PostTransaction(
            @JsonProperty("metadata") JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata,
            @JsonProperty("postings") Optional<? extends java.util.List<Posting>> postings,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("script") Optional<? extends PostTransactionScript> script,
            @JsonProperty("timestamp") Optional<? extends OffsetDateTime> timestamp) {
        Utils.checkNotNull(metadata, "metadata");
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

    public JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata() {
        return metadata;
    }

    public Optional<? extends java.util.List<Posting>> postings() {
        return postings;
    }

    public Optional<? extends String> reference() {
        return reference;
    }

    public Optional<? extends PostTransactionScript> script() {
        return script;
    }

    public Optional<? extends OffsetDateTime> timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostTransaction withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public PostTransaction withMetadata(JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public PostTransaction withPostings(java.util.List<Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = Optional.ofNullable(postings);
        return this;
    }

    public PostTransaction withPostings(Optional<? extends java.util.List<Posting>> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public PostTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public PostTransaction withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public PostTransaction withScript(PostTransactionScript script) {
        Utils.checkNotNull(script, "script");
        this.script = Optional.ofNullable(script);
        return this;
    }

    public PostTransaction withScript(Optional<? extends PostTransactionScript> script) {
        Utils.checkNotNull(script, "script");
        this.script = script;
        return this;
    }

    public PostTransaction withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public PostTransaction withTimestamp(Optional<? extends OffsetDateTime> timestamp) {
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
        PostTransaction other = (PostTransaction) o;
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
        return Utils.toString(PostTransaction.class,
                "metadata", metadata,
                "postings", postings,
                "reference", reference,
                "script", script,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata = JsonNullable.undefined();
 
        private Optional<? extends java.util.List<Posting>> postings = Optional.empty();
 
        private Optional<? extends String> reference = Optional.empty();
 
        private Optional<? extends PostTransactionScript> script = Optional.empty();
 
        private Optional<? extends OffsetDateTime> timestamp = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder metadata(java.util.Map<String, java.lang.Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = JsonNullable.of(metadata);
            return this;
        }

        public Builder metadata(JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata) {
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

        public Builder script(PostTransactionScript script) {
            Utils.checkNotNull(script, "script");
            this.script = Optional.ofNullable(script);
            return this;
        }

        public Builder script(Optional<? extends PostTransactionScript> script) {
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
        
        public PostTransaction build() {
            return new PostTransaction(
                metadata,
                postings,
                reference,
                script,
                timestamp);
        }
    }
}

