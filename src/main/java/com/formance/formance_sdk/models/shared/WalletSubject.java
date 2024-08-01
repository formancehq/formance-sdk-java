/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class WalletSubject implements Subject {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends String> balance;

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("type")
    private String type;

    @JsonCreator
    public WalletSubject(
            @JsonProperty("balance") Optional<? extends String> balance,
            @JsonProperty("identifier") String identifier,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(type, "type");
        this.balance = balance;
        this.identifier = identifier;
        this.type = type;
    }
    
    public WalletSubject(
            String identifier,
            String type) {
        this(Optional.empty(), identifier, type);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> balance() {
        return (Optional<String>) balance;
    }

    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    @JsonIgnore
    @Override
    public java.lang.String type() {
        return Utils.discriminatorToString(type);
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WalletSubject withBalance(String balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    public WalletSubject withBalance(Optional<? extends String> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    public WalletSubject withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public WalletSubject withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        WalletSubject other = (WalletSubject) o;
        return 
            java.util.Objects.deepEquals(this.balance, other.balance) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            balance,
            identifier,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WalletSubject.class,
                "balance", balance,
                "identifier", identifier,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> balance = Optional.empty();
 
        private String identifier;
 
        private String type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balance(String balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        public Builder balance(Optional<? extends String> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public WalletSubject build() {
            return new WalletSubject(
                balance,
                identifier,
                type);
        }
    }
}

