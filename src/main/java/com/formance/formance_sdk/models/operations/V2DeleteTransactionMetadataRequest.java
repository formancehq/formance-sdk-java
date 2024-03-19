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


public class V2DeleteTransactionMetadataRequest {

    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private BigInteger id;

    /**
     * The key to remove.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    private String key;

    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    private String ledger;

    public V2DeleteTransactionMetadataRequest(
            BigInteger id,
            String key,
            String ledger) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(ledger, "ledger");
        this.id = id;
        this.key = key;
        this.ledger = ledger;
    }

    /**
     * Transaction ID.
     */
    public BigInteger id() {
        return id;
    }

    /**
     * The key to remove.
     */
    public String key() {
        return key;
    }

    /**
     * Name of the ledger.
     */
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

        /**
         * Transaction ID.
         */
    public V2DeleteTransactionMetadataRequest withId(long id) {
        this.id = BigInteger.valueOf(id);
        return this;
    }

    /**
     * Transaction ID.
     */
    public V2DeleteTransactionMetadataRequest withId(BigInteger id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The key to remove.
     */
    public V2DeleteTransactionMetadataRequest withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * Name of the ledger.
     */
    public V2DeleteTransactionMetadataRequest withLedger(String ledger) {
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
        V2DeleteTransactionMetadataRequest other = (V2DeleteTransactionMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            key,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2DeleteTransactionMetadataRequest.class,
                "id", id,
                "key", key,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private BigInteger id;
 
        private String key;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Transaction ID.
         */
        public Builder id(long id) {
            this.id = BigInteger.valueOf(id);
            return this;
        }

        /**
         * Transaction ID.
         */
        public Builder id(BigInteger id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The key to remove.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
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
        
        public V2DeleteTransactionMetadataRequest build() {
            return new V2DeleteTransactionMetadataRequest(
                id,
                key,
                ledger);
        }
    }
}
