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
import java.util.Objects;
import java.util.Optional;

public class V2PaymentMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonCreator
    public V2PaymentMetadata(
            @JsonProperty("key") Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
    }
    
    public V2PaymentMetadata() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V2PaymentMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public V2PaymentMetadata withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        V2PaymentMetadata other = (V2PaymentMetadata) o;
        return 
            Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2PaymentMetadata.class,
                "key", key);
    }
    
    public final static class Builder {
 
        private Optional<String> key = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public V2PaymentMetadata build() {
            return new V2PaymentMetadata(
                key);
        }
    }
}
