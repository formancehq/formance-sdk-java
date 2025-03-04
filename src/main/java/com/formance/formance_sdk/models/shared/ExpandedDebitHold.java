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
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ExpandedDebitHold {

    @JsonProperty("description")
    private String description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    private Optional<? extends Subject> destination;

    /**
     * The unique ID of the hold.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Metadata associated with the hold.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Original amount on hold
     */
    @JsonProperty("originalAmount")
    private BigInteger originalAmount;

    /**
     * Remaining amount on hold
     */
    @JsonProperty("remaining")
    private BigInteger remaining;

    /**
     * The ID of the wallet the hold is associated with.
     */
    @JsonProperty("walletID")
    private String walletID;

    @JsonCreator
    public ExpandedDebitHold(
            @JsonProperty("description") String description,
            @JsonProperty("destination") Optional<? extends Subject> destination,
            @JsonProperty("id") String id,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("originalAmount") BigInteger originalAmount,
            @JsonProperty("remaining") BigInteger remaining,
            @JsonProperty("walletID") String walletID) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(id, "id");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(originalAmount, "originalAmount");
        Utils.checkNotNull(remaining, "remaining");
        Utils.checkNotNull(walletID, "walletID");
        this.description = description;
        this.destination = destination;
        this.id = id;
        this.metadata = metadata;
        this.originalAmount = originalAmount;
        this.remaining = remaining;
        this.walletID = walletID;
    }
    
    public ExpandedDebitHold(
            String description,
            String id,
            Map<String, String> metadata,
            BigInteger originalAmount,
            BigInteger remaining,
            String walletID) {
        this(description, Optional.empty(), id, metadata, originalAmount, remaining, walletID);
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Subject> destination() {
        return (Optional<Subject>) destination;
    }

    /**
     * The unique ID of the hold.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * Metadata associated with the hold.
     */
    @JsonIgnore
    public Map<String, String> metadata() {
        return metadata;
    }

    /**
     * Original amount on hold
     */
    @JsonIgnore
    public BigInteger originalAmount() {
        return originalAmount;
    }

    /**
     * Remaining amount on hold
     */
    @JsonIgnore
    public BigInteger remaining() {
        return remaining;
    }

    /**
     * The ID of the wallet the hold is associated with.
     */
    @JsonIgnore
    public String walletID() {
        return walletID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ExpandedDebitHold withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public ExpandedDebitHold withDestination(Subject destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }

    public ExpandedDebitHold withDestination(Optional<? extends Subject> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    /**
     * The unique ID of the hold.
     */
    public ExpandedDebitHold withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Metadata associated with the hold.
     */
    public ExpandedDebitHold withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

        /**
         * Original amount on hold
         */
    public ExpandedDebitHold withOriginalAmount(long originalAmount) {
        this.originalAmount = BigInteger.valueOf(originalAmount);
        return this;
    }

    /**
     * Original amount on hold
     */
    public ExpandedDebitHold withOriginalAmount(BigInteger originalAmount) {
        Utils.checkNotNull(originalAmount, "originalAmount");
        this.originalAmount = originalAmount;
        return this;
    }

        /**
         * Remaining amount on hold
         */
    public ExpandedDebitHold withRemaining(long remaining) {
        this.remaining = BigInteger.valueOf(remaining);
        return this;
    }

    /**
     * Remaining amount on hold
     */
    public ExpandedDebitHold withRemaining(BigInteger remaining) {
        Utils.checkNotNull(remaining, "remaining");
        this.remaining = remaining;
        return this;
    }

    /**
     * The ID of the wallet the hold is associated with.
     */
    public ExpandedDebitHold withWalletID(String walletID) {
        Utils.checkNotNull(walletID, "walletID");
        this.walletID = walletID;
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
        ExpandedDebitHold other = (ExpandedDebitHold) o;
        return 
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.destination, other.destination) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.originalAmount, other.originalAmount) &&
            Objects.deepEquals(this.remaining, other.remaining) &&
            Objects.deepEquals(this.walletID, other.walletID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            destination,
            id,
            metadata,
            originalAmount,
            remaining,
            walletID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExpandedDebitHold.class,
                "description", description,
                "destination", destination,
                "id", id,
                "metadata", metadata,
                "originalAmount", originalAmount,
                "remaining", remaining,
                "walletID", walletID);
    }
    
    public final static class Builder {
 
        private String description;
 
        private Optional<? extends Subject> destination = Optional.empty();
 
        private String id;
 
        private Map<String, String> metadata;
 
        private BigInteger originalAmount;
 
        private BigInteger remaining;
 
        private String walletID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder destination(Subject destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        public Builder destination(Optional<? extends Subject> destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = destination;
            return this;
        }

        /**
         * The unique ID of the hold.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Metadata associated with the hold.
         */
        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Original amount on hold
         */
        public Builder originalAmount(long originalAmount) {
            this.originalAmount = BigInteger.valueOf(originalAmount);
            return this;
        }

        /**
         * Original amount on hold
         */
        public Builder originalAmount(BigInteger originalAmount) {
            Utils.checkNotNull(originalAmount, "originalAmount");
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * Remaining amount on hold
         */
        public Builder remaining(long remaining) {
            this.remaining = BigInteger.valueOf(remaining);
            return this;
        }

        /**
         * Remaining amount on hold
         */
        public Builder remaining(BigInteger remaining) {
            Utils.checkNotNull(remaining, "remaining");
            this.remaining = remaining;
            return this;
        }

        /**
         * The ID of the wallet the hold is associated with.
         */
        public Builder walletID(String walletID) {
            Utils.checkNotNull(walletID, "walletID");
            this.walletID = walletID;
            return this;
        }
        
        public ExpandedDebitHold build() {
            return new ExpandedDebitHold(
                description,
                destination,
                id,
                metadata,
                originalAmount,
                remaining,
                walletID);
        }
    }
}

