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
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class V2Account {

    @JsonProperty("address")
    private String address;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effectiveVolumes")
    private Optional<? extends Map<String, V2Volume>> effectiveVolumes;

    @JsonProperty("metadata")
    private Map<String, String> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("volumes")
    private Optional<? extends Map<String, V2Volume>> volumes;

    @JsonCreator
    public V2Account(
            @JsonProperty("address") String address,
            @JsonProperty("effectiveVolumes") Optional<? extends Map<String, V2Volume>> effectiveVolumes,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("volumes") Optional<? extends Map<String, V2Volume>> volumes) {
        Utils.checkNotNull(address, "address");
        Utils.checkNotNull(effectiveVolumes, "effectiveVolumes");
        metadata = Utils.emptyMapIfNull(metadata);
        Utils.checkNotNull(volumes, "volumes");
        this.address = address;
        this.effectiveVolumes = effectiveVolumes;
        this.metadata = metadata;
        this.volumes = volumes;
    }
    
    public V2Account(
            String address,
            Map<String, String> metadata) {
        this(address, Optional.empty(), metadata, Optional.empty());
    }

    @JsonIgnore
    public String address() {
        return address;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, V2Volume>> effectiveVolumes() {
        return (Optional<Map<String, V2Volume>>) effectiveVolumes;
    }

    @JsonIgnore
    public Map<String, String> metadata() {
        return metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, V2Volume>> volumes() {
        return (Optional<Map<String, V2Volume>>) volumes;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2Account withAddress(String address) {
        Utils.checkNotNull(address, "address");
        this.address = address;
        return this;
    }

    public V2Account withEffectiveVolumes(Map<String, V2Volume> effectiveVolumes) {
        Utils.checkNotNull(effectiveVolumes, "effectiveVolumes");
        this.effectiveVolumes = Optional.ofNullable(effectiveVolumes);
        return this;
    }

    public V2Account withEffectiveVolumes(Optional<? extends Map<String, V2Volume>> effectiveVolumes) {
        Utils.checkNotNull(effectiveVolumes, "effectiveVolumes");
        this.effectiveVolumes = effectiveVolumes;
        return this;
    }

    public V2Account withMetadata(Map<String, String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public V2Account withVolumes(Map<String, V2Volume> volumes) {
        Utils.checkNotNull(volumes, "volumes");
        this.volumes = Optional.ofNullable(volumes);
        return this;
    }

    public V2Account withVolumes(Optional<? extends Map<String, V2Volume>> volumes) {
        Utils.checkNotNull(volumes, "volumes");
        this.volumes = volumes;
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
        V2Account other = (V2Account) o;
        return 
            Objects.deepEquals(this.address, other.address) &&
            Objects.deepEquals(this.effectiveVolumes, other.effectiveVolumes) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.volumes, other.volumes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            effectiveVolumes,
            metadata,
            volumes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Account.class,
                "address", address,
                "effectiveVolumes", effectiveVolumes,
                "metadata", metadata,
                "volumes", volumes);
    }
    
    public final static class Builder {
 
        private String address;
 
        private Optional<? extends Map<String, V2Volume>> effectiveVolumes = Optional.empty();
 
        private Map<String, String> metadata;
 
        private Optional<? extends Map<String, V2Volume>> volumes = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder address(String address) {
            Utils.checkNotNull(address, "address");
            this.address = address;
            return this;
        }

        public Builder effectiveVolumes(Map<String, V2Volume> effectiveVolumes) {
            Utils.checkNotNull(effectiveVolumes, "effectiveVolumes");
            this.effectiveVolumes = Optional.ofNullable(effectiveVolumes);
            return this;
        }

        public Builder effectiveVolumes(Optional<? extends Map<String, V2Volume>> effectiveVolumes) {
            Utils.checkNotNull(effectiveVolumes, "effectiveVolumes");
            this.effectiveVolumes = effectiveVolumes;
            return this;
        }

        public Builder metadata(Map<String, String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder volumes(Map<String, V2Volume> volumes) {
            Utils.checkNotNull(volumes, "volumes");
            this.volumes = Optional.ofNullable(volumes);
            return this;
        }

        public Builder volumes(Optional<? extends Map<String, V2Volume>> volumes) {
            Utils.checkNotNull(volumes, "volumes");
            this.volumes = volumes;
            return this;
        }
        
        public V2Account build() {
            return new V2Account(
                address,
                effectiveVolumes,
                metadata,
                volumes);
        }
    }
}
