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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class WalletsTransaction {

    @JsonProperty("id")
    private long id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledger")
    private Optional<String> ledger;

    /**
     * Metadata associated with the wallet.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postCommitVolumes")
    private Optional<? extends Map<String, Map<String, WalletsVolume>>> postCommitVolumes;

    @JsonProperty("postings")
    private List<Posting> postings;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preCommitVolumes")
    private Optional<? extends Map<String, Map<String, WalletsVolume>>> preCommitVolumes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonCreator
    public WalletsTransaction(
            @JsonProperty("id") long id,
            @JsonProperty("ledger") Optional<String> ledger,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("postCommitVolumes") Optional<? extends Map<String, Map<String, WalletsVolume>>> postCommitVolumes,
            @JsonProperty("postings") List<Posting> postings,
            @JsonProperty("preCommitVolumes") Optional<? extends Map<String, Map<String, WalletsVolume>>> preCommitVolumes,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("timestamp") OffsetDateTime timestamp) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        Utils.checkNotNull(postings, "postings");
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(timestamp, "timestamp");
        this.id = id;
        this.ledger = ledger;
        this.metadata = metadata;
        this.postCommitVolumes = postCommitVolumes;
        this.postings = postings;
        this.preCommitVolumes = preCommitVolumes;
        this.reference = reference;
        this.timestamp = timestamp;
    }
    
    public WalletsTransaction(
            long id,
            Map<String, String> metadata,
            List<Posting> postings,
            OffsetDateTime timestamp) {
        this(id, Optional.empty(), metadata, Optional.empty(), postings, Optional.empty(), Optional.empty(), timestamp);
    }

    @JsonIgnore
    public long id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> ledger() {
        return ledger;
    }

    /**
     * Metadata associated with the wallet.
     */
    @JsonIgnore
    public Map<String, String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Map<String, WalletsVolume>>> postCommitVolumes() {
        return (Optional<Map<String, Map<String, WalletsVolume>>>) postCommitVolumes;
    }

    @JsonIgnore
    public List<Posting> postings() {
        return postings;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Map<String, WalletsVolume>>> preCommitVolumes() {
        return (Optional<Map<String, Map<String, WalletsVolume>>>) preCommitVolumes;
    }

    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    @JsonIgnore
    public OffsetDateTime timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WalletsTransaction withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public WalletsTransaction withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = Optional.ofNullable(ledger);
        return this;
    }

    public WalletsTransaction withLedger(Optional<String> ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Metadata associated with the wallet.
     */
    public WalletsTransaction withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public WalletsTransaction withPostCommitVolumes(Map<String, Map<String, WalletsVolume>> postCommitVolumes) {
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        this.postCommitVolumes = Optional.ofNullable(postCommitVolumes);
        return this;
    }

    public WalletsTransaction withPostCommitVolumes(Optional<? extends Map<String, Map<String, WalletsVolume>>> postCommitVolumes) {
        Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
        this.postCommitVolumes = postCommitVolumes;
        return this;
    }

    public WalletsTransaction withPostings(List<Posting> postings) {
        Utils.checkNotNull(postings, "postings");
        this.postings = postings;
        return this;
    }

    public WalletsTransaction withPreCommitVolumes(Map<String, Map<String, WalletsVolume>> preCommitVolumes) {
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        this.preCommitVolumes = Optional.ofNullable(preCommitVolumes);
        return this;
    }

    public WalletsTransaction withPreCommitVolumes(Optional<? extends Map<String, Map<String, WalletsVolume>>> preCommitVolumes) {
        Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
        this.preCommitVolumes = preCommitVolumes;
        return this;
    }

    public WalletsTransaction withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    public WalletsTransaction withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public WalletsTransaction withTimestamp(OffsetDateTime timestamp) {
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
        WalletsTransaction other = (WalletsTransaction) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.ledger, other.ledger) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.postCommitVolumes, other.postCommitVolumes) &&
            Objects.deepEquals(this.postings, other.postings) &&
            Objects.deepEquals(this.preCommitVolumes, other.preCommitVolumes) &&
            Objects.deepEquals(this.reference, other.reference) &&
            Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            ledger,
            metadata,
            postCommitVolumes,
            postings,
            preCommitVolumes,
            reference,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WalletsTransaction.class,
                "id", id,
                "ledger", ledger,
                "metadata", metadata,
                "postCommitVolumes", postCommitVolumes,
                "postings", postings,
                "preCommitVolumes", preCommitVolumes,
                "reference", reference,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private Optional<String> ledger = Optional.empty();
 
        private Map<String, String> metadata;
 
        private Optional<? extends Map<String, Map<String, WalletsVolume>>> postCommitVolumes = Optional.empty();
 
        private List<Posting> postings;
 
        private Optional<? extends Map<String, Map<String, WalletsVolume>>> preCommitVolumes = Optional.empty();
 
        private Optional<String> reference = Optional.empty();
 
        private OffsetDateTime timestamp;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = Optional.ofNullable(ledger);
            return this;
        }

        public Builder ledger(Optional<String> ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }

        /**
         * Metadata associated with the wallet.
         */
        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder postCommitVolumes(Map<String, Map<String, WalletsVolume>> postCommitVolumes) {
            Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
            this.postCommitVolumes = Optional.ofNullable(postCommitVolumes);
            return this;
        }

        public Builder postCommitVolumes(Optional<? extends Map<String, Map<String, WalletsVolume>>> postCommitVolumes) {
            Utils.checkNotNull(postCommitVolumes, "postCommitVolumes");
            this.postCommitVolumes = postCommitVolumes;
            return this;
        }

        public Builder postings(List<Posting> postings) {
            Utils.checkNotNull(postings, "postings");
            this.postings = postings;
            return this;
        }

        public Builder preCommitVolumes(Map<String, Map<String, WalletsVolume>> preCommitVolumes) {
            Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
            this.preCommitVolumes = Optional.ofNullable(preCommitVolumes);
            return this;
        }

        public Builder preCommitVolumes(Optional<? extends Map<String, Map<String, WalletsVolume>>> preCommitVolumes) {
            Utils.checkNotNull(preCommitVolumes, "preCommitVolumes");
            this.preCommitVolumes = preCommitVolumes;
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

        public Builder timestamp(OffsetDateTime timestamp) {
            Utils.checkNotNull(timestamp, "timestamp");
            this.timestamp = timestamp;
            return this;
        }
        
        public WalletsTransaction build() {
            return new WalletsTransaction(
                id,
                ledger,
                metadata,
                postCommitVolumes,
                postings,
                preCommitVolumes,
                reference,
                timestamp);
        }
    }
}

