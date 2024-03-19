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


public class V2Stats {

    @JsonProperty("accounts")
    private long accounts;

    @JsonProperty("transactions")
    private BigInteger transactions;

    public V2Stats(
            @JsonProperty("accounts") long accounts,
            @JsonProperty("transactions") BigInteger transactions) {
        Utils.checkNotNull(accounts, "accounts");
        Utils.checkNotNull(transactions, "transactions");
        this.accounts = accounts;
        this.transactions = transactions;
    }

    public long accounts() {
        return accounts;
    }

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
            java.util.Objects.deepEquals(this.accounts, other.accounts) &&
            java.util.Objects.deepEquals(this.transactions, other.transactions);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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

