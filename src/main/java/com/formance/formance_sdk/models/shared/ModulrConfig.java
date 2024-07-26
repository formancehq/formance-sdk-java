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
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ModulrConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("apiSecret")
    private String apiSecret;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    private Optional<? extends String> endpoint;

    @JsonProperty("name")
    private String name;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<? extends String> pollingPeriod;

    @JsonCreator
    public ModulrConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("apiSecret") String apiSecret,
            @JsonProperty("endpoint") Optional<? extends String> endpoint,
            @JsonProperty("name") String name,
            @JsonProperty("pollingPeriod") Optional<? extends String> pollingPeriod) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(apiSecret, "apiSecret");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.endpoint = endpoint;
        this.name = name;
        this.pollingPeriod = pollingPeriod;
    }
    
    public ModulrConfig(
            String apiKey,
            String apiSecret,
            String name) {
        this(apiKey, apiSecret, Optional.empty(), name, Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public String apiSecret() {
        return apiSecret;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> endpoint() {
        return (Optional<String>) endpoint;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> pollingPeriod() {
        return (Optional<String>) pollingPeriod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModulrConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public ModulrConfig withApiSecret(String apiSecret) {
        Utils.checkNotNull(apiSecret, "apiSecret");
        this.apiSecret = apiSecret;
        return this;
    }

    public ModulrConfig withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = Optional.ofNullable(endpoint);
        return this;
    }

    public ModulrConfig withEndpoint(Optional<? extends String> endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    public ModulrConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     * 
     */
    public ModulrConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     * 
     */
    public ModulrConfig withPollingPeriod(Optional<? extends String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
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
        ModulrConfig other = (ModulrConfig) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.apiSecret, other.apiSecret) &&
            java.util.Objects.deepEquals(this.endpoint, other.endpoint) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pollingPeriod, other.pollingPeriod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            apiSecret,
            endpoint,
            name,
            pollingPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModulrConfig.class,
                "apiKey", apiKey,
                "apiSecret", apiSecret,
                "endpoint", endpoint,
                "name", name,
                "pollingPeriod", pollingPeriod);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String apiSecret;
 
        private Optional<? extends String> endpoint = Optional.empty();
 
        private String name;
 
        private Optional<? extends String> pollingPeriod;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder apiSecret(String apiSecret) {
            Utils.checkNotNull(apiSecret, "apiSecret");
            this.apiSecret = apiSecret;
            return this;
        }

        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = Optional.ofNullable(endpoint);
            return this;
        }

        public Builder endpoint(Optional<? extends String> endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
         * 
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
         * 
         */
        public Builder pollingPeriod(Optional<? extends String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }
        
        public ModulrConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            return new ModulrConfig(
                apiKey,
                apiSecret,
                endpoint,
                name,
                pollingPeriod);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"120s\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

