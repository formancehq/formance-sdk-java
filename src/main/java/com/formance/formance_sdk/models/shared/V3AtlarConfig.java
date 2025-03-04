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

public class V3AtlarConfig {

    @JsonProperty("accessKey")
    private String accessKey;

    @JsonProperty("baseURL")
    private String baseURL;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<Long> pageSize;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<String> pollingPeriod;

    @JsonProperty("secret")
    private String secret;

    @JsonCreator
    public V3AtlarConfig(
            @JsonProperty("accessKey") String accessKey,
            @JsonProperty("baseURL") String baseURL,
            @JsonProperty("name") String name,
            @JsonProperty("pageSize") Optional<Long> pageSize,
            @JsonProperty("pollingPeriod") Optional<String> pollingPeriod,
            @JsonProperty("secret") String secret) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(baseURL, "baseURL");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        Utils.checkNotNull(secret, "secret");
        this.accessKey = accessKey;
        this.baseURL = baseURL;
        this.name = name;
        this.pageSize = pageSize;
        this.pollingPeriod = pollingPeriod;
        this.secret = secret;
    }
    
    public V3AtlarConfig(
            String accessKey,
            String baseURL,
            String name,
            String secret) {
        this(accessKey, baseURL, name, Optional.empty(), Optional.empty(), secret);
    }

    @JsonIgnore
    public String accessKey() {
        return accessKey;
    }

    @JsonIgnore
    public String baseURL() {
        return baseURL;
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
    public String secret() {
        return secret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public V3AtlarConfig withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    public V3AtlarConfig withBaseURL(String baseURL) {
        Utils.checkNotNull(baseURL, "baseURL");
        this.baseURL = baseURL;
        return this;
    }

    public V3AtlarConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public V3AtlarConfig withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    public V3AtlarConfig withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    public V3AtlarConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    public V3AtlarConfig withPollingPeriod(Optional<String> pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = pollingPeriod;
        return this;
    }

    public V3AtlarConfig withSecret(String secret) {
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
        V3AtlarConfig other = (V3AtlarConfig) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.baseURL, other.baseURL) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.pollingPeriod, other.pollingPeriod) &&
            Objects.deepEquals(this.secret, other.secret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            baseURL,
            name,
            pageSize,
            pollingPeriod,
            secret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(V3AtlarConfig.class,
                "accessKey", accessKey,
                "baseURL", baseURL,
                "name", name,
                "pageSize", pageSize,
                "pollingPeriod", pollingPeriod,
                "secret", secret);
    }
    
    public final static class Builder {
 
        private String accessKey;
 
        private String baseURL;
 
        private String name;
 
        private Optional<Long> pageSize;
 
        private Optional<String> pollingPeriod;
 
        private String secret;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        public Builder baseURL(String baseURL) {
            Utils.checkNotNull(baseURL, "baseURL");
            this.baseURL = baseURL;
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

        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }
        
        public V3AtlarConfig build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }            return new V3AtlarConfig(
                accessKey,
                baseURL,
                name,
                pageSize,
                pollingPeriod,
                secret);
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
    }
}

