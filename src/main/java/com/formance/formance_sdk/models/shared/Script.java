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
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Script {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata;

    @JsonProperty("plain")
    private String plain;

    /**
     * Reference to attach to the generated transaction
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<? extends String> reference;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends java.util.Map<String, java.lang.Object>> vars;

    @JsonCreator
    public Script(
            @JsonProperty("metadata") JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata,
            @JsonProperty("plain") String plain,
            @JsonProperty("reference") Optional<? extends String> reference,
            @JsonProperty("vars") Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(plain, "plain");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(vars, "vars");
        this.metadata = metadata;
        this.plain = plain;
        this.reference = reference;
        this.vars = vars;
    }
    
    public Script(
            String plain) {
        this(JsonNullable.undefined(), plain, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata() {
        return metadata;
    }

    @JsonIgnore
    public String plain() {
        return plain;
    }

    /**
     * Reference to attach to the generated transaction
     */
    @JsonIgnore
    public Optional<? extends String> reference() {
        return reference;
    }

    @JsonIgnore
    public Optional<? extends java.util.Map<String, java.lang.Object>> vars() {
        return vars;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Script withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = JsonNullable.of(metadata);
        return this;
    }

    public Script withMetadata(JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public Script withPlain(String plain) {
        Utils.checkNotNull(plain, "plain");
        this.plain = plain;
        return this;
    }

    /**
     * Reference to attach to the generated transaction
     */
    public Script withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }

    /**
     * Reference to attach to the generated transaction
     */
    public Script withReference(Optional<? extends String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    public Script withVars(java.util.Map<String, java.lang.Object> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public Script withVars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = vars;
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
        Script other = (Script) o;
        return 
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.plain, other.plain) &&
            java.util.Objects.deepEquals(this.reference, other.reference) &&
            java.util.Objects.deepEquals(this.vars, other.vars);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            metadata,
            plain,
            reference,
            vars);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Script.class,
                "metadata", metadata,
                "plain", plain,
                "reference", reference,
                "vars", vars);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends java.util.Map<String, java.lang.Object>> metadata = JsonNullable.undefined();
 
        private String plain;
 
        private Optional<? extends String> reference = Optional.empty();
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> vars = Optional.empty();  
        
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

        public Builder plain(String plain) {
            Utils.checkNotNull(plain, "plain");
            this.plain = plain;
            return this;
        }

        /**
         * Reference to attach to the generated transaction
         */
        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        /**
         * Reference to attach to the generated transaction
         */
        public Builder reference(Optional<? extends String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }

        public Builder vars(java.util.Map<String, java.lang.Object> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = Optional.ofNullable(vars);
            return this;
        }

        public Builder vars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = vars;
            return this;
        }
        
        public Script build() {
            return new Script(
                metadata,
                plain,
                reference,
                vars);
        }
    }
}

