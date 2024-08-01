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
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class V2Hold {

    @JsonProperty("description")
    private String description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    private Optional<? extends V2Subject> destination;

    /**
     * The unique ID of the hold.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Metadata associated with the hold.
     */
    @JsonProperty("metadata")
    private java.util.Map<String, String> metadata;

    /**
     * The ID of the wallet the hold is associated with.
     */
    @JsonProperty("walletID")
    private String walletID;

    @JsonCreator
    public V2Hold(
            @JsonProperty("description") String description,
            @JsonProperty("destination") Optional<? extends V2Subject> destination,
            @JsonProperty("id") String id,
            @JsonProperty("metadata") java.util.Map<String, String> metadata,
            @JsonProperty("walletID") String walletID) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(destination, "destination");
        Utils.checkNotNull(id, "id");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(walletID, "walletID");
        this.description = description;
        this.destination = destination;
        this.id = id;
        this.metadata = metadata;
        this.walletID = walletID;
    }
    
    public V2Hold(
            String description,
            String id,
            java.util.Map<String, String> metadata,
            String walletID) {
        this(description, Optional.empty(), id, metadata, walletID);
    }

    @JsonIgnore
    public String description() {
        return description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2Subject> destination() {
        return (Optional<V2Subject>) destination;
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
    public java.util.Map<String, String> metadata() {
        return metadata;
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

    public V2Hold withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public V2Hold withDestination(V2Subject destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = Optional.ofNullable(destination);
        return this;
    }

    public V2Hold withDestination(Optional<? extends V2Subject> destination) {
        Utils.checkNotNull(destination, "destination");
        this.destination = destination;
        return this;
    }

    /**
     * The unique ID of the hold.
     */
    public V2Hold withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Metadata associated with the hold.
     */
    public V2Hold withMetadata(java.util.Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The ID of the wallet the hold is associated with.
     */
    public V2Hold withWalletID(String walletID) {
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
        V2Hold other = (V2Hold) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.destination, other.destination) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.walletID, other.walletID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            destination,
            id,
            metadata,
            walletID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Hold.class,
                "description", description,
                "destination", destination,
                "id", id,
                "metadata", metadata,
                "walletID", walletID);
    }
    
    public final static class Builder {
 
        private String description;
 
        private Optional<? extends V2Subject> destination = Optional.empty();
 
        private String id;
 
        private java.util.Map<String, String> metadata;
 
        private String walletID;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder destination(V2Subject destination) {
            Utils.checkNotNull(destination, "destination");
            this.destination = Optional.ofNullable(destination);
            return this;
        }

        public Builder destination(Optional<? extends V2Subject> destination) {
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
        public Builder metadata(java.util.Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
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
        
        public V2Hold build() {
            return new V2Hold(
                description,
                destination,
                id,
                metadata,
                walletID);
        }
    }
}

