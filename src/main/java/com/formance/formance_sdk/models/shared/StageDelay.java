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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class StageDelay {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<String> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("until")
    private Optional<OffsetDateTime> until;

    @JsonCreator
    public StageDelay(
            @JsonProperty("duration") Optional<String> duration,
            @JsonProperty("until") Optional<OffsetDateTime> until) {
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(until, "until");
        this.duration = duration;
        this.until = until;
    }
    
    public StageDelay() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> until() {
        return until;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public StageDelay withDuration(String duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public StageDelay withDuration(Optional<String> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public StageDelay withUntil(OffsetDateTime until) {
        Utils.checkNotNull(until, "until");
        this.until = Optional.ofNullable(until);
        return this;
    }

    public StageDelay withUntil(Optional<OffsetDateTime> until) {
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
        StageDelay other = (StageDelay) o;
        return 
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.until, other.until);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            duration,
            until);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StageDelay.class,
                "duration", duration,
                "until", until);
    }
    
    public final static class Builder {
 
        private Optional<String> duration = Optional.empty();
 
        private Optional<OffsetDateTime> until = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder duration(String duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<String> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder until(OffsetDateTime until) {
            Utils.checkNotNull(until, "until");
            this.until = Optional.ofNullable(until);
            return this;
        }

        public Builder until(Optional<OffsetDateTime> until) {
            Utils.checkNotNull(until, "until");
            this.until = until;
            return this;
        }
        
        public StageDelay build() {
            return new StageDelay(
                duration,
                until);
        }
    }
}
