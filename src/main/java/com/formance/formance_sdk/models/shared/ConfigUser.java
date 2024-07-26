/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
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

public class ConfigUser {

    @JsonProperty("endpoint")
    private String endpoint;

    @JsonProperty("eventTypes")
    private java.util.List<String> eventTypes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret")
    private Optional<? extends String> secret;

    @JsonCreator
    public ConfigUser(
            @JsonProperty("endpoint") String endpoint,
            @JsonProperty("eventTypes") java.util.List<String> eventTypes,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("secret") Optional<? extends String> secret) {
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(eventTypes, "eventTypes");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(secret, "secret");
        this.endpoint = endpoint;
        this.eventTypes = eventTypes;
        this.name = name;
        this.secret = secret;
    }
    
    public ConfigUser(
            String endpoint,
            java.util.List<String> eventTypes) {
        this(endpoint, eventTypes, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public java.util.List<String> eventTypes() {
        return eventTypes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> secret() {
        return (Optional<String>) secret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ConfigUser withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    public ConfigUser withEventTypes(java.util.List<String> eventTypes) {
        Utils.checkNotNull(eventTypes, "eventTypes");
        this.eventTypes = eventTypes;
        return this;
    }

    public ConfigUser withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public ConfigUser withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ConfigUser withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = Optional.ofNullable(secret);
        return this;
    }

    public ConfigUser withSecret(Optional<? extends String> secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
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
        ConfigUser other = (ConfigUser) o;
        return 
            java.util.Objects.deepEquals(this.endpoint, other.endpoint) &&
            java.util.Objects.deepEquals(this.eventTypes, other.eventTypes) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.secret, other.secret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            endpoint,
            eventTypes,
            name,
            secret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConfigUser.class,
                "endpoint", endpoint,
                "eventTypes", eventTypes,
                "name", name,
                "secret", secret);
    }
    
    public final static class Builder {
 
        private String endpoint;
 
        private java.util.List<String> eventTypes;
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> secret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = Optional.ofNullable(secret);
            return this;
        }

        public Builder secret(Optional<? extends String> secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }
        
        public ConfigUser build() {
            return new ConfigUser(
                endpoint,
                eventTypes,
                name,
                secret);
        }
    }
}

