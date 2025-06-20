/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;

public class Log {

    @JsonProperty("data")
    private Map<String, Object> data;

    @JsonProperty("date")
    private OffsetDateTime date;

    @JsonProperty("hash")
    private String hash;

    @JsonProperty("id")
    private long id;

    @JsonProperty("type")
    private LogType type;

    @JsonCreator
    public Log(
            @JsonProperty("data") Map<String, Object> data,
            @JsonProperty("date") OffsetDateTime date,
            @JsonProperty("hash") String hash,
            @JsonProperty("id") long id,
            @JsonProperty("type") LogType type) {
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
    public Map<String, Object> data() {
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
    public LogType type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Log withData(Map<String, Object> data) {
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

    public Log withType(LogType type) {
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
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.hash, other.hash) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Map<String, Object> data;
 
        private OffsetDateTime date;
 
        private String hash;
 
        private Long id;
 
        private LogType type;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Map<String, Object> data) {
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

        public Builder type(LogType type) {
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
