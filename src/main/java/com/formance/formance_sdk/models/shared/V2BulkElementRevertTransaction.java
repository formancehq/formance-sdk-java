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
import java.util.Objects;
import java.util.Optional;

public class V2BulkElementRevertTransaction implements V2BulkElement {

    @JsonProperty("action")
    private String action;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends V2BulkElementRevertTransactionData> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ik")
    private Optional<String> ik;

    @JsonCreator
    public V2BulkElementRevertTransaction(
            @JsonProperty("action") String action,
            @JsonProperty("data") Optional<? extends V2BulkElementRevertTransactionData> data,
            @JsonProperty("ik") Optional<String> ik) {
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
    @Override
    public String action() {
        return Utils.discriminatorToString(action);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<V2BulkElementRevertTransactionData> data() {
        return (Optional<V2BulkElementRevertTransactionData>) data;
    }

    @JsonIgnore
    public Optional<String> ik() {
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

    public V2BulkElementRevertTransaction withIk(Optional<String> ik) {
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
            Objects.deepEquals(this.action, other.action) &&
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.ik, other.ik);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> ik = Optional.empty();
        
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

        public Builder ik(Optional<String> ik) {
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
