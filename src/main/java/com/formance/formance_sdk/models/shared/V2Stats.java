/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;


public class V2Stats {

    @JsonProperty("accounts")
    private long accounts;

    @JsonProperty("transactions")
    private BigInteger transactions;

    @JsonCreator
    public V2Stats(
            @JsonProperty("accounts") long accounts,
            @JsonProperty("transactions") BigInteger transactions) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(transactions, "transactions");
        this.accounts = accounts;
        this.transactions = transactions;
    }

    @JsonIgnore
    public long accounts() {
        return accounts;
    }

    @JsonIgnore
    public BigInteger transactions() {
        return transactions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2Stats withAccounts(long accounts) {
        Utils.checkNotNull(accounts, "accounts");
        this.accounts = accounts;
        return this;
    }

    public V2Stats withTransactions(long transactions) {
        this.transactions = BigInteger.valueOf(transactions);
        return this;
    }

    public V2Stats withTransactions(BigInteger transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
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
        V2Stats other = (V2Stats) o;
        return 
            Objects.deepEquals(this.accounts, other.accounts) &&
            Objects.deepEquals(this.transactions, other.transactions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accounts,
            transactions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2Stats.class,
                "accounts", accounts,
                "transactions", transactions);
    }
    
    public final static class Builder {
 
        private Long accounts;
 
        private BigInteger transactions;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accounts(long accounts) {
            Utils.checkNotNull(accounts, "accounts");
            this.accounts = accounts;
            return this;
        }

        public Builder transactions(long transactions) {
            this.transactions = BigInteger.valueOf(transactions);
            return this;
        }

        public Builder transactions(BigInteger transactions) {
            Utils.checkNotNull(transactions, "transactions");
            this.transactions = transactions;
            return this;
        }
        
        public V2Stats build() {
            return new V2Stats(
                accounts,
                transactions);
        }
    }
}

