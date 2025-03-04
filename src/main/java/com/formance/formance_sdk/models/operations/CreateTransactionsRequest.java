/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.formance.formance_sdk.models.shared.Transactions;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class CreateTransactionsRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private Transactions transactions;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    @JsonCreator
    public CreateTransactionsRequest(
            Transactions transactions,
            String ledger) {
        Utils.checkNotNull(transactions, "transactions");
        Utils.checkNotNull(ledger, "ledger");
        this.transactions = transactions;
        this.ledger = ledger;
    }

    @JsonIgnore
    public Transactions transactions() {
        return transactions;
    }

    /**
     * Name of the ledger.
     */
    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateTransactionsRequest withTransactions(Transactions transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public CreateTransactionsRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
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
        CreateTransactionsRequest other = (CreateTransactionsRequest) o;
        return 
            Objects.deepEquals(this.transactions, other.transactions) &&
            Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            transactions,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransactionsRequest.class,
                "transactions", transactions,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private Transactions transactions;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder transactions(Transactions transactions) {
            Utils.checkNotNull(transactions, "transactions");
            this.transactions = transactions;
            return this;
        }

        /**
         * Name of the ledger.
         */
        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public CreateTransactionsRequest build() {
            return new CreateTransactionsRequest(
                transactions,
                ledger);
        }
    }
}

