/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class Contract {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<? extends String> account;

    @JsonProperty("expr")
    private Expr expr;

    @JsonCreator
    public Contract(
            @JsonProperty("account") Optional<? extends String> account,
            @JsonProperty("expr") Expr expr) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(expr, "expr");
        this.account = account;
        this.expr = expr;
    }
    
    public Contract(
            Expr expr) {
        this(Optional.empty(), expr);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> account() {
        return (Optional<String>) account;
    }

    @JsonIgnore
    public Expr expr() {
        return expr;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Contract withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    public Contract withAccount(Optional<? extends String> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    public Contract withExpr(Expr expr) {
        Utils.checkNotNull(expr, "expr");
        this.expr = expr;
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
        Contract other = (Contract) o;
        return 
            java.util.Objects.deepEquals(this.account, other.account) &&
            java.util.Objects.deepEquals(this.expr, other.expr);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            account,
            expr);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Contract.class,
                "account", account,
                "expr", expr);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> account = Optional.empty();
 
        private Expr expr;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        public Builder account(Optional<? extends String> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        public Builder expr(Expr expr) {
            Utils.checkNotNull(expr, "expr");
            this.expr = expr;
            return this;
        }
        
        public Contract build() {
            return new Contract(
                account,
                expr);
        }
    }
}

