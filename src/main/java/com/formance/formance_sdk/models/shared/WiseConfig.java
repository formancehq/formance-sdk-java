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

public class WiseConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("name")
    private String name;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Wise API.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<String> pollingPeriod;

    @JsonCreator
    public WiseConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("name") String name,
            @JsonProperty("pollingPeriod") Optional<String> pollingPeriod) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.apiKey = apiKey;
        this.name = name;
        this.pollingPeriod = pollingPeriod;
    }
    
    public WiseConfig(
            String apiKey,
            String name) {
        this(apiKey, name, Optional.empty());
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Wise API.
     * 
     */
    @JsonIgnore
    public Optional<String> pollingPeriod() {
        return pollingPeriod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public WiseConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public WiseConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Wise API.
     * 
     */
    public WiseConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Wise API.
     * 
     */
    public WiseConfig withPollingPeriod(Optional<String> pollingPeriod) {
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
        WiseConfig other = (WiseConfig) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.pollingPeriod, other.pollingPeriod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            name,
            pollingPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WiseConfig.class,
                "apiKey", apiKey,
                "name", name,
                "pollingPeriod", pollingPeriod);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String name;
 
        private Optional<String> pollingPeriod;  
        
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

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Wise API.
         * 
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Wise API.
         * 
         */
        public Builder pollingPeriod(Optional<String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }
        
        public WiseConfig build() {
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }            return new WiseConfig(
                apiKey,
                name,
                pollingPeriod);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"120s\"",
                        new TypeReference<Optional<String>>() {});
    }
}

