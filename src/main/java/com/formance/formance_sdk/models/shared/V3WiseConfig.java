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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class V3WiseConfig implements V3InstallConnectorRequest {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<Long> pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<String> pollingPeriod;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<String> provider;

    @JsonProperty("webhookPublicKey")
    private String webhookPublicKey;

    @JsonCreator
    public V3WiseConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("name") String name,
            @JsonProperty("pageSize") Optional<Long> pageSize,
            @JsonProperty("pollingPeriod") Optional<String> pollingPeriod,
            @JsonProperty("provider") Optional<String> provider,
            @JsonProperty("webhookPublicKey") String webhookPublicKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(webhookPublicKey, "webhookPublicKey");
        this.apiKey = apiKey;
        this.name = name;
        this.pageSize = pageSize;
        this.pollingPeriod = pollingPeriod;
        this.provider = provider;
        this.webhookPublicKey = webhookPublicKey;
    }
    
    public V3WiseConfig(
            String apiKey,
            String name,
            String webhookPublicKey) {
        this(apiKey, name, Optional.empty(), Optional.empty(), Optional.empty(), webhookPublicKey);
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    @JsonIgnore
    public Optional<String> pollingPeriod() {
        return pollingPeriod;
    }

    @JsonIgnore
    @Override
    public String provider() {
        return Utils.discriminatorToString(provider);
    }

    @JsonIgnore
    public String webhookPublicKey() {
        return webhookPublicKey;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public V3WiseConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public V3WiseConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public V3WiseConfig withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    public V3WiseConfig withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V3WiseConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    public V3WiseConfig withPollingPeriod(Optional<String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
        return this;
    }

    public V3WiseConfig withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public V3WiseConfig withProvider(Optional<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    public V3WiseConfig withWebhookPublicKey(String webhookPublicKey) {
        Utils.checkNotNull(webhookPublicKey, "webhookPublicKey");
        this.webhookPublicKey = webhookPublicKey;
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
        V3WiseConfig other = (V3WiseConfig) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.pollingPeriod, other.pollingPeriod) &&
            Objects.deepEquals(this.provider, other.provider) &&
            Objects.deepEquals(this.webhookPublicKey, other.webhookPublicKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            name,
            pageSize,
            pollingPeriod,
            provider,
            webhookPublicKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3WiseConfig.class,
                "apiKey", apiKey,
                "name", name,
                "pageSize", pageSize,
                "pollingPeriod", pollingPeriod,
                "provider", provider,
                "webhookPublicKey", webhookPublicKey);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String name;
 
        private Optional<Long> pageSize;
 
        private Optional<String> pollingPeriod;
 
        private Optional<String> provider;
 
        private String webhookPublicKey;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

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

        public Builder webhookPublicKey(String webhookPublicKey) {
            Utils.checkNotNull(webhookPublicKey, "webhookPublicKey");
            this.webhookPublicKey = webhookPublicKey;
            return this;
        }
        
        public V3WiseConfig build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            if (provider == null) {
                provider = _SINGLETON_VALUE_Provider.value();
            }
            return new V3WiseConfig(
                apiKey,
                name,
                pageSize,
                pollingPeriod,
                provider,
                webhookPublicKey);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "\"25\"",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"2m\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Provider =
                new LazySingletonValue<>(
                        "provider",
                        "\"Wise\"",
                        new TypeReference<Optional<String>>() {});
    }
}
