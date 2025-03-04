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

public class V2PostTransactionScript {

    @JsonProperty("plain")
    private String plain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends Map<String, String>> vars;

    @JsonCreator
    public V2PostTransactionScript(
            @JsonProperty("plain") String plain,
            @JsonProperty("vars") Optional<? extends Map<String, String>> vars) {
        Utils.checkNotNull(plain, "plain");
        Utils.checkNotNull(vars, "vars");
        this.plain = plain;
        this.vars = vars;
    }
    
    public V2PostTransactionScript(
            String plain) {
        this(plain, Optional.empty());
    }

    @JsonIgnore
    public String plain() {
        return plain;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, String>> vars() {
        return (Optional<Map<String, String>>) vars;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2PostTransactionScript withPlain(String plain) {
        Utils.checkNotNull(plain, "plain");
        this.plain = plain;
        return this;
    }

    public V2PostTransactionScript withVars(Map<String, String> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public V2PostTransactionScript withVars(Optional<? extends Map<String, String>> vars) {
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
        V2PostTransactionScript other = (V2PostTransactionScript) o;
        return 
            Objects.deepEquals(this.plain, other.plain) &&
            Objects.deepEquals(this.vars, other.vars);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            plain,
            vars);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2PostTransactionScript.class,
                "plain", plain,
                "vars", vars);
    }
    
    public final static class Builder {
 
        private String plain;
 
        private Optional<? extends Map<String, String>> vars = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder plain(String plain) {
            Utils.checkNotNull(plain, "plain");
            this.plain = plain;
            return this;
        }

        public Builder vars(Map<String, String> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = Optional.ofNullable(vars);
            return this;
        }

        public Builder vars(Optional<? extends Map<String, String>> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = vars;
            return this;
        }
        
        public V2PostTransactionScript build() {
            return new V2PostTransactionScript(
                plain,
                vars);
        }
    }
}

