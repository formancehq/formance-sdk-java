/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class V2ActivityGetAccount {

    @JsonProperty("id")
    private String id;

    @JsonProperty("ledger")
    private String ledger;

    @JsonCreator
    public V2ActivityGetAccount(
            @JsonProperty("id") String id,
            @JsonProperty("ledger") String ledger) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(ledger, "ledger");
        this.id = id;
        this.ledger = ledger;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String ledger() {
        return ledger;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2ActivityGetAccount withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public V2ActivityGetAccount withLedger(String ledger) {
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
        V2ActivityGetAccount other = (V2ActivityGetAccount) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.ledger, other.ledger);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            ledger);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2ActivityGetAccount.class,
                "id", id,
                "ledger", ledger);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String ledger;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder ledger(String ledger) {
            Utils.checkNotNull(ledger, "ledger");
            this.ledger = ledger;
            return this;
        }
        
        public V2ActivityGetAccount build() {
            return new V2ActivityGetAccount(
                id,
                ledger);
        }
    }
}

