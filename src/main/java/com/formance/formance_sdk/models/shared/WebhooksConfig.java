/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
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

public class WebhooksConfig {

    @JsonProperty("active")
    private boolean active;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt;

    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("eventTypes")
    private java.util.List<String> eventTypes;

    @JsonProperty("id")
    private String id;

    @JsonProperty("secret")
    private String secret;

    @JsonProperty("updatedAt")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public WebhooksConfig(
            @JsonProperty("active") boolean active,
            @JsonProperty("createdAt") OffsetDateTime createdAt,
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("eventTypes") java.util.List<String> eventTypes,
            @JsonProperty("id") String id,
            @JsonProperty("secret") String secret,
            @JsonProperty("updatedAt") OffsetDateTime updatedAt) {
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(eventTypes, "eventTypes");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(secret, "secret");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.active = active;
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.eventTypes = eventTypes;
        this.id = id;
        this.secret = secret;
        this.updatedAt = updatedAt;
    }

    @JsonIgnore
    public boolean active() {
        return active;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public java.util.List<String> eventTypes() {
        return eventTypes;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String secret() {
        return secret;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WebhooksConfig withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    public WebhooksConfig withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public WebhooksConfig withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    public WebhooksConfig withEventTypes(java.util.List<String> eventTypes) {
        Utils.checkNotNull(eventTypes, "eventTypes");
        this.eventTypes = eventTypes;
        return this;
    }

    public WebhooksConfig withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public WebhooksConfig withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
        return this;
    }

    public WebhooksConfig withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        WebhooksConfig other = (WebhooksConfig) o;
        return 
            java.util.Objects.deepEquals(this.active, other.active) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.endpoint, other.endpoint) &&
            java.util.Objects.deepEquals(this.eventTypes, other.eventTypes) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.secret, other.secret) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            active,
            createdAt,
            endpoint,
            eventTypes,
            id,
            secret,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhooksConfig.class,
                "active", active,
                "createdAt", createdAt,
                "endpoint", endpoint,
                "eventTypes", eventTypes,
                "id", id,
                "secret", secret,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Boolean active;
 
        private OffsetDateTime createdAt;
 
        private String endpoint;
 
        private java.util.List<String> eventTypes;
 
        private String id;
 
        private String secret;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        public Builder eventTypes(java.util.List<String> eventTypes) {
            Utils.checkNotNull(eventTypes, "eventTypes");
            this.eventTypes = eventTypes;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public WebhooksConfig build() {
            return new WebhooksConfig(
                active,
                createdAt,
                endpoint,
                eventTypes,
                id,
                secret,
                updatedAt);
        }
    }
}

