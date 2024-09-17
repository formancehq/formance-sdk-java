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
import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;


public class V2Volume {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance")
    private Optional<? extends BigInteger> balance;

    @JsonProperty("input")
    private BigInteger input;

    @JsonProperty("output")
    private BigInteger output;

    @JsonCreator
    public V2Volume(
            @JsonProperty("balance") Optional<? extends BigInteger> balance,
            @JsonProperty("input") BigInteger input,
            @JsonProperty("output") BigInteger output) {
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(output, "output");
        this.balance = balance;
        this.input = input;
        this.output = output;
    }
    
    public V2Volume(
            BigInteger input,
            BigInteger output) {
        this(Optional.empty(), input, output);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BigInteger> balance() {
        return (Optional<BigInteger>) balance;
    }

    @JsonIgnore
    public BigInteger input() {
        return input;
    }

    @JsonIgnore
    public BigInteger output() {
        return output;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2Volume withBalance(BigInteger balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = Optional.ofNullable(balance);
        return this;
    }

    public V2Volume withBalance(long balance) {
        this.balance = Optional.of(BigInteger.valueOf(balance));
        return this;
    }

    public V2Volume withBalance(Optional<? extends BigInteger> balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    public V2Volume withInput(long input) {
        this.input = BigInteger.valueOf(input);
        return this;
    }

    public V2Volume withInput(BigInteger input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    public V2Volume withOutput(long output) {
        this.output = BigInteger.valueOf(output);
        return this;
    }

    public V2Volume withOutput(BigInteger output) {
        Utils.checkNotNull(output, "output");
        this.output = output;
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
        V2Volume other = (V2Volume) o;
        return 
            Objects.deepEquals(this.balance, other.balance) &&
            Objects.deepEquals(this.input, other.input) &&
            Objects.deepEquals(this.output, other.output);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            balance,
            input,
            output);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Volume.class,
                "balance", balance,
                "input", input,
                "output", output);
    }
    
    public final static class Builder {
 
        private Optional<? extends BigInteger> balance = Optional.empty();
 
        private BigInteger input;
 
        private BigInteger output;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balance(BigInteger balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = Optional.ofNullable(balance);
            return this;
        }

        public Builder balance(long balance) {
            this.balance = Optional.of(BigInteger.valueOf(balance));
            return this;
        }

        public Builder balance(Optional<? extends BigInteger> balance) {
            Utils.checkNotNull(balance, "balance");
            this.balance = balance;
            return this;
        }

        public Builder input(long input) {
            this.input = BigInteger.valueOf(input);
            return this;
        }

        public Builder input(BigInteger input) {
            Utils.checkNotNull(input, "input");
            this.input = input;
            return this;
        }

        public Builder output(long output) {
            this.output = BigInteger.valueOf(output);
            return this;
        }

        public Builder output(BigInteger output) {
            Utils.checkNotNull(output, "output");
            this.output = output;
            return this;
        }
        
        public V2Volume build() {
            return new V2Volume(
                balance,
                input,
                output);
        }
    }
}

