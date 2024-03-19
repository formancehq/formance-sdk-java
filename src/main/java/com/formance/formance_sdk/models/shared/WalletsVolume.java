/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class WalletsVolume {

    @JsonProperty("balance")
    private BigInteger balance;

    @JsonProperty("input")
    private BigInteger input;

    @JsonProperty("output")
    private BigInteger output;

    public WalletsVolume(
            @JsonProperty("balance") BigInteger balance,
            @JsonProperty("input") BigInteger input,
            @JsonProperty("output") BigInteger output) {
        Utils.checkNotNull(balance, "balance");
        Utils.checkNotNull(input, "input");
        Utils.checkNotNull(output, "output");
        this.balance = balance;
        this.input = input;
        this.output = output;
    }

    public BigInteger balance() {
        return balance;
    }

    public BigInteger input() {
        return input;
    }

    public BigInteger output() {
        return output;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WalletsVolume withBalance(long balance) {
        this.balance = BigInteger.valueOf(balance);
        return this;
    }

    public WalletsVolume withBalance(BigInteger balance) {
        Utils.checkNotNull(balance, "balance");
        this.balance = balance;
        return this;
    }

    public WalletsVolume withInput(long input) {
        this.input = BigInteger.valueOf(input);
        return this;
    }

    public WalletsVolume withInput(BigInteger input) {
        Utils.checkNotNull(input, "input");
        this.input = input;
        return this;
    }

    public WalletsVolume withOutput(long output) {
        this.output = BigInteger.valueOf(output);
        return this;
    }

    public WalletsVolume withOutput(BigInteger output) {
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
        WalletsVolume other = (WalletsVolume) o;
        return 
            java.util.Objects.deepEquals(this.balance, other.balance) &&
            java.util.Objects.deepEquals(this.input, other.input) &&
            java.util.Objects.deepEquals(this.output, other.output);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            balance,
            input,
            output);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WalletsVolume.class,
                "balance", balance,
                "input", input,
                "output", output);
    }
    
    public final static class Builder {
 
        private BigInteger balance;
 
        private BigInteger input;
 
        private BigInteger output;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder balance(long balance) {
            this.balance = BigInteger.valueOf(balance);
            return this;
        }

        public Builder balance(BigInteger balance) {
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
        
        public WalletsVolume build() {
            return new WalletsVolume(
                balance,
                input,
                output);
        }
    }
}
