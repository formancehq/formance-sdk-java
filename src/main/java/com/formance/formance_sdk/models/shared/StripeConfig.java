/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class StripeConfig {

    @JsonProperty("apiKey")
    private String apiKey;

    @JsonProperty("name")
    private String name;

    /**
     * Number of BalanceTransaction to fetch at each polling interval.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pageSize")
    private Optional<? extends Long> pageSize;

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe API.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pollingPeriod")
    private Optional<? extends String> pollingPeriod;

    public StripeConfig(
            @JsonProperty("apiKey") String apiKey,
            @JsonProperty("name") String name,
            @JsonProperty("pageSize") Optional<? extends Long> pageSize,
            @JsonProperty("pollingPeriod") Optional<? extends String> pollingPeriod) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.apiKey = apiKey;
        this.name = name;
        this.pageSize = pageSize;
        this.pollingPeriod = pollingPeriod;
    }

    public String apiKey() {
        return apiKey;
    }

    public String name() {
        return name;
    }

    /**
     * Number of BalanceTransaction to fetch at each polling interval.
     * 
     */
    public Optional<? extends Long> pageSize() {
        return pageSize;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe API.
     * 
     */
    public Optional<? extends String> pollingPeriod() {
        return pollingPeriod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public StripeConfig withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public StripeConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Number of BalanceTransaction to fetch at each polling interval.
     * 
     */
    public StripeConfig withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Number of BalanceTransaction to fetch at each polling interval.
     * 
     */
    public StripeConfig withPageSize(Optional<? extends Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe API.
     * 
     */
    public StripeConfig withPollingPeriod(String pollingPeriod) {
        Utils.checkNotNull(pollingPeriod, "pollingPeriod");
        this.pollingPeriod = Optional.ofNullable(pollingPeriod);
        return this;
    }

    /**
     * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe API.
     * 
     */
    public StripeConfig withPollingPeriod(Optional<? extends String> pollingPeriod) {
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
        StripeConfig other = (StripeConfig) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pageSize, other.pageSize) &&
            java.util.Objects.deepEquals(this.pollingPeriod, other.pollingPeriod);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            name,
            pageSize,
            pollingPeriod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StripeConfig.class,
                "apiKey", apiKey,
                "name", name,
                "pageSize", pageSize,
                "pollingPeriod", pollingPeriod);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String name;
 
        private Optional<? extends Long> pageSize;
 
        private Optional<? extends String> pollingPeriod;  
        
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
         * Number of BalanceTransaction to fetch at each polling interval.
         * 
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * Number of BalanceTransaction to fetch at each polling interval.
         * 
         */
        public Builder pageSize(Optional<? extends Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe API.
         * 
         */
        public Builder pollingPeriod(String pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = Optional.ofNullable(pollingPeriod);
            return this;
        }

        /**
         * The frequency at which the connector will try to fetch new BalanceTransaction objects from Stripe API.
         * 
         */
        public Builder pollingPeriod(Optional<? extends String> pollingPeriod) {
            Utils.checkNotNull(pollingPeriod, "pollingPeriod");
            this.pollingPeriod = pollingPeriod;
            return this;
        }
        
        public StripeConfig build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            if (pollingPeriod == null) {
                pollingPeriod = _SINGLETON_VALUE_PollingPeriod.value();
            }
            return new StripeConfig(
                apiKey,
                name,
                pageSize,
                pollingPeriod);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "pageSize",
                        "10",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_PollingPeriod =
                new LazySingletonValue<>(
                        "pollingPeriod",
                        "\"120s\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}
