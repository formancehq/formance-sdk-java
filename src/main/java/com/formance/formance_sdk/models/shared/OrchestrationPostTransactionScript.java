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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class OrchestrationPostTransactionScript {

    @JsonProperty("plain")
    private String plain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends Map<String, Object>> vars;

    @JsonCreator
    public OrchestrationPostTransactionScript(
            @JsonProperty("plain") String plain,
            @JsonProperty("vars") Optional<? extends Map<String, Object>> vars) {
        Utils.checkNotNull(plain, "plain");
        Utils.checkNotNull(vars, "vars");
        this.plain = plain;
        this.vars = vars;
    }
    
    public OrchestrationPostTransactionScript(
            String plain) {
        this(plain, Optional.empty());
    }

    @JsonIgnore
    public String plain() {
        return plain;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> vars() {
        return (Optional<Map<String, Object>>) vars;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public OrchestrationPostTransactionScript withPlain(String plain) {
        Utils.checkNotNull(plain, "plain");
        this.plain = plain;
        return this;
    }

    public OrchestrationPostTransactionScript withVars(Map<String, Object> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public OrchestrationPostTransactionScript withVars(Optional<? extends Map<String, Object>> vars) {
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
        OrchestrationPostTransactionScript other = (OrchestrationPostTransactionScript) o;
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
        return Utils.toString(OrchestrationPostTransactionScript.class,
                "plain", plain,
                "vars", vars);
    }
    
    public final static class Builder {
 
        private String plain;
 
        private Optional<? extends Map<String, Object>> vars = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder plain(String plain) {
            Utils.checkNotNull(plain, "plain");
            this.plain = plain;
            return this;
        }

        public Builder vars(Map<String, Object> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = Optional.ofNullable(vars);
            return this;
        }

        public Builder vars(Optional<? extends Map<String, Object>> vars) {
            Utils.checkNotNull(vars, "vars");
            this.vars = vars;
            return this;
        }
        
        public OrchestrationPostTransactionScript build() {
            return new OrchestrationPostTransactionScript(
                plain,
                vars);
        }
    }
}
