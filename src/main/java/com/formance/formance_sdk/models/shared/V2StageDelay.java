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


public class V2StageDelay {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<? extends String> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("until")
    private Optional<? extends OffsetDateTime> until;

    @JsonCreator
    public V2StageDelay(
            @JsonProperty("duration") Optional<? extends String> duration,
            @JsonProperty("until") Optional<? extends OffsetDateTime> until) {
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(until, "until");
        this.duration = duration;
        this.until = until;
    }
    
    public V2StageDelay() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> duration() {
        return (Optional<String>) duration;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> until() {
        return (Optional<OffsetDateTime>) until;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2StageDelay withDuration(String duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public V2StageDelay withDuration(Optional<? extends String> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public V2StageDelay withUntil(OffsetDateTime until) {
        Utils.checkNotNull(until, "until");
        this.until = Optional.ofNullable(until);
        return this;
    }

    public V2StageDelay withUntil(Optional<? extends OffsetDateTime> until) {
        Utils.checkNotNull(until, "until");
        this.until = until;
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
        V2StageDelay other = (V2StageDelay) o;
        return 
            java.util.Objects.deepEquals(this.duration, other.duration) &&
            java.util.Objects.deepEquals(this.until, other.until);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            duration,
            until);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2StageDelay.class,
                "duration", duration,
                "until", until);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> duration = Optional.empty();
 
        private Optional<? extends OffsetDateTime> until = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder duration(String duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<? extends String> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder until(OffsetDateTime until) {
            Utils.checkNotNull(until, "until");
            this.until = Optional.ofNullable(until);
            return this;
        }

        public Builder until(Optional<? extends OffsetDateTime> until) {
            Utils.checkNotNull(until, "until");
            this.until = until;
            return this;
        }
        
        public V2StageDelay build() {
            return new V2StageDelay(
                duration,
                until);
        }
    }
}

