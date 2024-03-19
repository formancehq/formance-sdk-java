/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CreateTransactionRequest {

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.formance.formance_sdk.models.shared.PostTransaction postTransaction;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=preview")
    private Optional<? extends Boolean> preview;

    public CreateTransactionRequest(
            com.formance.formance_sdk.models.shared.PostTransaction postTransaction,
            String ledger,
            Optional<? extends Boolean> preview) {
        Utils.checkNotNull(postTransaction, "postTransaction");
        Utils.checkNotNull(ledger, "ledger");
        Utils.checkNotNull(preview, "preview");
        this.postTransaction = postTransaction;
        this.ledger = ledger;
        this.preview = preview;
    }

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    public com.formance.formance_sdk.models.shared.PostTransaction postTransaction() {
        return postTransaction;
    }

    /**
     * Name of the ledger.
     */
    public String ledger() {
        return ledger;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public Optional<? extends Boolean> preview() {
        return preview;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The request body must contain at least one of the following objects:
     *   - `postings`: suitable for simple transactions
     *   - `script`: enabling more complex transactions with Numscript
     * 
     */
    public CreateTransactionRequest withPostTransaction(com.formance.formance_sdk.models.shared.PostTransaction postTransaction) {
        Utils.checkNotNull(postTransaction, "postTransaction");
        this.postTransaction = postTransaction;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public CreateTransactionRequest withLedger(String ledger) {
        Utils.checkNotNull(ledger, "ledger");
        this.ledger = ledger;
        return this;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public CreateTransactionRequest withPreview(boolean preview) {
        Utils.checkNotNull(preview, "preview");
        this.preview = Optional.ofNullable(preview);
        return this;
    }

    /**
     * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
     */
    public CreateTransactionRequest withPreview(Optional<? extends Boolean> preview) {
        Utils.checkNotNull(preview, "preview");
        this.preview = preview;
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
        CreateTransactionRequest other = (CreateTransactionRequest) o;
        return 
            java.util.Objects.deepEquals(this.postTransaction, other.postTransaction) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger) &&
            java.util.Objects.deepEquals(this.preview, other.preview);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            postTransaction,
            ledger,
            preview);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTransactionRequest.class,
                "postTransaction", postTransaction,
                "ledger", ledger,
                "preview", preview);
    }
    
    public final static class Builder {
 
        private com.formance.formance_sdk.models.shared.PostTransaction postTransaction;
 
        private String ledger;
 
        private Optional<? extends Boolean> preview = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The request body must contain at least one of the following objects:
         *   - `postings`: suitable for simple transactions
         *   - `script`: enabling more complex transactions with Numscript
         * 
         */
        public Builder postTransaction(com.formance.formance_sdk.models.shared.PostTransaction postTransaction) {
            Utils.checkNotNull(postTransaction, "postTransaction");
            this.postTransaction = postTransaction;
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

        /**
         * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder preview(boolean preview) {
            Utils.checkNotNull(preview, "preview");
            this.preview = Optional.ofNullable(preview);
            return this;
        }

        /**
         * Set the preview mode. Preview mode doesn't add the logs to the database or publish a message to the message broker.
         */
        public Builder preview(Optional<? extends Boolean> preview) {
            Utils.checkNotNull(preview, "preview");
            this.preview = preview;
            return this;
        }
        
        public CreateTransactionRequest build() {
            return new CreateTransactionRequest(
                postTransaction,
                ledger,
                preview);
        }
    }
}

