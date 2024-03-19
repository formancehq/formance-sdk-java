/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class V2PostTransactionScript {

    @JsonProperty("plain")
    private String plain;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("vars")
    private Optional<? extends java.util.Map<String, java.lang.Object>> vars;

    public V2PostTransactionScript(
            @JsonProperty("plain") String plain,
            @JsonProperty("vars") Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
        Utils.checkNotNull(plain, "plain");
        Utils.checkNotNull(vars, "vars");
        this.plain = plain;
        this.vars = vars;
    }

    public String plain() {
        return plain;
    }

    public Optional<? extends java.util.Map<String, java.lang.Object>> vars() {
        return vars;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2PostTransactionScript withPlain(String plain) {
        Utils.checkNotNull(plain, "plain");
        this.plain = plain;
        return this;
    }

    public V2PostTransactionScript withVars(java.util.Map<String, java.lang.Object> vars) {
        Utils.checkNotNull(vars, "vars");
        this.vars = Optional.ofNullable(vars);
        return this;
    }

    public V2PostTransactionScript withVars(Optional<? extends java.util.Map<String, java.lang.Object>> vars) {
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
            java.util.Objects.deepEquals(this.plain, other.plain) &&
            java.util.Objects.deepEquals(this.vars, other.vars);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> vars = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder plain(String plain) {
            Utils.checkNotNull(plain, "plain");
            this.plain = plain;
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
        
        public V2PostTransactionScript build() {
            return new V2PostTransactionScript(
                plain,
                vars);
        }
    }
}
