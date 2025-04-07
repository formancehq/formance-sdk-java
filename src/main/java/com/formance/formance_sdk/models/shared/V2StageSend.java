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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2StageSend {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<? extends V2Monetary> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    private Optional<? extends V2StageSendDestination> destination;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Map<String, String>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<? extends V2StageSendSource> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timestamp")
    private Optional<OffsetDateTime> timestamp;

    @JsonCreator
    public V2StageSend(
            @JsonProperty("amount") Optional<? extends V2Monetary> amount,
            @JsonProperty("destination") Optional<? extends V2StageSendDestination> destination,
            @JsonProperty("metadata") Optional<? extends Map<String, String>> metadata,
            @JsonProperty("source") Optional<? extends V2StageSendSource> source,
            @JsonProperty("timestamp") Optional<OffsetDateTime> timestamp) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(timestamp, "timestamp");
        this.amount = amount;
        this.destination = destination;
        this.metadata = metadata;
        this.source = source;
        this.timestamp = timestamp;
    }
    
    public V2StageSend() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2Monetary> amount() {
        return (Optional<V2Monetary>) amount;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2StageSendDestination> destination() {
        return (Optional<V2StageSendDestination>) destination;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> metadata() {
        return (Optional<Map<String, String>>) metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2StageSendSource> source() {
        return (Optional<V2StageSendSource>) source;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> timestamp() {
        return timestamp;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2StageSend withAmount(V2Monetary amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public V2StageSend withAmount(Optional<? extends V2Monetary> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public V2StageSend withDestination(V2StageSendDestination destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }

    public V2StageSend withDestination(Optional<? extends V2StageSendDestination> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    public V2StageSend withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public V2StageSend withMetadata(Optional<? extends Map<String, String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2StageSend withSource(V2StageSendSource source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    public V2StageSend withSource(Optional<? extends V2StageSendSource> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public V2StageSend withTimestamp(OffsetDateTime timestamp) {
        Utils.checkNotNull(timestamp, "timestamp");
        this.timestamp = Optional.ofNullable(timestamp);
        return this;
    }

    public V2StageSend withTimestamp(Optional<OffsetDateTime> timestamp) {
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
        V2StageSend other = (V2StageSend) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.destination, other.destination) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.timestamp, other.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            destination,
            metadata,
            source,
            timestamp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2StageSend.class,
                "amount", amount,
                "destination", destination,
                "metadata", metadata,
                "source", source,
                "timestamp", timestamp);
    }
    
    public final static class Builder {
 
        private Optional<? extends V2Monetary> amount = Optional.empty();
 
        private Optional<? extends V2StageSendDestination> destination = Optional.empty();
 
        private Optional<? extends Map<String, String>> metadata = Optional.empty();
 
        private Optional<? extends V2StageSendSource> source = Optional.empty();
 
        private Optional<OffsetDateTime> timestamp = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(V2Monetary amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(Optional<? extends V2Monetary> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder destination(V2StageSendDestination destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        public Builder destination(Optional<? extends V2StageSendDestination> destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
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

        public Builder source(V2StageSendSource source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        public Builder source(Optional<? extends V2StageSendSource> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
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
        
        public V2StageSend build() {
            return new V2StageSend(
                amount,
                destination,
                metadata,
                source,
                timestamp);
        }
    }
}
