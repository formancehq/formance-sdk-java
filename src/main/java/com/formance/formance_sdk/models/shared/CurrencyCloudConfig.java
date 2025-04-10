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

public class CurrencyCloudConfig implements ConnectorConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    /**
     * The endpoint to use for the API. Defaults to https://devapi.currencycloud.com
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("endpoint")
    private Optional<String> endpoint;

    /**
     * Username of the API Key holder
     */
    @JsonProperty("loginID")
    private String loginID;

    @JsonProperty("name")
    private String name;

    /**
     * The frequency at which the connector will fetch transactions
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<String> pollingPeriod;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<String> provider;

    @JsonCreator
    public CurrencyCloudConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("endpoint") Optional<String> endpoint,
            @JsonProperty("loginID") String loginID,
            @JsonProperty("name") String name,
            @JsonProperty("pollingPeriod") Optional<String> pollingPeriod,
            @JsonProperty("provider") Optional<String> provider) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(endpoint, "endpoint");
        Utils.checkNotNull(loginID, "loginID");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        Utils.checkNotNull(provider, "provider");
        this.apiKey = apiKey;
        this.endpoint = endpoint;
        this.loginID = loginID;
        this.name = name;
        this.pollingPeriod = pollingPeriod;
        this.provider = provider;
    }
    
    public CurrencyCloudConfig(
            String apiKey,
            String loginID,
            String name) {
        this(apiKey, Optional.empty(), loginID, name, Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The endpoint to use for the API. Defaults to https://devapi.currencycloud.com
     */
    @JsonIgnore
    public Optional<String> endpoint() {
        return endpoint;
    }

    /**
     * Username of the API Key holder
     */
    @JsonIgnore
    public String loginID() {
        return loginID;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The frequency at which the connector will fetch transactions
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

    public CurrencyCloudConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The endpoint to use for the API. Defaults to https://devapi.currencycloud.com
     */
    public CurrencyCloudConfig withEndpoint(String endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = Optional.ofNullable(endpoint);
        return this;
    }

    /**
     * The endpoint to use for the API. Defaults to https://devapi.currencycloud.com
     */
    public CurrencyCloudConfig withEndpoint(Optional<String> endpoint) {
        Utils.checkNotNull(endpoint, "endpoint");
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Username of the API Key holder
     */
    public CurrencyCloudConfig withLoginID(String loginID) {
        Utils.checkNotNull(loginID, "loginID");
        this.loginID = loginID;
        return this;
    }

    public CurrencyCloudConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The frequency at which the connector will fetch transactions
     */
    public CurrencyCloudConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will fetch transactions
     */
    public CurrencyCloudConfig withPollingPeriod(Optional<String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
        return this;
    }

    public CurrencyCloudConfig withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public CurrencyCloudConfig withProvider(Optional<String> provider) {
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
        CurrencyCloudConfig other = (CurrencyCloudConfig) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.endpoint, other.endpoint) &&
            Objects.deepEquals(this.loginID, other.loginID) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pollingPeriod, other.pollingPeriod) &&
            Objects.deepEquals(this.provider, other.provider);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            endpoint,
            loginID,
            name,
            pollingPeriod,
            provider);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CurrencyCloudConfig.class,
                "apiKey", apiKey,
                "endpoint", endpoint,
                "loginID", loginID,
                "name", name,
                "pollingPeriod", pollingPeriod,
                "provider", provider);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> endpoint = Optional.empty();
 
        private String loginID;
 
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

        /**
         * The endpoint to use for the API. Defaults to https://devapi.currencycloud.com
         */
        public Builder endpoint(String endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = Optional.ofNullable(endpoint);
            return this;
        }

        /**
         * The endpoint to use for the API. Defaults to https://devapi.currencycloud.com
         */
        public Builder endpoint(Optional<String> endpoint) {
            Utils.checkNotNull(endpoint, "endpoint");
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Username of the API Key holder
         */
        public Builder loginID(String loginID) {
            Utils.checkNotNull(loginID, "loginID");
            this.loginID = loginID;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The frequency at which the connector will fetch transactions
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will fetch transactions
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
        
        public CurrencyCloudConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            if (provider == null) {
                provider = _SINGLETON_VALUE_Provider.value();
            }
            return new CurrencyCloudConfig(
                apiKey,
                endpoint,
                loginID,
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
                        "\"Currencycloud\"",
                        new TypeReference<Optional<String>>() {});
    }
}
