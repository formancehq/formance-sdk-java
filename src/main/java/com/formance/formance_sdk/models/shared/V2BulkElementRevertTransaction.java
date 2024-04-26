/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
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


public class V2BulkElementRevertTransaction {

    @JsonProperty("action")
    private String action;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends V2BulkElementRevertTransactionData> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ik")
    private Optional<? extends String> ik;

    @JsonCreator
    public V2BulkElementRevertTransaction(
            @JsonProperty("action") String action,
            @JsonProperty("data") Optional<? extends V2BulkElementRevertTransactionData> data,
            @JsonProperty("ik") Optional<? extends String> ik) {
        Utils.checkNotNull(action, "action");
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(ik, "ik");
        this.action = action;
        this.data = data;
        this.ik = ik;
    }
    
    public V2BulkElementRevertTransaction(
            String action) {
        this(action, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String action() {
        return action;
    }

    @JsonIgnore
    public Optional<? extends V2BulkElementRevertTransactionData> data() {
        return data;
    }

    @JsonIgnore
    public Optional<? extends String> ik() {
        return ik;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V2BulkElementRevertTransaction withAction(String action) {
        Utils.checkNotNull(action, "action");
        this.action = action;
        return this;
    }

    public V2BulkElementRevertTransaction withData(V2BulkElementRevertTransactionData data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public V2BulkElementRevertTransaction withData(Optional<? extends V2BulkElementRevertTransactionData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public V2BulkElementRevertTransaction withIk(String ik) {
        Utils.checkNotNull(ik, "ik");
        this.ik = Optional.ofNullable(ik);
        return this;
    }

    public V2BulkElementRevertTransaction withIk(Optional<? extends String> ik) {
        Utils.checkNotNull(ik, "ik");
        this.ik = ik;
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
        V2BulkElementRevertTransaction other = (V2BulkElementRevertTransaction) o;
        return 
            java.util.Objects.deepEquals(this.action, other.action) &&
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.ik, other.ik);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            action,
            data,
            ik);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V2BulkElementRevertTransaction.class,
                "action", action,
                "data", data,
                "ik", ik);
    }
    
    public final static class Builder {
 
        private String action;
 
        private Optional<? extends V2BulkElementRevertTransactionData> data = Optional.empty();
 
        private Optional<? extends String> ik = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder action(String action) {
            Utils.checkNotNull(action, "action");
            this.action = action;
            return this;
        }

        public Builder data(V2BulkElementRevertTransactionData data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends V2BulkElementRevertTransactionData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder ik(String ik) {
            Utils.checkNotNull(ik, "ik");
            this.ik = Optional.ofNullable(ik);
            return this;
        }

        public Builder ik(Optional<? extends String> ik) {
            Utils.checkNotNull(ik, "ik");
            this.ik = ik;
            return this;
        }
        
        public V2BulkElementRevertTransaction build() {
            return new V2BulkElementRevertTransaction(
                action,
                data,
                ik);
        }
    }
}

