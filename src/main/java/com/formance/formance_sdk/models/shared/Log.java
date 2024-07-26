/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

public class Log {

    @JsonProperty("data")
    private java.util.Map<String, java.lang.Object> data;

    @JsonProperty("date")
    private OffsetDateTime date;

    @JsonProperty("hash")
    private String hash;

    @JsonProperty("id")
    private long id;

    @JsonProperty("type")
    private Type type;

    @JsonCreator
    public Log(
            @JsonProperty("data") java.util.Map<String, java.lang.Object> data,
            @JsonProperty("date") OffsetDateTime date,
            @JsonProperty("hash") String hash,
            @JsonProperty("id") long id,
            @JsonProperty("type") Type type) {
        data = Utils.emptyMapIfNull(data);
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(hash, "hash");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        this.data = data;
        this.date = date;
        this.hash = hash;
        this.id = id;
        this.type = type;
    }

    @JsonIgnore
    public java.util.Map<String, java.lang.Object> data() {
        return data;
    }

    @JsonIgnore
    public OffsetDateTime date() {
        return date;
    }

    @JsonIgnore
    public String hash() {
        return hash;
    }

    @JsonIgnore
    public long id() {
        return id;
    }

    @JsonIgnore
    public Type type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Log withData(java.util.Map<String, java.lang.Object> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public Log withDate(OffsetDateTime date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public Log withHash(String hash) {
        Utils.checkNotNull(hash, "hash");
        this.hash = hash;
        return this;
    }

    public Log withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Log withType(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        Log other = (Log) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.hash, other.hash) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            date,
            hash,
            id,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Log.class,
                "data", data,
                "date", date,
                "hash", hash,
                "id", id,
                "type", type);
    }
    
    public final static class Builder {
 
        private java.util.Map<String, java.lang.Object> data;
 
        private OffsetDateTime date;
 
        private String hash;
 
        private Long id;
 
        private Type type;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.Map<String, java.lang.Object> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder date(OffsetDateTime date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        public Builder hash(String hash) {
            Utils.checkNotNull(hash, "hash");
            this.hash = hash;
            return this;
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder type(Type type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Log build() {
            return new Log(
                data,
                date,
                hash,
                id,
                type);
        }
    }
}

