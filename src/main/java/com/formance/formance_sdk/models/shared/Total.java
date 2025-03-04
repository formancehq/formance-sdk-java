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
import java.util.Objects;
import java.util.Optional;

public class Total {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relation")
    private Optional<String> relation;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<Long> value;

    @JsonCreator
    public Total(
            @JsonProperty("relation") Optional<String> relation,
            @JsonProperty("value") Optional<Long> value) {
        Utils.checkNotNull(relation, "relation");
        Utils.checkNotNull(value, "value");
        this.relation = relation;
        this.value = value;
    }
    
    public Total() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> relation() {
        return relation;
    }

    @JsonIgnore
    public Optional<Long> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Total withRelation(String relation) {
        Utils.checkNotNull(relation, "relation");
        this.relation = Optional.ofNullable(relation);
        return this;
    }

    public Total withRelation(Optional<String> relation) {
        Utils.checkNotNull(relation, "relation");
        this.relation = relation;
        return this;
    }

    public Total withValue(long value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public Total withValue(Optional<Long> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        Total other = (Total) o;
        return 
            Objects.deepEquals(this.relation, other.relation) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            relation,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Total.class,
                "relation", relation,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> relation = Optional.empty();
 
        private Optional<Long> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder relation(String relation) {
            Utils.checkNotNull(relation, "relation");
            this.relation = Optional.ofNullable(relation);
            return this;
        }

        public Builder relation(Optional<String> relation) {
            Utils.checkNotNull(relation, "relation");
            this.relation = relation;
            return this;
        }

        public Builder value(long value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<Long> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public Total build() {
            return new Total(
                relation,
                value);
        }
    }
}

