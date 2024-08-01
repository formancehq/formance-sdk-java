/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class ConfigsResponseCursor {

    @JsonProperty("data")
    private java.util.List<WebhooksConfig> data;

    @JsonProperty("hasMore")
    private boolean hasMore;

    @JsonCreator
    public ConfigsResponseCursor(
            @JsonProperty("data") java.util.List<WebhooksConfig> data,
            @JsonProperty("hasMore") boolean hasMore) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(hasMore, "hasMore");
        this.data = data;
        this.hasMore = hasMore;
    }

    @JsonIgnore
    public java.util.List<WebhooksConfig> data() {
        return data;
    }

    @JsonIgnore
    public boolean hasMore() {
        return hasMore;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConfigsResponseCursor withData(java.util.List<WebhooksConfig> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public ConfigsResponseCursor withHasMore(boolean hasMore) {
        Utils.checkNotNull(hasMore, "hasMore");
        this.hasMore = hasMore;
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
        ConfigsResponseCursor other = (ConfigsResponseCursor) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.hasMore, other.hasMore);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            hasMore);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigsResponseCursor.class,
                "data", data,
                "hasMore", hasMore);
    }
    
    public final static class Builder {
 
        private java.util.List<WebhooksConfig> data;
 
        private Boolean hasMore;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<WebhooksConfig> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder hasMore(boolean hasMore) {
            Utils.checkNotNull(hasMore, "hasMore");
            this.hasMore = hasMore;
            return this;
        }
        
        public ConfigsResponseCursor build() {
            return new ConfigsResponseCursor(
                data,
                hasMore);
        }
    }
}

