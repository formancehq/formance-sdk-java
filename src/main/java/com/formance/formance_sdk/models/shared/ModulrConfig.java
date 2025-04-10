/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.LazySingletonValue;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class ModulrConfig implements ConnectorConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("apiSecret")
    private String apiSecret;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    private Optional<String> endpoint;

    @JsonProperty("name")
    private String name;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<String> pollingPeriod;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<String> provider;

    @JsonCreator
    public ModulrConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("apiSecret") String apiSecret,
            @JsonProperty("endpoint") Optional<String> endpoint,
            @JsonProperty("name") String name,
            @JsonProperty("pollingPeriod") Optional<String> pollingPeriod,
            @JsonProperty("provider") Optional<String> provider) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(apiSecret, "apiSecret");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        Utils.checkNotNull(provider, "provider");
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.endpoint = endpoint;
        this.name = name;
        this.pollingPeriod = pollingPeriod;
        this.provider = provider;
    }
    
    public ModulrConfig(
            String apiKey,
            String apiSecret,
            String name) {
        this(apiKey, apiSecret, Optional.empty(), name, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public String apiSecret() {
        return apiSecret;
    }

    @JsonIgnore
    public Optional<String> endpoint() {
        return endpoint;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     */
    @JsonIgnore
    public Optional<String> pollingPeriod() {
        return pollingPeriod;
    }

    @JsonIgnore
    @Override
    public String provider() {
        return Utils.discriminatorToString(provider);
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

    public ModulrConfig withEndpoint(Optional<String> endpoint) {
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
     */
    public ModulrConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
     */
    public ModulrConfig withPollingPeriod(Optional<String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
        return this;
    }

    public ModulrConfig withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public ModulrConfig withProvider(Optional<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
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
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.apiSecret, other.apiSecret) &&
            Objects.deepEquals(this.endpoint, other.endpoint) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pollingPeriod, other.pollingPeriod) &&
            Objects.deepEquals(this.provider, other.provider);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            apiSecret,
            endpoint,
            name,
            pollingPeriod,
            provider);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModulrConfig.class,
                "apiKey", apiKey,
                "apiSecret", apiSecret,
                "endpoint", endpoint,
                "name", name,
                "pollingPeriod", pollingPeriod,
                "provider", provider);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String apiSecret;
 
        private Optional<String> endpoint = Optional.empty();
 
        private String name;
 
        private Optional<String> pollingPeriod;
 
        private Optional<String> provider;
        
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

        public Builder endpoint(Optional<String> endpoint) {
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
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Modulr API.
         */
        public Builder pollingPeriod(Optional<String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }

        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        public Builder provider(Optional<String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }
        
        public ModulrConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            if (provider == null) {
                provider = _SINGLETON_VALUE_Provider.value();
            }
            return new ModulrConfig(
                apiKey,
                apiSecret,
                endpoint,
                name,
                pollingPeriod,
                provider);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"120s\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Provider =
                new LazySingletonValue<>(
                        "provider",
                        "\"Modulr\"",
                        new TypeReference<Optional<String>>() {});
    }
}
